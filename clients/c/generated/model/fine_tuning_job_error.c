#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tuning_job_error.h"



static fine_tuning_job_error_t *fine_tuning_job_error_create_internal(
    char *code,
    char *message,
    char *param
    ) {
    fine_tuning_job_error_t *fine_tuning_job_error_local_var = malloc(sizeof(fine_tuning_job_error_t));
    if (!fine_tuning_job_error_local_var) {
        return NULL;
    }
    fine_tuning_job_error_local_var->code = code;
    fine_tuning_job_error_local_var->message = message;
    fine_tuning_job_error_local_var->param = param;

    fine_tuning_job_error_local_var->_library_owned = 1;
    return fine_tuning_job_error_local_var;
}

__attribute__((deprecated)) fine_tuning_job_error_t *fine_tuning_job_error_create(
    char *code,
    char *message,
    char *param
    ) {
    return fine_tuning_job_error_create_internal (
        code,
        message,
        param
        );
}

void fine_tuning_job_error_free(fine_tuning_job_error_t *fine_tuning_job_error) {
    if(NULL == fine_tuning_job_error){
        return ;
    }
    if(fine_tuning_job_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tuning_job_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tuning_job_error->code) {
        free(fine_tuning_job_error->code);
        fine_tuning_job_error->code = NULL;
    }
    if (fine_tuning_job_error->message) {
        free(fine_tuning_job_error->message);
        fine_tuning_job_error->message = NULL;
    }
    if (fine_tuning_job_error->param) {
        free(fine_tuning_job_error->param);
        fine_tuning_job_error->param = NULL;
    }
    free(fine_tuning_job_error);
}

cJSON *fine_tuning_job_error_convertToJSON(fine_tuning_job_error_t *fine_tuning_job_error) {
    cJSON *item = cJSON_CreateObject();

    // fine_tuning_job_error->code
    if (!fine_tuning_job_error->code) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "code", fine_tuning_job_error->code) == NULL) {
    goto fail; //String
    }


    // fine_tuning_job_error->message
    if (!fine_tuning_job_error->message) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "message", fine_tuning_job_error->message) == NULL) {
    goto fail; //String
    }


    // fine_tuning_job_error->param
    if (!fine_tuning_job_error->param) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "param", fine_tuning_job_error->param) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

fine_tuning_job_error_t *fine_tuning_job_error_parseFromJSON(cJSON *fine_tuning_job_errorJSON){

    fine_tuning_job_error_t *fine_tuning_job_error_local_var = NULL;

    // fine_tuning_job_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_errorJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (!code) {
        goto end;
    }

    
    if(!cJSON_IsString(code))
    {
    goto end; //String
    }

    // fine_tuning_job_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_errorJSON, "message");
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

    // fine_tuning_job_error->param
    cJSON *param = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_errorJSON, "param");
    if (cJSON_IsNull(param)) {
        param = NULL;
    }
    if (!param) {
        goto end;
    }

    
    if(!cJSON_IsString(param))
    {
    goto end; //String
    }


    fine_tuning_job_error_local_var = fine_tuning_job_error_create_internal (
        strdup(code->valuestring),
        strdup(message->valuestring),
        strdup(param->valuestring)
        );

    return fine_tuning_job_error_local_var;
end:
    return NULL;

}
