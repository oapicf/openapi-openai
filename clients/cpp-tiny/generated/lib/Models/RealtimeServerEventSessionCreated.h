
/*
 * RealtimeServerEventSessionCreated.h
 *
 * Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventSessionCreated_H_
#define TINY_CPP_CLIENT_RealtimeServerEventSessionCreated_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RealtimeSession.h"

namespace Tiny {


/*! \brief Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventSessionCreated{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventSessionCreated();
    RealtimeServerEventSessionCreated(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventSessionCreated();


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
    std::string event_id{};
    std::string type{};
    RealtimeSession session;
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventSessionCreated_H_ */
