
/*
 * SubmitToolOutputsRunRequest_tool_outputs_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SubmitToolOutputsRunRequest_tool_outputs_inner_H_
#define TINY_CPP_CLIENT_SubmitToolOutputsRunRequest_tool_outputs_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SubmitToolOutputsRunRequest_tool_outputs_inner{
public:

    /*! \brief Constructor.
	 */
    SubmitToolOutputsRunRequest_tool_outputs_inner();
    SubmitToolOutputsRunRequest_tool_outputs_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SubmitToolOutputsRunRequest_tool_outputs_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
	 */
	std::string getToolCallId();

	/*! \brief Set The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
	 */
	void setToolCallId(std::string  tool_call_id);
	/*! \brief Get The output of the tool call to be submitted to continue the run.
	 */
	std::string getOutput();

	/*! \brief Set The output of the tool call to be submitted to continue the run.
	 */
	void setOutput(std::string  output);


    private:
    std::string tool_call_id{};
    std::string output{};
};
}

#endif /* TINY_CPP_CLIENT_SubmitToolOutputsRunRequest_tool_outputs_inner_H_ */
