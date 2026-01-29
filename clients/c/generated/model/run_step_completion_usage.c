#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_completion_usage.h"



static run_step_completion_usage_t *run_step_completion_usage_create_internal(
    int completion_tokens,
    int prompt_tokens,
    int total_tokens
    ) {
    run_step_completion_usage_t *run_step_completion_usage_local_var = malloc(sizeof(run_step_completion_usage_t));
    if (!run_step_completion_usage_local_var) {
        return NULL;
    }
    run_step_completion_usage_local_var->completion_tokens = completion_tokens;
    run_step_completion_usage_local_var->prompt_tokens = prompt_tokens;
    run_step_completion_usage_local_var->total_tokens = total_tokens;

    run_step_completion_usage_local_var->_library_owned = 1;
    return run_step_completion_usage_local_var;
}

__attribute__((deprecated)) run_step_completion_usage_t *run_step_completion_usage_create(
    int completion_tokens,
    int prompt_tokens,
    int total_tokens
    ) {
    return run_step_completion_usage_create_internal (
        completion_tokens,
        prompt_tokens,
        total_tokens
        );
}

void run_step_completion_usage_free(run_step_completion_usage_t *run_step_completion_usage) {
    if(NULL == run_step_completion_usage){
        return ;
    }
    if(run_step_completion_usage->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_completion_usage_free");
        return ;
    }
    listEntry_t *listEntry;
    free(run_step_completion_usage);
}

cJSON *run_step_completion_usage_convertToJSON(run_step_completion_usage_t *run_step_completion_usage) {
    cJSON *item = cJSON_CreateObject();

    // run_step_completion_usage->completion_tokens
    if (!run_step_completion_usage->completion_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "completion_tokens", run_step_completion_usage->completion_tokens) == NULL) {
    goto fail; //Numeric
    }


    // run_step_completion_usage->prompt_tokens
    if (!run_step_completion_usage->prompt_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "prompt_tokens", run_step_completion_usage->prompt_tokens) == NULL) {
    goto fail; //Numeric
    }


    // run_step_completion_usage->total_tokens
    if (!run_step_completion_usage->total_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total_tokens", run_step_completion_usage->total_tokens) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_step_completion_usage_t *run_step_completion_usage_parseFromJSON(cJSON *run_step_completion_usageJSON){

    run_step_completion_usage_t *run_step_completion_usage_local_var = NULL;

    // run_step_completion_usage->completion_tokens
    cJSON *completion_tokens = cJSON_GetObjectItemCaseSensitive(run_step_completion_usageJSON, "completion_tokens");
    if (cJSON_IsNull(completion_tokens)) {
        completion_tokens = NULL;
    }
    if (!completion_tokens) {
        goto end;
    }

    
    if(!cJSON_IsNumber(completion_tokens))
    {
    goto end; //Numeric
    }

    // run_step_completion_usage->prompt_tokens
    cJSON *prompt_tokens = cJSON_GetObjectItemCaseSensitive(run_step_completion_usageJSON, "prompt_tokens");
    if (cJSON_IsNull(prompt_tokens)) {
        prompt_tokens = NULL;
    }
    if (!prompt_tokens) {
        goto end;
    }

    
    if(!cJSON_IsNumber(prompt_tokens))
    {
    goto end; //Numeric
    }

    // run_step_completion_usage->total_tokens
    cJSON *total_tokens = cJSON_GetObjectItemCaseSensitive(run_step_completion_usageJSON, "total_tokens");
    if (cJSON_IsNull(total_tokens)) {
        total_tokens = NULL;
    }
    if (!total_tokens) {
        goto end;
    }

    
    if(!cJSON_IsNumber(total_tokens))
    {
    goto end; //Numeric
    }


    run_step_completion_usage_local_var = run_step_completion_usage_create_internal (
        completion_tokens->valuedouble,
        prompt_tokens->valuedouble,
        total_tokens->valuedouble
        );

    return run_step_completion_usage_local_var;
end:
    return NULL;

}
