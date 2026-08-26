#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "usage_images_result.h"


char* usage_images_result_object_ToString(openai_api_usage_images_result_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.usage.images.result" };
    return objectArray[object];
}

openai_api_usage_images_result_OBJECT_e usage_images_result_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.usage.images.result" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static usage_images_result_t *usage_images_result_create_internal(
    openai_api_usage_images_result_OBJECT_e object,
    int *images,
    int *num_model_requests,
    char *source,
    char *size,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model
    ) {
    usage_images_result_t *usage_images_result_local_var = malloc(sizeof(usage_images_result_t));
    if (!usage_images_result_local_var) {
        return NULL;
    }
    memset(usage_images_result_local_var, 0, sizeof(usage_images_result_t));
    usage_images_result_local_var->_library_owned = 1;
    usage_images_result_local_var->object = object;
    usage_images_result_local_var->images = images;
    usage_images_result_local_var->num_model_requests = num_model_requests;
    usage_images_result_local_var->source = source;
    usage_images_result_local_var->size = size;
    usage_images_result_local_var->project_id = project_id;
    usage_images_result_local_var->user_id = user_id;
    usage_images_result_local_var->api_key_id = api_key_id;
    usage_images_result_local_var->model = model;
    return usage_images_result_local_var;
}

__attribute__((deprecated)) usage_images_result_t *usage_images_result_create(
    openai_api_usage_images_result_OBJECT_e object,
    int *images,
    int *num_model_requests,
    char *source,
    char *size,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model
    ) {
    int *images_copy = NULL;
    if (images) {
        images_copy = malloc(sizeof(int));
        if (images_copy) *images_copy = *images;
    }
    int *num_model_requests_copy = NULL;
    if (num_model_requests) {
        num_model_requests_copy = malloc(sizeof(int));
        if (num_model_requests_copy) *num_model_requests_copy = *num_model_requests;
    }
    usage_images_result_t *result = usage_images_result_create_internal (
        object,
        images_copy,
        num_model_requests_copy,
        source,
        size,
        project_id,
        user_id,
        api_key_id,
        model
        );
    if (!result) {
        free(images_copy);
        free(num_model_requests_copy);
    }
    return result;
}

void usage_images_result_free(usage_images_result_t *usage_images_result) {
    if(NULL == usage_images_result){
        return ;
    }
    if(usage_images_result->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "usage_images_result_free");
        return ;
    }
    listEntry_t *listEntry;
    if (usage_images_result->images) {
        free(usage_images_result->images);
        usage_images_result->images = NULL;
    }
    if (usage_images_result->num_model_requests) {
        free(usage_images_result->num_model_requests);
        usage_images_result->num_model_requests = NULL;
    }
    if (usage_images_result->source) {
        free(usage_images_result->source);
        usage_images_result->source = NULL;
    }
    if (usage_images_result->size) {
        free(usage_images_result->size);
        usage_images_result->size = NULL;
    }
    if (usage_images_result->project_id) {
        free(usage_images_result->project_id);
        usage_images_result->project_id = NULL;
    }
    if (usage_images_result->user_id) {
        free(usage_images_result->user_id);
        usage_images_result->user_id = NULL;
    }
    if (usage_images_result->api_key_id) {
        free(usage_images_result->api_key_id);
        usage_images_result->api_key_id = NULL;
    }
    if (usage_images_result->model) {
        free(usage_images_result->model);
        usage_images_result->model = NULL;
    }
    free(usage_images_result);
}

cJSON *usage_images_result_convertToJSON(usage_images_result_t *usage_images_result) {
    cJSON *item = cJSON_CreateObject();

    // usage_images_result->object
    if (openai_api_usage_images_result_OBJECT_NULL == usage_images_result->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", usage_images_result_object_ToString(usage_images_result->object)) == NULL)
    {
    goto fail; //Enum
    }


    // usage_images_result->images
    if (!usage_images_result->images) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "images", *usage_images_result->images) == NULL) {
    goto fail; //Numeric
    }


    // usage_images_result->num_model_requests
    if (!usage_images_result->num_model_requests) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "num_model_requests", *usage_images_result->num_model_requests) == NULL) {
    goto fail; //Numeric
    }


    // usage_images_result->source
    if(usage_images_result->source) {
    if(cJSON_AddStringToObject(item, "source", usage_images_result->source) == NULL) {
    goto fail; //String
    }
    }


    // usage_images_result->size
    if(usage_images_result->size) {
    if(cJSON_AddStringToObject(item, "size", usage_images_result->size) == NULL) {
    goto fail; //String
    }
    }


    // usage_images_result->project_id
    if(usage_images_result->project_id) {
    if(cJSON_AddStringToObject(item, "project_id", usage_images_result->project_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_images_result->user_id
    if(usage_images_result->user_id) {
    if(cJSON_AddStringToObject(item, "user_id", usage_images_result->user_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_images_result->api_key_id
    if(usage_images_result->api_key_id) {
    if(cJSON_AddStringToObject(item, "api_key_id", usage_images_result->api_key_id) == NULL) {
    goto fail; //String
    }
    }


    // usage_images_result->model
    if(usage_images_result->model) {
    if(cJSON_AddStringToObject(item, "model", usage_images_result->model) == NULL) {
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

usage_images_result_t *usage_images_result_parseFromJSON(cJSON *usage_images_resultJSON){

    usage_images_result_t *usage_images_result_local_var = NULL;

    // define the local variable for usage_images_result->images
    int *images_local_var = NULL;

    // define the local variable for usage_images_result->num_model_requests
    int *num_model_requests_local_var = NULL;

    char *source_local_str = NULL;

    char *size_local_str = NULL;

    char *project_id_local_str = NULL;

    char *user_id_local_str = NULL;

    char *api_key_id_local_str = NULL;

    char *model_local_str = NULL;

    // usage_images_result->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(usage_images_resultJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_usage_images_result_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = usage_images_result_object_FromString(object->valuestring);

    // usage_images_result->images
    cJSON *images = cJSON_GetObjectItemCaseSensitive(usage_images_resultJSON, "images");
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

    // usage_images_result->num_model_requests
    cJSON *num_model_requests = cJSON_GetObjectItemCaseSensitive(usage_images_resultJSON, "num_model_requests");
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

    // usage_images_result->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(usage_images_resultJSON, "source");
    if (cJSON_IsNull(source)) {
        source = NULL;
    }
    if (source) { 
    if(!cJSON_IsString(source) && !cJSON_IsNull(source))
    {
    goto end; //String
    }
    }

    // usage_images_result->size
    cJSON *size = cJSON_GetObjectItemCaseSensitive(usage_images_resultJSON, "size");
    if (cJSON_IsNull(size)) {
        size = NULL;
    }
    if (size) { 
    if(!cJSON_IsString(size) && !cJSON_IsNull(size))
    {
    goto end; //String
    }
    }

    // usage_images_result->project_id
    cJSON *project_id = cJSON_GetObjectItemCaseSensitive(usage_images_resultJSON, "project_id");
    if (cJSON_IsNull(project_id)) {
        project_id = NULL;
    }
    if (project_id) { 
    if(!cJSON_IsString(project_id) && !cJSON_IsNull(project_id))
    {
    goto end; //String
    }
    }

    // usage_images_result->user_id
    cJSON *user_id = cJSON_GetObjectItemCaseSensitive(usage_images_resultJSON, "user_id");
    if (cJSON_IsNull(user_id)) {
        user_id = NULL;
    }
    if (user_id) { 
    if(!cJSON_IsString(user_id) && !cJSON_IsNull(user_id))
    {
    goto end; //String
    }
    }

    // usage_images_result->api_key_id
    cJSON *api_key_id = cJSON_GetObjectItemCaseSensitive(usage_images_resultJSON, "api_key_id");
    if (cJSON_IsNull(api_key_id)) {
        api_key_id = NULL;
    }
    if (api_key_id) { 
    if(!cJSON_IsString(api_key_id) && !cJSON_IsNull(api_key_id))
    {
    goto end; //String
    }
    }

    // usage_images_result->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(usage_images_resultJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (model) { 
    if(!cJSON_IsString(model) && !cJSON_IsNull(model))
    {
    goto end; //String
    }
    }


    if (source && !cJSON_IsNull(source)) source_local_str = strdup(source->valuestring);
    if (size && !cJSON_IsNull(size)) size_local_str = strdup(size->valuestring);
    if (project_id && !cJSON_IsNull(project_id)) project_id_local_str = strdup(project_id->valuestring);
    if (user_id && !cJSON_IsNull(user_id)) user_id_local_str = strdup(user_id->valuestring);
    if (api_key_id && !cJSON_IsNull(api_key_id)) api_key_id_local_str = strdup(api_key_id->valuestring);
    if (model && !cJSON_IsNull(model)) model_local_str = strdup(model->valuestring);

    usage_images_result_local_var = usage_images_result_create_internal (
        objectVariable,
        images_local_var,
        num_model_requests_local_var,
        source_local_str,
        size_local_str,
        project_id_local_str,
        user_id_local_str,
        api_key_id_local_str,
        model_local_str
        );

    if (!usage_images_result_local_var) {
        goto end;
    }

    return usage_images_result_local_var;
end:
    if (images_local_var) {
        free(images_local_var);
        images_local_var = NULL;
    }
    if (num_model_requests_local_var) {
        free(num_model_requests_local_var);
        num_model_requests_local_var = NULL;
    }
    if (source_local_str) {
        free(source_local_str);
        source_local_str = NULL;
    }
    if (size_local_str) {
        free(size_local_str);
        size_local_str = NULL;
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
