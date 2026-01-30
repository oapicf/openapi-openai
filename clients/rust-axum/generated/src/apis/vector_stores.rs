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
pub enum CancelVectorStoreFileBatchResponse {
    /// OK
    Status200_OK
    (models::VectorStoreFileBatchObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateVectorStoreResponse {
    /// OK
    Status200_OK
    (models::VectorStoreObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateVectorStoreFileResponse {
    /// OK
    Status200_OK
    (models::VectorStoreFileObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum CreateVectorStoreFileBatchResponse {
    /// OK
    Status200_OK
    (models::VectorStoreFileBatchObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeleteVectorStoreResponse {
    /// OK
    Status200_OK
    (models::DeleteVectorStoreResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum DeleteVectorStoreFileResponse {
    /// OK
    Status200_OK
    (models::DeleteVectorStoreFileResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetVectorStoreResponse {
    /// OK
    Status200_OK
    (models::VectorStoreObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetVectorStoreFileResponse {
    /// OK
    Status200_OK
    (models::VectorStoreFileObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetVectorStoreFileBatchResponse {
    /// OK
    Status200_OK
    (models::VectorStoreFileBatchObject)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListFilesInVectorStoreBatchResponse {
    /// OK
    Status200_OK
    (models::ListVectorStoreFilesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListVectorStoreFilesResponse {
    /// OK
    Status200_OK
    (models::ListVectorStoreFilesResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ListVectorStoresResponse {
    /// OK
    Status200_OK
    (models::ListVectorStoresResponse)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ModifyVectorStoreResponse {
    /// OK
    Status200_OK
    (models::VectorStoreObject)
}




/// VectorStores
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait VectorStores<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible..
    ///
    /// CancelVectorStoreFileBatch - POST /v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel
    async fn cancel_vector_store_file_batch(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::CancelVectorStoreFileBatchPathParams,
    ) -> Result<CancelVectorStoreFileBatchResponse, E>;

    /// Create a vector store..
    ///
    /// CreateVectorStore - POST /v1/vector_stores
    async fn create_vector_store(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
            body: &models::CreateVectorStoreRequest,
    ) -> Result<CreateVectorStoreResponse, E>;

    /// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object)..
    ///
    /// CreateVectorStoreFile - POST /v1/vector_stores/{vector_store_id}/files
    async fn create_vector_store_file(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::CreateVectorStoreFilePathParams,
            body: &models::CreateVectorStoreFileRequest,
    ) -> Result<CreateVectorStoreFileResponse, E>;

    /// Create a vector store file batch..
    ///
    /// CreateVectorStoreFileBatch - POST /v1/vector_stores/{vector_store_id}/file_batches
    async fn create_vector_store_file_batch(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::CreateVectorStoreFileBatchPathParams,
            body: &models::CreateVectorStoreFileBatchRequest,
    ) -> Result<CreateVectorStoreFileBatchResponse, E>;

    /// Delete a vector store..
    ///
    /// DeleteVectorStore - DELETE /v1/vector_stores/{vector_store_id}
    async fn delete_vector_store(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::DeleteVectorStorePathParams,
    ) -> Result<DeleteVectorStoreResponse, E>;

    /// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint..
    ///
    /// DeleteVectorStoreFile - DELETE /v1/vector_stores/{vector_store_id}/files/{file_id}
    async fn delete_vector_store_file(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::DeleteVectorStoreFilePathParams,
    ) -> Result<DeleteVectorStoreFileResponse, E>;

    /// Retrieves a vector store..
    ///
    /// GetVectorStore - GET /v1/vector_stores/{vector_store_id}
    async fn get_vector_store(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetVectorStorePathParams,
    ) -> Result<GetVectorStoreResponse, E>;

    /// Retrieves a vector store file..
    ///
    /// GetVectorStoreFile - GET /v1/vector_stores/{vector_store_id}/files/{file_id}
    async fn get_vector_store_file(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetVectorStoreFilePathParams,
    ) -> Result<GetVectorStoreFileResponse, E>;

    /// Retrieves a vector store file batch..
    ///
    /// GetVectorStoreFileBatch - GET /v1/vector_stores/{vector_store_id}/file_batches/{batch_id}
    async fn get_vector_store_file_batch(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::GetVectorStoreFileBatchPathParams,
    ) -> Result<GetVectorStoreFileBatchResponse, E>;

    /// Returns a list of vector store files in a batch..
    ///
    /// ListFilesInVectorStoreBatch - GET /v1/vector_stores/{vector_store_id}/file_batches/{batch_id}/files
    async fn list_files_in_vector_store_batch(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ListFilesInVectorStoreBatchPathParams,
      query_params: &models::ListFilesInVectorStoreBatchQueryParams,
    ) -> Result<ListFilesInVectorStoreBatchResponse, E>;

    /// Returns a list of vector store files..
    ///
    /// ListVectorStoreFiles - GET /v1/vector_stores/{vector_store_id}/files
    async fn list_vector_store_files(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ListVectorStoreFilesPathParams,
      query_params: &models::ListVectorStoreFilesQueryParams,
    ) -> Result<ListVectorStoreFilesResponse, E>;

    /// Returns a list of vector stores..
    ///
    /// ListVectorStores - GET /v1/vector_stores
    async fn list_vector_stores(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ListVectorStoresQueryParams,
    ) -> Result<ListVectorStoresResponse, E>;

    /// Modifies a vector store..
    ///
    /// ModifyVectorStore - POST /v1/vector_stores/{vector_store_id}
    async fn modify_vector_store(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      path_params: &models::ModifyVectorStorePathParams,
            body: &models::UpdateVectorStoreRequest,
    ) -> Result<ModifyVectorStoreResponse, E>;
}
