
/*
 * RealtimeServerEventResponseCreated.h
 *
 * Returned when a new Response is created. The first event of response creation, where the response is in an initial state of &#x60;in_progress&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventResponseCreated_H_
#define TINY_CPP_CLIENT_RealtimeServerEventResponseCreated_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RealtimeResponse.h"

namespace Tiny {


/*! \brief Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventResponseCreated{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventResponseCreated();
    RealtimeServerEventResponseCreated(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventResponseCreated();


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
    std::string event_id{};
    std::string type{};
    RealtimeResponse response;
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventResponseCreated_H_ */
