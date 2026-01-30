/*
 * realtime_server_event_conversation_item_truncated.h
 *
 * Returned when an earlier assistant audio message item is truncated by the  client with a &#x60;conversation.item.truncate&#x60; event. This event is used to  synchronize the server&#39;s understanding of the audio with the client&#39;s playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn&#39;t been heard by the user. 
 */

#ifndef _realtime_server_event_conversation_item_truncated_H_
#define _realtime_server_event_conversation_item_truncated_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_conversation_item_truncated_t realtime_server_event_conversation_item_truncated_t;


// Enum TYPE for realtime_server_event_conversation_item_truncated

typedef enum  { openai_api_realtime_server_event_conversation_item_truncated_TYPE_NULL = 0, openai_api_realtime_server_event_conversation_item_truncated_TYPE_conversation.item.truncated } openai_api_realtime_server_event_conversation_item_truncated_TYPE_e;

char* realtime_server_event_conversation_item_truncated_type_ToString(openai_api_realtime_server_event_conversation_item_truncated_TYPE_e type);

openai_api_realtime_server_event_conversation_item_truncated_TYPE_e realtime_server_event_conversation_item_truncated_type_FromString(char* type);



typedef struct realtime_server_event_conversation_item_truncated_t {
    char *event_id; // string
    openai_api_realtime_server_event_conversation_item_truncated_TYPE_e type; //enum
    char *item_id; // string
    int content_index; //numeric
    int audio_end_ms; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_conversation_item_truncated_t;

__attribute__((deprecated)) realtime_server_event_conversation_item_truncated_t *realtime_server_event_conversation_item_truncated_create(
    char *event_id,
    openai_api_realtime_server_event_conversation_item_truncated_TYPE_e type,
    char *item_id,
    int content_index,
    int audio_end_ms
);

void realtime_server_event_conversation_item_truncated_free(realtime_server_event_conversation_item_truncated_t *realtime_server_event_conversation_item_truncated);

realtime_server_event_conversation_item_truncated_t *realtime_server_event_conversation_item_truncated_parseFromJSON(cJSON *realtime_server_event_conversation_item_truncatedJSON);

cJSON *realtime_server_event_conversation_item_truncated_convertToJSON(realtime_server_event_conversation_item_truncated_t *realtime_server_event_conversation_item_truncated);

#endif /* _realtime_server_event_conversation_item_truncated_H_ */

