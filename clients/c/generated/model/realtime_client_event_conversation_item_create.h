/*
 * realtime_client_event_conversation_item_create.h
 *
 * Add a new Item to the Conversation&#39;s context, including messages, function  calls, and function call responses. This event can be used both to populate a  \&quot;history\&quot; of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a &#x60;conversation.item.created&#x60;  event, otherwise an &#x60;error&#x60; event will be sent. 
 */

#ifndef _realtime_client_event_conversation_item_create_H_
#define _realtime_client_event_conversation_item_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_client_event_conversation_item_create_t realtime_client_event_conversation_item_create_t;

#include "realtime_conversation_item.h"

// Enum TYPE for realtime_client_event_conversation_item_create

typedef enum  { openai_api_realtime_client_event_conversation_item_create_TYPE_NULL = 0, openai_api_realtime_client_event_conversation_item_create_TYPE_conversation.item.create } openai_api_realtime_client_event_conversation_item_create_TYPE_e;

char* realtime_client_event_conversation_item_create_type_ToString(openai_api_realtime_client_event_conversation_item_create_TYPE_e type);

openai_api_realtime_client_event_conversation_item_create_TYPE_e realtime_client_event_conversation_item_create_type_FromString(char* type);



typedef struct realtime_client_event_conversation_item_create_t {
    char *event_id; // string
    openai_api_realtime_client_event_conversation_item_create_TYPE_e type; //enum
    char *previous_item_id; // string
    struct realtime_conversation_item_t *item; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_client_event_conversation_item_create_t;

__attribute__((deprecated)) realtime_client_event_conversation_item_create_t *realtime_client_event_conversation_item_create_create(
    char *event_id,
    openai_api_realtime_client_event_conversation_item_create_TYPE_e type,
    char *previous_item_id,
    realtime_conversation_item_t *item
);

void realtime_client_event_conversation_item_create_free(realtime_client_event_conversation_item_create_t *realtime_client_event_conversation_item_create);

realtime_client_event_conversation_item_create_t *realtime_client_event_conversation_item_create_parseFromJSON(cJSON *realtime_client_event_conversation_item_createJSON);

cJSON *realtime_client_event_conversation_item_create_convertToJSON(realtime_client_event_conversation_item_create_t *realtime_client_event_conversation_item_create);

#endif /* _realtime_client_event_conversation_item_create_H_ */

