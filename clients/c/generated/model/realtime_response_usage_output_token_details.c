#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_response_usage_output_token_details.h"



static realtime_response_usage_output_token_details_t *realtime_response_usage_output_token_details_create_internal(
    int *text_tokens,
    int *audio_tokens
    ) {
    realtime_response_usage_output_token_details_t *realtime_response_usage_output_token_details_local_var = malloc(sizeof(realtime_response_usage_output_token_details_t));
    if (!realtime_response_usage_output_token_details_local_var) {
        return NULL;
    }
    memset(realtime_response_usage_output_token_details_local_var, 0, sizeof(realtime_response_usage_output_token_details_t));
    realtime_response_usage_output_token_details_local_var->_library_owned = 1;
    realtime_response_usage_output_token_details_local_var->text_tokens = text_tokens;
    realtime_response_usage_output_token_details_local_var->audio_tokens = audio_tokens;
    return realtime_response_usage_output_token_details_local_var;
}

__attribute__((deprecated)) realtime_response_usage_output_token_details_t *realtime_response_usage_output_token_details_create(
    int *text_tokens,
    int *audio_tokens
    ) {
    int *text_tokens_copy = NULL;
    if (text_tokens) {
        text_tokens_copy = malloc(sizeof(int));
        if (text_tokens_copy) *text_tokens_copy = *text_tokens;
    }
    int *audio_tokens_copy = NULL;
    if (audio_tokens) {
        audio_tokens_copy = malloc(sizeof(int));
        if (audio_tokens_copy) *audio_tokens_copy = *audio_tokens;
    }
    realtime_response_usage_output_token_details_t *result = realtime_response_usage_output_token_details_create_internal (
        text_tokens_copy,
        audio_tokens_copy
        );
    if (!result) {
        free(text_tokens_copy);
        free(audio_tokens_copy);
    }
    return result;
}

void realtime_response_usage_output_token_details_free(realtime_response_usage_output_token_details_t *realtime_response_usage_output_token_details) {
    if(NULL == realtime_response_usage_output_token_details){
        return ;
    }
    if(realtime_response_usage_output_token_details->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_response_usage_output_token_details_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_response_usage_output_token_details->text_tokens) {
        free(realtime_response_usage_output_token_details->text_tokens);
        realtime_response_usage_output_token_details->text_tokens = NULL;
    }
    if (realtime_response_usage_output_token_details->audio_tokens) {
        free(realtime_response_usage_output_token_details->audio_tokens);
        realtime_response_usage_output_token_details->audio_tokens = NULL;
    }
    free(realtime_response_usage_output_token_details);
}

cJSON *realtime_response_usage_output_token_details_convertToJSON(realtime_response_usage_output_token_details_t *realtime_response_usage_output_token_details) {
    cJSON *item = cJSON_CreateObject();

    // realtime_response_usage_output_token_details->text_tokens
    if(realtime_response_usage_output_token_details->text_tokens) {
    if(cJSON_AddNumberToObject(item, "text_tokens", *realtime_response_usage_output_token_details->text_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_response_usage_output_token_details->audio_tokens
    if(realtime_response_usage_output_token_details->audio_tokens) {
    if(cJSON_AddNumberToObject(item, "audio_tokens", *realtime_response_usage_output_token_details->audio_tokens) == NULL) {
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

realtime_response_usage_output_token_details_t *realtime_response_usage_output_token_details_parseFromJSON(cJSON *realtime_response_usage_output_token_detailsJSON){

    realtime_response_usage_output_token_details_t *realtime_response_usage_output_token_details_local_var = NULL;

    // define the local variable for realtime_response_usage_output_token_details->text_tokens
    int *text_tokens_local_var = NULL;

    // define the local variable for realtime_response_usage_output_token_details->audio_tokens
    int *audio_tokens_local_var = NULL;

    // realtime_response_usage_output_token_details->text_tokens
    cJSON *text_tokens = cJSON_GetObjectItemCaseSensitive(realtime_response_usage_output_token_detailsJSON, "text_tokens");
    if (cJSON_IsNull(text_tokens)) {
        text_tokens = NULL;
    }
    if (text_tokens) { 
    if(!cJSON_IsNumber(text_tokens))
    {
    goto end; //Numeric
    }
    text_tokens_local_var = malloc(sizeof(int));
    if(!text_tokens_local_var)
    {
        goto end;
    }
    *text_tokens_local_var = text_tokens->valuedouble;
    }

    // realtime_response_usage_output_token_details->audio_tokens
    cJSON *audio_tokens = cJSON_GetObjectItemCaseSensitive(realtime_response_usage_output_token_detailsJSON, "audio_tokens");
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



    realtime_response_usage_output_token_details_local_var = realtime_response_usage_output_token_details_create_internal (
        text_tokens_local_var,
        audio_tokens_local_var
        );

    if (!realtime_response_usage_output_token_details_local_var) {
        goto end;
    }

    return realtime_response_usage_output_token_details_local_var;
end:
    if (text_tokens_local_var) {
        free(text_tokens_local_var);
        text_tokens_local_var = NULL;
    }
    if (audio_tokens_local_var) {
        free(audio_tokens_local_var);
        audio_tokens_local_var = NULL;
    }
    return NULL;

}
