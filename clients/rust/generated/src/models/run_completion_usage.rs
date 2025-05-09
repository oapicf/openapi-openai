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

/// RunCompletionUsage : Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct RunCompletionUsage {
    /// Number of completion tokens used over the course of the run.
    #[serde(rename = "completion_tokens")]
    pub completion_tokens: i32,
    /// Number of prompt tokens used over the course of the run.
    #[serde(rename = "prompt_tokens")]
    pub prompt_tokens: i32,
    /// Total number of tokens used (prompt + completion).
    #[serde(rename = "total_tokens")]
    pub total_tokens: i32,
}

impl RunCompletionUsage {
    /// Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
    pub fn new(completion_tokens: i32, prompt_tokens: i32, total_tokens: i32) -> RunCompletionUsage {
        RunCompletionUsage {
            completion_tokens,
            prompt_tokens,
            total_tokens,
        }
    }
}

