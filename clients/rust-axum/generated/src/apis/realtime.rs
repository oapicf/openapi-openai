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
pub enum CreateRealtimeSessionResponse {
    /// Session created successfully.
    Status200_SessionCreatedSuccessfully
    (models::RealtimeSessionCreateResponse)
}




/// Realtime
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Realtime<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. .
    ///
    /// CreateRealtimeSession - POST /v1/realtime/sessions
    async fn create_realtime_session(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::RealtimeSessionCreateRequest,
    ) -> Result<CreateRealtimeSessionResponse, E>;
}
