#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tune_chat_completion_request_assistant_message.h"


char* fine_tune_chat_completion_request_assistant_message_role_ToString(openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_e role) {
    char* roleArray[] =  { "NULL", "assistant" };
    return roleArray[role];
}

openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_e fine_tune_chat_completion_request_assistant_message_role_FromString(char* role){
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
char* fine_tune_chat_completion_request_assistant_message_weight_ToString(openai_api_fine_tune_chat_completion_request_assistant_message_WEIGHT_e weight) {
    char* weightArray[] =  { "NULL", "0", "1" };
    return weightArray[weight];
}

openai_api_fine_tune_chat_completion_request_assistant_message_WEIGHT_e fine_tune_chat_completion_request_assistant_message_weight_FromString(char* weight){
    int stringToReturn = 0;
    char *weightArray[] =  { "NULL", "0", "1" };
    size_t sizeofArray = sizeof(weightArray) / sizeof(weightArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(weight, weightArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static fine_tune_chat_completion_request_assistant_message_t *fine_tune_chat_completion_request_assistant_message_create_internal(
    chat_completion_request_assistant_message_content_t *content,
    char *refusal,
    openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_e role,
    char *name,
    chat_completion_request_assistant_message_audio_t *audio,
    list_t *tool_calls,
    chat_completion_request_assistant_message_function_call_t *function_call,
    int weight
    ) {
    fine_tune_chat_completion_request_assistant_message_t *fine_tune_chat_completion_request_assistant_message_local_var = malloc(sizeof(fine_tune_chat_completion_request_assistant_message_t));
    if (!fine_tune_chat_completion_request_assistant_message_local_var) {
        return NULL;
    }
    fine_tune_chat_completion_request_assistant_message_local_var->content = content;
    fine_tune_chat_completion_request_assistant_message_local_var->refusal = refusal;
    fine_tune_chat_completion_request_assistant_message_local_var->role = role;
    fine_tune_chat_completion_request_assistant_message_local_var->name = name;
    fine_tune_chat_completion_request_assistant_message_local_var->audio = audio;
    fine_tune_chat_completion_request_assistant_message_local_var->tool_calls = tool_calls;
    fine_tune_chat_completion_request_assistant_message_local_var->function_call = function_call;
    fine_tune_chat_completion_request_assistant_message_local_var->weight = weight;

    fine_tune_chat_completion_request_assistant_message_local_var->_library_owned = 1;
    return fine_tune_chat_completion_request_assistant_message_local_var;
}

__attribute__((deprecated)) fine_tune_chat_completion_request_assistant_message_t *fine_tune_chat_completion_request_assistant_message_create(
    chat_completion_request_assistant_message_content_t *content,
    char *refusal,
    openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_e role,
    char *name,
    chat_completion_request_assistant_message_audio_t *audio,
    list_t *tool_calls,
    chat_completion_request_assistant_message_function_call_t *function_call,
    int weight
    ) {
    return fine_tune_chat_completion_request_assistant_message_create_internal (
        content,
        refusal,
        role,
        name,
        audio,
        tool_calls,
        function_call,
        weight
        );
}

void fine_tune_chat_completion_request_assistant_message_free(fine_tune_chat_completion_request_assistant_message_t *fine_tune_chat_completion_request_assistant_message) {
    if(NULL == fine_tune_chat_completion_request_assistant_message){
        return ;
    }
    if(fine_tune_chat_completion_request_assistant_message->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tune_chat_completion_request_assistant_message_free");
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tune_chat_completion_request_assistant_message->content) {
        chat_completion_request_assistant_message_content_free(fine_tune_chat_completion_request_assistant_message->content);
        fine_tune_chat_completion_request_assistant_message->content = NULL;
    }
    if (fine_tune_chat_completion_request_assistant_message->refusal) {
        free(fine_tune_chat_completion_request_assistant_message->refusal);
        fine_tune_chat_completion_request_assistant_message->refusal = NULL;
    }
    if (fine_tune_chat_completion_request_assistant_message->name) {
        free(fine_tune_chat_completion_request_assistant_message->name);
        fine_tune_chat_completion_request_assistant_message->name = NULL;
    }
    if (fine_tune_chat_completion_request_assistant_message->audio) {
        chat_completion_request_assistant_message_audio_free(fine_tune_chat_completion_request_assistant_message->audio);
        fine_tune_chat_completion_request_assistant_message->audio = NULL;
    }
    if (fine_tune_chat_completion_request_assistant_message->tool_calls) {
        list_ForEach(listEntry, fine_tune_chat_completion_request_assistant_message->tool_calls) {
            chat_completion_message_tool_call_free(listEntry->data);
        }
        list_freeList(fine_tune_chat_completion_request_assistant_message->tool_calls);
        fine_tune_chat_completion_request_assistant_message->tool_calls = NULL;
    }
    if (fine_tune_chat_completion_request_assistant_message->function_call) {
        chat_completion_request_assistant_message_function_call_free(fine_tune_chat_completion_request_assistant_message->function_call);
        fine_tune_chat_completion_request_assistant_message->function_call = NULL;
    }
    free(fine_tune_chat_completion_request_assistant_message);
}

cJSON *fine_tune_chat_completion_request_assistant_message_convertToJSON(fine_tune_chat_completion_request_assistant_message_t *fine_tune_chat_completion_request_assistant_message) {
    cJSON *item = cJSON_CreateObject();

    // fine_tune_chat_completion_request_assistant_message->content
    if(fine_tune_chat_completion_request_assistant_message->content) {
    cJSON *content_local_JSON = chat_completion_request_assistant_message_content_convertToJSON(fine_tune_chat_completion_request_assistant_message->content);
    if(content_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "content", content_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // fine_tune_chat_completion_request_assistant_message->refusal
    if(fine_tune_chat_completion_request_assistant_message->refusal) {
    if(cJSON_AddStringToObject(item, "refusal", fine_tune_chat_completion_request_assistant_message->refusal) == NULL) {
    goto fail; //String
    }
    }


    // fine_tune_chat_completion_request_assistant_message->role
    if (openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_NULL == fine_tune_chat_completion_request_assistant_message->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", fine_tune_chat_completion_request_assistant_message_role_ToString(fine_tune_chat_completion_request_assistant_message->role)) == NULL)
    {
    goto fail; //Enum
    }


    // fine_tune_chat_completion_request_assistant_message->name
    if(fine_tune_chat_completion_request_assistant_message->name) {
    if(cJSON_AddStringToObject(item, "name", fine_tune_chat_completion_request_assistant_message->name) == NULL) {
    goto fail; //String
    }
    }


    // fine_tune_chat_completion_request_assistant_message->audio
    if(fine_tune_chat_completion_request_assistant_message->audio) {
    cJSON *audio_local_JSON = chat_completion_request_assistant_message_audio_convertToJSON(fine_tune_chat_completion_request_assistant_message->audio);
    if(audio_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "audio", audio_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // fine_tune_chat_completion_request_assistant_message->tool_calls
    if(fine_tune_chat_completion_request_assistant_message->tool_calls) {
    cJSON *tool_calls = cJSON_AddArrayToObject(item, "tool_calls");
    if(tool_calls == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *tool_callsListEntry;
    if (fine_tune_chat_completion_request_assistant_message->tool_calls) {
    list_ForEach(tool_callsListEntry, fine_tune_chat_completion_request_assistant_message->tool_calls) {
    cJSON *itemLocal = chat_completion_message_tool_call_convertToJSON(tool_callsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tool_calls, itemLocal);
    }
    }
    }


    // fine_tune_chat_completion_request_assistant_message->function_call
    if(fine_tune_chat_completion_request_assistant_message->function_call) {
    cJSON *function_call_local_JSON = chat_completion_request_assistant_message_function_call_convertToJSON(fine_tune_chat_completion_request_assistant_message->function_call);
    if(function_call_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "function_call", function_call_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // fine_tune_chat_completion_request_assistant_message->weight
    if(fine_tune_chat_completion_request_assistant_message->weight != openai_api_fine_tune_chat_completion_request_assistant_message_WEIGHT_NULL) {
    if(cJSON_AddNumberToObject(item, "weight", fine_tune_chat_completion_request_assistant_message->weight) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

fine_tune_chat_completion_request_assistant_message_t *fine_tune_chat_completion_request_assistant_message_parseFromJSON(cJSON *fine_tune_chat_completion_request_assistant_messageJSON){

    fine_tune_chat_completion_request_assistant_message_t *fine_tune_chat_completion_request_assistant_message_local_var = NULL;

    // define the local variable for fine_tune_chat_completion_request_assistant_message->content
    chat_completion_request_assistant_message_content_t *content_local_nonprim = NULL;

    // define the local variable for fine_tune_chat_completion_request_assistant_message->audio
    chat_completion_request_assistant_message_audio_t *audio_local_nonprim = NULL;

    // define the local list for fine_tune_chat_completion_request_assistant_message->tool_calls
    list_t *tool_callsList = NULL;

    // define the local variable for fine_tune_chat_completion_request_assistant_message->function_call
    chat_completion_request_assistant_message_function_call_t *function_call_local_nonprim = NULL;

    // fine_tune_chat_completion_request_assistant_message->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_completion_request_assistant_messageJSON, "content");
    if (cJSON_IsNull(content)) {
        content = NULL;
    }
    if (content) { 
    content_local_nonprim = chat_completion_request_assistant_message_content_parseFromJSON(content); //nonprimitive
    }

    // fine_tune_chat_completion_request_assistant_message->refusal
    cJSON *refusal = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_completion_request_assistant_messageJSON, "refusal");
    if (cJSON_IsNull(refusal)) {
        refusal = NULL;
    }
    if (refusal) { 
    if(!cJSON_IsString(refusal) && !cJSON_IsNull(refusal))
    {
    goto end; //String
    }
    }

    // fine_tune_chat_completion_request_assistant_message->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_completion_request_assistant_messageJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = fine_tune_chat_completion_request_assistant_message_role_FromString(role->valuestring);

    // fine_tune_chat_completion_request_assistant_message->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_completion_request_assistant_messageJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // fine_tune_chat_completion_request_assistant_message->audio
    cJSON *audio = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_completion_request_assistant_messageJSON, "audio");
    if (cJSON_IsNull(audio)) {
        audio = NULL;
    }
    if (audio) { 
    audio_local_nonprim = chat_completion_request_assistant_message_audio_parseFromJSON(audio); //nonprimitive
    }

    // fine_tune_chat_completion_request_assistant_message->tool_calls
    cJSON *tool_calls = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_completion_request_assistant_messageJSON, "tool_calls");
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

    // fine_tune_chat_completion_request_assistant_message->function_call
    cJSON *function_call = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_completion_request_assistant_messageJSON, "function_call");
    if (cJSON_IsNull(function_call)) {
        function_call = NULL;
    }
    if (function_call) { 
    function_call_local_nonprim = chat_completion_request_assistant_message_function_call_parseFromJSON(function_call); //nonprimitive
    }

    // fine_tune_chat_completion_request_assistant_message->weight
    cJSON *weight = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_completion_request_assistant_messageJSON, "weight");
    if (cJSON_IsNull(weight)) {
        weight = NULL;
    }
    if (weight) { 
    if(!cJSON_IsNumber(weight))
    {
    goto end; //Numeric
    }
    }


    fine_tune_chat_completion_request_assistant_message_local_var = fine_tune_chat_completion_request_assistant_message_create_internal (
        content ? content_local_nonprim : NULL,
        refusal && !cJSON_IsNull(refusal) ? strdup(refusal->valuestring) : NULL,
        roleVariable,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        audio ? audio_local_nonprim : NULL,
        tool_calls ? tool_callsList : NULL,
        function_call ? function_call_local_nonprim : NULL,
        weight ? weight->valuedouble : 0
        );

    return fine_tune_chat_completion_request_assistant_message_local_var;
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
