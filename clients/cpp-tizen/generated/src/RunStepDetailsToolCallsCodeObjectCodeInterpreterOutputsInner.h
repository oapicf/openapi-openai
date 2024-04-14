/*
 * RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner.h
 *
 * 
 */

#ifndef _RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_
#define _RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_


#include <string>
#include "RunStepDetailsToolCallsCodeOutputImageObject.h"
#include "RunStepDetailsToolCallsCodeOutputImageObject_image.h"
#include "RunStepDetailsToolCallsCodeOutputLogsObject.h"
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

class RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner();
	RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string type;
	std::string logs;
	RunStepDetailsToolCallsCodeOutputImageObject_image image;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner_H_ */
