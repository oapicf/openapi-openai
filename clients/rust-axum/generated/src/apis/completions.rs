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
pub enum CreateCompletionResponse {
    /// OK
    Status200_OK
    (models::CreateCompletionResponse)
}


/// Completions
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Completions {
    /// Creates a completion for the provided prompt and parameters..
    ///
    /// CreateCompletion - POST /v1/completions
    async fn create_completion(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
            body: models::CreateCompletionRequest,
    ) -> Result<CreateCompletionResponse, String>;
}
