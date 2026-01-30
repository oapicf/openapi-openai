const utils = require('../utils/utils');
const AssistantsNamedToolChoice_function = require('../models/AssistantsNamedToolChoice_function');
const ChatCompletionNamedToolChoice = require('../models/ChatCompletionNamedToolChoice');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of the tool. Currently, only `function` is supported. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'function',
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
