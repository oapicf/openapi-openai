#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "usage_audio_speeches_result.h"


char* usage_audio_speeches_result_object_ToString(openai_api_usage_audio_speeches_result_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.usage.audio_speeches.result" };
    return objectArray[object];
}

openai_api_usage_audio_speeches_result_OBJECT_e usage_audio_speeches_result_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.usage.audio_speeches.result" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static usage_audio_speeches_result_t *usage_audio_speeches_result_create_internal(
    openai_api_usage_audio_speeches_result_OBJECT_e object,
    int *characters,
    int *num_model_requests,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model
    ) {
    usage_audio_speeches_result_t *usage_audio_speeches_result_local_var = malloc(sizeof(usage_audio_speeches_result_t));
    if (!usage_audio_speeches_result_local_var) {
        return NULL;
    }
    memset(usage_audio_speeches_result_local_var, 0, sizeof(usage_audio_speeches_result_t));
    usage_audio_speeches_result_local_var->_library_owned = 1;
    usage_audio_speeches_result_local_var->object = object;
    usage_audio_speeches_result_local_var->characters = characters;
    usage_audio_speeches_result_local_var->num_model_requests = num_model_requests;
    usage_audio_speeches_result_local_var->project_id = project_id;
    usage_audio_speeches_result_local_var->user_id = user_id;
    usage_audio_speeches_result_local_var->api_key_id = api_key_id;
    usage_audio_speeches_result_local_var->model = model;
    return usage_audio_speeches_result_local_var;
}

__attribute__((deprecated)) usage_audio_speeches_result_t *usage_audio_speeches_result_create(
    openai_api_usage_audio_speeches_result_OBJECT_e object,
    int *characters,
    int *num_model_requests,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model
    ) {
    int *characters_copy = NULL;
    if (characters) {
        characters_copy = malloc(sizeof(int));
        if (characters_copy) *characters_copy = *characters;
    }
    int *num_model_requests_copy = NULL;
    if (num_model_requests) {
        num_model_requests_copy = malloc(sizeof(int));
        if (num_model_requests_copy) *num_model_requests_copy = *num_model_requests;
    }
    usage_audio_speeches_result_t *result = usage_audio_speeches_result_create_internal (
        object,
        characters_copy,
        num_model_requests_copy,
        project_id,
        user_id,
        api_key_id,
        model
        );
    if (!result) {
        free(characters_copy);
        free(num_model_requests_copy);
    }
    return result;
}

void usage_audio_speeches_result_free(usage_audio_speeches_result_t *usage_audio_speeches_result) {
    if(NULL == usage_audio_speeches_result){
        return ;
    }
    if(usage_audio_speeches_result->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "usage_audio_speeches_result_free");
        return ;
    }
    listEntry_t *listEntry;
    if (usage_audio_speeches_result->characters) {
        free(usage_audio_speeches_result->characters);
        usage_audio_speeches_result->characters = NULL;
    }
    if (usage_audio_speeches_result->num_model_requests) {
        free(usage_audio_speeches_result->num_model_requests);
        usage_audio_speeches_result->num_model_requests = NULL;
    }
    if (usage_audio_speeches_result->project_id) {
        free(usage_audio_speeches_result->project_id);
        usage_audio_speeches_result->project_id = NULL;
    }
    if (usage_audio_speeches_result->user_id) {
        free(usage_audio_speeches_result->user_id);
        usage_audio_speeches_result->user_id = NULL;
    }
    if (usage_audio_speeches_result->api_key_id) {
        free(usage_audio_speeches_result->api_key_id);
        usage_audio_speeches_result->api_key_id = NULL;
    }
    if (usage_audio_speeches_result->model) {
        free(usage_audio_speeches_result->model);
        usage_audio_speeches_result->model = NULL;
    }
    free(usage_audio_speeches_result);
}

cJSON *usage_audio_speeches_result_convertToJSON(usage_audio_speeches_result_t *usage_audio_speeches_result) {
    cJSON *item = cJSON_CreateObject();

    // usage_audio_speeches_result->object
    if (openai_api_usage_audio_speeches_result_OBJECT_NULL == usage_audio_speeches_result->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", usage_audio_speeches_result_object_ToString(usage_audio_speeches_result->object)) == NULL)
    {
    goto fail; //Enum
    }


    // usage_audio_speeches_result->characters
    if (!usage_audio_speeches_result->characters) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "characters", *usage_audio_speeches_result->characters) == NULL) {
    goto fail; //Numeric
    }


    // usage_audio_speeches_result->num_model_requests
    if (!usage_audio_speeches_result->num_model_requests) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "num_model_requests", *usage_audio_speeches_result->num_model_requests) == NULL) {
    goto fail; //Numeric
    }


    // usage_audio_speeches_result->project_id
    if(usage_audio_speeches_result->project_id) {
    if(cJSON_AddStringToObject(item, "project_id", usage_audio_speeches_result->project_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_audio_speeches_result->user_id
    if(usage_audio_speeches_result->user_id) {
    if(cJSON_AddStringToObject(item, "user_id", usage_audio_speeches_result->user_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_audio_speeches_result->api_key_id
    if(usage_audio_speeches_result->api_key_id) {
    if(cJSON_AddStringToObject(item, "api_key_id", usage_audio_speeches_result->api_key_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_audio_speeches_result->model
    if(usage_audio_speeches_result->model) {
    if(cJSON_AddStringToObject(item, "model", usage_audio_speeches_result->model) == NULL) {
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

usage_audio_speeches_result_t *usage_audio_speeches_result_parseFromJSON(cJSON *usage_audio_speeches_resultJSON){

    usage_audio_speeches_result_t *usage_audio_speeches_result_local_var = NULL;

    // define the local variable for usage_audio_speeches_result->characters
    int *characters_local_var = NULL;

    // define the local variable for usage_audio_speeches_result->num_model_requests
    int *num_model_requests_local_var = NULL;

    char *project_id_local_str = NULL;

    char *user_id_local_str = NULL;

    char *api_key_id_local_str = NULL;

    char *model_local_str = NULL;

    // usage_audio_speeches_result->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(usage_audio_speeches_resultJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_usage_audio_speeches_result_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = usage_audio_speeches_result_object_FromString(object->valuestring);

    // usage_audio_speeches_result->characters
    cJSON *characters = cJSON_GetObjectItemCaseSensitive(usage_audio_speeches_resultJSON, "characters");
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

    // usage_audio_speeches_result->num_model_requests
    cJSON *num_model_requests = cJSON_GetObjectItemCaseSensitive(usage_audio_speeches_resultJSON, "num_model_requests");
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

    // usage_audio_speeches_result->project_id
    cJSON *project_id = cJSON_GetObjectItemCaseSensitive(usage_audio_speeches_resultJSON, "project_id");
    if (cJSON_IsNull(project_id)) {
        project_id = NULL;
    }
    if (project_id) { 
    if(!cJSON_IsString(project_id) && !cJSON_IsNull(project_id))
    {
    goto end; //String
    }
    }

    // usage_audio_speeches_result->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(usage_audio_speeches_resultJSON, "user_id");
    if (cJSON_IsNull(user_id)) {
        user_id = NULL;
    }
    if (user_id) { 
    if(!cJSON_IsString(user_id) && !cJSON_IsNull(user_id))
    {
    goto end; //String
    }
    }

    // usage_audio_speeches_result->api_key_id
    cJSON *api_key_id = cJSON_GetObjectItemCaseSensitive(usage_audio_speeches_resultJSON, "api_key_id");
    if (cJSON_IsNull(api_key_id)) {
        api_key_id = NULL;
    }
    if (api_key_id) { 
    if(!cJSON_IsString(api_key_id) && !cJSON_IsNull(api_key_id))
    {
    goto end; //String
    }
    }

    // usage_audio_speeches_result->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(usage_audio_speeches_resultJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (model) { 
    if(!cJSON_IsString(model) && !cJSON_IsNull(model))
    {
    goto end; //String
    }
    }


    if (project_id && !cJSON_IsNull(project_id)) project_id_local_str = strdup(project_id->valuestring);
    if (user_id && !cJSON_IsNull(user_id)) user_id_local_str = strdup(user_id->valuestring);
    if (api_key_id && !cJSON_IsNull(api_key_id)) api_key_id_local_str = strdup(api_key_id->valuestring);
    if (model && !cJSON_IsNull(model)) model_local_str = strdup(model->valuestring);

    usage_audio_speeches_result_local_var = usage_audio_speeches_result_create_internal (
        objectVariable,
        characters_local_var,
        num_model_requests_local_var,
        project_id_local_str,
        user_id_local_str,
        api_key_id_local_str,
        model_local_str
        );

    if (!usage_audio_speeches_result_local_var) {
        goto end;
    }

    return usage_audio_speeches_result_local_var;
end:
    if (characters_local_var) {
        free(characters_local_var);
        characters_local_var = NULL;
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
    return NULL;

}
