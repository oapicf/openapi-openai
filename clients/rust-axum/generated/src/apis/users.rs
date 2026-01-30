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
pub enum DeleteUserResponse {
    /// User deleted successfully.
    Status200_UserDeletedSuccessfully
    (models::UserDeleteResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListUsersResponse {
    /// Users listed successfully.
    Status200_UsersListedSuccessfully
    (models::UserListResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ModifyUserResponse {
    /// User role updated successfully.
    Status200_UserRoleUpdatedSuccessfully
    (models::User)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RetrieveUserResponse {
    /// User retrieved successfully.
    Status200_UserRetrievedSuccessfully
    (models::User)
}




/// Users
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Users<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Deletes a user from the organization..
    ///
    /// DeleteUser - DELETE /v1/organization/users/{user_id}
    async fn delete_user(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::DeleteUserPathParams,
    ) -> Result<DeleteUserResponse, E>;

    /// Lists all of the users in the organization..
    ///
    /// ListUsers - GET /v1/organization/users
    async fn list_users(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ListUsersQueryParams,
    ) -> Result<ListUsersResponse, E>;

    /// Modifies a user's role in the organization..
    ///
    /// ModifyUser - POST /v1/organization/users/{user_id}
    async fn modify_user(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ModifyUserPathParams,
            body: &models::UserRoleUpdateRequest,
    ) -> Result<ModifyUserResponse, E>;

    /// Retrieves a user by their identifier..
    ///
    /// RetrieveUser - GET /v1/organization/users/{user_id}
    async fn retrieve_user(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::RetrieveUserPathParams,
    ) -> Result<RetrieveUserResponse, E>;
}
