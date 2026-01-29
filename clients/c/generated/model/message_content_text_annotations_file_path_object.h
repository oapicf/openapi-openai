/*
 * message_content_text_annotations_file_path_object.h
 *
 * A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
 */

#ifndef _message_content_text_annotations_file_path_object_H_
#define _message_content_text_annotations_file_path_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_content_text_annotations_file_path_object_t message_content_text_annotations_file_path_object_t;

#include "message_content_text_annotations_file_path_object_file_path.h"

// Enum TYPE for message_content_text_annotations_file_path_object

typedef enum  { openai_api_message_content_text_annotations_file_path_object_TYPE_NULL = 0, openai_api_message_content_text_annotations_file_path_object_TYPE_file_path } openai_api_message_content_text_annotations_file_path_object_TYPE_e;

char* message_content_text_annotations_file_path_object_type_ToString(openai_api_message_content_text_annotations_file_path_object_TYPE_e type);

openai_api_message_content_text_annotations_file_path_object_TYPE_e message_content_text_annotations_file_path_object_type_FromString(char* type);



typedef struct message_content_text_annotations_file_path_object_t {
    openai_api_message_content_text_annotations_file_path_object_TYPE_e type; //enum
    char *text; // string
    struct message_content_text_annotations_file_path_object_file_path_t *file_path; //model
    int start_index; //numeric
    int end_index; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} message_content_text_annotations_file_path_object_t;

__attribute__((deprecated)) message_content_text_annotations_file_path_object_t *message_content_text_annotations_file_path_object_create(
    openai_api_message_content_text_annotations_file_path_object_TYPE_e type,
    char *text,
    message_content_text_annotations_file_path_object_file_path_t *file_path,
    int start_index,
    int end_index
);

void message_content_text_annotations_file_path_object_free(message_content_text_annotations_file_path_object_t *message_content_text_annotations_file_path_object);

message_content_text_annotations_file_path_object_t *message_content_text_annotations_file_path_object_parseFromJSON(cJSON *message_content_text_annotations_file_path_objectJSON);

cJSON *message_content_text_annotations_file_path_object_convertToJSON(message_content_text_annotations_file_path_object_t *message_content_text_annotations_file_path_object);

#endif /* _message_content_text_annotations_file_path_object_H_ */

