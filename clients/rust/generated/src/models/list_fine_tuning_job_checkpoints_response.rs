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
pub struct ListFineTuningJobCheckpointsResponse {
    #[serde(rename = "data")]
    pub data: Vec<models::FineTuningJobCheckpoint>,
    #[serde(rename = "object")]
    pub object: Object,
    #[serde(rename = "first_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub first_id: Option<Option<String>>,
    #[serde(rename = "last_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub last_id: Option<Option<String>>,
    #[serde(rename = "has_more")]
    pub has_more: bool,
}

impl ListFineTuningJobCheckpointsResponse {
    pub fn new(data: Vec<models::FineTuningJobCheckpoint>, object: Object, has_more: bool) -> ListFineTuningJobCheckpointsResponse {
        ListFineTuningJobCheckpointsResponse {
            data,
            object,
            first_id: None,
            last_id: None,
            has_more,
        }
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Object {
    #[serde(rename = "list")]
    List,
}

impl Default for Object {
    fn default() -> Object {
        Self::List
    }
}

