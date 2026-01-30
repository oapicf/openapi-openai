/*
 * project_service_account_api_key.h
 *
 * 
 */

#ifndef _project_service_account_api_key_H_
#define _project_service_account_api_key_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct project_service_account_api_key_t project_service_account_api_key_t;


// Enum OBJECT for project_service_account_api_key

typedef enum  { openai_api_project_service_account_api_key_OBJECT_NULL = 0, openai_api_project_service_account_api_key_OBJECT_organization.project.service_account.api_key } openai_api_project_service_account_api_key_OBJECT_e;

char* project_service_account_api_key_object_ToString(openai_api_project_service_account_api_key_OBJECT_e object);

openai_api_project_service_account_api_key_OBJECT_e project_service_account_api_key_object_FromString(char* object);



typedef struct project_service_account_api_key_t {
    openai_api_project_service_account_api_key_OBJECT_e object; //enum
    char *value; // string
    char *name; // string
    int created_at; //numeric
    char *id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} project_service_account_api_key_t;

__attribute__((deprecated)) project_service_account_api_key_t *project_service_account_api_key_create(
    openai_api_project_service_account_api_key_OBJECT_e object,
    char *value,
    char *name,
    int created_at,
    char *id
);

void project_service_account_api_key_free(project_service_account_api_key_t *project_service_account_api_key);

project_service_account_api_key_t *project_service_account_api_key_parseFromJSON(cJSON *project_service_account_api_keyJSON);

cJSON *project_service_account_api_key_convertToJSON(project_service_account_api_key_t *project_service_account_api_key);

#endif /* _project_service_account_api_key_H_ */

