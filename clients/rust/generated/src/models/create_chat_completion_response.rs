/*
 * OpenAI API
 *
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateChatCompletionResponse {
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "object")]
    pub object: String,
    #[serde(rename = "created")]
    pub created: i32,
    #[serde(rename = "model")]
    pub model: String,
    #[serde(rename = "choices")]
    pub choices: Vec<models::CreateChatCompletionResponseChoicesInner>,
    #[serde(rename = "usage", skip_serializing_if = "Option::is_none")]
    pub usage: Option<Box<models::CreateCompletionResponseUsage>>,
}

impl CreateChatCompletionResponse {
    pub fn new(id: String, object: String, created: i32, model: String, choices: Vec<models::CreateChatCompletionResponseChoicesInner>) -> CreateChatCompletionResponse {
        CreateChatCompletionResponse {
            id,
            object,
            created,
            model,
            choices,
            usage: None,
        }
    }
}
