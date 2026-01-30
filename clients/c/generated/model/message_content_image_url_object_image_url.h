/*
 * message_content_image_url_object_image_url.h
 *
 * 
 */

#ifndef _message_content_image_url_object_image_url_H_
#define _message_content_image_url_object_image_url_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_content_image_url_object_image_url_t message_content_image_url_object_image_url_t;


// Enum DETAIL for message_content_image_url_object_image_url

typedef enum  { openai_api_message_content_image_url_object_image_url_DETAIL_NULL = 0, openai_api_message_content_image_url_object_image_url_DETAIL__auto, openai_api_message_content_image_url_object_image_url_DETAIL_low, openai_api_message_content_image_url_object_image_url_DETAIL_high } openai_api_message_content_image_url_object_image_url_DETAIL_e;

char* message_content_image_url_object_image_url_detail_ToString(openai_api_message_content_image_url_object_image_url_DETAIL_e detail);

openai_api_message_content_image_url_object_image_url_DETAIL_e message_content_image_url_object_image_url_detail_FromString(char* detail);



typedef struct message_content_image_url_object_image_url_t {
    char *url; // string
    openai_api_message_content_image_url_object_image_url_DETAIL_e detail; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} message_content_image_url_object_image_url_t;

__attribute__((deprecated)) message_content_image_url_object_image_url_t *message_content_image_url_object_image_url_create(
    char *url,
    openai_api_message_content_image_url_object_image_url_DETAIL_e detail
);

void message_content_image_url_object_image_url_free(message_content_image_url_object_image_url_t *message_content_image_url_object_image_url);

message_content_image_url_object_image_url_t *message_content_image_url_object_image_url_parseFromJSON(cJSON *message_content_image_url_object_image_urlJSON);

cJSON *message_content_image_url_object_image_url_convertToJSON(message_content_image_url_object_image_url_t *message_content_image_url_object_image_url);

#endif /* _message_content_image_url_object_image_url_H_ */

