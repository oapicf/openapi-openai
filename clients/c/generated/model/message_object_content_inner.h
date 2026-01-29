/*
 * message_object_content_inner.h
 *
 * 
 */

#ifndef _message_object_content_inner_H_
#define _message_object_content_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_object_content_inner_t message_object_content_inner_t;

#include "message_content_image_file_object.h"
#include "message_content_image_file_object_image_file.h"
#include "message_content_text_object.h"
#include "message_content_text_object_text.h"

// Enum TYPE for message_object_content_inner

typedef enum  { openai_api_message_object_content_inner_TYPE_NULL = 0, openai_api_message_object_content_inner_TYPE_image_file, openai_api_message_object_content_inner_TYPE_text } openai_api_message_object_content_inner_TYPE_e;

char* message_object_content_inner_type_ToString(openai_api_message_object_content_inner_TYPE_e type);

openai_api_message_object_content_inner_TYPE_e message_object_content_inner_type_FromString(char* type);



typedef struct message_object_content_inner_t {
    openai_api_message_object_content_inner_TYPE_e type; //enum
    struct message_content_image_file_object_image_file_t *image_file; //model
    struct message_content_text_object_text_t *text; //model

    int _library_owned; // Is the library responsible for freeing this object?
} message_object_content_inner_t;

__attribute__((deprecated)) message_object_content_inner_t *message_object_content_inner_create(
    openai_api_message_object_content_inner_TYPE_e type,
    message_content_image_file_object_image_file_t *image_file,
    message_content_text_object_text_t *text
);

void message_object_content_inner_free(message_object_content_inner_t *message_object_content_inner);

message_object_content_inner_t *message_object_content_inner_parseFromJSON(cJSON *message_object_content_innerJSON);

cJSON *message_object_content_inner_convertToJSON(message_object_content_inner_t *message_object_content_inner);

#endif /* _message_object_content_inner_H_ */

