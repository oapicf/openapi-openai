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

/// RunStepDeltaStepDetailsMessageCreationObject : Details of the message creation by the run step.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct RunStepDeltaStepDetailsMessageCreationObject {
    /// Always `message_creation`.
    #[serde(rename = "type")]
    pub r#type: Type,
    #[serde(rename = "message_creation", skip_serializing_if = "Option::is_none")]
    pub message_creation: Option<Box<models::RunStepDeltaStepDetailsMessageCreationObjectMessageCreation>>,
}

impl RunStepDeltaStepDetailsMessageCreationObject {
    /// Details of the message creation by the run step.
    pub fn new(r#type: Type) -> RunStepDeltaStepDetailsMessageCreationObject {
        RunStepDeltaStepDetailsMessageCreationObject {
            r#type,
            message_creation: None,
        }
    }
}
/// Always `message_creation`.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Type {
    #[serde(rename = "message_creation")]
    MessageCreation,
}

impl Default for Type {
    fn default() -> Type {
        Self::MessageCreation
    }
}

