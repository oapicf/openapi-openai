#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_request_output_error.h"



static batch_request_output_error_t *batch_request_output_error_create_internal(
    char *code,
    char *message
    ) {
    batch_request_output_error_t *batch_request_output_error_local_var = malloc(sizeof(batch_request_output_error_t));
    if (!batch_request_output_error_local_var) {
        return NULL;
    }
    memset(batch_request_output_error_local_var, 0, sizeof(batch_request_output_error_t));
    batch_request_output_error_local_var->_library_owned = 1;
    batch_request_output_error_local_var->code = code;
    batch_request_output_error_local_var->message = message;
    return batch_request_output_error_local_var;
}

__attribute__((deprecated)) batch_request_output_error_t *batch_request_output_error_create(
    char *code,
    char *message
    ) {
    batch_request_output_error_t *result = batch_request_output_error_create_internal (
        code,
        message
        );
    if (!result) {
    }
    return result;
}

void batch_request_output_error_free(batch_request_output_error_t *batch_request_output_error) {
    if(NULL == batch_request_output_error){
        return ;
    }
    if(batch_request_output_error->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "batch_request_output_error_free");
        return ;
    }
    listEntry_t *listEntry;
    if (batch_request_output_error->code) {
        free(batch_request_output_error->code);
        batch_request_output_error->code = NULL;
    }
    if (batch_request_output_error->message) {
        free(batch_request_output_error->message);
        batch_request_output_error->message = NULL;
    }
    free(batch_request_output_error);
}

cJSON *batch_request_output_error_convertToJSON(batch_request_output_error_t *batch_request_output_error) {
    cJSON *item = cJSON_CreateObject();

    // batch_request_output_error->code
    if(batch_request_output_error->code) {
    if(cJSON_AddStringToObject(item, "code", batch_request_output_error->code) == NULL) {
    goto fail; //String
    }
    }


    // batch_request_output_error->message
    if(batch_request_output_error->message) {
    if(cJSON_AddStringToObject(item, "message", batch_request_output_error->message) == NULL) {
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

batch_request_output_error_t *batch_request_output_error_parseFromJSON(cJSON *batch_request_output_errorJSON){

    batch_request_output_error_t *batch_request_output_error_local_var = NULL;

    char *code_local_str = NULL;

    char *message_local_str = NULL;

    // batch_request_output_error->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(batch_request_output_errorJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (code) { 
    if(!cJSON_IsString(code) && !cJSON_IsNull(code))
    {
    goto end; //String
    }
    }

    // batch_request_output_error->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(batch_request_output_errorJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }


    if (code && !cJSON_IsNull(code)) code_local_str = strdup(code->valuestring);
    if (message && !cJSON_IsNull(message)) message_local_str = strdup(message->valuestring);

    batch_request_output_error_local_var = batch_request_output_error_create_internal (
        code_local_str,
        message_local_str
        );

    if (!batch_request_output_error_local_var) {
        goto end;
    }

    return batch_request_output_error_local_var;
end:
    if (code_local_str) {
        free(code_local_str);
        code_local_str = NULL;
    }
    if (message_local_str) {
        free(message_local_str);
        message_local_str = NULL;
    }
    return NULL;

}
