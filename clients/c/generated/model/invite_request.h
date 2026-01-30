/*
 * invite_request.h
 *
 * 
 */

#ifndef _invite_request_H_
#define _invite_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_request_t invite_request_t;

#include "invite_request_projects_inner.h"

// Enum ROLE for invite_request

typedef enum  { openai_api_invite_request_ROLE_NULL = 0, openai_api_invite_request_ROLE_reader, openai_api_invite_request_ROLE_owner } openai_api_invite_request_ROLE_e;

char* invite_request_role_ToString(openai_api_invite_request_ROLE_e role);

openai_api_invite_request_ROLE_e invite_request_role_FromString(char* role);



typedef struct invite_request_t {
    char *email; // string
    openai_api_invite_request_ROLE_e role; //enum
    list_t *projects; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} invite_request_t;

__attribute__((deprecated)) invite_request_t *invite_request_create(
    char *email,
    openai_api_invite_request_ROLE_e role,
    list_t *projects
);

void invite_request_free(invite_request_t *invite_request);

invite_request_t *invite_request_parseFromJSON(cJSON *invite_requestJSON);

cJSON *invite_request_convertToJSON(invite_request_t *invite_request);

#endif /* _invite_request_H_ */

