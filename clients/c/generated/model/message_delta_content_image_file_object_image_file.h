/*
 * message_delta_content_image_file_object_image_file.h
 *
 * 
 */

#ifndef _message_delta_content_image_file_object_image_file_H_
#define _message_delta_content_image_file_object_image_file_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_delta_content_image_file_object_image_file_t message_delta_content_image_file_object_image_file_t;




typedef struct message_delta_content_image_file_object_image_file_t {
    char *file_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} message_delta_content_image_file_object_image_file_t;

__attribute__((deprecated)) message_delta_content_image_file_object_image_file_t *message_delta_content_image_file_object_image_file_create(
    char *file_id
);

void message_delta_content_image_file_object_image_file_free(message_delta_content_image_file_object_image_file_t *message_delta_content_image_file_object_image_file);

message_delta_content_image_file_object_image_file_t *message_delta_content_image_file_object_image_file_parseFromJSON(cJSON *message_delta_content_image_file_object_image_fileJSON);

cJSON *message_delta_content_image_file_object_image_file_convertToJSON(message_delta_content_image_file_object_image_file_t *message_delta_content_image_file_object_image_file);

#endif /* _message_delta_content_image_file_object_image_file_H_ */

