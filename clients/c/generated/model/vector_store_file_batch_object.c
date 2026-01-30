#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vector_store_file_batch_object.h"


char* vector_store_file_batch_object_object_ToString(openai_api_vector_store_file_batch_object_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "vector_store.files_batch" };
    return objectArray[object];
}

openai_api_vector_store_file_batch_object_OBJECT_e vector_store_file_batch_object_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "vector_store.files_batch" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* vector_store_file_batch_object_status_ToString(openai_api_vector_store_file_batch_object_STATUS_e status) {
    char* statusArray[] =  { "NULL", "in_progress", "completed", "cancelled", "failed" };
    return statusArray[status];
}

openai_api_vector_store_file_batch_object_STATUS_e vector_store_file_batch_object_status_FromString(char* status){
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

static vector_store_file_batch_object_t *vector_store_file_batch_object_create_internal(
    char *id,
    openai_api_vector_store_file_batch_object_OBJECT_e object,
    int created_at,
    char *vector_store_id,
    openai_api_vector_store_file_batch_object_STATUS_e status,
    vector_store_file_batch_object_file_counts_t *file_counts
    ) {
    vector_store_file_batch_object_t *vector_store_file_batch_object_local_var = malloc(sizeof(vector_store_file_batch_object_t));
    if (!vector_store_file_batch_object_local_var) {
        return NULL;
    }
    vector_store_file_batch_object_local_var->id = id;
    vector_store_file_batch_object_local_var->object = object;
    vector_store_file_batch_object_local_var->created_at = created_at;
    vector_store_file_batch_object_local_var->vector_store_id = vector_store_id;
    vector_store_file_batch_object_local_var->status = status;
    vector_store_file_batch_object_local_var->file_counts = file_counts;

    vector_store_file_batch_object_local_var->_library_owned = 1;
    return vector_store_file_batch_object_local_var;
}

__attribute__((deprecated)) vector_store_file_batch_object_t *vector_store_file_batch_object_create(
    char *id,
    openai_api_vector_store_file_batch_object_OBJECT_e object,
    int created_at,
    char *vector_store_id,
    openai_api_vector_store_file_batch_object_STATUS_e status,
    vector_store_file_batch_object_file_counts_t *file_counts
    ) {
    return vector_store_file_batch_object_create_internal (
        id,
        object,
        created_at,
        vector_store_id,
        status,
        file_counts
        );
}

void vector_store_file_batch_object_free(vector_store_file_batch_object_t *vector_store_file_batch_object) {
    if(NULL == vector_store_file_batch_object){
        return ;
    }
    if(vector_store_file_batch_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "vector_store_file_batch_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (vector_store_file_batch_object->id) {
        free(vector_store_file_batch_object->id);
        vector_store_file_batch_object->id = NULL;
    }
    if (vector_store_file_batch_object->vector_store_id) {
        free(vector_store_file_batch_object->vector_store_id);
        vector_store_file_batch_object->vector_store_id = NULL;
    }
    if (vector_store_file_batch_object->file_counts) {
        vector_store_file_batch_object_file_counts_free(vector_store_file_batch_object->file_counts);
        vector_store_file_batch_object->file_counts = NULL;
    }
    free(vector_store_file_batch_object);
}

cJSON *vector_store_file_batch_object_convertToJSON(vector_store_file_batch_object_t *vector_store_file_batch_object) {
    cJSON *item = cJSON_CreateObject();

    // vector_store_file_batch_object->id
    if (!vector_store_file_batch_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", vector_store_file_batch_object->id) == NULL) {
    goto fail; //String
    }


    // vector_store_file_batch_object->object
    if (openai_api_vector_store_file_batch_object_OBJECT_NULL == vector_store_file_batch_object->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", vector_store_file_batch_object_object_ToString(vector_store_file_batch_object->object)) == NULL)
    {
    goto fail; //Enum
    }


    // vector_store_file_batch_object->created_at
    if (!vector_store_file_batch_object->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", vector_store_file_batch_object->created_at) == NULL) {
    goto fail; //Numeric
    }


    // vector_store_file_batch_object->vector_store_id
    if (!vector_store_file_batch_object->vector_store_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "vector_store_id", vector_store_file_batch_object->vector_store_id) == NULL) {
    goto fail; //String
    }


    // vector_store_file_batch_object->status
    if (openai_api_vector_store_file_batch_object_STATUS_NULL == vector_store_file_batch_object->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", vector_store_file_batch_object_status_ToString(vector_store_file_batch_object->status)) == NULL)
    {
    goto fail; //Enum
    }


    // vector_store_file_batch_object->file_counts
    if (!vector_store_file_batch_object->file_counts) {
        goto fail;
    }
    cJSON *file_counts_local_JSON = vector_store_file_batch_object_file_counts_convertToJSON(vector_store_file_batch_object->file_counts);
    if(file_counts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_counts", file_counts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

vector_store_file_batch_object_t *vector_store_file_batch_object_parseFromJSON(cJSON *vector_store_file_batch_objectJSON){

    vector_store_file_batch_object_t *vector_store_file_batch_object_local_var = NULL;

    // define the local variable for vector_store_file_batch_object->file_counts
    vector_store_file_batch_object_file_counts_t *file_counts_local_nonprim = NULL;

    // vector_store_file_batch_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(vector_store_file_batch_objectJSON, "id");
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

    // vector_store_file_batch_object->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(vector_store_file_batch_objectJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_vector_store_file_batch_object_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = vector_store_file_batch_object_object_FromString(object->valuestring);

    // vector_store_file_batch_object->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(vector_store_file_batch_objectJSON, "created_at");
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

    // vector_store_file_batch_object->vector_store_id
    cJSON *vector_store_id = cJSON_GetObjectItemCaseSensitive(vector_store_file_batch_objectJSON, "vector_store_id");
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

    // vector_store_file_batch_object->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(vector_store_file_batch_objectJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    openai_api_vector_store_file_batch_object_STATUS_e statusVariable;
    
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = vector_store_file_batch_object_status_FromString(status->valuestring);

    // vector_store_file_batch_object->file_counts
    cJSON *file_counts = cJSON_GetObjectItemCaseSensitive(vector_store_file_batch_objectJSON, "file_counts");
    if (cJSON_IsNull(file_counts)) {
        file_counts = NULL;
    }
    if (!file_counts) {
        goto end;
    }

    
    file_counts_local_nonprim = vector_store_file_batch_object_file_counts_parseFromJSON(file_counts); //nonprimitive


    vector_store_file_batch_object_local_var = vector_store_file_batch_object_create_internal (
        strdup(id->valuestring),
        objectVariable,
        created_at->valuedouble,
        strdup(vector_store_id->valuestring),
        statusVariable,
        file_counts_local_nonprim
        );

    return vector_store_file_batch_object_local_var;
end:
    if (file_counts_local_nonprim) {
        vector_store_file_batch_object_file_counts_free(file_counts_local_nonprim);
        file_counts_local_nonprim = NULL;
    }
    return NULL;

}
