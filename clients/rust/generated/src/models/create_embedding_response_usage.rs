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

/// CreateEmbeddingResponseUsage : The usage information for the request.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateEmbeddingResponseUsage {
    /// The number of tokens used by the prompt.
    #[serde(rename = "prompt_tokens")]
    pub prompt_tokens: i32,
    /// The total number of tokens used by the request.
    #[serde(rename = "total_tokens")]
    pub total_tokens: i32,
}

impl CreateEmbeddingResponseUsage {
    /// The usage information for the request.
    pub fn new(prompt_tokens: i32, total_tokens: i32) -> CreateEmbeddingResponseUsage {
        CreateEmbeddingResponseUsage {
            prompt_tokens,
            total_tokens,
        }
    }
}

