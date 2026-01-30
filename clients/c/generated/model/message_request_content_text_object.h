/*
 * message_request_content_text_object.h
 *
 * The text content that is part of a message.
 */

#ifndef _message_request_content_text_object_H_
#define _message_request_content_text_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_request_content_text_object_t message_request_content_text_object_t;


// Enum TYPE for message_request_content_text_object

typedef enum  { openai_api_message_request_content_text_object_TYPE_NULL = 0, openai_api_message_request_content_text_object_TYPE_text } openai_api_message_request_content_text_object_TYPE_e;

char* message_request_content_text_object_type_ToString(openai_api_message_request_content_text_object_TYPE_e type);

openai_api_message_request_content_text_object_TYPE_e message_request_content_text_object_type_FromString(char* type);



typedef struct message_request_content_text_object_t {
    openai_api_message_request_content_text_object_TYPE_e type; //enum
    char *text; // string

    int _library_owned; // Is the library responsible for freeing this object?
} message_request_content_text_object_t;

__attribute__((deprecated)) message_request_content_text_object_t *message_request_content_text_object_create(
    openai_api_message_request_content_text_object_TYPE_e type,
    char *text
);

void message_request_content_text_object_free(message_request_content_text_object_t *message_request_content_text_object);

message_request_content_text_object_t *message_request_content_text_object_parseFromJSON(cJSON *message_request_content_text_objectJSON);

cJSON *message_request_content_text_object_convertToJSON(message_request_content_text_object_t *message_request_content_text_object);

#endif /* _message_request_content_text_object_H_ */

