/*
 * realtime_server_event_input_audio_buffer_cleared.h
 *
 * Returned when the input audio buffer is cleared by the client with a  &#x60;input_audio_buffer.clear&#x60; event. 
 */

#ifndef _realtime_server_event_input_audio_buffer_cleared_H_
#define _realtime_server_event_input_audio_buffer_cleared_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_input_audio_buffer_cleared_t realtime_server_event_input_audio_buffer_cleared_t;


// Enum TYPE for realtime_server_event_input_audio_buffer_cleared

typedef enum  { openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_NULL = 0, openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_input_audio_buffer.cleared } openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_e;

char* realtime_server_event_input_audio_buffer_cleared_type_ToString(openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_e type);

openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_e realtime_server_event_input_audio_buffer_cleared_type_FromString(char* type);



typedef struct realtime_server_event_input_audio_buffer_cleared_t {
    char *event_id; // string
    openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_e type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_input_audio_buffer_cleared_t;

__attribute__((deprecated)) realtime_server_event_input_audio_buffer_cleared_t *realtime_server_event_input_audio_buffer_cleared_create(
    char *event_id,
    openai_api_realtime_server_event_input_audio_buffer_cleared_TYPE_e type
);

void realtime_server_event_input_audio_buffer_cleared_free(realtime_server_event_input_audio_buffer_cleared_t *realtime_server_event_input_audio_buffer_cleared);

realtime_server_event_input_audio_buffer_cleared_t *realtime_server_event_input_audio_buffer_cleared_parseFromJSON(cJSON *realtime_server_event_input_audio_buffer_clearedJSON);

cJSON *realtime_server_event_input_audio_buffer_cleared_convertToJSON(realtime_server_event_input_audio_buffer_cleared_t *realtime_server_event_input_audio_buffer_cleared);

#endif /* _realtime_server_event_input_audio_buffer_cleared_H_ */

