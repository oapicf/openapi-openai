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
pub struct ChatCompletionMessageToolCall {
    /// The ID of the tool call.
    #[serde(rename = "id")]
    pub id: String,
    /// The type of the tool. Currently, only `function` is supported.
    #[serde(rename = "type")]
    pub r#type: Type,
    #[serde(rename = "function")]
    pub function: Box<models::ChatCompletionMessageToolCallFunction>,
}

impl ChatCompletionMessageToolCall {
    pub fn new(id: String, r#type: Type, function: models::ChatCompletionMessageToolCallFunction) -> ChatCompletionMessageToolCall {
        ChatCompletionMessageToolCall {
            id,
            r#type,
            function: Box::new(function),
        }
    }
}
/// The type of the tool. Currently, only `function` is supported.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Type {
    #[serde(rename = "function")]
    Function,
}

impl Default for Type {
    fn default() -> Type {
        Self::Function
    }
}

