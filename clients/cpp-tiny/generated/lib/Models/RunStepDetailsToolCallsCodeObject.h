
/*
 * RunStepDetailsToolCallsCodeObject.h
 *
 * Details of the Code Interpreter tool call the run step was involved in.
 */

#ifndef TINY_CPP_CLIENT_RunStepDetailsToolCallsCodeObject_H_
#define TINY_CPP_CLIENT_RunStepDetailsToolCallsCodeObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDetailsToolCallsCodeObject_code_interpreter.h"

namespace Tiny {


/*! \brief Details of the Code Interpreter tool call the run step was involved in.
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsCodeObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDetailsToolCallsCodeObject();
    RunStepDetailsToolCallsCodeObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDetailsToolCallsCodeObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string id{};
    std::string type{};
    RunStepDetailsToolCallsCodeObject_code_interpreter code_interpreter;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDetailsToolCallsCodeObject_H_ */
