/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateCompletionRequest {
    #[serde(rename = "model")]
    pub model: Box<models::CreateCompletionRequestModel>,
    #[serde(rename = "prompt", deserialize_with = "Option::deserialize")]
    pub prompt: Option<Box<models::CreateCompletionRequestPrompt>>,
    /// Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
    #[serde(rename = "best_of", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub best_of: Option<Option<i32>>,
    /// Echo back the prompt in addition to the completion 
    #[serde(rename = "echo", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub echo: Option<Option<bool>>,
    /// Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
    #[serde(rename = "frequency_penalty", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub frequency_penalty: Option<Option<f64>>,
    /// Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. 
    #[serde(rename = "logit_bias", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub logit_bias: Option<Option<std::collections::HashMap<String, i32>>>,
    /// Include the log probabilities on the `logprobs` most likely output tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. 
    #[serde(rename = "logprobs", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub logprobs: Option<Option<i32>>,
    /// The maximum number of [tokens](/tokenizer) that can be generated in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
    #[serde(rename = "max_tokens", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub max_tokens: Option<Option<i32>>,
    /// How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
    #[serde(rename = "n", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub n: Option<Option<i32>>,
    /// Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
    #[serde(rename = "presence_penalty", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub presence_penalty: Option<Option<f64>>,
    /// If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
    #[serde(rename = "seed", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub seed: Option<Option<i32>>,
    #[serde(rename = "stop", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub stop: Option<Option<Box<models::CreateCompletionRequestStop>>>,
    /// Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
    #[serde(rename = "stream", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub stream: Option<Option<bool>>,
    /// The suffix that comes after a completion of inserted text.  This parameter is only supported for `gpt-3.5-turbo-instruct`. 
    #[serde(rename = "suffix", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub suffix: Option<Option<String>>,
    /// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
    #[serde(rename = "temperature", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub temperature: Option<Option<f64>>,
    /// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
    #[serde(rename = "top_p", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub top_p: Option<Option<f64>>,
    /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    #[serde(rename = "user", skip_serializing_if = "Option::is_none")]
    pub user: Option<String>,
}

impl CreateCompletionRequest {
    pub fn new(model: models::CreateCompletionRequestModel, prompt: Option<models::CreateCompletionRequestPrompt>) -> CreateCompletionRequest {
        CreateCompletionRequest {
            model: Box::new(model),
            prompt: if let Some(x) = prompt {Some(Box::new(x))} else {None},
            best_of: None,
            echo: None,
            frequency_penalty: None,
            logit_bias: None,
            logprobs: None,
            max_tokens: None,
            n: None,
            presence_penalty: None,
            seed: None,
            stop: None,
            stream: None,
            suffix: None,
            temperature: None,
            top_p: None,
            user: None,
        }
    }
}

