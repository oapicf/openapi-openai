const utils = require('../utils/utils');
const ChatCompletionMessageToolCall = require('../models/ChatCompletionMessageToolCall');
const ChatCompletionRequestAssistantMessage_audio = require('../models/ChatCompletionRequestAssistantMessage_audio');
const ChatCompletionRequestAssistantMessage_content = require('../models/ChatCompletionRequestAssistantMessage_content');
const ChatCompletionRequestAssistantMessage_function_call = require('../models/ChatCompletionRequestAssistantMessage_function_call');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ChatCompletionRequestAssistantMessage_content.fields(`${keyPrefix}content`, isInput),
            {
                key: `${keyPrefix}refusal`,
                label: `The refusal message by the assistant. - [${labelPrefix}refusal]`,
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
            ...ChatCompletionRequestAssistantMessage_audio.fields(`${keyPrefix}audio`, isInput),
            {
                key: `${keyPrefix}tool_calls`,
                label: `[${labelPrefix}tool_calls]`,
                children: ChatCompletionMessageToolCall.fields(`${keyPrefix}tool_calls${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ChatCompletionRequestAssistantMessage_function_call.fields(`${keyPrefix}function_call`, isInput),
            {
                key: `${keyPrefix}weight`,
                label: `Controls whether the assistant message is trained against (0 or 1) - [${labelPrefix}weight]`,
                type: 'integer',
                choices: [
                    '0',
                    '1',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'content': utils.removeIfEmpty(ChatCompletionRequestAssistantMessage_content.mapping(bundle, `${keyPrefix}content`)),
            'refusal': bundle.inputData?.[`${keyPrefix}refusal`],
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'audio': utils.removeIfEmpty(ChatCompletionRequestAssistantMessage_audio.mapping(bundle, `${keyPrefix}audio`)),
            'tool_calls': utils.childMapping(bundle.inputData?.[`${keyPrefix}tool_calls`], `${keyPrefix}tool_calls`, ChatCompletionMessageToolCall),
            'function_call': utils.removeIfEmpty(ChatCompletionRequestAssistantMessage_function_call.mapping(bundle, `${keyPrefix}function_call`)),
            'weight': bundle.inputData?.[`${keyPrefix}weight`],
        }
    },
}
