
/*
 * RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_
#define TINY_CPP_CLIENT_RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDetailsToolCallsCodeOutputImageObject.h"
#include "RunStepDetailsToolCallsCodeOutputImageObject_image.h"
#include "RunStepDetailsToolCallsCodeOutputLogsObject.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner{
public:

    /*! \brief Constructor.
	 */
    RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner();
    RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `logs`.
	 */
	std::string getType();

	/*! \brief Set Always `logs`.
	 */
	void setType(std::string  type);
	/*! \brief Get The text output from the Code Interpreter tool call.
	 */
	std::string getLogs();

	/*! \brief Set The text output from the Code Interpreter tool call.
	 */
	void setLogs(std::string  logs);
	/*! \brief Get 
	 */
	RunStepDetailsToolCallsCodeOutputImageObject_image getImage();

	/*! \brief Set 
	 */
	void setImage(RunStepDetailsToolCallsCodeOutputImageObject_image  image);


    private:
    std::string type{};
    std::string logs{};
    RunStepDetailsToolCallsCodeOutputImageObject_image image;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_ */
