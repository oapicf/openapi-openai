#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_stream_response_delta_function_call.h"



static chat_completion_stream_response_delta_function_call_t *chat_completion_stream_response_delta_function_call_create_internal(
    char *arguments,
    char *name
    ) {
    chat_completion_stream_response_delta_function_call_t *chat_completion_stream_response_delta_function_call_local_var = malloc(sizeof(chat_completion_stream_response_delta_function_call_t));
    if (!chat_completion_stream_response_delta_function_call_local_var) {
        return NULL;
    }
    chat_completion_stream_response_delta_function_call_local_var->arguments = arguments;
    chat_completion_stream_response_delta_function_call_local_var->name = name;

    chat_completion_stream_response_delta_function_call_local_var->_library_owned = 1;
    return chat_completion_stream_response_delta_function_call_local_var;
}

__attribute__((deprecated)) chat_completion_stream_response_delta_function_call_t *chat_completion_stream_response_delta_function_call_create(
    char *arguments,
    char *name
    ) {
    return chat_completion_stream_response_delta_function_call_create_internal (
        arguments,
        name
        );
}

void chat_completion_stream_response_delta_function_call_free(chat_completion_stream_response_delta_function_call_t *chat_completion_stream_response_delta_function_call) {
    if(NULL == chat_completion_stream_response_delta_function_call){
        return ;
    }
    if(chat_completion_stream_response_delta_function_call->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_stream_response_delta_function_call_free");
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
    if (cJSON_IsNull(arguments)) {
        arguments = NULL;
    }
    if (arguments) { 
    if(!cJSON_IsString(arguments) && !cJSON_IsNull(arguments))
    {
    goto end; //String
    }
    }

    // chat_completion_stream_response_delta_function_call->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(chat_completion_stream_response_delta_function_callJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }


    chat_completion_stream_response_delta_function_call_local_var = chat_completion_stream_response_delta_function_call_create_internal (
        arguments && !cJSON_IsNull(arguments) ? strdup(arguments->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL
        );

    return chat_completion_stream_response_delta_function_call_local_var;
end:
    return NULL;

}
