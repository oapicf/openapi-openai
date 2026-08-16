
/*
 * RealtimeClientEventResponseCancel.h
 *
 * Send this event to cancel an in-progress response. The server will respond  with a &#x60;response.cancelled&#x60; event or an error if there is no response to  cancel. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeClientEventResponseCancel_H_
#define TINY_CPP_CLIENT_RealtimeClientEventResponseCancel_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 
 *
 *  \ingroup Models
 *
 */

class RealtimeClientEventResponseCancel{
public:

    /*! \brief Constructor.
	 */
    RealtimeClientEventResponseCancel();
    RealtimeClientEventResponseCancel(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeClientEventResponseCancel();


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
    std::string event_id{};
    std::string type{};
    std::string response_id{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeClientEventResponseCancel_H_ */
