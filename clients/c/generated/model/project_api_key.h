/*
 * project_api_key.h
 *
 * Represents an individual API key in a project.
 */

#ifndef _project_api_key_H_
#define _project_api_key_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct project_api_key_t project_api_key_t;

#include "project_api_key_owner.h"

// Enum OBJECT for project_api_key

typedef enum  { openai_api_project_api_key_OBJECT_NULL = 0, openai_api_project_api_key_OBJECT_organization.project.api_key } openai_api_project_api_key_OBJECT_e;

char* project_api_key_object_ToString(openai_api_project_api_key_OBJECT_e object);

openai_api_project_api_key_OBJECT_e project_api_key_object_FromString(char* object);



typedef struct project_api_key_t {
    openai_api_project_api_key_OBJECT_e object; //enum
    char *redacted_value; // string
    char *name; // string
    int created_at; //numeric
    char *id; // string
    struct project_api_key_owner_t *owner; //model

    int _library_owned; // Is the library responsible for freeing this object?
} project_api_key_t;

__attribute__((deprecated)) project_api_key_t *project_api_key_create(
    openai_api_project_api_key_OBJECT_e object,
    char *redacted_value,
    char *name,
    int created_at,
    char *id,
    project_api_key_owner_t *owner
);

void project_api_key_free(project_api_key_t *project_api_key);

project_api_key_t *project_api_key_parseFromJSON(cJSON *project_api_keyJSON);

cJSON *project_api_key_convertToJSON(project_api_key_t *project_api_key);

#endif /* _project_api_key_H_ */

