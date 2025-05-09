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
pub struct ListAssistantsResponse {
    #[serde(rename = "object")]
    pub object: String,
    #[serde(rename = "data")]
    pub data: Vec<models::AssistantObject>,
    #[serde(rename = "first_id")]
    pub first_id: String,
    #[serde(rename = "last_id")]
    pub last_id: String,
    #[serde(rename = "has_more")]
    pub has_more: bool,
}

impl ListAssistantsResponse {
    pub fn new(object: String, data: Vec<models::AssistantObject>, first_id: String, last_id: String, has_more: bool) -> ListAssistantsResponse {
        ListAssistantsResponse {
            object,
            data,
            first_id,
            last_id,
            has_more,
        }
    }
}

