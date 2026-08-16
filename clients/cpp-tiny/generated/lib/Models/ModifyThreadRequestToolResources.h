
/*
 * ModifyThreadRequest_tool_resources.h
 *
 * A set of resources that are made available to the assistant&#39;s tools in this thread. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
 */

#ifndef TINY_CPP_CLIENT_ModifyThreadRequest_tool_resources_H_
#define TINY_CPP_CLIENT_ModifyThreadRequest_tool_resources_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateAssistantRequest_tool_resources_code_interpreter.h"
#include "ModifyThreadRequest_tool_resources_file_search.h"

namespace Tiny {


/*! \brief A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 *
 *  \ingroup Models
 *
 */

class ModifyThreadRequest_tool_resources{
public:

    /*! \brief Constructor.
	 */
    ModifyThreadRequest_tool_resources();
    ModifyThreadRequest_tool_resources(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ModifyThreadRequest_tool_resources();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CreateAssistantRequest_tool_resources_code_interpreter getCodeInterpreter();

	/*! \brief Set 
	 */
	void setCodeInterpreter(CreateAssistantRequest_tool_resources_code_interpreter  code_interpreter);
	/*! \brief Get 
	 */
	ModifyThreadRequest_tool_resources_file_search getFileSearch();

	/*! \brief Set 
	 */
	void setFileSearch(ModifyThreadRequest_tool_resources_file_search  file_search);


    private:
    CreateAssistantRequest_tool_resources_code_interpreter code_interpreter;
    ModifyThreadRequest_tool_resources_file_search file_search;
};
}

#endif /* TINY_CPP_CLIENT_ModifyThreadRequest_tool_resources_H_ */
