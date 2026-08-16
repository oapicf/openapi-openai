#ifndef TINY_CPP_CLIENT_BatchApi_H_
#define TINY_CPP_CLIENT_BatchApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Batch.h"
#include "CreateBatch_request.h"
#include "ListBatchesResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class BatchApi : public Service {
public:
    BatchApi() = default;

    virtual ~BatchApi() = default;

    /**
    * Cancels an in-progress batch. The batch will be in status `cancelling` for up to 10 minutes, before changing to `cancelled`, where it will have partial results (if any) available in the output file..
    *
    * 
    * \param batchId The ID of the batch to cancel. *Required*
    */
    Response<
                Batch
        >
    cancelBatch(
            
            std::string batchId
            
    );
    /**
    * Creates and executes a batch from an uploaded file of requests.
    *
    * 
    * \param createBatchRequest  *Required*
    */
    Response<
                Batch
        >
    createBatch(
            
            CreateBatch_request createBatchRequest
            
    );
    /**
    * List your organization's batches..
    *
    * 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    */
    Response<
                ListBatchesResponse
        >
    listBatches(
            
            std::string after
            , 
            
            int limit
            
    );
    /**
    * Retrieves a batch..
    *
    * 
    * \param batchId The ID of the batch to retrieve. *Required*
    */
    Response<
                Batch
        >
    retrieveBatch(
            
            std::string batchId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_BatchApi_H_ */