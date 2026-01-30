#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_tool_message_content.h"



static chat_completion_request_tool_message_content_t *chat_completion_request_tool_message_content_create_internal(
    ) {
    chat_completion_request_tool_message_content_t *chat_completion_request_tool_message_content_local_var = malloc(sizeof(chat_completion_request_tool_message_content_t));
    if (!chat_completion_request_tool_message_content_local_var) {
        return NULL;
    }

    chat_completion_request_tool_message_content_local_var->_library_owned = 1;
    return chat_completion_request_tool_message_content_local_var;
}

__attribute__((deprecated)) chat_completion_request_tool_message_content_t *chat_completion_request_tool_message_content_create(
    ) {
    return chat_completion_request_tool_message_content_create_internal (
        );
}

void chat_completion_request_tool_message_content_free(chat_completion_request_tool_message_content_t *chat_completion_request_tool_message_content) {
    if(NULL == chat_completion_request_tool_message_content){
        return ;
    }
    if(chat_completion_request_tool_message_content->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_request_tool_message_content_free");
        return ;
    }
    listEntry_t *listEntry;
    free(chat_completion_request_tool_message_content);
}

cJSON *chat_completion_request_tool_message_content_convertToJSON(chat_completion_request_tool_message_content_t *chat_completion_request_tool_message_content) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_request_tool_message_content_t *chat_completion_request_tool_message_content_parseFromJSON(cJSON *chat_completion_request_tool_message_contentJSON){

    chat_completion_request_tool_message_content_t *chat_completion_request_tool_message_content_local_var = NULL;


    chat_completion_request_tool_message_content_local_var = chat_completion_request_tool_message_content_create_internal (
        );

    return chat_completion_request_tool_message_content_local_var;
end:
    return NULL;

}
