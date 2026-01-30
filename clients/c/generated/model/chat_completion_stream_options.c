#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "chat_completion_stream_options.h"



static chat_completion_stream_options_t *chat_completion_stream_options_create_internal(
    int include_usage
    ) {
    chat_completion_stream_options_t *chat_completion_stream_options_local_var = malloc(sizeof(chat_completion_stream_options_t));
    if (!chat_completion_stream_options_local_var) {
        return NULL;
    }
    chat_completion_stream_options_local_var->include_usage = include_usage;

    chat_completion_stream_options_local_var->_library_owned = 1;
    return chat_completion_stream_options_local_var;
}

__attribute__((deprecated)) chat_completion_stream_options_t *chat_completion_stream_options_create(
    int include_usage
    ) {
    return chat_completion_stream_options_create_internal (
        include_usage
        );
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
    free(chat_completion_stream_options);
}

cJSON *chat_completion_stream_options_convertToJSON(chat_completion_stream_options_t *chat_completion_stream_options) {
    cJSON *item = cJSON_CreateObject();

    // chat_completion_stream_options->include_usage
    if(chat_completion_stream_options->include_usage) {
    if(cJSON_AddBoolToObject(item, "include_usage", chat_completion_stream_options->include_usage) == NULL) {
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
    }


    chat_completion_stream_options_local_var = chat_completion_stream_options_create_internal (
        include_usage ? include_usage->valueint : 0
        );

    return chat_completion_stream_options_local_var;
end:
    return NULL;

}
