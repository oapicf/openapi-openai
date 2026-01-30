#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "upload.h"


char* upload_status_ToString(openai_api_upload_STATUS_e status) {
    char* statusArray[] =  { "NULL", "pending", "completed", "cancelled", "expired" };
    return statusArray[status];
}

openai_api_upload_STATUS_e upload_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "pending", "completed", "cancelled", "expired" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* upload_object_ToString(openai_api_upload_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "upload" };
    return objectArray[object];
}

openai_api_upload_OBJECT_e upload_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "upload" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static upload_t *upload_create_internal(
    char *id,
    int created_at,
    char *filename,
    int bytes,
    char *purpose,
    openai_api_upload_STATUS_e status,
    int expires_at,
    openai_api_upload_OBJECT_e object,
    open_ai_file_t *file
    ) {
    upload_t *upload_local_var = malloc(sizeof(upload_t));
    if (!upload_local_var) {
        return NULL;
    }
    upload_local_var->id = id;
    upload_local_var->created_at = created_at;
    upload_local_var->filename = filename;
    upload_local_var->bytes = bytes;
    upload_local_var->purpose = purpose;
    upload_local_var->status = status;
    upload_local_var->expires_at = expires_at;
    upload_local_var->object = object;
    upload_local_var->file = file;

    upload_local_var->_library_owned = 1;
    return upload_local_var;
}

__attribute__((deprecated)) upload_t *upload_create(
    char *id,
    int created_at,
    char *filename,
    int bytes,
    char *purpose,
    openai_api_upload_STATUS_e status,
    int expires_at,
    openai_api_upload_OBJECT_e object,
    open_ai_file_t *file
    ) {
    return upload_create_internal (
        id,
        created_at,
        filename,
        bytes,
        purpose,
        status,
        expires_at,
        object,
        file
        );
}

void upload_free(upload_t *upload) {
    if(NULL == upload){
        return ;
    }
    if(upload->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "upload_free");
        return ;
    }
    listEntry_t *listEntry;
    if (upload->id) {
        free(upload->id);
        upload->id = NULL;
    }
    if (upload->filename) {
        free(upload->filename);
        upload->filename = NULL;
    }
    if (upload->purpose) {
        free(upload->purpose);
        upload->purpose = NULL;
    }
    if (upload->file) {
        open_ai_file_free(upload->file);
        upload->file = NULL;
    }
    free(upload);
}

cJSON *upload_convertToJSON(upload_t *upload) {
    cJSON *item = cJSON_CreateObject();

    // upload->id
    if (!upload->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", upload->id) == NULL) {
    goto fail; //String
    }


    // upload->created_at
    if (!upload->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", upload->created_at) == NULL) {
    goto fail; //Numeric
    }


    // upload->filename
    if (!upload->filename) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "filename", upload->filename) == NULL) {
    goto fail; //String
    }


    // upload->bytes
    if (!upload->bytes) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "bytes", upload->bytes) == NULL) {
    goto fail; //Numeric
    }


    // upload->purpose
    if (!upload->purpose) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "purpose", upload->purpose) == NULL) {
    goto fail; //String
    }


    // upload->status
    if (openai_api_upload_STATUS_NULL == upload->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", upload_status_ToString(upload->status)) == NULL)
    {
    goto fail; //Enum
    }


    // upload->expires_at
    if (!upload->expires_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "expires_at", upload->expires_at) == NULL) {
    goto fail; //Numeric
    }


    // upload->object
    if(upload->object != openai_api_upload_OBJECT_NULL) {
    if(cJSON_AddStringToObject(item, "object", upload_object_ToString(upload->object)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // upload->file
    if(upload->file) {
    cJSON *file_local_JSON = open_ai_file_convertToJSON(upload->file);
    if(file_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file", file_local_JSON);
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

upload_t *upload_parseFromJSON(cJSON *uploadJSON){

    upload_t *upload_local_var = NULL;

    // define the local variable for upload->file
    open_ai_file_t *file_local_nonprim = NULL;

    // upload->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(uploadJSON, "id");
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

    // upload->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(uploadJSON, "created_at");
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

    // upload->filename
    cJSON *filename = cJSON_GetObjectItemCaseSensitive(uploadJSON, "filename");
    if (cJSON_IsNull(filename)) {
        filename = NULL;
    }
    if (!filename) {
        goto end;
    }

    
    if(!cJSON_IsString(filename))
    {
    goto end; //String
    }

    // upload->bytes
    cJSON *bytes = cJSON_GetObjectItemCaseSensitive(uploadJSON, "bytes");
    if (cJSON_IsNull(bytes)) {
        bytes = NULL;
    }
    if (!bytes) {
        goto end;
    }

    
    if(!cJSON_IsNumber(bytes))
    {
    goto end; //Numeric
    }

    // upload->purpose
    cJSON *purpose = cJSON_GetObjectItemCaseSensitive(uploadJSON, "purpose");
    if (cJSON_IsNull(purpose)) {
        purpose = NULL;
    }
    if (!purpose) {
        goto end;
    }

    
    if(!cJSON_IsString(purpose))
    {
    goto end; //String
    }

    // upload->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(uploadJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    openai_api_upload_STATUS_e statusVariable;
    
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = upload_status_FromString(status->valuestring);

    // upload->expires_at
    cJSON *expires_at = cJSON_GetObjectItemCaseSensitive(uploadJSON, "expires_at");
    if (cJSON_IsNull(expires_at)) {
        expires_at = NULL;
    }
    if (!expires_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(expires_at))
    {
    goto end; //Numeric
    }

    // upload->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(uploadJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    openai_api_upload_OBJECT_e objectVariable;
    if (object) { 
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = upload_object_FromString(object->valuestring);
    }

    // upload->file
    cJSON *file = cJSON_GetObjectItemCaseSensitive(uploadJSON, "file");
    if (cJSON_IsNull(file)) {
        file = NULL;
    }
    if (file) { 
    file_local_nonprim = open_ai_file_parseFromJSON(file); //nonprimitive
    }


    upload_local_var = upload_create_internal (
        strdup(id->valuestring),
        created_at->valuedouble,
        strdup(filename->valuestring),
        bytes->valuedouble,
        strdup(purpose->valuestring),
        statusVariable,
        expires_at->valuedouble,
        object ? objectVariable : openai_api_upload_OBJECT_NULL,
        file ? file_local_nonprim : NULL
        );

    return upload_local_var;
end:
    if (file_local_nonprim) {
        open_ai_file_free(file_local_nonprim);
        file_local_nonprim = NULL;
    }
    return NULL;

}
