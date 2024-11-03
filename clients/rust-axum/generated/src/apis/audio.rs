use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateSpeechResponse {
    /// OK
    Status200_OK
    {
        body: ByteArray,
        transfer_encoding:
        Option<
        String
        >
    }
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateTranscriptionResponse {
    /// OK
    Status200_OK
    (models::CreateTranscription200Response)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateTranslationResponse {
    /// OK
    Status200_OK
    (models::CreateTranslation200Response)
}


/// Audio
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Audio {
    /// Generates audio from the input text..
    ///
    /// CreateSpeech - POST /v1/audio/speech
    async fn create_speech(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
            body: models::CreateSpeechRequest,
    ) -> Result<CreateSpeechResponse, String>;

    /// Transcribes audio into the input language..
    ///
    /// CreateTranscription - POST /v1/audio/transcriptions
    async fn create_transcription(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
        body: Multipart,
    ) -> Result<CreateTranscriptionResponse, String>;

    /// Translates audio into English..
    ///
    /// CreateTranslation - POST /v1/audio/translations
    async fn create_translation(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
        body: Multipart,
    ) -> Result<CreateTranslationResponse, String>;
}
