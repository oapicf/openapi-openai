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

/// ErrorEvent : Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ErrorEvent {
    #[serde(rename = "event")]
    pub event: Event,
    #[serde(rename = "data")]
    pub data: Box<models::Error>,
}

impl ErrorEvent {
    /// Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.
    pub fn new(event: Event, data: models::Error) -> ErrorEvent {
        ErrorEvent {
            event,
            data: Box::new(data),
        }
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Event {
    #[serde(rename = "error")]
    Error,
}

impl Default for Event {
    fn default() -> Event {
        Self::Error
    }
}

