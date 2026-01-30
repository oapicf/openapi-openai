/*
 * project_service_account_create_response.h
 *
 * 
 */

#ifndef _project_service_account_create_response_H_
#define _project_service_account_create_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct project_service_account_create_response_t project_service_account_create_response_t;

#include "project_service_account_api_key.h"

// Enum OBJECT for project_service_account_create_response

typedef enum  { openai_api_project_service_account_create_response_OBJECT_NULL = 0, openai_api_project_service_account_create_response_OBJECT_organization.project.service_account } openai_api_project_service_account_create_response_OBJECT_e;

char* project_service_account_create_response_object_ToString(openai_api_project_service_account_create_response_OBJECT_e object);

openai_api_project_service_account_create_response_OBJECT_e project_service_account_create_response_object_FromString(char* object);

// Enum ROLE for project_service_account_create_response

typedef enum  { openai_api_project_service_account_create_response_ROLE_NULL = 0, openai_api_project_service_account_create_response_ROLE_member } openai_api_project_service_account_create_response_ROLE_e;

char* project_service_account_create_response_role_ToString(openai_api_project_service_account_create_response_ROLE_e role);

openai_api_project_service_account_create_response_ROLE_e project_service_account_create_response_role_FromString(char* role);



typedef struct project_service_account_create_response_t {
    openai_api_project_service_account_create_response_OBJECT_e object; //enum
    char *id; // string
    char *name; // string
    openai_api_project_service_account_create_response_ROLE_e role; //enum
    int created_at; //numeric
    struct project_service_account_api_key_t *api_key; //model

    int _library_owned; // Is the library responsible for freeing this object?
} project_service_account_create_response_t;

__attribute__((deprecated)) project_service_account_create_response_t *project_service_account_create_response_create(
    openai_api_project_service_account_create_response_OBJECT_e object,
    char *id,
    char *name,
    openai_api_project_service_account_create_response_ROLE_e role,
    int created_at,
    project_service_account_api_key_t *api_key
);

void project_service_account_create_response_free(project_service_account_create_response_t *project_service_account_create_response);

project_service_account_create_response_t *project_service_account_create_response_parseFromJSON(cJSON *project_service_account_create_responseJSON);

cJSON *project_service_account_create_response_convertToJSON(project_service_account_create_response_t *project_service_account_create_response);

#endif /* _project_service_account_create_response_H_ */

