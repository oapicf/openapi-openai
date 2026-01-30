/*
 * CreateBatch_request.h
 *
 * 
 */

#ifndef _CreateBatch_request_H_
#define _CreateBatch_request_H_


#include <string>
#include <map>
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

class CreateBatch_request : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateBatch_request();
	CreateBatch_request(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateBatch_request();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
	 */
	std::string getInputFileId();

	/*! \brief Set The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
	 */
	void setInputFileId(std::string  input_file_id);
	/*! \brief Get The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
	 */
	std::string getEndpoint();

	/*! \brief Set The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
	 */
	void setEndpoint(std::string  endpoint);
	/*! \brief Get The time frame within which the batch should be processed. Currently only `24h` is supported.
	 */
	std::string getCompletionWindow();

	/*! \brief Set The time frame within which the batch should be processed. Currently only `24h` is supported.
	 */
	void setCompletionWindow(std::string  completion_window);
	/*! \brief Get Optional custom metadata for the batch.
	 */
	std::map<std::string, std::string> getMetadata();

	/*! \brief Set Optional custom metadata for the batch.
	 */
	void setMetadata(std::map <std::string, std::string> metadata);

private:
	std::string input_file_id;
	std::string endpoint;
	std::string completion_window;
	std::map <std::string, std::string>metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateBatch_request_H_ */
