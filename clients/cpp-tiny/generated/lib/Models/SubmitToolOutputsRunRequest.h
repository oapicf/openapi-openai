
/*
 * SubmitToolOutputsRunRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SubmitToolOutputsRunRequest_H_
#define TINY_CPP_CLIENT_SubmitToolOutputsRunRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "SubmitToolOutputsRunRequest_tool_outputs_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SubmitToolOutputsRunRequest{
public:

    /*! \brief Constructor.
	 */
    SubmitToolOutputsRunRequest();
    SubmitToolOutputsRunRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SubmitToolOutputsRunRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get A list of tools for which the outputs are being submitted.
	 */
	std::list<SubmitToolOutputsRunRequest_tool_outputs_inner> getToolOutputs();

	/*! \brief Set A list of tools for which the outputs are being submitted.
	 */
	void setToolOutputs(std::list <SubmitToolOutputsRunRequest_tool_outputs_inner> tool_outputs);
	/*! \brief Get If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
	 */
	bool isStream();

	/*! \brief Set If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
	 */
	void setStream(bool  stream);


    private:
    std::list<SubmitToolOutputsRunRequest_tool_outputs_inner> tool_outputs;
    bool stream{};
};
}

#endif /* TINY_CPP_CLIENT_SubmitToolOutputsRunRequest_H_ */
