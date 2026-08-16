
/*
 * RealtimeServerEventSessionUpdated.h
 *
 * Returned when a session is updated with a &#x60;session.update&#x60; event, unless  there is an error. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventSessionUpdated_H_
#define TINY_CPP_CLIENT_RealtimeServerEventSessionUpdated_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RealtimeSession.h"

namespace Tiny {


/*! \brief Returned when a session is updated with a `session.update` event, unless  there is an error. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventSessionUpdated{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventSessionUpdated();
    RealtimeServerEventSessionUpdated(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventSessionUpdated();


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
    std::string event_id{};
    std::string type{};
    RealtimeSession session;
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventSessionUpdated_H_ */
