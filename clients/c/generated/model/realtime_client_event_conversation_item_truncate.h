/*
 * realtime_client_event_conversation_item_truncate.h
 *
 * Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server&#39;s understanding of the audio with  the client&#39;s playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn&#39;t been heard by the user.  If successful, the server will respond with a &#x60;conversation.item.truncated&#x60;  event.  
 */

#ifndef _realtime_client_event_conversation_item_truncate_H_
#define _realtime_client_event_conversation_item_truncate_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_client_event_conversation_item_truncate_t realtime_client_event_conversation_item_truncate_t;


// Enum TYPE for realtime_client_event_conversation_item_truncate

typedef enum  { openai_api_realtime_client_event_conversation_item_truncate_TYPE_NULL = 0, openai_api_realtime_client_event_conversation_item_truncate_TYPE_conversation.item.truncate } openai_api_realtime_client_event_conversation_item_truncate_TYPE_e;

char* realtime_client_event_conversation_item_truncate_type_ToString(openai_api_realtime_client_event_conversation_item_truncate_TYPE_e type);

openai_api_realtime_client_event_conversation_item_truncate_TYPE_e realtime_client_event_conversation_item_truncate_type_FromString(char* type);



typedef struct realtime_client_event_conversation_item_truncate_t {
    char *event_id; // string
    openai_api_realtime_client_event_conversation_item_truncate_TYPE_e type; //enum
    char *item_id; // string
    int content_index; //numeric
    int audio_end_ms; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_client_event_conversation_item_truncate_t;

__attribute__((deprecated)) realtime_client_event_conversation_item_truncate_t *realtime_client_event_conversation_item_truncate_create(
    char *event_id,
    openai_api_realtime_client_event_conversation_item_truncate_TYPE_e type,
    char *item_id,
    int content_index,
    int audio_end_ms
);

void realtime_client_event_conversation_item_truncate_free(realtime_client_event_conversation_item_truncate_t *realtime_client_event_conversation_item_truncate);

realtime_client_event_conversation_item_truncate_t *realtime_client_event_conversation_item_truncate_parseFromJSON(cJSON *realtime_client_event_conversation_item_truncateJSON);

cJSON *realtime_client_event_conversation_item_truncate_convertToJSON(realtime_client_event_conversation_item_truncate_t *realtime_client_event_conversation_item_truncate);

#endif /* _realtime_client_event_conversation_item_truncate_H_ */

