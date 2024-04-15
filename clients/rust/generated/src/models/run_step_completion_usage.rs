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

/// RunStepCompletionUsage : Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct RunStepCompletionUsage {
    /// Number of completion tokens used over the course of the run step.
    #[serde(rename = "completion_tokens")]
    pub completion_tokens: i32,
    /// Number of prompt tokens used over the course of the run step.
    #[serde(rename = "prompt_tokens")]
    pub prompt_tokens: i32,
    /// Total number of tokens used (prompt + completion).
    #[serde(rename = "total_tokens")]
    pub total_tokens: i32,
}

impl RunStepCompletionUsage {
    /// Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
    pub fn new(completion_tokens: i32, prompt_tokens: i32, total_tokens: i32) -> RunStepCompletionUsage {
        RunStepCompletionUsage {
            completion_tokens,
            prompt_tokens,
            total_tokens,
        }
    }
}
