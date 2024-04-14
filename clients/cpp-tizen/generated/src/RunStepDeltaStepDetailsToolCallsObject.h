/*
 * RunStepDeltaStepDetailsToolCallsObject.h
 *
 * Details of the tool call.
 */

#ifndef _RunStepDeltaStepDetailsToolCallsObject_H_
#define _RunStepDeltaStepDetailsToolCallsObject_H_


#include <string>
#include "RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Details of the tool call.
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsObject : public Object {
public:
	/*! \brief Constructor.
	 */
	RunStepDeltaStepDetailsToolCallsObject();
	RunStepDeltaStepDetailsToolCallsObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunStepDeltaStepDetailsToolCallsObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Always `tool_calls`.
	 */
	std::string getType();

	/*! \brief Set Always `tool_calls`.
	 */
	void setType(std::string  type);
	/*! \brief Get An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
	 */
	std::list<RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> getToolCalls();

	/*! \brief Set An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
	 */
	void setToolCalls(std::list <RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> tool_calls);

private:
	std::string type;
	std::list <RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner>tool_calls;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunStepDeltaStepDetailsToolCallsObject_H_ */
