#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_message_tool_call_chunk_function.h"



static chat_completion_message_tool_call_chunk_function_t *chat_completion_message_tool_call_chunk_function_create_internal(
    char *name,
    char *arguments
    ) {
    chat_completion_message_tool_call_chunk_function_t *chat_completion_message_tool_call_chunk_function_local_var = malloc(sizeof(chat_completion_message_tool_call_chunk_function_t));
    if (!chat_completion_message_tool_call_chunk_function_local_var) {
        return NULL;
    }
    chat_completion_message_tool_call_chunk_function_local_var->name = name;
    chat_completion_message_tool_call_chunk_function_local_var->arguments = arguments;

    chat_completion_message_tool_call_chunk_function_local_var->_library_owned = 1;
    return chat_completion_message_tool_call_chunk_function_local_var;
}

__attribute__((deprecated)) chat_completion_message_tool_call_chunk_function_t *chat_completion_message_tool_call_chunk_function_create(
    char *name,
    char *arguments
    ) {
    return chat_completion_message_tool_call_chunk_function_create_internal (
        name,
        arguments
        );
}

void chat_completion_message_tool_call_chunk_function_free(chat_completion_message_tool_call_chunk_function_t *chat_completion_message_tool_call_chunk_function) {
    if(NULL == chat_completion_message_tool_call_chunk_function){
        return ;
    }
    if(chat_completion_message_tool_call_chunk_function->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_message_tool_call_chunk_function_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_message_tool_call_chunk_function->name) {
        free(chat_completion_message_tool_call_chunk_function->name);
        chat_completion_message_tool_call_chunk_function->name = NULL;
    }
    if (chat_completion_message_tool_call_chunk_function->arguments) {
        free(chat_completion_message_tool_call_chunk_function->arguments);
        chat_completion_message_tool_call_chunk_function->arguments = NULL;
    }
    free(chat_completion_message_tool_call_chunk_function);
}

cJSON *chat_completion_message_tool_call_chunk_function_convertToJSON(chat_completion_message_tool_call_chunk_function_t *chat_completion_message_tool_call_chunk_function) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_message_tool_call_chunk_function->name
    if(chat_completion_message_tool_call_chunk_function->name) {
    if(cJSON_AddStringToObject(item, "name", chat_completion_message_tool_call_chunk_function->name) == NULL) {
    goto fail; //String
    }
    }


    // chat_completion_message_tool_call_chunk_function->arguments
    if(chat_completion_message_tool_call_chunk_function->arguments) {
    if(cJSON_AddStringToObject(item, "arguments", chat_completion_message_tool_call_chunk_function->arguments) == NULL) {
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

chat_completion_message_tool_call_chunk_function_t *chat_completion_message_tool_call_chunk_function_parseFromJSON(cJSON *chat_completion_message_tool_call_chunk_functionJSON){

    chat_completion_message_tool_call_chunk_function_t *chat_completion_message_tool_call_chunk_function_local_var = NULL;

    // chat_completion_message_tool_call_chunk_function->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(chat_completion_message_tool_call_chunk_functionJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // chat_completion_message_tool_call_chunk_function->arguments
    cJSON *arguments = cJSON_GetObjectItemCaseSensitive(chat_completion_message_tool_call_chunk_functionJSON, "arguments");
    if (cJSON_IsNull(arguments)) {
        arguments = NULL;
    }
    if (arguments) { 
    if(!cJSON_IsString(arguments) && !cJSON_IsNull(arguments))
    {
    goto end; //String
    }
    }


    chat_completion_message_tool_call_chunk_function_local_var = chat_completion_message_tool_call_chunk_function_create_internal (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        arguments && !cJSON_IsNull(arguments) ? strdup(arguments->valuestring) : NULL
        );

    return chat_completion_message_tool_call_chunk_function_local_var;
end:
    return NULL;

}
