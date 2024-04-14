const utils = require('../utils/utils');
const ChatCompletionStreamResponseDelta = require('../models/ChatCompletionStreamResponseDelta');
const CreateChatCompletionResponse_choices_inner_logprobs = require('../models/CreateChatCompletionResponse_choices_inner_logprobs');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ChatCompletionStreamResponseDelta.fields(`${keyPrefix}delta`, isInput),
            ...CreateChatCompletionResponse_choices_inner_logprobs.fields(`${keyPrefix}logprobs`, isInput),
            {
                key: `${keyPrefix}finish_reason`,
                label: `The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.  - [${labelPrefix}finish_reason]`,
                required: true,
                type: 'string',
                choices: [
                    'stop',
                    'length',
                    'tool_calls',
                    'content_filter',
                    'function_call',
                ],
            },
            {
                key: `${keyPrefix}index`,
                label: `The index of the choice in the list of choices. - [${labelPrefix}index]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'delta': utils.removeIfEmpty(ChatCompletionStreamResponseDelta.mapping(bundle, `${keyPrefix}delta`)),
            'logprobs': utils.removeIfEmpty(CreateChatCompletionResponse_choices_inner_logprobs.mapping(bundle, `${keyPrefix}logprobs`)),
            'finish_reason': bundle.inputData?.[`${keyPrefix}finish_reason`],
            'index': bundle.inputData?.[`${keyPrefix}index`],
        }
    },
}
