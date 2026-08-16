
/*
 * RealtimeSessionCreateResponse_client_secret.h
 *
 * Ephemeral key returned by the API.
 */

#ifndef TINY_CPP_CLIENT_RealtimeSessionCreateResponse_client_secret_H_
#define TINY_CPP_CLIENT_RealtimeSessionCreateResponse_client_secret_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Ephemeral key returned by the API.
 *
 *  \ingroup Models
 *
 */

class RealtimeSessionCreateResponse_client_secret{
public:

    /*! \brief Constructor.
	 */
    RealtimeSessionCreateResponse_client_secret();
    RealtimeSessionCreateResponse_client_secret(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RealtimeSessionCreateResponse_client_secret();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
	 */
	std::string getValue();

	/*! \brief Set Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
	 */
	void setValue(std::string  value);
	/*! \brief Get Timestamp for when the token expires. Currently, all tokens expire after one minute. 
	 */
	int getExpiresAt();

	/*! \brief Set Timestamp for when the token expires. Currently, all tokens expire after one minute. 
	 */
	void setExpiresAt(int  expires_at);


    private:
    std::string value{};
    int expires_at{};
};
}

#endif /* TINY_CPP_CLIENT_RealtimeSessionCreateResponse_client_secret_H_ */
