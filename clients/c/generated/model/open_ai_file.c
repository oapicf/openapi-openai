#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "open_ai_file.h"



open_ai_file_t *open_ai_file_create(
    char *id,
    char *object,
    int bytes,
    int created_at,
    char *filename,
    char *purpose,
    char *status,
    object_t *status_details
    ) {
    open_ai_file_t *open_ai_file_local_var = malloc(sizeof(open_ai_file_t));
    if (!open_ai_file_local_var) {
        return NULL;
    }
    open_ai_file_local_var->id = id;
    open_ai_file_local_var->object = object;
    open_ai_file_local_var->bytes = bytes;
    open_ai_file_local_var->created_at = created_at;
    open_ai_file_local_var->filename = filename;
    open_ai_file_local_var->purpose = purpose;
    open_ai_file_local_var->status = status;
    open_ai_file_local_var->status_details = status_details;

    return open_ai_file_local_var;
}


void open_ai_file_free(open_ai_file_t *open_ai_file) {
    if(NULL == open_ai_file){
        return ;
    }
    listEntry_t *listEntry;
    if (open_ai_file->id) {
        free(open_ai_file->id);
        open_ai_file->id = NULL;
    }
    if (open_ai_file->object) {
        free(open_ai_file->object);
        open_ai_file->object = NULL;
    }
    if (open_ai_file->filename) {
        free(open_ai_file->filename);
        open_ai_file->filename = NULL;
    }
    if (open_ai_file->purpose) {
        free(open_ai_file->purpose);
        open_ai_file->purpose = NULL;
    }
    if (open_ai_file->status) {
        free(open_ai_file->status);
        open_ai_file->status = NULL;
    }
    if (open_ai_file->status_details) {
        object_free(open_ai_file->status_details);
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


    // open_ai_file->object
    if (!open_ai_file->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", open_ai_file->object) == NULL) {
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


    // open_ai_file->purpose
    if (!open_ai_file->purpose) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "purpose", open_ai_file->purpose) == NULL) {
    goto fail; //String
    }


    // open_ai_file->status
    if(open_ai_file->status) {
    if(cJSON_AddStringToObject(item, "status", open_ai_file->status) == NULL) {
    goto fail; //String
    }
    }


    // open_ai_file->status_details
    if(open_ai_file->status_details) {
    cJSON *status_details_object = object_convertToJSON(open_ai_file->status_details);
    if(status_details_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "status_details", status_details_object);
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

open_ai_file_t *open_ai_file_parseFromJSON(cJSON *open_ai_fileJSON){

    open_ai_file_t *open_ai_file_local_var = NULL;

    // open_ai_file->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // open_ai_file->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "object");
    if (!object) {
        goto end;
    }

    
    if(!cJSON_IsString(object))
    {
    goto end; //String
    }

    // open_ai_file->bytes
    cJSON *bytes = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "bytes");
    if (!bytes) {
        goto end;
    }

    
    if(!cJSON_IsNumber(bytes))
    {
    goto end; //Numeric
    }

    // open_ai_file->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "created_at");
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }

    // open_ai_file->filename
    cJSON *filename = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "filename");
    if (!filename) {
        goto end;
    }

    
    if(!cJSON_IsString(filename))
    {
    goto end; //String
    }

    // open_ai_file->purpose
    cJSON *purpose = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "purpose");
    if (!purpose) {
        goto end;
    }

    
    if(!cJSON_IsString(purpose))
    {
    goto end; //String
    }

    // open_ai_file->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "status");
    if (status) { 
    if(!cJSON_IsString(status) && !cJSON_IsNull(status))
    {
    goto end; //String
    }
    }

    // open_ai_file->status_details
    cJSON *status_details = cJSON_GetObjectItemCaseSensitive(open_ai_fileJSON, "status_details");
    object_t *status_details_local_object = NULL;
    if (status_details) { 
    status_details_local_object = object_parseFromJSON(status_details); //object
    }


    open_ai_file_local_var = open_ai_file_create (
        strdup(id->valuestring),
        strdup(object->valuestring),
        bytes->valuedouble,
        created_at->valuedouble,
        strdup(filename->valuestring),
        strdup(purpose->valuestring),
        status && !cJSON_IsNull(status) ? strdup(status->valuestring) : NULL,
        status_details ? status_details_local_object : NULL
        );

    return open_ai_file_local_var;
end:
    return NULL;

}
