/*
 * invite_projects_inner.h
 *
 * 
 */

#ifndef _invite_projects_inner_H_
#define _invite_projects_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_projects_inner_t invite_projects_inner_t;


// Enum ROLE for invite_projects_inner

typedef enum  { openai_api_invite_projects_inner_ROLE_NULL = 0, openai_api_invite_projects_inner_ROLE_member, openai_api_invite_projects_inner_ROLE_owner } openai_api_invite_projects_inner_ROLE_e;

char* invite_projects_inner_role_ToString(openai_api_invite_projects_inner_ROLE_e role);

openai_api_invite_projects_inner_ROLE_e invite_projects_inner_role_FromString(char* role);



typedef struct invite_projects_inner_t {
    char *id; // string
    openai_api_invite_projects_inner_ROLE_e role; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} invite_projects_inner_t;

__attribute__((deprecated)) invite_projects_inner_t *invite_projects_inner_create(
    char *id,
    openai_api_invite_projects_inner_ROLE_e role
);

void invite_projects_inner_free(invite_projects_inner_t *invite_projects_inner);

invite_projects_inner_t *invite_projects_inner_parseFromJSON(cJSON *invite_projects_innerJSON);

cJSON *invite_projects_inner_convertToJSON(invite_projects_inner_t *invite_projects_inner);

#endif /* _invite_projects_inner_H_ */

