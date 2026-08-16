
/*
 * RunStepDeltaStepDetailsToolCallsCodeObject.h
 *
 * Details of the Code Interpreter tool call the run step was involved in.
 */

#ifndef TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeObject_H_
#define TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.h"

namespace Tiny {


/*! \brief Details of the Code Interpreter tool call the run step was involved in.
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsCodeObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDeltaStepDetailsToolCallsCodeObject();
    RunStepDeltaStepDetailsToolCallsCodeObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDeltaStepDetailsToolCallsCodeObject();


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
	RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter getCodeInterpreter();

	/*! \brief Set 
	 */
	void setCodeInterpreter(RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter  code_interpreter);


    private:
    int index{};
    std::string id{};
    std::string type{};
    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter code_interpreter;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeObject_H_ */
