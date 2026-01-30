#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "completion_usage_completion_tokens_details.h"



static completion_usage_completion_tokens_details_t *completion_usage_completion_tokens_details_create_internal(
    int accepted_prediction_tokens,
    int audio_tokens,
    int reasoning_tokens,
    int rejected_prediction_tokens
    ) {
    completion_usage_completion_tokens_details_t *completion_usage_completion_tokens_details_local_var = malloc(sizeof(completion_usage_completion_tokens_details_t));
    if (!completion_usage_completion_tokens_details_local_var) {
        return NULL;
    }
    completion_usage_completion_tokens_details_local_var->accepted_prediction_tokens = accepted_prediction_tokens;
    completion_usage_completion_tokens_details_local_var->audio_tokens = audio_tokens;
    completion_usage_completion_tokens_details_local_var->reasoning_tokens = reasoning_tokens;
    completion_usage_completion_tokens_details_local_var->rejected_prediction_tokens = rejected_prediction_tokens;

    completion_usage_completion_tokens_details_local_var->_library_owned = 1;
    return completion_usage_completion_tokens_details_local_var;
}

__attribute__((deprecated)) completion_usage_completion_tokens_details_t *completion_usage_completion_tokens_details_create(
    int accepted_prediction_tokens,
    int audio_tokens,
    int reasoning_tokens,
    int rejected_prediction_tokens
    ) {
    return completion_usage_completion_tokens_details_create_internal (
        accepted_prediction_tokens,
        audio_tokens,
        reasoning_tokens,
        rejected_prediction_tokens
        );
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
    free(completion_usage_completion_tokens_details);
}

cJSON *completion_usage_completion_tokens_details_convertToJSON(completion_usage_completion_tokens_details_t *completion_usage_completion_tokens_details) {
    cJSON *item = cJSON_CreateObject();

    // completion_usage_completion_tokens_details->accepted_prediction_tokens
    if(completion_usage_completion_tokens_details->accepted_prediction_tokens) {
    if(cJSON_AddNumberToObject(item, "accepted_prediction_tokens", completion_usage_completion_tokens_details->accepted_prediction_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // completion_usage_completion_tokens_details->audio_tokens
    if(completion_usage_completion_tokens_details->audio_tokens) {
    if(cJSON_AddNumberToObject(item, "audio_tokens", completion_usage_completion_tokens_details->audio_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // completion_usage_completion_tokens_details->reasoning_tokens
    if(completion_usage_completion_tokens_details->reasoning_tokens) {
    if(cJSON_AddNumberToObject(item, "reasoning_tokens", completion_usage_completion_tokens_details->reasoning_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // completion_usage_completion_tokens_details->rejected_prediction_tokens
    if(completion_usage_completion_tokens_details->rejected_prediction_tokens) {
    if(cJSON_AddNumberToObject(item, "rejected_prediction_tokens", completion_usage_completion_tokens_details->rejected_prediction_tokens) == NULL) {
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
    }


    completion_usage_completion_tokens_details_local_var = completion_usage_completion_tokens_details_create_internal (
        accepted_prediction_tokens ? accepted_prediction_tokens->valuedouble : 0,
        audio_tokens ? audio_tokens->valuedouble : 0,
        reasoning_tokens ? reasoning_tokens->valuedouble : 0,
        rejected_prediction_tokens ? rejected_prediction_tokens->valuedouble : 0
        );

    return completion_usage_completion_tokens_details_local_var;
end:
    return NULL;

}
