/*
 * RunObject_required_action_submit_tool_outputs.h
 *
 * Details on the tool outputs needed for this run to continue.
 */

#ifndef _RunObject_required_action_submit_tool_outputs_H_
#define _RunObject_required_action_submit_tool_outputs_H_


#include <string>
#include "RunToolCallObject.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Details on the tool outputs needed for this run to continue.
 *
 *  \ingroup Models
 *
 */

class RunObject_required_action_submit_tool_outputs : public Object {
public:
	/*! \brief Constructor.
	 */
	RunObject_required_action_submit_tool_outputs();
	RunObject_required_action_submit_tool_outputs(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunObject_required_action_submit_tool_outputs();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of the relevant tool calls.
	 */
	std::list<RunToolCallObject> getToolCalls();

	/*! \brief Set A list of the relevant tool calls.
	 */
	void setToolCalls(std::list <RunToolCallObject> tool_calls);

private:
	std::list <RunToolCallObject>tool_calls;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunObject_required_action_submit_tool_outputs_H_ */
