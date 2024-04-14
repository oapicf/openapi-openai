/*
 * create_speech_request.h
 *
 * 
 */

#ifndef _create_speech_request_H_
#define _create_speech_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_speech_request_t create_speech_request_t;

#include "create_speech_request_model.h"

// Enum VOICE for create_speech_request

typedef enum  { openai_api_create_speech_request_VOICE_NULL = 0, openai_api_create_speech_request_VOICE_alloy, openai_api_create_speech_request_VOICE_echo, openai_api_create_speech_request_VOICE_fable, openai_api_create_speech_request_VOICE_onyx, openai_api_create_speech_request_VOICE_nova, openai_api_create_speech_request_VOICE_shimmer } openai_api_create_speech_request_VOICE_e;

char* create_speech_request_voice_ToString(openai_api_create_speech_request_VOICE_e voice);

openai_api_create_speech_request_VOICE_e create_speech_request_voice_FromString(char* voice);

// Enum RESPONSEFORMAT for create_speech_request

typedef enum  { openai_api_create_speech_request_RESPONSEFORMAT_NULL = 0, openai_api_create_speech_request_RESPONSEFORMAT_mp3, openai_api_create_speech_request_RESPONSEFORMAT_opus, openai_api_create_speech_request_RESPONSEFORMAT_aac, openai_api_create_speech_request_RESPONSEFORMAT_flac, openai_api_create_speech_request_RESPONSEFORMAT_wav, openai_api_create_speech_request_RESPONSEFORMAT_pcm } openai_api_create_speech_request_RESPONSEFORMAT_e;

char* create_speech_request_response_format_ToString(openai_api_create_speech_request_RESPONSEFORMAT_e response_format);

openai_api_create_speech_request_RESPONSEFORMAT_e create_speech_request_response_format_FromString(char* response_format);



typedef struct create_speech_request_t {
    struct create_speech_request_model_t *model; //model
    char *input; // string
    openai_api_create_speech_request_VOICE_e voice; //enum
    openai_api_create_speech_request_RESPONSEFORMAT_e response_format; //enum
    double speed; //numeric

} create_speech_request_t;

create_speech_request_t *create_speech_request_create(
    create_speech_request_model_t *model,
    char *input,
    openai_api_create_speech_request_VOICE_e voice,
    openai_api_create_speech_request_RESPONSEFORMAT_e response_format,
    double speed
);

void create_speech_request_free(create_speech_request_t *create_speech_request);

create_speech_request_t *create_speech_request_parseFromJSON(cJSON *create_speech_requestJSON);

cJSON *create_speech_request_convertToJSON(create_speech_request_t *create_speech_request);

#endif /* _create_speech_request_H_ */

