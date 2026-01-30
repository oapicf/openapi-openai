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
    int input_tokens,
    int input_cached_tokens,
    int output_tokens,
    int input_audio_tokens,
    int output_audio_tokens,
    int num_model_requests,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model,
    int batch,
    int images,
    char *source,
    char *size,
    int characters,
    int seconds,
    int usage_bytes,
    int sessions,
    costs_result_amount_t *amount,
    char *line_item
    ) {
    usage_time_bucket_result_inner_t *usage_time_bucket_result_inner_local_var = malloc(sizeof(usage_time_bucket_result_inner_t));
    if (!usage_time_bucket_result_inner_local_var) {
        return NULL;
    }
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

    usage_time_bucket_result_inner_local_var->_library_owned = 1;
    return usage_time_bucket_result_inner_local_var;
}

__attribute__((deprecated)) usage_time_bucket_result_inner_t *usage_time_bucket_result_inner_create(
    openai_api_usage_time_bucket_result_inner_OBJECT_e object,
    int input_tokens,
    int input_cached_tokens,
    int output_tokens,
    int input_audio_tokens,
    int output_audio_tokens,
    int num_model_requests,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model,
    int batch,
    int images,
    char *source,
    char *size,
    int characters,
    int seconds,
    int usage_bytes,
    int sessions,
    costs_result_amount_t *amount,
    char *line_item
    ) {
    return usage_time_bucket_result_inner_create_internal (
        object,
        input_tokens,
        input_cached_tokens,
        output_tokens,
        input_audio_tokens,
        output_audio_tokens,
        num_model_requests,
        project_id,
        user_id,
        api_key_id,
        model,
        batch,
        images,
        source,
        size,
        characters,
        seconds,
        usage_bytes,
        sessions,
        amount,
        line_item
        );
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
    if (usage_time_bucket_result_inner->source) {
        free(usage_time_bucket_result_inner->source);
        usage_time_bucket_result_inner->source = NULL;
    }
    if (usage_time_bucket_result_inner->size) {
        free(usage_time_bucket_result_inner->size);
        usage_time_bucket_result_inner->size = NULL;
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
    if(cJSON_AddNumberToObject(item, "input_tokens", usage_time_bucket_result_inner->input_tokens) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket_result_inner->input_cached_tokens
    if(usage_time_bucket_result_inner->input_cached_tokens) {
    if(cJSON_AddNumberToObject(item, "input_cached_tokens", usage_time_bucket_result_inner->input_cached_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // usage_time_bucket_result_inner->output_tokens
    if (!usage_time_bucket_result_inner->output_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "output_tokens", usage_time_bucket_result_inner->output_tokens) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket_result_inner->input_audio_tokens
    if(usage_time_bucket_result_inner->input_audio_tokens) {
    if(cJSON_AddNumberToObject(item, "input_audio_tokens", usage_time_bucket_result_inner->input_audio_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // usage_time_bucket_result_inner->output_audio_tokens
    if(usage_time_bucket_result_inner->output_audio_tokens) {
    if(cJSON_AddNumberToObject(item, "output_audio_tokens", usage_time_bucket_result_inner->output_audio_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // usage_time_bucket_result_inner->num_model_requests
    if (!usage_time_bucket_result_inner->num_model_requests) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "num_model_requests", usage_time_bucket_result_inner->num_model_requests) == NULL) {
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
    if(cJSON_AddBoolToObject(item, "batch", usage_time_bucket_result_inner->batch) == NULL) {
    goto fail; //Bool
    }
    }


    // usage_time_bucket_result_inner->images
    if (!usage_time_bucket_result_inner->images) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "images", usage_time_bucket_result_inner->images) == NULL) {
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
    if(cJSON_AddNumberToObject(item, "characters", usage_time_bucket_result_inner->characters) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket_result_inner->seconds
    if (!usage_time_bucket_result_inner->seconds) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "seconds", usage_time_bucket_result_inner->seconds) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket_result_inner->usage_bytes
    if (!usage_time_bucket_result_inner->usage_bytes) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "usage_bytes", usage_time_bucket_result_inner->usage_bytes) == NULL) {
    goto fail; //Numeric
    }


    // usage_time_bucket_result_inner->sessions
    if (!usage_time_bucket_result_inner->sessions) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "sessions", usage_time_bucket_result_inner->sessions) == NULL) {
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

    // define the local variable for usage_time_bucket_result_inner->amount
    costs_result_amount_t *amount_local_nonprim = NULL;

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


    usage_time_bucket_result_inner_local_var = usage_time_bucket_result_inner_create_internal (
        objectVariable,
        input_tokens->valuedouble,
        input_cached_tokens ? input_cached_tokens->valuedouble : 0,
        output_tokens->valuedouble,
        input_audio_tokens ? input_audio_tokens->valuedouble : 0,
        output_audio_tokens ? output_audio_tokens->valuedouble : 0,
        num_model_requests->valuedouble,
        project_id && !cJSON_IsNull(project_id) ? strdup(project_id->valuestring) : NULL,
        user_id && !cJSON_IsNull(user_id) ? strdup(user_id->valuestring) : NULL,
        api_key_id && !cJSON_IsNull(api_key_id) ? strdup(api_key_id->valuestring) : NULL,
        model && !cJSON_IsNull(model) ? strdup(model->valuestring) : NULL,
        batch ? batch->valueint : 0,
        images->valuedouble,
        source && !cJSON_IsNull(source) ? strdup(source->valuestring) : NULL,
        size && !cJSON_IsNull(size) ? strdup(size->valuestring) : NULL,
        characters->valuedouble,
        seconds->valuedouble,
        usage_bytes->valuedouble,
        sessions->valuedouble,
        amount ? amount_local_nonprim : NULL,
        line_item && !cJSON_IsNull(line_item) ? strdup(line_item->valuestring) : NULL
        );

    return usage_time_bucket_result_inner_local_var;
end:
    if (amount_local_nonprim) {
        costs_result_amount_free(amount_local_nonprim);
        amount_local_nonprim = NULL;
    }
    return NULL;

}
