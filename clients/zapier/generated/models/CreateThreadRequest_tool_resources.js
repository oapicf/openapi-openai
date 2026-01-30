const utils = require('../utils/utils');
const CreateAssistantRequest_tool_resources_code_interpreter = require('../models/CreateAssistantRequest_tool_resources_code_interpreter');
const CreateThreadRequest_tool_resources_file_search = require('../models/CreateThreadRequest_tool_resources_file_search');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CreateAssistantRequest_tool_resources_code_interpreter.fields(`${keyPrefix}code_interpreter`, isInput),
            ...CreateThreadRequest_tool_resources_file_search.fields(`${keyPrefix}file_search`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'code_interpreter': utils.removeIfEmpty(CreateAssistantRequest_tool_resources_code_interpreter.mapping(bundle, `${keyPrefix}code_interpreter`)),
            'file_search': utils.removeIfEmpty(CreateThreadRequest_tool_resources_file_search.mapping(bundle, `${keyPrefix}file_search`)),
        }
    },
}
