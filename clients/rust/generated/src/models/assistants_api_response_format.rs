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

/// AssistantsApiResponseFormat : An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct AssistantsApiResponseFormat {
    /// Must be one of `text` or `json_object`.
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<Type>,
}

impl AssistantsApiResponseFormat {
    /// An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
    pub fn new() -> AssistantsApiResponseFormat {
        AssistantsApiResponseFormat {
            r#type: None,
        }
    }
}
/// Must be one of `text` or `json_object`.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Type {
    #[serde(rename = "text")]
    Text,
    #[serde(rename = "json_object")]
    JsonObject,
}

impl Default for Type {
    fn default() -> Type {
        Self::Text
    }
}

