/*
 * realtime_client_event_input_audio_buffer_append.h
 *
 * Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
 */

#ifndef _realtime_client_event_input_audio_buffer_append_H_
#define _realtime_client_event_input_audio_buffer_append_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_client_event_input_audio_buffer_append_t realtime_client_event_input_audio_buffer_append_t;


// Enum TYPE for realtime_client_event_input_audio_buffer_append

typedef enum  { openai_api_realtime_client_event_input_audio_buffer_append_TYPE_NULL = 0, openai_api_realtime_client_event_input_audio_buffer_append_TYPE_input_audio_buffer.append } openai_api_realtime_client_event_input_audio_buffer_append_TYPE_e;

char* realtime_client_event_input_audio_buffer_append_type_ToString(openai_api_realtime_client_event_input_audio_buffer_append_TYPE_e type);

openai_api_realtime_client_event_input_audio_buffer_append_TYPE_e realtime_client_event_input_audio_buffer_append_type_FromString(char* type);



typedef struct realtime_client_event_input_audio_buffer_append_t {
    char *event_id; // string
    openai_api_realtime_client_event_input_audio_buffer_append_TYPE_e type; //enum
    char *audio; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_client_event_input_audio_buffer_append_t;

__attribute__((deprecated)) realtime_client_event_input_audio_buffer_append_t *realtime_client_event_input_audio_buffer_append_create(
    char *event_id,
    openai_api_realtime_client_event_input_audio_buffer_append_TYPE_e type,
    char *audio
);

void realtime_client_event_input_audio_buffer_append_free(realtime_client_event_input_audio_buffer_append_t *realtime_client_event_input_audio_buffer_append);

realtime_client_event_input_audio_buffer_append_t *realtime_client_event_input_audio_buffer_append_parseFromJSON(cJSON *realtime_client_event_input_audio_buffer_appendJSON);

cJSON *realtime_client_event_input_audio_buffer_append_convertToJSON(realtime_client_event_input_audio_buffer_append_t *realtime_client_event_input_audio_buffer_append);

#endif /* _realtime_client_event_input_audio_buffer_append_H_ */

