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
pub enum CancelBatchResponse {
    /// Batch is cancelling. Returns the cancelling batch's details.
    Status200_BatchIsCancelling
    (models::Batch)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateBatchResponse {
    /// Batch created successfully.
    Status200_BatchCreatedSuccessfully
    (models::Batch)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListBatchesResponse {
    /// Batch listed successfully.
    Status200_BatchListedSuccessfully
    (models::ListBatchesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RetrieveBatchResponse {
    /// Batch retrieved successfully.
    Status200_BatchRetrievedSuccessfully
    (models::Batch)
}




/// Batch
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Batch<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file..
    ///
    /// CancelBatch - POST /v1/batches/{batch_id}/cancel
    async fn cancel_batch(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::CancelBatchPathParams,
    ) -> Result<CancelBatchResponse, E>;

    /// Creates and executes a batch from an uploaded file of requests.
    ///
    /// CreateBatch - POST /v1/batches
    async fn create_batch(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::CreateBatchRequest,
    ) -> Result<CreateBatchResponse, E>;

    /// List your organization's batches..
    ///
    /// ListBatches - GET /v1/batches
    async fn list_batches(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ListBatchesQueryParams,
    ) -> Result<ListBatchesResponse, E>;

    /// Retrieves a batch..
    ///
    /// RetrieveBatch - GET /v1/batches/{batch_id}
    async fn retrieve_batch(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::RetrieveBatchPathParams,
    ) -> Result<RetrieveBatchResponse, E>;
}
