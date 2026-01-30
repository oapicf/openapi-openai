#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tune_chat_request_input_messages_inner.h"


char* fine_tune_chat_request_input_messages_inner_role_ToString(openai_api_fine_tune_chat_request_input_messages_inner_ROLE_e role) {
    char* roleArray[] =  { "NULL", "function" };
    return roleArray[role];
}

openai_api_fine_tune_chat_request_input_messages_inner_ROLE_e fine_tune_chat_request_input_messages_inner_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "function" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* fine_tune_chat_request_input_messages_inner_weight_ToString(openai_api_fine_tune_chat_request_input_messages_inner_WEIGHT_e weight) {
    char* weightArray[] =  { "NULL", "0", "1" };
    return weightArray[weight];
}

openai_api_fine_tune_chat_request_input_messages_inner_WEIGHT_e fine_tune_chat_request_input_messages_inner_weight_FromString(char* weight){
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

static fine_tune_chat_request_input_messages_inner_t *fine_tune_chat_request_input_messages_inner_create_internal(
    char *content,
    openai_api_fine_tune_chat_request_input_messages_inner_ROLE_e role,
    char *name,
    int weight,
    char *refusal,
    chat_completion_request_assistant_message_audio_t *audio,
    list_t *tool_calls,
    chat_completion_request_assistant_message_function_call_t *function_call,
    char *tool_call_id
    ) {
    fine_tune_chat_request_input_messages_inner_t *fine_tune_chat_request_input_messages_inner_local_var = malloc(sizeof(fine_tune_chat_request_input_messages_inner_t));
    if (!fine_tune_chat_request_input_messages_inner_local_var) {
        return NULL;
    }
    fine_tune_chat_request_input_messages_inner_local_var->content = content;
    fine_tune_chat_request_input_messages_inner_local_var->role = role;
    fine_tune_chat_request_input_messages_inner_local_var->name = name;
    fine_tune_chat_request_input_messages_inner_local_var->weight = weight;
    fine_tune_chat_request_input_messages_inner_local_var->refusal = refusal;
    fine_tune_chat_request_input_messages_inner_local_var->audio = audio;
    fine_tune_chat_request_input_messages_inner_local_var->tool_calls = tool_calls;
    fine_tune_chat_request_input_messages_inner_local_var->function_call = function_call;
    fine_tune_chat_request_input_messages_inner_local_var->tool_call_id = tool_call_id;

    fine_tune_chat_request_input_messages_inner_local_var->_library_owned = 1;
    return fine_tune_chat_request_input_messages_inner_local_var;
}

__attribute__((deprecated)) fine_tune_chat_request_input_messages_inner_t *fine_tune_chat_request_input_messages_inner_create(
    char *content,
    openai_api_fine_tune_chat_request_input_messages_inner_ROLE_e role,
    char *name,
    int weight,
    char *refusal,
    chat_completion_request_assistant_message_audio_t *audio,
    list_t *tool_calls,
    chat_completion_request_assistant_message_function_call_t *function_call,
    char *tool_call_id
    ) {
    return fine_tune_chat_request_input_messages_inner_create_internal (
        content,
        role,
        name,
        weight,
        refusal,
        audio,
        tool_calls,
        function_call,
        tool_call_id
        );
}

void fine_tune_chat_request_input_messages_inner_free(fine_tune_chat_request_input_messages_inner_t *fine_tune_chat_request_input_messages_inner) {
    if(NULL == fine_tune_chat_request_input_messages_inner){
        return ;
    }
    if(fine_tune_chat_request_input_messages_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tune_chat_request_input_messages_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tune_chat_request_input_messages_inner->content) {
        free(fine_tune_chat_request_input_messages_inner->content);
        fine_tune_chat_request_input_messages_inner->content = NULL;
    }
    if (fine_tune_chat_request_input_messages_inner->name) {
        free(fine_tune_chat_request_input_messages_inner->name);
        fine_tune_chat_request_input_messages_inner->name = NULL;
    }
    if (fine_tune_chat_request_input_messages_inner->refusal) {
        free(fine_tune_chat_request_input_messages_inner->refusal);
        fine_tune_chat_request_input_messages_inner->refusal = NULL;
    }
    if (fine_tune_chat_request_input_messages_inner->audio) {
        chat_completion_request_assistant_message_audio_free(fine_tune_chat_request_input_messages_inner->audio);
        fine_tune_chat_request_input_messages_inner->audio = NULL;
    }
    if (fine_tune_chat_request_input_messages_inner->tool_calls) {
        list_ForEach(listEntry, fine_tune_chat_request_input_messages_inner->tool_calls) {
            chat_completion_message_tool_call_free(listEntry->data);
        }
        list_freeList(fine_tune_chat_request_input_messages_inner->tool_calls);
        fine_tune_chat_request_input_messages_inner->tool_calls = NULL;
    }
    if (fine_tune_chat_request_input_messages_inner->function_call) {
        chat_completion_request_assistant_message_function_call_free(fine_tune_chat_request_input_messages_inner->function_call);
        fine_tune_chat_request_input_messages_inner->function_call = NULL;
    }
    if (fine_tune_chat_request_input_messages_inner->tool_call_id) {
        free(fine_tune_chat_request_input_messages_inner->tool_call_id);
        fine_tune_chat_request_input_messages_inner->tool_call_id = NULL;
    }
    free(fine_tune_chat_request_input_messages_inner);
}

cJSON *fine_tune_chat_request_input_messages_inner_convertToJSON(fine_tune_chat_request_input_messages_inner_t *fine_tune_chat_request_input_messages_inner) {
    cJSON *item = cJSON_CreateObject();

    // fine_tune_chat_request_input_messages_inner->content
    if (!fine_tune_chat_request_input_messages_inner->content) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "content", fine_tune_chat_request_input_messages_inner->content) == NULL) {
    goto fail; //String
    }


    // fine_tune_chat_request_input_messages_inner->role
    if (openai_api_fine_tune_chat_request_input_messages_inner_ROLE_NULL == fine_tune_chat_request_input_messages_inner->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", fine_tune_chat_request_input_messages_inner_role_ToString(fine_tune_chat_request_input_messages_inner->role)) == NULL)
    {
    goto fail; //Enum
    }


    // fine_tune_chat_request_input_messages_inner->name
    if (!fine_tune_chat_request_input_messages_inner->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", fine_tune_chat_request_input_messages_inner->name) == NULL) {
    goto fail; //String
    }


    // fine_tune_chat_request_input_messages_inner->weight
    if(fine_tune_chat_request_input_messages_inner->weight != openai_api_fine_tune_chat_request_input_messages_inner_WEIGHT_NULL) {
    if(cJSON_AddNumberToObject(item, "weight", fine_tune_chat_request_input_messages_inner->weight) == NULL) {
    goto fail; //Numeric
    }
    }


    // fine_tune_chat_request_input_messages_inner->refusal
    if(fine_tune_chat_request_input_messages_inner->refusal) {
    if(cJSON_AddStringToObject(item, "refusal", fine_tune_chat_request_input_messages_inner->refusal) == NULL) {
    goto fail; //String
    }
    }


    // fine_tune_chat_request_input_messages_inner->audio
    if(fine_tune_chat_request_input_messages_inner->audio) {
    cJSON *audio_local_JSON = chat_completion_request_assistant_message_audio_convertToJSON(fine_tune_chat_request_input_messages_inner->audio);
    if(audio_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "audio", audio_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // fine_tune_chat_request_input_messages_inner->tool_calls
    if(fine_tune_chat_request_input_messages_inner->tool_calls) {
    cJSON *tool_calls = cJSON_AddArrayToObject(item, "tool_calls");
    if(tool_calls == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *tool_callsListEntry;
    if (fine_tune_chat_request_input_messages_inner->tool_calls) {
    list_ForEach(tool_callsListEntry, fine_tune_chat_request_input_messages_inner->tool_calls) {
    cJSON *itemLocal = chat_completion_message_tool_call_convertToJSON(tool_callsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tool_calls, itemLocal);
    }
    }
    }


    // fine_tune_chat_request_input_messages_inner->function_call
    if(fine_tune_chat_request_input_messages_inner->function_call) {
    cJSON *function_call_local_JSON = chat_completion_request_assistant_message_function_call_convertToJSON(fine_tune_chat_request_input_messages_inner->function_call);
    if(function_call_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "function_call", function_call_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // fine_tune_chat_request_input_messages_inner->tool_call_id
    if (!fine_tune_chat_request_input_messages_inner->tool_call_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "tool_call_id", fine_tune_chat_request_input_messages_inner->tool_call_id) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

fine_tune_chat_request_input_messages_inner_t *fine_tune_chat_request_input_messages_inner_parseFromJSON(cJSON *fine_tune_chat_request_input_messages_innerJSON){

    fine_tune_chat_request_input_messages_inner_t *fine_tune_chat_request_input_messages_inner_local_var = NULL;

    // define the local variable for fine_tune_chat_request_input_messages_inner->audio
    chat_completion_request_assistant_message_audio_t *audio_local_nonprim = NULL;

    // define the local list for fine_tune_chat_request_input_messages_inner->tool_calls
    list_t *tool_callsList = NULL;

    // define the local variable for fine_tune_chat_request_input_messages_inner->function_call
    chat_completion_request_assistant_message_function_call_t *function_call_local_nonprim = NULL;

    // fine_tune_chat_request_input_messages_inner->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_request_input_messages_innerJSON, "content");
    if (cJSON_IsNull(content)) {
        content = NULL;
    }
    if (!content) {
        goto end;
    }

    
    if(!cJSON_IsString(content))
    {
    goto end; //String
    }

    // fine_tune_chat_request_input_messages_inner->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_request_input_messages_innerJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_fine_tune_chat_request_input_messages_inner_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = fine_tune_chat_request_input_messages_inner_role_FromString(role->valuestring);

    // fine_tune_chat_request_input_messages_inner->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_request_input_messages_innerJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // fine_tune_chat_request_input_messages_inner->weight
    cJSON *weight = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_request_input_messages_innerJSON, "weight");
    if (cJSON_IsNull(weight)) {
        weight = NULL;
    }
    if (weight) { 
    if(!cJSON_IsNumber(weight))
    {
    goto end; //Numeric
    }
    }

    // fine_tune_chat_request_input_messages_inner->refusal
    cJSON *refusal = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_request_input_messages_innerJSON, "refusal");
    if (cJSON_IsNull(refusal)) {
        refusal = NULL;
    }
    if (refusal) { 
    if(!cJSON_IsString(refusal) && !cJSON_IsNull(refusal))
    {
    goto end; //String
    }
    }

    // fine_tune_chat_request_input_messages_inner->audio
    cJSON *audio = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_request_input_messages_innerJSON, "audio");
    if (cJSON_IsNull(audio)) {
        audio = NULL;
    }
    if (audio) { 
    audio_local_nonprim = chat_completion_request_assistant_message_audio_parseFromJSON(audio); //nonprimitive
    }

    // fine_tune_chat_request_input_messages_inner->tool_calls
    cJSON *tool_calls = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_request_input_messages_innerJSON, "tool_calls");
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

    // fine_tune_chat_request_input_messages_inner->function_call
    cJSON *function_call = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_request_input_messages_innerJSON, "function_call");
    if (cJSON_IsNull(function_call)) {
        function_call = NULL;
    }
    if (function_call) { 
    function_call_local_nonprim = chat_completion_request_assistant_message_function_call_parseFromJSON(function_call); //nonprimitive
    }

    // fine_tune_chat_request_input_messages_inner->tool_call_id
    cJSON *tool_call_id = cJSON_GetObjectItemCaseSensitive(fine_tune_chat_request_input_messages_innerJSON, "tool_call_id");
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


    fine_tune_chat_request_input_messages_inner_local_var = fine_tune_chat_request_input_messages_inner_create_internal (
        strdup(content->valuestring),
        roleVariable,
        strdup(name->valuestring),
        weight ? weight->valuedouble : 0,
        refusal && !cJSON_IsNull(refusal) ? strdup(refusal->valuestring) : NULL,
        audio ? audio_local_nonprim : NULL,
        tool_calls ? tool_callsList : NULL,
        function_call ? function_call_local_nonprim : NULL,
        strdup(tool_call_id->valuestring)
        );

    return fine_tune_chat_request_input_messages_inner_local_var;
end:
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
