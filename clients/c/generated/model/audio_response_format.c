#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audio_response_format.h"


char* audio_response_format_audio_response_format_ToString(openai_api_audio_response_format__e audio_response_format) {
    char *audio_response_formatArray[] =  { "NULL", "json", "text", "srt", "verbose_json", "vtt" };
    return audio_response_formatArray[audio_response_format];
}

openai_api_audio_response_format__e audio_response_format_audio_response_format_FromString(char* audio_response_format) {
    int stringToReturn = 0;
    char *audio_response_formatArray[] =  { "NULL", "json", "text", "srt", "verbose_json", "vtt" };
    size_t sizeofArray = sizeof(audio_response_formatArray) / sizeof(audio_response_formatArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(audio_response_format, audio_response_formatArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *audio_response_format_convertToJSON(openai_api_audio_response_format__e audio_response_format) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "audio_response_format", audio_response_format_audio_response_format_ToString(audio_response_format)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

openai_api_audio_response_format__e audio_response_format_parseFromJSON(cJSON *audio_response_formatJSON) {
    if(!cJSON_IsString(audio_response_formatJSON) || (audio_response_formatJSON->valuestring == NULL)) {
        return 0;
    }
    return audio_response_format_audio_response_format_FromString(audio_response_formatJSON->valuestring);
}
