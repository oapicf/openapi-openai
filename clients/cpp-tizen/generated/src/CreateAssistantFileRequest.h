/*
 * CreateAssistantFileRequest.h
 *
 * 
 */

#ifndef _CreateAssistantFileRequest_H_
#define _CreateAssistantFileRequest_H_


#include <string>
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

class CreateAssistantFileRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateAssistantFileRequest();
	CreateAssistantFileRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateAssistantFileRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.
	 */
	std::string getFileId();

	/*! \brief Set A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.
	 */
	void setFileId(std::string  file_id);

private:
	std::string file_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateAssistantFileRequest_H_ */
