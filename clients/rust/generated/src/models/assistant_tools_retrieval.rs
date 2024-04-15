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

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct AssistantToolsRetrieval {
    /// The type of tool being defined: `retrieval`
    #[serde(rename = "type")]
    pub r#type: Type,
}

impl AssistantToolsRetrieval {
    pub fn new(r#type: Type) -> AssistantToolsRetrieval {
        AssistantToolsRetrieval {
            r#type,
        }
    }
}
/// The type of tool being defined: `retrieval`
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Type {
    #[serde(rename = "retrieval")]
    Retrieval,
}

impl Default for Type {
    fn default() -> Type {
        Self::Retrieval
    }
}
