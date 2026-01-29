/*
 * message_delta_content_text_object_text_annotations_inner.h
 *
 * 
 */

#ifndef _message_delta_content_text_object_text_annotations_inner_H_
#define _message_delta_content_text_object_text_annotations_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_delta_content_text_object_text_annotations_inner_t message_delta_content_text_object_text_annotations_inner_t;

#include "message_delta_content_text_annotations_file_citation_object.h"
#include "message_delta_content_text_annotations_file_citation_object_file_citation.h"
#include "message_delta_content_text_annotations_file_path_object.h"
#include "message_delta_content_text_annotations_file_path_object_file_path.h"

// Enum TYPE for message_delta_content_text_object_text_annotations_inner

typedef enum  { openai_api_message_delta_content_text_object_text_annotations_inner_TYPE_NULL = 0, openai_api_message_delta_content_text_object_text_annotations_inner_TYPE_file_citation, openai_api_message_delta_content_text_object_text_annotations_inner_TYPE_file_path } openai_api_message_delta_content_text_object_text_annotations_inner_TYPE_e;

char* message_delta_content_text_object_text_annotations_inner_type_ToString(openai_api_message_delta_content_text_object_text_annotations_inner_TYPE_e type);

openai_api_message_delta_content_text_object_text_annotations_inner_TYPE_e message_delta_content_text_object_text_annotations_inner_type_FromString(char* type);



typedef struct message_delta_content_text_object_text_annotations_inner_t {
    int index; //numeric
    openai_api_message_delta_content_text_object_text_annotations_inner_TYPE_e type; //enum
    char *text; // string
    struct message_delta_content_text_annotations_file_citation_object_file_citation_t *file_citation; //model
    int start_index; //numeric
    int end_index; //numeric
    struct message_delta_content_text_annotations_file_path_object_file_path_t *file_path; //model

    int _library_owned; // Is the library responsible for freeing this object?
} message_delta_content_text_object_text_annotations_inner_t;

__attribute__((deprecated)) message_delta_content_text_object_text_annotations_inner_t *message_delta_content_text_object_text_annotations_inner_create(
    int index,
    openai_api_message_delta_content_text_object_text_annotations_inner_TYPE_e type,
    char *text,
    message_delta_content_text_annotations_file_citation_object_file_citation_t *file_citation,
    int start_index,
    int end_index,
    message_delta_content_text_annotations_file_path_object_file_path_t *file_path
);

void message_delta_content_text_object_text_annotations_inner_free(message_delta_content_text_object_text_annotations_inner_t *message_delta_content_text_object_text_annotations_inner);

message_delta_content_text_object_text_annotations_inner_t *message_delta_content_text_object_text_annotations_inner_parseFromJSON(cJSON *message_delta_content_text_object_text_annotations_innerJSON);

cJSON *message_delta_content_text_object_text_annotations_inner_convertToJSON(message_delta_content_text_object_text_annotations_inner_t *message_delta_content_text_object_text_annotations_inner);

#endif /* _message_delta_content_text_object_text_annotations_inner_H_ */

