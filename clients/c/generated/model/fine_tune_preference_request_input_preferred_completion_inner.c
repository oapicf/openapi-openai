#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tune_preference_request_input_preferred_completion_inner.h"


char* fine_tune_preference_request_input_preferred_completion_inner_role_ToString(openai_api_fine_tune_preference_request_input_preferred_completion_inner_ROLE_e role) {
    char* roleArray[] =  { "NULL", "assistant" };
    return roleArray[role];
}

openai_api_fine_tune_preference_request_input_preferred_completion_inner_ROLE_e fine_tune_preference_request_input_preferred_completion_inner_role_FromString(char* role){
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

static fine_tune_preference_request_input_preferred_completion_inner_t *fine_tune_preference_request_input_preferred_completion_inner_create_internal(
    chat_completion_request_assistant_message_content_t *content,
    char *refusal,
    openai_api_fine_tune_preference_request_input_preferred_completion_inner_ROLE_e role,
    char *name,
    chat_completion_request_assistant_message_audio_t *audio,
    list_t *tool_calls,
    chat_completion_request_assistant_message_function_call_t *function_call
    ) {
    fine_tune_preference_request_input_preferred_completion_inner_t *fine_tune_preference_request_input_preferred_completion_inner_local_var = malloc(sizeof(fine_tune_preference_request_input_preferred_completion_inner_t));
    if (!fine_tune_preference_request_input_preferred_completion_inner_local_var) {
        return NULL;
    }
    fine_tune_preference_request_input_preferred_completion_inner_local_var->content = content;
    fine_tune_preference_request_input_preferred_completion_inner_local_var->refusal = refusal;
    fine_tune_preference_request_input_preferred_completion_inner_local_var->role = role;
    fine_tune_preference_request_input_preferred_completion_inner_local_var->name = name;
    fine_tune_preference_request_input_preferred_completion_inner_local_var->audio = audio;
    fine_tune_preference_request_input_preferred_completion_inner_local_var->tool_calls = tool_calls;
    fine_tune_preference_request_input_preferred_completion_inner_local_var->function_call = function_call;

    fine_tune_preference_request_input_preferred_completion_inner_local_var->_library_owned = 1;
    return fine_tune_preference_request_input_preferred_completion_inner_local_var;
}

__attribute__((deprecated)) fine_tune_preference_request_input_preferred_completion_inner_t *fine_tune_preference_request_input_preferred_completion_inner_create(
    chat_completion_request_assistant_message_content_t *content,
    char *refusal,
    openai_api_fine_tune_preference_request_input_preferred_completion_inner_ROLE_e role,
    char *name,
    chat_completion_request_assistant_message_audio_t *audio,
    list_t *tool_calls,
    chat_completion_request_assistant_message_function_call_t *function_call
    ) {
    return fine_tune_preference_request_input_preferred_completion_inner_create_internal (
        content,
        refusal,
        role,
        name,
        audio,
        tool_calls,
        function_call
        );
}

void fine_tune_preference_request_input_preferred_completion_inner_free(fine_tune_preference_request_input_preferred_completion_inner_t *fine_tune_preference_request_input_preferred_completion_inner) {
    if(NULL == fine_tune_preference_request_input_preferred_completion_inner){
        return ;
    }
    if(fine_tune_preference_request_input_preferred_completion_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tune_preference_request_input_preferred_completion_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tune_preference_request_input_preferred_completion_inner->content) {
        chat_completion_request_assistant_message_content_free(fine_tune_preference_request_input_preferred_completion_inner->content);
        fine_tune_preference_request_input_preferred_completion_inner->content = NULL;
    }
    if (fine_tune_preference_request_input_preferred_completion_inner->refusal) {
        free(fine_tune_preference_request_input_preferred_completion_inner->refusal);
        fine_tune_preference_request_input_preferred_completion_inner->refusal = NULL;
    }
    if (fine_tune_preference_request_input_preferred_completion_inner->name) {
        free(fine_tune_preference_request_input_preferred_completion_inner->name);
        fine_tune_preference_request_input_preferred_completion_inner->name = NULL;
    }
    if (fine_tune_preference_request_input_preferred_completion_inner->audio) {
        chat_completion_request_assistant_message_audio_free(fine_tune_preference_request_input_preferred_completion_inner->audio);
        fine_tune_preference_request_input_preferred_completion_inner->audio = NULL;
    }
    if (fine_tune_preference_request_input_preferred_completion_inner->tool_calls) {
        list_ForEach(listEntry, fine_tune_preference_request_input_preferred_completion_inner->tool_calls) {
            chat_completion_message_tool_call_free(listEntry->data);
        }
        list_freeList(fine_tune_preference_request_input_preferred_completion_inner->tool_calls);
        fine_tune_preference_request_input_preferred_completion_inner->tool_calls = NULL;
    }
    if (fine_tune_preference_request_input_preferred_completion_inner->function_call) {
        chat_completion_request_assistant_message_function_call_free(fine_tune_preference_request_input_preferred_completion_inner->function_call);
        fine_tune_preference_request_input_preferred_completion_inner->function_call = NULL;
    }
    free(fine_tune_preference_request_input_preferred_completion_inner);
}

cJSON *fine_tune_preference_request_input_preferred_completion_inner_convertToJSON(fine_tune_preference_request_input_preferred_completion_inner_t *fine_tune_preference_request_input_preferred_completion_inner) {
    cJSON *item = cJSON_CreateObject();

    // fine_tune_preference_request_input_preferred_completion_inner->content
    if(fine_tune_preference_request_input_preferred_completion_inner->content) {
    cJSON *content_local_JSON = chat_completion_request_assistant_message_content_convertToJSON(fine_tune_preference_request_input_preferred_completion_inner->content);
    if(content_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "content", content_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // fine_tune_preference_request_input_preferred_completion_inner->refusal
    if(fine_tune_preference_request_input_preferred_completion_inner->refusal) {
    if(cJSON_AddStringToObject(item, "refusal", fine_tune_preference_request_input_preferred_completion_inner->refusal) == NULL) {
    goto fail; //String
    }
    }


    // fine_tune_preference_request_input_preferred_completion_inner->role
    if (openai_api_fine_tune_preference_request_input_preferred_completion_inner_ROLE_NULL == fine_tune_preference_request_input_preferred_completion_inner->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", fine_tune_preference_request_input_preferred_completion_inner_role_ToString(fine_tune_preference_request_input_preferred_completion_inner->role)) == NULL)
    {
    goto fail; //Enum
    }


    // fine_tune_preference_request_input_preferred_completion_inner->name
    if(fine_tune_preference_request_input_preferred_completion_inner->name) {
    if(cJSON_AddStringToObject(item, "name", fine_tune_preference_request_input_preferred_completion_inner->name) == NULL) {
    goto fail; //String
    }
    }


    // fine_tune_preference_request_input_preferred_completion_inner->audio
    if(fine_tune_preference_request_input_preferred_completion_inner->audio) {
    cJSON *audio_local_JSON = chat_completion_request_assistant_message_audio_convertToJSON(fine_tune_preference_request_input_preferred_completion_inner->audio);
    if(audio_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "audio", audio_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // fine_tune_preference_request_input_preferred_completion_inner->tool_calls
    if(fine_tune_preference_request_input_preferred_completion_inner->tool_calls) {
    cJSON *tool_calls = cJSON_AddArrayToObject(item, "tool_calls");
    if(tool_calls == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *tool_callsListEntry;
    if (fine_tune_preference_request_input_preferred_completion_inner->tool_calls) {
    list_ForEach(tool_callsListEntry, fine_tune_preference_request_input_preferred_completion_inner->tool_calls) {
    cJSON *itemLocal = chat_completion_message_tool_call_convertToJSON(tool_callsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tool_calls, itemLocal);
    }
    }
    }


    // fine_tune_preference_request_input_preferred_completion_inner->function_call
    if(fine_tune_preference_request_input_preferred_completion_inner->function_call) {
    cJSON *function_call_local_JSON = chat_completion_request_assistant_message_function_call_convertToJSON(fine_tune_preference_request_input_preferred_completion_inner->function_call);
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

fine_tune_preference_request_input_preferred_completion_inner_t *fine_tune_preference_request_input_preferred_completion_inner_parseFromJSON(cJSON *fine_tune_preference_request_input_preferred_completion_innerJSON){

    fine_tune_preference_request_input_preferred_completion_inner_t *fine_tune_preference_request_input_preferred_completion_inner_local_var = NULL;

    // define the local variable for fine_tune_preference_request_input_preferred_completion_inner->content
    chat_completion_request_assistant_message_content_t *content_local_nonprim = NULL;

    // define the local variable for fine_tune_preference_request_input_preferred_completion_inner->audio
    chat_completion_request_assistant_message_audio_t *audio_local_nonprim = NULL;

    // define the local list for fine_tune_preference_request_input_preferred_completion_inner->tool_calls
    list_t *tool_callsList = NULL;

    // define the local variable for fine_tune_preference_request_input_preferred_completion_inner->function_call
    chat_completion_request_assistant_message_function_call_t *function_call_local_nonprim = NULL;

    // fine_tune_preference_request_input_preferred_completion_inner->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(fine_tune_preference_request_input_preferred_completion_innerJSON, "content");
    if (cJSON_IsNull(content)) {
        content = NULL;
    }
    if (content) { 
    content_local_nonprim = chat_completion_request_assistant_message_content_parseFromJSON(content); //nonprimitive
    }

    // fine_tune_preference_request_input_preferred_completion_inner->refusal
    cJSON *refusal = cJSON_GetObjectItemCaseSensitive(fine_tune_preference_request_input_preferred_completion_innerJSON, "refusal");
    if (cJSON_IsNull(refusal)) {
        refusal = NULL;
    }
    if (refusal) { 
    if(!cJSON_IsString(refusal) && !cJSON_IsNull(refusal))
    {
    goto end; //String
    }
    }

    // fine_tune_preference_request_input_preferred_completion_inner->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(fine_tune_preference_request_input_preferred_completion_innerJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_fine_tune_preference_request_input_preferred_completion_inner_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = fine_tune_preference_request_input_preferred_completion_inner_role_FromString(role->valuestring);

    // fine_tune_preference_request_input_preferred_completion_inner->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(fine_tune_preference_request_input_preferred_completion_innerJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // fine_tune_preference_request_input_preferred_completion_inner->audio
    cJSON *audio = cJSON_GetObjectItemCaseSensitive(fine_tune_preference_request_input_preferred_completion_innerJSON, "audio");
    if (cJSON_IsNull(audio)) {
        audio = NULL;
    }
    if (audio) { 
    audio_local_nonprim = chat_completion_request_assistant_message_audio_parseFromJSON(audio); //nonprimitive
    }

    // fine_tune_preference_request_input_preferred_completion_inner->tool_calls
    cJSON *tool_calls = cJSON_GetObjectItemCaseSensitive(fine_tune_preference_request_input_preferred_completion_innerJSON, "tool_calls");
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

    // fine_tune_preference_request_input_preferred_completion_inner->function_call
    cJSON *function_call = cJSON_GetObjectItemCaseSensitive(fine_tune_preference_request_input_preferred_completion_innerJSON, "function_call");
    if (cJSON_IsNull(function_call)) {
        function_call = NULL;
    }
    if (function_call) { 
    function_call_local_nonprim = chat_completion_request_assistant_message_function_call_parseFromJSON(function_call); //nonprimitive
    }


    fine_tune_preference_request_input_preferred_completion_inner_local_var = fine_tune_preference_request_input_preferred_completion_inner_create_internal (
        content ? content_local_nonprim : NULL,
        refusal && !cJSON_IsNull(refusal) ? strdup(refusal->valuestring) : NULL,
        roleVariable,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        audio ? audio_local_nonprim : NULL,
        tool_calls ? tool_callsList : NULL,
        function_call ? function_call_local_nonprim : NULL
        );

    return fine_tune_preference_request_input_preferred_completion_inner_local_var;
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
