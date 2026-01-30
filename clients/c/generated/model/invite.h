/*
 * invite.h
 *
 * Represents an individual &#x60;invite&#x60; to the organization.
 */

#ifndef _invite_H_
#define _invite_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_t invite_t;

#include "invite_projects_inner.h"

// Enum OBJECT for invite

typedef enum  { openai_api_invite_OBJECT_NULL = 0, openai_api_invite_OBJECT_organization.invite } openai_api_invite_OBJECT_e;

char* invite_object_ToString(openai_api_invite_OBJECT_e object);

openai_api_invite_OBJECT_e invite_object_FromString(char* object);

// Enum ROLE for invite

typedef enum  { openai_api_invite_ROLE_NULL = 0, openai_api_invite_ROLE_owner, openai_api_invite_ROLE_reader } openai_api_invite_ROLE_e;

char* invite_role_ToString(openai_api_invite_ROLE_e role);

openai_api_invite_ROLE_e invite_role_FromString(char* role);

// Enum STATUS for invite

typedef enum  { openai_api_invite_STATUS_NULL = 0, openai_api_invite_STATUS_accepted, openai_api_invite_STATUS_expired, openai_api_invite_STATUS_pending } openai_api_invite_STATUS_e;

char* invite_status_ToString(openai_api_invite_STATUS_e status);

openai_api_invite_STATUS_e invite_status_FromString(char* status);



typedef struct invite_t {
    openai_api_invite_OBJECT_e object; //enum
    char *id; // string
    char *email; // string
    openai_api_invite_ROLE_e role; //enum
    openai_api_invite_STATUS_e status; //enum
    int invited_at; //numeric
    int expires_at; //numeric
    int accepted_at; //numeric
    list_t *projects; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} invite_t;

__attribute__((deprecated)) invite_t *invite_create(
    openai_api_invite_OBJECT_e object,
    char *id,
    char *email,
    openai_api_invite_ROLE_e role,
    openai_api_invite_STATUS_e status,
    int invited_at,
    int expires_at,
    int accepted_at,
    list_t *projects
);

void invite_free(invite_t *invite);

invite_t *invite_parseFromJSON(cJSON *inviteJSON);

cJSON *invite_convertToJSON(invite_t *invite);

#endif /* _invite_H_ */

