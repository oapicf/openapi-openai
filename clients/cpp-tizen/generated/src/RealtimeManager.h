#ifndef _RealtimeManager_H_
#define _RealtimeManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "RealtimeSessionCreateRequest.h"
#include "RealtimeSessionCreateResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Realtime Realtime
 * \ingroup Operations
 *  @{
 */
class RealtimeManager {
public:
	RealtimeManager();
	virtual ~RealtimeManager();

/*! \brief Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. . *Synchronous*
 *
 * 
 * \param realtimeSessionCreateRequest Create an ephemeral API key with the given session configuration. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createRealtimeSessionSync(char * accessToken,
	std::shared_ptr<RealtimeSessionCreateRequest> realtimeSessionCreateRequest, 
	void(* handler)(RealtimeSessionCreateResponse, Error, void* )
	, void* userData);

/*! \brief Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the `session.update` client event.  It responds with a session object, plus a `client_secret` key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. . *Asynchronous*
 *
 * 
 * \param realtimeSessionCreateRequest Create an ephemeral API key with the given session configuration. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createRealtimeSessionAsync(char * accessToken,
	std::shared_ptr<RealtimeSessionCreateRequest> realtimeSessionCreateRequest, 
	void(* handler)(RealtimeSessionCreateResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* RealtimeManager_H_ */
