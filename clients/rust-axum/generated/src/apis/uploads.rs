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
pub enum AddUploadPartResponse {
    /// OK
    Status200_OK
    (models::UploadPart)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CancelUploadResponse {
    /// OK
    Status200_OK
    (models::Upload)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CompleteUploadResponse {
    /// OK
    Status200_OK
    (models::Upload)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateUploadResponse {
    /// OK
    Status200_OK
    (models::Upload)
}




/// Uploads
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Uploads<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Adds a [Part](/docs/api-reference/uploads/part-object) to an [Upload](/docs/api-reference/uploads/object) object. A Part represents a chunk of bytes from the file you are trying to upload.   Each Part can be at most 64 MB, and you can add Parts until you hit the Upload maximum of 8 GB.  It is possible to add multiple Parts in parallel. You can decide the intended order of the Parts when you [complete the Upload](/docs/api-reference/uploads/complete). .
    ///
    /// AddUploadPart - POST /v1/uploads/{upload_id}/parts
    async fn add_upload_part(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::AddUploadPartPathParams,
    body: Multipart,
    ) -> Result<AddUploadPartResponse, E>;

    /// Cancels the Upload. No Parts may be added after an Upload is cancelled. .
    ///
    /// CancelUpload - POST /v1/uploads/{upload_id}/cancel
    async fn cancel_upload(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::CancelUploadPathParams,
    ) -> Result<CancelUploadResponse, E>;

    /// Completes the [Upload](/docs/api-reference/uploads/object).   Within the returned Upload object, there is a nested [File](/docs/api-reference/files/object) object that is ready to use in the rest of the platform.  You can specify the order of the Parts by passing in an ordered list of the Part IDs.  The number of bytes uploaded upon completion must match the number of bytes initially specified when creating the Upload object. No Parts may be added after an Upload is completed. .
    ///
    /// CompleteUpload - POST /v1/uploads/{upload_id}/complete
    async fn complete_upload(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::CompleteUploadPathParams,
            body: &models::CompleteUploadRequest,
    ) -> Result<CompleteUploadResponse, E>;

    /// Creates an intermediate [Upload](/docs/api-reference/uploads/object) object that you can add [Parts](/docs/api-reference/uploads/part-object) to. Currently, an Upload can accept at most 8 GB in total and expires after an hour after you create it.  Once you complete the Upload, we will create a [File](/docs/api-reference/files/object) object that contains all the parts you uploaded. This File is usable in the rest of our platform as a regular File object.  For certain `purpose`s, the correct `mime_type` must be specified. Please refer to documentation for the supported MIME types for your use case: - [Assistants](/docs/assistants/tools/file-search#supported-files)  For guidance on the proper filename extensions for each purpose, please follow the documentation on [creating a File](/docs/api-reference/files/create). .
    ///
    /// CreateUpload - POST /v1/uploads
    async fn create_upload(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::CreateUploadRequest,
    ) -> Result<CreateUploadResponse, E>;
}
