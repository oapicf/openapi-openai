/*
 * realtime_server_event_session_created.h
 *
 * Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
 */

#ifndef _realtime_server_event_session_created_H_
#define _realtime_server_event_session_created_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_session_created_t realtime_server_event_session_created_t;

#include "realtime_session.h"

// Enum TYPE for realtime_server_event_session_created

typedef enum  { openai_api_realtime_server_event_session_created_TYPE_NULL = 0, openai_api_realtime_server_event_session_created_TYPE_session.created } openai_api_realtime_server_event_session_created_TYPE_e;

char* realtime_server_event_session_created_type_ToString(openai_api_realtime_server_event_session_created_TYPE_e type);

openai_api_realtime_server_event_session_created_TYPE_e realtime_server_event_session_created_type_FromString(char* type);



typedef struct realtime_server_event_session_created_t {
    char *event_id; // string
    openai_api_realtime_server_event_session_created_TYPE_e type; //enum
    struct realtime_session_t *session; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_session_created_t;

__attribute__((deprecated)) realtime_server_event_session_created_t *realtime_server_event_session_created_create(
    char *event_id,
    openai_api_realtime_server_event_session_created_TYPE_e type,
    realtime_session_t *session
);

void realtime_server_event_session_created_free(realtime_server_event_session_created_t *realtime_server_event_session_created);

realtime_server_event_session_created_t *realtime_server_event_session_created_parseFromJSON(cJSON *realtime_server_event_session_createdJSON);

cJSON *realtime_server_event_session_created_convertToJSON(realtime_server_event_session_created_t *realtime_server_event_session_created);

#endif /* _realtime_server_event_session_created_H_ */

