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

/// RunStepObjectStepDetails : The details of the run step.
/// The details of the run step.
#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(untagged)]
pub enum RunStepObjectStepDetails {
    RunStepDetailsMessageCreationObject(Box<models::RunStepDetailsMessageCreationObject>),
    RunStepDetailsToolCallsObject(Box<models::RunStepDetailsToolCallsObject>),
}

impl Default for RunStepObjectStepDetails {
    fn default() -> Self {
        Self::RunStepDetailsMessageCreationObject(Default::default())
    }
}
/// Always `message_creation`.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Type {
    #[serde(rename = "message_creation")]
    MessageCreation,
    #[serde(rename = "tool_calls")]
    ToolCalls,
}

impl Default for Type {
    fn default() -> Type {
        Self::MessageCreation
    }
}

