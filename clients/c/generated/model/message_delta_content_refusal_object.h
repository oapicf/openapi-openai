/*
 * message_delta_content_refusal_object.h
 *
 * The refusal content that is part of a message.
 */

#ifndef _message_delta_content_refusal_object_H_
#define _message_delta_content_refusal_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_delta_content_refusal_object_t message_delta_content_refusal_object_t;


// Enum TYPE for message_delta_content_refusal_object

typedef enum  { openai_api_message_delta_content_refusal_object_TYPE_NULL = 0, openai_api_message_delta_content_refusal_object_TYPE_refusal } openai_api_message_delta_content_refusal_object_TYPE_e;

char* message_delta_content_refusal_object_type_ToString(openai_api_message_delta_content_refusal_object_TYPE_e type);

openai_api_message_delta_content_refusal_object_TYPE_e message_delta_content_refusal_object_type_FromString(char* type);



typedef struct message_delta_content_refusal_object_t {
    int index; //numeric
    openai_api_message_delta_content_refusal_object_TYPE_e type; //enum
    char *refusal; // string

    int _library_owned; // Is the library responsible for freeing this object?
} message_delta_content_refusal_object_t;

__attribute__((deprecated)) message_delta_content_refusal_object_t *message_delta_content_refusal_object_create(
    int index,
    openai_api_message_delta_content_refusal_object_TYPE_e type,
    char *refusal
);

void message_delta_content_refusal_object_free(message_delta_content_refusal_object_t *message_delta_content_refusal_object);

message_delta_content_refusal_object_t *message_delta_content_refusal_object_parseFromJSON(cJSON *message_delta_content_refusal_objectJSON);

cJSON *message_delta_content_refusal_object_convertToJSON(message_delta_content_refusal_object_t *message_delta_content_refusal_object);

#endif /* _message_delta_content_refusal_object_H_ */

