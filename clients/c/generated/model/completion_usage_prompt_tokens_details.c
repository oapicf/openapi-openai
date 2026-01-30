#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "completion_usage_prompt_tokens_details.h"



static completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details_create_internal(
    int audio_tokens,
    int cached_tokens
    ) {
    completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details_local_var = malloc(sizeof(completion_usage_prompt_tokens_details_t));
    if (!completion_usage_prompt_tokens_details_local_var) {
        return NULL;
    }
    completion_usage_prompt_tokens_details_local_var->audio_tokens = audio_tokens;
    completion_usage_prompt_tokens_details_local_var->cached_tokens = cached_tokens;

    completion_usage_prompt_tokens_details_local_var->_library_owned = 1;
    return completion_usage_prompt_tokens_details_local_var;
}

__attribute__((deprecated)) completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details_create(
    int audio_tokens,
    int cached_tokens
    ) {
    return completion_usage_prompt_tokens_details_create_internal (
        audio_tokens,
        cached_tokens
        );
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
    free(completion_usage_prompt_tokens_details);
}

cJSON *completion_usage_prompt_tokens_details_convertToJSON(completion_usage_prompt_tokens_details_t *completion_usage_prompt_tokens_details) {
    cJSON *item = cJSON_CreateObject();

    // completion_usage_prompt_tokens_details->audio_tokens
    if(completion_usage_prompt_tokens_details->audio_tokens) {
    if(cJSON_AddNumberToObject(item, "audio_tokens", completion_usage_prompt_tokens_details->audio_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // completion_usage_prompt_tokens_details->cached_tokens
    if(completion_usage_prompt_tokens_details->cached_tokens) {
    if(cJSON_AddNumberToObject(item, "cached_tokens", completion_usage_prompt_tokens_details->cached_tokens) == NULL) {
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
    }


    completion_usage_prompt_tokens_details_local_var = completion_usage_prompt_tokens_details_create_internal (
        audio_tokens ? audio_tokens->valuedouble : 0,
        cached_tokens ? cached_tokens->valuedouble : 0
        );

    return completion_usage_prompt_tokens_details_local_var;
end:
    return NULL;

}
