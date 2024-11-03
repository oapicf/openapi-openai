/*
 * message_content_text_annotations_file_citation_object.h
 *
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
 */

#ifndef _message_content_text_annotations_file_citation_object_H_
#define _message_content_text_annotations_file_citation_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_content_text_annotations_file_citation_object_t message_content_text_annotations_file_citation_object_t;

#include "message_content_text_annotations_file_citation_object_file_citation.h"

// Enum TYPE for message_content_text_annotations_file_citation_object

typedef enum  { openai_api_message_content_text_annotations_file_citation_object_TYPE_NULL = 0, openai_api_message_content_text_annotations_file_citation_object_TYPE_file_citation } openai_api_message_content_text_annotations_file_citation_object_TYPE_e;

char* message_content_text_annotations_file_citation_object_type_ToString(openai_api_message_content_text_annotations_file_citation_object_TYPE_e type);

openai_api_message_content_text_annotations_file_citation_object_TYPE_e message_content_text_annotations_file_citation_object_type_FromString(char* type);



typedef struct message_content_text_annotations_file_citation_object_t {
    openai_api_message_content_text_annotations_file_citation_object_TYPE_e type; //enum
    char *text; // string
    struct message_content_text_annotations_file_citation_object_file_citation_t *file_citation; //model
    int start_index; //numeric
    int end_index; //numeric

} message_content_text_annotations_file_citation_object_t;

message_content_text_annotations_file_citation_object_t *message_content_text_annotations_file_citation_object_create(
    openai_api_message_content_text_annotations_file_citation_object_TYPE_e type,
    char *text,
    message_content_text_annotations_file_citation_object_file_citation_t *file_citation,
    int start_index,
    int end_index
);

void message_content_text_annotations_file_citation_object_free(message_content_text_annotations_file_citation_object_t *message_content_text_annotations_file_citation_object);

message_content_text_annotations_file_citation_object_t *message_content_text_annotations_file_citation_object_parseFromJSON(cJSON *message_content_text_annotations_file_citation_objectJSON);

cJSON *message_content_text_annotations_file_citation_object_convertToJSON(message_content_text_annotations_file_citation_object_t *message_content_text_annotations_file_citation_object);

#endif /* _message_content_text_annotations_file_citation_object_H_ */

