/*
 * realtime_server_event_conversation_created.h
 *
 * Returned when a conversation is created. Emitted right after session creation. 
 */

#ifndef _realtime_server_event_conversation_created_H_
#define _realtime_server_event_conversation_created_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_conversation_created_t realtime_server_event_conversation_created_t;

#include "realtime_server_event_conversation_created_conversation.h"

// Enum TYPE for realtime_server_event_conversation_created

typedef enum  { openai_api_realtime_server_event_conversation_created_TYPE_NULL = 0, openai_api_realtime_server_event_conversation_created_TYPE_conversation.created } openai_api_realtime_server_event_conversation_created_TYPE_e;

char* realtime_server_event_conversation_created_type_ToString(openai_api_realtime_server_event_conversation_created_TYPE_e type);

openai_api_realtime_server_event_conversation_created_TYPE_e realtime_server_event_conversation_created_type_FromString(char* type);



typedef struct realtime_server_event_conversation_created_t {
    char *event_id; // string
    openai_api_realtime_server_event_conversation_created_TYPE_e type; //enum
    struct realtime_server_event_conversation_created_conversation_t *conversation; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_conversation_created_t;

__attribute__((deprecated)) realtime_server_event_conversation_created_t *realtime_server_event_conversation_created_create(
    char *event_id,
    openai_api_realtime_server_event_conversation_created_TYPE_e type,
    realtime_server_event_conversation_created_conversation_t *conversation
);

void realtime_server_event_conversation_created_free(realtime_server_event_conversation_created_t *realtime_server_event_conversation_created);

realtime_server_event_conversation_created_t *realtime_server_event_conversation_created_parseFromJSON(cJSON *realtime_server_event_conversation_createdJSON);

cJSON *realtime_server_event_conversation_created_convertToJSON(realtime_server_event_conversation_created_t *realtime_server_event_conversation_created);

#endif /* _realtime_server_event_conversation_created_H_ */

