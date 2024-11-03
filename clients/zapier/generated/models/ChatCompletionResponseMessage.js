const utils = require('../utils/utils');
const ChatCompletionMessageToolCall = require('../models/ChatCompletionMessageToolCall');
const ChatCompletionRequestAssistantMessage_function_call = require('../models/ChatCompletionRequestAssistantMessage_function_call');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}content`,
                label: `The contents of the message. - [${labelPrefix}content]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}tool_calls`,
                label: `[${labelPrefix}tool_calls]`,
                children: ChatCompletionMessageToolCall.fields(`${keyPrefix}tool_calls${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}role`,
                label: `The role of the author of this message. - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'assistant',
                ],
            },
            ...ChatCompletionRequestAssistantMessage_function_call.fields(`${keyPrefix}function_call`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'content': bundle.inputData?.[`${keyPrefix}content`],
            'tool_calls': utils.childMapping(bundle.inputData?.[`${keyPrefix}tool_calls`], `${keyPrefix}tool_calls`, ChatCompletionMessageToolCall),
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'function_call': utils.removeIfEmpty(ChatCompletionRequestAssistantMessage_function_call.mapping(bundle, `${keyPrefix}function_call`)),
        }
    },
}
