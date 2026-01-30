#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_completion_request_audio.h"


char* create_chat_completion_request_audio_voice_ToString(openai_api_create_chat_completion_request_audio_VOICE_e voice) {
    char* voiceArray[] =  { "NULL", "alloy", "ash", "ballad", "coral", "echo", "sage", "shimmer", "verse" };
    return voiceArray[voice];
}

openai_api_create_chat_completion_request_audio_VOICE_e create_chat_completion_request_audio_voice_FromString(char* voice){
    int stringToReturn = 0;
    char *voiceArray[] =  { "NULL", "alloy", "ash", "ballad", "coral", "echo", "sage", "shimmer", "verse" };
    size_t sizeofArray = sizeof(voiceArray) / sizeof(voiceArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(voice, voiceArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* create_chat_completion_request_audio_format_ToString(openai_api_create_chat_completion_request_audio_FORMAT_e format) {
    char* formatArray[] =  { "NULL", "wav", "mp3", "flac", "opus", "pcm16" };
    return formatArray[format];
}

openai_api_create_chat_completion_request_audio_FORMAT_e create_chat_completion_request_audio_format_FromString(char* format){
    int stringToReturn = 0;
    char *formatArray[] =  { "NULL", "wav", "mp3", "flac", "opus", "pcm16" };
    size_t sizeofArray = sizeof(formatArray) / sizeof(formatArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(format, formatArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_chat_completion_request_audio_t *create_chat_completion_request_audio_create_internal(
    openai_api_create_chat_completion_request_audio_VOICE_e voice,
    openai_api_create_chat_completion_request_audio_FORMAT_e format
    ) {
    create_chat_completion_request_audio_t *create_chat_completion_request_audio_local_var = malloc(sizeof(create_chat_completion_request_audio_t));
    if (!create_chat_completion_request_audio_local_var) {
        return NULL;
    }
    create_chat_completion_request_audio_local_var->voice = voice;
    create_chat_completion_request_audio_local_var->format = format;

    create_chat_completion_request_audio_local_var->_library_owned = 1;
    return create_chat_completion_request_audio_local_var;
}

__attribute__((deprecated)) create_chat_completion_request_audio_t *create_chat_completion_request_audio_create(
    openai_api_create_chat_completion_request_audio_VOICE_e voice,
    openai_api_create_chat_completion_request_audio_FORMAT_e format
    ) {
    return create_chat_completion_request_audio_create_internal (
        voice,
        format
        );
}

void create_chat_completion_request_audio_free(create_chat_completion_request_audio_t *create_chat_completion_request_audio) {
    if(NULL == create_chat_completion_request_audio){
        return ;
    }
    if(create_chat_completion_request_audio->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_chat_completion_request_audio_free");
        return ;
    }
    listEntry_t *listEntry;
    free(create_chat_completion_request_audio);
}

cJSON *create_chat_completion_request_audio_convertToJSON(create_chat_completion_request_audio_t *create_chat_completion_request_audio) {
    cJSON *item = cJSON_CreateObject();

    // create_chat_completion_request_audio->voice
    if (openai_api_create_chat_completion_request_audio_VOICE_NULL == create_chat_completion_request_audio->voice) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "voice", create_chat_completion_request_audio_voice_ToString(create_chat_completion_request_audio->voice)) == NULL)
    {
    goto fail; //Enum
    }


    // create_chat_completion_request_audio->format
    if (openai_api_create_chat_completion_request_audio_FORMAT_NULL == create_chat_completion_request_audio->format) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "format", create_chat_completion_request_audio_format_ToString(create_chat_completion_request_audio->format)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_chat_completion_request_audio_t *create_chat_completion_request_audio_parseFromJSON(cJSON *create_chat_completion_request_audioJSON){

    create_chat_completion_request_audio_t *create_chat_completion_request_audio_local_var = NULL;

    // create_chat_completion_request_audio->voice
    cJSON *voice = cJSON_GetObjectItemCaseSensitive(create_chat_completion_request_audioJSON, "voice");
    if (cJSON_IsNull(voice)) {
        voice = NULL;
    }
    if (!voice) {
        goto end;
    }

    openai_api_create_chat_completion_request_audio_VOICE_e voiceVariable;
    
    if(!cJSON_IsString(voice))
    {
    goto end; //Enum
    }
    voiceVariable = create_chat_completion_request_audio_voice_FromString(voice->valuestring);

    // create_chat_completion_request_audio->format
    cJSON *format = cJSON_GetObjectItemCaseSensitive(create_chat_completion_request_audioJSON, "format");
    if (cJSON_IsNull(format)) {
        format = NULL;
    }
    if (!format) {
        goto end;
    }

    openai_api_create_chat_completion_request_audio_FORMAT_e formatVariable;
    
    if(!cJSON_IsString(format))
    {
    goto end; //Enum
    }
    formatVariable = create_chat_completion_request_audio_format_FromString(format->valuestring);


    create_chat_completion_request_audio_local_var = create_chat_completion_request_audio_create_internal (
        voiceVariable,
        formatVariable
        );

    return create_chat_completion_request_audio_local_var;
end:
    return NULL;

}
