/*
 * RealtimeClientEventSessionUpdate.h
 *
 * Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \&quot;voice\&quot;. The server will respond  with a &#x60;session.updated&#x60; event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \&quot;instructions\&quot; is to pass an empty string. 
 */

#ifndef _RealtimeClientEventSessionUpdate_H_
#define _RealtimeClientEventSessionUpdate_H_


#include <string>
#include "RealtimeSessionCreateRequest.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventSessionUpdate : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeClientEventSessionUpdate();
	RealtimeClientEventSessionUpdate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeClientEventSessionUpdate();

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
	/*! \brief Get The event type, must be `session.update`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `session.update`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RealtimeSessionCreateRequest getSession();

	/*! \brief Set 
	 */
	void setSession(RealtimeSessionCreateRequest  session);

private:
	std::string event_id;
	std::string type;
	RealtimeSessionCreateRequest session;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeClientEventSessionUpdate_H_ */
