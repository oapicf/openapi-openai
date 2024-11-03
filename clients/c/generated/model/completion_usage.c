#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "completion_usage.h"



completion_usage_t *completion_usage_create(
    int completion_tokens,
    int prompt_tokens,
    int total_tokens
    ) {
    completion_usage_t *completion_usage_local_var = malloc(sizeof(completion_usage_t));
    if (!completion_usage_local_var) {
        return NULL;
    }
    completion_usage_local_var->completion_tokens = completion_tokens;
    completion_usage_local_var->prompt_tokens = prompt_tokens;
    completion_usage_local_var->total_tokens = total_tokens;

    return completion_usage_local_var;
}


void completion_usage_free(completion_usage_t *completion_usage) {
    if(NULL == completion_usage){
        return ;
    }
    listEntry_t *listEntry;
    free(completion_usage);
}

cJSON *completion_usage_convertToJSON(completion_usage_t *completion_usage) {
    cJSON *item = cJSON_CreateObject();

    // completion_usage->completion_tokens
    if (!completion_usage->completion_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "completion_tokens", completion_usage->completion_tokens) == NULL) {
    goto fail; //Numeric
    }


    // completion_usage->prompt_tokens
    if (!completion_usage->prompt_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "prompt_tokens", completion_usage->prompt_tokens) == NULL) {
    goto fail; //Numeric
    }


    // completion_usage->total_tokens
    if (!completion_usage->total_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total_tokens", completion_usage->total_tokens) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

completion_usage_t *completion_usage_parseFromJSON(cJSON *completion_usageJSON){

    completion_usage_t *completion_usage_local_var = NULL;

    // completion_usage->completion_tokens
    cJSON *completion_tokens = cJSON_GetObjectItemCaseSensitive(completion_usageJSON, "completion_tokens");
    if (!completion_tokens) {
        goto end;
    }

    
    if(!cJSON_IsNumber(completion_tokens))
    {
    goto end; //Numeric
    }

    // completion_usage->prompt_tokens
    cJSON *prompt_tokens = cJSON_GetObjectItemCaseSensitive(completion_usageJSON, "prompt_tokens");
    if (!prompt_tokens) {
        goto end;
    }

    
    if(!cJSON_IsNumber(prompt_tokens))
    {
    goto end; //Numeric
    }

    // completion_usage->total_tokens
    cJSON *total_tokens = cJSON_GetObjectItemCaseSensitive(completion_usageJSON, "total_tokens");
    if (!total_tokens) {
        goto end;
    }

    
    if(!cJSON_IsNumber(total_tokens))
    {
    goto end; //Numeric
    }


    completion_usage_local_var = completion_usage_create (
        completion_tokens->valuedouble,
        prompt_tokens->valuedouble,
        total_tokens->valuedouble
        );

    return completion_usage_local_var;
end:
    return NULL;

}
