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
pub struct CreateEmbeddingResponseDataInner {
    #[serde(rename = "index")]
    pub index: i32,
    #[serde(rename = "object")]
    pub object: String,
    #[serde(rename = "embedding")]
    pub embedding: Vec<f64>,
}

impl CreateEmbeddingResponseDataInner {
    pub fn new(index: i32, object: String, embedding: Vec<f64>) -> CreateEmbeddingResponseDataInner {
        CreateEmbeddingResponseDataInner {
            index,
            object,
            embedding,
        }
    }
}
