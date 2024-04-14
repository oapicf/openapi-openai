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

/// CreateTranscriptionResponseVerboseJson : Represents a verbose json transcription response returned by model, based on the provided input.
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateTranscriptionResponseVerboseJson {
    /// The language of the input audio.
    #[serde(rename = "language")]
    pub language: String,
    /// The duration of the input audio.
    #[serde(rename = "duration")]
    pub duration: String,
    /// The transcribed text.
    #[serde(rename = "text")]
    pub text: String,
    /// Extracted words and their corresponding timestamps.
    #[serde(rename = "words", skip_serializing_if = "Option::is_none")]
    pub words: Option<Vec<models::TranscriptionWord>>,
    /// Segments of the transcribed text and their corresponding details.
    #[serde(rename = "segments", skip_serializing_if = "Option::is_none")]
    pub segments: Option<Vec<models::TranscriptionSegment>>,
}

impl CreateTranscriptionResponseVerboseJson {
    /// Represents a verbose json transcription response returned by model, based on the provided input.
    pub fn new(language: String, duration: String, text: String) -> CreateTranscriptionResponseVerboseJson {
        CreateTranscriptionResponseVerboseJson {
            language,
            duration,
            text,
            words: None,
            segments: None,
        }
    }
}

