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
pub enum CreateFileResponse {
    /// OK
    Status200_OK
    (models::OpenAiFile)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeleteFileResponse {
    /// OK
    Status200_OK
    (models::DeleteFileResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DownloadFileResponse {
    /// OK
    Status200_OK
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListFilesResponse {
    /// OK
    Status200_OK
    (models::ListFilesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RetrieveFileResponse {
    /// OK
    Status200_OK
    (models::OpenAiFile)
}




/// Files
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Files<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports `.jsonl` files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports `.jsonl` files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. .
    ///
    /// CreateFile - POST /v1/files
    async fn create_file(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
    body: Multipart,
    ) -> Result<CreateFileResponse, E>;

    /// Delete a file..
    ///
    /// DeleteFile - DELETE /v1/files/{file_id}
    async fn delete_file(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::DeleteFilePathParams,
    ) -> Result<DeleteFileResponse, E>;

    /// Returns the contents of the specified file..
    ///
    /// DownloadFile - GET /v1/files/{file_id}/content
    async fn download_file(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::DownloadFilePathParams,
    ) -> Result<DownloadFileResponse, E>;

    /// Returns a list of files..
    ///
    /// ListFiles - GET /v1/files
    async fn list_files(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ListFilesQueryParams,
    ) -> Result<ListFilesResponse, E>;

    /// Returns information about a specific file..
    ///
    /// RetrieveFile - GET /v1/files/{file_id}
    async fn retrieve_file(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::RetrieveFilePathParams,
    ) -> Result<RetrieveFileResponse, E>;
}
