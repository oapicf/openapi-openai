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
pub struct RunStepDetailsToolCallsCodeOutputImageObject {
    /// Always `image`.
    #[serde(rename = "type")]
    pub r#type: Type,
    #[serde(rename = "image")]
    pub image: Box<models::RunStepDetailsToolCallsCodeOutputImageObjectImage>,
}

impl RunStepDetailsToolCallsCodeOutputImageObject {
    pub fn new(r#type: Type, image: models::RunStepDetailsToolCallsCodeOutputImageObjectImage) -> RunStepDetailsToolCallsCodeOutputImageObject {
        RunStepDetailsToolCallsCodeOutputImageObject {
            r#type,
            image: Box::new(image),
        }
    }
}
/// Always `image`.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Type {
    #[serde(rename = "image")]
    Image,
}

impl Default for Type {
    fn default() -> Type {
        Self::Image
    }
}

