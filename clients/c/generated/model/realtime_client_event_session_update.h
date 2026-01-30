/*
 * realtime_client_event_session_update.h
 *
 * Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \&quot;voice\&quot;. The server will respond  with a &#x60;session.updated&#x60; event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \&quot;instructions\&quot; is to pass an empty string. 
 */

#ifndef _realtime_client_event_session_update_H_
#define _realtime_client_event_session_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_client_event_session_update_t realtime_client_event_session_update_t;

#include "realtime_session_create_request.h"

// Enum TYPE for realtime_client_event_session_update

typedef enum  { openai_api_realtime_client_event_session_update_TYPE_NULL = 0, openai_api_realtime_client_event_session_update_TYPE_session.update } openai_api_realtime_client_event_session_update_TYPE_e;

char* realtime_client_event_session_update_type_ToString(openai_api_realtime_client_event_session_update_TYPE_e type);

openai_api_realtime_client_event_session_update_TYPE_e realtime_client_event_session_update_type_FromString(char* type);



typedef struct realtime_client_event_session_update_t {
    char *event_id; // string
    openai_api_realtime_client_event_session_update_TYPE_e type; //enum
    struct realtime_session_create_request_t *session; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_client_event_session_update_t;

__attribute__((deprecated)) realtime_client_event_session_update_t *realtime_client_event_session_update_create(
    char *event_id,
    openai_api_realtime_client_event_session_update_TYPE_e type,
    realtime_session_create_request_t *session
);

void realtime_client_event_session_update_free(realtime_client_event_session_update_t *realtime_client_event_session_update);

realtime_client_event_session_update_t *realtime_client_event_session_update_parseFromJSON(cJSON *realtime_client_event_session_updateJSON);

cJSON *realtime_client_event_session_update_convertToJSON(realtime_client_event_session_update_t *realtime_client_event_session_update);

#endif /* _realtime_client_event_session_update_H_ */

