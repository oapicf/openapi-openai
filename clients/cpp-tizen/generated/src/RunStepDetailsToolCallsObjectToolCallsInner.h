/*
 * RunStepDetailsToolCallsObject_tool_calls_inner.h
 *
 * 
 */

#ifndef _RunStepDetailsToolCallsObject_tool_calls_inner_H_
#define _RunStepDetailsToolCallsObject_tool_calls_inner_H_


#include <string>
#include "RunStepDetailsToolCallsCodeObject.h"
#include "RunStepDetailsToolCallsCodeObject_code_interpreter.h"
#include "RunStepDetailsToolCallsFunctionObject.h"
#include "RunStepDetailsToolCallsFunctionObject_function.h"
#include "RunStepDetailsToolCallsRetrievalObject.h"
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

class RunStepDetailsToolCallsObject_tool_calls_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDetailsToolCallsObject_tool_calls_inner();
	RunStepDetailsToolCallsObject_tool_calls_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDetailsToolCallsObject_tool_calls_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get For now, this is always going to be an empty object.
	 */
	std::string getRetrieval();

	/*! \brief Set For now, this is always going to be an empty object.
	 */
	void setRetrieval(std::string  retrieval);
	/*! \brief Get 
	 */
	RunStepDetailsToolCallsFunctionObject_function getFunction();

	/*! \brief Set 
	 */
	void setFunction(RunStepDetailsToolCallsFunctionObject_function  function);

private:
	std::string id;
	std::string type;
	RunStepDetailsToolCallsCodeObject_code_interpreter code_interpreter;
	std::string retrieval;
	RunStepDetailsToolCallsFunctionObject_function function;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDetailsToolCallsObject_tool_calls_inner_H_ */
