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
pub enum AdminApiKeysCreateResponse {
    /// The newly created admin API key.
    Status200_TheNewlyCreatedAdminAPIKey
    (models::AdminApiKey)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdminApiKeysDeleteResponse {
    /// Confirmation that the API key was deleted.
    Status200_ConfirmationThatTheAPIKeyWasDeleted
    (models::AdminApiKeysDelete200Response)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdminApiKeysGetResponse {
    /// Details of the requested API key.
    Status200_DetailsOfTheRequestedAPIKey
    (models::AdminApiKey)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdminApiKeysListResponse {
    /// A list of organization API keys.
    Status200_AListOfOrganizationAPIKeys
    (models::ApiKeyList)
}




/// Default
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Default<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Create an organization admin API key.
    ///
    /// AdminApiKeysCreate - POST /v1/organization/admin_api_keys
    async fn admin_api_keys_create(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::AdminApiKeysCreateRequest,
    ) -> Result<AdminApiKeysCreateResponse, E>;

    /// Delete an organization admin API key.
    ///
    /// AdminApiKeysDelete - DELETE /v1/organization/admin_api_keys/{key_id}
    async fn admin_api_keys_delete(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::AdminApiKeysDeletePathParams,
    ) -> Result<AdminApiKeysDeleteResponse, E>;

    /// Retrieve a single organization API key.
    ///
    /// AdminApiKeysGet - GET /v1/organization/admin_api_keys/{key_id}
    async fn admin_api_keys_get(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::AdminApiKeysGetPathParams,
    ) -> Result<AdminApiKeysGetResponse, E>;

    /// List organization API keys.
    ///
    /// AdminApiKeysList - GET /v1/organization/admin_api_keys
    async fn admin_api_keys_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::AdminApiKeysListQueryParams,
    ) -> Result<AdminApiKeysListResponse, E>;
}
