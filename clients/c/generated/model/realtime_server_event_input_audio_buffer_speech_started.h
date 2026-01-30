/*
 * realtime_server_event_input_audio_buffer_speech_started.h
 *
 * Sent by the server when in &#x60;server_vad&#x60; mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a &#x60;input_audio_buffer.speech_stopped&#x60; event  when speech stops. The &#x60;item_id&#x60; property is the ID of the user message item  that will be created when speech stops and will also be included in the  &#x60;input_audio_buffer.speech_stopped&#x60; event (unless the client manually commits  the audio buffer during VAD activation). 
 */

#ifndef _realtime_server_event_input_audio_buffer_speech_started_H_
#define _realtime_server_event_input_audio_buffer_speech_started_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_input_audio_buffer_speech_started_t realtime_server_event_input_audio_buffer_speech_started_t;


// Enum TYPE for realtime_server_event_input_audio_buffer_speech_started

typedef enum  { openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_NULL = 0, openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_input_audio_buffer.speech_started } openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_e;

char* realtime_server_event_input_audio_buffer_speech_started_type_ToString(openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_e type);

openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_e realtime_server_event_input_audio_buffer_speech_started_type_FromString(char* type);



typedef struct realtime_server_event_input_audio_buffer_speech_started_t {
    char *event_id; // string
    openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_e type; //enum
    int audio_start_ms; //numeric
    char *item_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_input_audio_buffer_speech_started_t;

__attribute__((deprecated)) realtime_server_event_input_audio_buffer_speech_started_t *realtime_server_event_input_audio_buffer_speech_started_create(
    char *event_id,
    openai_api_realtime_server_event_input_audio_buffer_speech_started_TYPE_e type,
    int audio_start_ms,
    char *item_id
);

void realtime_server_event_input_audio_buffer_speech_started_free(realtime_server_event_input_audio_buffer_speech_started_t *realtime_server_event_input_audio_buffer_speech_started);

realtime_server_event_input_audio_buffer_speech_started_t *realtime_server_event_input_audio_buffer_speech_started_parseFromJSON(cJSON *realtime_server_event_input_audio_buffer_speech_startedJSON);

cJSON *realtime_server_event_input_audio_buffer_speech_started_convertToJSON(realtime_server_event_input_audio_buffer_speech_started_t *realtime_server_event_input_audio_buffer_speech_started);

#endif /* _realtime_server_event_input_audio_buffer_speech_started_H_ */

