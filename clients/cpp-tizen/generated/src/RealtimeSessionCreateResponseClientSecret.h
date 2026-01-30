/*
 * RealtimeSessionCreateResponse_client_secret.h
 *
 * Ephemeral key returned by the API.
 */

#ifndef _RealtimeSessionCreateResponse_client_secret_H_
#define _RealtimeSessionCreateResponse_client_secret_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ephemeral key returned by the API.
 *
 *  \ingroup Models
 *
 */

class RealtimeSessionCreateResponse_client_secret : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeSessionCreateResponse_client_secret();
	RealtimeSessionCreateResponse_client_secret(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeSessionCreateResponse_client_secret();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string value;
	int expires_at;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RealtimeSessionCreateResponse_client_secret_H_ */
