/*
 * realtime_client_event_input_audio_buffer_clear.h
 *
 * Send this event to clear the audio bytes in the buffer. The server will  respond with an &#x60;input_audio_buffer.cleared&#x60; event. 
 */

#ifndef _realtime_client_event_input_audio_buffer_clear_H_
#define _realtime_client_event_input_audio_buffer_clear_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_client_event_input_audio_buffer_clear_t realtime_client_event_input_audio_buffer_clear_t;


// Enum TYPE for realtime_client_event_input_audio_buffer_clear

typedef enum  { openai_api_realtime_client_event_input_audio_buffer_clear_TYPE_NULL = 0, openai_api_realtime_client_event_input_audio_buffer_clear_TYPE_input_audio_buffer.clear } openai_api_realtime_client_event_input_audio_buffer_clear_TYPE_e;

char* realtime_client_event_input_audio_buffer_clear_type_ToString(openai_api_realtime_client_event_input_audio_buffer_clear_TYPE_e type);

openai_api_realtime_client_event_input_audio_buffer_clear_TYPE_e realtime_client_event_input_audio_buffer_clear_type_FromString(char* type);



typedef struct realtime_client_event_input_audio_buffer_clear_t {
    char *event_id; // string
    openai_api_realtime_client_event_input_audio_buffer_clear_TYPE_e type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_client_event_input_audio_buffer_clear_t;

__attribute__((deprecated)) realtime_client_event_input_audio_buffer_clear_t *realtime_client_event_input_audio_buffer_clear_create(
    char *event_id,
    openai_api_realtime_client_event_input_audio_buffer_clear_TYPE_e type
);

void realtime_client_event_input_audio_buffer_clear_free(realtime_client_event_input_audio_buffer_clear_t *realtime_client_event_input_audio_buffer_clear);

realtime_client_event_input_audio_buffer_clear_t *realtime_client_event_input_audio_buffer_clear_parseFromJSON(cJSON *realtime_client_event_input_audio_buffer_clearJSON);

cJSON *realtime_client_event_input_audio_buffer_clear_convertToJSON(realtime_client_event_input_audio_buffer_clear_t *realtime_client_event_input_audio_buffer_clear);

#endif /* _realtime_client_event_input_audio_buffer_clear_H_ */

