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
pub enum UsageAudioSpeechesResponse {
    /// Usage data retrieved successfully.
    Status200_UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UsageAudioTranscriptionsResponse {
    /// Usage data retrieved successfully.
    Status200_UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UsageCodeInterpreterSessionsResponse {
    /// Usage data retrieved successfully.
    Status200_UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UsageCompletionsResponse {
    /// Usage data retrieved successfully.
    Status200_UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UsageCostsResponse {
    /// Costs data retrieved successfully.
    Status200_CostsDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UsageEmbeddingsResponse {
    /// Usage data retrieved successfully.
    Status200_UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UsageImagesResponse {
    /// Usage data retrieved successfully.
    Status200_UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UsageModerationsResponse {
    /// Usage data retrieved successfully.
    Status200_UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum UsageVectorStoresResponse {
    /// Usage data retrieved successfully.
    Status200_UsageDataRetrievedSuccessfully
    (models::UsageResponse)
}




/// Usage
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Usage<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Get audio speeches usage details for the organization..
    ///
    /// UsageAudioSpeeches - GET /v1/organization/usage/audio_speeches
    async fn usage_audio_speeches(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::UsageAudioSpeechesQueryParams,
    ) -> Result<UsageAudioSpeechesResponse, E>;

    /// Get audio transcriptions usage details for the organization..
    ///
    /// UsageAudioTranscriptions - GET /v1/organization/usage/audio_transcriptions
    async fn usage_audio_transcriptions(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::UsageAudioTranscriptionsQueryParams,
    ) -> Result<UsageAudioTranscriptionsResponse, E>;

    /// Get code interpreter sessions usage details for the organization..
    ///
    /// UsageCodeInterpreterSessions - GET /v1/organization/usage/code_interpreter_sessions
    async fn usage_code_interpreter_sessions(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::UsageCodeInterpreterSessionsQueryParams,
    ) -> Result<UsageCodeInterpreterSessionsResponse, E>;

    /// Get completions usage details for the organization..
    ///
    /// UsageCompletions - GET /v1/organization/usage/completions
    async fn usage_completions(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::UsageCompletionsQueryParams,
    ) -> Result<UsageCompletionsResponse, E>;

    /// Get costs details for the organization..
    ///
    /// UsageCosts - GET /v1/organization/costs
    async fn usage_costs(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::UsageCostsQueryParams,
    ) -> Result<UsageCostsResponse, E>;

    /// Get embeddings usage details for the organization..
    ///
    /// UsageEmbeddings - GET /v1/organization/usage/embeddings
    async fn usage_embeddings(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::UsageEmbeddingsQueryParams,
    ) -> Result<UsageEmbeddingsResponse, E>;

    /// Get images usage details for the organization..
    ///
    /// UsageImages - GET /v1/organization/usage/images
    async fn usage_images(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::UsageImagesQueryParams,
    ) -> Result<UsageImagesResponse, E>;

    /// Get moderations usage details for the organization..
    ///
    /// UsageModerations - GET /v1/organization/usage/moderations
    async fn usage_moderations(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::UsageModerationsQueryParams,
    ) -> Result<UsageModerationsResponse, E>;

    /// Get vector stores usage details for the organization..
    ///
    /// UsageVectorStores - GET /v1/organization/usage/vector_stores
    async fn usage_vector_stores(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::UsageVectorStoresQueryParams,
    ) -> Result<UsageVectorStoresResponse, E>;
}
