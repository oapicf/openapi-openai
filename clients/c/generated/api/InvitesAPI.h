#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/invite.h"
#include "../model/invite_delete_response.h"
#include "../model/invite_list_response.h"
#include "../model/invite_request.h"


// Delete an invite. If the invite has already been accepted, it cannot be deleted.
//
invite_delete_response_t*
InvitesAPI_deleteInvite(apiClient_t *apiClient, char *invite_id);


// Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
//
invite_t*
InvitesAPI_inviteUser(apiClient_t *apiClient, invite_request_t *invite_request);


// Returns a list of invites in the organization.
//
invite_list_response_t*
InvitesAPI_listInvites(apiClient_t *apiClient, int *limit, char *after);


// Retrieves an invite.
//
invite_t*
InvitesAPI_retrieveInvite(apiClient_t *apiClient, char *invite_id);


