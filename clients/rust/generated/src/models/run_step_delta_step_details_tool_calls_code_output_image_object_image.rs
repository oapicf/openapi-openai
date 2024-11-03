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
pub struct RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage {
    /// The [file](/docs/api-reference/files) ID of the image.
    #[serde(rename = "file_id", skip_serializing_if = "Option::is_none")]
    pub file_id: Option<String>,
}

impl RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage {
    pub fn new() -> RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage {
        RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage {
            file_id: None,
        }
    }
}

