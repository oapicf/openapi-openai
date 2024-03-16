#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_message.h"


char* chat_completion_request_message_role_ToString(openai_api_chat_completion_request_message_ROLE_e role) {
    char* roleArray[] =  { "NULL", "system", "user", "assistant", "function" };
    return roleArray[role];
}

openai_api_chat_completion_request_message_ROLE_e chat_completion_request_message_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "system", "user", "assistant", "function" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

chat_completion_request_message_t *chat_completion_request_message_create(
    openai_api_chat_completion_request_message_ROLE_e role,
    char *content,
    char *name,
    chat_completion_request_message_function_call_t *function_call
    ) {
    chat_completion_request_message_t *chat_completion_request_message_local_var = malloc(sizeof(chat_completion_request_message_t));
    if (!chat_completion_request_message_local_var) {
        return NULL;
    }
    chat_completion_request_message_local_var->role = role;
    chat_completion_request_message_local_var->content = content;
    chat_completion_request_message_local_var->name = name;
    chat_completion_request_message_local_var->function_call = function_call;

    return chat_completion_request_message_local_var;
}


void chat_completion_request_message_free(chat_completion_request_message_t *chat_completion_request_message) {
    if(NULL == chat_completion_request_message){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_message->content) {
        free(chat_completion_request_message->content);
        chat_completion_request_message->content = NULL;
    }
    if (chat_completion_request_message->name) {
        free(chat_completion_request_message->name);
        chat_completion_request_message->name = NULL;
    }
    if (chat_completion_request_message->function_call) {
        chat_completion_request_message_function_call_free(chat_completion_request_message->function_call);
        chat_completion_request_message->function_call = NULL;
    }
    free(chat_completion_request_message);
}

cJSON *chat_completion_request_message_convertToJSON(chat_completion_request_message_t *chat_completion_request_message) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_message->role
    if (openai_api_chat_completion_request_message_ROLE_NULL == chat_completion_request_message->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", rolechat_completion_request_message_ToString(chat_completion_request_message->role)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_request_message->content
    if(chat_completion_request_message->content) {
    if(cJSON_AddStringToObject(item, "content", chat_completion_request_message->content) == NULL) {
    goto fail; //String
    }
    }


    // chat_completion_request_message->name
    if(chat_completion_request_message->name) {
    if(cJSON_AddStringToObject(item, "name", chat_completion_request_message->name) == NULL) {
    goto fail; //String
    }
    }


    // chat_completion_request_message->function_call
    if(chat_completion_request_message->function_call) {
    cJSON *function_call_local_JSON = chat_completion_request_message_function_call_convertToJSON(chat_completion_request_message->function_call);
    if(function_call_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "function_call", function_call_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_request_message_t *chat_completion_request_message_parseFromJSON(cJSON *chat_completion_request_messageJSON){

    chat_completion_request_message_t *chat_completion_request_message_local_var = NULL;

    // define the local variable for chat_completion_request_message->function_call
    chat_completion_request_message_function_call_t *function_call_local_nonprim = NULL;

    // chat_completion_request_message->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(chat_completion_request_messageJSON, "role");
    if (!role) {
        goto end;
    }

    openai_api_chat_completion_request_message_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = chat_completion_request_message_role_FromString(role->valuestring);

    // chat_completion_request_message->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(chat_completion_request_messageJSON, "content");
    if (content) { 
    if(!cJSON_IsString(content) && !cJSON_IsNull(content))
    {
    goto end; //String
    }
    }

    // chat_completion_request_message->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(chat_completion_request_messageJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // chat_completion_request_message->function_call
    cJSON *function_call = cJSON_GetObjectItemCaseSensitive(chat_completion_request_messageJSON, "function_call");
    if (function_call) { 
    function_call_local_nonprim = chat_completion_request_message_function_call_parseFromJSON(function_call); //nonprimitive
    }


    chat_completion_request_message_local_var = chat_completion_request_message_create (
        roleVariable,
        content && !cJSON_IsNull(content) ? strdup(content->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        function_call ? function_call_local_nonprim : NULL
        );

    return chat_completion_request_message_local_var;
end:
    if (function_call_local_nonprim) {
        chat_completion_request_message_function_call_free(function_call_local_nonprim);
        function_call_local_nonprim = NULL;
    }
    return NULL;

}
