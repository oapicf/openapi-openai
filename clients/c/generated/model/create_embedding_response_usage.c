#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_embedding_response_usage.h"



create_embedding_response_usage_t *create_embedding_response_usage_create(
    int prompt_tokens,
    int total_tokens
    ) {
    create_embedding_response_usage_t *create_embedding_response_usage_local_var = malloc(sizeof(create_embedding_response_usage_t));
    if (!create_embedding_response_usage_local_var) {
        return NULL;
    }
    create_embedding_response_usage_local_var->prompt_tokens = prompt_tokens;
    create_embedding_response_usage_local_var->total_tokens = total_tokens;

    return create_embedding_response_usage_local_var;
}


void create_embedding_response_usage_free(create_embedding_response_usage_t *create_embedding_response_usage) {
    if(NULL == create_embedding_response_usage){
        return ;
    }
    listEntry_t *listEntry;
    free(create_embedding_response_usage);
}

cJSON *create_embedding_response_usage_convertToJSON(create_embedding_response_usage_t *create_embedding_response_usage) {
    cJSON *item = cJSON_CreateObject();

    // create_embedding_response_usage->prompt_tokens
    if (!create_embedding_response_usage->prompt_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "prompt_tokens", create_embedding_response_usage->prompt_tokens) == NULL) {
    goto fail; //Numeric
    }


    // create_embedding_response_usage->total_tokens
    if (!create_embedding_response_usage->total_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total_tokens", create_embedding_response_usage->total_tokens) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_embedding_response_usage_t *create_embedding_response_usage_parseFromJSON(cJSON *create_embedding_response_usageJSON){

    create_embedding_response_usage_t *create_embedding_response_usage_local_var = NULL;

    // create_embedding_response_usage->prompt_tokens
    cJSON *prompt_tokens = cJSON_GetObjectItemCaseSensitive(create_embedding_response_usageJSON, "prompt_tokens");
    if (!prompt_tokens) {
        goto end;
    }

    
    if(!cJSON_IsNumber(prompt_tokens))
    {
    goto end; //Numeric
    }

    // create_embedding_response_usage->total_tokens
    cJSON *total_tokens = cJSON_GetObjectItemCaseSensitive(create_embedding_response_usageJSON, "total_tokens");
    if (!total_tokens) {
        goto end;
    }

    
    if(!cJSON_IsNumber(total_tokens))
    {
    goto end; //Numeric
    }


    create_embedding_response_usage_local_var = create_embedding_response_usage_create (
        prompt_tokens->valuedouble,
        total_tokens->valuedouble
        );

    return create_embedding_response_usage_local_var;
end:
    return NULL;

}
