#ifndef _InvitesManager_H_
#define _InvitesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Invite.h"
#include "InviteDeleteResponse.h"
#include "InviteListResponse.h"
#include "InviteRequest.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Invites Invites
 * \ingroup Operations
 *  @{
 */
class InvitesManager {
public:
	InvitesManager();
	virtual ~InvitesManager();

/*! \brief Delete an invite. If the invite has already been accepted, it cannot be deleted.. *Synchronous*
 *
 * 
 * \param inviteId The ID of the invite to delete. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteInviteSync(char * accessToken,
	std::string inviteId, 
	void(* handler)(InviteDeleteResponse, Error, void* )
	, void* userData);

/*! \brief Delete an invite. If the invite has already been accepted, it cannot be deleted.. *Asynchronous*
 *
 * 
 * \param inviteId The ID of the invite to delete. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteInviteAsync(char * accessToken,
	std::string inviteId, 
	void(* handler)(InviteDeleteResponse, Error, void* )
	, void* userData);


/*! \brief Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.. *Synchronous*
 *
 * 
 * \param inviteRequest The invite request payload. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool inviteUserSync(char * accessToken,
	std::shared_ptr<InviteRequest> inviteRequest, 
	void(* handler)(Invite, Error, void* )
	, void* userData);

/*! \brief Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.. *Asynchronous*
 *
 * 
 * \param inviteRequest The invite request payload. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool inviteUserAsync(char * accessToken,
	std::shared_ptr<InviteRequest> inviteRequest, 
	void(* handler)(Invite, Error, void* )
	, void* userData);


/*! \brief Returns a list of invites in the organization.. *Synchronous*
 *
 * 
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listInvitesSync(char * accessToken,
	int limit, std::string after, 
	void(* handler)(InviteListResponse, Error, void* )
	, void* userData);

/*! \brief Returns a list of invites in the organization.. *Asynchronous*
 *
 * 
 * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
 * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listInvitesAsync(char * accessToken,
	int limit, std::string after, 
	void(* handler)(InviteListResponse, Error, void* )
	, void* userData);


/*! \brief Retrieves an invite.. *Synchronous*
 *
 * 
 * \param inviteId The ID of the invite to retrieve. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveInviteSync(char * accessToken,
	std::string inviteId, 
	void(* handler)(Invite, Error, void* )
	, void* userData);

/*! \brief Retrieves an invite.. *Asynchronous*
 *
 * 
 * \param inviteId The ID of the invite to retrieve. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool retrieveInviteAsync(char * accessToken,
	std::string inviteId, 
	void(* handler)(Invite, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* InvitesManager_H_ */
