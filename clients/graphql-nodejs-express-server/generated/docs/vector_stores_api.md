# vector_stores_api

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelVectorStoreFileBatch**](vector_stores_api.md#CancelVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel | Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
[**CreateVectorStore**](vector_stores_api.md#CreateVectorStore) | **POST** /vector_stores | Create a vector store.
[**CreateVectorStoreFile**](vector_stores_api.md#CreateVectorStoreFile) | **POST** /vector_stores/{vector_store_id}/files | Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
[**CreateVectorStoreFileBatch**](vector_stores_api.md#CreateVectorStoreFileBatch) | **POST** /vector_stores/{vector_store_id}/file_batches | Create a vector store file batch.
[**DeleteVectorStore**](vector_stores_api.md#DeleteVectorStore) | **DELETE** /vector_stores/{vector_store_id} | Delete a vector store.
[**DeleteVectorStoreFile**](vector_stores_api.md#DeleteVectorStoreFile) | **DELETE** /vector_stores/{vector_store_id}/files/{file_id} | Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
[**GetVectorStore**](vector_stores_api.md#GetVectorStore) | **GET** /vector_stores/{vector_store_id} | Retrieves a vector store.
[**GetVectorStoreFile**](vector_stores_api.md#GetVectorStoreFile) | **GET** /vector_stores/{vector_store_id}/files/{file_id} | Retrieves a vector store file.
[**GetVectorStoreFileBatch**](vector_stores_api.md#GetVectorStoreFileBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id} | Retrieves a vector store file batch.
[**ListFilesInVectorStoreBatch**](vector_stores_api.md#ListFilesInVectorStoreBatch) | **GET** /vector_stores/{vector_store_id}/file_batches/{batch_id}/files | Returns a list of vector store files in a batch.
[**ListVectorStoreFiles**](vector_stores_api.md#ListVectorStoreFiles) | **GET** /vector_stores/{vector_store_id}/files | Returns a list of vector store files.
[**ListVectorStores**](vector_stores_api.md#ListVectorStores) | **GET** /vector_stores | Returns a list of vector stores.
[**ModifyVectorStore**](vector_stores_api.md#ModifyVectorStore) | **POST** /vector_stores/{vector_store_id} | Modifies a vector store.


<a name="CancelVectorStoreFileBatch"></a>
# **CancelVectorStoreFileBatch**
> VectorStoreFileBatchObject CancelVectorStoreFileBatch(vectorStoreId, batchId)

Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
<a name="CreateVectorStore"></a>
# **CreateVectorStore**
> VectorStoreObject CreateVectorStore(createVectorStoreRequest)

Create a vector store.
<a name="CreateVectorStoreFile"></a>
# **CreateVectorStoreFile**
> VectorStoreFileObject CreateVectorStoreFile(vectorStoreId, createVectorStoreFileRequest)

Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
<a name="CreateVectorStoreFileBatch"></a>
# **CreateVectorStoreFileBatch**
> VectorStoreFileBatchObject CreateVectorStoreFileBatch(vectorStoreId, createVectorStoreFileBatchRequest)

Create a vector store file batch.
<a name="DeleteVectorStore"></a>
# **DeleteVectorStore**
> DeleteVectorStoreResponse DeleteVectorStore(vectorStoreId)

Delete a vector store.
<a name="DeleteVectorStoreFile"></a>
# **DeleteVectorStoreFile**
> DeleteVectorStoreFileResponse DeleteVectorStoreFile(vectorStoreId, fileId)

Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
<a name="GetVectorStore"></a>
# **GetVectorStore**
> VectorStoreObject GetVectorStore(vectorStoreId)

Retrieves a vector store.
<a name="GetVectorStoreFile"></a>
# **GetVectorStoreFile**
> VectorStoreFileObject GetVectorStoreFile(vectorStoreId, fileId)

Retrieves a vector store file.
<a name="GetVectorStoreFileBatch"></a>
# **GetVectorStoreFileBatch**
> VectorStoreFileBatchObject GetVectorStoreFileBatch(vectorStoreId, batchId)

Retrieves a vector store file batch.
<a name="ListFilesInVectorStoreBatch"></a>
# **ListFilesInVectorStoreBatch**
> ListVectorStoreFilesResponse ListFilesInVectorStoreBatch(vectorStoreId, batchId, limit, order, after, before, filter)

Returns a list of vector store files in a batch.
<a name="ListVectorStoreFiles"></a>
# **ListVectorStoreFiles**
> ListVectorStoreFilesResponse ListVectorStoreFiles(vectorStoreId, limit, order, after, before, filter)

Returns a list of vector store files.
<a name="ListVectorStores"></a>
# **ListVectorStores**
> ListVectorStoresResponse ListVectorStores(limit, order, after, before)

Returns a list of vector stores.
<a name="ModifyVectorStore"></a>
# **ModifyVectorStore**
> VectorStoreObject ModifyVectorStore(vectorStoreId, updateVectorStoreRequest)

Modifies a vector store.
