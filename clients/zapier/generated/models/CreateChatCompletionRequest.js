const utils = require('../utils/utils');
const ChatCompletionFunctions = require('../models/ChatCompletionFunctions');
const ChatCompletionRequestMessage = require('../models/ChatCompletionRequestMessage');
const ChatCompletionTool = require('../models/ChatCompletionTool');
const ChatCompletionToolChoiceOption = require('../models/ChatCompletionToolChoiceOption');
const CreateChatCompletionRequest_function_call = require('../models/CreateChatCompletionRequest_function_call');
const CreateChatCompletionRequest_model = require('../models/CreateChatCompletionRequest_model');
const CreateChatCompletionRequest_response_format = require('../models/CreateChatCompletionRequest_response_format');
const CreateChatCompletionRequest_stop = require('../models/CreateChatCompletionRequest_stop');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}messages`,
                label: `[${labelPrefix}messages]`,
                children: ChatCompletionRequestMessage.fields(`${keyPrefix}messages${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...CreateChatCompletionRequest_model.fields(`${keyPrefix}model`, isInput),
            {
                key: `${keyPrefix}frequency_penalty`,
                label: `Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details)  - [${labelPrefix}frequency_penalty]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}logit_bias`,
                label: `Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  - [${labelPrefix}logit_bias]`,
                type: 'object',
            },
            {
                key: `${keyPrefix}logprobs`,
                label: `Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`. - [${labelPrefix}logprobs]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}top_logprobs`,
                label: `An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used. - [${labelPrefix}top_logprobs]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_tokens`,
                label: `The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens.  - [${labelPrefix}max_tokens]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}n`,
                label: `How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs. - [${labelPrefix}n]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}presence_penalty`,
                label: `Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details)  - [${labelPrefix}presence_penalty]`,
                type: 'number',
            },
            ...CreateChatCompletionRequest_response_format.fields(`${keyPrefix}response_format`, isInput),
            {
                key: `${keyPrefix}seed`,
                label: `This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend.  - [${labelPrefix}seed]`,
                type: 'integer',
            },
            ...CreateChatCompletionRequest_stop.fields(`${keyPrefix}stop`, isInput),
            {
                key: `${keyPrefix}stream`,
                label: `If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions).  - [${labelPrefix}stream]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}temperature`,
                label: `What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both.  - [${labelPrefix}temperature]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}top_p`,
                label: `An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.  - [${labelPrefix}top_p]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}tools`,
                label: `[${labelPrefix}tools]`,
                children: ChatCompletionTool.fields(`${keyPrefix}tools${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ChatCompletionToolChoiceOption.fields(`${keyPrefix}tool_choice`, isInput),
            {
                key: `${keyPrefix}user`,
                label: `A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  - [${labelPrefix}user]`,
                type: 'string',
            },
            ...CreateChatCompletionRequest_function_call.fields(`${keyPrefix}function_call`, isInput),
            {
                key: `${keyPrefix}functions`,
                label: `[${labelPrefix}functions]`,
                children: ChatCompletionFunctions.fields(`${keyPrefix}functions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'messages': utils.childMapping(bundle.inputData?.[`${keyPrefix}messages`], `${keyPrefix}messages`, ChatCompletionRequestMessage),
            'model': utils.removeIfEmpty(CreateChatCompletionRequest_model.mapping(bundle, `${keyPrefix}model`)),
            'frequency_penalty': bundle.inputData?.[`${keyPrefix}frequency_penalty`],
            'logit_bias': bundle.inputData?.[`${keyPrefix}logit_bias`],
            'logprobs': bundle.inputData?.[`${keyPrefix}logprobs`],
            'top_logprobs': bundle.inputData?.[`${keyPrefix}top_logprobs`],
            'max_tokens': bundle.inputData?.[`${keyPrefix}max_tokens`],
            'n': bundle.inputData?.[`${keyPrefix}n`],
            'presence_penalty': bundle.inputData?.[`${keyPrefix}presence_penalty`],
            'response_format': utils.removeIfEmpty(CreateChatCompletionRequest_response_format.mapping(bundle, `${keyPrefix}response_format`)),
            'seed': bundle.inputData?.[`${keyPrefix}seed`],
            'stop': utils.removeIfEmpty(CreateChatCompletionRequest_stop.mapping(bundle, `${keyPrefix}stop`)),
            'stream': bundle.inputData?.[`${keyPrefix}stream`],
            'temperature': bundle.inputData?.[`${keyPrefix}temperature`],
            'top_p': bundle.inputData?.[`${keyPrefix}top_p`],
            'tools': utils.childMapping(bundle.inputData?.[`${keyPrefix}tools`], `${keyPrefix}tools`, ChatCompletionTool),
            'tool_choice': utils.removeIfEmpty(ChatCompletionToolChoiceOption.mapping(bundle, `${keyPrefix}tool_choice`)),
            'user': bundle.inputData?.[`${keyPrefix}user`],
            'function_call': utils.removeIfEmpty(CreateChatCompletionRequest_function_call.mapping(bundle, `${keyPrefix}function_call`)),
            'functions': utils.childMapping(bundle.inputData?.[`${keyPrefix}functions`], `${keyPrefix}functions`, ChatCompletionFunctions),
        }
    },
}
