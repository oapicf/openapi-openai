#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_response_message_audio.h"



static chat_completion_response_message_audio_t *chat_completion_response_message_audio_create_internal(
    char *id,
    int *expires_at,
    char *data,
    char *transcript
    ) {
    chat_completion_response_message_audio_t *chat_completion_response_message_audio_local_var = malloc(sizeof(chat_completion_response_message_audio_t));
    if (!chat_completion_response_message_audio_local_var) {
        return NULL;
    }
    memset(chat_completion_response_message_audio_local_var, 0, sizeof(chat_completion_response_message_audio_t));
    chat_completion_response_message_audio_local_var->_library_owned = 1;
    chat_completion_response_message_audio_local_var->id = id;
    chat_completion_response_message_audio_local_var->expires_at = expires_at;
    chat_completion_response_message_audio_local_var->data = data;
    chat_completion_response_message_audio_local_var->transcript = transcript;
    return chat_completion_response_message_audio_local_var;
}

__attribute__((deprecated)) chat_completion_response_message_audio_t *chat_completion_response_message_audio_create(
    char *id,
    int *expires_at,
    char *data,
    char *transcript
    ) {
    int *expires_at_copy = NULL;
    if (expires_at) {
        expires_at_copy = malloc(sizeof(int));
        if (expires_at_copy) *expires_at_copy = *expires_at;
    }
    chat_completion_response_message_audio_t *result = chat_completion_response_message_audio_create_internal (
        id,
        expires_at_copy,
        data,
        transcript
        );
    if (!result) {
        free(expires_at_copy);
    }
    return result;
}

void chat_completion_response_message_audio_free(chat_completion_response_message_audio_t *chat_completion_response_message_audio) {
    if(NULL == chat_completion_response_message_audio){
        return ;
    }
    if(chat_completion_response_message_audio->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_response_message_audio_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_response_message_audio->id) {
        free(chat_completion_response_message_audio->id);
        chat_completion_response_message_audio->id = NULL;
    }
    if (chat_completion_response_message_audio->expires_at) {
        free(chat_completion_response_message_audio->expires_at);
        chat_completion_response_message_audio->expires_at = NULL;
    }
    if (chat_completion_response_message_audio->data) {
        free(chat_completion_response_message_audio->data);
        chat_completion_response_message_audio->data = NULL;
    }
    if (chat_completion_response_message_audio->transcript) {
        free(chat_completion_response_message_audio->transcript);
        chat_completion_response_message_audio->transcript = NULL;
    }
    free(chat_completion_response_message_audio);
}

cJSON *chat_completion_response_message_audio_convertToJSON(chat_completion_response_message_audio_t *chat_completion_response_message_audio) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_response_message_audio->id
    if (!chat_completion_response_message_audio->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", chat_completion_response_message_audio->id) == NULL) {
    goto fail; //String
    }


    // chat_completion_response_message_audio->expires_at
    if (!chat_completion_response_message_audio->expires_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "expires_at", *chat_completion_response_message_audio->expires_at) == NULL) {
    goto fail; //Numeric
    }


    // chat_completion_response_message_audio->data
    if (!chat_completion_response_message_audio->data) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "data", chat_completion_response_message_audio->data) == NULL) {
    goto fail; //String
    }


    // chat_completion_response_message_audio->transcript
    if (!chat_completion_response_message_audio->transcript) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "transcript", chat_completion_response_message_audio->transcript) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_response_message_audio_t *chat_completion_response_message_audio_parseFromJSON(cJSON *chat_completion_response_message_audioJSON){

    chat_completion_response_message_audio_t *chat_completion_response_message_audio_local_var = NULL;

    char *id_local_str = NULL;

    // define the local variable for chat_completion_response_message_audio->expires_at
    int *expires_at_local_var = NULL;

    char *data_local_str = NULL;

    char *transcript_local_str = NULL;

    // chat_completion_response_message_audio->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(chat_completion_response_message_audioJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // chat_completion_response_message_audio->expires_at
    cJSON *expires_at = cJSON_GetObjectItemCaseSensitive(chat_completion_response_message_audioJSON, "expires_at");
    if (cJSON_IsNull(expires_at)) {
        expires_at = NULL;
    }
    if (!expires_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(expires_at))
    {
    goto end; //Numeric
    }
    expires_at_local_var = malloc(sizeof(int));
    if(!expires_at_local_var)
    {
        goto end;
    }
    *expires_at_local_var = expires_at->valuedouble;

    // chat_completion_response_message_audio->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(chat_completion_response_message_audioJSON, "data");
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

    // chat_completion_response_message_audio->transcript
    cJSON *transcript = cJSON_GetObjectItemCaseSensitive(chat_completion_response_message_audioJSON, "transcript");
    if (cJSON_IsNull(transcript)) {
        transcript = NULL;
    }
    if (!transcript) {
        goto end;
    }

    
    if(!cJSON_IsString(transcript))
    {
    goto end; //String
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (data && !cJSON_IsNull(data)) data_local_str = strdup(data->valuestring);
    if (transcript && !cJSON_IsNull(transcript)) transcript_local_str = strdup(transcript->valuestring);

    chat_completion_response_message_audio_local_var = chat_completion_response_message_audio_create_internal (
        id_local_str,
        expires_at_local_var,
        data_local_str,
        transcript_local_str
        );

    if (!chat_completion_response_message_audio_local_var) {
        goto end;
    }

    return chat_completion_response_message_audio_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (expires_at_local_var) {
        free(expires_at_local_var);
        expires_at_local_var = NULL;
    }
    if (data_local_str) {
        free(data_local_str);
        data_local_str = NULL;
    }
    if (transcript_local_str) {
        free(transcript_local_str);
        transcript_local_str = NULL;
    }
    return NULL;

}
