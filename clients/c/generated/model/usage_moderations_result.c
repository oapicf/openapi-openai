#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "usage_moderations_result.h"


char* usage_moderations_result_object_ToString(openai_api_usage_moderations_result_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.usage.moderations.result" };
    return objectArray[object];
}

openai_api_usage_moderations_result_OBJECT_e usage_moderations_result_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.usage.moderations.result" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static usage_moderations_result_t *usage_moderations_result_create_internal(
    openai_api_usage_moderations_result_OBJECT_e object,
    int input_tokens,
    int num_model_requests,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model
    ) {
    usage_moderations_result_t *usage_moderations_result_local_var = malloc(sizeof(usage_moderations_result_t));
    if (!usage_moderations_result_local_var) {
        return NULL;
    }
    usage_moderations_result_local_var->object = object;
    usage_moderations_result_local_var->input_tokens = input_tokens;
    usage_moderations_result_local_var->num_model_requests = num_model_requests;
    usage_moderations_result_local_var->project_id = project_id;
    usage_moderations_result_local_var->user_id = user_id;
    usage_moderations_result_local_var->api_key_id = api_key_id;
    usage_moderations_result_local_var->model = model;

    usage_moderations_result_local_var->_library_owned = 1;
    return usage_moderations_result_local_var;
}

__attribute__((deprecated)) usage_moderations_result_t *usage_moderations_result_create(
    openai_api_usage_moderations_result_OBJECT_e object,
    int input_tokens,
    int num_model_requests,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model
    ) {
    return usage_moderations_result_create_internal (
        object,
        input_tokens,
        num_model_requests,
        project_id,
        user_id,
        api_key_id,
        model
        );
}

void usage_moderations_result_free(usage_moderations_result_t *usage_moderations_result) {
    if(NULL == usage_moderations_result){
        return ;
    }
    if(usage_moderations_result->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "usage_moderations_result_free");
        return ;
    }
    listEntry_t *listEntry;
    if (usage_moderations_result->project_id) {
        free(usage_moderations_result->project_id);
        usage_moderations_result->project_id = NULL;
    }
    if (usage_moderations_result->user_id) {
        free(usage_moderations_result->user_id);
        usage_moderations_result->user_id = NULL;
    }
    if (usage_moderations_result->api_key_id) {
        free(usage_moderations_result->api_key_id);
        usage_moderations_result->api_key_id = NULL;
    }
    if (usage_moderations_result->model) {
        free(usage_moderations_result->model);
        usage_moderations_result->model = NULL;
    }
    free(usage_moderations_result);
}

cJSON *usage_moderations_result_convertToJSON(usage_moderations_result_t *usage_moderations_result) {
    cJSON *item = cJSON_CreateObject();

    // usage_moderations_result->object
    if (openai_api_usage_moderations_result_OBJECT_NULL == usage_moderations_result->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", usage_moderations_result_object_ToString(usage_moderations_result->object)) == NULL)
    {
    goto fail; //Enum
    }


    // usage_moderations_result->input_tokens
    if (!usage_moderations_result->input_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "input_tokens", usage_moderations_result->input_tokens) == NULL) {
    goto fail; //Numeric
    }


    // usage_moderations_result->num_model_requests
    if (!usage_moderations_result->num_model_requests) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "num_model_requests", usage_moderations_result->num_model_requests) == NULL) {
    goto fail; //Numeric
    }


    // usage_moderations_result->project_id
    if(usage_moderations_result->project_id) {
    if(cJSON_AddStringToObject(item, "project_id", usage_moderations_result->project_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_moderations_result->user_id
    if(usage_moderations_result->user_id) {
    if(cJSON_AddStringToObject(item, "user_id", usage_moderations_result->user_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_moderations_result->api_key_id
    if(usage_moderations_result->api_key_id) {
    if(cJSON_AddStringToObject(item, "api_key_id", usage_moderations_result->api_key_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_moderations_result->model
    if(usage_moderations_result->model) {
    if(cJSON_AddStringToObject(item, "model", usage_moderations_result->model) == NULL) {
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

usage_moderations_result_t *usage_moderations_result_parseFromJSON(cJSON *usage_moderations_resultJSON){

    usage_moderations_result_t *usage_moderations_result_local_var = NULL;

    // usage_moderations_result->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(usage_moderations_resultJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_usage_moderations_result_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = usage_moderations_result_object_FromString(object->valuestring);

    // usage_moderations_result->input_tokens
    cJSON *input_tokens = cJSON_GetObjectItemCaseSensitive(usage_moderations_resultJSON, "input_tokens");
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

    // usage_moderations_result->num_model_requests
    cJSON *num_model_requests = cJSON_GetObjectItemCaseSensitive(usage_moderations_resultJSON, "num_model_requests");
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

    // usage_moderations_result->project_id
    cJSON *project_id = cJSON_GetObjectItemCaseSensitive(usage_moderations_resultJSON, "project_id");
    if (cJSON_IsNull(project_id)) {
        project_id = NULL;
    }
    if (project_id) { 
    if(!cJSON_IsString(project_id) && !cJSON_IsNull(project_id))
    {
    goto end; //String
    }
    }

    // usage_moderations_result->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(usage_moderations_resultJSON, "user_id");
    if (cJSON_IsNull(user_id)) {
        user_id = NULL;
    }
    if (user_id) { 
    if(!cJSON_IsString(user_id) && !cJSON_IsNull(user_id))
    {
    goto end; //String
    }
    }

    // usage_moderations_result->api_key_id
    cJSON *api_key_id = cJSON_GetObjectItemCaseSensitive(usage_moderations_resultJSON, "api_key_id");
    if (cJSON_IsNull(api_key_id)) {
        api_key_id = NULL;
    }
    if (api_key_id) { 
    if(!cJSON_IsString(api_key_id) && !cJSON_IsNull(api_key_id))
    {
    goto end; //String
    }
    }

    // usage_moderations_result->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(usage_moderations_resultJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (model) { 
    if(!cJSON_IsString(model) && !cJSON_IsNull(model))
    {
    goto end; //String
    }
    }


    usage_moderations_result_local_var = usage_moderations_result_create_internal (
        objectVariable,
        input_tokens->valuedouble,
        num_model_requests->valuedouble,
        project_id && !cJSON_IsNull(project_id) ? strdup(project_id->valuestring) : NULL,
        user_id && !cJSON_IsNull(user_id) ? strdup(user_id->valuestring) : NULL,
        api_key_id && !cJSON_IsNull(api_key_id) ? strdup(api_key_id->valuestring) : NULL,
        model && !cJSON_IsNull(model) ? strdup(model->valuestring) : NULL
        );

    return usage_moderations_result_local_var;
end:
    return NULL;

}
