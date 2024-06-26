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

/// ChatCompletionRole : The role of the author of a message
/// The role of the author of a message
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ChatCompletionRole {
    #[serde(rename = "system")]
    System,
    #[serde(rename = "user")]
    User,
    #[serde(rename = "assistant")]
    Assistant,
    #[serde(rename = "tool")]
    Tool,
    #[serde(rename = "function")]
    Function,

}

impl ToString for ChatCompletionRole {
    fn to_string(&self) -> String {
        match self {
            Self::System => String::from("system"),
            Self::User => String::from("user"),
            Self::Assistant => String::from("assistant"),
            Self::Tool => String::from("tool"),
            Self::Function => String::from("function"),
        }
    }
}

impl Default for ChatCompletionRole {
    fn default() -> ChatCompletionRole {
        Self::System
    }
}

