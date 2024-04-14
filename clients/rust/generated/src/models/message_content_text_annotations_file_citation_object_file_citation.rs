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

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct MessageContentTextAnnotationsFileCitationObjectFileCitation {
    /// The ID of the specific File the citation is from.
    #[serde(rename = "file_id")]
    pub file_id: String,
    /// The specific quote in the file.
    #[serde(rename = "quote")]
    pub quote: String,
}

impl MessageContentTextAnnotationsFileCitationObjectFileCitation {
    pub fn new(file_id: String, quote: String) -> MessageContentTextAnnotationsFileCitationObjectFileCitation {
        MessageContentTextAnnotationsFileCitationObjectFileCitation {
            file_id,
            quote,
        }
    }
}

