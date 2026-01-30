#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "usage_audio_transcriptions_result.h"


char* usage_audio_transcriptions_result_object_ToString(openai_api_usage_audio_transcriptions_result_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.usage.audio_transcriptions.result" };
    return objectArray[object];
}

openai_api_usage_audio_transcriptions_result_OBJECT_e usage_audio_transcriptions_result_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.usage.audio_transcriptions.result" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static usage_audio_transcriptions_result_t *usage_audio_transcriptions_result_create_internal(
    openai_api_usage_audio_transcriptions_result_OBJECT_e object,
    int seconds,
    int num_model_requests,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model
    ) {
    usage_audio_transcriptions_result_t *usage_audio_transcriptions_result_local_var = malloc(sizeof(usage_audio_transcriptions_result_t));
    if (!usage_audio_transcriptions_result_local_var) {
        return NULL;
    }
    usage_audio_transcriptions_result_local_var->object = object;
    usage_audio_transcriptions_result_local_var->seconds = seconds;
    usage_audio_transcriptions_result_local_var->num_model_requests = num_model_requests;
    usage_audio_transcriptions_result_local_var->project_id = project_id;
    usage_audio_transcriptions_result_local_var->user_id = user_id;
    usage_audio_transcriptions_result_local_var->api_key_id = api_key_id;
    usage_audio_transcriptions_result_local_var->model = model;

    usage_audio_transcriptions_result_local_var->_library_owned = 1;
    return usage_audio_transcriptions_result_local_var;
}

__attribute__((deprecated)) usage_audio_transcriptions_result_t *usage_audio_transcriptions_result_create(
    openai_api_usage_audio_transcriptions_result_OBJECT_e object,
    int seconds,
    int num_model_requests,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model
    ) {
    return usage_audio_transcriptions_result_create_internal (
        object,
        seconds,
        num_model_requests,
        project_id,
        user_id,
        api_key_id,
        model
        );
}

void usage_audio_transcriptions_result_free(usage_audio_transcriptions_result_t *usage_audio_transcriptions_result) {
    if(NULL == usage_audio_transcriptions_result){
        return ;
    }
    if(usage_audio_transcriptions_result->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "usage_audio_transcriptions_result_free");
        return ;
    }
    listEntry_t *listEntry;
    if (usage_audio_transcriptions_result->project_id) {
        free(usage_audio_transcriptions_result->project_id);
        usage_audio_transcriptions_result->project_id = NULL;
    }
    if (usage_audio_transcriptions_result->user_id) {
        free(usage_audio_transcriptions_result->user_id);
        usage_audio_transcriptions_result->user_id = NULL;
    }
    if (usage_audio_transcriptions_result->api_key_id) {
        free(usage_audio_transcriptions_result->api_key_id);
        usage_audio_transcriptions_result->api_key_id = NULL;
    }
    if (usage_audio_transcriptions_result->model) {
        free(usage_audio_transcriptions_result->model);
        usage_audio_transcriptions_result->model = NULL;
    }
    free(usage_audio_transcriptions_result);
}

cJSON *usage_audio_transcriptions_result_convertToJSON(usage_audio_transcriptions_result_t *usage_audio_transcriptions_result) {
    cJSON *item = cJSON_CreateObject();

    // usage_audio_transcriptions_result->object
    if (openai_api_usage_audio_transcriptions_result_OBJECT_NULL == usage_audio_transcriptions_result->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", usage_audio_transcriptions_result_object_ToString(usage_audio_transcriptions_result->object)) == NULL)
    {
    goto fail; //Enum
    }


    // usage_audio_transcriptions_result->seconds
    if (!usage_audio_transcriptions_result->seconds) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "seconds", usage_audio_transcriptions_result->seconds) == NULL) {
    goto fail; //Numeric
    }


    // usage_audio_transcriptions_result->num_model_requests
    if (!usage_audio_transcriptions_result->num_model_requests) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "num_model_requests", usage_audio_transcriptions_result->num_model_requests) == NULL) {
    goto fail; //Numeric
    }


    // usage_audio_transcriptions_result->project_id
    if(usage_audio_transcriptions_result->project_id) {
    if(cJSON_AddStringToObject(item, "project_id", usage_audio_transcriptions_result->project_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_audio_transcriptions_result->user_id
    if(usage_audio_transcriptions_result->user_id) {
    if(cJSON_AddStringToObject(item, "user_id", usage_audio_transcriptions_result->user_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_audio_transcriptions_result->api_key_id
    if(usage_audio_transcriptions_result->api_key_id) {
    if(cJSON_AddStringToObject(item, "api_key_id", usage_audio_transcriptions_result->api_key_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_audio_transcriptions_result->model
    if(usage_audio_transcriptions_result->model) {
    if(cJSON_AddStringToObject(item, "model", usage_audio_transcriptions_result->model) == NULL) {
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

usage_audio_transcriptions_result_t *usage_audio_transcriptions_result_parseFromJSON(cJSON *usage_audio_transcriptions_resultJSON){

    usage_audio_transcriptions_result_t *usage_audio_transcriptions_result_local_var = NULL;

    // usage_audio_transcriptions_result->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(usage_audio_transcriptions_resultJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_usage_audio_transcriptions_result_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = usage_audio_transcriptions_result_object_FromString(object->valuestring);

    // usage_audio_transcriptions_result->seconds
    cJSON *seconds = cJSON_GetObjectItemCaseSensitive(usage_audio_transcriptions_resultJSON, "seconds");
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

    // usage_audio_transcriptions_result->num_model_requests
    cJSON *num_model_requests = cJSON_GetObjectItemCaseSensitive(usage_audio_transcriptions_resultJSON, "num_model_requests");
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

    // usage_audio_transcriptions_result->project_id
    cJSON *project_id = cJSON_GetObjectItemCaseSensitive(usage_audio_transcriptions_resultJSON, "project_id");
    if (cJSON_IsNull(project_id)) {
        project_id = NULL;
    }
    if (project_id) { 
    if(!cJSON_IsString(project_id) && !cJSON_IsNull(project_id))
    {
    goto end; //String
    }
    }

    // usage_audio_transcriptions_result->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(usage_audio_transcriptions_resultJSON, "user_id");
    if (cJSON_IsNull(user_id)) {
        user_id = NULL;
    }
    if (user_id) { 
    if(!cJSON_IsString(user_id) && !cJSON_IsNull(user_id))
    {
    goto end; //String
    }
    }

    // usage_audio_transcriptions_result->api_key_id
    cJSON *api_key_id = cJSON_GetObjectItemCaseSensitive(usage_audio_transcriptions_resultJSON, "api_key_id");
    if (cJSON_IsNull(api_key_id)) {
        api_key_id = NULL;
    }
    if (api_key_id) { 
    if(!cJSON_IsString(api_key_id) && !cJSON_IsNull(api_key_id))
    {
    goto end; //String
    }
    }

    // usage_audio_transcriptions_result->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(usage_audio_transcriptions_resultJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (model) { 
    if(!cJSON_IsString(model) && !cJSON_IsNull(model))
    {
    goto end; //String
    }
    }


    usage_audio_transcriptions_result_local_var = usage_audio_transcriptions_result_create_internal (
        objectVariable,
        seconds->valuedouble,
        num_model_requests->valuedouble,
        project_id && !cJSON_IsNull(project_id) ? strdup(project_id->valuestring) : NULL,
        user_id && !cJSON_IsNull(user_id) ? strdup(user_id->valuestring) : NULL,
        api_key_id && !cJSON_IsNull(api_key_id) ? strdup(api_key_id->valuestring) : NULL,
        model && !cJSON_IsNull(model) ? strdup(model->valuestring) : NULL
        );

    return usage_audio_transcriptions_result_local_var;
end:
    return NULL;

}
