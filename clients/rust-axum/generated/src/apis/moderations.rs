use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Host};
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
pub trait Moderations<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). .
    ///
    /// CreateModeration - POST /v1/moderations
    async fn create_moderation(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::CreateModerationRequest,
    ) -> Result<CreateModerationResponse, E>;
}
