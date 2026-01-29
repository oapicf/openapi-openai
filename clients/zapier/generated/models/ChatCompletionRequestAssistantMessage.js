const utils = require('../utils/utils');
const ChatCompletionMessageToolCall = require('../models/ChatCompletionMessageToolCall');
const ChatCompletionRequestAssistantMessage_function_call = require('../models/ChatCompletionRequestAssistantMessage_function_call');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}content`,
                label: `The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified.  - [${labelPrefix}content]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}role`,
                label: `The role of the messages author, in this case `assistant`. - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'assistant',
                ],
            },
            {
                key: `${keyPrefix}name`,
                label: `An optional name for the participant. Provides the model information to differentiate between participants of the same role. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}tool_calls`,
                label: `[${labelPrefix}tool_calls]`,
                children: ChatCompletionMessageToolCall.fields(`${keyPrefix}tool_calls${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ChatCompletionRequestAssistantMessage_function_call.fields(`${keyPrefix}function_call`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'content': bundle.inputData?.[`${keyPrefix}content`],
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'tool_calls': utils.childMapping(bundle.inputData?.[`${keyPrefix}tool_calls`], `${keyPrefix}tool_calls`, ChatCompletionMessageToolCall),
            'function_call': utils.removeIfEmpty(ChatCompletionRequestAssistantMessage_function_call.mapping(bundle, `${keyPrefix}function_call`)),
        }
    },
}
