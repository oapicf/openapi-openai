#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "usage_vector_stores_result.h"


char* usage_vector_stores_result_object_ToString(openai_api_usage_vector_stores_result_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "organization.usage.vector_stores.result" };
    return objectArray[object];
}

openai_api_usage_vector_stores_result_OBJECT_e usage_vector_stores_result_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "organization.usage.vector_stores.result" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static usage_vector_stores_result_t *usage_vector_stores_result_create_internal(
    openai_api_usage_vector_stores_result_OBJECT_e object,
    int usage_bytes,
    char *project_id
    ) {
    usage_vector_stores_result_t *usage_vector_stores_result_local_var = malloc(sizeof(usage_vector_stores_result_t));
    if (!usage_vector_stores_result_local_var) {
        return NULL;
    }
    usage_vector_stores_result_local_var->object = object;
    usage_vector_stores_result_local_var->usage_bytes = usage_bytes;
    usage_vector_stores_result_local_var->project_id = project_id;

    usage_vector_stores_result_local_var->_library_owned = 1;
    return usage_vector_stores_result_local_var;
}

__attribute__((deprecated)) usage_vector_stores_result_t *usage_vector_stores_result_create(
    openai_api_usage_vector_stores_result_OBJECT_e object,
    int usage_bytes,
    char *project_id
    ) {
    return usage_vector_stores_result_create_internal (
        object,
        usage_bytes,
        project_id
        );
}

void usage_vector_stores_result_free(usage_vector_stores_result_t *usage_vector_stores_result) {
    if(NULL == usage_vector_stores_result){
        return ;
    }
    if(usage_vector_stores_result->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "usage_vector_stores_result_free");
        return ;
    }
    listEntry_t *listEntry;
    if (usage_vector_stores_result->project_id) {
        free(usage_vector_stores_result->project_id);
        usage_vector_stores_result->project_id = NULL;
    }
    free(usage_vector_stores_result);
}

cJSON *usage_vector_stores_result_convertToJSON(usage_vector_stores_result_t *usage_vector_stores_result) {
    cJSON *item = cJSON_CreateObject();

    // usage_vector_stores_result->object
    if (openai_api_usage_vector_stores_result_OBJECT_NULL == usage_vector_stores_result->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", usage_vector_stores_result_object_ToString(usage_vector_stores_result->object)) == NULL)
    {
    goto fail; //Enum
    }


    // usage_vector_stores_result->usage_bytes
    if (!usage_vector_stores_result->usage_bytes) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "usage_bytes", usage_vector_stores_result->usage_bytes) == NULL) {
    goto fail; //Numeric
    }


    // usage_vector_stores_result->project_id
    if(usage_vector_stores_result->project_id) {
    if(cJSON_AddStringToObject(item, "project_id", usage_vector_stores_result->project_id) == NULL) {
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

usage_vector_stores_result_t *usage_vector_stores_result_parseFromJSON(cJSON *usage_vector_stores_resultJSON){

    usage_vector_stores_result_t *usage_vector_stores_result_local_var = NULL;

    // usage_vector_stores_result->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(usage_vector_stores_resultJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_usage_vector_stores_result_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = usage_vector_stores_result_object_FromString(object->valuestring);

    // usage_vector_stores_result->usage_bytes
    cJSON *usage_bytes = cJSON_GetObjectItemCaseSensitive(usage_vector_stores_resultJSON, "usage_bytes");
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

    // usage_vector_stores_result->project_id
    cJSON *project_id = cJSON_GetObjectItemCaseSensitive(usage_vector_stores_resultJSON, "project_id");
    if (cJSON_IsNull(project_id)) {
        project_id = NULL;
    }
    if (project_id) { 
    if(!cJSON_IsString(project_id) && !cJSON_IsNull(project_id))
    {
    goto end; //String
    }
    }


    usage_vector_stores_result_local_var = usage_vector_stores_result_create_internal (
        objectVariable,
        usage_bytes->valuedouble,
        project_id && !cJSON_IsNull(project_id) ? strdup(project_id->valuestring) : NULL
        );

    return usage_vector_stores_result_local_var;
end:
    return NULL;

}
