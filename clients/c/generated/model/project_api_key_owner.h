/*
 * project_api_key_owner.h
 *
 * 
 */

#ifndef _project_api_key_owner_H_
#define _project_api_key_owner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct project_api_key_owner_t project_api_key_owner_t;

#include "project_service_account.h"
#include "project_user.h"

// Enum TYPE for project_api_key_owner

typedef enum  { openai_api_project_api_key_owner_TYPE_NULL = 0, openai_api_project_api_key_owner_TYPE_user, openai_api_project_api_key_owner_TYPE_service_account } openai_api_project_api_key_owner_TYPE_e;

char* project_api_key_owner_type_ToString(openai_api_project_api_key_owner_TYPE_e type);

openai_api_project_api_key_owner_TYPE_e project_api_key_owner_type_FromString(char* type);



typedef struct project_api_key_owner_t {
    openai_api_project_api_key_owner_TYPE_e type; //enum
    struct project_user_t *user; //model
    struct project_service_account_t *service_account; //model

    int _library_owned; // Is the library responsible for freeing this object?
} project_api_key_owner_t;

__attribute__((deprecated)) project_api_key_owner_t *project_api_key_owner_create(
    openai_api_project_api_key_owner_TYPE_e type,
    project_user_t *user,
    project_service_account_t *service_account
);

void project_api_key_owner_free(project_api_key_owner_t *project_api_key_owner);

project_api_key_owner_t *project_api_key_owner_parseFromJSON(cJSON *project_api_key_ownerJSON);

cJSON *project_api_key_owner_convertToJSON(project_api_key_owner_t *project_api_key_owner);

#endif /* _project_api_key_owner_H_ */

