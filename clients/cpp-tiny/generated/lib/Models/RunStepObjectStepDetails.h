
/*
 * RunStepObject_step_details.h
 *
 * The details of the run step.
 */

#ifndef TINY_CPP_CLIENT_RunStepObject_step_details_H_
#define TINY_CPP_CLIENT_RunStepObject_step_details_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDetailsMessageCreationObject.h"
#include "RunStepDetailsMessageCreationObject_message_creation.h"
#include "RunStepDetailsToolCallsObject.h"
#include "RunStepDetailsToolCallsObject_tool_calls_inner.h"
#include <list>

namespace Tiny {


/*! \brief The details of the run step.
 *
 *  \ingroup Models
 *
 */

class RunStepObject_step_details{
public:

    /*! \brief Constructor.
	 */
    RunStepObject_step_details();
    RunStepObject_step_details(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepObject_step_details();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `message_creation`.
	 */
	std::string getType();

	/*! \brief Set Always `message_creation`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RunStepDetailsMessageCreationObject_message_creation getMessageCreation();

	/*! \brief Set 
	 */
	void setMessageCreation(RunStepDetailsMessageCreationObject_message_creation  message_creation);
	/*! \brief Get An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
	 */
	std::list<RunStepDetailsToolCallsObject_tool_calls_inner> getToolCalls();

	/*! \brief Set An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
	 */
	void setToolCalls(std::list <RunStepDetailsToolCallsObject_tool_calls_inner> tool_calls);


    private:
    std::string type{};
    RunStepDetailsMessageCreationObject_message_creation message_creation;
    std::list<RunStepDetailsToolCallsObject_tool_calls_inner> tool_calls;
};
}

#endif /* TINY_CPP_CLIENT_RunStepObject_step_details_H_ */
