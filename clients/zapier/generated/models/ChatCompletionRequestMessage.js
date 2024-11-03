const utils = require('../utils/utils');
const ChatCompletionMessageToolCall = require('../models/ChatCompletionMessageToolCall');
const ChatCompletionRequestAssistantMessage = require('../models/ChatCompletionRequestAssistantMessage');
const ChatCompletionRequestAssistantMessage_function_call = require('../models/ChatCompletionRequestAssistantMessage_function_call');
const ChatCompletionRequestFunctionMessage = require('../models/ChatCompletionRequestFunctionMessage');
const ChatCompletionRequestSystemMessage = require('../models/ChatCompletionRequestSystemMessage');
const ChatCompletionRequestToolMessage = require('../models/ChatCompletionRequestToolMessage');
const ChatCompletionRequestUserMessage = require('../models/ChatCompletionRequestUserMessage');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}content`,
                label: `The contents of the function message. - [${labelPrefix}content]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}role`,
                label: `The role of the messages author, in this case `function`. - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'function',
                ],
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the function to call. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}tool_calls`,
                label: `[${labelPrefix}tool_calls]`,
                children: ChatCompletionMessageToolCall.fields(`${keyPrefix}tool_calls${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ChatCompletionRequestAssistantMessage_function_call.fields(`${keyPrefix}function_call`, isInput),
            {
                key: `${keyPrefix}tool_call_id`,
                label: `Tool call that this message is responding to. - [${labelPrefix}tool_call_id]`,
                required: true,
                type: 'string',
            },
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
            'tool_call_id': bundle.inputData?.[`${keyPrefix}tool_call_id`],
        }
    },
}
