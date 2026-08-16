
/*
 * RunStepDeltaStepDetailsToolCallsObject.h
 *
 * Details of the tool call.
 */

#ifndef TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsObject_H_
#define TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner.h"
#include <list>

namespace Tiny {


/*! \brief Details of the tool call.
 *
 *  \ingroup Models
 *
 */

class RunStepDeltaStepDetailsToolCallsObject{
public:

    /*! \brief Constructor.
	 */
    RunStepDeltaStepDetailsToolCallsObject();
    RunStepDeltaStepDetailsToolCallsObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RunStepDeltaStepDetailsToolCallsObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `tool_calls`.
	 */
	std::string getType();

	/*! \brief Set Always `tool_calls`.
	 */
	void setType(std::string  type);
	/*! \brief Get An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
	 */
	std::list<RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> getToolCalls();

	/*! \brief Set An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
	 */
	void setToolCalls(std::list <RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> tool_calls);


    private:
    std::string type{};
    std::list<RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner> tool_calls;
};
}

#endif /* TINY_CPP_CLIENT_RunStepDeltaStepDetailsToolCallsObject_H_ */
