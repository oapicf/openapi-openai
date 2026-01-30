#ifndef _VectorStoresManager_H_
#define _VectorStoresManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
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
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup VectorStores VectorStores
 * \ingroup Operations
 *  @{
 */
class VectorStoresManager {
public:
	VectorStoresManager();
	virtual ~VectorStoresManager();

/*! \brief Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.. *Synchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store that the file batch belongs to. *Required*
 * \param batchId The ID of the file batch to cancel. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelVectorStoreFileBatchSync(char * accessToken,
	std::string vectorStoreId, std::string batchId, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	, void* userData);

/*! \brief Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.. *Asynchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store that the file batch belongs to. *Required*
 * \param batchId The ID of the file batch to cancel. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelVectorStoreFileBatchAsync(char * accessToken,
	std::string vectorStoreId, std::string batchId, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	, void* userData);


/*! \brief Create a vector store.. *Synchronous*
 *
 * 
 * \param createVectorStoreRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createVectorStoreSync(char * accessToken,
	std::shared_ptr<CreateVectorStoreRequest> createVectorStoreRequest, 
	void(* handler)(VectorStoreObject, Error, void* )
	, void* userData);

/*! \brief Create a vector store.. *Asynchronous*
 *
 * 
 * \param createVectorStoreRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createVectorStoreAsync(char * accessToken,
	std::shared_ptr<CreateVectorStoreRequest> createVectorStoreRequest, 
	void(* handler)(VectorStoreObject, Error, void* )
	, void* userData);


/*! \brief Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).. *Synchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store for which to create a File.  *Required*
 * \param createVectorStoreFileRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createVectorStoreFileSync(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<CreateVectorStoreFileRequest> createVectorStoreFileRequest, 
	void(* handler)(VectorStoreFileObject, Error, void* )
	, void* userData);

/*! \brief Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).. *Asynchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store for which to create a File.  *Required*
 * \param createVectorStoreFileRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createVectorStoreFileAsync(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<CreateVectorStoreFileRequest> createVectorStoreFileRequest, 
	void(* handler)(VectorStoreFileObject, Error, void* )
	, void* userData);


/*! \brief Create a vector store file batch.. *Synchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store for which to create a File Batch.  *Required*
 * \param createVectorStoreFileBatchRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createVectorStoreFileBatchSync(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<CreateVectorStoreFileBatchRequest> createVectorStoreFileBatchRequest, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	, void* userData);

/*! \brief Create a vector store file batch.. *Asynchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store for which to create a File Batch.  *Required*
 * \param createVectorStoreFileBatchRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createVectorStoreFileBatchAsync(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<CreateVectorStoreFileBatchRequest> createVectorStoreFileBatchRequest, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	, void* userData);


/*! \brief Delete a vector store.. *Synchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store to delete. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteVectorStoreSync(char * accessToken,
	std::string vectorStoreId, 
	void(* handler)(DeleteVectorStoreResponse, Error, void* )
	, void* userData);

/*! \brief Delete a vector store.. *Asynchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store to delete. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteVectorStoreAsync(char * accessToken,
	std::string vectorStoreId, 
	void(* handler)(DeleteVectorStoreResponse, Error, void* )
	, void* userData);


/*! \brief Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.. *Synchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store that the file belongs to. *Required*
 * \param fileId The ID of the file to delete. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteVectorStoreFileSync(char * accessToken,
	std::string vectorStoreId, std::string fileId, 
	void(* handler)(DeleteVectorStoreFileResponse, Error, void* )
	, void* userData);

/*! \brief Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.. *Asynchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store that the file belongs to. *Required*
 * \param fileId The ID of the file to delete. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteVectorStoreFileAsync(char * accessToken,
	std::string vectorStoreId, std::string fileId, 
	void(* handler)(DeleteVectorStoreFileResponse, Error, void* )
	, void* userData);


/*! \brief Retrieves a vector store.. *Synchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store to retrieve. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVectorStoreSync(char * accessToken,
	std::string vectorStoreId, 
	void(* handler)(VectorStoreObject, Error, void* )
	, void* userData);

/*! \brief Retrieves a vector store.. *Asynchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store to retrieve. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVectorStoreAsync(char * accessToken,
	std::string vectorStoreId, 
	void(* handler)(VectorStoreObject, Error, void* )
	, void* userData);


/*! \brief Retrieves a vector store file.. *Synchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store that the file belongs to. *Required*
 * \param fileId The ID of the file being retrieved. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVectorStoreFileSync(char * accessToken,
	std::string vectorStoreId, std::string fileId, 
	void(* handler)(VectorStoreFileObject, Error, void* )
	, void* userData);

/*! \brief Retrieves a vector store file.. *Asynchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store that the file belongs to. *Required*
 * \param fileId The ID of the file being retrieved. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVectorStoreFileAsync(char * accessToken,
	std::string vectorStoreId, std::string fileId, 
	void(* handler)(VectorStoreFileObject, Error, void* )
	, void* userData);


/*! \brief Retrieves a vector store file batch.. *Synchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store that the file batch belongs to. *Required*
 * \param batchId The ID of the file batch being retrieved. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVectorStoreFileBatchSync(char * accessToken,
	std::string vectorStoreId, std::string batchId, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	, void* userData);

/*! \brief Retrieves a vector store file batch.. *Asynchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store that the file batch belongs to. *Required*
 * \param batchId The ID of the file batch being retrieved. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getVectorStoreFileBatchAsync(char * accessToken,
	std::string vectorStoreId, std::string batchId, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	, void* userData);


/*! \brief Returns a list of vector store files in a batch.. *Synchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store that the files belong to. *Required*
 * \param batchId The ID of the file batch that the files belong to. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param filter Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFilesInVectorStoreBatchSync(char * accessToken,
	std::string vectorStoreId, std::string batchId, int limit, std::string order, std::string after, std::string before, std::string filter, 
	void(* handler)(ListVectorStoreFilesResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of vector store files in a batch.. *Asynchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store that the files belong to. *Required*
 * \param batchId The ID of the file batch that the files belong to. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param filter Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFilesInVectorStoreBatchAsync(char * accessToken,
	std::string vectorStoreId, std::string batchId, int limit, std::string order, std::string after, std::string before, std::string filter, 
	void(* handler)(ListVectorStoreFilesResponse, Error, void* )
	, void* userData);


/*! \brief Returns a list of vector store files.. *Synchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store that the files belong to. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param filter Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listVectorStoreFilesSync(char * accessToken,
	std::string vectorStoreId, int limit, std::string order, std::string after, std::string before, std::string filter, 
	void(* handler)(ListVectorStoreFilesResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of vector store files.. *Asynchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store that the files belong to. *Required*
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param filter Filter by file status. One of `in_progress`, `completed`, `failed`, `cancelled`.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listVectorStoreFilesAsync(char * accessToken,
	std::string vectorStoreId, int limit, std::string order, std::string after, std::string before, std::string filter, 
	void(* handler)(ListVectorStoreFilesResponse, Error, void* )
	, void* userData);


/*! \brief Returns a list of vector stores.. *Synchronous*
 *
 * 
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listVectorStoresSync(char * accessToken,
	int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListVectorStoresResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of vector stores.. *Asynchronous*
 *
 * 
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param order Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param before A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listVectorStoresAsync(char * accessToken,
	int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListVectorStoresResponse, Error, void* )
	, void* userData);


/*! \brief Modifies a vector store.. *Synchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store to modify. *Required*
 * \param updateVectorStoreRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyVectorStoreSync(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<UpdateVectorStoreRequest> updateVectorStoreRequest, 
	void(* handler)(VectorStoreObject, Error, void* )
	, void* userData);

/*! \brief Modifies a vector store.. *Asynchronous*
 *
 * 
 * \param vectorStoreId The ID of the vector store to modify. *Required*
 * \param updateVectorStoreRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool modifyVectorStoreAsync(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<UpdateVectorStoreRequest> updateVectorStoreRequest, 
	void(* handler)(VectorStoreObject, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* VectorStoresManager_H_ */
