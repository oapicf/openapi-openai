const utils = require('../utils/utils');
const AssistantToolsCode = require('../models/AssistantToolsCode');
const AssistantToolsFileSearchTypeOnly = require('../models/AssistantToolsFileSearchTypeOnly');

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
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
        }
    },
}
