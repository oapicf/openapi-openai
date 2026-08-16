
/*
 * AssistantObject_tool_resources.h
 *
 * A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
 */

#ifndef TINY_CPP_CLIENT_AssistantObject_tool_resources_H_
#define TINY_CPP_CLIENT_AssistantObject_tool_resources_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AssistantObject_tool_resources_code_interpreter.h"
#include "AssistantObject_tool_resources_file_search.h"

namespace Tiny {


/*! \brief A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 *
 *  \ingroup Models
 *
 */

class AssistantObject_tool_resources{
public:

    /*! \brief Constructor.
	 */
    AssistantObject_tool_resources();
    AssistantObject_tool_resources(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AssistantObject_tool_resources();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AssistantObject_tool_resources_code_interpreter getCodeInterpreter();

	/*! \brief Set 
	 */
	void setCodeInterpreter(AssistantObject_tool_resources_code_interpreter  code_interpreter);
	/*! \brief Get 
	 */
	AssistantObject_tool_resources_file_search getFileSearch();

	/*! \brief Set 
	 */
	void setFileSearch(AssistantObject_tool_resources_file_search  file_search);


    private:
    AssistantObject_tool_resources_code_interpreter code_interpreter;
    AssistantObject_tool_resources_file_search file_search;
};
}

#endif /* TINY_CPP_CLIENT_AssistantObject_tool_resources_H_ */
