#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_rate_limit_update_request.h"



static project_rate_limit_update_request_t *project_rate_limit_update_request_create_internal(
    int *max_requests_per_1_minute,
    int *max_tokens_per_1_minute,
    int *max_images_per_1_minute,
    int *max_audio_megabytes_per_1_minute,
    int *max_requests_per_1_day,
    int *batch_1_day_max_input_tokens
    ) {
    project_rate_limit_update_request_t *project_rate_limit_update_request_local_var = malloc(sizeof(project_rate_limit_update_request_t));
    if (!project_rate_limit_update_request_local_var) {
        return NULL;
    }
    memset(project_rate_limit_update_request_local_var, 0, sizeof(project_rate_limit_update_request_t));
    project_rate_limit_update_request_local_var->_library_owned = 1;
    project_rate_limit_update_request_local_var->max_requests_per_1_minute = max_requests_per_1_minute;
    project_rate_limit_update_request_local_var->max_tokens_per_1_minute = max_tokens_per_1_minute;
    project_rate_limit_update_request_local_var->max_images_per_1_minute = max_images_per_1_minute;
    project_rate_limit_update_request_local_var->max_audio_megabytes_per_1_minute = max_audio_megabytes_per_1_minute;
    project_rate_limit_update_request_local_var->max_requests_per_1_day = max_requests_per_1_day;
    project_rate_limit_update_request_local_var->batch_1_day_max_input_tokens = batch_1_day_max_input_tokens;
    return project_rate_limit_update_request_local_var;
}

__attribute__((deprecated)) project_rate_limit_update_request_t *project_rate_limit_update_request_create(
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
    project_rate_limit_update_request_t *result = project_rate_limit_update_request_create_internal (
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

void project_rate_limit_update_request_free(project_rate_limit_update_request_t *project_rate_limit_update_request) {
    if(NULL == project_rate_limit_update_request){
        return ;
    }
    if(project_rate_limit_update_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_rate_limit_update_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project_rate_limit_update_request->max_requests_per_1_minute) {
        free(project_rate_limit_update_request->max_requests_per_1_minute);
        project_rate_limit_update_request->max_requests_per_1_minute = NULL;
    }
    if (project_rate_limit_update_request->max_tokens_per_1_minute) {
        free(project_rate_limit_update_request->max_tokens_per_1_minute);
        project_rate_limit_update_request->max_tokens_per_1_minute = NULL;
    }
    if (project_rate_limit_update_request->max_images_per_1_minute) {
        free(project_rate_limit_update_request->max_images_per_1_minute);
        project_rate_limit_update_request->max_images_per_1_minute = NULL;
    }
    if (project_rate_limit_update_request->max_audio_megabytes_per_1_minute) {
        free(project_rate_limit_update_request->max_audio_megabytes_per_1_minute);
        project_rate_limit_update_request->max_audio_megabytes_per_1_minute = NULL;
    }
    if (project_rate_limit_update_request->max_requests_per_1_day) {
        free(project_rate_limit_update_request->max_requests_per_1_day);
        project_rate_limit_update_request->max_requests_per_1_day = NULL;
    }
    if (project_rate_limit_update_request->batch_1_day_max_input_tokens) {
        free(project_rate_limit_update_request->batch_1_day_max_input_tokens);
        project_rate_limit_update_request->batch_1_day_max_input_tokens = NULL;
    }
    free(project_rate_limit_update_request);
}

cJSON *project_rate_limit_update_request_convertToJSON(project_rate_limit_update_request_t *project_rate_limit_update_request) {
    cJSON *item = cJSON_CreateObject();

    // project_rate_limit_update_request->max_requests_per_1_minute
    if(project_rate_limit_update_request->max_requests_per_1_minute) {
    if(cJSON_AddNumberToObject(item, "max_requests_per_1_minute", *project_rate_limit_update_request->max_requests_per_1_minute) == NULL) {
    goto fail; //Numeric
    }
    }


    // project_rate_limit_update_request->max_tokens_per_1_minute
    if(project_rate_limit_update_request->max_tokens_per_1_minute) {
    if(cJSON_AddNumberToObject(item, "max_tokens_per_1_minute", *project_rate_limit_update_request->max_tokens_per_1_minute) == NULL) {
    goto fail; //Numeric
    }
    }


    // project_rate_limit_update_request->max_images_per_1_minute
    if(project_rate_limit_update_request->max_images_per_1_minute) {
    if(cJSON_AddNumberToObject(item, "max_images_per_1_minute", *project_rate_limit_update_request->max_images_per_1_minute) == NULL) {
    goto fail; //Numeric
    }
    }


    // project_rate_limit_update_request->max_audio_megabytes_per_1_minute
    if(project_rate_limit_update_request->max_audio_megabytes_per_1_minute) {
    if(cJSON_AddNumberToObject(item, "max_audio_megabytes_per_1_minute", *project_rate_limit_update_request->max_audio_megabytes_per_1_minute) == NULL) {
    goto fail; //Numeric
    }
    }


    // project_rate_limit_update_request->max_requests_per_1_day
    if(project_rate_limit_update_request->max_requests_per_1_day) {
    if(cJSON_AddNumberToObject(item, "max_requests_per_1_day", *project_rate_limit_update_request->max_requests_per_1_day) == NULL) {
    goto fail; //Numeric
    }
    }


    // project_rate_limit_update_request->batch_1_day_max_input_tokens
    if(project_rate_limit_update_request->batch_1_day_max_input_tokens) {
    if(cJSON_AddNumberToObject(item, "batch_1_day_max_input_tokens", *project_rate_limit_update_request->batch_1_day_max_input_tokens) == NULL) {
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

project_rate_limit_update_request_t *project_rate_limit_update_request_parseFromJSON(cJSON *project_rate_limit_update_requestJSON){

    project_rate_limit_update_request_t *project_rate_limit_update_request_local_var = NULL;

    // define the local variable for project_rate_limit_update_request->max_requests_per_1_minute
    int *max_requests_per_1_minute_local_var = NULL;

    // define the local variable for project_rate_limit_update_request->max_tokens_per_1_minute
    int *max_tokens_per_1_minute_local_var = NULL;

    // define the local variable for project_rate_limit_update_request->max_images_per_1_minute
    int *max_images_per_1_minute_local_var = NULL;

    // define the local variable for project_rate_limit_update_request->max_audio_megabytes_per_1_minute
    int *max_audio_megabytes_per_1_minute_local_var = NULL;

    // define the local variable for project_rate_limit_update_request->max_requests_per_1_day
    int *max_requests_per_1_day_local_var = NULL;

    // define the local variable for project_rate_limit_update_request->batch_1_day_max_input_tokens
    int *batch_1_day_max_input_tokens_local_var = NULL;

    // project_rate_limit_update_request->max_requests_per_1_minute
    cJSON *max_requests_per_1_minute = cJSON_GetObjectItemCaseSensitive(project_rate_limit_update_requestJSON, "max_requests_per_1_minute");
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

    // project_rate_limit_update_request->max_tokens_per_1_minute
    cJSON *max_tokens_per_1_minute = cJSON_GetObjectItemCaseSensitive(project_rate_limit_update_requestJSON, "max_tokens_per_1_minute");
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

    // project_rate_limit_update_request->max_images_per_1_minute
    cJSON *max_images_per_1_minute = cJSON_GetObjectItemCaseSensitive(project_rate_limit_update_requestJSON, "max_images_per_1_minute");
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

    // project_rate_limit_update_request->max_audio_megabytes_per_1_minute
    cJSON *max_audio_megabytes_per_1_minute = cJSON_GetObjectItemCaseSensitive(project_rate_limit_update_requestJSON, "max_audio_megabytes_per_1_minute");
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

    // project_rate_limit_update_request->max_requests_per_1_day
    cJSON *max_requests_per_1_day = cJSON_GetObjectItemCaseSensitive(project_rate_limit_update_requestJSON, "max_requests_per_1_day");
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

    // project_rate_limit_update_request->batch_1_day_max_input_tokens
    cJSON *batch_1_day_max_input_tokens = cJSON_GetObjectItemCaseSensitive(project_rate_limit_update_requestJSON, "batch_1_day_max_input_tokens");
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



    project_rate_limit_update_request_local_var = project_rate_limit_update_request_create_internal (
        max_requests_per_1_minute_local_var,
        max_tokens_per_1_minute_local_var,
        max_images_per_1_minute_local_var,
        max_audio_megabytes_per_1_minute_local_var,
        max_requests_per_1_day_local_var,
        batch_1_day_max_input_tokens_local_var
        );

    if (!project_rate_limit_update_request_local_var) {
        goto end;
    }

    return project_rate_limit_update_request_local_var;
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
