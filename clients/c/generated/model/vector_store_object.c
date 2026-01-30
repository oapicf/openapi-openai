#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vector_store_object.h"


char* vector_store_object_object_ToString(openai_api_vector_store_object_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "vector_store" };
    return objectArray[object];
}

openai_api_vector_store_object_OBJECT_e vector_store_object_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "vector_store" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* vector_store_object_status_ToString(openai_api_vector_store_object_STATUS_e status) {
    char* statusArray[] =  { "NULL", "expired", "in_progress", "completed" };
    return statusArray[status];
}

openai_api_vector_store_object_STATUS_e vector_store_object_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "expired", "in_progress", "completed" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static vector_store_object_t *vector_store_object_create_internal(
    char *id,
    openai_api_vector_store_object_OBJECT_e object,
    int created_at,
    char *name,
    int usage_bytes,
    vector_store_object_file_counts_t *file_counts,
    openai_api_vector_store_object_STATUS_e status,
    vector_store_expiration_after_t *expires_after,
    int expires_at,
    int last_active_at,
    object_t *metadata
    ) {
    vector_store_object_t *vector_store_object_local_var = malloc(sizeof(vector_store_object_t));
    if (!vector_store_object_local_var) {
        return NULL;
    }
    vector_store_object_local_var->id = id;
    vector_store_object_local_var->object = object;
    vector_store_object_local_var->created_at = created_at;
    vector_store_object_local_var->name = name;
    vector_store_object_local_var->usage_bytes = usage_bytes;
    vector_store_object_local_var->file_counts = file_counts;
    vector_store_object_local_var->status = status;
    vector_store_object_local_var->expires_after = expires_after;
    vector_store_object_local_var->expires_at = expires_at;
    vector_store_object_local_var->last_active_at = last_active_at;
    vector_store_object_local_var->metadata = metadata;

    vector_store_object_local_var->_library_owned = 1;
    return vector_store_object_local_var;
}

__attribute__((deprecated)) vector_store_object_t *vector_store_object_create(
    char *id,
    openai_api_vector_store_object_OBJECT_e object,
    int created_at,
    char *name,
    int usage_bytes,
    vector_store_object_file_counts_t *file_counts,
    openai_api_vector_store_object_STATUS_e status,
    vector_store_expiration_after_t *expires_after,
    int expires_at,
    int last_active_at,
    object_t *metadata
    ) {
    return vector_store_object_create_internal (
        id,
        object,
        created_at,
        name,
        usage_bytes,
        file_counts,
        status,
        expires_after,
        expires_at,
        last_active_at,
        metadata
        );
}

void vector_store_object_free(vector_store_object_t *vector_store_object) {
    if(NULL == vector_store_object){
        return ;
    }
    if(vector_store_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "vector_store_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (vector_store_object->id) {
        free(vector_store_object->id);
        vector_store_object->id = NULL;
    }
    if (vector_store_object->name) {
        free(vector_store_object->name);
        vector_store_object->name = NULL;
    }
    if (vector_store_object->file_counts) {
        vector_store_object_file_counts_free(vector_store_object->file_counts);
        vector_store_object->file_counts = NULL;
    }
    if (vector_store_object->expires_after) {
        vector_store_expiration_after_free(vector_store_object->expires_after);
        vector_store_object->expires_after = NULL;
    }
    if (vector_store_object->metadata) {
        object_free(vector_store_object->metadata);
        vector_store_object->metadata = NULL;
    }
    free(vector_store_object);
}

cJSON *vector_store_object_convertToJSON(vector_store_object_t *vector_store_object) {
    cJSON *item = cJSON_CreateObject();

    // vector_store_object->id
    if (!vector_store_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", vector_store_object->id) == NULL) {
    goto fail; //String
    }


    // vector_store_object->object
    if (openai_api_vector_store_object_OBJECT_NULL == vector_store_object->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", vector_store_object_object_ToString(vector_store_object->object)) == NULL)
    {
    goto fail; //Enum
    }


    // vector_store_object->created_at
    if (!vector_store_object->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", vector_store_object->created_at) == NULL) {
    goto fail; //Numeric
    }


    // vector_store_object->name
    if (!vector_store_object->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", vector_store_object->name) == NULL) {
    goto fail; //String
    }


    // vector_store_object->usage_bytes
    if (!vector_store_object->usage_bytes) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "usage_bytes", vector_store_object->usage_bytes) == NULL) {
    goto fail; //Numeric
    }


    // vector_store_object->file_counts
    if (!vector_store_object->file_counts) {
        goto fail;
    }
    cJSON *file_counts_local_JSON = vector_store_object_file_counts_convertToJSON(vector_store_object->file_counts);
    if(file_counts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_counts", file_counts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // vector_store_object->status
    if (openai_api_vector_store_object_STATUS_NULL == vector_store_object->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", vector_store_object_status_ToString(vector_store_object->status)) == NULL)
    {
    goto fail; //Enum
    }


    // vector_store_object->expires_after
    if(vector_store_object->expires_after) {
    cJSON *expires_after_local_JSON = vector_store_expiration_after_convertToJSON(vector_store_object->expires_after);
    if(expires_after_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "expires_after", expires_after_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // vector_store_object->expires_at
    if(vector_store_object->expires_at) {
    if(cJSON_AddNumberToObject(item, "expires_at", vector_store_object->expires_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // vector_store_object->last_active_at
    if (!vector_store_object->last_active_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "last_active_at", vector_store_object->last_active_at) == NULL) {
    goto fail; //Numeric
    }


    // vector_store_object->metadata
    if (!vector_store_object->metadata) {
        goto fail;
    }
    cJSON *metadata_object = object_convertToJSON(vector_store_object->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
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

vector_store_object_t *vector_store_object_parseFromJSON(cJSON *vector_store_objectJSON){

    vector_store_object_t *vector_store_object_local_var = NULL;

    // define the local variable for vector_store_object->file_counts
    vector_store_object_file_counts_t *file_counts_local_nonprim = NULL;

    // define the local variable for vector_store_object->expires_after
    vector_store_expiration_after_t *expires_after_local_nonprim = NULL;

    // vector_store_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(vector_store_objectJSON, "id");
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

    // vector_store_object->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(vector_store_objectJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_vector_store_object_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = vector_store_object_object_FromString(object->valuestring);

    // vector_store_object->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(vector_store_objectJSON, "created_at");
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

    // vector_store_object->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(vector_store_objectJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // vector_store_object->usage_bytes
    cJSON *usage_bytes = cJSON_GetObjectItemCaseSensitive(vector_store_objectJSON, "usage_bytes");
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

    // vector_store_object->file_counts
    cJSON *file_counts = cJSON_GetObjectItemCaseSensitive(vector_store_objectJSON, "file_counts");
    if (cJSON_IsNull(file_counts)) {
        file_counts = NULL;
    }
    if (!file_counts) {
        goto end;
    }

    
    file_counts_local_nonprim = vector_store_object_file_counts_parseFromJSON(file_counts); //nonprimitive

    // vector_store_object->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(vector_store_objectJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    openai_api_vector_store_object_STATUS_e statusVariable;
    
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = vector_store_object_status_FromString(status->valuestring);

    // vector_store_object->expires_after
    cJSON *expires_after = cJSON_GetObjectItemCaseSensitive(vector_store_objectJSON, "expires_after");
    if (cJSON_IsNull(expires_after)) {
        expires_after = NULL;
    }
    if (expires_after) { 
    expires_after_local_nonprim = vector_store_expiration_after_parseFromJSON(expires_after); //nonprimitive
    }

    // vector_store_object->expires_at
    cJSON *expires_at = cJSON_GetObjectItemCaseSensitive(vector_store_objectJSON, "expires_at");
    if (cJSON_IsNull(expires_at)) {
        expires_at = NULL;
    }
    if (expires_at) { 
    if(!cJSON_IsNumber(expires_at))
    {
    goto end; //Numeric
    }
    }

    // vector_store_object->last_active_at
    cJSON *last_active_at = cJSON_GetObjectItemCaseSensitive(vector_store_objectJSON, "last_active_at");
    if (cJSON_IsNull(last_active_at)) {
        last_active_at = NULL;
    }
    if (!last_active_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(last_active_at))
    {
    goto end; //Numeric
    }

    // vector_store_object->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(vector_store_objectJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    if (!metadata) {
        goto end;
    }

    object_t *metadata_local_object = NULL;
    
    metadata_local_object = object_parseFromJSON(metadata); //object


    vector_store_object_local_var = vector_store_object_create_internal (
        strdup(id->valuestring),
        objectVariable,
        created_at->valuedouble,
        strdup(name->valuestring),
        usage_bytes->valuedouble,
        file_counts_local_nonprim,
        statusVariable,
        expires_after ? expires_after_local_nonprim : NULL,
        expires_at ? expires_at->valuedouble : 0,
        last_active_at->valuedouble,
        metadata_local_object
        );

    return vector_store_object_local_var;
end:
    if (file_counts_local_nonprim) {
        vector_store_object_file_counts_free(file_counts_local_nonprim);
        file_counts_local_nonprim = NULL;
    }
    if (expires_after_local_nonprim) {
        vector_store_expiration_after_free(expires_after_local_nonprim);
        expires_after_local_nonprim = NULL;
    }
    return NULL;

}
