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

/// ChatCompletionRequestAssistantMessageFunctionCall : Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ChatCompletionRequestAssistantMessageFunctionCall {
    /// The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
    #[serde(rename = "arguments")]
    pub arguments: String,
    /// The name of the function to call.
    #[serde(rename = "name")]
    pub name: String,
}

impl ChatCompletionRequestAssistantMessageFunctionCall {
    /// Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.
    pub fn new(arguments: String, name: String) -> ChatCompletionRequestAssistantMessageFunctionCall {
        ChatCompletionRequestAssistantMessageFunctionCall {
            arguments,
            name,
        }
    }
}

