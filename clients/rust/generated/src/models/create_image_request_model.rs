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

/// CreateImageRequestModel : The model to use for image generation.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateImageRequestModel {
}

impl CreateImageRequestModel {
    /// The model to use for image generation.
    pub fn new() -> CreateImageRequestModel {
        CreateImageRequestModel {
        }
    }
}

