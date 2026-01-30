/*
 * realtime_session_create_response.h
 *
 * A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. 
 */

#ifndef _realtime_session_create_response_H_
#define _realtime_session_create_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_session_create_response_t realtime_session_create_response_t;

#include "realtime_response_create_params_max_response_output_tokens.h"
#include "realtime_response_create_params_tools_inner.h"
#include "realtime_session_create_response_client_secret.h"
#include "realtime_session_create_response_turn_detection.h"
#include "realtime_session_input_audio_transcription.h"

// Enum MODALITIES for realtime_session_create_response

typedef enum  { openai_api_realtime_session_create_response_MODALITIES_NULL = 0, openai_api_realtime_session_create_response_MODALITIES_text, openai_api_realtime_session_create_response_MODALITIES_audio } openai_api_realtime_session_create_response_MODALITIES_e;

char* realtime_session_create_response_modalities_ToString(openai_api_realtime_session_create_response_MODALITIES_e modalities);

openai_api_realtime_session_create_response_MODALITIES_e realtime_session_create_response_modalities_FromString(char* modalities);

// Enum VOICE for realtime_session_create_response

typedef enum  { openai_api_realtime_session_create_response_VOICE_NULL = 0, openai_api_realtime_session_create_response_VOICE_alloy, openai_api_realtime_session_create_response_VOICE_ash, openai_api_realtime_session_create_response_VOICE_ballad, openai_api_realtime_session_create_response_VOICE_coral, openai_api_realtime_session_create_response_VOICE_echo, openai_api_realtime_session_create_response_VOICE_sage, openai_api_realtime_session_create_response_VOICE_shimmer, openai_api_realtime_session_create_response_VOICE_verse } openai_api_realtime_session_create_response_VOICE_e;

char* realtime_session_create_response_voice_ToString(openai_api_realtime_session_create_response_VOICE_e voice);

openai_api_realtime_session_create_response_VOICE_e realtime_session_create_response_voice_FromString(char* voice);



typedef struct realtime_session_create_response_t {
    struct realtime_session_create_response_client_secret_t *client_secret; //model
    list_t *modalities; //primitive container
    char *instructions; // string
    openai_api_realtime_session_create_response_VOICE_e voice; //enum
    char *input_audio_format; // string
    char *output_audio_format; // string
    struct realtime_session_input_audio_transcription_t *input_audio_transcription; //model
    struct realtime_session_create_response_turn_detection_t *turn_detection; //model
    list_t *tools; //nonprimitive container
    char *tool_choice; // string
    double temperature; //numeric
    struct realtime_response_create_params_max_response_output_tokens_t *max_response_output_tokens; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_session_create_response_t;

__attribute__((deprecated)) realtime_session_create_response_t *realtime_session_create_response_create(
    realtime_session_create_response_client_secret_t *client_secret,
    list_t *modalities,
    char *instructions,
    openai_api_realtime_session_create_response_VOICE_e voice,
    char *input_audio_format,
    char *output_audio_format,
    realtime_session_input_audio_transcription_t *input_audio_transcription,
    realtime_session_create_response_turn_detection_t *turn_detection,
    list_t *tools,
    char *tool_choice,
    double temperature,
    realtime_response_create_params_max_response_output_tokens_t *max_response_output_tokens
);

void realtime_session_create_response_free(realtime_session_create_response_t *realtime_session_create_response);

realtime_session_create_response_t *realtime_session_create_response_parseFromJSON(cJSON *realtime_session_create_responseJSON);

cJSON *realtime_session_create_response_convertToJSON(realtime_session_create_response_t *realtime_session_create_response);

#endif /* _realtime_session_create_response_H_ */

