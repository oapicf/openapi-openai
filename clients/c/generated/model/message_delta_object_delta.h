/*
 * message_delta_object_delta.h
 *
 * The delta containing the fields that have changed on the Message.
 */

#ifndef _message_delta_object_delta_H_
#define _message_delta_object_delta_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_delta_object_delta_t message_delta_object_delta_t;

#include "message_delta_object_delta_content_inner.h"

// Enum ROLE for message_delta_object_delta

typedef enum  { openai_api_message_delta_object_delta_ROLE_NULL = 0, openai_api_message_delta_object_delta_ROLE_user, openai_api_message_delta_object_delta_ROLE_assistant } openai_api_message_delta_object_delta_ROLE_e;

char* message_delta_object_delta_role_ToString(openai_api_message_delta_object_delta_ROLE_e role);

openai_api_message_delta_object_delta_ROLE_e message_delta_object_delta_role_FromString(char* role);



typedef struct message_delta_object_delta_t {
    openai_api_message_delta_object_delta_ROLE_e role; //enum
    list_t *content; //nonprimitive container
    list_t *file_ids; //primitive container

} message_delta_object_delta_t;

message_delta_object_delta_t *message_delta_object_delta_create(
    openai_api_message_delta_object_delta_ROLE_e role,
    list_t *content,
    list_t *file_ids
);

void message_delta_object_delta_free(message_delta_object_delta_t *message_delta_object_delta);

message_delta_object_delta_t *message_delta_object_delta_parseFromJSON(cJSON *message_delta_object_deltaJSON);

cJSON *message_delta_object_delta_convertToJSON(message_delta_object_delta_t *message_delta_object_delta);

#endif /* _message_delta_object_delta_H_ */

