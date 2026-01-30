#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_response_create_params_max_response_output_tokens.h"



static realtime_response_create_params_max_response_output_tokens_t *realtime_response_create_params_max_response_output_tokens_create_internal(
    ) {
    realtime_response_create_params_max_response_output_tokens_t *realtime_response_create_params_max_response_output_tokens_local_var = malloc(sizeof(realtime_response_create_params_max_response_output_tokens_t));
    if (!realtime_response_create_params_max_response_output_tokens_local_var) {
        return NULL;
    }

    realtime_response_create_params_max_response_output_tokens_local_var->_library_owned = 1;
    return realtime_response_create_params_max_response_output_tokens_local_var;
}

__attribute__((deprecated)) realtime_response_create_params_max_response_output_tokens_t *realtime_response_create_params_max_response_output_tokens_create(
    ) {
    return realtime_response_create_params_max_response_output_tokens_create_internal (
        );
}

void realtime_response_create_params_max_response_output_tokens_free(realtime_response_create_params_max_response_output_tokens_t *realtime_response_create_params_max_response_output_tokens) {
    if(NULL == realtime_response_create_params_max_response_output_tokens){
        return ;
    }
    if(realtime_response_create_params_max_response_output_tokens->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_response_create_params_max_response_output_tokens_free");
        return ;
    }
    listEntry_t *listEntry;
    free(realtime_response_create_params_max_response_output_tokens);
}

cJSON *realtime_response_create_params_max_response_output_tokens_convertToJSON(realtime_response_create_params_max_response_output_tokens_t *realtime_response_create_params_max_response_output_tokens) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_response_create_params_max_response_output_tokens_t *realtime_response_create_params_max_response_output_tokens_parseFromJSON(cJSON *realtime_response_create_params_max_response_output_tokensJSON){

    realtime_response_create_params_max_response_output_tokens_t *realtime_response_create_params_max_response_output_tokens_local_var = NULL;


    realtime_response_create_params_max_response_output_tokens_local_var = realtime_response_create_params_max_response_output_tokens_create_internal (
        );

    return realtime_response_create_params_max_response_output_tokens_local_var;
end:
    return NULL;

}
