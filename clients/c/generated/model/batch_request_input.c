#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_request_input.h"


char* batch_request_input_method_ToString(openai_api_batch_request_input_METHOD_e method) {
    char* methodArray[] =  { "NULL", "POST" };
    return methodArray[method];
}

openai_api_batch_request_input_METHOD_e batch_request_input_method_FromString(char* method){
    int stringToReturn = 0;
    char *methodArray[] =  { "NULL", "POST" };
    size_t sizeofArray = sizeof(methodArray) / sizeof(methodArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(method, methodArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static batch_request_input_t *batch_request_input_create_internal(
    char *custom_id,
    openai_api_batch_request_input_METHOD_e method,
    char *url
    ) {
    batch_request_input_t *batch_request_input_local_var = malloc(sizeof(batch_request_input_t));
    if (!batch_request_input_local_var) {
        return NULL;
    }
    batch_request_input_local_var->custom_id = custom_id;
    batch_request_input_local_var->method = method;
    batch_request_input_local_var->url = url;

    batch_request_input_local_var->_library_owned = 1;
    return batch_request_input_local_var;
}

__attribute__((deprecated)) batch_request_input_t *batch_request_input_create(
    char *custom_id,
    openai_api_batch_request_input_METHOD_e method,
    char *url
    ) {
    return batch_request_input_create_internal (
        custom_id,
        method,
        url
        );
}

void batch_request_input_free(batch_request_input_t *batch_request_input) {
    if(NULL == batch_request_input){
        return ;
    }
    if(batch_request_input->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "batch_request_input_free");
        return ;
    }
    listEntry_t *listEntry;
    if (batch_request_input->custom_id) {
        free(batch_request_input->custom_id);
        batch_request_input->custom_id = NULL;
    }
    if (batch_request_input->url) {
        free(batch_request_input->url);
        batch_request_input->url = NULL;
    }
    free(batch_request_input);
}

cJSON *batch_request_input_convertToJSON(batch_request_input_t *batch_request_input) {
    cJSON *item = cJSON_CreateObject();

    // batch_request_input->custom_id
    if(batch_request_input->custom_id) {
    if(cJSON_AddStringToObject(item, "custom_id", batch_request_input->custom_id) == NULL) {
    goto fail; //String
    }
    }


    // batch_request_input->method
    if(batch_request_input->method != openai_api_batch_request_input_METHOD_NULL) {
    if(cJSON_AddStringToObject(item, "method", batch_request_input_method_ToString(batch_request_input->method)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // batch_request_input->url
    if(batch_request_input->url) {
    if(cJSON_AddStringToObject(item, "url", batch_request_input->url) == NULL) {
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

batch_request_input_t *batch_request_input_parseFromJSON(cJSON *batch_request_inputJSON){

    batch_request_input_t *batch_request_input_local_var = NULL;

    // batch_request_input->custom_id
    cJSON *custom_id = cJSON_GetObjectItemCaseSensitive(batch_request_inputJSON, "custom_id");
    if (cJSON_IsNull(custom_id)) {
        custom_id = NULL;
    }
    if (custom_id) { 
    if(!cJSON_IsString(custom_id) && !cJSON_IsNull(custom_id))
    {
    goto end; //String
    }
    }

    // batch_request_input->method
    cJSON *method = cJSON_GetObjectItemCaseSensitive(batch_request_inputJSON, "method");
    if (cJSON_IsNull(method)) {
        method = NULL;
    }
    openai_api_batch_request_input_METHOD_e methodVariable;
    if (method) { 
    if(!cJSON_IsString(method))
    {
    goto end; //Enum
    }
    methodVariable = batch_request_input_method_FromString(method->valuestring);
    }

    // batch_request_input->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(batch_request_inputJSON, "url");
    if (cJSON_IsNull(url)) {
        url = NULL;
    }
    if (url) { 
    if(!cJSON_IsString(url) && !cJSON_IsNull(url))
    {
    goto end; //String
    }
    }


    batch_request_input_local_var = batch_request_input_create_internal (
        custom_id && !cJSON_IsNull(custom_id) ? strdup(custom_id->valuestring) : NULL,
        method ? methodVariable : openai_api_batch_request_input_METHOD_NULL,
        url && !cJSON_IsNull(url) ? strdup(url->valuestring) : NULL
        );

    return batch_request_input_local_var;
end:
    return NULL;

}
