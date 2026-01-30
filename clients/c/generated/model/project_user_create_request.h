/*
 * project_user_create_request.h
 *
 * 
 */

#ifndef _project_user_create_request_H_
#define _project_user_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct project_user_create_request_t project_user_create_request_t;


// Enum ROLE for project_user_create_request

typedef enum  { openai_api_project_user_create_request_ROLE_NULL = 0, openai_api_project_user_create_request_ROLE_owner, openai_api_project_user_create_request_ROLE_member } openai_api_project_user_create_request_ROLE_e;

char* project_user_create_request_role_ToString(openai_api_project_user_create_request_ROLE_e role);

openai_api_project_user_create_request_ROLE_e project_user_create_request_role_FromString(char* role);



typedef struct project_user_create_request_t {
    char *user_id; // string
    openai_api_project_user_create_request_ROLE_e role; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} project_user_create_request_t;

__attribute__((deprecated)) project_user_create_request_t *project_user_create_request_create(
    char *user_id,
    openai_api_project_user_create_request_ROLE_e role
);

void project_user_create_request_free(project_user_create_request_t *project_user_create_request);

project_user_create_request_t *project_user_create_request_parseFromJSON(cJSON *project_user_create_requestJSON);

cJSON *project_user_create_request_convertToJSON(project_user_create_request_t *project_user_create_request);

#endif /* _project_user_create_request_H_ */

