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

/// AssistantFileObject : A list of [Files](/docs/api-reference/files) attached to an `assistant`.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct AssistantFileObject {
    /// The identifier, which can be referenced in API endpoints.
    #[serde(rename = "id")]
    pub id: String,
    /// The object type, which is always `assistant.file`.
    #[serde(rename = "object")]
    pub object: Object,
    /// The Unix timestamp (in seconds) for when the assistant file was created.
    #[serde(rename = "created_at")]
    pub created_at: i32,
    /// The assistant ID that the file is attached to.
    #[serde(rename = "assistant_id")]
    pub assistant_id: String,
}

impl AssistantFileObject {
    /// A list of [Files](/docs/api-reference/files) attached to an `assistant`.
    pub fn new(id: String, object: Object, created_at: i32, assistant_id: String) -> AssistantFileObject {
        AssistantFileObject {
            id,
            object,
            created_at,
            assistant_id,
        }
    }
}
/// The object type, which is always `assistant.file`.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Object {
    #[serde(rename = "assistant.file")]
    AssistantPeriodFile,
}

impl Default for Object {
    fn default() -> Object {
        Self::AssistantPeriodFile
    }
}

