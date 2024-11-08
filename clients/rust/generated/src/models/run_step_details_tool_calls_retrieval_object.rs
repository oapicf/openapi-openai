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
pub struct RunStepDetailsToolCallsRetrievalObject {
    /// The ID of the tool call object.
    #[serde(rename = "id")]
    pub id: String,
    /// The type of tool call. This is always going to be `retrieval` for this type of tool call.
    #[serde(rename = "type")]
    pub r#type: Type,
    /// For now, this is always going to be an empty object.
    #[serde(rename = "retrieval")]
    pub retrieval: serde_json::Value,
}

impl RunStepDetailsToolCallsRetrievalObject {
    pub fn new(id: String, r#type: Type, retrieval: serde_json::Value) -> RunStepDetailsToolCallsRetrievalObject {
        RunStepDetailsToolCallsRetrievalObject {
            id,
            r#type,
            retrieval,
        }
    }
}
/// The type of tool call. This is always going to be `retrieval` for this type of tool call.
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

