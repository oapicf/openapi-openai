/*
 * user_list_response.h
 *
 * 
 */

#ifndef _user_list_response_H_
#define _user_list_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct user_list_response_t user_list_response_t;

#include "user.h"

// Enum OBJECT for user_list_response

typedef enum  { openai_api_user_list_response_OBJECT_NULL = 0, openai_api_user_list_response_OBJECT_list } openai_api_user_list_response_OBJECT_e;

char* user_list_response_object_ToString(openai_api_user_list_response_OBJECT_e object);

openai_api_user_list_response_OBJECT_e user_list_response_object_FromString(char* object);



typedef struct user_list_response_t {
    openai_api_user_list_response_OBJECT_e object; //enum
    list_t *data; //nonprimitive container
    char *first_id; // string
    char *last_id; // string
    int has_more; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} user_list_response_t;

__attribute__((deprecated)) user_list_response_t *user_list_response_create(
    openai_api_user_list_response_OBJECT_e object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
);

void user_list_response_free(user_list_response_t *user_list_response);

user_list_response_t *user_list_response_parseFromJSON(cJSON *user_list_responseJSON);

cJSON *user_list_response_convertToJSON(user_list_response_t *user_list_response);

#endif /* _user_list_response_H_ */

