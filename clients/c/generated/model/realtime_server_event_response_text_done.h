/*
 * realtime_server_event_response_text_done.h
 *
 * Returned when the text value of a \&quot;text\&quot; content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */

#ifndef _realtime_server_event_response_text_done_H_
#define _realtime_server_event_response_text_done_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_response_text_done_t realtime_server_event_response_text_done_t;


// Enum TYPE for realtime_server_event_response_text_done

typedef enum  { openai_api_realtime_server_event_response_text_done_TYPE_NULL = 0, openai_api_realtime_server_event_response_text_done_TYPE_response.text.done } openai_api_realtime_server_event_response_text_done_TYPE_e;

char* realtime_server_event_response_text_done_type_ToString(openai_api_realtime_server_event_response_text_done_TYPE_e type);

openai_api_realtime_server_event_response_text_done_TYPE_e realtime_server_event_response_text_done_type_FromString(char* type);



typedef struct realtime_server_event_response_text_done_t {
    char *event_id; // string
    openai_api_realtime_server_event_response_text_done_TYPE_e type; //enum
    char *response_id; // string
    char *item_id; // string
    int output_index; //numeric
    int content_index; //numeric
    char *text; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_response_text_done_t;

__attribute__((deprecated)) realtime_server_event_response_text_done_t *realtime_server_event_response_text_done_create(
    char *event_id,
    openai_api_realtime_server_event_response_text_done_TYPE_e type,
    char *response_id,
    char *item_id,
    int output_index,
    int content_index,
    char *text
);

void realtime_server_event_response_text_done_free(realtime_server_event_response_text_done_t *realtime_server_event_response_text_done);

realtime_server_event_response_text_done_t *realtime_server_event_response_text_done_parseFromJSON(cJSON *realtime_server_event_response_text_doneJSON);

cJSON *realtime_server_event_response_text_done_convertToJSON(realtime_server_event_response_text_done_t *realtime_server_event_response_text_done);

#endif /* _realtime_server_event_response_text_done_H_ */

