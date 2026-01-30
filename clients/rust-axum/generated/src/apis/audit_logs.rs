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
pub enum ListAuditLogsResponse {
    /// Audit logs listed successfully.
    Status200_AuditLogsListedSuccessfully
    (models::ListAuditLogsResponse)
}




/// AuditLogs
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait AuditLogs<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// List user actions and configuration changes within this organization..
    ///
    /// ListAuditLogs - GET /v1/organization/audit_logs
    async fn list_audit_logs(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ListAuditLogsQueryParams,
    ) -> Result<ListAuditLogsResponse, E>;
}
