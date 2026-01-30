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
pub enum DeleteInviteResponse {
    /// Invite deleted successfully.
    Status200_InviteDeletedSuccessfully
    (models::InviteDeleteResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum InviteUserResponse {
    /// User invited successfully.
    Status200_UserInvitedSuccessfully
    (models::Invite)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListInvitesResponse {
    /// Invites listed successfully.
    Status200_InvitesListedSuccessfully
    (models::InviteListResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RetrieveInviteResponse {
    /// Invite retrieved successfully.
    Status200_InviteRetrievedSuccessfully
    (models::Invite)
}




/// Invites
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Invites<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Delete an invite. If the invite has already been accepted, it cannot be deleted..
    ///
    /// DeleteInvite - DELETE /v1/organization/invites/{invite_id}
    async fn delete_invite(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::DeleteInvitePathParams,
    ) -> Result<DeleteInviteResponse, E>;

    /// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization..
    ///
    /// InviteUser - POST /v1/organization/invites
    async fn invite_user(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::InviteRequest,
    ) -> Result<InviteUserResponse, E>;

    /// Returns a list of invites in the organization..
    ///
    /// ListInvites - GET /v1/organization/invites
    async fn list_invites(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ListInvitesQueryParams,
    ) -> Result<ListInvitesResponse, E>;

    /// Retrieves an invite..
    ///
    /// RetrieveInvite - GET /v1/organization/invites/{invite_id}
    async fn retrieve_invite(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::RetrieveInvitePathParams,
    ) -> Result<RetrieveInviteResponse, E>;
}
