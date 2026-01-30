/*
 * RealtimeServerEventResponseFunctionCallArgumentsDelta.h
 *
 * Returned when the model-generated function call arguments are updated. 
 */

#ifndef _RealtimeServerEventResponseFunctionCallArgumentsDelta_H_
#define _RealtimeServerEventResponseFunctionCallArgumentsDelta_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned when the model-generated function call arguments are updated. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventResponseFunctionCallArgumentsDelta : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventResponseFunctionCallArgumentsDelta();
	RealtimeServerEventResponseFunctionCallArgumentsDelta(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventResponseFunctionCallArgumentsDelta();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The unique ID of the server event.
	 */
	std::string getEventId();

	/*! \brief Set The unique ID of the server event.
	 */
	void setEventId(std::string  event_id);
	/*! \brief Get The event type, must be `response.function_call_arguments.delta`. 
	 */
	std::string getType();

	/*! \brief Set The event type, must be `response.function_call_arguments.delta`. 
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
	/*! \brief Get The arguments delta as a JSON string.
	 */
	std::string getDelta();

	/*! \brief Set The arguments delta as a JSON string.
	 */
	void setDelta(std::string  delta);

private:
	std::string event_id;
	std::string type;
	std::string response_id;
	std::string item_id;
	int output_index;
	std::string call_id;
	std::string delta;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventResponseFunctionCallArgumentsDelta_H_ */
