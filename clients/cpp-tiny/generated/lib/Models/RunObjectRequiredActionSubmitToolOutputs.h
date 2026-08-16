
/*
 * RunObject_required_action_submit_tool_outputs.h
 *
 * Details on the tool outputs needed for this run to continue.
 */

#ifndef TINY_CPP_CLIENT_RunObject_required_action_submit_tool_outputs_H_
#define TINY_CPP_CLIENT_RunObject_required_action_submit_tool_outputs_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunToolCallObject.h"
#include <list>

namespace Tiny {


/*! \brief Details on the tool outputs needed for this run to continue.
 *
 *  \ingroup Models
 *
 */

class RunObject_required_action_submit_tool_outputs{
public:

    /*! \brief Constructor.
	 */
    RunObject_required_action_submit_tool_outputs();
    RunObject_required_action_submit_tool_outputs(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunObject_required_action_submit_tool_outputs();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of the relevant tool calls.
	 */
	std::list<RunToolCallObject> getToolCalls();

	/*! \brief Set A list of the relevant tool calls.
	 */
	void setToolCalls(std::list <RunToolCallObject> tool_calls);


    private:
    std::list<RunToolCallObject> tool_calls;
};
}

#endif /* TINY_CPP_CLIENT_RunObject_required_action_submit_tool_outputs_H_ */
