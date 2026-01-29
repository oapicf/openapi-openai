#ifndef _FineTuningManager_H_
#define _FineTuningManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CreateFineTuningJobRequest.h"
#include "FineTuningJob.h"
#include "ListFineTuningJobCheckpointsResponse.h"
#include "ListFineTuningJobEventsResponse.h"
#include "ListPaginatedFineTuningJobsResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup FineTuning FineTuning
 * \ingroup Operations
 *  @{
 */
class FineTuningManager {
public:
	FineTuningManager();
	virtual ~FineTuningManager();

/*! \brief Immediately cancel a fine-tune job. . *Synchronous*
 *
 * 
 * \param fineTuningJobId The ID of the fine-tuning job to cancel.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelFineTuningJobSync(char * accessToken,
	std::string fineTuningJobId, 
	void(* handler)(FineTuningJob, Error, void* )
	, void* userData);

/*! \brief Immediately cancel a fine-tune job. . *Asynchronous*
 *
 * 
 * \param fineTuningJobId The ID of the fine-tuning job to cancel.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelFineTuningJobAsync(char * accessToken,
	std::string fineTuningJobId, 
	void(* handler)(FineTuningJob, Error, void* )
	, void* userData);


/*! \brief Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) . *Synchronous*
 *
 * 
 * \param createFineTuningJobRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createFineTuningJobSync(char * accessToken,
	std::shared_ptr<CreateFineTuningJobRequest> createFineTuningJobRequest, 
	void(* handler)(FineTuningJob, Error, void* )
	, void* userData);

/*! \brief Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) . *Asynchronous*
 *
 * 
 * \param createFineTuningJobRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createFineTuningJobAsync(char * accessToken,
	std::shared_ptr<CreateFineTuningJobRequest> createFineTuningJobRequest, 
	void(* handler)(FineTuningJob, Error, void* )
	, void* userData);


/*! \brief Get status updates for a fine-tuning job. . *Synchronous*
 *
 * 
 * \param fineTuningJobId The ID of the fine-tuning job to get events for.  *Required*
 * \param after Identifier for the last event from the previous pagination request.
 * \param limit Number of events to retrieve.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFineTuningEventsSync(char * accessToken,
	std::string fineTuningJobId, std::string after, int limit, 
	void(* handler)(ListFineTuningJobEventsResponse, Error, void* )
	, void* userData);

/*! \brief Get status updates for a fine-tuning job. . *Asynchronous*
 *
 * 
 * \param fineTuningJobId The ID of the fine-tuning job to get events for.  *Required*
 * \param after Identifier for the last event from the previous pagination request.
 * \param limit Number of events to retrieve.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFineTuningEventsAsync(char * accessToken,
	std::string fineTuningJobId, std::string after, int limit, 
	void(* handler)(ListFineTuningJobEventsResponse, Error, void* )
	, void* userData);


/*! \brief List checkpoints for a fine-tuning job. . *Synchronous*
 *
 * 
 * \param fineTuningJobId The ID of the fine-tuning job to get checkpoints for.  *Required*
 * \param after Identifier for the last checkpoint ID from the previous pagination request.
 * \param limit Number of checkpoints to retrieve.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFineTuningJobCheckpointsSync(char * accessToken,
	std::string fineTuningJobId, std::string after, int limit, 
	void(* handler)(ListFineTuningJobCheckpointsResponse, Error, void* )
	, void* userData);

/*! \brief List checkpoints for a fine-tuning job. . *Asynchronous*
 *
 * 
 * \param fineTuningJobId The ID of the fine-tuning job to get checkpoints for.  *Required*
 * \param after Identifier for the last checkpoint ID from the previous pagination request.
 * \param limit Number of checkpoints to retrieve.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listFineTuningJobCheckpointsAsync(char * accessToken,
	std::string fineTuningJobId, std::string after, int limit, 
	void(* handler)(ListFineTuningJobCheckpointsResponse, Error, void* )
	, void* userData);


/*! \brief List your organization's fine-tuning jobs . *Synchronous*
 *
 * 
 * \param after Identifier for the last job from the previous pagination request.
 * \param limit Number of fine-tuning jobs to retrieve.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listPaginatedFineTuningJobsSync(char * accessToken,
	std::string after, int limit, 
	void(* handler)(ListPaginatedFineTuningJobsResponse, Error, void* )
	, void* userData);

/*! \brief List your organization's fine-tuning jobs . *Asynchronous*
 *
 * 
 * \param after Identifier for the last job from the previous pagination request.
 * \param limit Number of fine-tuning jobs to retrieve.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listPaginatedFineTuningJobsAsync(char * accessToken,
	std::string after, int limit, 
	void(* handler)(ListPaginatedFineTuningJobsResponse, Error, void* )
	, void* userData);


/*! \brief Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) . *Synchronous*
 *
 * 
 * \param fineTuningJobId The ID of the fine-tuning job.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveFineTuningJobSync(char * accessToken,
	std::string fineTuningJobId, 
	void(* handler)(FineTuningJob, Error, void* )
	, void* userData);

/*! \brief Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) . *Asynchronous*
 *
 * 
 * \param fineTuningJobId The ID of the fine-tuning job.  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveFineTuningJobAsync(char * accessToken,
	std::string fineTuningJobId, 
	void(* handler)(FineTuningJob, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* FineTuningManager_H_ */
