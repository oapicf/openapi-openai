const utils = require('../utils/utils');
const AssistantToolsCode = require('../models/AssistantToolsCode');
const AssistantToolsFileSearch = require('../models/AssistantToolsFileSearch');
const AssistantToolsFileSearch_file_search = require('../models/AssistantToolsFileSearch_file_search');
const AssistantToolsFunction = require('../models/AssistantToolsFunction');
const FunctionObject = require('../models/FunctionObject');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of tool being defined: `code_interpreter` - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'code_interpreter',
                    'file_search',
                    'function',
                ],
            },
            ...AssistantToolsFileSearch_file_search.fields(`${keyPrefix}file_search`, isInput),
            ...FunctionObject.fields(`${keyPrefix}function`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'file_search': utils.removeIfEmpty(AssistantToolsFileSearch_file_search.mapping(bundle, `${keyPrefix}file_search`)),
            'function': utils.removeIfEmpty(FunctionObject.mapping(bundle, `${keyPrefix}function`)),
        }
    },
}
