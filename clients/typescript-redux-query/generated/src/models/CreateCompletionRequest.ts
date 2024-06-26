// tslint:disable
/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    CreateCompletionRequestModel,
    CreateCompletionRequestModelFromJSON,
    CreateCompletionRequestModelToJSON,
    CreateCompletionRequestPrompt,
    CreateCompletionRequestPromptFromJSON,
    CreateCompletionRequestPromptToJSON,
    CreateCompletionRequestStop,
    CreateCompletionRequestStopFromJSON,
    CreateCompletionRequestStopToJSON,
} from './';

/**
 * 
 * @export
 * @interface CreateCompletionRequest
 */
export interface CreateCompletionRequest  {
    /**
     * 
     * @type {CreateCompletionRequestModel}
     * @memberof CreateCompletionRequest
     */
    model: CreateCompletionRequestModel;
    /**
     * 
     * @type {CreateCompletionRequestPrompt}
     * @memberof CreateCompletionRequest
     */
    prompt: CreateCompletionRequestPrompt;
    /**
     * Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
     * @type {number}
     * @memberof CreateCompletionRequest
     */
    bestOf?: number;
    /**
     * Echo back the prompt in addition to the completion 
     * @type {boolean}
     * @memberof CreateCompletionRequest
     */
    echo?: boolean;
    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model\'s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
     * @type {number}
     * @memberof CreateCompletionRequest
     */
    frequencyPenalty?: number;
    /**
     * Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. 
     * @type {{ [key: string]: number; }}
     * @memberof CreateCompletionRequest
     */
    logitBias?: { [key: string]: number; };
    /**
     * Include the log probabilities on the `logprobs` most likely output tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. 
     * @type {number}
     * @memberof CreateCompletionRequest
     */
    logprobs?: number;
    /**
     * The maximum number of [tokens](/tokenizer) that can be generated in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model\'s context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
     * @type {number}
     * @memberof CreateCompletionRequest
     */
    maxTokens?: number;
    /**
     * How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
     * @type {number}
     * @memberof CreateCompletionRequest
     */
    n?: number;
    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model\'s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
     * @type {number}
     * @memberof CreateCompletionRequest
     */
    presencePenalty?: number;
    /**
     * If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
     * @type {number}
     * @memberof CreateCompletionRequest
     */
    seed?: number;
    /**
     * 
     * @type {CreateCompletionRequestStop}
     * @memberof CreateCompletionRequest
     */
    stop?: CreateCompletionRequestStop;
    /**
     * Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
     * @type {boolean}
     * @memberof CreateCompletionRequest
     */
    stream?: boolean;
    /**
     * The suffix that comes after a completion of inserted text.  This parameter is only supported for `gpt-3.5-turbo-instruct`. 
     * @type {string}
     * @memberof CreateCompletionRequest
     */
    suffix?: string;
    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
     * @type {number}
     * @memberof CreateCompletionRequest
     */
    temperature?: number;
    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
     * @type {number}
     * @memberof CreateCompletionRequest
     */
    topP?: number;
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     * @type {string}
     * @memberof CreateCompletionRequest
     */
    user?: string;
}

export function CreateCompletionRequestFromJSON(json: any): CreateCompletionRequest {
    return {
        'model': CreateCompletionRequestModelFromJSON(json['model']),
        'prompt': CreateCompletionRequestPromptFromJSON(json['prompt']),
        'bestOf': !exists(json, 'best_of') ? undefined : json['best_of'],
        'echo': !exists(json, 'echo') ? undefined : json['echo'],
        'frequencyPenalty': !exists(json, 'frequency_penalty') ? undefined : json['frequency_penalty'],
        'logitBias': !exists(json, 'logit_bias') ? undefined : json['logit_bias'],
        'logprobs': !exists(json, 'logprobs') ? undefined : json['logprobs'],
        'maxTokens': !exists(json, 'max_tokens') ? undefined : json['max_tokens'],
        'n': !exists(json, 'n') ? undefined : json['n'],
        'presencePenalty': !exists(json, 'presence_penalty') ? undefined : json['presence_penalty'],
        'seed': !exists(json, 'seed') ? undefined : json['seed'],
        'stop': !exists(json, 'stop') ? undefined : CreateCompletionRequestStopFromJSON(json['stop']),
        'stream': !exists(json, 'stream') ? undefined : json['stream'],
        'suffix': !exists(json, 'suffix') ? undefined : json['suffix'],
        'temperature': !exists(json, 'temperature') ? undefined : json['temperature'],
        'topP': !exists(json, 'top_p') ? undefined : json['top_p'],
        'user': !exists(json, 'user') ? undefined : json['user'],
    };
}

export function CreateCompletionRequestToJSON(value?: CreateCompletionRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'model': CreateCompletionRequestModelToJSON(value.model),
        'prompt': CreateCompletionRequestPromptToJSON(value.prompt),
        'best_of': value.bestOf,
        'echo': value.echo,
        'frequency_penalty': value.frequencyPenalty,
        'logit_bias': value.logitBias,
        'logprobs': value.logprobs,
        'max_tokens': value.maxTokens,
        'n': value.n,
        'presence_penalty': value.presencePenalty,
        'seed': value.seed,
        'stop': CreateCompletionRequestStopToJSON(value.stop),
        'stream': value.stream,
        'suffix': value.suffix,
        'temperature': value.temperature,
        'top_p': value.topP,
        'user': value.user,
    };
}


