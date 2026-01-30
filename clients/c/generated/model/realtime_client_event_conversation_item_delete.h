/*
 * realtime_client_event_conversation_item_delete.h
 *
 * Send this event when you want to remove any item from the conversation  history. The server will respond with a &#x60;conversation.item.deleted&#x60; event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
 */

#ifndef _realtime_client_event_conversation_item_delete_H_
#define _realtime_client_event_conversation_item_delete_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_client_event_conversation_item_delete_t realtime_client_event_conversation_item_delete_t;


// Enum TYPE for realtime_client_event_conversation_item_delete

typedef enum  { openai_api_realtime_client_event_conversation_item_delete_TYPE_NULL = 0, openai_api_realtime_client_event_conversation_item_delete_TYPE_conversation.item.delete } openai_api_realtime_client_event_conversation_item_delete_TYPE_e;

char* realtime_client_event_conversation_item_delete_type_ToString(openai_api_realtime_client_event_conversation_item_delete_TYPE_e type);

openai_api_realtime_client_event_conversation_item_delete_TYPE_e realtime_client_event_conversation_item_delete_type_FromString(char* type);



typedef struct realtime_client_event_conversation_item_delete_t {
    char *event_id; // string
    openai_api_realtime_client_event_conversation_item_delete_TYPE_e type; //enum
    char *item_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_client_event_conversation_item_delete_t;

__attribute__((deprecated)) realtime_client_event_conversation_item_delete_t *realtime_client_event_conversation_item_delete_create(
    char *event_id,
    openai_api_realtime_client_event_conversation_item_delete_TYPE_e type,
    char *item_id
);

void realtime_client_event_conversation_item_delete_free(realtime_client_event_conversation_item_delete_t *realtime_client_event_conversation_item_delete);

realtime_client_event_conversation_item_delete_t *realtime_client_event_conversation_item_delete_parseFromJSON(cJSON *realtime_client_event_conversation_item_deleteJSON);

cJSON *realtime_client_event_conversation_item_delete_convertToJSON(realtime_client_event_conversation_item_delete_t *realtime_client_event_conversation_item_delete);

#endif /* _realtime_client_event_conversation_item_delete_H_ */

