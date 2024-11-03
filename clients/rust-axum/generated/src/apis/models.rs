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
pub enum DeleteModelResponse {
    /// OK
    Status200_OK
    (models::DeleteModelResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListModelsResponse {
    /// OK
    Status200_OK
    (models::ListModelsResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RetrieveModelResponse {
    /// OK
    Status200_OK
    (models::Model)
}


/// Models
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Models {
    /// Delete a fine-tuned model. You must have the Owner role in your organization to delete a model..
    ///
    /// DeleteModel - DELETE /v1/models/{model}
    async fn delete_model(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DeleteModelPathParams,
    ) -> Result<DeleteModelResponse, String>;

    /// Lists the currently available models, and provides basic information about each one such as the owner and availability..
    ///
    /// ListModels - GET /v1/models
    async fn list_models(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
    ) -> Result<ListModelsResponse, String>;

    /// Retrieves a model instance, providing basic information about the model such as the owner and permissioning..
    ///
    /// RetrieveModel - GET /v1/models/{model}
    async fn retrieve_model(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::RetrieveModelPathParams,
    ) -> Result<RetrieveModelResponse, String>;
}
