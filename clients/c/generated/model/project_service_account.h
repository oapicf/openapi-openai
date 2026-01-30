/*
 * project_service_account.h
 *
 * Represents an individual service account in a project.
 */

#ifndef _project_service_account_H_
#define _project_service_account_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct project_service_account_t project_service_account_t;


// Enum OBJECT for project_service_account

typedef enum  { openai_api_project_service_account_OBJECT_NULL = 0, openai_api_project_service_account_OBJECT_organization.project.service_account } openai_api_project_service_account_OBJECT_e;

char* project_service_account_object_ToString(openai_api_project_service_account_OBJECT_e object);

openai_api_project_service_account_OBJECT_e project_service_account_object_FromString(char* object);

// Enum ROLE for project_service_account

typedef enum  { openai_api_project_service_account_ROLE_NULL = 0, openai_api_project_service_account_ROLE_owner, openai_api_project_service_account_ROLE_member } openai_api_project_service_account_ROLE_e;

char* project_service_account_role_ToString(openai_api_project_service_account_ROLE_e role);

openai_api_project_service_account_ROLE_e project_service_account_role_FromString(char* role);



typedef struct project_service_account_t {
    openai_api_project_service_account_OBJECT_e object; //enum
    char *id; // string
    char *name; // string
    openai_api_project_service_account_ROLE_e role; //enum
    int created_at; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} project_service_account_t;

__attribute__((deprecated)) project_service_account_t *project_service_account_create(
    openai_api_project_service_account_OBJECT_e object,
    char *id,
    char *name,
    openai_api_project_service_account_ROLE_e role,
    int created_at
);

void project_service_account_free(project_service_account_t *project_service_account);

project_service_account_t *project_service_account_parseFromJSON(cJSON *project_service_accountJSON);

cJSON *project_service_account_convertToJSON(project_service_account_t *project_service_account);

#endif /* _project_service_account_H_ */

