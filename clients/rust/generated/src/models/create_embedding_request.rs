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
pub struct CreateEmbeddingRequest {
    #[serde(rename = "input")]
    pub input: Box<models::CreateEmbeddingRequestInput>,
    #[serde(rename = "model")]
    pub model: Box<models::CreateEmbeddingRequestModel>,
    /// The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
    #[serde(rename = "encoding_format", skip_serializing_if = "Option::is_none")]
    pub encoding_format: Option<EncodingFormat>,
    /// The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
    #[serde(rename = "dimensions", skip_serializing_if = "Option::is_none")]
    pub dimensions: Option<i32>,
    /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    #[serde(rename = "user", skip_serializing_if = "Option::is_none")]
    pub user: Option<String>,
}

impl CreateEmbeddingRequest {
    pub fn new(input: models::CreateEmbeddingRequestInput, model: models::CreateEmbeddingRequestModel) -> CreateEmbeddingRequest {
        CreateEmbeddingRequest {
            input: Box::new(input),
            model: Box::new(model),
            encoding_format: None,
            dimensions: None,
            user: None,
        }
    }
}
/// The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum EncodingFormat {
    #[serde(rename = "float")]
    Float,
    #[serde(rename = "base64")]
    Base64,
}

impl Default for EncodingFormat {
    fn default() -> EncodingFormat {
        Self::Float
    }
}

