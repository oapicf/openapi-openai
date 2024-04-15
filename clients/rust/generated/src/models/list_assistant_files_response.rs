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
pub struct ListAssistantFilesResponse {
    #[serde(rename = "object")]
    pub object: String,
    #[serde(rename = "data")]
    pub data: Vec<models::AssistantFileObject>,
    #[serde(rename = "first_id")]
    pub first_id: String,
    #[serde(rename = "last_id")]
    pub last_id: String,
    #[serde(rename = "has_more")]
    pub has_more: bool,
}

impl ListAssistantFilesResponse {
    pub fn new(object: String, data: Vec<models::AssistantFileObject>, first_id: String, last_id: String, has_more: bool) -> ListAssistantFilesResponse {
        ListAssistantFilesResponse {
            object,
            data,
            first_id,
            last_id,
            has_more,
        }
    }
}
