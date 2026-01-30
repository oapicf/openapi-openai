/*
 * realtime_server_event_conversation_item_input_audio_transcription_completed.h
 *
 * This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in &#x60;server_vad&#x60; mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always &#x60;whisper-1&#x60;. Thus the transcript may diverge somewhat from  the model&#39;s interpretation, and should be treated as a rough guide. 
 */

#ifndef _realtime_server_event_conversation_item_input_audio_transcription_completed_H_
#define _realtime_server_event_conversation_item_input_audio_transcription_completed_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_conversation_item_input_audio_transcription_completed_t realtime_server_event_conversation_item_input_audio_transcription_completed_t;


// Enum TYPE for realtime_server_event_conversation_item_input_audio_transcription_completed

typedef enum  { openai_api_realtime_server_event_conversation_item_input_audio_transcription_completed_TYPE_NULL = 0, openai_api_realtime_server_event_conversation_item_input_audio_transcription_completed_TYPE_conversation.item.input_audio_transcription.completed } openai_api_realtime_server_event_conversation_item_input_audio_transcription_completed_TYPE_e;

char* realtime_server_event_conversation_item_input_audio_transcription_completed_type_ToString(openai_api_realtime_server_event_conversation_item_input_audio_transcription_completed_TYPE_e type);

openai_api_realtime_server_event_conversation_item_input_audio_transcription_completed_TYPE_e realtime_server_event_conversation_item_input_audio_transcription_completed_type_FromString(char* type);



typedef struct realtime_server_event_conversation_item_input_audio_transcription_completed_t {
    char *event_id; // string
    openai_api_realtime_server_event_conversation_item_input_audio_transcription_completed_TYPE_e type; //enum
    char *item_id; // string
    int content_index; //numeric
    char *transcript; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_conversation_item_input_audio_transcription_completed_t;

__attribute__((deprecated)) realtime_server_event_conversation_item_input_audio_transcription_completed_t *realtime_server_event_conversation_item_input_audio_transcription_completed_create(
    char *event_id,
    openai_api_realtime_server_event_conversation_item_input_audio_transcription_completed_TYPE_e type,
    char *item_id,
    int content_index,
    char *transcript
);

void realtime_server_event_conversation_item_input_audio_transcription_completed_free(realtime_server_event_conversation_item_input_audio_transcription_completed_t *realtime_server_event_conversation_item_input_audio_transcription_completed);

realtime_server_event_conversation_item_input_audio_transcription_completed_t *realtime_server_event_conversation_item_input_audio_transcription_completed_parseFromJSON(cJSON *realtime_server_event_conversation_item_input_audio_transcription_completedJSON);

cJSON *realtime_server_event_conversation_item_input_audio_transcription_completed_convertToJSON(realtime_server_event_conversation_item_input_audio_transcription_completed_t *realtime_server_event_conversation_item_input_audio_transcription_completed);

#endif /* _realtime_server_event_conversation_item_input_audio_transcription_completed_H_ */

