#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_stream_options.h"



static chat_completion_stream_options_t *chat_completion_stream_options_create_internal(
    int *include_usage
    ) {
    chat_completion_stream_options_t *chat_completion_stream_options_local_var = malloc(sizeof(chat_completion_stream_options_t));
    if (!chat_completion_stream_options_local_var) {
        return NULL;
    }
    memset(chat_completion_stream_options_local_var, 0, sizeof(chat_completion_stream_options_t));
    chat_completion_stream_options_local_var->_library_owned = 1;
    chat_completion_stream_options_local_var->include_usage = include_usage;
    return chat_completion_stream_options_local_var;
}

__attribute__((deprecated)) chat_completion_stream_options_t *chat_completion_stream_options_create(
    int *include_usage
    ) {
    int *include_usage_copy = NULL;
    if (include_usage) {
        include_usage_copy = malloc(sizeof(int));
        if (include_usage_copy) *include_usage_copy = *include_usage;
    }
    chat_completion_stream_options_t *result = chat_completion_stream_options_create_internal (
        include_usage_copy
        );
    if (!result) {
        free(include_usage_copy);
    }
    return result;
}

void chat_completion_stream_options_free(chat_completion_stream_options_t *chat_completion_stream_options) {
    if(NULL == chat_completion_stream_options){
        return ;
    }
    if(chat_completion_stream_options->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "chat_completion_stream_options_free");
        return ;
    }
    listEntry_t *listEntry;
    if (chat_completion_stream_options->include_usage) {
        free(chat_completion_stream_options->include_usage);
        chat_completion_stream_options->include_usage = NULL;
    }
    free(chat_completion_stream_options);
}

cJSON *chat_completion_stream_options_convertToJSON(chat_completion_stream_options_t *chat_completion_stream_options) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_stream_options->include_usage
    if(chat_completion_stream_options->include_usage) {
    if(cJSON_AddBoolToObject(item, "include_usage", *chat_completion_stream_options->include_usage) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

chat_completion_stream_options_t *chat_completion_stream_options_parseFromJSON(cJSON *chat_completion_stream_optionsJSON){

    chat_completion_stream_options_t *chat_completion_stream_options_local_var = NULL;

    // define the local variable for chat_completion_stream_options->include_usage
    int *include_usage_local_var = NULL;

    // chat_completion_stream_options->include_usage
    cJSON *include_usage = cJSON_GetObjectItemCaseSensitive(chat_completion_stream_optionsJSON, "include_usage");
    if (cJSON_IsNull(include_usage)) {
        include_usage = NULL;
    }
    if (include_usage) { 
    if(!cJSON_IsBool(include_usage))
    {
    goto end; //Bool
    }
    include_usage_local_var = malloc(sizeof(int));
    if(!include_usage_local_var)
    {
        goto end;
    }
    *include_usage_local_var = include_usage->valueint;
    }



    chat_completion_stream_options_local_var = chat_completion_stream_options_create_internal (
        include_usage_local_var
        );

    if (!chat_completion_stream_options_local_var) {
        goto end;
    }

    return chat_completion_stream_options_local_var;
end:
    if (include_usage_local_var) {
        free(include_usage_local_var);
        include_usage_local_var = NULL;
    }
    return NULL;

}
