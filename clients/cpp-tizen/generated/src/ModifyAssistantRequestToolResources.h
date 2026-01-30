/*
 * ModifyAssistantRequest_tool_resources.h
 *
 * A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
 */

#ifndef _ModifyAssistantRequest_tool_resources_H_
#define _ModifyAssistantRequest_tool_resources_H_


#include <string>
#include "ModifyAssistantRequest_tool_resources_code_interpreter.h"
#include "ModifyAssistantRequest_tool_resources_file_search.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 *
 *  \ingroup Models
 *
 */

class ModifyAssistantRequest_tool_resources : public Object {
public:
	/*! \brief Constructor.
	 */
	ModifyAssistantRequest_tool_resources();
	ModifyAssistantRequest_tool_resources(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ModifyAssistantRequest_tool_resources();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ModifyAssistantRequest_tool_resources_code_interpreter getCodeInterpreter();

	/*! \brief Set 
	 */
	void setCodeInterpreter(ModifyAssistantRequest_tool_resources_code_interpreter  code_interpreter);
	/*! \brief Get 
	 */
	ModifyAssistantRequest_tool_resources_file_search getFileSearch();

	/*! \brief Set 
	 */
	void setFileSearch(ModifyAssistantRequest_tool_resources_file_search  file_search);

private:
	ModifyAssistantRequest_tool_resources_code_interpreter code_interpreter;
	ModifyAssistantRequest_tool_resources_file_search file_search;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ModifyAssistantRequest_tool_resources_H_ */
