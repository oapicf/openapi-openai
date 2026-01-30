/*
 * RealtimeServerEventResponseCreated.h
 *
 * Returned when a new Response is created. The first event of response creation, where the response is in an initial state of &#x60;in_progress&#x60;. 
 */

#ifndef _RealtimeServerEventResponseCreated_H_
#define _RealtimeServerEventResponseCreated_H_


#include <string>
#include "RealtimeResponse.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventResponseCreated : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventResponseCreated();
	RealtimeServerEventResponseCreated(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventResponseCreated();

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
	/*! \brief Get The event type, must be `response.created`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `response.created`.
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

#endif /* _RealtimeServerEventResponseCreated_H_ */
