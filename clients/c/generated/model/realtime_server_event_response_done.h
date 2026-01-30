/*
 * realtime_server_event_response_done.h
 *
 * Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the &#x60;response.done&#x60; event will  include all output Items in the Response but will omit the raw audio data. 
 */

#ifndef _realtime_server_event_response_done_H_
#define _realtime_server_event_response_done_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_response_done_t realtime_server_event_response_done_t;

#include "realtime_response.h"

// Enum TYPE for realtime_server_event_response_done

typedef enum  { openai_api_realtime_server_event_response_done_TYPE_NULL = 0, openai_api_realtime_server_event_response_done_TYPE_response.done } openai_api_realtime_server_event_response_done_TYPE_e;

char* realtime_server_event_response_done_type_ToString(openai_api_realtime_server_event_response_done_TYPE_e type);

openai_api_realtime_server_event_response_done_TYPE_e realtime_server_event_response_done_type_FromString(char* type);



typedef struct realtime_server_event_response_done_t {
    char *event_id; // string
    openai_api_realtime_server_event_response_done_TYPE_e type; //enum
    struct realtime_response_t *response; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_response_done_t;

__attribute__((deprecated)) realtime_server_event_response_done_t *realtime_server_event_response_done_create(
    char *event_id,
    openai_api_realtime_server_event_response_done_TYPE_e type,
    realtime_response_t *response
);

void realtime_server_event_response_done_free(realtime_server_event_response_done_t *realtime_server_event_response_done);

realtime_server_event_response_done_t *realtime_server_event_response_done_parseFromJSON(cJSON *realtime_server_event_response_doneJSON);

cJSON *realtime_server_event_response_done_convertToJSON(realtime_server_event_response_done_t *realtime_server_event_response_done);

#endif /* _realtime_server_event_response_done_H_ */

