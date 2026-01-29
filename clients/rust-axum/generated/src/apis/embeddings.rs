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
pub enum CreateEmbeddingResponse {
    /// OK
    Status200_OK
    (models::CreateEmbeddingResponse)
}




/// Embeddings
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Embeddings<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Creates an embedding vector representing the input text..
    ///
    /// CreateEmbedding - POST /v1/embeddings
    async fn create_embedding(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::CreateEmbeddingRequest,
    ) -> Result<CreateEmbeddingResponse, E>;
}
