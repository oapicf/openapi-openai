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

/// RunStepDeltaObjectDelta : The delta containing the fields that have changed on the run step.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct RunStepDeltaObjectDelta {
    #[serde(rename = "step_details", skip_serializing_if = "Option::is_none")]
    pub step_details: Option<Box<models::RunStepDeltaObjectDeltaStepDetails>>,
}

impl RunStepDeltaObjectDelta {
    /// The delta containing the fields that have changed on the run step.
    pub fn new() -> RunStepDeltaObjectDelta {
        RunStepDeltaObjectDelta {
            step_details: None,
        }
    }
}

