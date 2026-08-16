
/*
 * RunObject_required_action.h
 *
 * Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
 */

#ifndef TINY_CPP_CLIENT_RunObject_required_action_H_
#define TINY_CPP_CLIENT_RunObject_required_action_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunObject_required_action_submit_tool_outputs.h"

namespace Tiny {


/*! \brief Details on the action required to continue the run. Will be `null` if no action is required.
 *
 *  \ingroup Models
 *
 */

class RunObject_required_action{
public:

    /*! \brief Constructor.
	 */
    RunObject_required_action();
    RunObject_required_action(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunObject_required_action();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string type{};
    RunObject_required_action_submit_tool_outputs submit_tool_outputs;
};
}

#endif /* TINY_CPP_CLIENT_RunObject_required_action_H_ */
