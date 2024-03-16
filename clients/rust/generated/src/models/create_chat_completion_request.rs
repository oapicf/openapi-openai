/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateChatCompletionRequest {
    #[serde(rename = "model")]
    pub model: Box<models::CreateChatCompletionRequestModel>,
    /// A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).
    #[serde(rename = "messages")]
    pub messages: Vec<models::ChatCompletionRequestMessage>,
    /// A list of functions the model may generate JSON inputs for.
    #[serde(rename = "functions", skip_serializing_if = "Option::is_none")]
    pub functions: Option<Vec<models::ChatCompletionFunctions>>,
    #[serde(rename = "function_call", skip_serializing_if = "Option::is_none")]
    pub function_call: Option<Box<models::CreateChatCompletionRequestFunctionCall>>,
    /// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
    #[serde(rename = "temperature", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub temperature: Option<Option<f64>>,
    /// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
    #[serde(rename = "top_p", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub top_p: Option<Option<f64>>,
    /// How many chat completion choices to generate for each input message.
    #[serde(rename = "n", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub n: Option<Option<i32>>,
    /// If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
    #[serde(rename = "stream", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub stream: Option<Option<bool>>,
    #[serde(rename = "stop", skip_serializing_if = "Option::is_none")]
    pub stop: Option<Box<models::CreateChatCompletionRequestStop>>,
    /// The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
    #[serde(rename = "max_tokens", skip_serializing_if = "Option::is_none")]
    pub max_tokens: Option<i32>,
    /// Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
    #[serde(rename = "presence_penalty", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub presence_penalty: Option<Option<f64>>,
    /// Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
    #[serde(rename = "frequency_penalty", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub frequency_penalty: Option<Option<f64>>,
    /// Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
    #[serde(rename = "logit_bias", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub logit_bias: Option<Option<serde_json::Value>>,
    /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    #[serde(rename = "user", skip_serializing_if = "Option::is_none")]
    pub user: Option<String>,
}

impl CreateChatCompletionRequest {
    pub fn new(model: models::CreateChatCompletionRequestModel, messages: Vec<models::ChatCompletionRequestMessage>) -> CreateChatCompletionRequest {
        CreateChatCompletionRequest {
            model: Box::new(model),
            messages,
            functions: None,
            function_call: None,
            temperature: None,
            top_p: None,
            n: None,
            stream: None,
            stop: None,
            max_tokens: None,
            presence_penalty: None,
            frequency_penalty: None,
            logit_bias: None,
            user: None,
        }
    }
}

