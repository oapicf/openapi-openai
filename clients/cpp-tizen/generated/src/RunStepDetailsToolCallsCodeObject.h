/*
 * RunStepDetailsToolCallsCodeObject.h
 *
 * Details of the Code Interpreter tool call the run step was involved in.
 */

#ifndef _RunStepDetailsToolCallsCodeObject_H_
#define _RunStepDetailsToolCallsCodeObject_H_


#include <string>
#include "RunStepDetailsToolCallsCodeObject_code_interpreter.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Details of the Code Interpreter tool call the run step was involved in.
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsCodeObject : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDetailsToolCallsCodeObject();
	RunStepDetailsToolCallsCodeObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDetailsToolCallsCodeObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the tool call.
	 */
	std::string getId();

	/*! \brief Set The ID of the tool call.
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

private:
	std::string id;
	std::string type;
	RunStepDetailsToolCallsCodeObject_code_interpreter code_interpreter;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDetailsToolCallsCodeObject_H_ */
