#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "completion_usage.h"



static completion_usage_t *completion_usage_create_internal(
    int *completion_tokens,
    int *prompt_tokens,
    int *total_tokens,
    completion_usage_completion_tokens_details_t *completion_tokens_details,
    completion_usage_prompt_tokens_details_t *prompt_tokens_details
    ) {
    completion_usage_t *completion_usage_local_var = malloc(sizeof(completion_usage_t));
    if (!completion_usage_local_var) {
        return NULL;
    }
    memset(completion_usage_local_var, 0, sizeof(completion_usage_t));
    completion_usage_local_var->_library_owned = 1;
    completion_usage_local_var->completion_tokens = completion_tokens;
    completion_usage_local_var->prompt_tokens = prompt_tokens;
    completion_usage_local_var->total_tokens = total_tokens;
    completion_usage_local_var->completion_tokens_details = completion_tokens_details;
    completion_usage_local_var->prompt_tokens_details = prompt_tokens_details;
    return completion_usage_local_var;
}

__attribute__((deprecated)) completion_usage_t *completion_usage_create(
    int *completion_tokens,
    int *prompt_tokens,
    int *total_tokens,
    completion_usage_completion_tokens_details_t *completion_tokens_details,
    completion_usage_prompt_tokens_details_t *prompt_tokens_details
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
    completion_usage_t *result = completion_usage_create_internal (
        completion_tokens_copy,
        prompt_tokens_copy,
        total_tokens_copy,
        completion_tokens_details,
        prompt_tokens_details
        );
    if (!result) {
        free(completion_tokens_copy);
        free(prompt_tokens_copy);
        free(total_tokens_copy);
    }
    return result;
}

void completion_usage_free(completion_usage_t *completion_usage) {
    if(NULL == completion_usage){
        return ;
    }
    if(completion_usage->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "completion_usage_free");
        return ;
    }
    listEntry_t *listEntry;
    if (completion_usage->completion_tokens) {
        free(completion_usage->completion_tokens);
        completion_usage->completion_tokens = NULL;
    }
    if (completion_usage->prompt_tokens) {
        free(completion_usage->prompt_tokens);
        completion_usage->prompt_tokens = NULL;
    }
    if (completion_usage->total_tokens) {
        free(completion_usage->total_tokens);
        completion_usage->total_tokens = NULL;
    }
    if (completion_usage->completion_tokens_details) {
        completion_usage_completion_tokens_details_free(completion_usage->completion_tokens_details);
        completion_usage->completion_tokens_details = NULL;
    }
    if (completion_usage->prompt_tokens_details) {
        completion_usage_prompt_tokens_details_free(completion_usage->prompt_tokens_details);
        completion_usage->prompt_tokens_details = NULL;
    }
    free(completion_usage);
}

cJSON *completion_usage_convertToJSON(completion_usage_t *completion_usage) {
    cJSON *item = cJSON_CreateObject();

    // completion_usage->completion_tokens
    if (!completion_usage->completion_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "completion_tokens", *completion_usage->completion_tokens) == NULL) {
    goto fail; //Numeric
    }


    // completion_usage->prompt_tokens
    if (!completion_usage->prompt_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "prompt_tokens", *completion_usage->prompt_tokens) == NULL) {
    goto fail; //Numeric
    }


    // completion_usage->total_tokens
    if (!completion_usage->total_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total_tokens", *completion_usage->total_tokens) == NULL) {
    goto fail; //Numeric
    }


    // completion_usage->completion_tokens_details
    if(completion_usage->completion_tokens_details) {
    cJSON *completion_tokens_details_local_JSON = completion_usage_completion_tokens_details_convertToJSON(completion_usage->completion_tokens_details);
    if(completion_tokens_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "completion_tokens_details", completion_tokens_details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // completion_usage->prompt_tokens_details
    if(completion_usage->prompt_tokens_details) {
    cJSON *prompt_tokens_details_local_JSON = completion_usage_prompt_tokens_details_convertToJSON(completion_usage->prompt_tokens_details);
    if(prompt_tokens_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "prompt_tokens_details", prompt_tokens_details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
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

    // define the local variable for completion_usage->completion_tokens
    int *completion_tokens_local_var = NULL;

    // define the local variable for completion_usage->prompt_tokens
    int *prompt_tokens_local_var = NULL;

    // define the local variable for completion_usage->total_tokens
    int *total_tokens_local_var = NULL;

    // define the local variable for completion_usage->completion_tokens_details
    completion_usage_completion_tokens_details_t *completion_tokens_details_local_nonprim = NULL;

    // define the local variable for completion_usage->prompt_tokens_details
    completion_usage_prompt_tokens_details_t *prompt_tokens_details_local_nonprim = NULL;

    // completion_usage->completion_tokens
    cJSON *completion_tokens = cJSON_GetObjectItemCaseSensitive(completion_usageJSON, "completion_tokens");
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

    // completion_usage->prompt_tokens
    cJSON *prompt_tokens = cJSON_GetObjectItemCaseSensitive(completion_usageJSON, "prompt_tokens");
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

    // completion_usage->total_tokens
    cJSON *total_tokens = cJSON_GetObjectItemCaseSensitive(completion_usageJSON, "total_tokens");
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

    // completion_usage->completion_tokens_details
    cJSON *completion_tokens_details = cJSON_GetObjectItemCaseSensitive(completion_usageJSON, "completion_tokens_details");
    if (cJSON_IsNull(completion_tokens_details)) {
        completion_tokens_details = NULL;
    }
    if (completion_tokens_details) { 
    completion_tokens_details_local_nonprim = completion_usage_completion_tokens_details_parseFromJSON(completion_tokens_details); //nonprimitive
    }

    // completion_usage->prompt_tokens_details
    cJSON *prompt_tokens_details = cJSON_GetObjectItemCaseSensitive(completion_usageJSON, "prompt_tokens_details");
    if (cJSON_IsNull(prompt_tokens_details)) {
        prompt_tokens_details = NULL;
    }
    if (prompt_tokens_details) { 
    prompt_tokens_details_local_nonprim = completion_usage_prompt_tokens_details_parseFromJSON(prompt_tokens_details); //nonprimitive
    }



    completion_usage_local_var = completion_usage_create_internal (
        completion_tokens_local_var,
        prompt_tokens_local_var,
        total_tokens_local_var,
        completion_tokens_details ? completion_tokens_details_local_nonprim : NULL,
        prompt_tokens_details ? prompt_tokens_details_local_nonprim : NULL
        );

    if (!completion_usage_local_var) {
        goto end;
    }

    return completion_usage_local_var;
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
    if (completion_tokens_details_local_nonprim) {
        completion_usage_completion_tokens_details_free(completion_tokens_details_local_nonprim);
        completion_tokens_details_local_nonprim = NULL;
    }
    if (prompt_tokens_details_local_nonprim) {
        completion_usage_prompt_tokens_details_free(prompt_tokens_details_local_nonprim);
        prompt_tokens_details_local_nonprim = NULL;
    }
    return NULL;

}
