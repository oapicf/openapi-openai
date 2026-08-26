#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_request_output_response.h"



static batch_request_output_response_t *batch_request_output_response_create_internal(
    int *status_code,
    char *request_id,
    object_t *body
    ) {
    batch_request_output_response_t *batch_request_output_response_local_var = malloc(sizeof(batch_request_output_response_t));
    if (!batch_request_output_response_local_var) {
        return NULL;
    }
    memset(batch_request_output_response_local_var, 0, sizeof(batch_request_output_response_t));
    batch_request_output_response_local_var->_library_owned = 1;
    batch_request_output_response_local_var->status_code = status_code;
    batch_request_output_response_local_var->request_id = request_id;
    batch_request_output_response_local_var->body = body;
    return batch_request_output_response_local_var;
}

__attribute__((deprecated)) batch_request_output_response_t *batch_request_output_response_create(
    int *status_code,
    char *request_id,
    object_t *body
    ) {
    int *status_code_copy = NULL;
    if (status_code) {
        status_code_copy = malloc(sizeof(int));
        if (status_code_copy) *status_code_copy = *status_code;
    }
    batch_request_output_response_t *result = batch_request_output_response_create_internal (
        status_code_copy,
        request_id,
        body
        );
    if (!result) {
        free(status_code_copy);
    }
    return result;
}

void batch_request_output_response_free(batch_request_output_response_t *batch_request_output_response) {
    if(NULL == batch_request_output_response){
        return ;
    }
    if(batch_request_output_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "batch_request_output_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (batch_request_output_response->status_code) {
        free(batch_request_output_response->status_code);
        batch_request_output_response->status_code = NULL;
    }
    if (batch_request_output_response->request_id) {
        free(batch_request_output_response->request_id);
        batch_request_output_response->request_id = NULL;
    }
    if (batch_request_output_response->body) {
        object_free(batch_request_output_response->body);
        batch_request_output_response->body = NULL;
    }
    free(batch_request_output_response);
}

cJSON *batch_request_output_response_convertToJSON(batch_request_output_response_t *batch_request_output_response) {
    cJSON *item = cJSON_CreateObject();

    // batch_request_output_response->status_code
    if(batch_request_output_response->status_code) {
    if(cJSON_AddNumberToObject(item, "status_code", *batch_request_output_response->status_code) == NULL) {
    goto fail; //Numeric
    }
    }


    // batch_request_output_response->request_id
    if(batch_request_output_response->request_id) {
    if(cJSON_AddStringToObject(item, "request_id", batch_request_output_response->request_id) == NULL) {
    goto fail; //String
    }
    }


    // batch_request_output_response->body
    if(batch_request_output_response->body) {
    cJSON *body_object = object_convertToJSON(batch_request_output_response->body);
    if(body_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "body", body_object);
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

batch_request_output_response_t *batch_request_output_response_parseFromJSON(cJSON *batch_request_output_responseJSON){

    batch_request_output_response_t *batch_request_output_response_local_var = NULL;

    // define the local variable for batch_request_output_response->status_code
    int *status_code_local_var = NULL;

    char *request_id_local_str = NULL;

    // batch_request_output_response->status_code
    cJSON *status_code = cJSON_GetObjectItemCaseSensitive(batch_request_output_responseJSON, "status_code");
    if (cJSON_IsNull(status_code)) {
        status_code = NULL;
    }
    if (status_code) { 
    if(!cJSON_IsNumber(status_code))
    {
    goto end; //Numeric
    }
    status_code_local_var = malloc(sizeof(int));
    if(!status_code_local_var)
    {
        goto end;
    }
    *status_code_local_var = status_code->valuedouble;
    }

    // batch_request_output_response->request_id
    cJSON *request_id = cJSON_GetObjectItemCaseSensitive(batch_request_output_responseJSON, "request_id");
    if (cJSON_IsNull(request_id)) {
        request_id = NULL;
    }
    if (request_id) { 
    if(!cJSON_IsString(request_id) && !cJSON_IsNull(request_id))
    {
    goto end; //String
    }
    }

    // batch_request_output_response->body
    cJSON *body = cJSON_GetObjectItemCaseSensitive(batch_request_output_responseJSON, "body");
    if (cJSON_IsNull(body)) {
        body = NULL;
    }
    object_t *body_local_object = NULL;
    if (body) { 
    body_local_object = object_parseFromJSON(body); //object
    }


    if (request_id && !cJSON_IsNull(request_id)) request_id_local_str = strdup(request_id->valuestring);

    batch_request_output_response_local_var = batch_request_output_response_create_internal (
        status_code_local_var,
        request_id_local_str,
        body ? body_local_object : NULL
        );

    if (!batch_request_output_response_local_var) {
        goto end;
    }

    return batch_request_output_response_local_var;
end:
    if (status_code_local_var) {
        free(status_code_local_var);
        status_code_local_var = NULL;
    }
    if (request_id_local_str) {
        free(request_id_local_str);
        request_id_local_str = NULL;
    }
    return NULL;

}
