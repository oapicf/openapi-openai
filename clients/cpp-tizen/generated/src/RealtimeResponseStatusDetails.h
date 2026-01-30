/*
 * RealtimeResponse_status_details.h
 *
 * Additional details about the status.
 */

#ifndef _RealtimeResponse_status_details_H_
#define _RealtimeResponse_status_details_H_


#include <string>
#include "RealtimeResponse_status_details_error.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Additional details about the status.
 *
 *  \ingroup Models
 *
 */

class RealtimeResponse_status_details : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeResponse_status_details();
	RealtimeResponse_status_details(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeResponse_status_details();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
	 */
	std::string getType();

	/*! \brief Set The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
	 */
	void setType(std::string  type);
	/*! \brief Get The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
	 */
	std::string getReason();

	/*! \brief Set The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
	 */
	void setReason(std::string  reason);
	/*! \brief Get 
	 */
	RealtimeResponse_status_details_error getError();

	/*! \brief Set 
	 */
	void setError(RealtimeResponse_status_details_error  error);

private:
	std::string type;
	std::string reason;
	RealtimeResponse_status_details_error error;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeResponse_status_details_H_ */
