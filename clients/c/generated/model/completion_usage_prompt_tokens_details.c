#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "completion_usage_prompt_tokens_details.h"



static completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details_create_internal(
    int *audio_tokens,
    int *cached_tokens
    ) {
    completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details_local_var = malloc(sizeof(completion_usage_prompt_tokens_details_t));
    if (!completion_usage_prompt_tokens_details_local_var) {
        return NULL;
    }
    memset(completion_usage_prompt_tokens_details_local_var, 0, sizeof(completion_usage_prompt_tokens_details_t));
    completion_usage_prompt_tokens_details_local_var->_library_owned = 1;
    completion_usage_prompt_tokens_details_local_var->audio_tokens = audio_tokens;
    completion_usage_prompt_tokens_details_local_var->cached_tokens = cached_tokens;
    return completion_usage_prompt_tokens_details_local_var;
}

__attribute__((deprecated)) completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details_create(
    int *audio_tokens,
    int *cached_tokens
    ) {
    int *audio_tokens_copy = NULL;
    if (audio_tokens) {
        audio_tokens_copy = malloc(sizeof(int));
        if (audio_tokens_copy) *audio_tokens_copy = *audio_tokens;
    }
    int *cached_tokens_copy = NULL;
    if (cached_tokens) {
        cached_tokens_copy = malloc(sizeof(int));
        if (cached_tokens_copy) *cached_tokens_copy = *cached_tokens;
    }
    completion_usage_prompt_tokens_details_t *result = completion_usage_prompt_tokens_details_create_internal (
        audio_tokens_copy,
        cached_tokens_copy
        );
    if (!result) {
        free(audio_tokens_copy);
        free(cached_tokens_copy);
    }
    return result;
}

void completion_usage_prompt_tokens_details_free(completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details) {
    if(NULL == completion_usage_prompt_tokens_details){
        return ;
    }
    if(completion_usage_prompt_tokens_details->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "completion_usage_prompt_tokens_details_free");
        return ;
    }
    listEntry_t *listEntry;
    if (completion_usage_prompt_tokens_details->audio_tokens) {
        free(completion_usage_prompt_tokens_details->audio_tokens);
        completion_usage_prompt_tokens_details->audio_tokens = NULL;
    }
    if (completion_usage_prompt_tokens_details->cached_tokens) {
        free(completion_usage_prompt_tokens_details->cached_tokens);
        completion_usage_prompt_tokens_details->cached_tokens = NULL;
    }
    free(completion_usage_prompt_tokens_details);
}

cJSON *completion_usage_prompt_tokens_details_convertToJSON(completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details) {
    cJSON *item = cJSON_CreateObject();

    // completion_usage_prompt_tokens_details->audio_tokens
    if(completion_usage_prompt_tokens_details->audio_tokens) {
    if(cJSON_AddNumberToObject(item, "audio_tokens", *completion_usage_prompt_tokens_details->audio_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // completion_usage_prompt_tokens_details->cached_tokens
    if(completion_usage_prompt_tokens_details->cached_tokens) {
    if(cJSON_AddNumberToObject(item, "cached_tokens", *completion_usage_prompt_tokens_details->cached_tokens) == NULL) {
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

completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details_parseFromJSON(cJSON *completion_usage_prompt_tokens_detailsJSON){

    completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details_local_var = NULL;

    // define the local variable for completion_usage_prompt_tokens_details->audio_tokens
    int *audio_tokens_local_var = NULL;

    // define the local variable for completion_usage_prompt_tokens_details->cached_tokens
    int *cached_tokens_local_var = NULL;

    // completion_usage_prompt_tokens_details->audio_tokens
    cJSON *audio_tokens = cJSON_GetObjectItemCaseSensitive(completion_usage_prompt_tokens_detailsJSON, "audio_tokens");
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

    // completion_usage_prompt_tokens_details->cached_tokens
    cJSON *cached_tokens = cJSON_GetObjectItemCaseSensitive(completion_usage_prompt_tokens_detailsJSON, "cached_tokens");
    if (cJSON_IsNull(cached_tokens)) {
        cached_tokens = NULL;
    }
    if (cached_tokens) { 
    if(!cJSON_IsNumber(cached_tokens))
    {
    goto end; //Numeric
    }
    cached_tokens_local_var = malloc(sizeof(int));
    if(!cached_tokens_local_var)
    {
        goto end;
    }
    *cached_tokens_local_var = cached_tokens->valuedouble;
    }



    completion_usage_prompt_tokens_details_local_var = completion_usage_prompt_tokens_details_create_internal (
        audio_tokens_local_var,
        cached_tokens_local_var
        );

    if (!completion_usage_prompt_tokens_details_local_var) {
        goto end;
    }

    return completion_usage_prompt_tokens_details_local_var;
end:
    if (audio_tokens_local_var) {
        free(audio_tokens_local_var);
        audio_tokens_local_var = NULL;
    }
    if (cached_tokens_local_var) {
        free(cached_tokens_local_var);
        cached_tokens_local_var = NULL;
    }
    return NULL;

}
