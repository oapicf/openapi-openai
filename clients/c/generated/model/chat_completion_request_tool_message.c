#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_tool_message.h"


char* chat_completion_request_tool_message_role_ToString(openai_api_chat_completion_request_tool_message_ROLE_e role) {
    char* roleArray[] =  { "NULL", "tool" };
    return roleArray[role];
}

openai_api_chat_completion_request_tool_message_ROLE_e chat_completion_request_tool_message_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "tool" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static chat_completion_request_tool_message_t *chat_completion_request_tool_message_create_internal(
    openai_api_chat_completion_request_tool_message_ROLE_e role,
    chat_completion_request_tool_message_content_t *content,
    char *tool_call_id
    ) {
    chat_completion_request_tool_message_t *chat_completion_request_tool_message_local_var = malloc(sizeof(chat_completion_request_tool_message_t));
    if (!chat_completion_request_tool_message_local_var) {
        return NULL;
    }
    chat_completion_request_tool_message_local_var->role = role;
    chat_completion_request_tool_message_local_var->content = content;
    chat_completion_request_tool_message_local_var->tool_call_id = tool_call_id;

    chat_completion_request_tool_message_local_var->_library_owned = 1;
    return chat_completion_request_tool_message_local_var;
}

__attribute__((deprecated)) chat_completion_request_tool_message_t *chat_completion_request_tool_message_create(
    openai_api_chat_completion_request_tool_message_ROLE_e role,
    chat_completion_request_tool_message_content_t *content,
    char *tool_call_id
    ) {
    return chat_completion_request_tool_message_create_internal (
        role,
        content,
        tool_call_id
        );
}

void chat_completion_request_tool_message_free(chat_completion_request_tool_message_t *chat_completion_request_tool_message) {
    if(NULL == chat_completion_request_tool_message){
        return ;
    }
    if(chat_completion_request_tool_message->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_request_tool_message_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_tool_message->content) {
        chat_completion_request_tool_message_content_free(chat_completion_request_tool_message->content);
        chat_completion_request_tool_message->content = NULL;
    }
    if (chat_completion_request_tool_message->tool_call_id) {
        free(chat_completion_request_tool_message->tool_call_id);
        chat_completion_request_tool_message->tool_call_id = NULL;
    }
    free(chat_completion_request_tool_message);
}

cJSON *chat_completion_request_tool_message_convertToJSON(chat_completion_request_tool_message_t *chat_completion_request_tool_message) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_tool_message->role
    if (openai_api_chat_completion_request_tool_message_ROLE_NULL == chat_completion_request_tool_message->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", chat_completion_request_tool_message_role_ToString(chat_completion_request_tool_message->role)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_request_tool_message->content
    if (!chat_completion_request_tool_message->content) {
        goto fail;
    }
    cJSON *content_local_JSON = chat_completion_request_tool_message_content_convertToJSON(chat_completion_request_tool_message->content);
    if(content_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "content", content_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // chat_completion_request_tool_message->tool_call_id
    if (!chat_completion_request_tool_message->tool_call_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "tool_call_id", chat_completion_request_tool_message->tool_call_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_request_tool_message_t *chat_completion_request_tool_message_parseFromJSON(cJSON *chat_completion_request_tool_messageJSON){

    chat_completion_request_tool_message_t *chat_completion_request_tool_message_local_var = NULL;

    // define the local variable for chat_completion_request_tool_message->content
    chat_completion_request_tool_message_content_t *content_local_nonprim = NULL;

    // chat_completion_request_tool_message->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(chat_completion_request_tool_messageJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_chat_completion_request_tool_message_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = chat_completion_request_tool_message_role_FromString(role->valuestring);

    // chat_completion_request_tool_message->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(chat_completion_request_tool_messageJSON, "content");
    if (cJSON_IsNull(content)) {
        content = NULL;
    }
    if (!content) {
        goto end;
    }

    
    content_local_nonprim = chat_completion_request_tool_message_content_parseFromJSON(content); //nonprimitive

    // chat_completion_request_tool_message->tool_call_id
    cJSON *tool_call_id = cJSON_GetObjectItemCaseSensitive(chat_completion_request_tool_messageJSON, "tool_call_id");
    if (cJSON_IsNull(tool_call_id)) {
        tool_call_id = NULL;
    }
    if (!tool_call_id) {
        goto end;
    }

    
    if(!cJSON_IsString(tool_call_id))
    {
    goto end; //String
    }


    chat_completion_request_tool_message_local_var = chat_completion_request_tool_message_create_internal (
        roleVariable,
        content_local_nonprim,
        strdup(tool_call_id->valuestring)
        );

    return chat_completion_request_tool_message_local_var;
end:
    if (content_local_nonprim) {
        chat_completion_request_tool_message_content_free(content_local_nonprim);
        content_local_nonprim = NULL;
    }
    return NULL;

}
