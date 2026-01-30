#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vector_store_file_object.h"


char* vector_store_file_object_object_ToString(openai_api_vector_store_file_object_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "vector_store.file" };
    return objectArray[object];
}

openai_api_vector_store_file_object_OBJECT_e vector_store_file_object_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "vector_store.file" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* vector_store_file_object_status_ToString(openai_api_vector_store_file_object_STATUS_e status) {
    char* statusArray[] =  { "NULL", "in_progress", "completed", "cancelled", "failed" };
    return statusArray[status];
}

openai_api_vector_store_file_object_STATUS_e vector_store_file_object_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "in_progress", "completed", "cancelled", "failed" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static vector_store_file_object_t *vector_store_file_object_create_internal(
    char *id,
    openai_api_vector_store_file_object_OBJECT_e object,
    int usage_bytes,
    int created_at,
    char *vector_store_id,
    openai_api_vector_store_file_object_STATUS_e status,
    vector_store_file_object_last_error_t *last_error,
    vector_store_file_object_chunking_strategy_t *chunking_strategy
    ) {
    vector_store_file_object_t *vector_store_file_object_local_var = malloc(sizeof(vector_store_file_object_t));
    if (!vector_store_file_object_local_var) {
        return NULL;
    }
    vector_store_file_object_local_var->id = id;
    vector_store_file_object_local_var->object = object;
    vector_store_file_object_local_var->usage_bytes = usage_bytes;
    vector_store_file_object_local_var->created_at = created_at;
    vector_store_file_object_local_var->vector_store_id = vector_store_id;
    vector_store_file_object_local_var->status = status;
    vector_store_file_object_local_var->last_error = last_error;
    vector_store_file_object_local_var->chunking_strategy = chunking_strategy;

    vector_store_file_object_local_var->_library_owned = 1;
    return vector_store_file_object_local_var;
}

__attribute__((deprecated)) vector_store_file_object_t *vector_store_file_object_create(
    char *id,
    openai_api_vector_store_file_object_OBJECT_e object,
    int usage_bytes,
    int created_at,
    char *vector_store_id,
    openai_api_vector_store_file_object_STATUS_e status,
    vector_store_file_object_last_error_t *last_error,
    vector_store_file_object_chunking_strategy_t *chunking_strategy
    ) {
    return vector_store_file_object_create_internal (
        id,
        object,
        usage_bytes,
        created_at,
        vector_store_id,
        status,
        last_error,
        chunking_strategy
        );
}

void vector_store_file_object_free(vector_store_file_object_t *vector_store_file_object) {
    if(NULL == vector_store_file_object){
        return ;
    }
    if(vector_store_file_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "vector_store_file_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (vector_store_file_object->id) {
        free(vector_store_file_object->id);
        vector_store_file_object->id = NULL;
    }
    if (vector_store_file_object->vector_store_id) {
        free(vector_store_file_object->vector_store_id);
        vector_store_file_object->vector_store_id = NULL;
    }
    if (vector_store_file_object->last_error) {
        vector_store_file_object_last_error_free(vector_store_file_object->last_error);
        vector_store_file_object->last_error = NULL;
    }
    if (vector_store_file_object->chunking_strategy) {
        vector_store_file_object_chunking_strategy_free(vector_store_file_object->chunking_strategy);
        vector_store_file_object->chunking_strategy = NULL;
    }
    free(vector_store_file_object);
}

cJSON *vector_store_file_object_convertToJSON(vector_store_file_object_t *vector_store_file_object) {
    cJSON *item = cJSON_CreateObject();

    // vector_store_file_object->id
    if (!vector_store_file_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", vector_store_file_object->id) == NULL) {
    goto fail; //String
    }


    // vector_store_file_object->object
    if (openai_api_vector_store_file_object_OBJECT_NULL == vector_store_file_object->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", vector_store_file_object_object_ToString(vector_store_file_object->object)) == NULL)
    {
    goto fail; //Enum
    }


    // vector_store_file_object->usage_bytes
    if (!vector_store_file_object->usage_bytes) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "usage_bytes", vector_store_file_object->usage_bytes) == NULL) {
    goto fail; //Numeric
    }


    // vector_store_file_object->created_at
    if (!vector_store_file_object->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", vector_store_file_object->created_at) == NULL) {
    goto fail; //Numeric
    }


    // vector_store_file_object->vector_store_id
    if (!vector_store_file_object->vector_store_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "vector_store_id", vector_store_file_object->vector_store_id) == NULL) {
    goto fail; //String
    }


    // vector_store_file_object->status
    if (openai_api_vector_store_file_object_STATUS_NULL == vector_store_file_object->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", vector_store_file_object_status_ToString(vector_store_file_object->status)) == NULL)
    {
    goto fail; //Enum
    }


    // vector_store_file_object->last_error
    if (!vector_store_file_object->last_error) {
        goto fail;
    }
    cJSON *last_error_local_JSON = vector_store_file_object_last_error_convertToJSON(vector_store_file_object->last_error);
    if(last_error_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "last_error", last_error_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // vector_store_file_object->chunking_strategy
    if(vector_store_file_object->chunking_strategy) {
    cJSON *chunking_strategy_local_JSON = vector_store_file_object_chunking_strategy_convertToJSON(vector_store_file_object->chunking_strategy);
    if(chunking_strategy_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "chunking_strategy", chunking_strategy_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

vector_store_file_object_t *vector_store_file_object_parseFromJSON(cJSON *vector_store_file_objectJSON){

    vector_store_file_object_t *vector_store_file_object_local_var = NULL;

    // define the local variable for vector_store_file_object->last_error
    vector_store_file_object_last_error_t *last_error_local_nonprim = NULL;

    // define the local variable for vector_store_file_object->chunking_strategy
    vector_store_file_object_chunking_strategy_t *chunking_strategy_local_nonprim = NULL;

    // vector_store_file_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(vector_store_file_objectJSON, "id");
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

    // vector_store_file_object->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(vector_store_file_objectJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_vector_store_file_object_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = vector_store_file_object_object_FromString(object->valuestring);

    // vector_store_file_object->usage_bytes
    cJSON *usage_bytes = cJSON_GetObjectItemCaseSensitive(vector_store_file_objectJSON, "usage_bytes");
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

    // vector_store_file_object->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(vector_store_file_objectJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }

    // vector_store_file_object->vector_store_id
    cJSON *vector_store_id = cJSON_GetObjectItemCaseSensitive(vector_store_file_objectJSON, "vector_store_id");
    if (cJSON_IsNull(vector_store_id)) {
        vector_store_id = NULL;
    }
    if (!vector_store_id) {
        goto end;
    }

    
    if(!cJSON_IsString(vector_store_id))
    {
    goto end; //String
    }

    // vector_store_file_object->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(vector_store_file_objectJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    openai_api_vector_store_file_object_STATUS_e statusVariable;
    
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = vector_store_file_object_status_FromString(status->valuestring);

    // vector_store_file_object->last_error
    cJSON *last_error = cJSON_GetObjectItemCaseSensitive(vector_store_file_objectJSON, "last_error");
    if (cJSON_IsNull(last_error)) {
        last_error = NULL;
    }
    if (!last_error) {
        goto end;
    }

    
    last_error_local_nonprim = vector_store_file_object_last_error_parseFromJSON(last_error); //nonprimitive

    // vector_store_file_object->chunking_strategy
    cJSON *chunking_strategy = cJSON_GetObjectItemCaseSensitive(vector_store_file_objectJSON, "chunking_strategy");
    if (cJSON_IsNull(chunking_strategy)) {
        chunking_strategy = NULL;
    }
    if (chunking_strategy) { 
    chunking_strategy_local_nonprim = vector_store_file_object_chunking_strategy_parseFromJSON(chunking_strategy); //nonprimitive
    }


    vector_store_file_object_local_var = vector_store_file_object_create_internal (
        strdup(id->valuestring),
        objectVariable,
        usage_bytes->valuedouble,
        created_at->valuedouble,
        strdup(vector_store_id->valuestring),
        statusVariable,
        last_error_local_nonprim,
        chunking_strategy ? chunking_strategy_local_nonprim : NULL
        );

    return vector_store_file_object_local_var;
end:
    if (last_error_local_nonprim) {
        vector_store_file_object_last_error_free(last_error_local_nonprim);
        last_error_local_nonprim = NULL;
    }
    if (chunking_strategy_local_nonprim) {
        vector_store_file_object_chunking_strategy_free(chunking_strategy_local_nonprim);
        chunking_strategy_local_nonprim = NULL;
    }
    return NULL;

}
