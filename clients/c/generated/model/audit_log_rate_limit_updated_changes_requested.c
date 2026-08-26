#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "audit_log_rate_limit_updated_changes_requested.h"



static audit_log_rate_limit_updated_changes_requested_t *audit_log_rate_limit_updated_changes_requested_create_internal(
    int *max_requests_per_1_minute,
    int *max_tokens_per_1_minute,
    int *max_images_per_1_minute,
    int *max_audio_megabytes_per_1_minute,
    int *max_requests_per_1_day,
    int *batch_1_day_max_input_tokens
    ) {
    audit_log_rate_limit_updated_changes_requested_t *audit_log_rate_limit_updated_changes_requested_local_var = malloc(sizeof(audit_log_rate_limit_updated_changes_requested_t));
    if (!audit_log_rate_limit_updated_changes_requested_local_var) {
        return NULL;
    }
    memset(audit_log_rate_limit_updated_changes_requested_local_var, 0, sizeof(audit_log_rate_limit_updated_changes_requested_t));
    audit_log_rate_limit_updated_changes_requested_local_var->_library_owned = 1;
    audit_log_rate_limit_updated_changes_requested_local_var->max_requests_per_1_minute = max_requests_per_1_minute;
    audit_log_rate_limit_updated_changes_requested_local_var->max_tokens_per_1_minute = max_tokens_per_1_minute;
    audit_log_rate_limit_updated_changes_requested_local_var->max_images_per_1_minute = max_images_per_1_minute;
    audit_log_rate_limit_updated_changes_requested_local_var->max_audio_megabytes_per_1_minute = max_audio_megabytes_per_1_minute;
    audit_log_rate_limit_updated_changes_requested_local_var->max_requests_per_1_day = max_requests_per_1_day;
    audit_log_rate_limit_updated_changes_requested_local_var->batch_1_day_max_input_tokens = batch_1_day_max_input_tokens;
    return audit_log_rate_limit_updated_changes_requested_local_var;
}

__attribute__((deprecated)) audit_log_rate_limit_updated_changes_requested_t *audit_log_rate_limit_updated_changes_requested_create(
    int *max_requests_per_1_minute,
    int *max_tokens_per_1_minute,
    int *max_images_per_1_minute,
    int *max_audio_megabytes_per_1_minute,
    int *max_requests_per_1_day,
    int *batch_1_day_max_input_tokens
    ) {
    int *max_requests_per_1_minute_copy = NULL;
    if (max_requests_per_1_minute) {
        max_requests_per_1_minute_copy = malloc(sizeof(int));
        if (max_requests_per_1_minute_copy) *max_requests_per_1_minute_copy = *max_requests_per_1_minute;
    }
    int *max_tokens_per_1_minute_copy = NULL;
    if (max_tokens_per_1_minute) {
        max_tokens_per_1_minute_copy = malloc(sizeof(int));
        if (max_tokens_per_1_minute_copy) *max_tokens_per_1_minute_copy = *max_tokens_per_1_minute;
    }
    int *max_images_per_1_minute_copy = NULL;
    if (max_images_per_1_minute) {
        max_images_per_1_minute_copy = malloc(sizeof(int));
        if (max_images_per_1_minute_copy) *max_images_per_1_minute_copy = *max_images_per_1_minute;
    }
    int *max_audio_megabytes_per_1_minute_copy = NULL;
    if (max_audio_megabytes_per_1_minute) {
        max_audio_megabytes_per_1_minute_copy = malloc(sizeof(int));
        if (max_audio_megabytes_per_1_minute_copy) *max_audio_megabytes_per_1_minute_copy = *max_audio_megabytes_per_1_minute;
    }
    int *max_requests_per_1_day_copy = NULL;
    if (max_requests_per_1_day) {
        max_requests_per_1_day_copy = malloc(sizeof(int));
        if (max_requests_per_1_day_copy) *max_requests_per_1_day_copy = *max_requests_per_1_day;
    }
    int *batch_1_day_max_input_tokens_copy = NULL;
    if (batch_1_day_max_input_tokens) {
        batch_1_day_max_input_tokens_copy = malloc(sizeof(int));
        if (batch_1_day_max_input_tokens_copy) *batch_1_day_max_input_tokens_copy = *batch_1_day_max_input_tokens;
    }
    audit_log_rate_limit_updated_changes_requested_t *result = audit_log_rate_limit_updated_changes_requested_create_internal (
        max_requests_per_1_minute_copy,
        max_tokens_per_1_minute_copy,
        max_images_per_1_minute_copy,
        max_audio_megabytes_per_1_minute_copy,
        max_requests_per_1_day_copy,
        batch_1_day_max_input_tokens_copy
        );
    if (!result) {
        free(max_requests_per_1_minute_copy);
        free(max_tokens_per_1_minute_copy);
        free(max_images_per_1_minute_copy);
        free(max_audio_megabytes_per_1_minute_copy);
        free(max_requests_per_1_day_copy);
        free(batch_1_day_max_input_tokens_copy);
    }
    return result;
}

void audit_log_rate_limit_updated_changes_requested_free(audit_log_rate_limit_updated_changes_requested_t *audit_log_rate_limit_updated_changes_requested) {
    if(NULL == audit_log_rate_limit_updated_changes_requested){
        return ;
    }
    if(audit_log_rate_limit_updated_changes_requested->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "audit_log_rate_limit_updated_changes_requested_free");
        return ;
    }
    listEntry_t *listEntry;
    if (audit_log_rate_limit_updated_changes_requested->max_requests_per_1_minute) {
        free(audit_log_rate_limit_updated_changes_requested->max_requests_per_1_minute);
        audit_log_rate_limit_updated_changes_requested->max_requests_per_1_minute = NULL;
    }
    if (audit_log_rate_limit_updated_changes_requested->max_tokens_per_1_minute) {
        free(audit_log_rate_limit_updated_changes_requested->max_tokens_per_1_minute);
        audit_log_rate_limit_updated_changes_requested->max_tokens_per_1_minute = NULL;
    }
    if (audit_log_rate_limit_updated_changes_requested->max_images_per_1_minute) {
        free(audit_log_rate_limit_updated_changes_requested->max_images_per_1_minute);
        audit_log_rate_limit_updated_changes_requested->max_images_per_1_minute = NULL;
    }
    if (audit_log_rate_limit_updated_changes_requested->max_audio_megabytes_per_1_minute) {
        free(audit_log_rate_limit_updated_changes_requested->max_audio_megabytes_per_1_minute);
        audit_log_rate_limit_updated_changes_requested->max_audio_megabytes_per_1_minute = NULL;
    }
    if (audit_log_rate_limit_updated_changes_requested->max_requests_per_1_day) {
        free(audit_log_rate_limit_updated_changes_requested->max_requests_per_1_day);
        audit_log_rate_limit_updated_changes_requested->max_requests_per_1_day = NULL;
    }
    if (audit_log_rate_limit_updated_changes_requested->batch_1_day_max_input_tokens) {
        free(audit_log_rate_limit_updated_changes_requested->batch_1_day_max_input_tokens);
        audit_log_rate_limit_updated_changes_requested->batch_1_day_max_input_tokens = NULL;
    }
    free(audit_log_rate_limit_updated_changes_requested);
}

cJSON *audit_log_rate_limit_updated_changes_requested_convertToJSON(audit_log_rate_limit_updated_changes_requested_t *audit_log_rate_limit_updated_changes_requested) {
    cJSON *item = cJSON_CreateObject();

    // audit_log_rate_limit_updated_changes_requested->max_requests_per_1_minute
    if(audit_log_rate_limit_updated_changes_requested->max_requests_per_1_minute) {
    if(cJSON_AddNumberToObject(item, "max_requests_per_1_minute", *audit_log_rate_limit_updated_changes_requested->max_requests_per_1_minute) == NULL) {
    goto fail; //Numeric
    }
    }


    // audit_log_rate_limit_updated_changes_requested->max_tokens_per_1_minute
    if(audit_log_rate_limit_updated_changes_requested->max_tokens_per_1_minute) {
    if(cJSON_AddNumberToObject(item, "max_tokens_per_1_minute", *audit_log_rate_limit_updated_changes_requested->max_tokens_per_1_minute) == NULL) {
    goto fail; //Numeric
    }
    }


    // audit_log_rate_limit_updated_changes_requested->max_images_per_1_minute
    if(audit_log_rate_limit_updated_changes_requested->max_images_per_1_minute) {
    if(cJSON_AddNumberToObject(item, "max_images_per_1_minute", *audit_log_rate_limit_updated_changes_requested->max_images_per_1_minute) == NULL) {
    goto fail; //Numeric
    }
    }


    // audit_log_rate_limit_updated_changes_requested->max_audio_megabytes_per_1_minute
    if(audit_log_rate_limit_updated_changes_requested->max_audio_megabytes_per_1_minute) {
    if(cJSON_AddNumberToObject(item, "max_audio_megabytes_per_1_minute", *audit_log_rate_limit_updated_changes_requested->max_audio_megabytes_per_1_minute) == NULL) {
    goto fail; //Numeric
    }
    }


    // audit_log_rate_limit_updated_changes_requested->max_requests_per_1_day
    if(audit_log_rate_limit_updated_changes_requested->max_requests_per_1_day) {
    if(cJSON_AddNumberToObject(item, "max_requests_per_1_day", *audit_log_rate_limit_updated_changes_requested->max_requests_per_1_day) == NULL) {
    goto fail; //Numeric
    }
    }


    // audit_log_rate_limit_updated_changes_requested->batch_1_day_max_input_tokens
    if(audit_log_rate_limit_updated_changes_requested->batch_1_day_max_input_tokens) {
    if(cJSON_AddNumberToObject(item, "batch_1_day_max_input_tokens", *audit_log_rate_limit_updated_changes_requested->batch_1_day_max_input_tokens) == NULL) {
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

audit_log_rate_limit_updated_changes_requested_t *audit_log_rate_limit_updated_changes_requested_parseFromJSON(cJSON *audit_log_rate_limit_updated_changes_requestedJSON){

    audit_log_rate_limit_updated_changes_requested_t *audit_log_rate_limit_updated_changes_requested_local_var = NULL;

    // define the local variable for audit_log_rate_limit_updated_changes_requested->max_requests_per_1_minute
    int *max_requests_per_1_minute_local_var = NULL;

    // define the local variable for audit_log_rate_limit_updated_changes_requested->max_tokens_per_1_minute
    int *max_tokens_per_1_minute_local_var = NULL;

    // define the local variable for audit_log_rate_limit_updated_changes_requested->max_images_per_1_minute
    int *max_images_per_1_minute_local_var = NULL;

    // define the local variable for audit_log_rate_limit_updated_changes_requested->max_audio_megabytes_per_1_minute
    int *max_audio_megabytes_per_1_minute_local_var = NULL;

    // define the local variable for audit_log_rate_limit_updated_changes_requested->max_requests_per_1_day
    int *max_requests_per_1_day_local_var = NULL;

    // define the local variable for audit_log_rate_limit_updated_changes_requested->batch_1_day_max_input_tokens
    int *batch_1_day_max_input_tokens_local_var = NULL;

    // audit_log_rate_limit_updated_changes_requested->max_requests_per_1_minute
    cJSON *max_requests_per_1_minute = cJSON_GetObjectItemCaseSensitive(audit_log_rate_limit_updated_changes_requestedJSON, "max_requests_per_1_minute");
    if (cJSON_IsNull(max_requests_per_1_minute)) {
        max_requests_per_1_minute = NULL;
    }
    if (max_requests_per_1_minute) { 
    if(!cJSON_IsNumber(max_requests_per_1_minute))
    {
    goto end; //Numeric
    }
    max_requests_per_1_minute_local_var = malloc(sizeof(int));
    if(!max_requests_per_1_minute_local_var)
    {
        goto end;
    }
    *max_requests_per_1_minute_local_var = max_requests_per_1_minute->valuedouble;
    }

    // audit_log_rate_limit_updated_changes_requested->max_tokens_per_1_minute
    cJSON *max_tokens_per_1_minute = cJSON_GetObjectItemCaseSensitive(audit_log_rate_limit_updated_changes_requestedJSON, "max_tokens_per_1_minute");
    if (cJSON_IsNull(max_tokens_per_1_minute)) {
        max_tokens_per_1_minute = NULL;
    }
    if (max_tokens_per_1_minute) { 
    if(!cJSON_IsNumber(max_tokens_per_1_minute))
    {
    goto end; //Numeric
    }
    max_tokens_per_1_minute_local_var = malloc(sizeof(int));
    if(!max_tokens_per_1_minute_local_var)
    {
        goto end;
    }
    *max_tokens_per_1_minute_local_var = max_tokens_per_1_minute->valuedouble;
    }

    // audit_log_rate_limit_updated_changes_requested->max_images_per_1_minute
    cJSON *max_images_per_1_minute = cJSON_GetObjectItemCaseSensitive(audit_log_rate_limit_updated_changes_requestedJSON, "max_images_per_1_minute");
    if (cJSON_IsNull(max_images_per_1_minute)) {
        max_images_per_1_minute = NULL;
    }
    if (max_images_per_1_minute) { 
    if(!cJSON_IsNumber(max_images_per_1_minute))
    {
    goto end; //Numeric
    }
    max_images_per_1_minute_local_var = malloc(sizeof(int));
    if(!max_images_per_1_minute_local_var)
    {
        goto end;
    }
    *max_images_per_1_minute_local_var = max_images_per_1_minute->valuedouble;
    }

    // audit_log_rate_limit_updated_changes_requested->max_audio_megabytes_per_1_minute
    cJSON *max_audio_megabytes_per_1_minute = cJSON_GetObjectItemCaseSensitive(audit_log_rate_limit_updated_changes_requestedJSON, "max_audio_megabytes_per_1_minute");
    if (cJSON_IsNull(max_audio_megabytes_per_1_minute)) {
        max_audio_megabytes_per_1_minute = NULL;
    }
    if (max_audio_megabytes_per_1_minute) { 
    if(!cJSON_IsNumber(max_audio_megabytes_per_1_minute))
    {
    goto end; //Numeric
    }
    max_audio_megabytes_per_1_minute_local_var = malloc(sizeof(int));
    if(!max_audio_megabytes_per_1_minute_local_var)
    {
        goto end;
    }
    *max_audio_megabytes_per_1_minute_local_var = max_audio_megabytes_per_1_minute->valuedouble;
    }

    // audit_log_rate_limit_updated_changes_requested->max_requests_per_1_day
    cJSON *max_requests_per_1_day = cJSON_GetObjectItemCaseSensitive(audit_log_rate_limit_updated_changes_requestedJSON, "max_requests_per_1_day");
    if (cJSON_IsNull(max_requests_per_1_day)) {
        max_requests_per_1_day = NULL;
    }
    if (max_requests_per_1_day) { 
    if(!cJSON_IsNumber(max_requests_per_1_day))
    {
    goto end; //Numeric
    }
    max_requests_per_1_day_local_var = malloc(sizeof(int));
    if(!max_requests_per_1_day_local_var)
    {
        goto end;
    }
    *max_requests_per_1_day_local_var = max_requests_per_1_day->valuedouble;
    }

    // audit_log_rate_limit_updated_changes_requested->batch_1_day_max_input_tokens
    cJSON *batch_1_day_max_input_tokens = cJSON_GetObjectItemCaseSensitive(audit_log_rate_limit_updated_changes_requestedJSON, "batch_1_day_max_input_tokens");
    if (cJSON_IsNull(batch_1_day_max_input_tokens)) {
        batch_1_day_max_input_tokens = NULL;
    }
    if (batch_1_day_max_input_tokens) { 
    if(!cJSON_IsNumber(batch_1_day_max_input_tokens))
    {
    goto end; //Numeric
    }
    batch_1_day_max_input_tokens_local_var = malloc(sizeof(int));
    if(!batch_1_day_max_input_tokens_local_var)
    {
        goto end;
    }
    *batch_1_day_max_input_tokens_local_var = batch_1_day_max_input_tokens->valuedouble;
    }



    audit_log_rate_limit_updated_changes_requested_local_var = audit_log_rate_limit_updated_changes_requested_create_internal (
        max_requests_per_1_minute_local_var,
        max_tokens_per_1_minute_local_var,
        max_images_per_1_minute_local_var,
        max_audio_megabytes_per_1_minute_local_var,
        max_requests_per_1_day_local_var,
        batch_1_day_max_input_tokens_local_var
        );

    if (!audit_log_rate_limit_updated_changes_requested_local_var) {
        goto end;
    }

    return audit_log_rate_limit_updated_changes_requested_local_var;
end:
    if (max_requests_per_1_minute_local_var) {
        free(max_requests_per_1_minute_local_var);
        max_requests_per_1_minute_local_var = NULL;
    }
    if (max_tokens_per_1_minute_local_var) {
        free(max_tokens_per_1_minute_local_var);
        max_tokens_per_1_minute_local_var = NULL;
    }
    if (max_images_per_1_minute_local_var) {
        free(max_images_per_1_minute_local_var);
        max_images_per_1_minute_local_var = NULL;
    }
    if (max_audio_megabytes_per_1_minute_local_var) {
        free(max_audio_megabytes_per_1_minute_local_var);
        max_audio_megabytes_per_1_minute_local_var = NULL;
    }
    if (max_requests_per_1_day_local_var) {
        free(max_requests_per_1_day_local_var);
        max_requests_per_1_day_local_var = NULL;
    }
    if (batch_1_day_max_input_tokens_local_var) {
        free(batch_1_day_max_input_tokens_local_var);
        batch_1_day_max_input_tokens_local_var = NULL;
    }
    return NULL;

}
