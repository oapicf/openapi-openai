#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_response_usage.h"



static realtime_response_usage_t *realtime_response_usage_create_internal(
    int *total_tokens,
    int *input_tokens,
    int *output_tokens,
    realtime_response_usage_input_token_details_t *input_token_details,
    realtime_response_usage_output_token_details_t *output_token_details
    ) {
    realtime_response_usage_t *realtime_response_usage_local_var = malloc(sizeof(realtime_response_usage_t));
    if (!realtime_response_usage_local_var) {
        return NULL;
    }
    memset(realtime_response_usage_local_var, 0, sizeof(realtime_response_usage_t));
    realtime_response_usage_local_var->_library_owned = 1;
    realtime_response_usage_local_var->total_tokens = total_tokens;
    realtime_response_usage_local_var->input_tokens = input_tokens;
    realtime_response_usage_local_var->output_tokens = output_tokens;
    realtime_response_usage_local_var->input_token_details = input_token_details;
    realtime_response_usage_local_var->output_token_details = output_token_details;
    return realtime_response_usage_local_var;
}

__attribute__((deprecated)) realtime_response_usage_t *realtime_response_usage_create(
    int *total_tokens,
    int *input_tokens,
    int *output_tokens,
    realtime_response_usage_input_token_details_t *input_token_details,
    realtime_response_usage_output_token_details_t *output_token_details
    ) {
    int *total_tokens_copy = NULL;
    if (total_tokens) {
        total_tokens_copy = malloc(sizeof(int));
        if (total_tokens_copy) *total_tokens_copy = *total_tokens;
    }
    int *input_tokens_copy = NULL;
    if (input_tokens) {
        input_tokens_copy = malloc(sizeof(int));
        if (input_tokens_copy) *input_tokens_copy = *input_tokens;
    }
    int *output_tokens_copy = NULL;
    if (output_tokens) {
        output_tokens_copy = malloc(sizeof(int));
        if (output_tokens_copy) *output_tokens_copy = *output_tokens;
    }
    realtime_response_usage_t *result = realtime_response_usage_create_internal (
        total_tokens_copy,
        input_tokens_copy,
        output_tokens_copy,
        input_token_details,
        output_token_details
        );
    if (!result) {
        free(total_tokens_copy);
        free(input_tokens_copy);
        free(output_tokens_copy);
    }
    return result;
}

void realtime_response_usage_free(realtime_response_usage_t *realtime_response_usage) {
    if(NULL == realtime_response_usage){
        return ;
    }
    if(realtime_response_usage->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_response_usage_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_response_usage->total_tokens) {
        free(realtime_response_usage->total_tokens);
        realtime_response_usage->total_tokens = NULL;
    }
    if (realtime_response_usage->input_tokens) {
        free(realtime_response_usage->input_tokens);
        realtime_response_usage->input_tokens = NULL;
    }
    if (realtime_response_usage->output_tokens) {
        free(realtime_response_usage->output_tokens);
        realtime_response_usage->output_tokens = NULL;
    }
    if (realtime_response_usage->input_token_details) {
        realtime_response_usage_input_token_details_free(realtime_response_usage->input_token_details);
        realtime_response_usage->input_token_details = NULL;
    }
    if (realtime_response_usage->output_token_details) {
        realtime_response_usage_output_token_details_free(realtime_response_usage->output_token_details);
        realtime_response_usage->output_token_details = NULL;
    }
    free(realtime_response_usage);
}

cJSON *realtime_response_usage_convertToJSON(realtime_response_usage_t *realtime_response_usage) {
    cJSON *item = cJSON_CreateObject();

    // realtime_response_usage->total_tokens
    if(realtime_response_usage->total_tokens) {
    if(cJSON_AddNumberToObject(item, "total_tokens", *realtime_response_usage->total_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_response_usage->input_tokens
    if(realtime_response_usage->input_tokens) {
    if(cJSON_AddNumberToObject(item, "input_tokens", *realtime_response_usage->input_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_response_usage->output_tokens
    if(realtime_response_usage->output_tokens) {
    if(cJSON_AddNumberToObject(item, "output_tokens", *realtime_response_usage->output_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_response_usage->input_token_details
    if(realtime_response_usage->input_token_details) {
    cJSON *input_token_details_local_JSON = realtime_response_usage_input_token_details_convertToJSON(realtime_response_usage->input_token_details);
    if(input_token_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "input_token_details", input_token_details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // realtime_response_usage->output_token_details
    if(realtime_response_usage->output_token_details) {
    cJSON *output_token_details_local_JSON = realtime_response_usage_output_token_details_convertToJSON(realtime_response_usage->output_token_details);
    if(output_token_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "output_token_details", output_token_details_local_JSON);
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

realtime_response_usage_t *realtime_response_usage_parseFromJSON(cJSON *realtime_response_usageJSON){

    realtime_response_usage_t *realtime_response_usage_local_var = NULL;

    // define the local variable for realtime_response_usage->total_tokens
    int *total_tokens_local_var = NULL;

    // define the local variable for realtime_response_usage->input_tokens
    int *input_tokens_local_var = NULL;

    // define the local variable for realtime_response_usage->output_tokens
    int *output_tokens_local_var = NULL;

    // define the local variable for realtime_response_usage->input_token_details
    realtime_response_usage_input_token_details_t *input_token_details_local_nonprim = NULL;

    // define the local variable for realtime_response_usage->output_token_details
    realtime_response_usage_output_token_details_t *output_token_details_local_nonprim = NULL;

    // realtime_response_usage->total_tokens
    cJSON *total_tokens = cJSON_GetObjectItemCaseSensitive(realtime_response_usageJSON, "total_tokens");
    if (cJSON_IsNull(total_tokens)) {
        total_tokens = NULL;
    }
    if (total_tokens) { 
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
    }

    // realtime_response_usage->input_tokens
    cJSON *input_tokens = cJSON_GetObjectItemCaseSensitive(realtime_response_usageJSON, "input_tokens");
    if (cJSON_IsNull(input_tokens)) {
        input_tokens = NULL;
    }
    if (input_tokens) { 
    if(!cJSON_IsNumber(input_tokens))
    {
    goto end; //Numeric
    }
    input_tokens_local_var = malloc(sizeof(int));
    if(!input_tokens_local_var)
    {
        goto end;
    }
    *input_tokens_local_var = input_tokens->valuedouble;
    }

    // realtime_response_usage->output_tokens
    cJSON *output_tokens = cJSON_GetObjectItemCaseSensitive(realtime_response_usageJSON, "output_tokens");
    if (cJSON_IsNull(output_tokens)) {
        output_tokens = NULL;
    }
    if (output_tokens) { 
    if(!cJSON_IsNumber(output_tokens))
    {
    goto end; //Numeric
    }
    output_tokens_local_var = malloc(sizeof(int));
    if(!output_tokens_local_var)
    {
        goto end;
    }
    *output_tokens_local_var = output_tokens->valuedouble;
    }

    // realtime_response_usage->input_token_details
    cJSON *input_token_details = cJSON_GetObjectItemCaseSensitive(realtime_response_usageJSON, "input_token_details");
    if (cJSON_IsNull(input_token_details)) {
        input_token_details = NULL;
    }
    if (input_token_details) { 
    input_token_details_local_nonprim = realtime_response_usage_input_token_details_parseFromJSON(input_token_details); //nonprimitive
    }

    // realtime_response_usage->output_token_details
    cJSON *output_token_details = cJSON_GetObjectItemCaseSensitive(realtime_response_usageJSON, "output_token_details");
    if (cJSON_IsNull(output_token_details)) {
        output_token_details = NULL;
    }
    if (output_token_details) { 
    output_token_details_local_nonprim = realtime_response_usage_output_token_details_parseFromJSON(output_token_details); //nonprimitive
    }



    realtime_response_usage_local_var = realtime_response_usage_create_internal (
        total_tokens_local_var,
        input_tokens_local_var,
        output_tokens_local_var,
        input_token_details ? input_token_details_local_nonprim : NULL,
        output_token_details ? output_token_details_local_nonprim : NULL
        );

    if (!realtime_response_usage_local_var) {
        goto end;
    }

    return realtime_response_usage_local_var;
end:
    if (total_tokens_local_var) {
        free(total_tokens_local_var);
        total_tokens_local_var = NULL;
    }
    if (input_tokens_local_var) {
        free(input_tokens_local_var);
        input_tokens_local_var = NULL;
    }
    if (output_tokens_local_var) {
        free(output_tokens_local_var);
        output_tokens_local_var = NULL;
    }
    if (input_token_details_local_nonprim) {
        realtime_response_usage_input_token_details_free(input_token_details_local_nonprim);
        input_token_details_local_nonprim = NULL;
    }
    if (output_token_details_local_nonprim) {
        realtime_response_usage_output_token_details_free(output_token_details_local_nonprim);
        output_token_details_local_nonprim = NULL;
    }
    return NULL;

}
