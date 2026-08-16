
/*
 * RunStepDetailsToolCallsObject_tool_calls_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStepDetailsToolCallsObject_tool_calls_inner_H_
#define TINY_CPP_CLIENT_RunStepDetailsToolCallsObject_tool_calls_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDetailsToolCallsCodeObject.h"
#include "RunStepDetailsToolCallsCodeObject_code_interpreter.h"
#include "RunStepDetailsToolCallsFileSearchObject.h"
#include "RunStepDetailsToolCallsFileSearchObject_file_search.h"
#include "RunStepDetailsToolCallsFunctionObject.h"
#include "RunStepDetailsToolCallsFunctionObject_function.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsObject_tool_calls_inner{
public:

    /*! \brief Constructor.
	 */
    RunStepDetailsToolCallsObject_tool_calls_inner();
    RunStepDetailsToolCallsObject_tool_calls_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDetailsToolCallsObject_tool_calls_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the tool call object.
	 */
	std::string getId();

	/*! \brief Set The ID of the tool call object.
	 */
	void setId(std::string  id);
	/*! \brief Get The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
	 */
	std::string getType();

	/*! \brief Set The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunStepDetailsToolCallsCodeObject_code_interpreter getCodeInterpreter();

	/*! \brief Set 
	 */
	void setCodeInterpreter(RunStepDetailsToolCallsCodeObject_code_interpreter  code_interpreter);
	/*! \brief Get 
	 */
	RunStepDetailsToolCallsFileSearchObject_file_search getFileSearch();

	/*! \brief Set 
	 */
	void setFileSearch(RunStepDetailsToolCallsFileSearchObject_file_search  file_search);
	/*! \brief Get 
	 */
	RunStepDetailsToolCallsFunctionObject_function getFunction();

	/*! \brief Set 
	 */
	void setFunction(RunStepDetailsToolCallsFunctionObject_function  function);


    private:
    std::string id{};
    std::string type{};
    RunStepDetailsToolCallsCodeObject_code_interpreter code_interpreter;
    RunStepDetailsToolCallsFileSearchObject_file_search file_search;
    RunStepDetailsToolCallsFunctionObject_function function;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDetailsToolCallsObject_tool_calls_inner_H_ */
