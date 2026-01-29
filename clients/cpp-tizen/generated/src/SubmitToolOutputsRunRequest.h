/*
 * SubmitToolOutputsRunRequest.h
 *
 * 
 */

#ifndef _SubmitToolOutputsRunRequest_H_
#define _SubmitToolOutputsRunRequest_H_


#include <string>
#include "SubmitToolOutputsRunRequest_tool_outputs_inner.h"
#include <list>
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

class SubmitToolOutputsRunRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	SubmitToolOutputsRunRequest();
	SubmitToolOutputsRunRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SubmitToolOutputsRunRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of tools for which the outputs are being submitted.
	 */
	std::list<SubmitToolOutputsRunRequest_tool_outputs_inner> getToolOutputs();

	/*! \brief Set A list of tools for which the outputs are being submitted.
	 */
	void setToolOutputs(std::list <SubmitToolOutputsRunRequest_tool_outputs_inner> tool_outputs);
	/*! \brief Get If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
	 */
	bool getStream();

	/*! \brief Set If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
	 */
	void setStream(bool  stream);

private:
	std::list <SubmitToolOutputsRunRequest_tool_outputs_inner>tool_outputs;
	bool stream;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SubmitToolOutputsRunRequest_H_ */
