/*
 * realtime_server_event_conversation_created_conversation.h
 *
 * The conversation resource.
 */

#ifndef _realtime_server_event_conversation_created_conversation_H_
#define _realtime_server_event_conversation_created_conversation_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_conversation_created_conversation_t realtime_server_event_conversation_created_conversation_t;




typedef struct realtime_server_event_conversation_created_conversation_t {
    char *id; // string
    char *object; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_conversation_created_conversation_t;

__attribute__((deprecated)) realtime_server_event_conversation_created_conversation_t *realtime_server_event_conversation_created_conversation_create(
    char *id,
    char *object
);

void realtime_server_event_conversation_created_conversation_free(realtime_server_event_conversation_created_conversation_t *realtime_server_event_conversation_created_conversation);

realtime_server_event_conversation_created_conversation_t *realtime_server_event_conversation_created_conversation_parseFromJSON(cJSON *realtime_server_event_conversation_created_conversationJSON);

cJSON *realtime_server_event_conversation_created_conversation_convertToJSON(realtime_server_event_conversation_created_conversation_t *realtime_server_event_conversation_created_conversation);

#endif /* _realtime_server_event_conversation_created_conversation_H_ */

