#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_stream_response_delta_function_call.h"



chat_completion_stream_response_delta_function_call_t *chat_completion_stream_response_delta_function_call_create(
    char *arguments,
    char *name
    ) {
    chat_completion_stream_response_delta_function_call_t *chat_completion_stream_response_delta_function_call_local_var = malloc(sizeof(chat_completion_stream_response_delta_function_call_t));
    if (!chat_completion_stream_response_delta_function_call_local_var) {
        return NULL;
    }
    chat_completion_stream_response_delta_function_call_local_var->arguments = arguments;
    chat_completion_stream_response_delta_function_call_local_var->name = name;

    return chat_completion_stream_response_delta_function_call_local_var;
}


void chat_completion_stream_response_delta_function_call_free(chat_completion_stream_response_delta_function_call_t *chat_completion_stream_response_delta_function_call) {
    if(NULL == chat_completion_stream_response_delta_function_call){
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_stream_response_delta_function_call->arguments) {
        free(chat_completion_stream_response_delta_function_call->arguments);
        chat_completion_stream_response_delta_function_call->arguments = NULL;
    }
    if (chat_completion_stream_response_delta_function_call->name) {
        free(chat_completion_stream_response_delta_function_call->name);
        chat_completion_stream_response_delta_function_call->name = NULL;
    }
    free(chat_completion_stream_response_delta_function_call);
}

cJSON *chat_completion_stream_response_delta_function_call_convertToJSON(chat_completion_stream_response_delta_function_call_t *chat_completion_stream_response_delta_function_call) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_stream_response_delta_function_call->arguments
    if(chat_completion_stream_response_delta_function_call->arguments) {
    if(cJSON_AddStringToObject(item, "arguments", chat_completion_stream_response_delta_function_call->arguments) == NULL) {
    goto fail; //String
    }
    }


    // chat_completion_stream_response_delta_function_call->name
    if(chat_completion_stream_response_delta_function_call->name) {
    if(cJSON_AddStringToObject(item, "name", chat_completion_stream_response_delta_function_call->name) == NULL) {
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

chat_completion_stream_response_delta_function_call_t *chat_completion_stream_response_delta_function_call_parseFromJSON(cJSON *chat_completion_stream_response_delta_function_callJSON){

    chat_completion_stream_response_delta_function_call_t *chat_completion_stream_response_delta_function_call_local_var = NULL;

    // chat_completion_stream_response_delta_function_call->arguments
    cJSON *arguments = cJSON_GetObjectItemCaseSensitive(chat_completion_stream_response_delta_function_callJSON, "arguments");
    if (arguments) { 
    if(!cJSON_IsString(arguments) && !cJSON_IsNull(arguments))
    {
    goto end; //String
    }
    }

    // chat_completion_stream_response_delta_function_call->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(chat_completion_stream_response_delta_function_callJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    chat_completion_stream_response_delta_function_call_local_var = chat_completion_stream_response_delta_function_call_create (
        arguments && !cJSON_IsNull(arguments) ? strdup(arguments->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return chat_completion_stream_response_delta_function_call_local_var;
end:
    return NULL;

}
