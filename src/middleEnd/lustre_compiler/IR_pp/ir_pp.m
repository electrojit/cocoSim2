function [ new_ir, subs_blks_list, ir_handle_struct_map ] = ir_pp( new_ir, df_export, output_dir )
%IR_PP pre-process the IR for cocoSim

dir_path = which(mfilename);
[parent, ~, ~] = fileparts(dir_path);
dir_path = fullfile(parent, 'fields');
functions = dir([dir_path filesep '*.m']);

for i=1:numel(functions)
    fh = str2func(functions(i).name(1:end-2));
    new_ir = fh(new_ir);
end

%Model_name
[~, model_name, ~] = fileparts(new_ir.meta.file_path);

subs_blks_list = get_not_handled_masked_subs(new_ir, model_name);
ir_handle_struct_map = get_ir_handle_struct_map(new_ir, model_name);

json_model = json_encode(new_ir);
json_model = strrep(json_model,'\/','/');
if nargin < 3
    output_dir = parent;
end
if df_export
    file_json =  'IR_pp_tmp.json';
    % Open or create the file
    file_path = fullfile(output_dir, file_json);
    fid = fopen(file_path, 'w');
    % Write in the file
    fprintf(fid, '%s\n', json_model);
    fclose(fid);
end
new_path = fullfile(output_dir, 'IR_pp.json');
cmd = ['cat ' file_path ' | python -mjson.tool > ' new_path];
try
    [status, output] = system(cmd);
    if status==0
        system(['rm ' file_path]);
    end
catch
end
end

function subs_blks_list = get_not_handled_masked_subs(ir_struct, block_name)

subs_blks_list = {};
fields = fieldnames(ir_struct.(block_name).Content);
if isfield(ir_struct, 'meta')
    block_path = ir_struct.meta.file_path;
else
    block_path = ir_struct.(block_name).Path;
end
if isfield(ir_struct.(block_name), 'Content')
    if ~(isfield(ir_struct.(block_name), 'HasWrite') && ir_struct.(block_name).HasWrite)
        subs_blks_list = {IRUtils.name_format(block_path)};
        for i=1:numel(fields)
            block = ir_struct.(block_name).Content.(fields{i});
            if isfield(block, 'Content')
                subs_blks_list = [subs_blks_list, get_not_handled_masked_subs(ir_struct.(block_name).Content, IRUtils.name_format(block.Name))];
            end
        end
    end
end
end


function handle_struct_map = get_ir_handle_struct_map(ir_struct, block_name)

handle_struct_map = containers.Map('KeyType','double', 'ValueType','any');


if isfield(ir_struct.(block_name),'Handle')
    handle_struct_map(ir_struct.(block_name).Handle) = ir_struct.(block_name);
end


if isfield(ir_struct.(block_name), 'Content')
    fields = fieldnames(ir_struct.(block_name).Content);
    for i=1:numel(fields)
        handle_struct_map_i = get_ir_handle_struct_map(ir_struct.(block_name).Content, fields{i});
        handle_struct_map = [handle_struct_map; handle_struct_map_i];
    end
end

end