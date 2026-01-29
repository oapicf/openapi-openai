#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_message_tool_call.h"


char* chat_completion_message_tool_call_type_ToString(openai_api_chat_completion_message_tool_call_TYPE_e type) {
    char* typeArray[] =  { "NULL", "function" };
    return typeArray[type];
}

openai_api_chat_completion_message_tool_call_TYPE_e chat_completion_message_tool_call_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "function" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static chat_completion_message_tool_call_t *chat_completion_message_tool_call_create_internal(
    char *id,
    openai_api_chat_completion_message_tool_call_TYPE_e type,
    chat_completion_message_tool_call_function_t *function
    ) {
    chat_completion_message_tool_call_t *chat_completion_message_tool_call_local_var = malloc(sizeof(chat_completion_message_tool_call_t));
    if (!chat_completion_message_tool_call_local_var) {
        return NULL;
    }
    chat_completion_message_tool_call_local_var->id = id;
    chat_completion_message_tool_call_local_var->type = type;
    chat_completion_message_tool_call_local_var->function = function;

    chat_completion_message_tool_call_local_var->_library_owned = 1;
    return chat_completion_message_tool_call_local_var;
}

__attribute__((deprecated)) chat_completion_message_tool_call_t *chat_completion_message_tool_call_create(
    char *id,
    openai_api_chat_completion_message_tool_call_TYPE_e type,
    chat_completion_message_tool_call_function_t *function
    ) {
    return chat_completion_message_tool_call_create_internal (
        id,
        type,
        function
        );
}

void chat_completion_message_tool_call_free(chat_completion_message_tool_call_t *chat_completion_message_tool_call) {
    if(NULL == chat_completion_message_tool_call){
        return ;
    }
    if(chat_completion_message_tool_call->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_message_tool_call_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_message_tool_call->id) {
        free(chat_completion_message_tool_call->id);
        chat_completion_message_tool_call->id = NULL;
    }
    if (chat_completion_message_tool_call->function) {
        chat_completion_message_tool_call_function_free(chat_completion_message_tool_call->function);
        chat_completion_message_tool_call->function = NULL;
    }
    free(chat_completion_message_tool_call);
}

cJSON *chat_completion_message_tool_call_convertToJSON(chat_completion_message_tool_call_t *chat_completion_message_tool_call) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_message_tool_call->id
    if (!chat_completion_message_tool_call->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", chat_completion_message_tool_call->id) == NULL) {
    goto fail; //String
    }


    // chat_completion_message_tool_call->type
    if (openai_api_chat_completion_message_tool_call_TYPE_NULL == chat_completion_message_tool_call->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", chat_completion_message_tool_call_type_ToString(chat_completion_message_tool_call->type)) == NULL)
    {
    goto fail; //Enum
    }


    // chat_completion_message_tool_call->function
    if (!chat_completion_message_tool_call->function) {
        goto fail;
    }
    cJSON *function_local_JSON = chat_completion_message_tool_call_function_convertToJSON(chat_completion_message_tool_call->function);
    if(function_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "function", function_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_message_tool_call_t *chat_completion_message_tool_call_parseFromJSON(cJSON *chat_completion_message_tool_callJSON){

    chat_completion_message_tool_call_t *chat_completion_message_tool_call_local_var = NULL;

    // define the local variable for chat_completion_message_tool_call->function
    chat_completion_message_tool_call_function_t *function_local_nonprim = NULL;

    // chat_completion_message_tool_call->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(chat_completion_message_tool_callJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // chat_completion_message_tool_call->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(chat_completion_message_tool_callJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (!type) {
        goto end;
    }

    openai_api_chat_completion_message_tool_call_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = chat_completion_message_tool_call_type_FromString(type->valuestring);

    // chat_completion_message_tool_call->function
    cJSON *function = cJSON_GetObjectItemCaseSensitive(chat_completion_message_tool_callJSON, "function");
    if (cJSON_IsNull(function)) {
        function = NULL;
    }
    if (!function) {
        goto end;
    }

    
    function_local_nonprim = chat_completion_message_tool_call_function_parseFromJSON(function); //nonprimitive


    chat_completion_message_tool_call_local_var = chat_completion_message_tool_call_create_internal (
        strdup(id->valuestring),
        typeVariable,
        function_local_nonprim
        );

    return chat_completion_message_tool_call_local_var;
end:
    if (function_local_nonprim) {
        chat_completion_message_tool_call_function_free(function_local_nonprim);
        function_local_nonprim = NULL;
    }
    return NULL;

}
