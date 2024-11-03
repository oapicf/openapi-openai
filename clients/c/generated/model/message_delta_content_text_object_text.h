/*
 * message_delta_content_text_object_text.h
 *
 * 
 */

#ifndef _message_delta_content_text_object_text_H_
#define _message_delta_content_text_object_text_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_delta_content_text_object_text_t message_delta_content_text_object_text_t;

#include "message_delta_content_text_object_text_annotations_inner.h"



typedef struct message_delta_content_text_object_text_t {
    char *value; // string
    list_t *annotations; //nonprimitive container

} message_delta_content_text_object_text_t;

message_delta_content_text_object_text_t *message_delta_content_text_object_text_create(
    char *value,
    list_t *annotations
);

void message_delta_content_text_object_text_free(message_delta_content_text_object_text_t *message_delta_content_text_object_text);

message_delta_content_text_object_text_t *message_delta_content_text_object_text_parseFromJSON(cJSON *message_delta_content_text_object_textJSON);

cJSON *message_delta_content_text_object_text_convertToJSON(message_delta_content_text_object_text_t *message_delta_content_text_object_text);

#endif /* _message_delta_content_text_object_text_H_ */

