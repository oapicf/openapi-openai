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
    int *max_requests_per_1_minute,
    int *max_tokens_per_1_minute,
    int *max_images_per_1_minute,
    int *max_audio_megabytes_per_1_minute,
    int *max_requests_per_1_day,
    int *batch_1_day_max_input_tokens
    ) {
    project_rate_limit_t *project_rate_limit_local_var = malloc(sizeof(project_rate_limit_t));
    if (!project_rate_limit_local_var) {
        return NULL;
    }
    memset(project_rate_limit_local_var, 0, sizeof(project_rate_limit_t));
    project_rate_limit_local_var->_library_owned = 1;
    project_rate_limit_local_var->object = object;
    project_rate_limit_local_var->id = id;
    project_rate_limit_local_var->model = model;
    project_rate_limit_local_var->max_requests_per_1_minute = max_requests_per_1_minute;
    project_rate_limit_local_var->max_tokens_per_1_minute = max_tokens_per_1_minute;
    project_rate_limit_local_var->max_images_per_1_minute = max_images_per_1_minute;
    project_rate_limit_local_var->max_audio_megabytes_per_1_minute = max_audio_megabytes_per_1_minute;
    project_rate_limit_local_var->max_requests_per_1_day = max_requests_per_1_day;
    project_rate_limit_local_var->batch_1_day_max_input_tokens = batch_1_day_max_input_tokens;
    return project_rate_limit_local_var;
}

__attribute__((deprecated)) project_rate_limit_t *project_rate_limit_create(
    openai_api_project_rate_limit_OBJECT_e object,
    char *id,
    char *model,
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
    project_rate_limit_t *result = project_rate_limit_create_internal (
        object,
        id,
        model,
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
    if (project_rate_limit->max_requests_per_1_minute) {
        free(project_rate_limit->max_requests_per_1_minute);
        project_rate_limit->max_requests_per_1_minute = NULL;
    }
    if (project_rate_limit->max_tokens_per_1_minute) {
        free(project_rate_limit->max_tokens_per_1_minute);
        project_rate_limit->max_tokens_per_1_minute = NULL;
    }
    if (project_rate_limit->max_images_per_1_minute) {
        free(project_rate_limit->max_images_per_1_minute);
        project_rate_limit->max_images_per_1_minute = NULL;
    }
    if (project_rate_limit->max_audio_megabytes_per_1_minute) {
        free(project_rate_limit->max_audio_megabytes_per_1_minute);
        project_rate_limit->max_audio_megabytes_per_1_minute = NULL;
    }
    if (project_rate_limit->max_requests_per_1_day) {
        free(project_rate_limit->max_requests_per_1_day);
        project_rate_limit->max_requests_per_1_day = NULL;
    }
    if (project_rate_limit->batch_1_day_max_input_tokens) {
        free(project_rate_limit->batch_1_day_max_input_tokens);
        project_rate_limit->batch_1_day_max_input_tokens = NULL;
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
    if(cJSON_AddNumberToObject(item, "max_requests_per_1_minute", *project_rate_limit->max_requests_per_1_minute) == NULL) {
    goto fail; //Numeric
    }


    // project_rate_limit->max_tokens_per_1_minute
    if (!project_rate_limit->max_tokens_per_1_minute) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_tokens_per_1_minute", *project_rate_limit->max_tokens_per_1_minute) == NULL) {
    goto fail; //Numeric
    }


    // project_rate_limit->max_images_per_1_minute
    if(project_rate_limit->max_images_per_1_minute) {
    if(cJSON_AddNumberToObject(item, "max_images_per_1_minute", *project_rate_limit->max_images_per_1_minute) == NULL) {
    goto fail; //Numeric
    }
    }


    // project_rate_limit->max_audio_megabytes_per_1_minute
    if(project_rate_limit->max_audio_megabytes_per_1_minute) {
    if(cJSON_AddNumberToObject(item, "max_audio_megabytes_per_1_minute", *project_rate_limit->max_audio_megabytes_per_1_minute) == NULL) {
    goto fail; //Numeric
    }
    }


    // project_rate_limit->max_requests_per_1_day
    if(project_rate_limit->max_requests_per_1_day) {
    if(cJSON_AddNumberToObject(item, "max_requests_per_1_day", *project_rate_limit->max_requests_per_1_day) == NULL) {
    goto fail; //Numeric
    }
    }


    // project_rate_limit->batch_1_day_max_input_tokens
    if(project_rate_limit->batch_1_day_max_input_tokens) {
    if(cJSON_AddNumberToObject(item, "batch_1_day_max_input_tokens", *project_rate_limit->batch_1_day_max_input_tokens) == NULL) {
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

    char *id_local_str = NULL;

    char *model_local_str = NULL;

    // define the local variable for project_rate_limit->max_requests_per_1_minute
    int *max_requests_per_1_minute_local_var = NULL;

    // define the local variable for project_rate_limit->max_tokens_per_1_minute
    int *max_tokens_per_1_minute_local_var = NULL;

    // define the local variable for project_rate_limit->max_images_per_1_minute
    int *max_images_per_1_minute_local_var = NULL;

    // define the local variable for project_rate_limit->max_audio_megabytes_per_1_minute
    int *max_audio_megabytes_per_1_minute_local_var = NULL;

    // define the local variable for project_rate_limit->max_requests_per_1_day
    int *max_requests_per_1_day_local_var = NULL;

    // define the local variable for project_rate_limit->batch_1_day_max_input_tokens
    int *batch_1_day_max_input_tokens_local_var = NULL;

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
    max_requests_per_1_minute_local_var = malloc(sizeof(int));
    if(!max_requests_per_1_minute_local_var)
    {
        goto end;
    }
    *max_requests_per_1_minute_local_var = max_requests_per_1_minute->valuedouble;

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
    max_tokens_per_1_minute_local_var = malloc(sizeof(int));
    if(!max_tokens_per_1_minute_local_var)
    {
        goto end;
    }
    *max_tokens_per_1_minute_local_var = max_tokens_per_1_minute->valuedouble;

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
    max_images_per_1_minute_local_var = malloc(sizeof(int));
    if(!max_images_per_1_minute_local_var)
    {
        goto end;
    }
    *max_images_per_1_minute_local_var = max_images_per_1_minute->valuedouble;
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
    max_audio_megabytes_per_1_minute_local_var = malloc(sizeof(int));
    if(!max_audio_megabytes_per_1_minute_local_var)
    {
        goto end;
    }
    *max_audio_megabytes_per_1_minute_local_var = max_audio_megabytes_per_1_minute->valuedouble;
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
    max_requests_per_1_day_local_var = malloc(sizeof(int));
    if(!max_requests_per_1_day_local_var)
    {
        goto end;
    }
    *max_requests_per_1_day_local_var = max_requests_per_1_day->valuedouble;
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
    batch_1_day_max_input_tokens_local_var = malloc(sizeof(int));
    if(!batch_1_day_max_input_tokens_local_var)
    {
        goto end;
    }
    *batch_1_day_max_input_tokens_local_var = batch_1_day_max_input_tokens->valuedouble;
    }


    if (id && !cJSON_IsNull(id)) id_local_str = strdup(id->valuestring);
    if (model && !cJSON_IsNull(model)) model_local_str = strdup(model->valuestring);

    project_rate_limit_local_var = project_rate_limit_create_internal (
        objectVariable,
        id_local_str,
        model_local_str,
        max_requests_per_1_minute_local_var,
        max_tokens_per_1_minute_local_var,
        max_images_per_1_minute_local_var,
        max_audio_megabytes_per_1_minute_local_var,
        max_requests_per_1_day_local_var,
        batch_1_day_max_input_tokens_local_var
        );

    if (!project_rate_limit_local_var) {
        goto end;
    }

    return project_rate_limit_local_var;
end:
    if (id_local_str) {
        free(id_local_str);
        id_local_str = NULL;
    }
    if (model_local_str) {
        free(model_local_str);
        model_local_str = NULL;
    }
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
