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
pub struct MessageContentTextObjectText {
    /// The data that makes up the text.
    #[serde(rename = "value")]
    pub value: String,
    #[serde(rename = "annotations")]
    pub annotations: Vec<models::MessageContentTextObjectTextAnnotationsInner>,
}

impl MessageContentTextObjectText {
    pub fn new(value: String, annotations: Vec<models::MessageContentTextObjectTextAnnotationsInner>) -> MessageContentTextObjectText {
        MessageContentTextObjectText {
            value,
            annotations,
        }
    }
}

