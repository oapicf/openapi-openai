/*
 * realtime_server_event_response_content_part_done_part.h
 *
 * The content part that is done.
 */

#ifndef _realtime_server_event_response_content_part_done_part_H_
#define _realtime_server_event_response_content_part_done_part_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_response_content_part_done_part_t realtime_server_event_response_content_part_done_part_t;


// Enum TYPE for realtime_server_event_response_content_part_done_part

typedef enum  { openai_api_realtime_server_event_response_content_part_done_part_TYPE_NULL = 0, openai_api_realtime_server_event_response_content_part_done_part_TYPE_audio, openai_api_realtime_server_event_response_content_part_done_part_TYPE_text } openai_api_realtime_server_event_response_content_part_done_part_TYPE_e;

char* realtime_server_event_response_content_part_done_part_type_ToString(openai_api_realtime_server_event_response_content_part_done_part_TYPE_e type);

openai_api_realtime_server_event_response_content_part_done_part_TYPE_e realtime_server_event_response_content_part_done_part_type_FromString(char* type);



typedef struct realtime_server_event_response_content_part_done_part_t {
    openai_api_realtime_server_event_response_content_part_done_part_TYPE_e type; //enum
    char *text; // string
    char *audio; // string
    char *transcript; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_response_content_part_done_part_t;

__attribute__((deprecated)) realtime_server_event_response_content_part_done_part_t *realtime_server_event_response_content_part_done_part_create(
    openai_api_realtime_server_event_response_content_part_done_part_TYPE_e type,
    char *text,
    char *audio,
    char *transcript
);

void realtime_server_event_response_content_part_done_part_free(realtime_server_event_response_content_part_done_part_t *realtime_server_event_response_content_part_done_part);

realtime_server_event_response_content_part_done_part_t *realtime_server_event_response_content_part_done_part_parseFromJSON(cJSON *realtime_server_event_response_content_part_done_partJSON);

cJSON *realtime_server_event_response_content_part_done_part_convertToJSON(realtime_server_event_response_content_part_done_part_t *realtime_server_event_response_content_part_done_part);

#endif /* _realtime_server_event_response_content_part_done_part_H_ */

