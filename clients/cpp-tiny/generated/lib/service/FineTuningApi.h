#ifndef TINY_CPP_CLIENT_FineTuningApi_H_
#define TINY_CPP_CLIENT_FineTuningApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CreateFineTuningJobRequest.h"
#include "FineTuningJob.h"
#include "ListFineTuningJobCheckpointsResponse.h"
#include "ListFineTuningJobEventsResponse.h"
#include "ListPaginatedFineTuningJobsResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class FineTuningApi : public Service {
public:
    FineTuningApi() = default;

    virtual ~FineTuningApi() = default;

    /**
    * Immediately cancel a fine-tune job. .
    *
    * 
    * \param fineTuningJobId The ID of the fine-tuning job to cancel.  *Required*
    */
    Response<
                FineTuningJob
        >
    cancelFineTuningJob(
            
            std::string fineTuningJobId
            
    );
    /**
    * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) .
    *
    * 
    * \param createFineTuningJobRequest  *Required*
    */
    Response<
                FineTuningJob
        >
    createFineTuningJob(
            
            CreateFineTuningJobRequest createFineTuningJobRequest
            
    );
    /**
    * Get status updates for a fine-tuning job. .
    *
    * 
    * \param fineTuningJobId The ID of the fine-tuning job to get events for.  *Required*
    * \param after Identifier for the last event from the previous pagination request.
    * \param limit Number of events to retrieve.
    */
    Response<
                ListFineTuningJobEventsResponse
        >
    listFineTuningEvents(
            
            std::string fineTuningJobId
            , 
            
            std::string after
            , 
            
            int limit
            
    );
    /**
    * List checkpoints for a fine-tuning job. .
    *
    * 
    * \param fineTuningJobId The ID of the fine-tuning job to get checkpoints for.  *Required*
    * \param after Identifier for the last checkpoint ID from the previous pagination request.
    * \param limit Number of checkpoints to retrieve.
    */
    Response<
                ListFineTuningJobCheckpointsResponse
        >
    listFineTuningJobCheckpoints(
            
            std::string fineTuningJobId
            , 
            
            std::string after
            , 
            
            int limit
            
    );
    /**
    * List your organization's fine-tuning jobs .
    *
    * 
    * \param after Identifier for the last job from the previous pagination request.
    * \param limit Number of fine-tuning jobs to retrieve.
    */
    Response<
                ListPaginatedFineTuningJobsResponse
        >
    listPaginatedFineTuningJobs(
            
            std::string after
            , 
            
            int limit
            
    );
    /**
    * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) .
    *
    * 
    * \param fineTuningJobId The ID of the fine-tuning job.  *Required*
    */
    Response<
                FineTuningJob
        >
    retrieveFineTuningJob(
            
            std::string fineTuningJobId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_FineTuningApi_H_ */