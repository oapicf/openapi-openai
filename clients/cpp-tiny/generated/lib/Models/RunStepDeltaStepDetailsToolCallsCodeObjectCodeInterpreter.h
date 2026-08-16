
/*
 * RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.h
 *
 * The Code Interpreter tool call definition.
 */

#ifndef TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_H_
#define TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h"
#include <list>

namespace Tiny {


/*! \brief The Code Interpreter tool call definition.
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter{
public:

    /*! \brief Constructor.
	 */
    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter();
    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string input{};
    std::list<RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner> outputs;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_H_ */
