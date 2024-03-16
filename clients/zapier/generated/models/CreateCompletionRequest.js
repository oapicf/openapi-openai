const utils = require('../utils/utils');
const CreateCompletionRequest_model = require('../models/CreateCompletionRequest_model');
const CreateCompletionRequest_prompt = require('../models/CreateCompletionRequest_prompt');
const CreateCompletionRequest_stop = require('../models/CreateCompletionRequest_stop');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CreateCompletionRequest_model.fields(`${keyPrefix}model`, isInput),
            ...CreateCompletionRequest_prompt.fields(`${keyPrefix}prompt`, isInput),
            {
                key: `${keyPrefix}suffix`,
                label: `The suffix that comes after a completion of inserted text. - [${labelPrefix}suffix]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}max_tokens`,
                label: `The maximum number of [tokens](/tokenizer) to generate in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens.  - [${labelPrefix}max_tokens]`,
                type: 'integer',
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
                key: `${keyPrefix}n`,
                label: `How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`.  - [${labelPrefix}n]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}stream`,
                label: `Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb).  - [${labelPrefix}stream]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}logprobs`,
                label: `Include the log probabilities on the `logprobs` most likely tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5.  - [${labelPrefix}logprobs]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}echo`,
                label: `Echo back the prompt in addition to the completion  - [${labelPrefix}echo]`,
                type: 'boolean',
            },
            ...CreateCompletionRequest_stop.fields(`${keyPrefix}stop`, isInput),
            {
                key: `${keyPrefix}presence_penalty`,
                label: `Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details)  - [${labelPrefix}presence_penalty]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}frequency_penalty`,
                label: `Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details)  - [${labelPrefix}frequency_penalty]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}best_of`,
                label: `Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`.  - [${labelPrefix}best_of]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}logit_bias`,
                label: `Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated.  - [${labelPrefix}logit_bias]`,
                dict: true,
            },
            {
                key: `${keyPrefix}user`,
                label: `A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  - [${labelPrefix}user]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'model': utils.removeIfEmpty(CreateCompletionRequest_model.mapping(bundle, `${keyPrefix}model`)),
            'prompt': utils.removeIfEmpty(CreateCompletionRequest_prompt.mapping(bundle, `${keyPrefix}prompt`)),
            'suffix': bundle.inputData?.[`${keyPrefix}suffix`],
            'max_tokens': bundle.inputData?.[`${keyPrefix}max_tokens`],
            'temperature': bundle.inputData?.[`${keyPrefix}temperature`],
            'top_p': bundle.inputData?.[`${keyPrefix}top_p`],
            'n': bundle.inputData?.[`${keyPrefix}n`],
            'stream': bundle.inputData?.[`${keyPrefix}stream`],
            'logprobs': bundle.inputData?.[`${keyPrefix}logprobs`],
            'echo': bundle.inputData?.[`${keyPrefix}echo`],
            'stop': utils.removeIfEmpty(CreateCompletionRequest_stop.mapping(bundle, `${keyPrefix}stop`)),
            'presence_penalty': bundle.inputData?.[`${keyPrefix}presence_penalty`],
            'frequency_penalty': bundle.inputData?.[`${keyPrefix}frequency_penalty`],
            'best_of': bundle.inputData?.[`${keyPrefix}best_of`],
            'logit_bias': bundle.inputData?.[`${keyPrefix}logit_bias`],
            'user': bundle.inputData?.[`${keyPrefix}user`],
        }
    },
}
