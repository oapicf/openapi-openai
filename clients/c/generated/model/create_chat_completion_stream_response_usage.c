#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_chat_completion_stream_response_usage.h"



static create_chat_completion_stream_response_usage_t *create_chat_completion_stream_response_usage_create_internal(
    int *completion_tokens,
    int *prompt_tokens,
    int *total_tokens
    ) {
    create_chat_completion_stream_response_usage_t *create_chat_completion_stream_response_usage_local_var = malloc(sizeof(create_chat_completion_stream_response_usage_t));
    if (!create_chat_completion_stream_response_usage_local_var) {
        return NULL;
    }
    memset(create_chat_completion_stream_response_usage_local_var, 0, sizeof(create_chat_completion_stream_response_usage_t));
    create_chat_completion_stream_response_usage_local_var->_library_owned = 1;
    create_chat_completion_stream_response_usage_local_var->completion_tokens = completion_tokens;
    create_chat_completion_stream_response_usage_local_var->prompt_tokens = prompt_tokens;
    create_chat_completion_stream_response_usage_local_var->total_tokens = total_tokens;
    return create_chat_completion_stream_response_usage_local_var;
}

__attribute__((deprecated)) create_chat_completion_stream_response_usage_t *create_chat_completion_stream_response_usage_create(
    int *completion_tokens,
    int *prompt_tokens,
    int *total_tokens
    ) {
    int *completion_tokens_copy = NULL;
    if (completion_tokens) {
        completion_tokens_copy = malloc(sizeof(int));
        if (completion_tokens_copy) *completion_tokens_copy = *completion_tokens;
    }
    int *prompt_tokens_copy = NULL;
    if (prompt_tokens) {
        prompt_tokens_copy = malloc(sizeof(int));
        if (prompt_tokens_copy) *prompt_tokens_copy = *prompt_tokens;
    }
    int *total_tokens_copy = NULL;
    if (total_tokens) {
        total_tokens_copy = malloc(sizeof(int));
        if (total_tokens_copy) *total_tokens_copy = *total_tokens;
    }
    create_chat_completion_stream_response_usage_t *result = create_chat_completion_stream_response_usage_create_internal (
        completion_tokens_copy,
        prompt_tokens_copy,
        total_tokens_copy
        );
    if (!result) {
        free(completion_tokens_copy);
        free(prompt_tokens_copy);
        free(total_tokens_copy);
    }
    return result;
}

void create_chat_completion_stream_response_usage_free(create_chat_completion_stream_response_usage_t *create_chat_completion_stream_response_usage) {
    if(NULL == create_chat_completion_stream_response_usage){
        return ;
    }
    if(create_chat_completion_stream_response_usage->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_chat_completion_stream_response_usage_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_chat_completion_stream_response_usage->completion_tokens) {
        free(create_chat_completion_stream_response_usage->completion_tokens);
        create_chat_completion_stream_response_usage->completion_tokens = NULL;
    }
    if (create_chat_completion_stream_response_usage->prompt_tokens) {
        free(create_chat_completion_stream_response_usage->prompt_tokens);
        create_chat_completion_stream_response_usage->prompt_tokens = NULL;
    }
    if (create_chat_completion_stream_response_usage->total_tokens) {
        free(create_chat_completion_stream_response_usage->total_tokens);
        create_chat_completion_stream_response_usage->total_tokens = NULL;
    }
    free(create_chat_completion_stream_response_usage);
}

cJSON *create_chat_completion_stream_response_usage_convertToJSON(create_chat_completion_stream_response_usage_t *create_chat_completion_stream_response_usage) {
    cJSON *item = cJSON_CreateObject();

    // create_chat_completion_stream_response_usage->completion_tokens
    if (!create_chat_completion_stream_response_usage->completion_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "completion_tokens", *create_chat_completion_stream_response_usage->completion_tokens) == NULL) {
    goto fail; //Numeric
    }


    // create_chat_completion_stream_response_usage->prompt_tokens
    if (!create_chat_completion_stream_response_usage->prompt_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "prompt_tokens", *create_chat_completion_stream_response_usage->prompt_tokens) == NULL) {
    goto fail; //Numeric
    }


    // create_chat_completion_stream_response_usage->total_tokens
    if (!create_chat_completion_stream_response_usage->total_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total_tokens", *create_chat_completion_stream_response_usage->total_tokens) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_chat_completion_stream_response_usage_t *create_chat_completion_stream_response_usage_parseFromJSON(cJSON *create_chat_completion_stream_response_usageJSON){

    create_chat_completion_stream_response_usage_t *create_chat_completion_stream_response_usage_local_var = NULL;

    // define the local variable for create_chat_completion_stream_response_usage->completion_tokens
    int *completion_tokens_local_var = NULL;

    // define the local variable for create_chat_completion_stream_response_usage->prompt_tokens
    int *prompt_tokens_local_var = NULL;

    // define the local variable for create_chat_completion_stream_response_usage->total_tokens
    int *total_tokens_local_var = NULL;

    // create_chat_completion_stream_response_usage->completion_tokens
    cJSON *completion_tokens = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_response_usageJSON, "completion_tokens");
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
    completion_tokens_local_var = malloc(sizeof(int));
    if(!completion_tokens_local_var)
    {
        goto end;
    }
    *completion_tokens_local_var = completion_tokens->valuedouble;

    // create_chat_completion_stream_response_usage->prompt_tokens
    cJSON *prompt_tokens = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_response_usageJSON, "prompt_tokens");
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
    prompt_tokens_local_var = malloc(sizeof(int));
    if(!prompt_tokens_local_var)
    {
        goto end;
    }
    *prompt_tokens_local_var = prompt_tokens->valuedouble;

    // create_chat_completion_stream_response_usage->total_tokens
    cJSON *total_tokens = cJSON_GetObjectItemCaseSensitive(create_chat_completion_stream_response_usageJSON, "total_tokens");
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
    total_tokens_local_var = malloc(sizeof(int));
    if(!total_tokens_local_var)
    {
        goto end;
    }
    *total_tokens_local_var = total_tokens->valuedouble;



    create_chat_completion_stream_response_usage_local_var = create_chat_completion_stream_response_usage_create_internal (
        completion_tokens_local_var,
        prompt_tokens_local_var,
        total_tokens_local_var
        );

    if (!create_chat_completion_stream_response_usage_local_var) {
        goto end;
    }

    return create_chat_completion_stream_response_usage_local_var;
end:
    if (completion_tokens_local_var) {
        free(completion_tokens_local_var);
        completion_tokens_local_var = NULL;
    }
    if (prompt_tokens_local_var) {
        free(prompt_tokens_local_var);
        prompt_tokens_local_var = NULL;
    }
    if (total_tokens_local_var) {
        free(total_tokens_local_var);
        total_tokens_local_var = NULL;
    }
    return NULL;

}
