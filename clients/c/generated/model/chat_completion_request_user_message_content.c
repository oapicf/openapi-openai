#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_user_message_content.h"



chat_completion_request_user_message_content_t *chat_completion_request_user_message_content_create(
    ) {
    chat_completion_request_user_message_content_t *chat_completion_request_user_message_content_local_var = malloc(sizeof(chat_completion_request_user_message_content_t));
    if (!chat_completion_request_user_message_content_local_var) {
        return NULL;
    }

    return chat_completion_request_user_message_content_local_var;
}


void chat_completion_request_user_message_content_free(chat_completion_request_user_message_content_t *chat_completion_request_user_message_content) {
    if(NULL == chat_completion_request_user_message_content){
        return ;
    }
    listEntry_t *listEntry;
    free(chat_completion_request_user_message_content);
}

cJSON *chat_completion_request_user_message_content_convertToJSON(chat_completion_request_user_message_content_t *chat_completion_request_user_message_content) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_request_user_message_content_t *chat_completion_request_user_message_content_parseFromJSON(cJSON *chat_completion_request_user_message_contentJSON){

    chat_completion_request_user_message_content_t *chat_completion_request_user_message_content_local_var = NULL;


    chat_completion_request_user_message_content_local_var = chat_completion_request_user_message_content_create (
        );

    return chat_completion_request_user_message_content_local_var;
end:
    return NULL;

}
