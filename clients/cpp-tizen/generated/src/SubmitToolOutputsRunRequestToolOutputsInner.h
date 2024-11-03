/*
 * SubmitToolOutputsRunRequest_tool_outputs_inner.h
 *
 * 
 */

#ifndef _SubmitToolOutputsRunRequest_tool_outputs_inner_H_
#define _SubmitToolOutputsRunRequest_tool_outputs_inner_H_


#include <string>
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

class SubmitToolOutputsRunRequest_tool_outputs_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	SubmitToolOutputsRunRequest_tool_outputs_inner();
	SubmitToolOutputsRunRequest_tool_outputs_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SubmitToolOutputsRunRequest_tool_outputs_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string tool_call_id;
	std::string output;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SubmitToolOutputsRunRequest_tool_outputs_inner_H_ */
