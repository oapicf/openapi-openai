/*
 * RunObject_required_action.h
 *
 * Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
 */

#ifndef _RunObject_required_action_H_
#define _RunObject_required_action_H_


#include <string>
#include "RunObject_required_action_submit_tool_outputs.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Details on the action required to continue the run. Will be `null` if no action is required.
 *
 *  \ingroup Models
 *
 */

class RunObject_required_action : public Object {
public:
	/*! \brief Constructor.
	 */
	RunObject_required_action();
	RunObject_required_action(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunObject_required_action();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get For now, this is always `submit_tool_outputs`.
	 */
	std::string getType();

	/*! \brief Set For now, this is always `submit_tool_outputs`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunObject_required_action_submit_tool_outputs getSubmitToolOutputs();

	/*! \brief Set 
	 */
	void setSubmitToolOutputs(RunObject_required_action_submit_tool_outputs  submit_tool_outputs);

private:
	std::string type;
	RunObject_required_action_submit_tool_outputs submit_tool_outputs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunObject_required_action_H_ */
