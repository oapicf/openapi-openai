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

#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(untagged)]
pub enum RunStepStreamEvent {
    RunStepStreamEventOneOf(Box<models::RunStepStreamEventOneOf>),
    RunStepStreamEventOneOf1(Box<models::RunStepStreamEventOneOf1>),
    RunStepStreamEventOneOf2(Box<models::RunStepStreamEventOneOf2>),
    RunStepStreamEventOneOf3(Box<models::RunStepStreamEventOneOf3>),
    RunStepStreamEventOneOf4(Box<models::RunStepStreamEventOneOf4>),
    RunStepStreamEventOneOf5(Box<models::RunStepStreamEventOneOf5>),
    RunStepStreamEventOneOf6(Box<models::RunStepStreamEventOneOf6>),
}

impl Default for RunStepStreamEvent {
    fn default() -> Self {
        Self::RunStepStreamEventOneOf(Default::default())
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Event {
    #[serde(rename = "thread.run.step.expired")]
    ThreadPeriodRunPeriodStepPeriodExpired,
}

impl Default for Event {
    fn default() -> Event {
        Self::ThreadPeriodRunPeriodStepPeriodExpired
    }
}
