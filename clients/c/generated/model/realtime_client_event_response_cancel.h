/*
 * realtime_client_event_response_cancel.h
 *
 * Send this event to cancel an in-progress response. The server will respond  with a &#x60;response.cancelled&#x60; event or an error if there is no response to  cancel. 
 */

#ifndef _realtime_client_event_response_cancel_H_
#define _realtime_client_event_response_cancel_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_client_event_response_cancel_t realtime_client_event_response_cancel_t;


// Enum TYPE for realtime_client_event_response_cancel

typedef enum  { openai_api_realtime_client_event_response_cancel_TYPE_NULL = 0, openai_api_realtime_client_event_response_cancel_TYPE_response.cancel } openai_api_realtime_client_event_response_cancel_TYPE_e;

char* realtime_client_event_response_cancel_type_ToString(openai_api_realtime_client_event_response_cancel_TYPE_e type);

openai_api_realtime_client_event_response_cancel_TYPE_e realtime_client_event_response_cancel_type_FromString(char* type);



typedef struct realtime_client_event_response_cancel_t {
    char *event_id; // string
    openai_api_realtime_client_event_response_cancel_TYPE_e type; //enum
    char *response_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_client_event_response_cancel_t;

__attribute__((deprecated)) realtime_client_event_response_cancel_t *realtime_client_event_response_cancel_create(
    char *event_id,
    openai_api_realtime_client_event_response_cancel_TYPE_e type,
    char *response_id
);

void realtime_client_event_response_cancel_free(realtime_client_event_response_cancel_t *realtime_client_event_response_cancel);

realtime_client_event_response_cancel_t *realtime_client_event_response_cancel_parseFromJSON(cJSON *realtime_client_event_response_cancelJSON);

cJSON *realtime_client_event_response_cancel_convertToJSON(realtime_client_event_response_cancel_t *realtime_client_event_response_cancel);

#endif /* _realtime_client_event_response_cancel_H_ */

