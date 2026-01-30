/*
 * message_delta_object_delta_content_inner.h
 *
 * 
 */

#ifndef _message_delta_object_delta_content_inner_H_
#define _message_delta_object_delta_content_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_delta_object_delta_content_inner_t message_delta_object_delta_content_inner_t;

#include "message_delta_content_image_file_object.h"
#include "message_delta_content_image_file_object_image_file.h"
#include "message_delta_content_image_url_object.h"
#include "message_delta_content_image_url_object_image_url.h"
#include "message_delta_content_refusal_object.h"
#include "message_delta_content_text_object.h"
#include "message_delta_content_text_object_text.h"

// Enum TYPE for message_delta_object_delta_content_inner

typedef enum  { openai_api_message_delta_object_delta_content_inner_TYPE_NULL = 0, openai_api_message_delta_object_delta_content_inner_TYPE_image_file, openai_api_message_delta_object_delta_content_inner_TYPE_text, openai_api_message_delta_object_delta_content_inner_TYPE_refusal, openai_api_message_delta_object_delta_content_inner_TYPE_image_url } openai_api_message_delta_object_delta_content_inner_TYPE_e;

char* message_delta_object_delta_content_inner_type_ToString(openai_api_message_delta_object_delta_content_inner_TYPE_e type);

openai_api_message_delta_object_delta_content_inner_TYPE_e message_delta_object_delta_content_inner_type_FromString(char* type);



typedef struct message_delta_object_delta_content_inner_t {
    int index; //numeric
    openai_api_message_delta_object_delta_content_inner_TYPE_e type; //enum
    struct message_delta_content_image_file_object_image_file_t *image_file; //model
    struct message_delta_content_text_object_text_t *text; //model
    char *refusal; // string
    struct message_delta_content_image_url_object_image_url_t *image_url; //model

    int _library_owned; // Is the library responsible for freeing this object?
} message_delta_object_delta_content_inner_t;

__attribute__((deprecated)) message_delta_object_delta_content_inner_t *message_delta_object_delta_content_inner_create(
    int index,
    openai_api_message_delta_object_delta_content_inner_TYPE_e type,
    message_delta_content_image_file_object_image_file_t *image_file,
    message_delta_content_text_object_text_t *text,
    char *refusal,
    message_delta_content_image_url_object_image_url_t *image_url
);

void message_delta_object_delta_content_inner_free(message_delta_object_delta_content_inner_t *message_delta_object_delta_content_inner);

message_delta_object_delta_content_inner_t *message_delta_object_delta_content_inner_parseFromJSON(cJSON *message_delta_object_delta_content_innerJSON);

cJSON *message_delta_object_delta_content_inner_convertToJSON(message_delta_object_delta_content_inner_t *message_delta_object_delta_content_inner);

#endif /* _message_delta_object_delta_content_inner_H_ */

