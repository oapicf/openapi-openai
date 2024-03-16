const utils = require('../utils/utils');
const ChatCompletionRequestMessage_function_call = require('../models/ChatCompletionRequestMessage_function_call');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}role`,
                label: `The role of the author of this message. - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'system',
                    'user',
                    'assistant',
                    'function',
                ],
            },
            {
                key: `${keyPrefix}content`,
                label: `The contents of the message. - [${labelPrefix}content]`,
                type: 'string',
            },
            ...ChatCompletionRequestMessage_function_call.fields(`${keyPrefix}function_call`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'content': bundle.inputData?.[`${keyPrefix}content`],
            'function_call': utils.removeIfEmpty(ChatCompletionRequestMessage_function_call.mapping(bundle, `${keyPrefix}function_call`)),
        }
    },
}
