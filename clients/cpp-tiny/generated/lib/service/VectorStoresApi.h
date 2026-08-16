#ifndef TINY_CPP_CLIENT_VectorStoresApi_H_
#define TINY_CPP_CLIENT_VectorStoresApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CreateVectorStoreFileBatchRequest.h"
#include "CreateVectorStoreFileRequest.h"
#include "CreateVectorStoreRequest.h"
#include "DeleteVectorStoreFileResponse.h"
#include "DeleteVectorStoreResponse.h"
#include "ListVectorStoreFilesResponse.h"
#include "ListVectorStoresResponse.h"
#include "UpdateVectorStoreRequest.h"
#include "VectorStoreFileBatchObject.h"
#include "VectorStoreFileObject.h"
#include "VectorStoreObject.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class VectorStoresApi : public Service {
public:
    VectorStoresApi() = default;

    virtual ~VectorStoresApi() = default;

    /**
    * Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible..
    *
    * 
    * \param vectorStoreId The ID of the vector store that the file batch belongs to. *Required*
    * \param batchId The ID of the file batch to cancel. *Required*
    */
    Response<
                VectorStoreFileBatchObject
        >
    cancelVectorStoreFileBatch(
            
            std::string vectorStoreId
            , 
            
            std::string batchId
            
    );
    /**
    * Create a vector store..
    *
    * 
    * \param createVectorStoreRequest  *Required*
    */
    Response<
                VectorStoreObject
        >
    createVectorStore(
            
            CreateVectorStoreRequest createVectorStoreRequest
            
    );
    /**
    * Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object)..
    *
    * 
    * \param vectorStoreId The ID of the vector store for which to create a File.  *Required*
    * \param createVectorStoreFileRequest  *Required*
    */
    Response<
                VectorStoreFileObject
        >
    createVectorStoreFile(
            
            std::string vectorStoreId
            , 
            
            CreateVectorStoreFileRequest createVectorStoreFileRequest
            
    );
    /**
    * Create a vector store file batch..
    *
    * 
    * \param vectorStoreId The ID of the vector store for which to create a File Batch.  *Required*
    * \param createVectorStoreFileBatchRequest  *Required*
    */
    Response<
                VectorStoreFileBatchObject
        >
    createVectorStoreFileBatch(
            
            std::string vectorStoreId
            , 
            
            CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest
            
    );
    /**
    * Delete a vector store..
    *
    * 
    * \param vectorStoreId The ID of the vector store to delete. *Required*
    */
    Response<
                DeleteVectorStoreResponse
        >
    deleteVectorStore(
            
            std::string vectorStoreId
            
    );
    /**
    * Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint..
    *
    * 
    * \param vectorStoreId The ID of the vector store that the file belongs to. *Required*
    * \param fileId The ID of the file to delete. *Required*
    */
    Response<
                DeleteVectorStoreFileResponse
        >
    deleteVectorStoreFile(
            
            std::string vectorStoreId
            , 
            
            std::string fileId
            
    );
    /**
    * Retrieves a vector store..
    *
    * 
    * \param vectorStoreId The ID of the vector store to retrieve. *Required*
    */
    Response<
                VectorStoreObject
        >
    getVectorStore(
            
            std::string vectorStoreId
            
    );
    /**
    * Retrieves a vector store file..
    *
    * 
    * \param vectorStoreId The ID of the vector store that the file belongs to. *Required*
    * \param fileId The ID of the file being retrieved. *Required*
    */
    Response<
                VectorStoreFileObject
        >
    getVectorStoreFile(
            
            std::string vectorStoreId
            , 
            
            std::string fileId
            
    );
    /**
    * Retrieves a vector store file batch..
    *
    * 
    * \param vectorStoreId The ID of the vector store that the file batch belongs to. *Required*
    * \param batchId The ID of the file batch being retrieved. *Required*
    */
    Response<
                VectorStoreFileBatchObject
        >
    getVectorStoreFileBatch(
            
            std::string vectorStoreId
            , 
            
            std::string batchId
            
    );
    /**
    * Returns a list of vector store files in a batch..
    *
    * 
    * \param vectorStoreId The ID of the vector store that the files belong to. *Required*
    * \param batchId The ID of the file batch that the files belong to. *Required*
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    * \param filter Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
    */
    Response<
                ListVectorStoreFilesResponse
        >
    listFilesInVectorStoreBatch(
            
            std::string vectorStoreId
            , 
            
            std::string batchId
            , 
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            , 
            
            std::string before
            , 
            
            std::string filter
            
    );
    /**
    * Returns a list of vector store files..
    *
    * 
    * \param vectorStoreId The ID of the vector store that the files belong to. *Required*
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    * \param filter Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
    */
    Response<
                ListVectorStoreFilesResponse
        >
    listVectorStoreFiles(
            
            std::string vectorStoreId
            , 
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            , 
            
            std::string before
            , 
            
            std::string filter
            
    );
    /**
    * Returns a list of vector stores..
    *
    * 
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
    */
    Response<
                ListVectorStoresResponse
        >
    listVectorStores(
            
            int limit
            , 
            
            std::string order
            , 
            
            std::string after
            , 
            
            std::string before
            
    );
    /**
    * Modifies a vector store..
    *
    * 
    * \param vectorStoreId The ID of the vector store to modify. *Required*
    * \param updateVectorStoreRequest  *Required*
    */
    Response<
                VectorStoreObject
        >
    modifyVectorStore(
            
            std::string vectorStoreId
            , 
            
            UpdateVectorStoreRequest updateVectorStoreRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_VectorStoresApi_H_ */