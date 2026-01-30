/*
 * realtime_server_event_response_text_delta.h
 *
 * Returned when the text value of a \&quot;text\&quot; content part is updated.
 */

#ifndef _realtime_server_event_response_text_delta_H_
#define _realtime_server_event_response_text_delta_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_response_text_delta_t realtime_server_event_response_text_delta_t;


// Enum TYPE for realtime_server_event_response_text_delta

typedef enum  { openai_api_realtime_server_event_response_text_delta_TYPE_NULL = 0, openai_api_realtime_server_event_response_text_delta_TYPE_response.text.delta } openai_api_realtime_server_event_response_text_delta_TYPE_e;

char* realtime_server_event_response_text_delta_type_ToString(openai_api_realtime_server_event_response_text_delta_TYPE_e type);

openai_api_realtime_server_event_response_text_delta_TYPE_e realtime_server_event_response_text_delta_type_FromString(char* type);



typedef struct realtime_server_event_response_text_delta_t {
    char *event_id; // string
    openai_api_realtime_server_event_response_text_delta_TYPE_e type; //enum
    char *response_id; // string
    char *item_id; // string
    int output_index; //numeric
    int content_index; //numeric
    char *delta; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_response_text_delta_t;

__attribute__((deprecated)) realtime_server_event_response_text_delta_t *realtime_server_event_response_text_delta_create(
    char *event_id,
    openai_api_realtime_server_event_response_text_delta_TYPE_e type,
    char *response_id,
    char *item_id,
    int output_index,
    int content_index,
    char *delta
);

void realtime_server_event_response_text_delta_free(realtime_server_event_response_text_delta_t *realtime_server_event_response_text_delta);

realtime_server_event_response_text_delta_t *realtime_server_event_response_text_delta_parseFromJSON(cJSON *realtime_server_event_response_text_deltaJSON);

cJSON *realtime_server_event_response_text_delta_convertToJSON(realtime_server_event_response_text_delta_t *realtime_server_event_response_text_delta);

#endif /* _realtime_server_event_response_text_delta_H_ */

