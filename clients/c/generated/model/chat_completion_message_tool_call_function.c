#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_message_tool_call_function.h"



chat_completion_message_tool_call_function_t *chat_completion_message_tool_call_function_create(
    char *name,
    char *arguments
    ) {
    chat_completion_message_tool_call_function_t *chat_completion_message_tool_call_function_local_var = malloc(sizeof(chat_completion_message_tool_call_function_t));
    if (!chat_completion_message_tool_call_function_local_var) {
        return NULL;
    }
    chat_completion_message_tool_call_function_local_var->name = name;
    chat_completion_message_tool_call_function_local_var->arguments = arguments;

    return chat_completion_message_tool_call_function_local_var;
}


void chat_completion_message_tool_call_function_free(chat_completion_message_tool_call_function_t *chat_completion_message_tool_call_function) {
    if(NULL == chat_completion_message_tool_call_function){
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

    // chat_completion_message_tool_call_function->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(chat_completion_message_tool_call_functionJSON, "name");
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // chat_completion_message_tool_call_function->arguments
    cJSON *arguments = cJSON_GetObjectItemCaseSensitive(chat_completion_message_tool_call_functionJSON, "arguments");
    if (!arguments) {
        goto end;
    }

    
    if(!cJSON_IsString(arguments))
    {
    goto end; //String
    }


    chat_completion_message_tool_call_function_local_var = chat_completion_message_tool_call_function_create (
        strdup(name->valuestring),
        strdup(arguments->valuestring)
        );

    return chat_completion_message_tool_call_function_local_var;
end:
    return NULL;

}
