/*
 * realtime_server_event_input_audio_buffer_speech_stopped.h
 *
 * Returned in &#x60;server_vad&#x60; mode when the server detects the end of speech in  the audio buffer. The server will also send an &#x60;conversation.item.created&#x60;  event with the user message item that is created from the audio buffer. 
 */

#ifndef _realtime_server_event_input_audio_buffer_speech_stopped_H_
#define _realtime_server_event_input_audio_buffer_speech_stopped_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_input_audio_buffer_speech_stopped_t realtime_server_event_input_audio_buffer_speech_stopped_t;


// Enum TYPE for realtime_server_event_input_audio_buffer_speech_stopped

typedef enum  { openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_NULL = 0, openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_input_audio_buffer.speech_stopped } openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_e;

char* realtime_server_event_input_audio_buffer_speech_stopped_type_ToString(openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_e type);

openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_e realtime_server_event_input_audio_buffer_speech_stopped_type_FromString(char* type);



typedef struct realtime_server_event_input_audio_buffer_speech_stopped_t {
    char *event_id; // string
    openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_e type; //enum
    int audio_end_ms; //numeric
    char *item_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_input_audio_buffer_speech_stopped_t;

__attribute__((deprecated)) realtime_server_event_input_audio_buffer_speech_stopped_t *realtime_server_event_input_audio_buffer_speech_stopped_create(
    char *event_id,
    openai_api_realtime_server_event_input_audio_buffer_speech_stopped_TYPE_e type,
    int audio_end_ms,
    char *item_id
);

void realtime_server_event_input_audio_buffer_speech_stopped_free(realtime_server_event_input_audio_buffer_speech_stopped_t *realtime_server_event_input_audio_buffer_speech_stopped);

realtime_server_event_input_audio_buffer_speech_stopped_t *realtime_server_event_input_audio_buffer_speech_stopped_parseFromJSON(cJSON *realtime_server_event_input_audio_buffer_speech_stoppedJSON);

cJSON *realtime_server_event_input_audio_buffer_speech_stopped_convertToJSON(realtime_server_event_input_audio_buffer_speech_stopped_t *realtime_server_event_input_audio_buffer_speech_stopped);

#endif /* _realtime_server_event_input_audio_buffer_speech_stopped_H_ */

