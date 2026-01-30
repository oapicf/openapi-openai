/*
 * realtime_response_create_params.h
 *
 * Create a new Realtime response with these parameters
 */

#ifndef _realtime_response_create_params_H_
#define _realtime_response_create_params_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_response_create_params_t realtime_response_create_params_t;

#include "object.h"
#include "realtime_conversation_item.h"
#include "realtime_response_create_params_conversation.h"
#include "realtime_response_create_params_max_response_output_tokens.h"
#include "realtime_response_create_params_tools_inner.h"

// Enum MODALITIES for realtime_response_create_params

typedef enum  { openai_api_realtime_response_create_params_MODALITIES_NULL = 0, openai_api_realtime_response_create_params_MODALITIES_text, openai_api_realtime_response_create_params_MODALITIES_audio } openai_api_realtime_response_create_params_MODALITIES_e;

char* realtime_response_create_params_modalities_ToString(openai_api_realtime_response_create_params_MODALITIES_e modalities);

openai_api_realtime_response_create_params_MODALITIES_e realtime_response_create_params_modalities_FromString(char* modalities);

// Enum VOICE for realtime_response_create_params

typedef enum  { openai_api_realtime_response_create_params_VOICE_NULL = 0, openai_api_realtime_response_create_params_VOICE_alloy, openai_api_realtime_response_create_params_VOICE_ash, openai_api_realtime_response_create_params_VOICE_ballad, openai_api_realtime_response_create_params_VOICE_coral, openai_api_realtime_response_create_params_VOICE_echo, openai_api_realtime_response_create_params_VOICE_sage, openai_api_realtime_response_create_params_VOICE_shimmer, openai_api_realtime_response_create_params_VOICE_verse } openai_api_realtime_response_create_params_VOICE_e;

char* realtime_response_create_params_voice_ToString(openai_api_realtime_response_create_params_VOICE_e voice);

openai_api_realtime_response_create_params_VOICE_e realtime_response_create_params_voice_FromString(char* voice);

// Enum OUTPUTAUDIOFORMAT for realtime_response_create_params

typedef enum  { openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_NULL = 0, openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_pcm16, openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_g711_ulaw, openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_g711_alaw } openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_e;

char* realtime_response_create_params_output_audio_format_ToString(openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_e output_audio_format);

openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_e realtime_response_create_params_output_audio_format_FromString(char* output_audio_format);



typedef struct realtime_response_create_params_t {
    list_t *modalities; //primitive container
    char *instructions; // string
    openai_api_realtime_response_create_params_VOICE_e voice; //enum
    openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_e output_audio_format; //enum
    list_t *tools; //nonprimitive container
    char *tool_choice; // string
    double temperature; //numeric
    struct realtime_response_create_params_max_response_output_tokens_t *max_response_output_tokens; //model
    struct realtime_response_create_params_conversation_t *conversation; //model
    object_t *metadata; //object
    list_t *input; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_response_create_params_t;

__attribute__((deprecated)) realtime_response_create_params_t *realtime_response_create_params_create(
    list_t *modalities,
    char *instructions,
    openai_api_realtime_response_create_params_VOICE_e voice,
    openai_api_realtime_response_create_params_OUTPUTAUDIOFORMAT_e output_audio_format,
    list_t *tools,
    char *tool_choice,
    double temperature,
    realtime_response_create_params_max_response_output_tokens_t *max_response_output_tokens,
    realtime_response_create_params_conversation_t *conversation,
    object_t *metadata,
    list_t *input
);

void realtime_response_create_params_free(realtime_response_create_params_t *realtime_response_create_params);

realtime_response_create_params_t *realtime_response_create_params_parseFromJSON(cJSON *realtime_response_create_paramsJSON);

cJSON *realtime_response_create_params_convertToJSON(realtime_response_create_params_t *realtime_response_create_params);

#endif /* _realtime_response_create_params_H_ */

