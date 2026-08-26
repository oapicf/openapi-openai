#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "usage_time_bucket_result_inner.h"


char* usage_time_bucket_result_inner_object_ToString(openai_api_usage_time_bucket_result_inner_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.costs.result" };
    return objectArray[object];
}

openai_api_usage_time_bucket_result_inner_OBJECT_e usage_time_bucket_result_inner_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.costs.result" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static usage_time_bucket_result_inner_t *usage_time_bucket_result_inner_create_internal(
    openai_api_usage_time_bucket_result_inner_OBJECT_e object,
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
    int *batch,
    int *images,
    char *source,
    char *size,
    int *characters,
    int *seconds,
    int *usage_bytes,
    int *sessions,
    costs_result_amount_t *amount,
    char *line_item
    ) {
    usage_time_bucket_result_inner_t *usage_time_bucket_result_inner_local_var = malloc(sizeof(usage_time_bucket_result_inner_t));
    if (!usage_time_bucket_result_inner_local_var) {
        return NULL;
    }
    memset(usage_time_bucket_result_inner_local_var, 0, sizeof(usage_time_bucket_result_inner_t));
    usage_time_bucket_result_inner_local_var->_library_owned = 1;
    usage_time_bucket_result_inner_local_var->object = object;
    usage_time_bucket_result_inner_local_var->input_tokens = input_tokens;
    usage_time_bucket_result_inner_local_var->input_cached_tokens = input_cached_tokens;
    usage_time_bucket_result_inner_local_var->output_tokens = output_tokens;
    usage_time_bucket_result_inner_local_var->input_audio_tokens = input_audio_tokens;
    usage_time_bucket_result_inner_local_var->output_audio_tokens = output_audio_tokens;
    usage_time_bucket_result_inner_local_var->num_model_requests = num_model_requests;
    usage_time_bucket_result_inner_local_var->project_id = project_id;
    usage_time_bucket_result_inner_local_var->user_id = user_id;
    usage_time_bucket_result_inner_local_var->api_key_id = api_key_id;
    usage_time_bucket_result_inner_local_var->model = model;
    usage_time_bucket_result_inner_local_var->batch = batch;
    usage_time_bucket_result_inner_local_var->images = images;
    usage_time_bucket_result_inner_local_var->source = source;
    usage_time_bucket_result_inner_local_var->size = size;
    usage_time_bucket_result_inner_local_var->characters = characters;
    usage_time_bucket_result_inner_local_var->seconds = seconds;
    usage_time_bucket_result_inner_local_var->usage_bytes = usage_bytes;
    usage_time_bucket_result_inner_local_var->sessions = sessions;
    usage_time_bucket_result_inner_local_var->amount = amount;
    usage_time_bucket_result_inner_local_var->line_item = line_item;
    return usage_time_bucket_result_inner_local_var;
}

__attribute__((deprecated)) usage_time_bucket_result_inner_t *usage_time_bucket_result_inner_create(
    openai_api_usage_time_bucket_result_inner_OBJECT_e object,
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
    int *batch,
    int *images,
    char *source,
    char *size,
    int *characters,
    int *seconds,
    int *usage_bytes,
    int *sessions,
    costs_result_amount_t *amount,
    char *line_item
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
    int *images_copy = NULL;
    if (images) {
        images_copy = malloc(sizeof(int));
        if (images_copy) *images_copy = *images;
    }
    int *characters_copy = NULL;
    if (characters) {
        characters_copy = malloc(sizeof(int));
        if (characters_copy) *characters_copy = *characters;
    }
    int *seconds_copy = NULL;
    if (seconds) {
        seconds_copy = malloc(sizeof(int));
        if (seconds_copy) *seconds_copy = *seconds;
    }
    int *usage_bytes_copy = NULL;
    if (usage_bytes) {
        usage_bytes_copy = malloc(sizeof(int));
        if (usage_bytes_copy) *usage_bytes_copy = *usage_bytes;
    }
    int *sessions_copy = NULL;
    if (sessions) {
        sessions_copy = malloc(sizeof(int));
        if (sessions_copy) *sessions_copy = *sessions;
    }
    usage_time_bucket_result_inner_t *result = usage_time_bucket_result_inner_create_internal (
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
        batch_copy,
        images_copy,
        source,
        size,
        characters_copy,
        seconds_copy,
        usage_bytes_copy,
        sessions_copy,
        amount,
        line_item
        );
    if (!result) {
        free(input_tokens_copy);
        free(input_cached_tokens_copy);
        free(output_tokens_copy);
        free(input_audio_tokens_copy);
        free(output_audio_tokens_copy);
        free(num_model_requests_copy);
        free(batch_copy);
        free(images_copy);
        free(characters_copy);
        free(seconds_copy);
        free(usage_bytes_copy);
        free(sessions_copy);
    }
    return result;
}

void usage_time_bucket_result_inner_free(usage_time_bucket_result_inner_t *usage_time_bucket_result_inner) {
    if(NULL == usage_time_bucket_result_inner){
        return ;
    }
    if(usage_time_bucket_result_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "usage_time_bucket_result_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (usage_time_bucket_result_inner->input_tokens) {
        free(usage_time_bucket_result_inner->input_tokens);
        usage_time_bucket_result_inner->input_tokens = NULL;
    }
    if (usage_time_bucket_result_inner->input_cached_tokens) {
        free(usage_time_bucket_result_inner->input_cached_tokens);
        usage_time_bucket_result_inner->input_cached_tokens = NULL;
    }
    if (usage_time_bucket_result_inner->output_tokens) {
        free(usage_time_bucket_result_inner->output_tokens);
        usage_time_bucket_result_inner->output_tokens = NULL;
    }
    if (usage_time_bucket_result_inner->input_audio_tokens) {
        free(usage_time_bucket_result_inner->input_audio_tokens);
        usage_time_bucket_result_inner->input_audio_tokens = NULL;
    }
    if (usage_time_bucket_result_inner->output_audio_tokens) {
        free(usage_time_bucket_result_inner->output_audio_tokens);
        usage_time_bucket_result_inner->output_audio_tokens = NULL;
    }
    if (usage_time_bucket_result_inner->num_model_requests) {
        free(usage_time_bucket_result_inner->num_model_requests);
        usage_time_bucket_result_inner->num_model_requests = NULL;
    }
    if (usage_time_bucket_result_inner->project_id) {
        free(usage_time_bucket_result_inner->project_id);
        usage_time_bucket_result_inner->project_id = NULL;
    }
    if (usage_time_bucket_result_inner->user_id) {
        free(usage_time_bucket_result_inner->user_id);
        usage_time_bucket_result_inner->user_id = NULL;
    }
    if (usage_time_bucket_result_inner->api_key_id) {
        free(usage_time_bucket_result_inner->api_key_id);
        usage_time_bucket_result_inner->api_key_id = NULL;
    }
    if (usage_time_bucket_result_inner->model) {
        free(usage_time_bucket_result_inner->model);
        usage_time_bucket_result_inner->model = NULL;
    }
    if (usage_time_bucket_result_inner->batch) {
        free(usage_time_bucket_result_inner->batch);
        usage_time_bucket_result_inner->batch = NULL;
    }
    if (usage_time_bucket_result_inner->images) {
        free(usage_time_bucket_result_inner->images);
        usage_time_bucket_result_inner->images = NULL;
    }
    if (usage_time_bucket_result_inner->source) {
        free(usage_time_bucket_result_inner->source);
        usage_time_bucket_result_inner->source = NULL;
    }
    if (usage_time_bucket_result_inner->size) {
        free(usage_time_bucket_result_inner->size);
        usage_time_bucket_result_inner->size = NULL;
    }
    if (usage_time_bucket_result_inner->characters) {
        free(usage_time_bucket_result_inner->characters);
        usage_time_bucket_result_inner->characters = NULL;
    }
    if (usage_time_bucket_result_inner->seconds) {
        free(usage_time_bucket_result_inner->seconds);
        usage_time_bucket_result_inner->seconds = NULL;
    }
    if (usage_time_bucket_result_inner->usage_bytes) {
        free(usage_time_bucket_result_inner->usage_bytes);
        usage_time_bucket_result_inner->usage_bytes = NULL;
    }
    if (usage_time_bucket_result_inner->sessions) {
        free(usage_time_bucket_result_inner->sessions);
        usage_time_bucket_result_inner->sessions = NULL;
    }
    if (usage_time_bucket_result_inner->amount) {
        costs_result_amount_free(usage_time_bucket_result_inner->amount);
        usage_time_bucket_result_inner->amount = NULL;
    }
    if (usage_time_bucket_result_inner->line_item) {
        free(usage_time_bucket_result_inner->line_item);
        usage_time_bucket_result_inner->line_item = NULL;
    }
    free(usage_time_bucket_result_inner);
}

cJSON *usage_time_bucket_result_inner_convertToJSON(usage_time_bucket_result_inner_t *usage_time_bucket_result_inner) {
    cJSON *item = cJSON_CreateObject();

    // usage_time_bucket_result_inner->object
    if (openai_api_usage_time_bucket_result_inner_OBJECT_NULL == usage_time_bucket_result_inner->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", usage_time_bucket_result_inner_object_ToString(usage_time_bucket_result_inner->object)) == NULL)
    {
    goto fail; //Enum
    }


    // usage_time_bucket_result_inner->input_tokens
    if (!usage_time_bucket_result_inner->input_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "input_tokens", *usage_time_bucket_result_inner->input_tokens) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket_result_inner->input_cached_tokens
    if(usage_time_bucket_result_inner->input_cached_tokens) {
    if(cJSON_AddNumberToObject(item, "input_cached_tokens", *usage_time_bucket_result_inner->input_cached_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // usage_time_bucket_result_inner->output_tokens
    if (!usage_time_bucket_result_inner->output_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "output_tokens", *usage_time_bucket_result_inner->output_tokens) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket_result_inner->input_audio_tokens
    if(usage_time_bucket_result_inner->input_audio_tokens) {
    if(cJSON_AddNumberToObject(item, "input_audio_tokens", *usage_time_bucket_result_inner->input_audio_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // usage_time_bucket_result_inner->output_audio_tokens
    if(usage_time_bucket_result_inner->output_audio_tokens) {
    if(cJSON_AddNumberToObject(item, "output_audio_tokens", *usage_time_bucket_result_inner->output_audio_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // usage_time_bucket_result_inner->num_model_requests
    if (!usage_time_bucket_result_inner->num_model_requests) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "num_model_requests", *usage_time_bucket_result_inner->num_model_requests) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket_result_inner->project_id
    if(usage_time_bucket_result_inner->project_id) {
    if(cJSON_AddStringToObject(item, "project_id", usage_time_bucket_result_inner->project_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_time_bucket_result_inner->user_id
    if(usage_time_bucket_result_inner->user_id) {
    if(cJSON_AddStringToObject(item, "user_id", usage_time_bucket_result_inner->user_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_time_bucket_result_inner->api_key_id
    if(usage_time_bucket_result_inner->api_key_id) {
    if(cJSON_AddStringToObject(item, "api_key_id", usage_time_bucket_result_inner->api_key_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_time_bucket_result_inner->model
    if(usage_time_bucket_result_inner->model) {
    if(cJSON_AddStringToObject(item, "model", usage_time_bucket_result_inner->model) == NULL) {
    goto fail; //String
    }
    }


    // usage_time_bucket_result_inner->batch
    if(usage_time_bucket_result_inner->batch) {
    if(cJSON_AddBoolToObject(item, "batch", *usage_time_bucket_result_inner->batch) == NULL) {
    goto fail; //Bool
    }
    }


    // usage_time_bucket_result_inner->images
    if (!usage_time_bucket_result_inner->images) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "images", *usage_time_bucket_result_inner->images) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket_result_inner->source
    if(usage_time_bucket_result_inner->source) {
    if(cJSON_AddStringToObject(item, "source", usage_time_bucket_result_inner->source) == NULL) {
    goto fail; //String
    }
    }


    // usage_time_bucket_result_inner->size
    if(usage_time_bucket_result_inner->size) {
    if(cJSON_AddStringToObject(item, "size", usage_time_bucket_result_inner->size) == NULL) {
    goto fail; //String
    }
    }


    // usage_time_bucket_result_inner->characters
    if (!usage_time_bucket_result_inner->characters) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "characters", *usage_time_bucket_result_inner->characters) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket_result_inner->seconds
    if (!usage_time_bucket_result_inner->seconds) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "seconds", *usage_time_bucket_result_inner->seconds) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket_result_inner->usage_bytes
    if (!usage_time_bucket_result_inner->usage_bytes) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "usage_bytes", *usage_time_bucket_result_inner->usage_bytes) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket_result_inner->sessions
    if (!usage_time_bucket_result_inner->sessions) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "sessions", *usage_time_bucket_result_inner->sessions) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket_result_inner->amount
    if(usage_time_bucket_result_inner->amount) {
    cJSON *amount_local_JSON = costs_result_amount_convertToJSON(usage_time_bucket_result_inner->amount);
    if(amount_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "amount", amount_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // usage_time_bucket_result_inner->line_item
    if(usage_time_bucket_result_inner->line_item) {
    if(cJSON_AddStringToObject(item, "line_item", usage_time_bucket_result_inner->line_item) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

usage_time_bucket_result_inner_t *usage_time_bucket_result_inner_parseFromJSON(cJSON *usage_time_bucket_result_innerJSON){

    usage_time_bucket_result_inner_t *usage_time_bucket_result_inner_local_var = NULL;

    // define the local variable for usage_time_bucket_result_inner->input_tokens
    int *input_tokens_local_var = NULL;

    // define the local variable for usage_time_bucket_result_inner->input_cached_tokens
    int *input_cached_tokens_local_var = NULL;

    // define the local variable for usage_time_bucket_result_inner->output_tokens
    int *output_tokens_local_var = NULL;

    // define the local variable for usage_time_bucket_result_inner->input_audio_tokens
    int *input_audio_tokens_local_var = NULL;

    // define the local variable for usage_time_bucket_result_inner->output_audio_tokens
    int *output_audio_tokens_local_var = NULL;

    // define the local variable for usage_time_bucket_result_inner->num_model_requests
    int *num_model_requests_local_var = NULL;

    char *project_id_local_str = NULL;

    char *user_id_local_str = NULL;

    char *api_key_id_local_str = NULL;

    char *model_local_str = NULL;

    // define the local variable for usage_time_bucket_result_inner->batch
    int *batch_local_var = NULL;

    // define the local variable for usage_time_bucket_result_inner->images
    int *images_local_var = NULL;

    char *source_local_str = NULL;

    char *size_local_str = NULL;

    // define the local variable for usage_time_bucket_result_inner->characters
    int *characters_local_var = NULL;

    // define the local variable for usage_time_bucket_result_inner->seconds
    int *seconds_local_var = NULL;

    // define the local variable for usage_time_bucket_result_inner->usage_bytes
    int *usage_bytes_local_var = NULL;

    // define the local variable for usage_time_bucket_result_inner->sessions
    int *sessions_local_var = NULL;

    // define the local variable for usage_time_bucket_result_inner->amount
    costs_result_amount_t *amount_local_nonprim = NULL;

    char *line_item_local_str = NULL;

    // usage_time_bucket_result_inner->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_usage_time_bucket_result_inner_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = usage_time_bucket_result_inner_object_FromString(object->valuestring);

    // usage_time_bucket_result_inner->input_tokens
    cJSON *input_tokens = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "input_tokens");
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

    // usage_time_bucket_result_inner->input_cached_tokens
    cJSON *input_cached_tokens = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "input_cached_tokens");
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

    // usage_time_bucket_result_inner->output_tokens
    cJSON *output_tokens = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "output_tokens");
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

    // usage_time_bucket_result_inner->input_audio_tokens
    cJSON *input_audio_tokens = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "input_audio_tokens");
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

    // usage_time_bucket_result_inner->output_audio_tokens
    cJSON *output_audio_tokens = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "output_audio_tokens");
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

    // usage_time_bucket_result_inner->num_model_requests
    cJSON *num_model_requests = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "num_model_requests");
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

    // usage_time_bucket_result_inner->project_id
    cJSON *project_id = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "project_id");
    if (cJSON_IsNull(project_id)) {
        project_id = NULL;
    }
    if (project_id) { 
    if(!cJSON_IsString(project_id) && !cJSON_IsNull(project_id))
    {
    goto end; //String
    }
    }

    // usage_time_bucket_result_inner->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "user_id");
    if (cJSON_IsNull(user_id)) {
        user_id = NULL;
    }
    if (user_id) { 
    if(!cJSON_IsString(user_id) && !cJSON_IsNull(user_id))
    {
    goto end; //String
    }
    }

    // usage_time_bucket_result_inner->api_key_id
    cJSON *api_key_id = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "api_key_id");
    if (cJSON_IsNull(api_key_id)) {
        api_key_id = NULL;
    }
    if (api_key_id) { 
    if(!cJSON_IsString(api_key_id) && !cJSON_IsNull(api_key_id))
    {
    goto end; //String
    }
    }

    // usage_time_bucket_result_inner->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (model) { 
    if(!cJSON_IsString(model) && !cJSON_IsNull(model))
    {
    goto end; //String
    }
    }

    // usage_time_bucket_result_inner->batch
    cJSON *batch = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "batch");
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

    // usage_time_bucket_result_inner->images
    cJSON *images = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "images");
    if (cJSON_IsNull(images)) {
        images = NULL;
    }
    if (!images) {
        goto end;
    }

    
    if(!cJSON_IsNumber(images))
    {
    goto end; //Numeric
    }
    images_local_var = malloc(sizeof(int));
    if(!images_local_var)
    {
        goto end;
    }
    *images_local_var = images->valuedouble;

    // usage_time_bucket_result_inner->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "source");
    if (cJSON_IsNull(source)) {
        source = NULL;
    }
    if (source) { 
    if(!cJSON_IsString(source) && !cJSON_IsNull(source))
    {
    goto end; //String
    }
    }

    // usage_time_bucket_result_inner->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "size");
    if (cJSON_IsNull(size)) {
        size = NULL;
    }
    if (size) { 
    if(!cJSON_IsString(size) && !cJSON_IsNull(size))
    {
    goto end; //String
    }
    }

    // usage_time_bucket_result_inner->characters
    cJSON *characters = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "characters");
    if (cJSON_IsNull(characters)) {
        characters = NULL;
    }
    if (!characters) {
        goto end;
    }

    
    if(!cJSON_IsNumber(characters))
    {
    goto end; //Numeric
    }
    characters_local_var = malloc(sizeof(int));
    if(!characters_local_var)
    {
        goto end;
    }
    *characters_local_var = characters->valuedouble;

    // usage_time_bucket_result_inner->seconds
    cJSON *seconds = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "seconds");
    if (cJSON_IsNull(seconds)) {
        seconds = NULL;
    }
    if (!seconds) {
        goto end;
    }

    
    if(!cJSON_IsNumber(seconds))
    {
    goto end; //Numeric
    }
    seconds_local_var = malloc(sizeof(int));
    if(!seconds_local_var)
    {
        goto end;
    }
    *seconds_local_var = seconds->valuedouble;

    // usage_time_bucket_result_inner->usage_bytes
    cJSON *usage_bytes = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "usage_bytes");
    if (cJSON_IsNull(usage_bytes)) {
        usage_bytes = NULL;
    }
    if (!usage_bytes) {
        goto end;
    }

    
    if(!cJSON_IsNumber(usage_bytes))
    {
    goto end; //Numeric
    }
    usage_bytes_local_var = malloc(sizeof(int));
    if(!usage_bytes_local_var)
    {
        goto end;
    }
    *usage_bytes_local_var = usage_bytes->valuedouble;

    // usage_time_bucket_result_inner->sessions
    cJSON *sessions = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "sessions");
    if (cJSON_IsNull(sessions)) {
        sessions = NULL;
    }
    if (!sessions) {
        goto end;
    }

    
    if(!cJSON_IsNumber(sessions))
    {
    goto end; //Numeric
    }
    sessions_local_var = malloc(sizeof(int));
    if(!sessions_local_var)
    {
        goto end;
    }
    *sessions_local_var = sessions->valuedouble;

    // usage_time_bucket_result_inner->amount
    cJSON *amount = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "amount");
    if (cJSON_IsNull(amount)) {
        amount = NULL;
    }
    if (amount) { 
    amount_local_nonprim = costs_result_amount_parseFromJSON(amount); //nonprimitive
    }

    // usage_time_bucket_result_inner->line_item
    cJSON *line_item = cJSON_GetObjectItemCaseSensitive(usage_time_bucket_result_innerJSON, "line_item");
    if (cJSON_IsNull(line_item)) {
        line_item = NULL;
    }
    if (line_item) { 
    if(!cJSON_IsString(line_item) && !cJSON_IsNull(line_item))
    {
    goto end; //String
    }
    }


    if (project_id && !cJSON_IsNull(project_id)) project_id_local_str = strdup(project_id->valuestring);
    if (user_id && !cJSON_IsNull(user_id)) user_id_local_str = strdup(user_id->valuestring);
    if (api_key_id && !cJSON_IsNull(api_key_id)) api_key_id_local_str = strdup(api_key_id->valuestring);
    if (model && !cJSON_IsNull(model)) model_local_str = strdup(model->valuestring);
    if (source && !cJSON_IsNull(source)) source_local_str = strdup(source->valuestring);
    if (size && !cJSON_IsNull(size)) size_local_str = strdup(size->valuestring);
    if (line_item && !cJSON_IsNull(line_item)) line_item_local_str = strdup(line_item->valuestring);

    usage_time_bucket_result_inner_local_var = usage_time_bucket_result_inner_create_internal (
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
        batch_local_var,
        images_local_var,
        source_local_str,
        size_local_str,
        characters_local_var,
        seconds_local_var,
        usage_bytes_local_var,
        sessions_local_var,
        amount ? amount_local_nonprim : NULL,
        line_item_local_str
        );

    if (!usage_time_bucket_result_inner_local_var) {
        goto end;
    }

    return usage_time_bucket_result_inner_local_var;
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
    if (images_local_var) {
        free(images_local_var);
        images_local_var = NULL;
    }
    if (source_local_str) {
        free(source_local_str);
        source_local_str = NULL;
    }
    if (size_local_str) {
        free(size_local_str);
        size_local_str = NULL;
    }
    if (characters_local_var) {
        free(characters_local_var);
        characters_local_var = NULL;
    }
    if (seconds_local_var) {
        free(seconds_local_var);
        seconds_local_var = NULL;
    }
    if (usage_bytes_local_var) {
        free(usage_bytes_local_var);
        usage_bytes_local_var = NULL;
    }
    if (sessions_local_var) {
        free(sessions_local_var);
        sessions_local_var = NULL;
    }
    if (amount_local_nonprim) {
        costs_result_amount_free(amount_local_nonprim);
        amount_local_nonprim = NULL;
    }
    if (line_item_local_str) {
        free(line_item_local_str);
        line_item_local_str = NULL;
    }
    return NULL;

}
