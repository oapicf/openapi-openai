#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_response_usage_input_token_details.h"



static realtime_response_usage_input_token_details_t *realtime_response_usage_input_token_details_create_internal(
    int cached_tokens,
    int text_tokens,
    int audio_tokens
    ) {
    realtime_response_usage_input_token_details_t *realtime_response_usage_input_token_details_local_var = malloc(sizeof(realtime_response_usage_input_token_details_t));
    if (!realtime_response_usage_input_token_details_local_var) {
        return NULL;
    }
    realtime_response_usage_input_token_details_local_var->cached_tokens = cached_tokens;
    realtime_response_usage_input_token_details_local_var->text_tokens = text_tokens;
    realtime_response_usage_input_token_details_local_var->audio_tokens = audio_tokens;

    realtime_response_usage_input_token_details_local_var->_library_owned = 1;
    return realtime_response_usage_input_token_details_local_var;
}

__attribute__((deprecated)) realtime_response_usage_input_token_details_t *realtime_response_usage_input_token_details_create(
    int cached_tokens,
    int text_tokens,
    int audio_tokens
    ) {
    return realtime_response_usage_input_token_details_create_internal (
        cached_tokens,
        text_tokens,
        audio_tokens
        );
}

void realtime_response_usage_input_token_details_free(realtime_response_usage_input_token_details_t *realtime_response_usage_input_token_details) {
    if(NULL == realtime_response_usage_input_token_details){
        return ;
    }
    if(realtime_response_usage_input_token_details->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_response_usage_input_token_details_free");
        return ;
    }
    listEntry_t *listEntry;
    free(realtime_response_usage_input_token_details);
}

cJSON *realtime_response_usage_input_token_details_convertToJSON(realtime_response_usage_input_token_details_t *realtime_response_usage_input_token_details) {
    cJSON *item = cJSON_CreateObject();

    // realtime_response_usage_input_token_details->cached_tokens
    if(realtime_response_usage_input_token_details->cached_tokens) {
    if(cJSON_AddNumberToObject(item, "cached_tokens", realtime_response_usage_input_token_details->cached_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_response_usage_input_token_details->text_tokens
    if(realtime_response_usage_input_token_details->text_tokens) {
    if(cJSON_AddNumberToObject(item, "text_tokens", realtime_response_usage_input_token_details->text_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_response_usage_input_token_details->audio_tokens
    if(realtime_response_usage_input_token_details->audio_tokens) {
    if(cJSON_AddNumberToObject(item, "audio_tokens", realtime_response_usage_input_token_details->audio_tokens) == NULL) {
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

realtime_response_usage_input_token_details_t *realtime_response_usage_input_token_details_parseFromJSON(cJSON *realtime_response_usage_input_token_detailsJSON){

    realtime_response_usage_input_token_details_t *realtime_response_usage_input_token_details_local_var = NULL;

    // realtime_response_usage_input_token_details->cached_tokens
    cJSON *cached_tokens = cJSON_GetObjectItemCaseSensitive(realtime_response_usage_input_token_detailsJSON, "cached_tokens");
    if (cJSON_IsNull(cached_tokens)) {
        cached_tokens = NULL;
    }
    if (cached_tokens) { 
    if(!cJSON_IsNumber(cached_tokens))
    {
    goto end; //Numeric
    }
    }

    // realtime_response_usage_input_token_details->text_tokens
    cJSON *text_tokens = cJSON_GetObjectItemCaseSensitive(realtime_response_usage_input_token_detailsJSON, "text_tokens");
    if (cJSON_IsNull(text_tokens)) {
        text_tokens = NULL;
    }
    if (text_tokens) { 
    if(!cJSON_IsNumber(text_tokens))
    {
    goto end; //Numeric
    }
    }

    // realtime_response_usage_input_token_details->audio_tokens
    cJSON *audio_tokens = cJSON_GetObjectItemCaseSensitive(realtime_response_usage_input_token_detailsJSON, "audio_tokens");
    if (cJSON_IsNull(audio_tokens)) {
        audio_tokens = NULL;
    }
    if (audio_tokens) { 
    if(!cJSON_IsNumber(audio_tokens))
    {
    goto end; //Numeric
    }
    }


    realtime_response_usage_input_token_details_local_var = realtime_response_usage_input_token_details_create_internal (
        cached_tokens ? cached_tokens->valuedouble : 0,
        text_tokens ? text_tokens->valuedouble : 0,
        audio_tokens ? audio_tokens->valuedouble : 0
        );

    return realtime_response_usage_input_token_details_local_var;
end:
    return NULL;

}
