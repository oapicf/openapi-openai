
/*
 * RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner_H_
#define TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Object.h"
#include "RunStepDeltaStepDetailsToolCallsCodeObject.h"
#include "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.h"
#include "RunStepDeltaStepDetailsToolCallsFileSearchObject.h"
#include "RunStepDeltaStepDetailsToolCallsFunctionObject.h"
#include "RunStepDeltaStepDetailsToolCallsFunctionObject_function.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner{
public:

    /*! \brief Constructor.
	 */
    RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner();
    RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The index of the tool call in the tool calls array.
	 */
	int getIndex();

	/*! \brief Set The index of the tool call in the tool calls array.
	 */
	void setIndex(int  index);
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
	RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter getCodeInterpreter();

	/*! \brief Set 
	 */
	void setCodeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter  code_interpreter);
	/*! \brief Get For now, this is always going to be an empty object.
	 */
	Object getFileSearch();

	/*! \brief Set For now, this is always going to be an empty object.
	 */
	void setFileSearch(Object  file_search);
	/*! \brief Get 
	 */
	RunStepDeltaStepDetailsToolCallsFunctionObject_function getFunction();

	/*! \brief Set 
	 */
	void setFunction(RunStepDeltaStepDetailsToolCallsFunctionObject_function  function);


    private:
    int index{};
    std::string id{};
    std::string type{};
    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter code_interpreter;
    Object file_search;
    RunStepDeltaStepDetailsToolCallsFunctionObject_function function;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner_H_ */
