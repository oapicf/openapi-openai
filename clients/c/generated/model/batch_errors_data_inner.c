#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_errors_data_inner.h"



static batch_errors_data_inner_t *batch_errors_data_inner_create_internal(
    char *code,
    char *message,
    char *param,
    int line
    ) {
    batch_errors_data_inner_t *batch_errors_data_inner_local_var = malloc(sizeof(batch_errors_data_inner_t));
    if (!batch_errors_data_inner_local_var) {
        return NULL;
    }
    batch_errors_data_inner_local_var->code = code;
    batch_errors_data_inner_local_var->message = message;
    batch_errors_data_inner_local_var->param = param;
    batch_errors_data_inner_local_var->line = line;

    batch_errors_data_inner_local_var->_library_owned = 1;
    return batch_errors_data_inner_local_var;
}

__attribute__((deprecated)) batch_errors_data_inner_t *batch_errors_data_inner_create(
    char *code,
    char *message,
    char *param,
    int line
    ) {
    return batch_errors_data_inner_create_internal (
        code,
        message,
        param,
        line
        );
}

void batch_errors_data_inner_free(batch_errors_data_inner_t *batch_errors_data_inner) {
    if(NULL == batch_errors_data_inner){
        return ;
    }
    if(batch_errors_data_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "batch_errors_data_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (batch_errors_data_inner->code) {
        free(batch_errors_data_inner->code);
        batch_errors_data_inner->code = NULL;
    }
    if (batch_errors_data_inner->message) {
        free(batch_errors_data_inner->message);
        batch_errors_data_inner->message = NULL;
    }
    if (batch_errors_data_inner->param) {
        free(batch_errors_data_inner->param);
        batch_errors_data_inner->param = NULL;
    }
    free(batch_errors_data_inner);
}

cJSON *batch_errors_data_inner_convertToJSON(batch_errors_data_inner_t *batch_errors_data_inner) {
    cJSON *item = cJSON_CreateObject();

    // batch_errors_data_inner->code
    if(batch_errors_data_inner->code) {
    if(cJSON_AddStringToObject(item, "code", batch_errors_data_inner->code) == NULL) {
    goto fail; //String
    }
    }


    // batch_errors_data_inner->message
    if(batch_errors_data_inner->message) {
    if(cJSON_AddStringToObject(item, "message", batch_errors_data_inner->message) == NULL) {
    goto fail; //String
    }
    }


    // batch_errors_data_inner->param
    if(batch_errors_data_inner->param) {
    if(cJSON_AddStringToObject(item, "param", batch_errors_data_inner->param) == NULL) {
    goto fail; //String
    }
    }


    // batch_errors_data_inner->line
    if(batch_errors_data_inner->line) {
    if(cJSON_AddNumberToObject(item, "line", batch_errors_data_inner->line) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

batch_errors_data_inner_t *batch_errors_data_inner_parseFromJSON(cJSON *batch_errors_data_innerJSON){

    batch_errors_data_inner_t *batch_errors_data_inner_local_var = NULL;

    // batch_errors_data_inner->code
    cJSON *code = cJSON_GetObjectItemCaseSensitive(batch_errors_data_innerJSON, "code");
    if (cJSON_IsNull(code)) {
        code = NULL;
    }
    if (code) { 
    if(!cJSON_IsString(code) && !cJSON_IsNull(code))
    {
    goto end; //String
    }
    }

    // batch_errors_data_inner->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(batch_errors_data_innerJSON, "message");
    if (cJSON_IsNull(message)) {
        message = NULL;
    }
    if (message) { 
    if(!cJSON_IsString(message) && !cJSON_IsNull(message))
    {
    goto end; //String
    }
    }

    // batch_errors_data_inner->param
    cJSON *param = cJSON_GetObjectItemCaseSensitive(batch_errors_data_innerJSON, "param");
    if (cJSON_IsNull(param)) {
        param = NULL;
    }
    if (param) { 
    if(!cJSON_IsString(param) && !cJSON_IsNull(param))
    {
    goto end; //String
    }
    }

    // batch_errors_data_inner->line
    cJSON *line = cJSON_GetObjectItemCaseSensitive(batch_errors_data_innerJSON, "line");
    if (cJSON_IsNull(line)) {
        line = NULL;
    }
    if (line) { 
    if(!cJSON_IsNumber(line))
    {
    goto end; //Numeric
    }
    }


    batch_errors_data_inner_local_var = batch_errors_data_inner_create_internal (
        code && !cJSON_IsNull(code) ? strdup(code->valuestring) : NULL,
        message && !cJSON_IsNull(message) ? strdup(message->valuestring) : NULL,
        param && !cJSON_IsNull(param) ? strdup(param->valuestring) : NULL,
        line ? line->valuedouble : 0
        );

    return batch_errors_data_inner_local_var;
end:
    return NULL;

}
