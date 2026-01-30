#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vector_store_file_object_last_error.h"


char* vector_store_file_object_last_error_code_ToString(openai_api_vector_store_file_object_last_error_CODE_e code) {
    char* codeArray[] =  { "NULL", "server_error", "unsupported_file", "invalid_file" };
    return codeArray[code];
}

openai_api_vector_store_file_object_last_error_CODE_e vector_store_file_object_last_error_code_FromString(char* code){
    int stringToReturn = 0;
    char *codeArray[] =  { "NULL", "server_error", "unsupported_file", "invalid_file" };
    size_t sizeofArray = sizeof(codeArray) / sizeof(codeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(code, codeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static vector_store_file_object_last_error_t *vector_store_file_object_last_error_create_internal(
    openai_api_vector_store_file_object_last_error_CODE_e code,
    char *message
    ) {
    vector_store_file_object_last_error_t *vector_store_file_object_last_error_local_var = malloc(sizeof(vector_store_file_object_last_error_t));
    if (!vector_store_file_object_last_error_local_var) {
        return NULL;
    }
    vector_store_file_object_last_error_local_var->code = code;
    vector_store_file_object_last_error_local_var->message = message;

    vector_store_file_object_last_error_local_var->_library_owned = 1;
    return vector_store_file_object_last_error_local_var;
}

__attribute__((deprecated)) vector_store_file_object_last_error_t *vector_store_file_object_last_error_create(
    openai_api_vector_store_file_object_last_error_CODE_e code,
    char *message
    ) {
    return vector_store_file_object_last_error_create_internal (
        code,
        message
        );
}

void vector_store_file_object_last_error_free(vector_store_file_object_last_error_t *vector_store_file_object_last_error) {
    if(NULL == vector_store_file_object_last_error){
        return ;
    }
    if(vector_store_file_object_last_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "vector_store_file_object_last_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (vector_store_file_object_last_error->message) {
        free(vector_store_file_object_last_error->message);
        vector_store_file_object_last_error->message = NULL;
    }
    free(vector_store_file_object_last_error);
}

cJSON *vector_store_file_object_last_error_convertToJSON(vector_store_file_object_last_error_t *vector_store_file_object_last_error) {
    cJSON *item = cJSON_CreateObject();

    // vector_store_file_object_last_error->code
    if (openai_api_vector_store_file_object_last_error_CODE_NULL == vector_store_file_object_last_error->code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "code", vector_store_file_object_last_error_code_ToString(vector_store_file_object_last_error->code)) == NULL)
    {
    goto fail; //Enum
    }


    // vector_store_file_object_last_error->message
    if (!vector_store_file_object_last_error->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", vector_store_file_object_last_error->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

vector_store_file_object_last_error_t *vector_store_file_object_last_error_parseFromJSON(cJSON *vector_store_file_object_last_errorJSON){

    vector_store_file_object_last_error_t *vector_store_file_object_last_error_local_var = NULL;

    // vector_store_file_object_last_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(vector_store_file_object_last_errorJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (!code) {
        goto end;
    }

    openai_api_vector_store_file_object_last_error_CODE_e codeVariable;
    
    if(!cJSON_IsString(code))
    {
    goto end; //Enum
    }
    codeVariable = vector_store_file_object_last_error_code_FromString(code->valuestring);

    // vector_store_file_object_last_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(vector_store_file_object_last_errorJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (!message) {
        goto end;
    }

    
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }


    vector_store_file_object_last_error_local_var = vector_store_file_object_last_error_create_internal (
        codeVariable,
        strdup(message->valuestring)
        );

    return vector_store_file_object_last_error_local_var;
end:
    return NULL;

}
