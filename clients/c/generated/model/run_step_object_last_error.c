#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_object_last_error.h"


char* run_step_object_last_error_code_ToString(openai_api_run_step_object_last_error_CODE_e code) {
    char* codeArray[] =  { "NULL", "server_error", "rate_limit_exceeded" };
    return codeArray[code];
}

openai_api_run_step_object_last_error_CODE_e run_step_object_last_error_code_FromString(char* code){
    int stringToReturn = 0;
    char *codeArray[] =  { "NULL", "server_error", "rate_limit_exceeded" };
    size_t sizeofArray = sizeof(codeArray) / sizeof(codeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(code, codeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

run_step_object_last_error_t *run_step_object_last_error_create(
    openai_api_run_step_object_last_error_CODE_e code,
    char *message
    ) {
    run_step_object_last_error_t *run_step_object_last_error_local_var = malloc(sizeof(run_step_object_last_error_t));
    if (!run_step_object_last_error_local_var) {
        return NULL;
    }
    run_step_object_last_error_local_var->code = code;
    run_step_object_last_error_local_var->message = message;

    return run_step_object_last_error_local_var;
}


void run_step_object_last_error_free(run_step_object_last_error_t *run_step_object_last_error) {
    if(NULL == run_step_object_last_error){
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_object_last_error->message) {
        free(run_step_object_last_error->message);
        run_step_object_last_error->message = NULL;
    }
    free(run_step_object_last_error);
}

cJSON *run_step_object_last_error_convertToJSON(run_step_object_last_error_t *run_step_object_last_error) {
    cJSON *item = cJSON_CreateObject();

    // run_step_object_last_error->code
    if (openai_api_run_step_object_last_error_CODE_NULL == run_step_object_last_error->code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "code", coderun_step_object_last_error_ToString(run_step_object_last_error->code)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_object_last_error->message
    if (!run_step_object_last_error->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", run_step_object_last_error->message) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_step_object_last_error_t *run_step_object_last_error_parseFromJSON(cJSON *run_step_object_last_errorJSON){

    run_step_object_last_error_t *run_step_object_last_error_local_var = NULL;

    // run_step_object_last_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(run_step_object_last_errorJSON, "code");
    if (!code) {
        goto end;
    }

    openai_api_run_step_object_last_error_CODE_e codeVariable;
    
    if(!cJSON_IsString(code))
    {
    goto end; //Enum
    }
    codeVariable = run_step_object_last_error_code_FromString(code->valuestring);

    // run_step_object_last_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(run_step_object_last_errorJSON, "message");
    if (!message) {
        goto end;
    }

    
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }


    run_step_object_last_error_local_var = run_step_object_last_error_create (
        codeVariable,
        strdup(message->valuestring)
        );

    return run_step_object_last_error_local_var;
end:
    return NULL;

}
