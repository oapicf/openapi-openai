/*
 * message_content_text_annotations_file_citation_object_file_citation.h
 *
 * 
 */

#ifndef _message_content_text_annotations_file_citation_object_file_citation_H_
#define _message_content_text_annotations_file_citation_object_file_citation_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_content_text_annotations_file_citation_object_file_citation_t message_content_text_annotations_file_citation_object_file_citation_t;




typedef struct message_content_text_annotations_file_citation_object_file_citation_t {
    char *file_id; // string
    char *quote; // string

} message_content_text_annotations_file_citation_object_file_citation_t;

message_content_text_annotations_file_citation_object_file_citation_t *message_content_text_annotations_file_citation_object_file_citation_create(
    char *file_id,
    char *quote
);

void message_content_text_annotations_file_citation_object_file_citation_free(message_content_text_annotations_file_citation_object_file_citation_t *message_content_text_annotations_file_citation_object_file_citation);

message_content_text_annotations_file_citation_object_file_citation_t *message_content_text_annotations_file_citation_object_file_citation_parseFromJSON(cJSON *message_content_text_annotations_file_citation_object_file_citationJSON);

cJSON *message_content_text_annotations_file_citation_object_file_citation_convertToJSON(message_content_text_annotations_file_citation_object_file_citation_t *message_content_text_annotations_file_citation_object_file_citation);

#endif /* _message_content_text_annotations_file_citation_object_file_citation_H_ */

