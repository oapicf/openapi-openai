/*
 * RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.h
 *
 * Text output from the Code Interpreter tool call as part of a run step.
 */

#ifndef _RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject_H_
#define _RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Text output from the Code Interpreter tool call as part of a run step.
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject();
	RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject();

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

private:
	int index;
	std::string type;
	std::string logs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject_H_ */
