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
pub struct ChatCompletionRequestMessage {
    /// The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
    #[serde(rename = "role")]
    pub role: Role,
    /// The contents of the message. `content` is required for all messages except assistant messages with function calls.
    #[serde(rename = "content", skip_serializing_if = "Option::is_none")]
    pub content: Option<String>,
    /// The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    #[serde(rename = "function_call", skip_serializing_if = "Option::is_none")]
    pub function_call: Option<Box<models::ChatCompletionRequestMessageFunctionCall>>,
}

impl ChatCompletionRequestMessage {
    pub fn new(role: Role) -> ChatCompletionRequestMessage {
        ChatCompletionRequestMessage {
            role,
            content: None,
            name: None,
            function_call: None,
        }
    }
}
/// The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
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
