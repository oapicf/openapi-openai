#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/audio_response_format.h"
#include "../model/create_speech_request.h"
#include "../model/create_transcription_200_response.h"
#include "../model/create_transcription_request_model.h"
#include "../model/create_translation_200_response.h"

// Enum  for AudioAPI_createTranscription
typedef enum  { openai_api_createTranscription__NULL = 0, openai_api_createTranscription__json, openai_api_createTranscription__text, openai_api_createTranscription__srt, openai_api_createTranscription__verbose_json, openai_api_createTranscription__vtt } openai_api_createTranscription_response_format_e;

// Enum TIMESTAMPGRANULARITIES for AudioAPI_createTranscription
typedef enum  { openai_api_createTranscription_TIMESTAMPGRANULARITIES_NULL = 0, openai_api_createTranscription_TIMESTAMPGRANULARITIES_word, openai_api_createTranscription_TIMESTAMPGRANULARITIES_segment } openai_api_createTranscription_timestamp_granularities[]_e;

// Enum  for AudioAPI_createTranslation
typedef enum  { openai_api_createTranslation__NULL = 0, openai_api_createTranslation__json, openai_api_createTranslation__text, openai_api_createTranslation__srt, openai_api_createTranslation__verbose_json, openai_api_createTranslation__vtt } openai_api_createTranslation_response_format_e;


// Generates audio from the input text.
//
binary_t*
AudioAPI_createSpeech(apiClient_t *apiClient, create_speech_request_t *create_speech_request);


// Transcribes audio into the input language.
//
create_transcription_200_response_t*
AudioAPI_createTranscription(apiClient_t *apiClient, binary_t* file, create_transcription_request_model_t *model, char *language, char *prompt, audio_response_format_e response_format, double temperature, list_t *timestamp_granularities[]);


// Translates audio into English.
//
create_translation_200_response_t*
AudioAPI_createTranslation(apiClient_t *apiClient, binary_t* file, create_transcription_request_model_t *model, char *prompt, audio_response_format_e response_format, double temperature);


