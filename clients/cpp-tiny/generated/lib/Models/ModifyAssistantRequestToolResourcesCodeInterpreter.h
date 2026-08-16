
/*
 * ModifyAssistantRequest_tool_resources_code_interpreter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ModifyAssistantRequest_tool_resources_code_interpreter_H_
#define TINY_CPP_CLIENT_ModifyAssistantRequest_tool_resources_code_interpreter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ModifyAssistantRequest_tool_resources_code_interpreter{
public:

    /*! \brief Constructor.
	 */
    ModifyAssistantRequest_tool_resources_code_interpreter();
    ModifyAssistantRequest_tool_resources_code_interpreter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ModifyAssistantRequest_tool_resources_code_interpreter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
	 */
	std::list<std::string> getFileIds();

	/*! \brief Set Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
	 */
	void setFileIds(std::list <std::string> file_ids);


    private:
    std::list<std::string> file_ids;
};
}

#endif /* TINY_CPP_CLIENT_ModifyAssistantRequest_tool_resources_code_interpreter_H_ */
