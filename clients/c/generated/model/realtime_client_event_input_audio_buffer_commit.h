/*
 * realtime_client_event_input_audio_buffer_commit.h
 *
 * Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an &#x60;input_audio_buffer.committed&#x60;  event. 
 */

#ifndef _realtime_client_event_input_audio_buffer_commit_H_
#define _realtime_client_event_input_audio_buffer_commit_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_client_event_input_audio_buffer_commit_t realtime_client_event_input_audio_buffer_commit_t;


// Enum TYPE for realtime_client_event_input_audio_buffer_commit

typedef enum  { openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_NULL = 0, openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_input_audio_buffer.commit } openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_e;

char* realtime_client_event_input_audio_buffer_commit_type_ToString(openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_e type);

openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_e realtime_client_event_input_audio_buffer_commit_type_FromString(char* type);



typedef struct realtime_client_event_input_audio_buffer_commit_t {
    char *event_id; // string
    openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_e type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_client_event_input_audio_buffer_commit_t;

__attribute__((deprecated)) realtime_client_event_input_audio_buffer_commit_t *realtime_client_event_input_audio_buffer_commit_create(
    char *event_id,
    openai_api_realtime_client_event_input_audio_buffer_commit_TYPE_e type
);

void realtime_client_event_input_audio_buffer_commit_free(realtime_client_event_input_audio_buffer_commit_t *realtime_client_event_input_audio_buffer_commit);

realtime_client_event_input_audio_buffer_commit_t *realtime_client_event_input_audio_buffer_commit_parseFromJSON(cJSON *realtime_client_event_input_audio_buffer_commitJSON);

cJSON *realtime_client_event_input_audio_buffer_commit_convertToJSON(realtime_client_event_input_audio_buffer_commit_t *realtime_client_event_input_audio_buffer_commit);

#endif /* _realtime_client_event_input_audio_buffer_commit_H_ */

