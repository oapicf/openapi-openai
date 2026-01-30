/*
 * realtime_server_event_response_content_part_added.h
 *
 * Returned when a new content part is added to an assistant message item during response generation. 
 */

#ifndef _realtime_server_event_response_content_part_added_H_
#define _realtime_server_event_response_content_part_added_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_response_content_part_added_t realtime_server_event_response_content_part_added_t;

#include "realtime_server_event_response_content_part_added_part.h"

// Enum TYPE for realtime_server_event_response_content_part_added

typedef enum  { openai_api_realtime_server_event_response_content_part_added_TYPE_NULL = 0, openai_api_realtime_server_event_response_content_part_added_TYPE_response.content_part.added } openai_api_realtime_server_event_response_content_part_added_TYPE_e;

char* realtime_server_event_response_content_part_added_type_ToString(openai_api_realtime_server_event_response_content_part_added_TYPE_e type);

openai_api_realtime_server_event_response_content_part_added_TYPE_e realtime_server_event_response_content_part_added_type_FromString(char* type);



typedef struct realtime_server_event_response_content_part_added_t {
    char *event_id; // string
    openai_api_realtime_server_event_response_content_part_added_TYPE_e type; //enum
    char *response_id; // string
    char *item_id; // string
    int output_index; //numeric
    int content_index; //numeric
    struct realtime_server_event_response_content_part_added_part_t *part; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_response_content_part_added_t;

__attribute__((deprecated)) realtime_server_event_response_content_part_added_t *realtime_server_event_response_content_part_added_create(
    char *event_id,
    openai_api_realtime_server_event_response_content_part_added_TYPE_e type,
    char *response_id,
    char *item_id,
    int output_index,
    int content_index,
    realtime_server_event_response_content_part_added_part_t *part
);

void realtime_server_event_response_content_part_added_free(realtime_server_event_response_content_part_added_t *realtime_server_event_response_content_part_added);

realtime_server_event_response_content_part_added_t *realtime_server_event_response_content_part_added_parseFromJSON(cJSON *realtime_server_event_response_content_part_addedJSON);

cJSON *realtime_server_event_response_content_part_added_convertToJSON(realtime_server_event_response_content_part_added_t *realtime_server_event_response_content_part_added);

#endif /* _realtime_server_event_response_content_part_added_H_ */

