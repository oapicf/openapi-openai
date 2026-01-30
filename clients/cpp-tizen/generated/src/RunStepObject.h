/*
 * RunStepObject.h
 *
 * Represents a step in execution of a run. 
 */

#ifndef _RunStepObject_H_
#define _RunStepObject_H_


#include <string>
#include "RunStepCompletionUsage.h"
#include "RunStepObject_last_error.h"
#include "RunStepObject_step_details.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents a step in execution of a run. 
 *
 *  \ingroup Models
 *
 */

class RunStepObject : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepObject();
	RunStepObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier of the run step, which can be referenced in API endpoints.
	 */
	std::string getId();

	/*! \brief Set The identifier of the run step, which can be referenced in API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The object type, which is always `thread.run.step`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `thread.run.step`.
	 */
	void setObject(std::string  object);
	/*! \brief Get The Unix timestamp (in seconds) for when the run step was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the run step was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
	 */
	std::string getAssistantId();

	/*! \brief Set The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
	 */
	void setAssistantId(std::string  assistant_id);
	/*! \brief Get The ID of the [thread](/docs/api-reference/threads) that was run.
	 */
	std::string getThreadId();

	/*! \brief Set The ID of the [thread](/docs/api-reference/threads) that was run.
	 */
	void setThreadId(std::string  thread_id);
	/*! \brief Get The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
	 */
	std::string getRunId();

	/*! \brief Set The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
	 */
	void setRunId(std::string  run_id);
	/*! \brief Get The type of run step, which can be either `message_creation` or `tool_calls`.
	 */
	std::string getType();

	/*! \brief Set The type of run step, which can be either `message_creation` or `tool_calls`.
	 */
	void setType(std::string  type);
	/*! \brief Get The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
	 */
	std::string getStatus();

	/*! \brief Set The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
	 */
	void setStatus(std::string  status);
	/*! \brief Get 
	 */
	RunStepObject_step_details getStepDetails();

	/*! \brief Set 
	 */
	void setStepDetails(RunStepObject_step_details  step_details);
	/*! \brief Get 
	 */
	RunStepObject_last_error getLastError();

	/*! \brief Set 
	 */
	void setLastError(RunStepObject_last_error  last_error);
	/*! \brief Get The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
	 */
	int getExpiredAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
	 */
	void setExpiredAt(int  expired_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the run step was cancelled.
	 */
	int getCancelledAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the run step was cancelled.
	 */
	void setCancelledAt(int  cancelled_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the run step failed.
	 */
	int getFailedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the run step failed.
	 */
	void setFailedAt(int  failed_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the run step completed.
	 */
	int getCompletedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the run step completed.
	 */
	void setCompletedAt(int  completed_at);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	std::string getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(std::string  metadata);
	/*! \brief Get 
	 */
	RunStepCompletionUsage getUsage();

	/*! \brief Set 
	 */
	void setUsage(RunStepCompletionUsage  usage);

private:
	std::string id;
	std::string object;
	int created_at;
	std::string assistant_id;
	std::string thread_id;
	std::string run_id;
	std::string type;
	std::string status;
	RunStepObject_step_details step_details;
	RunStepObject_last_error last_error;
	int expired_at;
	int cancelled_at;
	int failed_at;
	int completed_at;
	std::string metadata;
	RunStepCompletionUsage usage;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepObject_H_ */
