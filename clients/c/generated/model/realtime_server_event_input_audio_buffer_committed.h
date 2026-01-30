/*
 * realtime_server_event_input_audio_buffer_committed.h
 *
 * Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The &#x60;item_id&#x60; property is the ID of the user message item that will be created, thus a &#x60;conversation.item.created&#x60; event  will also be sent to the client. 
 */

#ifndef _realtime_server_event_input_audio_buffer_committed_H_
#define _realtime_server_event_input_audio_buffer_committed_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_input_audio_buffer_committed_t realtime_server_event_input_audio_buffer_committed_t;


// Enum TYPE for realtime_server_event_input_audio_buffer_committed

typedef enum  { openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_NULL = 0, openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_input_audio_buffer.committed } openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_e;

char* realtime_server_event_input_audio_buffer_committed_type_ToString(openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_e type);

openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_e realtime_server_event_input_audio_buffer_committed_type_FromString(char* type);



typedef struct realtime_server_event_input_audio_buffer_committed_t {
    char *event_id; // string
    openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_e type; //enum
    char *previous_item_id; // string
    char *item_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_input_audio_buffer_committed_t;

__attribute__((deprecated)) realtime_server_event_input_audio_buffer_committed_t *realtime_server_event_input_audio_buffer_committed_create(
    char *event_id,
    openai_api_realtime_server_event_input_audio_buffer_committed_TYPE_e type,
    char *previous_item_id,
    char *item_id
);

void realtime_server_event_input_audio_buffer_committed_free(realtime_server_event_input_audio_buffer_committed_t *realtime_server_event_input_audio_buffer_committed);

realtime_server_event_input_audio_buffer_committed_t *realtime_server_event_input_audio_buffer_committed_parseFromJSON(cJSON *realtime_server_event_input_audio_buffer_committedJSON);

cJSON *realtime_server_event_input_audio_buffer_committed_convertToJSON(realtime_server_event_input_audio_buffer_committed_t *realtime_server_event_input_audio_buffer_committed);

#endif /* _realtime_server_event_input_audio_buffer_committed_H_ */

