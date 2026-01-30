#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "open_ai_file.h"


char* open_ai_file_object_ToString(openai_api_open_ai_file_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "file" };
    return objectArray[object];
}

openai_api_open_ai_file_OBJECT_e open_ai_file_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "file" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* open_ai_file_purpose_ToString(openai_api_open_ai_file_PURPOSE_e purpose) {
    char* purposeArray[] =  { "NULL", "assistants", "assistants_output", "batch", "batch_output", "fine-tune", "fine-tune-results", "vision" };
    return purposeArray[purpose];
}

openai_api_open_ai_file_PURPOSE_e open_ai_file_purpose_FromString(char* purpose){
    int stringToReturn = 0;
    char *purposeArray[] =  { "NULL", "assistants", "assistants_output", "batch", "batch_output", "fine-tune", "fine-tune-results", "vision" };
    size_t sizeofArray = sizeof(purposeArray) / sizeof(purposeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(purpose, purposeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* open_ai_file_status_ToString(openai_api_open_ai_file_STATUS_e status) {
    char* statusArray[] =  { "NULL", "uploaded", "processed", "error" };
    return statusArray[status];
}

openai_api_open_ai_file_STATUS_e open_ai_file_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "uploaded", "processed", "error" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static open_ai_file_t *open_ai_file_create_internal(
    char *id,
    int bytes,
    int created_at,
    char *filename,
    openai_api_open_ai_file_OBJECT_e object,
    openai_api_open_ai_file_PURPOSE_e purpose,
    openai_api_open_ai_file_STATUS_e status,
    char *status_details
    ) {
    open_ai_file_t *open_ai_file_local_var = malloc(sizeof(open_ai_file_t));
    if (!open_ai_file_local_var) {
        return NULL;
    }
    open_ai_file_local_var->id = id;
    open_ai_file_local_var->bytes = bytes;
    open_ai_file_local_var->created_at = created_at;
    open_ai_file_local_var->filename = filename;
    open_ai_file_local_var->object = object;
    open_ai_file_local_var->purpose = purpose;
    open_ai_file_local_var->status = status;
    open_ai_file_local_var->status_details = status_details;

    open_ai_file_local_var->_library_owned = 1;
    return open_ai_file_local_var;
}

__attribute__((deprecated)) open_ai_file_t *open_ai_file_create(
    char *id,
    int bytes,
    int created_at,
    char *filename,
    openai_api_open_ai_file_OBJECT_e object,
    openai_api_open_ai_file_PURPOSE_e purpose,
    openai_api_open_ai_file_STATUS_e status,
    char *status_details
    ) {
    return open_ai_file_create_internal (
        id,
        bytes,
        created_at,
        filename,
        object,
        purpose,
        status,
        status_details
        );
}

void open_ai_file_free(open_ai_file_t *open_ai_file) {
    if(NULL == open_ai_file){
        return ;
    }
    if(open_ai_file->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "open_ai_file_free");
        return ;
    }
    listEntry_t *listEntry;
    if (open_ai_file->id) {
        free(open_ai_file->id);
        open_ai_file->id = NULL;
    }
    if (open_ai_file->filename) {
        free(open_ai_file->filename);
        open_ai_file->filename = NULL;
    }
    if (open_ai_file->status_details) {
        free(open_ai_file->status_details);
        open_ai_file->status_details = NULL;
    }
    free(open_ai_file);
}

cJSON *open_ai_file_convertToJSON(open_ai_file_t *open_ai_file) {
    cJSON *item = cJSON_CreateObject();

    // open_ai_file->id
    if (!open_ai_file->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", open_ai_file->id) == NULL) {
    goto fail; //String
    }


    // open_ai_file->bytes
    if (!open_ai_file->bytes) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "bytes", open_ai_file->bytes) == NULL) {
    goto fail; //Numeric
    }


    // open_ai_file->created_at
    if (!open_ai_file->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", open_ai_file->created_at) == NULL) {
    goto fail; //Numeric
    }


    // open_ai_file->filename
    if (!open_ai_file->filename) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "filename", open_ai_file->filename) == NULL) {
    goto fail; //String
    }


    // open_ai_file->object
    if (openai_api_open_ai_file_OBJECT_NULL == open_ai_file->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", open_ai_file_object_ToString(open_ai_file->object)) == NULL)
    {
    goto fail; //Enum
    }


    // open_ai_file->purpose
    if (openai_api_open_ai_file_PURPOSE_NULL == open_ai_file->purpose) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "purpose", open_ai_file_purpose_ToString(open_ai_file->purpose)) == NULL)
    {
    goto fail; //Enum
    }


    // open_ai_file->status
    if (openai_api_open_ai_file_STATUS_NULL == open_ai_file->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", open_ai_file_status_ToString(open_ai_file->status)) == NULL)
    {
    goto fail; //Enum
    }


    // open_ai_file->status_details
    if(open_ai_file->status_details) {
    if(cJSON_AddStringToObject(item, "status_details", open_ai_file->status_details) == NULL) {
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

open_ai_file_t *open_ai_file_parseFromJSON(cJSON *open_ai_fileJSON){

    open_ai_file_t *open_ai_file_local_var = NULL;

    // open_ai_file->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "id");
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

    // open_ai_file->bytes
    cJSON *bytes = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "bytes");
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

    // open_ai_file->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "created_at");
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

    // open_ai_file->filename
    cJSON *filename = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "filename");
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

    // open_ai_file->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_open_ai_file_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = open_ai_file_object_FromString(object->valuestring);

    // open_ai_file->purpose
    cJSON *purpose = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "purpose");
    if (cJSON_IsNull(purpose)) {
        purpose = NULL;
    }
    if (!purpose) {
        goto end;
    }

    openai_api_open_ai_file_PURPOSE_e purposeVariable;
    
    if(!cJSON_IsString(purpose))
    {
    goto end; //Enum
    }
    purposeVariable = open_ai_file_purpose_FromString(purpose->valuestring);

    // open_ai_file->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    openai_api_open_ai_file_STATUS_e statusVariable;
    
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = open_ai_file_status_FromString(status->valuestring);

    // open_ai_file->status_details
    cJSON *status_details = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "status_details");
    if (cJSON_IsNull(status_details)) {
        status_details = NULL;
    }
    if (status_details) { 
    if(!cJSON_IsString(status_details) && !cJSON_IsNull(status_details))
    {
    goto end; //String
    }
    }


    open_ai_file_local_var = open_ai_file_create_internal (
        strdup(id->valuestring),
        bytes->valuedouble,
        created_at->valuedouble,
        strdup(filename->valuestring),
        objectVariable,
        purposeVariable,
        statusVariable,
        status_details && !cJSON_IsNull(status_details) ? strdup(status_details->valuestring) : NULL
        );

    return open_ai_file_local_var;
end:
    return NULL;

}
