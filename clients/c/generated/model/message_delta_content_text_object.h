/*
 * message_delta_content_text_object.h
 *
 * The text content that is part of a message.
 */

#ifndef _message_delta_content_text_object_H_
#define _message_delta_content_text_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_delta_content_text_object_t message_delta_content_text_object_t;

#include "message_delta_content_text_object_text.h"

// Enum TYPE for message_delta_content_text_object

typedef enum  { openai_api_message_delta_content_text_object_TYPE_NULL = 0, openai_api_message_delta_content_text_object_TYPE_text } openai_api_message_delta_content_text_object_TYPE_e;

char* message_delta_content_text_object_type_ToString(openai_api_message_delta_content_text_object_TYPE_e type);

openai_api_message_delta_content_text_object_TYPE_e message_delta_content_text_object_type_FromString(char* type);



typedef struct message_delta_content_text_object_t {
    int index; //numeric
    openai_api_message_delta_content_text_object_TYPE_e type; //enum
    struct message_delta_content_text_object_text_t *text; //model

} message_delta_content_text_object_t;

message_delta_content_text_object_t *message_delta_content_text_object_create(
    int index,
    openai_api_message_delta_content_text_object_TYPE_e type,
    message_delta_content_text_object_text_t *text
);

void message_delta_content_text_object_free(message_delta_content_text_object_t *message_delta_content_text_object);

message_delta_content_text_object_t *message_delta_content_text_object_parseFromJSON(cJSON *message_delta_content_text_objectJSON);

cJSON *message_delta_content_text_object_convertToJSON(message_delta_content_text_object_t *message_delta_content_text_object);

#endif /* _message_delta_content_text_object_H_ */

