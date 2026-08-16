
/*
 * RealtimeResponse_status_details.h
 *
 * Additional details about the status.
 */

#ifndef TINY_CPP_CLIENT_RealtimeResponse_status_details_H_
#define TINY_CPP_CLIENT_RealtimeResponse_status_details_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RealtimeResponse_status_details_error.h"

namespace Tiny {


/*! \brief Additional details about the status.
 *
 *  \ingroup Models
 *
 */

class RealtimeResponse_status_details{
public:

    /*! \brief Constructor.
	 */
    RealtimeResponse_status_details();
    RealtimeResponse_status_details(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeResponse_status_details();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string type{};
    std::string reason{};
    RealtimeResponse_status_details_error error;
};
}

#endif /* TINY_CPP_CLIENT_RealtimeResponse_status_details_H_ */
