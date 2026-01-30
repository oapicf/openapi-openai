#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/create_vector_store_file_batch_request.h"
#include "../model/create_vector_store_file_request.h"
#include "../model/create_vector_store_request.h"
#include "../model/delete_vector_store_file_response.h"
#include "../model/delete_vector_store_response.h"
#include "../model/list_vector_store_files_response.h"
#include "../model/list_vector_stores_response.h"
#include "../model/update_vector_store_request.h"
#include "../model/vector_store_file_batch_object.h"
#include "../model/vector_store_file_object.h"
#include "../model/vector_store_object.h"

// Enum ORDER for VectorStoresAPI_listFilesInVectorStoreBatch
typedef enum  { openai_api_listFilesInVectorStoreBatch_ORDER_NULL = 0, openai_api_listFilesInVectorStoreBatch_ORDER_asc, openai_api_listFilesInVectorStoreBatch_ORDER_desc } openai_api_listFilesInVectorStoreBatch_order_e;

// Enum FILTER for VectorStoresAPI_listFilesInVectorStoreBatch
typedef enum  { openai_api_listFilesInVectorStoreBatch_FILTER_NULL = 0, openai_api_listFilesInVectorStoreBatch_FILTER_in_progress, openai_api_listFilesInVectorStoreBatch_FILTER_completed, openai_api_listFilesInVectorStoreBatch_FILTER_failed, openai_api_listFilesInVectorStoreBatch_FILTER_cancelled } openai_api_listFilesInVectorStoreBatch_filter_e;

// Enum ORDER for VectorStoresAPI_listVectorStoreFiles
typedef enum  { openai_api_listVectorStoreFiles_ORDER_NULL = 0, openai_api_listVectorStoreFiles_ORDER_asc, openai_api_listVectorStoreFiles_ORDER_desc } openai_api_listVectorStoreFiles_order_e;

// Enum FILTER for VectorStoresAPI_listVectorStoreFiles
typedef enum  { openai_api_listVectorStoreFiles_FILTER_NULL = 0, openai_api_listVectorStoreFiles_FILTER_in_progress, openai_api_listVectorStoreFiles_FILTER_completed, openai_api_listVectorStoreFiles_FILTER_failed, openai_api_listVectorStoreFiles_FILTER_cancelled } openai_api_listVectorStoreFiles_filter_e;

// Enum ORDER for VectorStoresAPI_listVectorStores
typedef enum  { openai_api_listVectorStores_ORDER_NULL = 0, openai_api_listVectorStores_ORDER_asc, openai_api_listVectorStores_ORDER_desc } openai_api_listVectorStores_order_e;


// Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
//
vector_store_file_batch_object_t*
VectorStoresAPI_cancelVectorStoreFileBatch(apiClient_t *apiClient, char *vector_store_id, char *batch_id);


// Create a vector store.
//
vector_store_object_t*
VectorStoresAPI_createVectorStore(apiClient_t *apiClient, create_vector_store_request_t *create_vector_store_request);


// Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
//
vector_store_file_object_t*
VectorStoresAPI_createVectorStoreFile(apiClient_t *apiClient, char *vector_store_id, create_vector_store_file_request_t *create_vector_store_file_request);


// Create a vector store file batch.
//
vector_store_file_batch_object_t*
VectorStoresAPI_createVectorStoreFileBatch(apiClient_t *apiClient, char *vector_store_id, create_vector_store_file_batch_request_t *create_vector_store_file_batch_request);


// Delete a vector store.
//
delete_vector_store_response_t*
VectorStoresAPI_deleteVectorStore(apiClient_t *apiClient, char *vector_store_id);


// Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
//
delete_vector_store_file_response_t*
VectorStoresAPI_deleteVectorStoreFile(apiClient_t *apiClient, char *vector_store_id, char *file_id);


// Retrieves a vector store.
//
vector_store_object_t*
VectorStoresAPI_getVectorStore(apiClient_t *apiClient, char *vector_store_id);


// Retrieves a vector store file.
//
vector_store_file_object_t*
VectorStoresAPI_getVectorStoreFile(apiClient_t *apiClient, char *vector_store_id, char *file_id);


// Retrieves a vector store file batch.
//
vector_store_file_batch_object_t*
VectorStoresAPI_getVectorStoreFileBatch(apiClient_t *apiClient, char *vector_store_id, char *batch_id);


// Returns a list of vector store files in a batch.
//
list_vector_store_files_response_t*
VectorStoresAPI_listFilesInVectorStoreBatch(apiClient_t *apiClient, char *vector_store_id, char *batch_id, int *limit, openai_api_listFilesInVectorStoreBatch_order_e order, char *after, char *before, openai_api_listFilesInVectorStoreBatch_filter_e filter);


// Returns a list of vector store files.
//
list_vector_store_files_response_t*
VectorStoresAPI_listVectorStoreFiles(apiClient_t *apiClient, char *vector_store_id, int *limit, openai_api_listVectorStoreFiles_order_e order, char *after, char *before, openai_api_listVectorStoreFiles_filter_e filter);


// Returns a list of vector stores.
//
list_vector_stores_response_t*
VectorStoresAPI_listVectorStores(apiClient_t *apiClient, int *limit, openai_api_listVectorStores_order_e order, char *after, char *before);


// Modifies a vector store.
//
vector_store_object_t*
VectorStoresAPI_modifyVectorStore(apiClient_t *apiClient, char *vector_store_id, update_vector_store_request_t *update_vector_store_request);


