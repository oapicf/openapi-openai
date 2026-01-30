#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_message_content_part_audio_input_audio.h"


char* chat_completion_request_message_content_part_audio_input_audio_format_ToString(openai_api_chat_completion_request_message_content_part_audio_input_audio_FORMAT_e format) {
    char* formatArray[] =  { "NULL", "wav", "mp3" };
    return formatArray[format];
}

openai_api_chat_completion_request_message_content_part_audio_input_audio_FORMAT_e chat_completion_request_message_content_part_audio_input_audio_format_FromString(char* format){
    int stringToReturn = 0;
    char *formatArray[] =  { "NULL", "wav", "mp3" };
    size_t sizeofArray = sizeof(formatArray) / sizeof(formatArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(format, formatArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static chat_completion_request_message_content_part_audio_input_audio_t *chat_completion_request_message_content_part_audio_input_audio_create_internal(
    char *data,
    openai_api_chat_completion_request_message_content_part_audio_input_audio_FORMAT_e format
    ) {
    chat_completion_request_message_content_part_audio_input_audio_t *chat_completion_request_message_content_part_audio_input_audio_local_var = malloc(sizeof(chat_completion_request_message_content_part_audio_input_audio_t));
    if (!chat_completion_request_message_content_part_audio_input_audio_local_var) {
        return NULL;
    }
    chat_completion_request_message_content_part_audio_input_audio_local_var->data = data;
    chat_completion_request_message_content_part_audio_input_audio_local_var->format = format;

    chat_completion_request_message_content_part_audio_input_audio_local_var->_library_owned = 1;
    return chat_completion_request_message_content_part_audio_input_audio_local_var;
}

__attribute__((deprecated)) chat_completion_request_message_content_part_audio_input_audio_t *chat_completion_request_message_content_part_audio_input_audio_create(
    char *data,
    openai_api_chat_completion_request_message_content_part_audio_input_audio_FORMAT_e format
    ) {
    return chat_completion_request_message_content_part_audio_input_audio_create_internal (
        data,
        format
        );
}

void chat_completion_request_message_content_part_audio_input_audio_free(chat_completion_request_message_content_part_audio_input_audio_t *chat_completion_request_message_content_part_audio_input_audio) {
    if(NULL == chat_completion_request_message_content_part_audio_input_audio){
        return ;
    }
    if(chat_completion_request_message_content_part_audio_input_audio->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_request_message_content_part_audio_input_audio_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_message_content_part_audio_input_audio->data) {
        free(chat_completion_request_message_content_part_audio_input_audio->data);
        chat_completion_request_message_content_part_audio_input_audio->data = NULL;
    }
    free(chat_completion_request_message_content_part_audio_input_audio);
}

cJSON *chat_completion_request_message_content_part_audio_input_audio_convertToJSON(chat_completion_request_message_content_part_audio_input_audio_t *chat_completion_request_message_content_part_audio_input_audio) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_message_content_part_audio_input_audio->data
    if (!chat_completion_request_message_content_part_audio_input_audio->data) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "data", chat_completion_request_message_content_part_audio_input_audio->data) == NULL) {
    goto fail; //String
    }


    // chat_completion_request_message_content_part_audio_input_audio->format
    if (openai_api_chat_completion_request_message_content_part_audio_input_audio_FORMAT_NULL == chat_completion_request_message_content_part_audio_input_audio->format) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "format", chat_completion_request_message_content_part_audio_input_audio_format_ToString(chat_completion_request_message_content_part_audio_input_audio->format)) == NULL)
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

chat_completion_request_message_content_part_audio_input_audio_t *chat_completion_request_message_content_part_audio_input_audio_parseFromJSON(cJSON *chat_completion_request_message_content_part_audio_input_audioJSON){

    chat_completion_request_message_content_part_audio_input_audio_t *chat_completion_request_message_content_part_audio_input_audio_local_var = NULL;

    // chat_completion_request_message_content_part_audio_input_audio->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_part_audio_input_audioJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (!data) {
        goto end;
    }

    
    if(!cJSON_IsString(data))
    {
    goto end; //String
    }

    // chat_completion_request_message_content_part_audio_input_audio->format
    cJSON *format = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_part_audio_input_audioJSON, "format");
    if (cJSON_IsNull(format)) {
        format = NULL;
    }
    if (!format) {
        goto end;
    }

    openai_api_chat_completion_request_message_content_part_audio_input_audio_FORMAT_e formatVariable;
    
    if(!cJSON_IsString(format))
    {
    goto end; //Enum
    }
    formatVariable = chat_completion_request_message_content_part_audio_input_audio_format_FromString(format->valuestring);


    chat_completion_request_message_content_part_audio_input_audio_local_var = chat_completion_request_message_content_part_audio_input_audio_create_internal (
        strdup(data->valuestring),
        formatVariable
        );

    return chat_completion_request_message_content_part_audio_input_audio_local_var;
end:
    return NULL;

}
