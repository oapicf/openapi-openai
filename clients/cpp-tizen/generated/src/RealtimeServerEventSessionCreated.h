/*
 * RealtimeServerEventSessionCreated.h
 *
 * Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
 */

#ifndef _RealtimeServerEventSessionCreated_H_
#define _RealtimeServerEventSessionCreated_H_


#include <string>
#include "RealtimeSession.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventSessionCreated : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventSessionCreated();
	RealtimeServerEventSessionCreated(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventSessionCreated();

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
	/*! \brief Get The event type, must be `session.created`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `session.created`.
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

#endif /* _RealtimeServerEventSessionCreated_H_ */
