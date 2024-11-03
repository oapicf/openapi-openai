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

/// RunStreamEventOneOf8 : Occurs when a [run](/docs/api-reference/runs/object) expires.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct RunStreamEventOneOf8 {
    #[serde(rename = "event")]
    pub event: Event,
    #[serde(rename = "data")]
    pub data: Box<models::RunObject>,
}

impl RunStreamEventOneOf8 {
    /// Occurs when a [run](/docs/api-reference/runs/object) expires.
    pub fn new(event: Event, data: models::RunObject) -> RunStreamEventOneOf8 {
        RunStreamEventOneOf8 {
            event,
            data: Box::new(data),
        }
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Event {
    #[serde(rename = "thread.run.expired")]
    ThreadPeriodRunPeriodExpired,
}

impl Default for Event {
    fn default() -> Event {
        Self::ThreadPeriodRunPeriodExpired
    }
}

