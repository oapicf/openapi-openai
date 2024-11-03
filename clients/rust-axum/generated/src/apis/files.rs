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
pub trait Files {
    /// Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. .
    ///
    /// CreateFile - POST /v1/files
    async fn create_file(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
        body: Multipart,
    ) -> Result<CreateFileResponse, String>;

    /// Delete a file..
    ///
    /// DeleteFile - DELETE /v1/files/{file_id}
    async fn delete_file(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DeleteFilePathParams,
    ) -> Result<DeleteFileResponse, String>;

    /// Returns the contents of the specified file..
    ///
    /// DownloadFile - GET /v1/files/{file_id}/content
    async fn download_file(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::DownloadFilePathParams,
    ) -> Result<DownloadFileResponse, String>;

    /// Returns a list of files that belong to the user's organization..
    ///
    /// ListFiles - GET /v1/files
    async fn list_files(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::ListFilesQueryParams,
    ) -> Result<ListFilesResponse, String>;

    /// Returns information about a specific file..
    ///
    /// RetrieveFile - GET /v1/files/{file_id}
    async fn retrieve_file(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::RetrieveFilePathParams,
    ) -> Result<RetrieveFileResponse, String>;
}
