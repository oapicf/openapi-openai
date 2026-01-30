#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_request_assistant_message.h"


char* chat_completion_request_assistant_message_role_ToString(openai_api_chat_completion_request_assistant_message_ROLE_e role) {
    char* roleArray[] =  { "NULL", "assistant" };
    return roleArray[role];
}

openai_api_chat_completion_request_assistant_message_ROLE_e chat_completion_request_assistant_message_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "assistant" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static chat_completion_request_assistant_message_t *chat_completion_request_assistant_message_create_internal(
    chat_completion_request_assistant_message_content_t *content,
    char *refusal,
    openai_api_chat_completion_request_assistant_message_ROLE_e role,
    char *name,
    chat_completion_request_assistant_message_audio_t *audio,
    list_t *tool_calls,
    chat_completion_request_assistant_message_function_call_t *function_call
    ) {
    chat_completion_request_assistant_message_t *chat_completion_request_assistant_message_local_var = malloc(sizeof(chat_completion_request_assistant_message_t));
    if (!chat_completion_request_assistant_message_local_var) {
        return NULL;
    }
    chat_completion_request_assistant_message_local_var->content = content;
    chat_completion_request_assistant_message_local_var->refusal = refusal;
    chat_completion_request_assistant_message_local_var->role = role;
    chat_completion_request_assistant_message_local_var->name = name;
    chat_completion_request_assistant_message_local_var->audio = audio;
    chat_completion_request_assistant_message_local_var->tool_calls = tool_calls;
    chat_completion_request_assistant_message_local_var->function_call = function_call;

    chat_completion_request_assistant_message_local_var->_library_owned = 1;
    return chat_completion_request_assistant_message_local_var;
}

__attribute__((deprecated)) chat_completion_request_assistant_message_t *chat_completion_request_assistant_message_create(
    chat_completion_request_assistant_message_content_t *content,
    char *refusal,
    openai_api_chat_completion_request_assistant_message_ROLE_e role,
    char *name,
    chat_completion_request_assistant_message_audio_t *audio,
    list_t *tool_calls,
    chat_completion_request_assistant_message_function_call_t *function_call
    ) {
    return chat_completion_request_assistant_message_create_internal (
        content,
        refusal,
        role,
        name,
        audio,
        tool_calls,
        function_call
        );
}

void chat_completion_request_assistant_message_free(chat_completion_request_assistant_message_t *chat_completion_request_assistant_message) {
    if(NULL == chat_completion_request_assistant_message){
        return ;
    }
    if(chat_completion_request_assistant_message->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_request_assistant_message_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_request_assistant_message->content) {
        chat_completion_request_assistant_message_content_free(chat_completion_request_assistant_message->content);
        chat_completion_request_assistant_message->content = NULL;
    }
    if (chat_completion_request_assistant_message->refusal) {
        free(chat_completion_request_assistant_message->refusal);
        chat_completion_request_assistant_message->refusal = NULL;
    }
    if (chat_completion_request_assistant_message->name) {
        free(chat_completion_request_assistant_message->name);
        chat_completion_request_assistant_message->name = NULL;
    }
    if (chat_completion_request_assistant_message->audio) {
        chat_completion_request_assistant_message_audio_free(chat_completion_request_assistant_message->audio);
        chat_completion_request_assistant_message->audio = NULL;
    }
    if (chat_completion_request_assistant_message->tool_calls) {
        list_ForEach(listEntry, chat_completion_request_assistant_message->tool_calls) {
            chat_completion_message_tool_call_free(listEntry->data);
        }
        list_freeList(chat_completion_request_assistant_message->tool_calls);
        chat_completion_request_assistant_message->tool_calls = NULL;
    }
    if (chat_completion_request_assistant_message->function_call) {
        chat_completion_request_assistant_message_function_call_free(chat_completion_request_assistant_message->function_call);
        chat_completion_request_assistant_message->function_call = NULL;
    }
    free(chat_completion_request_assistant_message);
}

cJSON *chat_completion_request_assistant_message_convertToJSON(chat_completion_request_assistant_message_t *chat_completion_request_assistant_message) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_request_assistant_message->content
    if(chat_completion_request_assistant_message->content) {
    cJSON *content_local_JSON = chat_completion_request_assistant_message_content_convertToJSON(chat_completion_request_assistant_message->content);
    if(content_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "content", content_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // chat_completion_request_assistant_message->refusal
    if(chat_completion_request_assistant_message->refusal) {
    if(cJSON_AddStringToObject(item, "refusal", chat_completion_request_assistant_message->refusal) == NULL) {
    goto fail; //String
    }
    }


    // chat_completion_request_assistant_message->role
    if (openai_api_chat_completion_request_assistant_message_ROLE_NULL == chat_completion_request_assistant_message->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", chat_completion_request_assistant_message_role_ToString(chat_completion_request_assistant_message->role)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_request_assistant_message->name
    if(chat_completion_request_assistant_message->name) {
    if(cJSON_AddStringToObject(item, "name", chat_completion_request_assistant_message->name) == NULL) {
    goto fail; //String
    }
    }


    // chat_completion_request_assistant_message->audio
    if(chat_completion_request_assistant_message->audio) {
    cJSON *audio_local_JSON = chat_completion_request_assistant_message_audio_convertToJSON(chat_completion_request_assistant_message->audio);
    if(audio_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "audio", audio_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // chat_completion_request_assistant_message->tool_calls
    if(chat_completion_request_assistant_message->tool_calls) {
    cJSON *tool_calls = cJSON_AddArrayToObject(item, "tool_calls");
    if(tool_calls == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *tool_callsListEntry;
    if (chat_completion_request_assistant_message->tool_calls) {
    list_ForEach(tool_callsListEntry, chat_completion_request_assistant_message->tool_calls) {
    cJSON *itemLocal = chat_completion_message_tool_call_convertToJSON(tool_callsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tool_calls, itemLocal);
    }
    }
    }


    // chat_completion_request_assistant_message->function_call
    if(chat_completion_request_assistant_message->function_call) {
    cJSON *function_call_local_JSON = chat_completion_request_assistant_message_function_call_convertToJSON(chat_completion_request_assistant_message->function_call);
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

chat_completion_request_assistant_message_t *chat_completion_request_assistant_message_parseFromJSON(cJSON *chat_completion_request_assistant_messageJSON){

    chat_completion_request_assistant_message_t *chat_completion_request_assistant_message_local_var = NULL;

    // define the local variable for chat_completion_request_assistant_message->content
    chat_completion_request_assistant_message_content_t *content_local_nonprim = NULL;

    // define the local variable for chat_completion_request_assistant_message->audio
    chat_completion_request_assistant_message_audio_t *audio_local_nonprim = NULL;

    // define the local list for chat_completion_request_assistant_message->tool_calls
    list_t *tool_callsList = NULL;

    // define the local variable for chat_completion_request_assistant_message->function_call
    chat_completion_request_assistant_message_function_call_t *function_call_local_nonprim = NULL;

    // chat_completion_request_assistant_message->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(chat_completion_request_assistant_messageJSON, "content");
    if (cJSON_IsNull(content)) {
        content = NULL;
    }
    if (content) { 
    content_local_nonprim = chat_completion_request_assistant_message_content_parseFromJSON(content); //nonprimitive
    }

    // chat_completion_request_assistant_message->refusal
    cJSON *refusal = cJSON_GetObjectItemCaseSensitive(chat_completion_request_assistant_messageJSON, "refusal");
    if (cJSON_IsNull(refusal)) {
        refusal = NULL;
    }
    if (refusal) { 
    if(!cJSON_IsString(refusal) && !cJSON_IsNull(refusal))
    {
    goto end; //String
    }
    }

    // chat_completion_request_assistant_message->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(chat_completion_request_assistant_messageJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_chat_completion_request_assistant_message_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = chat_completion_request_assistant_message_role_FromString(role->valuestring);

    // chat_completion_request_assistant_message->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(chat_completion_request_assistant_messageJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // chat_completion_request_assistant_message->audio
    cJSON *audio = cJSON_GetObjectItemCaseSensitive(chat_completion_request_assistant_messageJSON, "audio");
    if (cJSON_IsNull(audio)) {
        audio = NULL;
    }
    if (audio) { 
    audio_local_nonprim = chat_completion_request_assistant_message_audio_parseFromJSON(audio); //nonprimitive
    }

    // chat_completion_request_assistant_message->tool_calls
    cJSON *tool_calls = cJSON_GetObjectItemCaseSensitive(chat_completion_request_assistant_messageJSON, "tool_calls");
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
        chat_completion_message_tool_call_t *tool_callsItem = chat_completion_message_tool_call_parseFromJSON(tool_calls_local_nonprimitive);

        list_addElement(tool_callsList, tool_callsItem);
    }
    }

    // chat_completion_request_assistant_message->function_call
    cJSON *function_call = cJSON_GetObjectItemCaseSensitive(chat_completion_request_assistant_messageJSON, "function_call");
    if (cJSON_IsNull(function_call)) {
        function_call = NULL;
    }
    if (function_call) { 
    function_call_local_nonprim = chat_completion_request_assistant_message_function_call_parseFromJSON(function_call); //nonprimitive
    }


    chat_completion_request_assistant_message_local_var = chat_completion_request_assistant_message_create_internal (
        content ? content_local_nonprim : NULL,
        refusal && !cJSON_IsNull(refusal) ? strdup(refusal->valuestring) : NULL,
        roleVariable,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        audio ? audio_local_nonprim : NULL,
        tool_calls ? tool_callsList : NULL,
        function_call ? function_call_local_nonprim : NULL
        );

    return chat_completion_request_assistant_message_local_var;
end:
    if (content_local_nonprim) {
        chat_completion_request_assistant_message_content_free(content_local_nonprim);
        content_local_nonprim = NULL;
    }
    if (audio_local_nonprim) {
        chat_completion_request_assistant_message_audio_free(audio_local_nonprim);
        audio_local_nonprim = NULL;
    }
    if (tool_callsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tool_callsList) {
            chat_completion_message_tool_call_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tool_callsList);
        tool_callsList = NULL;
    }
    if (function_call_local_nonprim) {
        chat_completion_request_assistant_message_function_call_free(function_call_local_nonprim);
        function_call_local_nonprim = NULL;
    }
    return NULL;

}
