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

#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(untagged)]
pub enum CreateTranslation200Response {
    CreateTranslationResponseJson(Box<models::CreateTranslationResponseJson>),
    CreateTranslationResponseVerboseJson(Box<models::CreateTranslationResponseVerboseJson>),
}

impl Default for CreateTranslation200Response {
    fn default() -> Self {
        Self::CreateTranslationResponseJson(Default::default())
    }
}

