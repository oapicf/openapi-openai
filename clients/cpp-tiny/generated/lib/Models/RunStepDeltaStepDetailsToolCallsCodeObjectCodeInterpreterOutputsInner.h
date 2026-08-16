
/*
 * RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_
#define TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.h"
#include "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.h"
#include "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner{
public:

    /*! \brief Constructor.
	 */
    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner();
    RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The index of the output in the outputs array.
	 */
	int getIndex();

	/*! \brief Set The index of the output in the outputs array.
	 */
	void setIndex(int  index);
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
	RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image getImage();

	/*! \brief Set 
	 */
	void setImage(RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image  image);


    private:
    int index{};
    std::string type{};
    std::string logs{};
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image image;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_ */
