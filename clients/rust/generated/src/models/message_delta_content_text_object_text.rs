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

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct MessageDeltaContentTextObjectText {
    /// The data that makes up the text.
    #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
    pub value: Option<String>,
    #[serde(rename = "annotations", skip_serializing_if = "Option::is_none")]
    pub annotations: Option<Vec<models::MessageDeltaContentTextObjectTextAnnotationsInner>>,
}

impl MessageDeltaContentTextObjectText {
    pub fn new() -> MessageDeltaContentTextObjectText {
        MessageDeltaContentTextObjectText {
            value: None,
            annotations: None,
        }
    }
}

