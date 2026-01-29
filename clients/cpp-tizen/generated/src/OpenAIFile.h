/*
 * OpenAIFile.h
 *
 * The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
 */

#ifndef _OpenAIFile_H_
#define _OpenAIFile_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The `File` object represents a document that has been uploaded to OpenAI.
 *
 *  \ingroup Models
 *
 */

class OpenAIFile : public Object {
public:
	/*! \brief Constructor.
	 */
	OpenAIFile();
	OpenAIFile(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OpenAIFile();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The file identifier, which can be referenced in the API endpoints.
	 */
	std::string getId();

	/*! \brief Set The file identifier, which can be referenced in the API endpoints.
	 */
	void setId(std::string  id);
	/*! \brief Get The size of the file, in bytes.
	 */
	int getBytes();

	/*! \brief Set The size of the file, in bytes.
	 */
	void setBytes(int  bytes);
	/*! \brief Get The Unix timestamp (in seconds) for when the file was created.
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) for when the file was created.
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The name of the file.
	 */
	std::string getFilename();

	/*! \brief Set The name of the file.
	 */
	void setFilename(std::string  filename);
	/*! \brief Get The object type, which is always `file`.
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `file`.
	 */
	void setObject(std::string  object);
	/*! \brief Get The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
	 */
	std::string getPurpose();

	/*! \brief Set The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
	 */
	void setPurpose(std::string  purpose);
	/*! \brief Get Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
	 */
	std::string getStatus();

	/*! \brief Set Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
	 */
	void setStatus(std::string  status);
	/*! \brief Get Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
	 */
	std::string getStatusDetails();

	/*! \brief Set Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
	 */
	void setStatusDetails(std::string  status_details);

private:
	std::string id;
	int bytes;
	int created_at;
	std::string filename;
	std::string object;
	std::string purpose;
	std::string status;
	std::string status_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OpenAIFile_H_ */
