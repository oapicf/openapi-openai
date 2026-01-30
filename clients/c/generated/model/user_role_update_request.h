/*
 * user_role_update_request.h
 *
 * 
 */

#ifndef _user_role_update_request_H_
#define _user_role_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_role_update_request_t user_role_update_request_t;


// Enum ROLE for user_role_update_request

typedef enum  { openai_api_user_role_update_request_ROLE_NULL = 0, openai_api_user_role_update_request_ROLE_owner, openai_api_user_role_update_request_ROLE_reader } openai_api_user_role_update_request_ROLE_e;

char* user_role_update_request_role_ToString(openai_api_user_role_update_request_ROLE_e role);

openai_api_user_role_update_request_ROLE_e user_role_update_request_role_FromString(char* role);



typedef struct user_role_update_request_t {
    openai_api_user_role_update_request_ROLE_e role; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} user_role_update_request_t;

__attribute__((deprecated)) user_role_update_request_t *user_role_update_request_create(
    openai_api_user_role_update_request_ROLE_e role
);

void user_role_update_request_free(user_role_update_request_t *user_role_update_request);

user_role_update_request_t *user_role_update_request_parseFromJSON(cJSON *user_role_update_requestJSON);

cJSON *user_role_update_request_convertToJSON(user_role_update_request_t *user_role_update_request);

#endif /* _user_role_update_request_H_ */

