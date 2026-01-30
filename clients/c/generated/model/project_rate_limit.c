#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_rate_limit.h"


char* project_rate_limit_object_ToString(openai_api_project_rate_limit_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "project.rate_limit" };
    return objectArray[object];
}

openai_api_project_rate_limit_OBJECT_e project_rate_limit_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "project.rate_limit" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static project_rate_limit_t *project_rate_limit_create_internal(
    openai_api_project_rate_limit_OBJECT_e object,
    char *id,
    char *model,
    int max_requests_per_1_minute,
    int max_tokens_per_1_minute,
    int max_images_per_1_minute,
    int max_audio_megabytes_per_1_minute,
    int max_requests_per_1_day,
    int batch_1_day_max_input_tokens
    ) {
    project_rate_limit_t *project_rate_limit_local_var = malloc(sizeof(project_rate_limit_t));
    if (!project_rate_limit_local_var) {
        return NULL;
    }
    project_rate_limit_local_var->object = object;
    project_rate_limit_local_var->id = id;
    project_rate_limit_local_var->model = model;
    project_rate_limit_local_var->max_requests_per_1_minute = max_requests_per_1_minute;
    project_rate_limit_local_var->max_tokens_per_1_minute = max_tokens_per_1_minute;
    project_rate_limit_local_var->max_images_per_1_minute = max_images_per_1_minute;
    project_rate_limit_local_var->max_audio_megabytes_per_1_minute = max_audio_megabytes_per_1_minute;
    project_rate_limit_local_var->max_requests_per_1_day = max_requests_per_1_day;
    project_rate_limit_local_var->batch_1_day_max_input_tokens = batch_1_day_max_input_tokens;

    project_rate_limit_local_var->_library_owned = 1;
    return project_rate_limit_local_var;
}

__attribute__((deprecated)) project_rate_limit_t *project_rate_limit_create(
    openai_api_project_rate_limit_OBJECT_e object,
    char *id,
    char *model,
    int max_requests_per_1_minute,
    int max_tokens_per_1_minute,
    int max_images_per_1_minute,
    int max_audio_megabytes_per_1_minute,
    int max_requests_per_1_day,
    int batch_1_day_max_input_tokens
    ) {
    return project_rate_limit_create_internal (
        object,
        id,
        model,
        max_requests_per_1_minute,
        max_tokens_per_1_minute,
        max_images_per_1_minute,
        max_audio_megabytes_per_1_minute,
        max_requests_per_1_day,
        batch_1_day_max_input_tokens
        );
}

void project_rate_limit_free(project_rate_limit_t *project_rate_limit) {
    if(NULL == project_rate_limit){
        return ;
    }
    if(project_rate_limit->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_rate_limit_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project_rate_limit->id) {
        free(project_rate_limit->id);
        project_rate_limit->id = NULL;
    }
    if (project_rate_limit->model) {
        free(project_rate_limit->model);
        project_rate_limit->model = NULL;
    }
    free(project_rate_limit);
}

cJSON *project_rate_limit_convertToJSON(project_rate_limit_t *project_rate_limit) {
    cJSON *item = cJSON_CreateObject();

    // project_rate_limit->object
    if (openai_api_project_rate_limit_OBJECT_NULL == project_rate_limit->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", project_rate_limit_object_ToString(project_rate_limit->object)) == NULL)
    {
    goto fail; //Enum
    }


    // project_rate_limit->id
    if (!project_rate_limit->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", project_rate_limit->id) == NULL) {
    goto fail; //String
    }


    // project_rate_limit->model
    if (!project_rate_limit->model) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "model", project_rate_limit->model) == NULL) {
    goto fail; //String
    }


    // project_rate_limit->max_requests_per_1_minute
    if (!project_rate_limit->max_requests_per_1_minute) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_requests_per_1_minute", project_rate_limit->max_requests_per_1_minute) == NULL) {
    goto fail; //Numeric
    }


    // project_rate_limit->max_tokens_per_1_minute
    if (!project_rate_limit->max_tokens_per_1_minute) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_tokens_per_1_minute", project_rate_limit->max_tokens_per_1_minute) == NULL) {
    goto fail; //Numeric
    }


    // project_rate_limit->max_images_per_1_minute
    if(project_rate_limit->max_images_per_1_minute) {
    if(cJSON_AddNumberToObject(item, "max_images_per_1_minute", project_rate_limit->max_images_per_1_minute) == NULL) {
    goto fail; //Numeric
    }
    }


    // project_rate_limit->max_audio_megabytes_per_1_minute
    if(project_rate_limit->max_audio_megabytes_per_1_minute) {
    if(cJSON_AddNumberToObject(item, "max_audio_megabytes_per_1_minute", project_rate_limit->max_audio_megabytes_per_1_minute) == NULL) {
    goto fail; //Numeric
    }
    }


    // project_rate_limit->max_requests_per_1_day
    if(project_rate_limit->max_requests_per_1_day) {
    if(cJSON_AddNumberToObject(item, "max_requests_per_1_day", project_rate_limit->max_requests_per_1_day) == NULL) {
    goto fail; //Numeric
    }
    }


    // project_rate_limit->batch_1_day_max_input_tokens
    if(project_rate_limit->batch_1_day_max_input_tokens) {
    if(cJSON_AddNumberToObject(item, "batch_1_day_max_input_tokens", project_rate_limit->batch_1_day_max_input_tokens) == NULL) {
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

project_rate_limit_t *project_rate_limit_parseFromJSON(cJSON *project_rate_limitJSON){

    project_rate_limit_t *project_rate_limit_local_var = NULL;

    // project_rate_limit->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(project_rate_limitJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_project_rate_limit_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = project_rate_limit_object_FromString(object->valuestring);

    // project_rate_limit->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(project_rate_limitJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // project_rate_limit->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(project_rate_limitJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (!model) {
        goto end;
    }

    
    if(!cJSON_IsString(model))
    {
    goto end; //String
    }

    // project_rate_limit->max_requests_per_1_minute
    cJSON *max_requests_per_1_minute = cJSON_GetObjectItemCaseSensitive(project_rate_limitJSON, "max_requests_per_1_minute");
    if (cJSON_IsNull(max_requests_per_1_minute)) {
        max_requests_per_1_minute = NULL;
    }
    if (!max_requests_per_1_minute) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_requests_per_1_minute))
    {
    goto end; //Numeric
    }

    // project_rate_limit->max_tokens_per_1_minute
    cJSON *max_tokens_per_1_minute = cJSON_GetObjectItemCaseSensitive(project_rate_limitJSON, "max_tokens_per_1_minute");
    if (cJSON_IsNull(max_tokens_per_1_minute)) {
        max_tokens_per_1_minute = NULL;
    }
    if (!max_tokens_per_1_minute) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_tokens_per_1_minute))
    {
    goto end; //Numeric
    }

    // project_rate_limit->max_images_per_1_minute
    cJSON *max_images_per_1_minute = cJSON_GetObjectItemCaseSensitive(project_rate_limitJSON, "max_images_per_1_minute");
    if (cJSON_IsNull(max_images_per_1_minute)) {
        max_images_per_1_minute = NULL;
    }
    if (max_images_per_1_minute) { 
    if(!cJSON_IsNumber(max_images_per_1_minute))
    {
    goto end; //Numeric
    }
    }

    // project_rate_limit->max_audio_megabytes_per_1_minute
    cJSON *max_audio_megabytes_per_1_minute = cJSON_GetObjectItemCaseSensitive(project_rate_limitJSON, "max_audio_megabytes_per_1_minute");
    if (cJSON_IsNull(max_audio_megabytes_per_1_minute)) {
        max_audio_megabytes_per_1_minute = NULL;
    }
    if (max_audio_megabytes_per_1_minute) { 
    if(!cJSON_IsNumber(max_audio_megabytes_per_1_minute))
    {
    goto end; //Numeric
    }
    }

    // project_rate_limit->max_requests_per_1_day
    cJSON *max_requests_per_1_day = cJSON_GetObjectItemCaseSensitive(project_rate_limitJSON, "max_requests_per_1_day");
    if (cJSON_IsNull(max_requests_per_1_day)) {
        max_requests_per_1_day = NULL;
    }
    if (max_requests_per_1_day) { 
    if(!cJSON_IsNumber(max_requests_per_1_day))
    {
    goto end; //Numeric
    }
    }

    // project_rate_limit->batch_1_day_max_input_tokens
    cJSON *batch_1_day_max_input_tokens = cJSON_GetObjectItemCaseSensitive(project_rate_limitJSON, "batch_1_day_max_input_tokens");
    if (cJSON_IsNull(batch_1_day_max_input_tokens)) {
        batch_1_day_max_input_tokens = NULL;
    }
    if (batch_1_day_max_input_tokens) { 
    if(!cJSON_IsNumber(batch_1_day_max_input_tokens))
    {
    goto end; //Numeric
    }
    }


    project_rate_limit_local_var = project_rate_limit_create_internal (
        objectVariable,
        strdup(id->valuestring),
        strdup(model->valuestring),
        max_requests_per_1_minute->valuedouble,
        max_tokens_per_1_minute->valuedouble,
        max_images_per_1_minute ? max_images_per_1_minute->valuedouble : 0,
        max_audio_megabytes_per_1_minute ? max_audio_megabytes_per_1_minute->valuedouble : 0,
        max_requests_per_1_day ? max_requests_per_1_day->valuedouble : 0,
        batch_1_day_max_input_tokens ? batch_1_day_max_input_tokens->valuedouble : 0
        );

    return project_rate_limit_local_var;
end:
    return NULL;

}
