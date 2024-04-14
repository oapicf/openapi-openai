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

chat_completion_request_tool_message_t *chat_completion_request_tool_message_create(
    openai_api_chat_completion_request_tool_message_ROLE_e role,
    char *content,
    char *tool_call_id
    ) {
    chat_completion_request_tool_message_t *chat_completion_request_tool_message_local_var = malloc(sizeof(chat_completion_request_tool_message_t));
    if (!chat_completion_request_tool_message_local_var) {
        return NULL;
    }
    chat_completion_request_tool_message_local_var->role = role;
    chat_completion_request_tool_message_local_var->content = content;
    chat_completion_request_tool_message_local_var->tool_call_id = tool_call_id;

    return chat_completion_request_tool_message_local_var;
}


void chat_completion_request_tool_message_free(chat_completion_request_tool_message_t *chat_completion_request_tool_message) {
    if(NULL == chat_completion_request_tool_message){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_tool_message->content) {
        free(chat_completion_request_tool_message->content);
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
    if(cJSON_AddStringToObject(item, "role", rolechat_completion_request_tool_message_ToString(chat_completion_request_tool_message->role)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_request_tool_message->content
    if (!chat_completion_request_tool_message->content) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "content", chat_completion_request_tool_message->content) == NULL) {
    goto fail; //String
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

    // chat_completion_request_tool_message->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(chat_completion_request_tool_messageJSON, "role");
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
    if (!content) {
        goto end;
    }

    
    if(!cJSON_IsString(content))
    {
    goto end; //String
    }

    // chat_completion_request_tool_message->tool_call_id
    cJSON *tool_call_id = cJSON_GetObjectItemCaseSensitive(chat_completion_request_tool_messageJSON, "tool_call_id");
    if (!tool_call_id) {
        goto end;
    }

    
    if(!cJSON_IsString(tool_call_id))
    {
    goto end; //String
    }


    chat_completion_request_tool_message_local_var = chat_completion_request_tool_message_create (
        roleVariable,
        strdup(content->valuestring),
        strdup(tool_call_id->valuestring)
        );

    return chat_completion_request_tool_message_local_var;
end:
    return NULL;

}
