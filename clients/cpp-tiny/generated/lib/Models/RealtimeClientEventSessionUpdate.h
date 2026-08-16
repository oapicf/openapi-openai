
/*
 * RealtimeClientEventSessionUpdate.h
 *
 * Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \&quot;voice\&quot;. The server will respond  with a &#x60;session.updated&#x60; event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \&quot;instructions\&quot; is to pass an empty string. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeClientEventSessionUpdate_H_
#define TINY_CPP_CLIENT_RealtimeClientEventSessionUpdate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RealtimeSessionCreateRequest.h"

namespace Tiny {


/*! \brief Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventSessionUpdate{
public:

    /*! \brief Constructor.
	 */
    RealtimeClientEventSessionUpdate();
    RealtimeClientEventSessionUpdate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeClientEventSessionUpdate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string event_id{};
    std::string type{};
    RealtimeSessionCreateRequest session;
};
}

#endif /* TINY_CPP_CLIENT_RealtimeClientEventSessionUpdate_H_ */
