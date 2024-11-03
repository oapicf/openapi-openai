/*
 * create_message_request.h
 *
 * 
 */

#ifndef _create_message_request_H_
#define _create_message_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_message_request_t create_message_request_t;

#include "object.h"

// Enum ROLE for create_message_request

typedef enum  { openai_api_create_message_request_ROLE_NULL = 0, openai_api_create_message_request_ROLE_user, openai_api_create_message_request_ROLE_assistant } openai_api_create_message_request_ROLE_e;

char* create_message_request_role_ToString(openai_api_create_message_request_ROLE_e role);

openai_api_create_message_request_ROLE_e create_message_request_role_FromString(char* role);



typedef struct create_message_request_t {
    openai_api_create_message_request_ROLE_e role; //enum
    char *content; // string
    list_t *file_ids; //primitive container
    object_t *metadata; //object

} create_message_request_t;

create_message_request_t *create_message_request_create(
    openai_api_create_message_request_ROLE_e role,
    char *content,
    list_t *file_ids,
    object_t *metadata
);

void create_message_request_free(create_message_request_t *create_message_request);

create_message_request_t *create_message_request_parseFromJSON(cJSON *create_message_requestJSON);

cJSON *create_message_request_convertToJSON(create_message_request_t *create_message_request);

#endif /* _create_message_request_H_ */

