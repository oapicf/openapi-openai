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

/// AssistantsApiNamedToolChoice : Specifies a tool the model should use. Use to force the model to call a specific tool.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct AssistantsApiNamedToolChoice {
    /// The type of the tool. If type is `function`, the function name must be set
    #[serde(rename = "type")]
    pub r#type: Type,
    #[serde(rename = "function", skip_serializing_if = "Option::is_none")]
    pub function: Option<Box<models::ChatCompletionNamedToolChoiceFunction>>,
}

impl AssistantsApiNamedToolChoice {
    /// Specifies a tool the model should use. Use to force the model to call a specific tool.
    pub fn new(r#type: Type) -> AssistantsApiNamedToolChoice {
        AssistantsApiNamedToolChoice {
            r#type,
            function: None,
        }
    }
}
/// The type of the tool. If type is `function`, the function name must be set
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Type {
    #[serde(rename = "function")]
    Function,
    #[serde(rename = "code_interpreter")]
    CodeInterpreter,
    #[serde(rename = "retrieval")]
    Retrieval,
}

impl Default for Type {
    fn default() -> Type {
        Self::Function
    }
}

