/*
 * CreateAssistantRequest_tool_resources_code_interpreter.h
 *
 * 
 */

#ifndef _CreateAssistantRequest_tool_resources_code_interpreter_H_
#define _CreateAssistantRequest_tool_resources_code_interpreter_H_


#include <string>
#include <list>
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

class CreateAssistantRequest_tool_resources_code_interpreter : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateAssistantRequest_tool_resources_code_interpreter();
	CreateAssistantRequest_tool_resources_code_interpreter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateAssistantRequest_tool_resources_code_interpreter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
	 */
	std::list<std::string> getFileIds();

	/*! \brief Set A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
	 */
	void setFileIds(std::list <std::string> file_ids);

private:
	std::list <std::string>file_ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateAssistantRequest_tool_resources_code_interpreter_H_ */
