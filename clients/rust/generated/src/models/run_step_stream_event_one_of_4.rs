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

/// RunStepStreamEventOneOf4 : Occurs when a [run step](/docs/api-reference/runs/step-object) fails.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct RunStepStreamEventOneOf4 {
    #[serde(rename = "event")]
    pub event: Event,
    #[serde(rename = "data")]
    pub data: Box<models::RunStepObject>,
}

impl RunStepStreamEventOneOf4 {
    /// Occurs when a [run step](/docs/api-reference/runs/step-object) fails.
    pub fn new(event: Event, data: models::RunStepObject) -> RunStepStreamEventOneOf4 {
        RunStepStreamEventOneOf4 {
            event,
            data: Box::new(data),
        }
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Event {
    #[serde(rename = "thread.run.step.failed")]
    ThreadPeriodRunPeriodStepPeriodFailed,
}

impl Default for Event {
    fn default() -> Event {
        Self::ThreadPeriodRunPeriodStepPeriodFailed
    }
}

