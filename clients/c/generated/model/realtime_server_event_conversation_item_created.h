/*
 * realtime_server_event_conversation_item_created.h
 *
 * Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type &#x60;message&#x60;      (role &#x60;assistant&#x60;) or type &#x60;function_call&#x60;.   - The input audio buffer has been committed, either by the client or the      server (in &#x60;server_vad&#x60; mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a &#x60;conversation.item.create&#x60; event to add a new Item      to the Conversation. 
 */

#ifndef _realtime_server_event_conversation_item_created_H_
#define _realtime_server_event_conversation_item_created_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_conversation_item_created_t realtime_server_event_conversation_item_created_t;

#include "realtime_conversation_item.h"

// Enum TYPE for realtime_server_event_conversation_item_created

typedef enum  { openai_api_realtime_server_event_conversation_item_created_TYPE_NULL = 0, openai_api_realtime_server_event_conversation_item_created_TYPE_conversation.item.created } openai_api_realtime_server_event_conversation_item_created_TYPE_e;

char* realtime_server_event_conversation_item_created_type_ToString(openai_api_realtime_server_event_conversation_item_created_TYPE_e type);

openai_api_realtime_server_event_conversation_item_created_TYPE_e realtime_server_event_conversation_item_created_type_FromString(char* type);



typedef struct realtime_server_event_conversation_item_created_t {
    char *event_id; // string
    openai_api_realtime_server_event_conversation_item_created_TYPE_e type; //enum
    char *previous_item_id; // string
    struct realtime_conversation_item_t *item; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_conversation_item_created_t;

__attribute__((deprecated)) realtime_server_event_conversation_item_created_t *realtime_server_event_conversation_item_created_create(
    char *event_id,
    openai_api_realtime_server_event_conversation_item_created_TYPE_e type,
    char *previous_item_id,
    realtime_conversation_item_t *item
);

void realtime_server_event_conversation_item_created_free(realtime_server_event_conversation_item_created_t *realtime_server_event_conversation_item_created);

realtime_server_event_conversation_item_created_t *realtime_server_event_conversation_item_created_parseFromJSON(cJSON *realtime_server_event_conversation_item_createdJSON);

cJSON *realtime_server_event_conversation_item_created_convertToJSON(realtime_server_event_conversation_item_created_t *realtime_server_event_conversation_item_created);

#endif /* _realtime_server_event_conversation_item_created_H_ */

