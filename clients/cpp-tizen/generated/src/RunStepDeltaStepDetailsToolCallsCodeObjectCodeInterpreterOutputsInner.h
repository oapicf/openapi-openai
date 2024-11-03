/*
 * RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h
 *
 * 
 */

#ifndef _RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_
#define _RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_


#include <string>
#include "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.h"
#include "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image.h"
#include "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.h"
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

class RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner();
	RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	int index;
	std::string type;
	std::string logs;
	RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image image;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_ */
