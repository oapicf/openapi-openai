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

/// CreateSpeechRequestModel : One of the available [TTS models](/docs/models/tts): `tts-1` or `tts-1-hd` 
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateSpeechRequestModel {
}

impl CreateSpeechRequestModel {
    /// One of the available [TTS models](/docs/models/tts): `tts-1` or `tts-1-hd` 
    pub fn new() -> CreateSpeechRequestModel {
        CreateSpeechRequestModel {
        }
    }
}

