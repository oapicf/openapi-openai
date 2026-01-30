/*
 * create_chat_completion_request_audio.h
 *
 * Parameters for audio output. Required when audio output is requested with &#x60;modalities: [\&quot;audio\&quot;]&#x60;. [Learn more](/docs/guides/audio). 
 */

#ifndef _create_chat_completion_request_audio_H_
#define _create_chat_completion_request_audio_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_completion_request_audio_t create_chat_completion_request_audio_t;


// Enum VOICE for create_chat_completion_request_audio

typedef enum  { openai_api_create_chat_completion_request_audio_VOICE_NULL = 0, openai_api_create_chat_completion_request_audio_VOICE_alloy, openai_api_create_chat_completion_request_audio_VOICE_ash, openai_api_create_chat_completion_request_audio_VOICE_ballad, openai_api_create_chat_completion_request_audio_VOICE_coral, openai_api_create_chat_completion_request_audio_VOICE_echo, openai_api_create_chat_completion_request_audio_VOICE_sage, openai_api_create_chat_completion_request_audio_VOICE_shimmer, openai_api_create_chat_completion_request_audio_VOICE_verse } openai_api_create_chat_completion_request_audio_VOICE_e;

char* create_chat_completion_request_audio_voice_ToString(openai_api_create_chat_completion_request_audio_VOICE_e voice);

openai_api_create_chat_completion_request_audio_VOICE_e create_chat_completion_request_audio_voice_FromString(char* voice);

// Enum FORMAT for create_chat_completion_request_audio

typedef enum  { openai_api_create_chat_completion_request_audio_FORMAT_NULL = 0, openai_api_create_chat_completion_request_audio_FORMAT_wav, openai_api_create_chat_completion_request_audio_FORMAT_mp3, openai_api_create_chat_completion_request_audio_FORMAT_flac, openai_api_create_chat_completion_request_audio_FORMAT_opus, openai_api_create_chat_completion_request_audio_FORMAT_pcm16 } openai_api_create_chat_completion_request_audio_FORMAT_e;

char* create_chat_completion_request_audio_format_ToString(openai_api_create_chat_completion_request_audio_FORMAT_e format);

openai_api_create_chat_completion_request_audio_FORMAT_e create_chat_completion_request_audio_format_FromString(char* format);



typedef struct create_chat_completion_request_audio_t {
    openai_api_create_chat_completion_request_audio_VOICE_e voice; //enum
    openai_api_create_chat_completion_request_audio_FORMAT_e format; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} create_chat_completion_request_audio_t;

__attribute__((deprecated)) create_chat_completion_request_audio_t *create_chat_completion_request_audio_create(
    openai_api_create_chat_completion_request_audio_VOICE_e voice,
    openai_api_create_chat_completion_request_audio_FORMAT_e format
);

void create_chat_completion_request_audio_free(create_chat_completion_request_audio_t *create_chat_completion_request_audio);

create_chat_completion_request_audio_t *create_chat_completion_request_audio_parseFromJSON(cJSON *create_chat_completion_request_audioJSON);

cJSON *create_chat_completion_request_audio_convertToJSON(create_chat_completion_request_audio_t *create_chat_completion_request_audio);

#endif /* _create_chat_completion_request_audio_H_ */

