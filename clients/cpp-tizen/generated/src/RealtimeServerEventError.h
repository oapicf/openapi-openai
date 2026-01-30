/*
 * RealtimeServerEventError.h
 *
 * Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
 */

#ifndef _RealtimeServerEventError_H_
#define _RealtimeServerEventError_H_


#include <string>
#include "RealtimeServerEventError_error.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
 *
 *  \ingroup Models
 *
 */

class RealtimeServerEventError : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeServerEventError();
	RealtimeServerEventError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeServerEventError();

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
	std::string event_id;
	std::string type;
	RealtimeServerEventError_error error;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeServerEventError_H_ */
