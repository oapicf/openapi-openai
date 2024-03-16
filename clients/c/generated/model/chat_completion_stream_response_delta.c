#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_stream_response_delta.h"


char* chat_completion_stream_response_delta_role_ToString(openai_api_chat_completion_stream_response_delta_ROLE_e role) {
    char* roleArray[] =  { "NULL", "system", "user", "assistant", "function" };
    return roleArray[role];
}

openai_api_chat_completion_stream_response_delta_ROLE_e chat_completion_stream_response_delta_role_FromString(char* role){
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

chat_completion_stream_response_delta_t *chat_completion_stream_response_delta_create(
    openai_api_chat_completion_stream_response_delta_ROLE_e role,
    char *content,
    chat_completion_request_message_function_call_t *function_call
    ) {
    chat_completion_stream_response_delta_t *chat_completion_stream_response_delta_local_var = malloc(sizeof(chat_completion_stream_response_delta_t));
    if (!chat_completion_stream_response_delta_local_var) {
        return NULL;
    }
    chat_completion_stream_response_delta_local_var->role = role;
    chat_completion_stream_response_delta_local_var->content = content;
    chat_completion_stream_response_delta_local_var->function_call = function_call;

    return chat_completion_stream_response_delta_local_var;
}


void chat_completion_stream_response_delta_free(chat_completion_stream_response_delta_t *chat_completion_stream_response_delta) {
    if(NULL == chat_completion_stream_response_delta){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_stream_response_delta->content) {
        free(chat_completion_stream_response_delta->content);
        chat_completion_stream_response_delta->content = NULL;
    }
    if (chat_completion_stream_response_delta->function_call) {
        chat_completion_request_message_function_call_free(chat_completion_stream_response_delta->function_call);
        chat_completion_stream_response_delta->function_call = NULL;
    }
    free(chat_completion_stream_response_delta);
}

cJSON *chat_completion_stream_response_delta_convertToJSON(chat_completion_stream_response_delta_t *chat_completion_stream_response_delta) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_stream_response_delta->role
    if(chat_completion_stream_response_delta->role != openai_api_chat_completion_stream_response_delta_ROLE_NULL) {
    if(cJSON_AddStringToObject(item, "role", rolechat_completion_stream_response_delta_ToString(chat_completion_stream_response_delta->role)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // chat_completion_stream_response_delta->content
    if(chat_completion_stream_response_delta->content) {
    if(cJSON_AddStringToObject(item, "content", chat_completion_stream_response_delta->content) == NULL) {
    goto fail; //String
    }
    }


    // chat_completion_stream_response_delta->function_call
    if(chat_completion_stream_response_delta->function_call) {
    cJSON *function_call_local_JSON = chat_completion_request_message_function_call_convertToJSON(chat_completion_stream_response_delta->function_call);
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

chat_completion_stream_response_delta_t *chat_completion_stream_response_delta_parseFromJSON(cJSON *chat_completion_stream_response_deltaJSON){

    chat_completion_stream_response_delta_t *chat_completion_stream_response_delta_local_var = NULL;

    // define the local variable for chat_completion_stream_response_delta->function_call
    chat_completion_request_message_function_call_t *function_call_local_nonprim = NULL;

    // chat_completion_stream_response_delta->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(chat_completion_stream_response_deltaJSON, "role");
    openai_api_chat_completion_stream_response_delta_ROLE_e roleVariable;
    if (role) { 
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = chat_completion_stream_response_delta_role_FromString(role->valuestring);
    }

    // chat_completion_stream_response_delta->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(chat_completion_stream_response_deltaJSON, "content");
    if (content) { 
    if(!cJSON_IsString(content) && !cJSON_IsNull(content))
    {
    goto end; //String
    }
    }

    // chat_completion_stream_response_delta->function_call
    cJSON *function_call = cJSON_GetObjectItemCaseSensitive(chat_completion_stream_response_deltaJSON, "function_call");
    if (function_call) { 
    function_call_local_nonprim = chat_completion_request_message_function_call_parseFromJSON(function_call); //nonprimitive
    }


    chat_completion_stream_response_delta_local_var = chat_completion_stream_response_delta_create (
        role ? roleVariable : openai_api_chat_completion_stream_response_delta_ROLE_NULL,
        content && !cJSON_IsNull(content) ? strdup(content->valuestring) : NULL,
        function_call ? function_call_local_nonprim : NULL
        );

    return chat_completion_stream_response_delta_local_var;
end:
    if (function_call_local_nonprim) {
        chat_completion_request_message_function_call_free(function_call_local_nonprim);
        function_call_local_nonprim = NULL;
    }
    return NULL;

}
