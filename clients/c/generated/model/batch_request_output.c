#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_request_output.h"



static batch_request_output_t *batch_request_output_create_internal(
    char *id,
    char *custom_id,
    batch_request_output_response_t *response,
    batch_request_output_error_t *error
    ) {
    batch_request_output_t *batch_request_output_local_var = malloc(sizeof(batch_request_output_t));
    if (!batch_request_output_local_var) {
        return NULL;
    }
    batch_request_output_local_var->id = id;
    batch_request_output_local_var->custom_id = custom_id;
    batch_request_output_local_var->response = response;
    batch_request_output_local_var->error = error;

    batch_request_output_local_var->_library_owned = 1;
    return batch_request_output_local_var;
}

__attribute__((deprecated)) batch_request_output_t *batch_request_output_create(
    char *id,
    char *custom_id,
    batch_request_output_response_t *response,
    batch_request_output_error_t *error
    ) {
    return batch_request_output_create_internal (
        id,
        custom_id,
        response,
        error
        );
}

void batch_request_output_free(batch_request_output_t *batch_request_output) {
    if(NULL == batch_request_output){
        return ;
    }
    if(batch_request_output->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "batch_request_output_free");
        return ;
    }
    listEntry_t *listEntry;
    if (batch_request_output->id) {
        free(batch_request_output->id);
        batch_request_output->id = NULL;
    }
    if (batch_request_output->custom_id) {
        free(batch_request_output->custom_id);
        batch_request_output->custom_id = NULL;
    }
    if (batch_request_output->response) {
        batch_request_output_response_free(batch_request_output->response);
        batch_request_output->response = NULL;
    }
    if (batch_request_output->error) {
        batch_request_output_error_free(batch_request_output->error);
        batch_request_output->error = NULL;
    }
    free(batch_request_output);
}

cJSON *batch_request_output_convertToJSON(batch_request_output_t *batch_request_output) {
    cJSON *item = cJSON_CreateObject();

    // batch_request_output->id
    if(batch_request_output->id) {
    if(cJSON_AddStringToObject(item, "id", batch_request_output->id) == NULL) {
    goto fail; //String
    }
    }


    // batch_request_output->custom_id
    if(batch_request_output->custom_id) {
    if(cJSON_AddStringToObject(item, "custom_id", batch_request_output->custom_id) == NULL) {
    goto fail; //String
    }
    }


    // batch_request_output->response
    if(batch_request_output->response) {
    cJSON *response_local_JSON = batch_request_output_response_convertToJSON(batch_request_output->response);
    if(response_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "response", response_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // batch_request_output->error
    if(batch_request_output->error) {
    cJSON *error_local_JSON = batch_request_output_error_convertToJSON(batch_request_output->error);
    if(error_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "error", error_local_JSON);
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

batch_request_output_t *batch_request_output_parseFromJSON(cJSON *batch_request_outputJSON){

    batch_request_output_t *batch_request_output_local_var = NULL;

    // define the local variable for batch_request_output->response
    batch_request_output_response_t *response_local_nonprim = NULL;

    // define the local variable for batch_request_output->error
    batch_request_output_error_t *error_local_nonprim = NULL;

    // batch_request_output->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(batch_request_outputJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // batch_request_output->custom_id
    cJSON *custom_id = cJSON_GetObjectItemCaseSensitive(batch_request_outputJSON, "custom_id");
    if (cJSON_IsNull(custom_id)) {
        custom_id = NULL;
    }
    if (custom_id) { 
    if(!cJSON_IsString(custom_id) && !cJSON_IsNull(custom_id))
    {
    goto end; //String
    }
    }

    // batch_request_output->response
    cJSON *response = cJSON_GetObjectItemCaseSensitive(batch_request_outputJSON, "response");
    if (cJSON_IsNull(response)) {
        response = NULL;
    }
    if (response) { 
    response_local_nonprim = batch_request_output_response_parseFromJSON(response); //nonprimitive
    }

    // batch_request_output->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(batch_request_outputJSON, "error");
    if (cJSON_IsNull(error)) {
        error = NULL;
    }
    if (error) { 
    error_local_nonprim = batch_request_output_error_parseFromJSON(error); //nonprimitive
    }


    batch_request_output_local_var = batch_request_output_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        custom_id && !cJSON_IsNull(custom_id) ? strdup(custom_id->valuestring) : NULL,
        response ? response_local_nonprim : NULL,
        error ? error_local_nonprim : NULL
        );

    return batch_request_output_local_var;
end:
    if (response_local_nonprim) {
        batch_request_output_response_free(response_local_nonprim);
        response_local_nonprim = NULL;
    }
    if (error_local_nonprim) {
        batch_request_output_error_free(error_local_nonprim);
        error_local_nonprim = NULL;
    }
    return NULL;

}
