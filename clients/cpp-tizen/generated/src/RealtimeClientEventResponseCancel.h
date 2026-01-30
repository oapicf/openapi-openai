/*
 * RealtimeClientEventResponseCancel.h
 *
 * Send this event to cancel an in-progress response. The server will respond  with a &#x60;response.cancelled&#x60; event or an error if there is no response to  cancel. 
 */

#ifndef _RealtimeClientEventResponseCancel_H_
#define _RealtimeClientEventResponseCancel_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventResponseCancel : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeClientEventResponseCancel();
	RealtimeClientEventResponseCancel(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeClientEventResponseCancel();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Optional client-generated ID used to identify this event.
	 */
	std::string getEventId();

	/*! \brief Set Optional client-generated ID used to identify this event.
	 */
	void setEventId(std::string  event_id);
	/*! \brief Get The event type, must be `response.cancel`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `response.cancel`.
	 */
	void setType(std::string  type);
	/*! \brief Get A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
	 */
	std::string getResponseId();

	/*! \brief Set A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
	 */
	void setResponseId(std::string  response_id);

private:
	std::string event_id;
	std::string type;
	std::string response_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeClientEventResponseCancel_H_ */
