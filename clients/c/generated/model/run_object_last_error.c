#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_object_last_error.h"


char* run_object_last_error_code_ToString(openai_api_run_object_last_error_CODE_e code) {
    char* codeArray[] =  { "NULL", "server_error", "rate_limit_exceeded", "invalid_prompt" };
    return codeArray[code];
}

openai_api_run_object_last_error_CODE_e run_object_last_error_code_FromString(char* code){
    int stringToReturn = 0;
    char *codeArray[] =  { "NULL", "server_error", "rate_limit_exceeded", "invalid_prompt" };
    size_t sizeofArray = sizeof(codeArray) / sizeof(codeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(code, codeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static run_object_last_error_t *run_object_last_error_create_internal(
    openai_api_run_object_last_error_CODE_e code,
    char *message
    ) {
    run_object_last_error_t *run_object_last_error_local_var = malloc(sizeof(run_object_last_error_t));
    if (!run_object_last_error_local_var) {
        return NULL;
    }
    run_object_last_error_local_var->code = code;
    run_object_last_error_local_var->message = message;

    run_object_last_error_local_var->_library_owned = 1;
    return run_object_last_error_local_var;
}

__attribute__((deprecated)) run_object_last_error_t *run_object_last_error_create(
    openai_api_run_object_last_error_CODE_e code,
    char *message
    ) {
    return run_object_last_error_create_internal (
        code,
        message
        );
}

void run_object_last_error_free(run_object_last_error_t *run_object_last_error) {
    if(NULL == run_object_last_error){
        return ;
    }
    if(run_object_last_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_object_last_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_object_last_error->message) {
        free(run_object_last_error->message);
        run_object_last_error->message = NULL;
    }
    free(run_object_last_error);
}

cJSON *run_object_last_error_convertToJSON(run_object_last_error_t *run_object_last_error) {
    cJSON *item = cJSON_CreateObject();

    // run_object_last_error->code
    if (openai_api_run_object_last_error_CODE_NULL == run_object_last_error->code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "code", run_object_last_error_code_ToString(run_object_last_error->code)) == NULL)
    {
    goto fail; //Enum
    }


    // run_object_last_error->message
    if (!run_object_last_error->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", run_object_last_error->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_object_last_error_t *run_object_last_error_parseFromJSON(cJSON *run_object_last_errorJSON){

    run_object_last_error_t *run_object_last_error_local_var = NULL;

    // run_object_last_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(run_object_last_errorJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (!code) {
        goto end;
    }

    openai_api_run_object_last_error_CODE_e codeVariable;
    
    if(!cJSON_IsString(code))
    {
    goto end; //Enum
    }
    codeVariable = run_object_last_error_code_FromString(code->valuestring);

    // run_object_last_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(run_object_last_errorJSON, "message");
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


    run_object_last_error_local_var = run_object_last_error_create_internal (
        codeVariable,
        strdup(message->valuestring)
        );

    return run_object_last_error_local_var;
end:
    return NULL;

}
