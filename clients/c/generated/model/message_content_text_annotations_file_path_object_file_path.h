/*
 * message_content_text_annotations_file_path_object_file_path.h
 *
 * 
 */

#ifndef _message_content_text_annotations_file_path_object_file_path_H_
#define _message_content_text_annotations_file_path_object_file_path_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_content_text_annotations_file_path_object_file_path_t message_content_text_annotations_file_path_object_file_path_t;




typedef struct message_content_text_annotations_file_path_object_file_path_t {
    char *file_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} message_content_text_annotations_file_path_object_file_path_t;

__attribute__((deprecated)) message_content_text_annotations_file_path_object_file_path_t *message_content_text_annotations_file_path_object_file_path_create(
    char *file_id
);

void message_content_text_annotations_file_path_object_file_path_free(message_content_text_annotations_file_path_object_file_path_t *message_content_text_annotations_file_path_object_file_path);

message_content_text_annotations_file_path_object_file_path_t *message_content_text_annotations_file_path_object_file_path_parseFromJSON(cJSON *message_content_text_annotations_file_path_object_file_pathJSON);

cJSON *message_content_text_annotations_file_path_object_file_path_convertToJSON(message_content_text_annotations_file_path_object_file_path_t *message_content_text_annotations_file_path_object_file_path);

#endif /* _message_content_text_annotations_file_path_object_file_path_H_ */

