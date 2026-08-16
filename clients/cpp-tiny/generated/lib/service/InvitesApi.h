#ifndef TINY_CPP_CLIENT_InvitesApi_H_
#define TINY_CPP_CLIENT_InvitesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Invite.h"
#include "InviteDeleteResponse.h"
#include "InviteListResponse.h"
#include "InviteRequest.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class InvitesApi : public Service {
public:
    InvitesApi() = default;

    virtual ~InvitesApi() = default;

    /**
    * Delete an invite. If the invite has already been accepted, it cannot be deleted..
    *
    * 
    * \param inviteId The ID of the invite to delete. *Required*
    */
    Response<
                InviteDeleteResponse
        >
    deleteInvite(
            
            std::string inviteId
            
    );
    /**
    * Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization..
    *
    * 
    * \param inviteRequest The invite request payload. *Required*
    */
    Response<
                Invite
        >
    inviteUser(
            
            InviteRequest inviteRequest
            
    );
    /**
    * Returns a list of invites in the organization..
    *
    * 
    * \param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    * \param after A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list. 
    */
    Response<
                InviteListResponse
        >
    listInvites(
            
            int limit
            , 
            
            std::string after
            
    );
    /**
    * Retrieves an invite..
    *
    * 
    * \param inviteId The ID of the invite to retrieve. *Required*
    */
    Response<
                Invite
        >
    retrieveInvite(
            
            std::string inviteId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_InvitesApi_H_ */