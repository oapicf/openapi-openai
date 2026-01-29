const utils = require('../utils/utils');
const ChatCompletionMessageToolCallChunk = require('../models/ChatCompletionMessageToolCallChunk');
const ChatCompletionStreamResponseDelta_function_call = require('../models/ChatCompletionStreamResponseDelta_function_call');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}content`,
                label: `The contents of the chunk message. - [${labelPrefix}content]`,
                type: 'string',
            },
            ...ChatCompletionStreamResponseDelta_function_call.fields(`${keyPrefix}function_call`, isInput),
            {
                key: `${keyPrefix}tool_calls`,
                label: `[${labelPrefix}tool_calls]`,
                children: ChatCompletionMessageToolCallChunk.fields(`${keyPrefix}tool_calls${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}role`,
                label: `The role of the author of this message. - [${labelPrefix}role]`,
                type: 'string',
                choices: [
                    'system',
                    'user',
                    'assistant',
                    'tool',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'content': bundle.inputData?.[`${keyPrefix}content`],
            'function_call': utils.removeIfEmpty(ChatCompletionStreamResponseDelta_function_call.mapping(bundle, `${keyPrefix}function_call`)),
            'tool_calls': utils.childMapping(bundle.inputData?.[`${keyPrefix}tool_calls`], `${keyPrefix}tool_calls`, ChatCompletionMessageToolCallChunk),
            'role': bundle.inputData?.[`${keyPrefix}role`],
        }
    },
}
