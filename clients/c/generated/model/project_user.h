/*
 * project_user.h
 *
 * Represents an individual user in a project.
 */

#ifndef _project_user_H_
#define _project_user_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct project_user_t project_user_t;


// Enum OBJECT for project_user

typedef enum  { openai_api_project_user_OBJECT_NULL = 0, openai_api_project_user_OBJECT_organization.project.user } openai_api_project_user_OBJECT_e;

char* project_user_object_ToString(openai_api_project_user_OBJECT_e object);

openai_api_project_user_OBJECT_e project_user_object_FromString(char* object);

// Enum ROLE for project_user

typedef enum  { openai_api_project_user_ROLE_NULL = 0, openai_api_project_user_ROLE_owner, openai_api_project_user_ROLE_member } openai_api_project_user_ROLE_e;

char* project_user_role_ToString(openai_api_project_user_ROLE_e role);

openai_api_project_user_ROLE_e project_user_role_FromString(char* role);



typedef struct project_user_t {
    openai_api_project_user_OBJECT_e object; //enum
    char *id; // string
    char *name; // string
    char *email; // string
    openai_api_project_user_ROLE_e role; //enum
    int added_at; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} project_user_t;

__attribute__((deprecated)) project_user_t *project_user_create(
    openai_api_project_user_OBJECT_e object,
    char *id,
    char *name,
    char *email,
    openai_api_project_user_ROLE_e role,
    int added_at
);

void project_user_free(project_user_t *project_user);

project_user_t *project_user_parseFromJSON(cJSON *project_userJSON);

cJSON *project_user_convertToJSON(project_user_t *project_user);

#endif /* _project_user_H_ */

