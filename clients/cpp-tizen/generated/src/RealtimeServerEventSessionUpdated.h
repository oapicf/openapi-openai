/*
 * RealtimeServerEventSessionUpdated.h
 *
 * Returned when a session is updated with a &#x60;session.update&#x60; event, unless  there is an error. 
 */

#ifndef _RealtimeServerEventSessionUpdated_H_
#define _RealtimeServerEventSessionUpdated_H_


#include <string>
#include "RealtimeSession.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned when a session is updated with a `session.update` event, unless  there is an error. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventSessionUpdated : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventSessionUpdated();
	RealtimeServerEventSessionUpdated(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventSessionUpdated();

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
	/*! \brief Get The event type, must be `session.updated`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `session.updated`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RealtimeSession getSession();

	/*! \brief Set 
	 */
	void setSession(RealtimeSession  session);

private:
	std::string event_id;
	std::string type;
	RealtimeSession session;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventSessionUpdated_H_ */
