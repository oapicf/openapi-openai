#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "completion_usage_completion_tokens_details.h"



static completion_usage_completion_tokens_details_t *completion_usage_completion_tokens_details_create_internal(
    int *accepted_prediction_tokens,
    int *audio_tokens,
    int *reasoning_tokens,
    int *rejected_prediction_tokens
    ) {
    completion_usage_completion_tokens_details_t *completion_usage_completion_tokens_details_local_var = malloc(sizeof(completion_usage_completion_tokens_details_t));
    if (!completion_usage_completion_tokens_details_local_var) {
        return NULL;
    }
    memset(completion_usage_completion_tokens_details_local_var, 0, sizeof(completion_usage_completion_tokens_details_t));
    completion_usage_completion_tokens_details_local_var->_library_owned = 1;
    completion_usage_completion_tokens_details_local_var->accepted_prediction_tokens = accepted_prediction_tokens;
    completion_usage_completion_tokens_details_local_var->audio_tokens = audio_tokens;
    completion_usage_completion_tokens_details_local_var->reasoning_tokens = reasoning_tokens;
    completion_usage_completion_tokens_details_local_var->rejected_prediction_tokens = rejected_prediction_tokens;
    return completion_usage_completion_tokens_details_local_var;
}

__attribute__((deprecated)) completion_usage_completion_tokens_details_t *completion_usage_completion_tokens_details_create(
    int *accepted_prediction_tokens,
    int *audio_tokens,
    int *reasoning_tokens,
    int *rejected_prediction_tokens
    ) {
    int *accepted_prediction_tokens_copy = NULL;
    if (accepted_prediction_tokens) {
        accepted_prediction_tokens_copy = malloc(sizeof(int));
        if (accepted_prediction_tokens_copy) *accepted_prediction_tokens_copy = *accepted_prediction_tokens;
    }
    int *audio_tokens_copy = NULL;
    if (audio_tokens) {
        audio_tokens_copy = malloc(sizeof(int));
        if (audio_tokens_copy) *audio_tokens_copy = *audio_tokens;
    }
    int *reasoning_tokens_copy = NULL;
    if (reasoning_tokens) {
        reasoning_tokens_copy = malloc(sizeof(int));
        if (reasoning_tokens_copy) *reasoning_tokens_copy = *reasoning_tokens;
    }
    int *rejected_prediction_tokens_copy = NULL;
    if (rejected_prediction_tokens) {
        rejected_prediction_tokens_copy = malloc(sizeof(int));
        if (rejected_prediction_tokens_copy) *rejected_prediction_tokens_copy = *rejected_prediction_tokens;
    }
    completion_usage_completion_tokens_details_t *result = completion_usage_completion_tokens_details_create_internal (
        accepted_prediction_tokens_copy,
        audio_tokens_copy,
        reasoning_tokens_copy,
        rejected_prediction_tokens_copy
        );
    if (!result) {
        free(accepted_prediction_tokens_copy);
        free(audio_tokens_copy);
        free(reasoning_tokens_copy);
        free(rejected_prediction_tokens_copy);
    }
    return result;
}

void completion_usage_completion_tokens_details_free(completion_usage_completion_tokens_details_t *completion_usage_completion_tokens_details) {
    if(NULL == completion_usage_completion_tokens_details){
        return ;
    }
    if(completion_usage_completion_tokens_details->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "completion_usage_completion_tokens_details_free");
        return ;
    }
    listEntry_t *listEntry;
    if (completion_usage_completion_tokens_details->accepted_prediction_tokens) {
        free(completion_usage_completion_tokens_details->accepted_prediction_tokens);
        completion_usage_completion_tokens_details->accepted_prediction_tokens = NULL;
    }
    if (completion_usage_completion_tokens_details->audio_tokens) {
        free(completion_usage_completion_tokens_details->audio_tokens);
        completion_usage_completion_tokens_details->audio_tokens = NULL;
    }
    if (completion_usage_completion_tokens_details->reasoning_tokens) {
        free(completion_usage_completion_tokens_details->reasoning_tokens);
        completion_usage_completion_tokens_details->reasoning_tokens = NULL;
    }
    if (completion_usage_completion_tokens_details->rejected_prediction_tokens) {
        free(completion_usage_completion_tokens_details->rejected_prediction_tokens);
        completion_usage_completion_tokens_details->rejected_prediction_tokens = NULL;
    }
    free(completion_usage_completion_tokens_details);
}

cJSON *completion_usage_completion_tokens_details_convertToJSON(completion_usage_completion_tokens_details_t *completion_usage_completion_tokens_details) {
    cJSON *item = cJSON_CreateObject();

    // completion_usage_completion_tokens_details->accepted_prediction_tokens
    if(completion_usage_completion_tokens_details->accepted_prediction_tokens) {
    if(cJSON_AddNumberToObject(item, "accepted_prediction_tokens", *completion_usage_completion_tokens_details->accepted_prediction_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // completion_usage_completion_tokens_details->audio_tokens
    if(completion_usage_completion_tokens_details->audio_tokens) {
    if(cJSON_AddNumberToObject(item, "audio_tokens", *completion_usage_completion_tokens_details->audio_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // completion_usage_completion_tokens_details->reasoning_tokens
    if(completion_usage_completion_tokens_details->reasoning_tokens) {
    if(cJSON_AddNumberToObject(item, "reasoning_tokens", *completion_usage_completion_tokens_details->reasoning_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // completion_usage_completion_tokens_details->rejected_prediction_tokens
    if(completion_usage_completion_tokens_details->rejected_prediction_tokens) {
    if(cJSON_AddNumberToObject(item, "rejected_prediction_tokens", *completion_usage_completion_tokens_details->rejected_prediction_tokens) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

completion_usage_completion_tokens_details_t *completion_usage_completion_tokens_details_parseFromJSON(cJSON *completion_usage_completion_tokens_detailsJSON){

    completion_usage_completion_tokens_details_t *completion_usage_completion_tokens_details_local_var = NULL;

    // define the local variable for completion_usage_completion_tokens_details->accepted_prediction_tokens
    int *accepted_prediction_tokens_local_var = NULL;

    // define the local variable for completion_usage_completion_tokens_details->audio_tokens
    int *audio_tokens_local_var = NULL;

    // define the local variable for completion_usage_completion_tokens_details->reasoning_tokens
    int *reasoning_tokens_local_var = NULL;

    // define the local variable for completion_usage_completion_tokens_details->rejected_prediction_tokens
    int *rejected_prediction_tokens_local_var = NULL;

    // completion_usage_completion_tokens_details->accepted_prediction_tokens
    cJSON *accepted_prediction_tokens = cJSON_GetObjectItemCaseSensitive(completion_usage_completion_tokens_detailsJSON, "accepted_prediction_tokens");
    if (cJSON_IsNull(accepted_prediction_tokens)) {
        accepted_prediction_tokens = NULL;
    }
    if (accepted_prediction_tokens) { 
    if(!cJSON_IsNumber(accepted_prediction_tokens))
    {
    goto end; //Numeric
    }
    accepted_prediction_tokens_local_var = malloc(sizeof(int));
    if(!accepted_prediction_tokens_local_var)
    {
        goto end;
    }
    *accepted_prediction_tokens_local_var = accepted_prediction_tokens->valuedouble;
    }

    // completion_usage_completion_tokens_details->audio_tokens
    cJSON *audio_tokens = cJSON_GetObjectItemCaseSensitive(completion_usage_completion_tokens_detailsJSON, "audio_tokens");
    if (cJSON_IsNull(audio_tokens)) {
        audio_tokens = NULL;
    }
    if (audio_tokens) { 
    if(!cJSON_IsNumber(audio_tokens))
    {
    goto end; //Numeric
    }
    audio_tokens_local_var = malloc(sizeof(int));
    if(!audio_tokens_local_var)
    {
        goto end;
    }
    *audio_tokens_local_var = audio_tokens->valuedouble;
    }

    // completion_usage_completion_tokens_details->reasoning_tokens
    cJSON *reasoning_tokens = cJSON_GetObjectItemCaseSensitive(completion_usage_completion_tokens_detailsJSON, "reasoning_tokens");
    if (cJSON_IsNull(reasoning_tokens)) {
        reasoning_tokens = NULL;
    }
    if (reasoning_tokens) { 
    if(!cJSON_IsNumber(reasoning_tokens))
    {
    goto end; //Numeric
    }
    reasoning_tokens_local_var = malloc(sizeof(int));
    if(!reasoning_tokens_local_var)
    {
        goto end;
    }
    *reasoning_tokens_local_var = reasoning_tokens->valuedouble;
    }

    // completion_usage_completion_tokens_details->rejected_prediction_tokens
    cJSON *rejected_prediction_tokens = cJSON_GetObjectItemCaseSensitive(completion_usage_completion_tokens_detailsJSON, "rejected_prediction_tokens");
    if (cJSON_IsNull(rejected_prediction_tokens)) {
        rejected_prediction_tokens = NULL;
    }
    if (rejected_prediction_tokens) { 
    if(!cJSON_IsNumber(rejected_prediction_tokens))
    {
    goto end; //Numeric
    }
    rejected_prediction_tokens_local_var = malloc(sizeof(int));
    if(!rejected_prediction_tokens_local_var)
    {
        goto end;
    }
    *rejected_prediction_tokens_local_var = rejected_prediction_tokens->valuedouble;
    }



    completion_usage_completion_tokens_details_local_var = completion_usage_completion_tokens_details_create_internal (
        accepted_prediction_tokens_local_var,
        audio_tokens_local_var,
        reasoning_tokens_local_var,
        rejected_prediction_tokens_local_var
        );

    if (!completion_usage_completion_tokens_details_local_var) {
        goto end;
    }

    return completion_usage_completion_tokens_details_local_var;
end:
    if (accepted_prediction_tokens_local_var) {
        free(accepted_prediction_tokens_local_var);
        accepted_prediction_tokens_local_var = NULL;
    }
    if (audio_tokens_local_var) {
        free(audio_tokens_local_var);
        audio_tokens_local_var = NULL;
    }
    if (reasoning_tokens_local_var) {
        free(reasoning_tokens_local_var);
        reasoning_tokens_local_var = NULL;
    }
    if (rejected_prediction_tokens_local_var) {
        free(rejected_prediction_tokens_local_var);
        rejected_prediction_tokens_local_var = NULL;
    }
    return NULL;

}
