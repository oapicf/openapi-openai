#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_upload_request.h"


char* create_upload_request_purpose_ToString(openai_api_create_upload_request_PURPOSE_e purpose) {
    char* purposeArray[] =  { "NULL", "assistants", "batch", "fine-tune", "vision" };
    return purposeArray[purpose];
}

openai_api_create_upload_request_PURPOSE_e create_upload_request_purpose_FromString(char* purpose){
    int stringToReturn = 0;
    char *purposeArray[] =  { "NULL", "assistants", "batch", "fine-tune", "vision" };
    size_t sizeofArray = sizeof(purposeArray) / sizeof(purposeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(purpose, purposeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_upload_request_t *create_upload_request_create_internal(
    char *filename,
    openai_api_create_upload_request_PURPOSE_e purpose,
    int *bytes,
    char *mime_type
    ) {
    create_upload_request_t *create_upload_request_local_var = malloc(sizeof(create_upload_request_t));
    if (!create_upload_request_local_var) {
        return NULL;
    }
    memset(create_upload_request_local_var, 0, sizeof(create_upload_request_t));
    create_upload_request_local_var->_library_owned = 1;
    create_upload_request_local_var->filename = filename;
    create_upload_request_local_var->purpose = purpose;
    create_upload_request_local_var->bytes = bytes;
    create_upload_request_local_var->mime_type = mime_type;
    return create_upload_request_local_var;
}

__attribute__((deprecated)) create_upload_request_t *create_upload_request_create(
    char *filename,
    openai_api_create_upload_request_PURPOSE_e purpose,
    int *bytes,
    char *mime_type
    ) {
    int *bytes_copy = NULL;
    if (bytes) {
        bytes_copy = malloc(sizeof(int));
        if (bytes_copy) *bytes_copy = *bytes;
    }
    create_upload_request_t *result = create_upload_request_create_internal (
        filename,
        purpose,
        bytes_copy,
        mime_type
        );
    if (!result) {
        free(bytes_copy);
    }
    return result;
}

void create_upload_request_free(create_upload_request_t *create_upload_request) {
    if(NULL == create_upload_request){
        return ;
    }
    if(create_upload_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_upload_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_upload_request->filename) {
        free(create_upload_request->filename);
        create_upload_request->filename = NULL;
    }
    if (create_upload_request->bytes) {
        free(create_upload_request->bytes);
        create_upload_request->bytes = NULL;
    }
    if (create_upload_request->mime_type) {
        free(create_upload_request->mime_type);
        create_upload_request->mime_type = NULL;
    }
    free(create_upload_request);
}

cJSON *create_upload_request_convertToJSON(create_upload_request_t *create_upload_request) {
    cJSON *item = cJSON_CreateObject();

    // create_upload_request->filename
    if (!create_upload_request->filename) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "filename", create_upload_request->filename) == NULL) {
    goto fail; //String
    }


    // create_upload_request->purpose
    if (openai_api_create_upload_request_PURPOSE_NULL == create_upload_request->purpose) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "purpose", create_upload_request_purpose_ToString(create_upload_request->purpose)) == NULL)
    {
    goto fail; //Enum
    }


    // create_upload_request->bytes
    if (!create_upload_request->bytes) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "bytes", *create_upload_request->bytes) == NULL) {
    goto fail; //Numeric
    }


    // create_upload_request->mime_type
    if (!create_upload_request->mime_type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "mime_type", create_upload_request->mime_type) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_upload_request_t *create_upload_request_parseFromJSON(cJSON *create_upload_requestJSON){

    create_upload_request_t *create_upload_request_local_var = NULL;

    char *filename_local_str = NULL;

    // define the local variable for create_upload_request->bytes
    int *bytes_local_var = NULL;

    char *mime_type_local_str = NULL;

    // create_upload_request->filename
    cJSON *filename = cJSON_GetObjectItemCaseSensitive(create_upload_requestJSON, "filename");
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

    // create_upload_request->purpose
    cJSON *purpose = cJSON_GetObjectItemCaseSensitive(create_upload_requestJSON, "purpose");
    if (cJSON_IsNull(purpose)) {
        purpose = NULL;
    }
    if (!purpose) {
        goto end;
    }

    openai_api_create_upload_request_PURPOSE_e purposeVariable;
    
    if(!cJSON_IsString(purpose))
    {
    goto end; //Enum
    }
    purposeVariable = create_upload_request_purpose_FromString(purpose->valuestring);

    // create_upload_request->bytes
    cJSON *bytes = cJSON_GetObjectItemCaseSensitive(create_upload_requestJSON, "bytes");
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
    bytes_local_var = malloc(sizeof(int));
    if(!bytes_local_var)
    {
        goto end;
    }
    *bytes_local_var = bytes->valuedouble;

    // create_upload_request->mime_type
    cJSON *mime_type = cJSON_GetObjectItemCaseSensitive(create_upload_requestJSON, "mime_type");
    if (cJSON_IsNull(mime_type)) {
        mime_type = NULL;
    }
    if (!mime_type) {
        goto end;
    }

    
    if(!cJSON_IsString(mime_type))
    {
    goto end; //String
    }


    if (filename && !cJSON_IsNull(filename)) filename_local_str = strdup(filename->valuestring);
    if (mime_type && !cJSON_IsNull(mime_type)) mime_type_local_str = strdup(mime_type->valuestring);

    create_upload_request_local_var = create_upload_request_create_internal (
        filename_local_str,
        purposeVariable,
        bytes_local_var,
        mime_type_local_str
        );

    if (!create_upload_request_local_var) {
        goto end;
    }

    return create_upload_request_local_var;
end:
    if (filename_local_str) {
        free(filename_local_str);
        filename_local_str = NULL;
    }
    if (bytes_local_var) {
        free(bytes_local_var);
        bytes_local_var = NULL;
    }
    if (mime_type_local_str) {
        free(mime_type_local_str);
        mime_type_local_str = NULL;
    }
    return NULL;

}
