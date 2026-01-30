/*
 * user.h
 *
 * Represents an individual &#x60;user&#x60; within an organization.
 */

#ifndef _user_H_
#define _user_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_t user_t;


// Enum OBJECT for user

typedef enum  { openai_api_user_OBJECT_NULL = 0, openai_api_user_OBJECT_organization.user } openai_api_user_OBJECT_e;

char* user_object_ToString(openai_api_user_OBJECT_e object);

openai_api_user_OBJECT_e user_object_FromString(char* object);

// Enum ROLE for user

typedef enum  { openai_api_user_ROLE_NULL = 0, openai_api_user_ROLE_owner, openai_api_user_ROLE_reader } openai_api_user_ROLE_e;

char* user_role_ToString(openai_api_user_ROLE_e role);

openai_api_user_ROLE_e user_role_FromString(char* role);



typedef struct user_t {
    openai_api_user_OBJECT_e object; //enum
    char *id; // string
    char *name; // string
    char *email; // string
    openai_api_user_ROLE_e role; //enum
    int added_at; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} user_t;

__attribute__((deprecated)) user_t *user_create(
    openai_api_user_OBJECT_e object,
    char *id,
    char *name,
    char *email,
    openai_api_user_ROLE_e role,
    int added_at
);

void user_free(user_t *user);

user_t *user_parseFromJSON(cJSON *userJSON);

cJSON *user_convertToJSON(user_t *user);

#endif /* _user_H_ */

