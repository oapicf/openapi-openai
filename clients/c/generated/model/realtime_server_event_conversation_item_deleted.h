/*
 * realtime_server_event_conversation_item_deleted.h
 *
 * Returned when an item in the conversation is deleted by the client with a  &#x60;conversation.item.delete&#x60; event. This event is used to synchronize the  server&#39;s understanding of the conversation history with the client&#39;s view. 
 */

#ifndef _realtime_server_event_conversation_item_deleted_H_
#define _realtime_server_event_conversation_item_deleted_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_conversation_item_deleted_t realtime_server_event_conversation_item_deleted_t;


// Enum TYPE for realtime_server_event_conversation_item_deleted

typedef enum  { openai_api_realtime_server_event_conversation_item_deleted_TYPE_NULL = 0, openai_api_realtime_server_event_conversation_item_deleted_TYPE_conversation.item.deleted } openai_api_realtime_server_event_conversation_item_deleted_TYPE_e;

char* realtime_server_event_conversation_item_deleted_type_ToString(openai_api_realtime_server_event_conversation_item_deleted_TYPE_e type);

openai_api_realtime_server_event_conversation_item_deleted_TYPE_e realtime_server_event_conversation_item_deleted_type_FromString(char* type);



typedef struct realtime_server_event_conversation_item_deleted_t {
    char *event_id; // string
    openai_api_realtime_server_event_conversation_item_deleted_TYPE_e type; //enum
    char *item_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_conversation_item_deleted_t;

__attribute__((deprecated)) realtime_server_event_conversation_item_deleted_t *realtime_server_event_conversation_item_deleted_create(
    char *event_id,
    openai_api_realtime_server_event_conversation_item_deleted_TYPE_e type,
    char *item_id
);

void realtime_server_event_conversation_item_deleted_free(realtime_server_event_conversation_item_deleted_t *realtime_server_event_conversation_item_deleted);

realtime_server_event_conversation_item_deleted_t *realtime_server_event_conversation_item_deleted_parseFromJSON(cJSON *realtime_server_event_conversation_item_deletedJSON);

cJSON *realtime_server_event_conversation_item_deleted_convertToJSON(realtime_server_event_conversation_item_deleted_t *realtime_server_event_conversation_item_deleted);

#endif /* _realtime_server_event_conversation_item_deleted_H_ */

