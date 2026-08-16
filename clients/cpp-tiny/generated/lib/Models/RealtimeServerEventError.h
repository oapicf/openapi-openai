
/*
 * RealtimeServerEventError.h
 *
 * Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
 */

#ifndef TINY_CPP_CLIENT_RealtimeServerEventError_H_
#define TINY_CPP_CLIENT_RealtimeServerEventError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RealtimeServerEventError_error.h"

namespace Tiny {


/*! \brief Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventError{
public:

    /*! \brief Constructor.
	 */
    RealtimeServerEventError();
    RealtimeServerEventError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeServerEventError();


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
	/*! \brief Get The event type, must be `error`.
	 */
	std::string getType();

	/*! \brief Set The event type, must be `error`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	RealtimeServerEventError_error getError();

	/*! \brief Set 
	 */
	void setError(RealtimeServerEventError_error  error);


    private:
    std::string event_id{};
    std::string type{};
    RealtimeServerEventError_error error;
};
}

#endif /* TINY_CPP_CLIENT_RealtimeServerEventError_H_ */
