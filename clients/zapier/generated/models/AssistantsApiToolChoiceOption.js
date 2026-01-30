const utils = require('../utils/utils');
const AssistantsNamedToolChoice = require('../models/AssistantsNamedToolChoice');
const AssistantsNamedToolChoice_function = require('../models/AssistantsNamedToolChoice_function');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of the tool. If type is `function`, the function name must be set - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'function',
                    'code_interpreter',
                    'file_search',
                ],
            },
            ...AssistantsNamedToolChoice_function.fields(`${keyPrefix}function`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'function': utils.removeIfEmpty(AssistantsNamedToolChoice_function.mapping(bundle, `${keyPrefix}function`)),
        }
    },
}
