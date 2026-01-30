/*
 * Batch.h
 *
 * 
 */

#ifndef _Batch_H_
#define _Batch_H_


#include <string>
#include "Batch_errors.h"
#include "Batch_request_counts.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Batch : public Object {
public:
	/*! \brief Constructor.
	 */
	Batch();
	Batch(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Batch();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get The object type, which is always `batch`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `batch`.
	 */
	void setObject(std::string  object);
	/*! \brief Get The OpenAI API endpoint used by the batch.
	 */
	std::string getEndpoint();

	/*! \brief Set The OpenAI API endpoint used by the batch.
	 */
	void setEndpoint(std::string  endpoint);
	/*! \brief Get 
	 */
	Batch_errors getErrors();

	/*! \brief Set 
	 */
	void setErrors(Batch_errors  errors);
	/*! \brief Get The ID of the input file for the batch.
	 */
	std::string getInputFileId();

	/*! \brief Set The ID of the input file for the batch.
	 */
	void setInputFileId(std::string  input_file_id);
	/*! \brief Get The time frame within which the batch should be processed.
	 */
	std::string getCompletionWindow();

	/*! \brief Set The time frame within which the batch should be processed.
	 */
	void setCompletionWindow(std::string  completion_window);
	/*! \brief Get The current status of the batch.
	 */
	std::string getStatus();

	/*! \brief Set The current status of the batch.
	 */
	void setStatus(std::string  status);
	/*! \brief Get The ID of the file containing the outputs of successfully executed requests.
	 */
	std::string getOutputFileId();

	/*! \brief Set The ID of the file containing the outputs of successfully executed requests.
	 */
	void setOutputFileId(std::string  output_file_id);
	/*! \brief Get The ID of the file containing the outputs of requests with errors.
	 */
	std::string getErrorFileId();

	/*! \brief Set The ID of the file containing the outputs of requests with errors.
	 */
	void setErrorFileId(std::string  error_file_id);
	/*! \brief Get The Unix timestamp (in seconds) for when the batch was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the batch was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the batch started processing.
	 */
	int getInProgressAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the batch started processing.
	 */
	void setInProgressAt(int  in_progress_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the batch will expire.
	 */
	int getExpiresAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the batch will expire.
	 */
	void setExpiresAt(int  expires_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the batch started finalizing.
	 */
	int getFinalizingAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the batch started finalizing.
	 */
	void setFinalizingAt(int  finalizing_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the batch was completed.
	 */
	int getCompletedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the batch was completed.
	 */
	void setCompletedAt(int  completed_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the batch failed.
	 */
	int getFailedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the batch failed.
	 */
	void setFailedAt(int  failed_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the batch expired.
	 */
	int getExpiredAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the batch expired.
	 */
	void setExpiredAt(int  expired_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the batch started cancelling.
	 */
	int getCancellingAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the batch started cancelling.
	 */
	void setCancellingAt(int  cancelling_at);
	/*! \brief Get The Unix timestamp (in seconds) for when the batch was cancelled.
	 */
	int getCancelledAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the batch was cancelled.
	 */
	void setCancelledAt(int  cancelled_at);
	/*! \brief Get 
	 */
	Batch_request_counts getRequestCounts();

	/*! \brief Set 
	 */
	void setRequestCounts(Batch_request_counts  request_counts);
	/*! \brief Get Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	std::string getMetadata();

	/*! \brief Set Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
	 */
	void setMetadata(std::string  metadata);

private:
	std::string id;
	std::string object;
	std::string endpoint;
	Batch_errors errors;
	std::string input_file_id;
	std::string completion_window;
	std::string status;
	std::string output_file_id;
	std::string error_file_id;
	int created_at;
	int in_progress_at;
	int expires_at;
	int finalizing_at;
	int completed_at;
	int failed_at;
	int expired_at;
	int cancelling_at;
	int cancelled_at;
	Batch_request_counts request_counts;
	std::string metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Batch_H_ */
