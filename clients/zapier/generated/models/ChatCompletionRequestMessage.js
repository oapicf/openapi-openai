const utils = require('../utils/utils');
const ChatCompletionRequestMessage_function_call = require('../models/ChatCompletionRequestMessage_function_call');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}role`,
                label: `The role of the messages author. One of `system`, `user`, `assistant`, or `function`. - [${labelPrefix}role]`,
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
                label: `The contents of the message. `content` is required for all messages except assistant messages with function calls. - [${labelPrefix}content]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters. - [${labelPrefix}name]`,
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
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'function_call': utils.removeIfEmpty(ChatCompletionRequestMessage_function_call.mapping(bundle, `${keyPrefix}function_call`)),
        }
    },
}
