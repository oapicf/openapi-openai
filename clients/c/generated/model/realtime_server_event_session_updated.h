/*
 * realtime_server_event_session_updated.h
 *
 * Returned when a session is updated with a &#x60;session.update&#x60; event, unless  there is an error. 
 */

#ifndef _realtime_server_event_session_updated_H_
#define _realtime_server_event_session_updated_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_session_updated_t realtime_server_event_session_updated_t;

#include "realtime_session.h"

// Enum TYPE for realtime_server_event_session_updated

typedef enum  { openai_api_realtime_server_event_session_updated_TYPE_NULL = 0, openai_api_realtime_server_event_session_updated_TYPE_session.updated } openai_api_realtime_server_event_session_updated_TYPE_e;

char* realtime_server_event_session_updated_type_ToString(openai_api_realtime_server_event_session_updated_TYPE_e type);

openai_api_realtime_server_event_session_updated_TYPE_e realtime_server_event_session_updated_type_FromString(char* type);



typedef struct realtime_server_event_session_updated_t {
    char *event_id; // string
    openai_api_realtime_server_event_session_updated_TYPE_e type; //enum
    struct realtime_session_t *session; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_session_updated_t;

__attribute__((deprecated)) realtime_server_event_session_updated_t *realtime_server_event_session_updated_create(
    char *event_id,
    openai_api_realtime_server_event_session_updated_TYPE_e type,
    realtime_session_t *session
);

void realtime_server_event_session_updated_free(realtime_server_event_session_updated_t *realtime_server_event_session_updated);

realtime_server_event_session_updated_t *realtime_server_event_session_updated_parseFromJSON(cJSON *realtime_server_event_session_updatedJSON);

cJSON *realtime_server_event_session_updated_convertToJSON(realtime_server_event_session_updated_t *realtime_server_event_session_updated);

#endif /* _realtime_server_event_session_updated_H_ */

