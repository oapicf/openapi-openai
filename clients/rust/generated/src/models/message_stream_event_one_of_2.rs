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

/// MessageStreamEventOneOf2 : Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct MessageStreamEventOneOf2 {
    #[serde(rename = "event")]
    pub event: Event,
    #[serde(rename = "data")]
    pub data: Box<models::MessageDeltaObject>,
}

impl MessageStreamEventOneOf2 {
    /// Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
    pub fn new(event: Event, data: models::MessageDeltaObject) -> MessageStreamEventOneOf2 {
        MessageStreamEventOneOf2 {
            event,
            data: Box::new(data),
        }
    }
}
/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Event {
    #[serde(rename = "thread.message.delta")]
    ThreadPeriodMessagePeriodDelta,
}

impl Default for Event {
    fn default() -> Event {
        Self::ThreadPeriodMessagePeriodDelta
    }
}

