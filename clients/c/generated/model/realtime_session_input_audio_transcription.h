/*
 * realtime_session_input_audio_transcription.h
 *
 * Configuration for input audio transcription, defaults to off and can be  set to &#x60;null&#x60; to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
 */

#ifndef _realtime_session_input_audio_transcription_H_
#define _realtime_session_input_audio_transcription_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_session_input_audio_transcription_t realtime_session_input_audio_transcription_t;




typedef struct realtime_session_input_audio_transcription_t {
    char *model; // string

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_session_input_audio_transcription_t;

__attribute__((deprecated)) realtime_session_input_audio_transcription_t *realtime_session_input_audio_transcription_create(
    char *model
);

void realtime_session_input_audio_transcription_free(realtime_session_input_audio_transcription_t *realtime_session_input_audio_transcription);

realtime_session_input_audio_transcription_t *realtime_session_input_audio_transcription_parseFromJSON(cJSON *realtime_session_input_audio_transcriptionJSON);

cJSON *realtime_session_input_audio_transcription_convertToJSON(realtime_session_input_audio_transcription_t *realtime_session_input_audio_transcription);

#endif /* _realtime_session_input_audio_transcription_H_ */

