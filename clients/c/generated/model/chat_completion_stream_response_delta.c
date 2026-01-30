#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_stream_response_delta.h"


char* chat_completion_stream_response_delta_role_ToString(openai_api_chat_completion_stream_response_delta_ROLE_e role) {
    char* roleArray[] =  { "NULL", "system", "user", "assistant", "tool" };
    return roleArray[role];
}

openai_api_chat_completion_stream_response_delta_ROLE_e chat_completion_stream_response_delta_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "system", "user", "assistant", "tool" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static chat_completion_stream_response_delta_t *chat_completion_stream_response_delta_create_internal(
    char *content,
    chat_completion_stream_response_delta_function_call_t *function_call,
    list_t *tool_calls,
    openai_api_chat_completion_stream_response_delta_ROLE_e role,
    char *refusal
    ) {
    chat_completion_stream_response_delta_t *chat_completion_stream_response_delta_local_var = malloc(sizeof(chat_completion_stream_response_delta_t));
    if (!chat_completion_stream_response_delta_local_var) {
        return NULL;
    }
    chat_completion_stream_response_delta_local_var->content = content;
    chat_completion_stream_response_delta_local_var->function_call = function_call;
    chat_completion_stream_response_delta_local_var->tool_calls = tool_calls;
    chat_completion_stream_response_delta_local_var->role = role;
    chat_completion_stream_response_delta_local_var->refusal = refusal;

    chat_completion_stream_response_delta_local_var->_library_owned = 1;
    return chat_completion_stream_response_delta_local_var;
}

__attribute__((deprecated)) chat_completion_stream_response_delta_t *chat_completion_stream_response_delta_create(
    char *content,
    chat_completion_stream_response_delta_function_call_t *function_call,
    list_t *tool_calls,
    openai_api_chat_completion_stream_response_delta_ROLE_e role,
    char *refusal
    ) {
    return chat_completion_stream_response_delta_create_internal (
        content,
        function_call,
        tool_calls,
        role,
        refusal
        );
}

void chat_completion_stream_response_delta_free(chat_completion_stream_response_delta_t *chat_completion_stream_response_delta) {
    if(NULL == chat_completion_stream_response_delta){
        return ;
    }
    if(chat_completion_stream_response_delta->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_stream_response_delta_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_stream_response_delta->content) {
        free(chat_completion_stream_response_delta->content);
        chat_completion_stream_response_delta->content = NULL;
    }
    if (chat_completion_stream_response_delta->function_call) {
        chat_completion_stream_response_delta_function_call_free(chat_completion_stream_response_delta->function_call);
        chat_completion_stream_response_delta->function_call = NULL;
    }
    if (chat_completion_stream_response_delta->tool_calls) {
        list_ForEach(listEntry, chat_completion_stream_response_delta->tool_calls) {
            chat_completion_message_tool_call_chunk_free(listEntry->data);
        }
        list_freeList(chat_completion_stream_response_delta->tool_calls);
        chat_completion_stream_response_delta->tool_calls = NULL;
    }
    if (chat_completion_stream_response_delta->refusal) {
        free(chat_completion_stream_response_delta->refusal);
        chat_completion_stream_response_delta->refusal = NULL;
    }
    free(chat_completion_stream_response_delta);
}

cJSON *chat_completion_stream_response_delta_convertToJSON(chat_completion_stream_response_delta_t *chat_completion_stream_response_delta) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_stream_response_delta->content
    if(chat_completion_stream_response_delta->content) {
    if(cJSON_AddStringToObject(item, "content", chat_completion_stream_response_delta->content) == NULL) {
    goto fail; //String
    }
    }


    // chat_completion_stream_response_delta->function_call
    if(chat_completion_stream_response_delta->function_call) {
    cJSON *function_call_local_JSON = chat_completion_stream_response_delta_function_call_convertToJSON(chat_completion_stream_response_delta->function_call);
    if(function_call_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "function_call", function_call_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // chat_completion_stream_response_delta->tool_calls
    if(chat_completion_stream_response_delta->tool_calls) {
    cJSON *tool_calls = cJSON_AddArrayToObject(item, "tool_calls");
    if(tool_calls == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *tool_callsListEntry;
    if (chat_completion_stream_response_delta->tool_calls) {
    list_ForEach(tool_callsListEntry, chat_completion_stream_response_delta->tool_calls) {
    cJSON *itemLocal = chat_completion_message_tool_call_chunk_convertToJSON(tool_callsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tool_calls, itemLocal);
    }
    }
    }


    // chat_completion_stream_response_delta->role
    if(chat_completion_stream_response_delta->role != openai_api_chat_completion_stream_response_delta_ROLE_NULL) {
    if(cJSON_AddStringToObject(item, "role", chat_completion_stream_response_delta_role_ToString(chat_completion_stream_response_delta->role)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // chat_completion_stream_response_delta->refusal
    if(chat_completion_stream_response_delta->refusal) {
    if(cJSON_AddStringToObject(item, "refusal", chat_completion_stream_response_delta->refusal) == NULL) {
    goto fail; //String
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
    chat_completion_stream_response_delta_function_call_t *function_call_local_nonprim = NULL;

    // define the local list for chat_completion_stream_response_delta->tool_calls
    list_t *tool_callsList = NULL;

    // chat_completion_stream_response_delta->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(chat_completion_stream_response_deltaJSON, "content");
    if (cJSON_IsNull(content)) {
        content = NULL;
    }
    if (content) { 
    if(!cJSON_IsString(content) && !cJSON_IsNull(content))
    {
    goto end; //String
    }
    }

    // chat_completion_stream_response_delta->function_call
    cJSON *function_call = cJSON_GetObjectItemCaseSensitive(chat_completion_stream_response_deltaJSON, "function_call");
    if (cJSON_IsNull(function_call)) {
        function_call = NULL;
    }
    if (function_call) { 
    function_call_local_nonprim = chat_completion_stream_response_delta_function_call_parseFromJSON(function_call); //nonprimitive
    }

    // chat_completion_stream_response_delta->tool_calls
    cJSON *tool_calls = cJSON_GetObjectItemCaseSensitive(chat_completion_stream_response_deltaJSON, "tool_calls");
    if (cJSON_IsNull(tool_calls)) {
        tool_calls = NULL;
    }
    if (tool_calls) { 
    cJSON *tool_calls_local_nonprimitive = NULL;
    if(!cJSON_IsArray(tool_calls)){
        goto end; //nonprimitive container
    }

    tool_callsList = list_createList();

    cJSON_ArrayForEach(tool_calls_local_nonprimitive,tool_calls )
    {
        if(!cJSON_IsObject(tool_calls_local_nonprimitive)){
            goto end;
        }
        chat_completion_message_tool_call_chunk_t *tool_callsItem = chat_completion_message_tool_call_chunk_parseFromJSON(tool_calls_local_nonprimitive);

        list_addElement(tool_callsList, tool_callsItem);
    }
    }

    // chat_completion_stream_response_delta->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(chat_completion_stream_response_deltaJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    openai_api_chat_completion_stream_response_delta_ROLE_e roleVariable;
    if (role) { 
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = chat_completion_stream_response_delta_role_FromString(role->valuestring);
    }

    // chat_completion_stream_response_delta->refusal
    cJSON *refusal = cJSON_GetObjectItemCaseSensitive(chat_completion_stream_response_deltaJSON, "refusal");
    if (cJSON_IsNull(refusal)) {
        refusal = NULL;
    }
    if (refusal) { 
    if(!cJSON_IsString(refusal) && !cJSON_IsNull(refusal))
    {
    goto end; //String
    }
    }


    chat_completion_stream_response_delta_local_var = chat_completion_stream_response_delta_create_internal (
        content && !cJSON_IsNull(content) ? strdup(content->valuestring) : NULL,
        function_call ? function_call_local_nonprim : NULL,
        tool_calls ? tool_callsList : NULL,
        role ? roleVariable : openai_api_chat_completion_stream_response_delta_ROLE_NULL,
        refusal && !cJSON_IsNull(refusal) ? strdup(refusal->valuestring) : NULL
        );

    return chat_completion_stream_response_delta_local_var;
end:
    if (function_call_local_nonprim) {
        chat_completion_stream_response_delta_function_call_free(function_call_local_nonprim);
        function_call_local_nonprim = NULL;
    }
    if (tool_callsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tool_callsList) {
            chat_completion_message_tool_call_chunk_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tool_callsList);
        tool_callsList = NULL;
    }
    return NULL;

}
