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
pub enum CancelFineTuningJobResponse {
    /// OK
    Status200_OK
    (models::FineTuningJob)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateFineTuningJobResponse {
    /// OK
    Status200_OK
    (models::FineTuningJob)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListFineTuningEventsResponse {
    /// OK
    Status200_OK
    (models::ListFineTuningJobEventsResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListFineTuningJobCheckpointsResponse {
    /// OK
    Status200_OK
    (models::ListFineTuningJobCheckpointsResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListPaginatedFineTuningJobsResponse {
    /// OK
    Status200_OK
    (models::ListPaginatedFineTuningJobsResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RetrieveFineTuningJobResponse {
    /// OK
    Status200_OK
    (models::FineTuningJob)
}




/// FineTuning
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait FineTuning<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Immediately cancel a fine-tune job. .
    ///
    /// CancelFineTuningJob - POST /v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel
    async fn cancel_fine_tuning_job(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::CancelFineTuningJobPathParams,
    ) -> Result<CancelFineTuningJobResponse, E>;

    /// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) .
    ///
    /// CreateFineTuningJob - POST /v1/fine_tuning/jobs
    async fn create_fine_tuning_job(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::CreateFineTuningJobRequest,
    ) -> Result<CreateFineTuningJobResponse, E>;

    /// Get status updates for a fine-tuning job. .
    ///
    /// ListFineTuningEvents - GET /v1/fine_tuning/jobs/{fine_tuning_job_id}/events
    async fn list_fine_tuning_events(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ListFineTuningEventsPathParams,
      query_params: &models::ListFineTuningEventsQueryParams,
    ) -> Result<ListFineTuningEventsResponse, E>;

    /// List checkpoints for a fine-tuning job. .
    ///
    /// ListFineTuningJobCheckpoints - GET /v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints
    async fn list_fine_tuning_job_checkpoints(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ListFineTuningJobCheckpointsPathParams,
      query_params: &models::ListFineTuningJobCheckpointsQueryParams,
    ) -> Result<ListFineTuningJobCheckpointsResponse, E>;

    /// List your organization's fine-tuning jobs .
    ///
    /// ListPaginatedFineTuningJobs - GET /v1/fine_tuning/jobs
    async fn list_paginated_fine_tuning_jobs(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ListPaginatedFineTuningJobsQueryParams,
    ) -> Result<ListPaginatedFineTuningJobsResponse, E>;

    /// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) .
    ///
    /// RetrieveFineTuningJob - GET /v1/fine_tuning/jobs/{fine_tuning_job_id}
    async fn retrieve_fine_tuning_job(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::RetrieveFineTuningJobPathParams,
    ) -> Result<RetrieveFineTuningJobResponse, E>;
}
