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

/// MessageObjectIncompleteDetails : On an incomplete message, details about why the message is incomplete.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct MessageObjectIncompleteDetails {
    /// The reason the message is incomplete.
    #[serde(rename = "reason")]
    pub reason: Reason,
}

impl MessageObjectIncompleteDetails {
    /// On an incomplete message, details about why the message is incomplete.
    pub fn new(reason: Reason) -> MessageObjectIncompleteDetails {
        MessageObjectIncompleteDetails {
            reason,
        }
    }
}
/// The reason the message is incomplete.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Reason {
    #[serde(rename = "content_filter")]
    ContentFilter,
    #[serde(rename = "max_tokens")]
    MaxTokens,
    #[serde(rename = "run_cancelled")]
    RunCancelled,
    #[serde(rename = "run_expired")]
    RunExpired,
    #[serde(rename = "run_failed")]
    RunFailed,
}

impl Default for Reason {
    fn default() -> Reason {
        Self::ContentFilter
    }
}

