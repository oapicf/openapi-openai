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

/// ChatCompletionResponseMessage : A chat completion message generated by the model.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ChatCompletionResponseMessage {
    /// The contents of the message.
    #[serde(rename = "content", deserialize_with = "Option::deserialize")]
    pub content: Option<String>,
    /// The tool calls generated by the model, such as function calls.
    #[serde(rename = "tool_calls", skip_serializing_if = "Option::is_none")]
    pub tool_calls: Option<Vec<models::ChatCompletionMessageToolCall>>,
    /// The role of the author of this message.
    #[serde(rename = "role")]
    pub role: Role,
    #[serde(rename = "function_call", skip_serializing_if = "Option::is_none")]
    pub function_call: Option<Box<models::ChatCompletionRequestAssistantMessageFunctionCall>>,
}

impl ChatCompletionResponseMessage {
    /// A chat completion message generated by the model.
    pub fn new(content: Option<String>, role: Role) -> ChatCompletionResponseMessage {
        ChatCompletionResponseMessage {
            content,
            tool_calls: None,
            role,
            function_call: None,
        }
    }
}
/// The role of the author of this message.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Role {
    #[serde(rename = "assistant")]
    Assistant,
}

impl Default for Role {
    fn default() -> Role {
        Self::Assistant
    }
}

