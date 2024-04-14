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
pub struct DeleteFileResponse {
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "object")]
    pub object: Object,
    #[serde(rename = "deleted")]
    pub deleted: bool,
}

impl DeleteFileResponse {
    pub fn new(id: String, object: Object, deleted: bool) -> DeleteFileResponse {
        DeleteFileResponse {
            id,
            object,
            deleted,
        }
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Object {
    #[serde(rename = "file")]
    File,
}

impl Default for Object {
    fn default() -> Object {
        Self::File
    }
}

