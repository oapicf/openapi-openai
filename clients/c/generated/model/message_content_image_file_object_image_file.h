/*
 * message_content_image_file_object_image_file.h
 *
 * 
 */

#ifndef _message_content_image_file_object_image_file_H_
#define _message_content_image_file_object_image_file_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_content_image_file_object_image_file_t message_content_image_file_object_image_file_t;


// Enum DETAIL for message_content_image_file_object_image_file

typedef enum  { openai_api_message_content_image_file_object_image_file_DETAIL_NULL = 0, openai_api_message_content_image_file_object_image_file_DETAIL__auto, openai_api_message_content_image_file_object_image_file_DETAIL_low, openai_api_message_content_image_file_object_image_file_DETAIL_high } openai_api_message_content_image_file_object_image_file_DETAIL_e;

char* message_content_image_file_object_image_file_detail_ToString(openai_api_message_content_image_file_object_image_file_DETAIL_e detail);

openai_api_message_content_image_file_object_image_file_DETAIL_e message_content_image_file_object_image_file_detail_FromString(char* detail);



typedef struct message_content_image_file_object_image_file_t {
    char *file_id; // string
    openai_api_message_content_image_file_object_image_file_DETAIL_e detail; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} message_content_image_file_object_image_file_t;

__attribute__((deprecated)) message_content_image_file_object_image_file_t *message_content_image_file_object_image_file_create(
    char *file_id,
    openai_api_message_content_image_file_object_image_file_DETAIL_e detail
);

void message_content_image_file_object_image_file_free(message_content_image_file_object_image_file_t *message_content_image_file_object_image_file);

message_content_image_file_object_image_file_t *message_content_image_file_object_image_file_parseFromJSON(cJSON *message_content_image_file_object_image_fileJSON);

cJSON *message_content_image_file_object_image_file_convertToJSON(message_content_image_file_object_image_file_t *message_content_image_file_object_image_file);

#endif /* _message_content_image_file_object_image_file_H_ */

