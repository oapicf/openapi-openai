
/*
 * RealtimeServerEventResponseFunctionCallArgumentsDone.h
 *
 * Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventResponseFunctionCallArgumentsDone_H_
#define TINY_CPP_CLIENT_RealtimeServerEventResponseFunctionCallArgumentsDone_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventResponseFunctionCallArgumentsDone{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventResponseFunctionCallArgumentsDone();
    RealtimeServerEventResponseFunctionCallArgumentsDone(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventResponseFunctionCallArgumentsDone();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The unique ID of the server event.
	 */
	std::string getEventId();

	/*! \brief Set The unique ID of the server event.
	 */
	void setEventId(std::string  event_id);
	/*! \brief Get The event type, must be `response.function_call_arguments.done`. 
	 */
	std::string getType();

	/*! \brief Set The event type, must be `response.function_call_arguments.done`. 
	 */
	void setType(std::string  type);
	/*! \brief Get The ID of the response.
	 */
	std::string getResponseId();

	/*! \brief Set The ID of the response.
	 */
	void setResponseId(std::string  response_id);
	/*! \brief Get The ID of the function call item.
	 */
	std::string getItemId();

	/*! \brief Set The ID of the function call item.
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get The index of the output item in the response.
	 */
	int getOutputIndex();

	/*! \brief Set The index of the output item in the response.
	 */
	void setOutputIndex(int  output_index);
	/*! \brief Get The ID of the function call.
	 */
	std::string getCallId();

	/*! \brief Set The ID of the function call.
	 */
	void setCallId(std::string  call_id);
	/*! \brief Get The final arguments as a JSON string.
	 */
	std::string getArguments();

	/*! \brief Set The final arguments as a JSON string.
	 */
	void setArguments(std::string  arguments);


    private:
    std::string event_id{};
    std::string type{};
    std::string response_id{};
    std::string item_id{};
    int output_index{};
    std::string call_id{};
    std::string arguments{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventResponseFunctionCallArgumentsDone_H_ */
