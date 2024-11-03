/*
 * RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.h
 *
 * The Code Interpreter tool call definition.
 */

#ifndef _RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_H_
#define _RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_H_


#include <string>
#include "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The Code Interpreter tool call definition.
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter();
	RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The input to the Code Interpreter tool call.
	 */
	std::string getInput();

	/*! \brief Set The input to the Code Interpreter tool call.
	 */
	void setInput(std::string  input);
	/*! \brief Get The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
	 */
	std::list<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> getOutputs();

	/*! \brief Set The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
	 */
	void setOutputs(std::list <RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> outputs);

private:
	std::string input;
	std::list <RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner>outputs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_H_ */
