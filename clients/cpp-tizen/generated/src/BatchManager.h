#ifndef _BatchManager_H_
#define _BatchManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Batch.h"
#include "CreateBatch_request.h"
#include "ListBatchesResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Batch Batch
 * \ingroup Operations
 *  @{
 */
class BatchManager {
public:
	BatchManager();
	virtual ~BatchManager();

/*! \brief Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.. *Synchronous*
 *
 * 
 * \param batchId The ID of the batch to cancel. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelBatchSync(char * accessToken,
	std::string batchId, 
	void(* handler)(Batch, Error, void* )
	, void* userData);

/*! \brief Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file.. *Asynchronous*
 *
 * 
 * \param batchId The ID of the batch to cancel. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelBatchAsync(char * accessToken,
	std::string batchId, 
	void(* handler)(Batch, Error, void* )
	, void* userData);


/*! \brief Creates and executes a batch from an uploaded file of requests. *Synchronous*
 *
 * 
 * \param createBatchRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createBatchSync(char * accessToken,
	std::shared_ptr<CreateBatch_request> createBatchRequest, 
	void(* handler)(Batch, Error, void* )
	, void* userData);

/*! \brief Creates and executes a batch from an uploaded file of requests. *Asynchronous*
 *
 * 
 * \param createBatchRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createBatchAsync(char * accessToken,
	std::shared_ptr<CreateBatch_request> createBatchRequest, 
	void(* handler)(Batch, Error, void* )
	, void* userData);


/*! \brief List your organization's batches.. *Synchronous*
 *
 * 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listBatchesSync(char * accessToken,
	std::string after, int limit, 
	void(* handler)(ListBatchesResponse, Error, void* )
	, void* userData);

/*! \brief List your organization's batches.. *Asynchronous*
 *
 * 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listBatchesAsync(char * accessToken,
	std::string after, int limit, 
	void(* handler)(ListBatchesResponse, Error, void* )
	, void* userData);


/*! \brief Retrieves a batch.. *Synchronous*
 *
 * 
 * \param batchId The ID of the batch to retrieve. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveBatchSync(char * accessToken,
	std::string batchId, 
	void(* handler)(Batch, Error, void* )
	, void* userData);

/*! \brief Retrieves a batch.. *Asynchronous*
 *
 * 
 * \param batchId The ID of the batch to retrieve. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveBatchAsync(char * accessToken,
	std::string batchId, 
	void(* handler)(Batch, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* BatchManager_H_ */
