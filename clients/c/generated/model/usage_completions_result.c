#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "usage_completions_result.h"


char* usage_completions_result_object_ToString(openai_api_usage_completions_result_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.usage.completions.result" };
    return objectArray[object];
}

openai_api_usage_completions_result_OBJECT_e usage_completions_result_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.usage.completions.result" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static usage_completions_result_t *usage_completions_result_create_internal(
    openai_api_usage_completions_result_OBJECT_e object,
    int *input_tokens,
    int *input_cached_tokens,
    int *output_tokens,
    int *input_audio_tokens,
    int *output_audio_tokens,
    int *num_model_requests,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model,
    int *batch
    ) {
    usage_completions_result_t *usage_completions_result_local_var = malloc(sizeof(usage_completions_result_t));
    if (!usage_completions_result_local_var) {
        return NULL;
    }
    memset(usage_completions_result_local_var, 0, sizeof(usage_completions_result_t));
    usage_completions_result_local_var->_library_owned = 1;
    usage_completions_result_local_var->object = object;
    usage_completions_result_local_var->input_tokens = input_tokens;
    usage_completions_result_local_var->input_cached_tokens = input_cached_tokens;
    usage_completions_result_local_var->output_tokens = output_tokens;
    usage_completions_result_local_var->input_audio_tokens = input_audio_tokens;
    usage_completions_result_local_var->output_audio_tokens = output_audio_tokens;
    usage_completions_result_local_var->num_model_requests = num_model_requests;
    usage_completions_result_local_var->project_id = project_id;
    usage_completions_result_local_var->user_id = user_id;
    usage_completions_result_local_var->api_key_id = api_key_id;
    usage_completions_result_local_var->model = model;
    usage_completions_result_local_var->batch = batch;
    return usage_completions_result_local_var;
}

__attribute__((deprecated)) usage_completions_result_t *usage_completions_result_create(
    openai_api_usage_completions_result_OBJECT_e object,
    int *input_tokens,
    int *input_cached_tokens,
    int *output_tokens,
    int *input_audio_tokens,
    int *output_audio_tokens,
    int *num_model_requests,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model,
    int *batch
    ) {
    int *input_tokens_copy = NULL;
    if (input_tokens) {
        input_tokens_copy = malloc(sizeof(int));
        if (input_tokens_copy) *input_tokens_copy = *input_tokens;
    }
    int *input_cached_tokens_copy = NULL;
    if (input_cached_tokens) {
        input_cached_tokens_copy = malloc(sizeof(int));
        if (input_cached_tokens_copy) *input_cached_tokens_copy = *input_cached_tokens;
    }
    int *output_tokens_copy = NULL;
    if (output_tokens) {
        output_tokens_copy = malloc(sizeof(int));
        if (output_tokens_copy) *output_tokens_copy = *output_tokens;
    }
    int *input_audio_tokens_copy = NULL;
    if (input_audio_tokens) {
        input_audio_tokens_copy = malloc(sizeof(int));
        if (input_audio_tokens_copy) *input_audio_tokens_copy = *input_audio_tokens;
    }
    int *output_audio_tokens_copy = NULL;
    if (output_audio_tokens) {
        output_audio_tokens_copy = malloc(sizeof(int));
        if (output_audio_tokens_copy) *output_audio_tokens_copy = *output_audio_tokens;
    }
    int *num_model_requests_copy = NULL;
    if (num_model_requests) {
        num_model_requests_copy = malloc(sizeof(int));
        if (num_model_requests_copy) *num_model_requests_copy = *num_model_requests;
    }
    int *batch_copy = NULL;
    if (batch) {
        batch_copy = malloc(sizeof(int));
        if (batch_copy) *batch_copy = *batch;
    }
    usage_completions_result_t *result = usage_completions_result_create_internal (
        object,
        input_tokens_copy,
        input_cached_tokens_copy,
        output_tokens_copy,
        input_audio_tokens_copy,
        output_audio_tokens_copy,
        num_model_requests_copy,
        project_id,
        user_id,
        api_key_id,
        model,
        batch_copy
        );
    if (!result) {
        free(input_tokens_copy);
        free(input_cached_tokens_copy);
        free(output_tokens_copy);
        free(input_audio_tokens_copy);
        free(output_audio_tokens_copy);
        free(num_model_requests_copy);
        free(batch_copy);
    }
    return result;
}

void usage_completions_result_free(usage_completions_result_t *usage_completions_result) {
    if(NULL == usage_completions_result){
        return ;
    }
    if(usage_completions_result->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "usage_completions_result_free");
        return ;
    }
    listEntry_t *listEntry;
    if (usage_completions_result->input_tokens) {
        free(usage_completions_result->input_tokens);
        usage_completions_result->input_tokens = NULL;
    }
    if (usage_completions_result->input_cached_tokens) {
        free(usage_completions_result->input_cached_tokens);
        usage_completions_result->input_cached_tokens = NULL;
    }
    if (usage_completions_result->output_tokens) {
        free(usage_completions_result->output_tokens);
        usage_completions_result->output_tokens = NULL;
    }
    if (usage_completions_result->input_audio_tokens) {
        free(usage_completions_result->input_audio_tokens);
        usage_completions_result->input_audio_tokens = NULL;
    }
    if (usage_completions_result->output_audio_tokens) {
        free(usage_completions_result->output_audio_tokens);
        usage_completions_result->output_audio_tokens = NULL;
    }
    if (usage_completions_result->num_model_requests) {
        free(usage_completions_result->num_model_requests);
        usage_completions_result->num_model_requests = NULL;
    }
    if (usage_completions_result->project_id) {
        free(usage_completions_result->project_id);
        usage_completions_result->project_id = NULL;
    }
    if (usage_completions_result->user_id) {
        free(usage_completions_result->user_id);
        usage_completions_result->user_id = NULL;
    }
    if (usage_completions_result->api_key_id) {
        free(usage_completions_result->api_key_id);
        usage_completions_result->api_key_id = NULL;
    }
    if (usage_completions_result->model) {
        free(usage_completions_result->model);
        usage_completions_result->model = NULL;
    }
    if (usage_completions_result->batch) {
        free(usage_completions_result->batch);
        usage_completions_result->batch = NULL;
    }
    free(usage_completions_result);
}

cJSON *usage_completions_result_convertToJSON(usage_completions_result_t *usage_completions_result) {
    cJSON *item = cJSON_CreateObject();

    // usage_completions_result->object
    if (openai_api_usage_completions_result_OBJECT_NULL == usage_completions_result->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", usage_completions_result_object_ToString(usage_completions_result->object)) == NULL)
    {
    goto fail; //Enum
    }


    // usage_completions_result->input_tokens
    if (!usage_completions_result->input_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "input_tokens", *usage_completions_result->input_tokens) == NULL) {
    goto fail; //Numeric
    }


    // usage_completions_result->input_cached_tokens
    if(usage_completions_result->input_cached_tokens) {
    if(cJSON_AddNumberToObject(item, "input_cached_tokens", *usage_completions_result->input_cached_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // usage_completions_result->output_tokens
    if (!usage_completions_result->output_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "output_tokens", *usage_completions_result->output_tokens) == NULL) {
    goto fail; //Numeric
    }


    // usage_completions_result->input_audio_tokens
    if(usage_completions_result->input_audio_tokens) {
    if(cJSON_AddNumberToObject(item, "input_audio_tokens", *usage_completions_result->input_audio_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // usage_completions_result->output_audio_tokens
    if(usage_completions_result->output_audio_tokens) {
    if(cJSON_AddNumberToObject(item, "output_audio_tokens", *usage_completions_result->output_audio_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // usage_completions_result->num_model_requests
    if (!usage_completions_result->num_model_requests) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "num_model_requests", *usage_completions_result->num_model_requests) == NULL) {
    goto fail; //Numeric
    }


    // usage_completions_result->project_id
    if(usage_completions_result->project_id) {
    if(cJSON_AddStringToObject(item, "project_id", usage_completions_result->project_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_completions_result->user_id
    if(usage_completions_result->user_id) {
    if(cJSON_AddStringToObject(item, "user_id", usage_completions_result->user_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_completions_result->api_key_id
    if(usage_completions_result->api_key_id) {
    if(cJSON_AddStringToObject(item, "api_key_id", usage_completions_result->api_key_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_completions_result->model
    if(usage_completions_result->model) {
    if(cJSON_AddStringToObject(item, "model", usage_completions_result->model) == NULL) {
    goto fail; //String
    }
    }


    // usage_completions_result->batch
    if(usage_completions_result->batch) {
    if(cJSON_AddBoolToObject(item, "batch", *usage_completions_result->batch) == NULL) {
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

usage_completions_result_t *usage_completions_result_parseFromJSON(cJSON *usage_completions_resultJSON){

    usage_completions_result_t *usage_completions_result_local_var = NULL;

    // define the local variable for usage_completions_result->input_tokens
    int *input_tokens_local_var = NULL;

    // define the local variable for usage_completions_result->input_cached_tokens
    int *input_cached_tokens_local_var = NULL;

    // define the local variable for usage_completions_result->output_tokens
    int *output_tokens_local_var = NULL;

    // define the local variable for usage_completions_result->input_audio_tokens
    int *input_audio_tokens_local_var = NULL;

    // define the local variable for usage_completions_result->output_audio_tokens
    int *output_audio_tokens_local_var = NULL;

    // define the local variable for usage_completions_result->num_model_requests
    int *num_model_requests_local_var = NULL;

    char *project_id_local_str = NULL;

    char *user_id_local_str = NULL;

    char *api_key_id_local_str = NULL;

    char *model_local_str = NULL;

    // define the local variable for usage_completions_result->batch
    int *batch_local_var = NULL;

    // usage_completions_result->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(usage_completions_resultJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_usage_completions_result_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = usage_completions_result_object_FromString(object->valuestring);

    // usage_completions_result->input_tokens
    cJSON *input_tokens = cJSON_GetObjectItemCaseSensitive(usage_completions_resultJSON, "input_tokens");
    if (cJSON_IsNull(input_tokens)) {
        input_tokens = NULL;
    }
    if (!input_tokens) {
        goto end;
    }

    
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

    // usage_completions_result->input_cached_tokens
    cJSON *input_cached_tokens = cJSON_GetObjectItemCaseSensitive(usage_completions_resultJSON, "input_cached_tokens");
    if (cJSON_IsNull(input_cached_tokens)) {
        input_cached_tokens = NULL;
    }
    if (input_cached_tokens) { 
    if(!cJSON_IsNumber(input_cached_tokens))
    {
    goto end; //Numeric
    }
    input_cached_tokens_local_var = malloc(sizeof(int));
    if(!input_cached_tokens_local_var)
    {
        goto end;
    }
    *input_cached_tokens_local_var = input_cached_tokens->valuedouble;
    }

    // usage_completions_result->output_tokens
    cJSON *output_tokens = cJSON_GetObjectItemCaseSensitive(usage_completions_resultJSON, "output_tokens");
    if (cJSON_IsNull(output_tokens)) {
        output_tokens = NULL;
    }
    if (!output_tokens) {
        goto end;
    }

    
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

    // usage_completions_result->input_audio_tokens
    cJSON *input_audio_tokens = cJSON_GetObjectItemCaseSensitive(usage_completions_resultJSON, "input_audio_tokens");
    if (cJSON_IsNull(input_audio_tokens)) {
        input_audio_tokens = NULL;
    }
    if (input_audio_tokens) { 
    if(!cJSON_IsNumber(input_audio_tokens))
    {
    goto end; //Numeric
    }
    input_audio_tokens_local_var = malloc(sizeof(int));
    if(!input_audio_tokens_local_var)
    {
        goto end;
    }
    *input_audio_tokens_local_var = input_audio_tokens->valuedouble;
    }

    // usage_completions_result->output_audio_tokens
    cJSON *output_audio_tokens = cJSON_GetObjectItemCaseSensitive(usage_completions_resultJSON, "output_audio_tokens");
    if (cJSON_IsNull(output_audio_tokens)) {
        output_audio_tokens = NULL;
    }
    if (output_audio_tokens) { 
    if(!cJSON_IsNumber(output_audio_tokens))
    {
    goto end; //Numeric
    }
    output_audio_tokens_local_var = malloc(sizeof(int));
    if(!output_audio_tokens_local_var)
    {
        goto end;
    }
    *output_audio_tokens_local_var = output_audio_tokens->valuedouble;
    }

    // usage_completions_result->num_model_requests
    cJSON *num_model_requests = cJSON_GetObjectItemCaseSensitive(usage_completions_resultJSON, "num_model_requests");
    if (cJSON_IsNull(num_model_requests)) {
        num_model_requests = NULL;
    }
    if (!num_model_requests) {
        goto end;
    }

    
    if(!cJSON_IsNumber(num_model_requests))
    {
    goto end; //Numeric
    }
    num_model_requests_local_var = malloc(sizeof(int));
    if(!num_model_requests_local_var)
    {
        goto end;
    }
    *num_model_requests_local_var = num_model_requests->valuedouble;

    // usage_completions_result->project_id
    cJSON *project_id = cJSON_GetObjectItemCaseSensitive(usage_completions_resultJSON, "project_id");
    if (cJSON_IsNull(project_id)) {
        project_id = NULL;
    }
    if (project_id) { 
    if(!cJSON_IsString(project_id) && !cJSON_IsNull(project_id))
    {
    goto end; //String
    }
    }

    // usage_completions_result->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(usage_completions_resultJSON, "user_id");
    if (cJSON_IsNull(user_id)) {
        user_id = NULL;
    }
    if (user_id) { 
    if(!cJSON_IsString(user_id) && !cJSON_IsNull(user_id))
    {
    goto end; //String
    }
    }

    // usage_completions_result->api_key_id
    cJSON *api_key_id = cJSON_GetObjectItemCaseSensitive(usage_completions_resultJSON, "api_key_id");
    if (cJSON_IsNull(api_key_id)) {
        api_key_id = NULL;
    }
    if (api_key_id) { 
    if(!cJSON_IsString(api_key_id) && !cJSON_IsNull(api_key_id))
    {
    goto end; //String
    }
    }

    // usage_completions_result->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(usage_completions_resultJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (model) { 
    if(!cJSON_IsString(model) && !cJSON_IsNull(model))
    {
    goto end; //String
    }
    }

    // usage_completions_result->batch
    cJSON *batch = cJSON_GetObjectItemCaseSensitive(usage_completions_resultJSON, "batch");
    if (cJSON_IsNull(batch)) {
        batch = NULL;
    }
    if (batch) { 
    if(!cJSON_IsBool(batch))
    {
    goto end; //Bool
    }
    batch_local_var = malloc(sizeof(int));
    if(!batch_local_var)
    {
        goto end;
    }
    *batch_local_var = batch->valueint;
    }


    if (project_id && !cJSON_IsNull(project_id)) project_id_local_str = strdup(project_id->valuestring);
    if (user_id && !cJSON_IsNull(user_id)) user_id_local_str = strdup(user_id->valuestring);
    if (api_key_id && !cJSON_IsNull(api_key_id)) api_key_id_local_str = strdup(api_key_id->valuestring);
    if (model && !cJSON_IsNull(model)) model_local_str = strdup(model->valuestring);

    usage_completions_result_local_var = usage_completions_result_create_internal (
        objectVariable,
        input_tokens_local_var,
        input_cached_tokens_local_var,
        output_tokens_local_var,
        input_audio_tokens_local_var,
        output_audio_tokens_local_var,
        num_model_requests_local_var,
        project_id_local_str,
        user_id_local_str,
        api_key_id_local_str,
        model_local_str,
        batch_local_var
        );

    if (!usage_completions_result_local_var) {
        goto end;
    }

    return usage_completions_result_local_var;
end:
    if (input_tokens_local_var) {
        free(input_tokens_local_var);
        input_tokens_local_var = NULL;
    }
    if (input_cached_tokens_local_var) {
        free(input_cached_tokens_local_var);
        input_cached_tokens_local_var = NULL;
    }
    if (output_tokens_local_var) {
        free(output_tokens_local_var);
        output_tokens_local_var = NULL;
    }
    if (input_audio_tokens_local_var) {
        free(input_audio_tokens_local_var);
        input_audio_tokens_local_var = NULL;
    }
    if (output_audio_tokens_local_var) {
        free(output_audio_tokens_local_var);
        output_audio_tokens_local_var = NULL;
    }
    if (num_model_requests_local_var) {
        free(num_model_requests_local_var);
        num_model_requests_local_var = NULL;
    }
    if (project_id_local_str) {
        free(project_id_local_str);
        project_id_local_str = NULL;
    }
    if (user_id_local_str) {
        free(user_id_local_str);
        user_id_local_str = NULL;
    }
    if (api_key_id_local_str) {
        free(api_key_id_local_str);
        api_key_id_local_str = NULL;
    }
    if (model_local_str) {
        free(model_local_str);
        model_local_str = NULL;
    }
    if (batch_local_var) {
        free(batch_local_var);
        batch_local_var = NULL;
    }
    return NULL;

}
