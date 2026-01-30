#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_assistant_message_audio.h"



static chat_completion_request_assistant_message_audio_t *chat_completion_request_assistant_message_audio_create_internal(
    char *id
    ) {
    chat_completion_request_assistant_message_audio_t *chat_completion_request_assistant_message_audio_local_var = malloc(sizeof(chat_completion_request_assistant_message_audio_t));
    if (!chat_completion_request_assistant_message_audio_local_var) {
        return NULL;
    }
    chat_completion_request_assistant_message_audio_local_var->id = id;

    chat_completion_request_assistant_message_audio_local_var->_library_owned = 1;
    return chat_completion_request_assistant_message_audio_local_var;
}

__attribute__((deprecated)) chat_completion_request_assistant_message_audio_t *chat_completion_request_assistant_message_audio_create(
    char *id
    ) {
    return chat_completion_request_assistant_message_audio_create_internal (
        id
        );
}

void chat_completion_request_assistant_message_audio_free(chat_completion_request_assistant_message_audio_t *chat_completion_request_assistant_message_audio) {
    if(NULL == chat_completion_request_assistant_message_audio){
        return ;
    }
    if(chat_completion_request_assistant_message_audio->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_request_assistant_message_audio_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_assistant_message_audio->id) {
        free(chat_completion_request_assistant_message_audio->id);
        chat_completion_request_assistant_message_audio->id = NULL;
    }
    free(chat_completion_request_assistant_message_audio);
}

cJSON *chat_completion_request_assistant_message_audio_convertToJSON(chat_completion_request_assistant_message_audio_t *chat_completion_request_assistant_message_audio) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_assistant_message_audio->id
    if (!chat_completion_request_assistant_message_audio->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", chat_completion_request_assistant_message_audio->id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_request_assistant_message_audio_t *chat_completion_request_assistant_message_audio_parseFromJSON(cJSON *chat_completion_request_assistant_message_audioJSON){

    chat_completion_request_assistant_message_audio_t *chat_completion_request_assistant_message_audio_local_var = NULL;

    // chat_completion_request_assistant_message_audio->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(chat_completion_request_assistant_message_audioJSON, "id");
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


    chat_completion_request_assistant_message_audio_local_var = chat_completion_request_assistant_message_audio_create_internal (
        strdup(id->valuestring)
        );

    return chat_completion_request_assistant_message_audio_local_var;
end:
    return NULL;

}
