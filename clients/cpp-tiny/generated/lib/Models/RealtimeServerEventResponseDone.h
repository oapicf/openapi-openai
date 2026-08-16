
/*
 * RealtimeServerEventResponseDone.h
 *
 * Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the &#x60;response.done&#x60; event will  include all output Items in the Response but will omit the raw audio data. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventResponseDone_H_
#define TINY_CPP_CLIENT_RealtimeServerEventResponseDone_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RealtimeResponse.h"

namespace Tiny {


/*! \brief Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventResponseDone{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventResponseDone();
    RealtimeServerEventResponseDone(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventResponseDone();


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
    std::string event_id{};
    std::string type{};
    RealtimeResponse response;
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventResponseDone_H_ */
