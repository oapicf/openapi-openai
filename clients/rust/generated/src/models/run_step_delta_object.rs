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

/// RunStepDeltaObject : Represents a run step delta i.e. any changed fields on a run step during streaming. 
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct RunStepDeltaObject {
    /// The identifier of the run step, which can be referenced in API endpoints.
    #[serde(rename = "id")]
    pub id: String,
    /// The object type, which is always `thread.run.step.delta`.
    #[serde(rename = "object")]
    pub object: Object,
    #[serde(rename = "delta")]
    pub delta: Box<models::RunStepDeltaObjectDelta>,
}

impl RunStepDeltaObject {
    /// Represents a run step delta i.e. any changed fields on a run step during streaming. 
    pub fn new(id: String, object: Object, delta: models::RunStepDeltaObjectDelta) -> RunStepDeltaObject {
        RunStepDeltaObject {
            id,
            object,
            delta: Box::new(delta),
        }
    }
}
/// The object type, which is always `thread.run.step.delta`.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Object {
    #[serde(rename = "thread.run.step.delta")]
    ThreadPeriodRunPeriodStepPeriodDelta,
}

impl Default for Object {
    fn default() -> Object {
        Self::ThreadPeriodRunPeriodStepPeriodDelta
    }
}
