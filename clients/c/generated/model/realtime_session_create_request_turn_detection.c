#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_session_create_request_turn_detection.h"



static realtime_session_create_request_turn_detection_t *realtime_session_create_request_turn_detection_create_internal(
    char *type,
    double *threshold,
    int *prefix_padding_ms,
    int *silence_duration_ms,
    int *create_response
    ) {
    realtime_session_create_request_turn_detection_t *realtime_session_create_request_turn_detection_local_var = malloc(sizeof(realtime_session_create_request_turn_detection_t));
    if (!realtime_session_create_request_turn_detection_local_var) {
        return NULL;
    }
    memset(realtime_session_create_request_turn_detection_local_var, 0, sizeof(realtime_session_create_request_turn_detection_t));
    realtime_session_create_request_turn_detection_local_var->_library_owned = 1;
    realtime_session_create_request_turn_detection_local_var->type = type;
    realtime_session_create_request_turn_detection_local_var->threshold = threshold;
    realtime_session_create_request_turn_detection_local_var->prefix_padding_ms = prefix_padding_ms;
    realtime_session_create_request_turn_detection_local_var->silence_duration_ms = silence_duration_ms;
    realtime_session_create_request_turn_detection_local_var->create_response = create_response;
    return realtime_session_create_request_turn_detection_local_var;
}

__attribute__((deprecated)) realtime_session_create_request_turn_detection_t *realtime_session_create_request_turn_detection_create(
    char *type,
    double *threshold,
    int *prefix_padding_ms,
    int *silence_duration_ms,
    int *create_response
    ) {
    double *threshold_copy = NULL;
    if (threshold) {
        threshold_copy = malloc(sizeof(double));
        if (threshold_copy) *threshold_copy = *threshold;
    }
    int *prefix_padding_ms_copy = NULL;
    if (prefix_padding_ms) {
        prefix_padding_ms_copy = malloc(sizeof(int));
        if (prefix_padding_ms_copy) *prefix_padding_ms_copy = *prefix_padding_ms;
    }
    int *silence_duration_ms_copy = NULL;
    if (silence_duration_ms) {
        silence_duration_ms_copy = malloc(sizeof(int));
        if (silence_duration_ms_copy) *silence_duration_ms_copy = *silence_duration_ms;
    }
    int *create_response_copy = NULL;
    if (create_response) {
        create_response_copy = malloc(sizeof(int));
        if (create_response_copy) *create_response_copy = *create_response;
    }
    realtime_session_create_request_turn_detection_t *result = realtime_session_create_request_turn_detection_create_internal (
        type,
        threshold_copy,
        prefix_padding_ms_copy,
        silence_duration_ms_copy,
        create_response_copy
        );
    if (!result) {
        free(threshold_copy);
        free(prefix_padding_ms_copy);
        free(silence_duration_ms_copy);
        free(create_response_copy);
    }
    return result;
}

void realtime_session_create_request_turn_detection_free(realtime_session_create_request_turn_detection_t *realtime_session_create_request_turn_detection) {
    if(NULL == realtime_session_create_request_turn_detection){
        return ;
    }
    if(realtime_session_create_request_turn_detection->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_session_create_request_turn_detection_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_session_create_request_turn_detection->type) {
        free(realtime_session_create_request_turn_detection->type);
        realtime_session_create_request_turn_detection->type = NULL;
    }
    if (realtime_session_create_request_turn_detection->threshold) {
        free(realtime_session_create_request_turn_detection->threshold);
        realtime_session_create_request_turn_detection->threshold = NULL;
    }
    if (realtime_session_create_request_turn_detection->prefix_padding_ms) {
        free(realtime_session_create_request_turn_detection->prefix_padding_ms);
        realtime_session_create_request_turn_detection->prefix_padding_ms = NULL;
    }
    if (realtime_session_create_request_turn_detection->silence_duration_ms) {
        free(realtime_session_create_request_turn_detection->silence_duration_ms);
        realtime_session_create_request_turn_detection->silence_duration_ms = NULL;
    }
    if (realtime_session_create_request_turn_detection->create_response) {
        free(realtime_session_create_request_turn_detection->create_response);
        realtime_session_create_request_turn_detection->create_response = NULL;
    }
    free(realtime_session_create_request_turn_detection);
}

cJSON *realtime_session_create_request_turn_detection_convertToJSON(realtime_session_create_request_turn_detection_t *realtime_session_create_request_turn_detection) {
    cJSON *item = cJSON_CreateObject();

    // realtime_session_create_request_turn_detection->type
    if(realtime_session_create_request_turn_detection->type) {
    if(cJSON_AddStringToObject(item, "type", realtime_session_create_request_turn_detection->type) == NULL) {
    goto fail; //String
    }
    }


    // realtime_session_create_request_turn_detection->threshold
    if(realtime_session_create_request_turn_detection->threshold) {
    if(cJSON_AddNumberToObject(item, "threshold", *realtime_session_create_request_turn_detection->threshold) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_session_create_request_turn_detection->prefix_padding_ms
    if(realtime_session_create_request_turn_detection->prefix_padding_ms) {
    if(cJSON_AddNumberToObject(item, "prefix_padding_ms", *realtime_session_create_request_turn_detection->prefix_padding_ms) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_session_create_request_turn_detection->silence_duration_ms
    if(realtime_session_create_request_turn_detection->silence_duration_ms) {
    if(cJSON_AddNumberToObject(item, "silence_duration_ms", *realtime_session_create_request_turn_detection->silence_duration_ms) == NULL) {
    goto fail; //Numeric
    }
    }


    // realtime_session_create_request_turn_detection->create_response
    if(realtime_session_create_request_turn_detection->create_response) {
    if(cJSON_AddBoolToObject(item, "create_response", *realtime_session_create_request_turn_detection->create_response) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_session_create_request_turn_detection_t *realtime_session_create_request_turn_detection_parseFromJSON(cJSON *realtime_session_create_request_turn_detectionJSON){

    realtime_session_create_request_turn_detection_t *realtime_session_create_request_turn_detection_local_var = NULL;

    char *type_local_str = NULL;

    // define the local variable for realtime_session_create_request_turn_detection->threshold
    double *threshold_local_var = NULL;

    // define the local variable for realtime_session_create_request_turn_detection->prefix_padding_ms
    int *prefix_padding_ms_local_var = NULL;

    // define the local variable for realtime_session_create_request_turn_detection->silence_duration_ms
    int *silence_duration_ms_local_var = NULL;

    // define the local variable for realtime_session_create_request_turn_detection->create_response
    int *create_response_local_var = NULL;

    // realtime_session_create_request_turn_detection->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_session_create_request_turn_detectionJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsString(type) && !cJSON_IsNull(type))
    {
    goto end; //String
    }
    }

    // realtime_session_create_request_turn_detection->threshold
    cJSON *threshold = cJSON_GetObjectItemCaseSensitive(realtime_session_create_request_turn_detectionJSON, "threshold");
    if (cJSON_IsNull(threshold)) {
        threshold = NULL;
    }
    if (threshold) { 
    if(!cJSON_IsNumber(threshold))
    {
    goto end; //Numeric
    }
    threshold_local_var = malloc(sizeof(double));
    if(!threshold_local_var)
    {
        goto end;
    }
    *threshold_local_var = threshold->valuedouble;
    }

    // realtime_session_create_request_turn_detection->prefix_padding_ms
    cJSON *prefix_padding_ms = cJSON_GetObjectItemCaseSensitive(realtime_session_create_request_turn_detectionJSON, "prefix_padding_ms");
    if (cJSON_IsNull(prefix_padding_ms)) {
        prefix_padding_ms = NULL;
    }
    if (prefix_padding_ms) { 
    if(!cJSON_IsNumber(prefix_padding_ms))
    {
    goto end; //Numeric
    }
    prefix_padding_ms_local_var = malloc(sizeof(int));
    if(!prefix_padding_ms_local_var)
    {
        goto end;
    }
    *prefix_padding_ms_local_var = prefix_padding_ms->valuedouble;
    }

    // realtime_session_create_request_turn_detection->silence_duration_ms
    cJSON *silence_duration_ms = cJSON_GetObjectItemCaseSensitive(realtime_session_create_request_turn_detectionJSON, "silence_duration_ms");
    if (cJSON_IsNull(silence_duration_ms)) {
        silence_duration_ms = NULL;
    }
    if (silence_duration_ms) { 
    if(!cJSON_IsNumber(silence_duration_ms))
    {
    goto end; //Numeric
    }
    silence_duration_ms_local_var = malloc(sizeof(int));
    if(!silence_duration_ms_local_var)
    {
        goto end;
    }
    *silence_duration_ms_local_var = silence_duration_ms->valuedouble;
    }

    // realtime_session_create_request_turn_detection->create_response
    cJSON *create_response = cJSON_GetObjectItemCaseSensitive(realtime_session_create_request_turn_detectionJSON, "create_response");
    if (cJSON_IsNull(create_response)) {
        create_response = NULL;
    }
    if (create_response) { 
    if(!cJSON_IsBool(create_response))
    {
    goto end; //Bool
    }
    create_response_local_var = malloc(sizeof(int));
    if(!create_response_local_var)
    {
        goto end;
    }
    *create_response_local_var = create_response->valueint;
    }


    if (type && !cJSON_IsNull(type)) type_local_str = strdup(type->valuestring);

    realtime_session_create_request_turn_detection_local_var = realtime_session_create_request_turn_detection_create_internal (
        type_local_str,
        threshold_local_var,
        prefix_padding_ms_local_var,
        silence_duration_ms_local_var,
        create_response_local_var
        );

    if (!realtime_session_create_request_turn_detection_local_var) {
        goto end;
    }

    return realtime_session_create_request_turn_detection_local_var;
end:
    if (type_local_str) {
        free(type_local_str);
        type_local_str = NULL;
    }
    if (threshold_local_var) {
        free(threshold_local_var);
        threshold_local_var = NULL;
    }
    if (prefix_padding_ms_local_var) {
        free(prefix_padding_ms_local_var);
        prefix_padding_ms_local_var = NULL;
    }
    if (silence_duration_ms_local_var) {
        free(silence_duration_ms_local_var);
        silence_duration_ms_local_var = NULL;
    }
    if (create_response_local_var) {
        free(create_response_local_var);
        create_response_local_var = NULL;
    }
    return NULL;

}
