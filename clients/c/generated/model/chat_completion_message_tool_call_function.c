#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_message_tool_call_function.h"



static chat_completion_message_tool_call_function_t *chat_completion_message_tool_call_function_create_internal(
    char *name,
    char *arguments
    ) {
    chat_completion_message_tool_call_function_t *chat_completion_message_tool_call_function_local_var = malloc(sizeof(chat_completion_message_tool_call_function_t));
    if (!chat_completion_message_tool_call_function_local_var) {
        return NULL;
    }
    memset(chat_completion_message_tool_call_function_local_var, 0, sizeof(chat_completion_message_tool_call_function_t));
    chat_completion_message_tool_call_function_local_var->_library_owned = 1;
    chat_completion_message_tool_call_function_local_var->name = name;
    chat_completion_message_tool_call_function_local_var->arguments = arguments;
    return chat_completion_message_tool_call_function_local_var;
}

__attribute__((deprecated)) chat_completion_message_tool_call_function_t *chat_completion_message_tool_call_function_create(
    char *name,
    char *arguments
    ) {
    chat_completion_message_tool_call_function_t *result = chat_completion_message_tool_call_function_create_internal (
        name,
        arguments
        );
    if (!result) {
    }
    return result;
}

void chat_completion_message_tool_call_function_free(chat_completion_message_tool_call_function_t *chat_completion_message_tool_call_function) {
    if(NULL == chat_completion_message_tool_call_function){
        return ;
    }
    if(chat_completion_message_tool_call_function->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_message_tool_call_function_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_message_tool_call_function->name) {
        free(chat_completion_message_tool_call_function->name);
        chat_completion_message_tool_call_function->name = NULL;
    }
    if (chat_completion_message_tool_call_function->arguments) {
        free(chat_completion_message_tool_call_function->arguments);
        chat_completion_message_tool_call_function->arguments = NULL;
    }
    free(chat_completion_message_tool_call_function);
}

cJSON *chat_completion_message_tool_call_function_convertToJSON(chat_completion_message_tool_call_function_t *chat_completion_message_tool_call_function) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_message_tool_call_function->name
    if (!chat_completion_message_tool_call_function->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", chat_completion_message_tool_call_function->name) == NULL) {
    goto fail; //String
    }


    // chat_completion_message_tool_call_function->arguments
    if (!chat_completion_message_tool_call_function->arguments) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "arguments", chat_completion_message_tool_call_function->arguments) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_message_tool_call_function_t *chat_completion_message_tool_call_function_parseFromJSON(cJSON *chat_completion_message_tool_call_functionJSON){

    chat_completion_message_tool_call_function_t *chat_completion_message_tool_call_function_local_var = NULL;

    char *name_local_str = NULL;

    char *arguments_local_str = NULL;

    // chat_completion_message_tool_call_function->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(chat_completion_message_tool_call_functionJSON, "name");
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

    // chat_completion_message_tool_call_function->arguments
    cJSON *arguments = cJSON_GetObjectItemCaseSensitive(chat_completion_message_tool_call_functionJSON, "arguments");
    if (cJSON_IsNull(arguments)) {
        arguments = NULL;
    }
    if (!arguments) {
        goto end;
    }

    
    if(!cJSON_IsString(arguments))
    {
    goto end; //String
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (arguments && !cJSON_IsNull(arguments)) arguments_local_str = strdup(arguments->valuestring);

    chat_completion_message_tool_call_function_local_var = chat_completion_message_tool_call_function_create_internal (
        name_local_str,
        arguments_local_str
        );

    if (!chat_completion_message_tool_call_function_local_var) {
        goto end;
    }

    return chat_completion_message_tool_call_function_local_var;
end:
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (arguments_local_str) {
        free(arguments_local_str);
        arguments_local_str = NULL;
    }
    return NULL;

}
