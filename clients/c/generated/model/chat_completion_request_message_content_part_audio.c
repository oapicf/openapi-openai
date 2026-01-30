#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_message_content_part_audio.h"


char* chat_completion_request_message_content_part_audio_type_ToString(openai_api_chat_completion_request_message_content_part_audio_TYPE_e type) {
    char* typeArray[] =  { "NULL", "input_audio" };
    return typeArray[type];
}

openai_api_chat_completion_request_message_content_part_audio_TYPE_e chat_completion_request_message_content_part_audio_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "input_audio" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static chat_completion_request_message_content_part_audio_t *chat_completion_request_message_content_part_audio_create_internal(
    openai_api_chat_completion_request_message_content_part_audio_TYPE_e type,
    chat_completion_request_message_content_part_audio_input_audio_t *input_audio
    ) {
    chat_completion_request_message_content_part_audio_t *chat_completion_request_message_content_part_audio_local_var = malloc(sizeof(chat_completion_request_message_content_part_audio_t));
    if (!chat_completion_request_message_content_part_audio_local_var) {
        return NULL;
    }
    chat_completion_request_message_content_part_audio_local_var->type = type;
    chat_completion_request_message_content_part_audio_local_var->input_audio = input_audio;

    chat_completion_request_message_content_part_audio_local_var->_library_owned = 1;
    return chat_completion_request_message_content_part_audio_local_var;
}

__attribute__((deprecated)) chat_completion_request_message_content_part_audio_t *chat_completion_request_message_content_part_audio_create(
    openai_api_chat_completion_request_message_content_part_audio_TYPE_e type,
    chat_completion_request_message_content_part_audio_input_audio_t *input_audio
    ) {
    return chat_completion_request_message_content_part_audio_create_internal (
        type,
        input_audio
        );
}

void chat_completion_request_message_content_part_audio_free(chat_completion_request_message_content_part_audio_t *chat_completion_request_message_content_part_audio) {
    if(NULL == chat_completion_request_message_content_part_audio){
        return ;
    }
    if(chat_completion_request_message_content_part_audio->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_request_message_content_part_audio_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_message_content_part_audio->input_audio) {
        chat_completion_request_message_content_part_audio_input_audio_free(chat_completion_request_message_content_part_audio->input_audio);
        chat_completion_request_message_content_part_audio->input_audio = NULL;
    }
    free(chat_completion_request_message_content_part_audio);
}

cJSON *chat_completion_request_message_content_part_audio_convertToJSON(chat_completion_request_message_content_part_audio_t *chat_completion_request_message_content_part_audio) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_message_content_part_audio->type
    if (openai_api_chat_completion_request_message_content_part_audio_TYPE_NULL == chat_completion_request_message_content_part_audio->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", chat_completion_request_message_content_part_audio_type_ToString(chat_completion_request_message_content_part_audio->type)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_request_message_content_part_audio->input_audio
    if (!chat_completion_request_message_content_part_audio->input_audio) {
        goto fail;
    }
    cJSON *input_audio_local_JSON = chat_completion_request_message_content_part_audio_input_audio_convertToJSON(chat_completion_request_message_content_part_audio->input_audio);
    if(input_audio_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "input_audio", input_audio_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_request_message_content_part_audio_t *chat_completion_request_message_content_part_audio_parseFromJSON(cJSON *chat_completion_request_message_content_part_audioJSON){

    chat_completion_request_message_content_part_audio_t *chat_completion_request_message_content_part_audio_local_var = NULL;

    // define the local variable for chat_completion_request_message_content_part_audio->input_audio
    chat_completion_request_message_content_part_audio_input_audio_t *input_audio_local_nonprim = NULL;

    // chat_completion_request_message_content_part_audio->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_part_audioJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_chat_completion_request_message_content_part_audio_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = chat_completion_request_message_content_part_audio_type_FromString(type->valuestring);

    // chat_completion_request_message_content_part_audio->input_audio
    cJSON *input_audio = cJSON_GetObjectItemCaseSensitive(chat_completion_request_message_content_part_audioJSON, "input_audio");
    if (cJSON_IsNull(input_audio)) {
        input_audio = NULL;
    }
    if (!input_audio) {
        goto end;
    }

    
    input_audio_local_nonprim = chat_completion_request_message_content_part_audio_input_audio_parseFromJSON(input_audio); //nonprimitive


    chat_completion_request_message_content_part_audio_local_var = chat_completion_request_message_content_part_audio_create_internal (
        typeVariable,
        input_audio_local_nonprim
        );

    return chat_completion_request_message_content_part_audio_local_var;
end:
    if (input_audio_local_nonprim) {
        chat_completion_request_message_content_part_audio_input_audio_free(input_audio_local_nonprim);
        input_audio_local_nonprim = NULL;
    }
    return NULL;

}
