#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "error_response.h"



error_response_t *error_response_create(
    error_t *error
    ) {
    error_response_t *error_response_local_var = malloc(sizeof(error_response_t));
    if (!error_response_local_var) {
        return NULL;
    }
    error_response_local_var->error = error;

    return error_response_local_var;
}


void error_response_free(error_response_t *error_response) {
    if(NULL == error_response){
        return ;
    }
    listEntry_t *listEntry;
    if (error_response->error) {
        error_free(error_response->error);
        error_response->error = NULL;
    }
    free(error_response);
}

cJSON *error_response_convertToJSON(error_response_t *error_response) {
    cJSON *item = cJSON_CreateObject();

    // error_response->error
    if (!error_response->error) {
        goto fail;
    }
    cJSON *error_local_JSON = error_convertToJSON(error_response->error);
    if(error_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "error", error_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

error_response_t *error_response_parseFromJSON(cJSON *error_responseJSON){

    error_response_t *error_response_local_var = NULL;

    // define the local variable for error_response->error
    error_t *error_local_nonprim = NULL;

    // error_response->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(error_responseJSON, "error");
    if (!error) {
        goto end;
    }

    
    error_local_nonprim = error_parseFromJSON(error); //nonprimitive


    error_response_local_var = error_response_create (
        error_local_nonprim
        );

    return error_response_local_var;
end:
    if (error_local_nonprim) {
        error_free(error_local_nonprim);
        error_local_nonprim = NULL;
    }
    return NULL;

}
