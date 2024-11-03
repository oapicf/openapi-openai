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
pub enum CreateChatCompletionResponse {
    /// OK
    Status200_OK
    (models::CreateChatCompletionResponse)
}


/// Chat
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Chat {
    /// Creates a model response for the given chat conversation..
    ///
    /// CreateChatCompletion - POST /v1/chat/completions
    async fn create_chat_completion(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
            body: models::CreateChatCompletionRequest,
    ) -> Result<CreateChatCompletionResponse, String>;
}
