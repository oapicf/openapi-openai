/*
 * realtime_server_event_conversation_item_input_audio_transcription_failed_error.h
 *
 * Details of the transcription error.
 */

#ifndef _realtime_server_event_conversation_item_input_audio_transcription_failed_error_H_
#define _realtime_server_event_conversation_item_input_audio_transcription_failed_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_conversation_item_input_audio_transcription_failed_error_t realtime_server_event_conversation_item_input_audio_transcription_failed_error_t;




typedef struct realtime_server_event_conversation_item_input_audio_transcription_failed_error_t {
    char *type; // string
    char *code; // string
    char *message; // string
    char *param; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_conversation_item_input_audio_transcription_failed_error_t;

__attribute__((deprecated)) realtime_server_event_conversation_item_input_audio_transcription_failed_error_t *realtime_server_event_conversation_item_input_audio_transcription_failed_error_create(
    char *type,
    char *code,
    char *message,
    char *param
);

void realtime_server_event_conversation_item_input_audio_transcription_failed_error_free(realtime_server_event_conversation_item_input_audio_transcription_failed_error_t *realtime_server_event_conversation_item_input_audio_transcription_failed_error);

realtime_server_event_conversation_item_input_audio_transcription_failed_error_t *realtime_server_event_conversation_item_input_audio_transcription_failed_error_parseFromJSON(cJSON *realtime_server_event_conversation_item_input_audio_transcription_failed_errorJSON);

cJSON *realtime_server_event_conversation_item_input_audio_transcription_failed_error_convertToJSON(realtime_server_event_conversation_item_input_audio_transcription_failed_error_t *realtime_server_event_conversation_item_input_audio_transcription_failed_error);

#endif /* _realtime_server_event_conversation_item_input_audio_transcription_failed_error_H_ */

