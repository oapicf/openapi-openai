/*
 * user_delete_response.h
 *
 * 
 */

#ifndef _user_delete_response_H_
#define _user_delete_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_delete_response_t user_delete_response_t;


// Enum OBJECT for user_delete_response

typedef enum  { openai_api_user_delete_response_OBJECT_NULL = 0, openai_api_user_delete_response_OBJECT_organization.user.deleted } openai_api_user_delete_response_OBJECT_e;

char* user_delete_response_object_ToString(openai_api_user_delete_response_OBJECT_e object);

openai_api_user_delete_response_OBJECT_e user_delete_response_object_FromString(char* object);



typedef struct user_delete_response_t {
    openai_api_user_delete_response_OBJECT_e object; //enum
    char *id; // string
    int deleted; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} user_delete_response_t;

__attribute__((deprecated)) user_delete_response_t *user_delete_response_create(
    openai_api_user_delete_response_OBJECT_e object,
    char *id,
    int deleted
);

void user_delete_response_free(user_delete_response_t *user_delete_response);

user_delete_response_t *user_delete_response_parseFromJSON(cJSON *user_delete_responseJSON);

cJSON *user_delete_response_convertToJSON(user_delete_response_t *user_delete_response);

#endif /* _user_delete_response_H_ */

