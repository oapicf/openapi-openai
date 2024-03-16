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
pub struct ChatCompletionResponseMessage {
    /// The role of the author of this message.
    #[serde(rename = "role")]
    pub role: Role,
    /// The contents of the message.
    #[serde(rename = "content", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub content: Option<Option<String>>,
    #[serde(rename = "function_call", skip_serializing_if = "Option::is_none")]
    pub function_call: Option<Box<models::ChatCompletionRequestMessageFunctionCall>>,
}

impl ChatCompletionResponseMessage {
    pub fn new(role: Role) -> ChatCompletionResponseMessage {
        ChatCompletionResponseMessage {
            role,
            content: None,
            function_call: None,
        }
    }
}
/// The role of the author of this message.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Role {
    #[serde(rename = "system")]
    System,
    #[serde(rename = "user")]
    User,
    #[serde(rename = "assistant")]
    Assistant,
    #[serde(rename = "function")]
    Function,
}

impl Default for Role {
    fn default() -> Role {
        Self::System
    }
}
