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
pub struct Model {
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "object")]
    pub object: String,
    #[serde(rename = "created")]
    pub created: i32,
    #[serde(rename = "owned_by")]
    pub owned_by: String,
}

impl Model {
    pub fn new(id: String, object: String, created: i32, owned_by: String) -> Model {
        Model {
            id,
            object,
            created,
            owned_by,
        }
    }
}

