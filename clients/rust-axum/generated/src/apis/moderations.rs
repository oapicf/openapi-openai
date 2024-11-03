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
pub enum CreateModerationResponse {
    /// OK
    Status200_OK
    (models::CreateModerationResponse)
}


/// Moderations
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Moderations {
    /// Classifies if text is potentially harmful..
    ///
    /// CreateModeration - POST /v1/moderations
    async fn create_moderation(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
            body: models::CreateModerationRequest,
    ) -> Result<CreateModerationResponse, String>;
}
