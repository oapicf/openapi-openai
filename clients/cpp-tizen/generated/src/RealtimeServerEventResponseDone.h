/*
 * RealtimeServerEventResponseDone.h
 *
 * Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the &#x60;response.done&#x60; event will  include all output Items in the Response but will omit the raw audio data. 
 */

#ifndef _RealtimeServerEventResponseDone_H_
#define _RealtimeServerEventResponseDone_H_


#include <string>
#include "RealtimeResponse.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventResponseDone : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventResponseDone();
	RealtimeServerEventResponseDone(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventResponseDone();

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
	/*! \brief Get The event type, must be `response.done`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `response.done`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RealtimeResponse getResponse();

	/*! \brief Set 
	 */
	void setResponse(RealtimeResponse  response);

private:
	std::string event_id;
	std::string type;
	RealtimeResponse response;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventResponseDone_H_ */
