#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch.h"


char* batch_object_ToString(openai_api_batch_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "batch" };
    return objectArray[object];
}

openai_api_batch_OBJECT_e batch_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "batch" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* batch_status_ToString(openai_api_batch_STATUS_e status) {
    char* statusArray[] =  { "NULL", "validating", "failed", "in_progress", "finalizing", "completed", "expired", "cancelling", "cancelled" };
    return statusArray[status];
}

openai_api_batch_STATUS_e batch_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "validating", "failed", "in_progress", "finalizing", "completed", "expired", "cancelling", "cancelled" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static batch_t *batch_create_internal(
    char *id,
    openai_api_batch_OBJECT_e object,
    char *endpoint,
    batch_errors_t *errors,
    char *input_file_id,
    char *completion_window,
    openai_api_batch_STATUS_e status,
    char *output_file_id,
    char *error_file_id,
    int created_at,
    int in_progress_at,
    int expires_at,
    int finalizing_at,
    int completed_at,
    int failed_at,
    int expired_at,
    int cancelling_at,
    int cancelled_at,
    batch_request_counts_t *request_counts,
    object_t *metadata
    ) {
    batch_t *batch_local_var = malloc(sizeof(batch_t));
    if (!batch_local_var) {
        return NULL;
    }
    batch_local_var->id = id;
    batch_local_var->object = object;
    batch_local_var->endpoint = endpoint;
    batch_local_var->errors = errors;
    batch_local_var->input_file_id = input_file_id;
    batch_local_var->completion_window = completion_window;
    batch_local_var->status = status;
    batch_local_var->output_file_id = output_file_id;
    batch_local_var->error_file_id = error_file_id;
    batch_local_var->created_at = created_at;
    batch_local_var->in_progress_at = in_progress_at;
    batch_local_var->expires_at = expires_at;
    batch_local_var->finalizing_at = finalizing_at;
    batch_local_var->completed_at = completed_at;
    batch_local_var->failed_at = failed_at;
    batch_local_var->expired_at = expired_at;
    batch_local_var->cancelling_at = cancelling_at;
    batch_local_var->cancelled_at = cancelled_at;
    batch_local_var->request_counts = request_counts;
    batch_local_var->metadata = metadata;

    batch_local_var->_library_owned = 1;
    return batch_local_var;
}

__attribute__((deprecated)) batch_t *batch_create(
    char *id,
    openai_api_batch_OBJECT_e object,
    char *endpoint,
    batch_errors_t *errors,
    char *input_file_id,
    char *completion_window,
    openai_api_batch_STATUS_e status,
    char *output_file_id,
    char *error_file_id,
    int created_at,
    int in_progress_at,
    int expires_at,
    int finalizing_at,
    int completed_at,
    int failed_at,
    int expired_at,
    int cancelling_at,
    int cancelled_at,
    batch_request_counts_t *request_counts,
    object_t *metadata
    ) {
    return batch_create_internal (
        id,
        object,
        endpoint,
        errors,
        input_file_id,
        completion_window,
        status,
        output_file_id,
        error_file_id,
        created_at,
        in_progress_at,
        expires_at,
        finalizing_at,
        completed_at,
        failed_at,
        expired_at,
        cancelling_at,
        cancelled_at,
        request_counts,
        metadata
        );
}

void batch_free(batch_t *batch) {
    if(NULL == batch){
        return ;
    }
    if(batch->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "batch_free");
        return ;
    }
    listEntry_t *listEntry;
    if (batch->id) {
        free(batch->id);
        batch->id = NULL;
    }
    if (batch->endpoint) {
        free(batch->endpoint);
        batch->endpoint = NULL;
    }
    if (batch->errors) {
        batch_errors_free(batch->errors);
        batch->errors = NULL;
    }
    if (batch->input_file_id) {
        free(batch->input_file_id);
        batch->input_file_id = NULL;
    }
    if (batch->completion_window) {
        free(batch->completion_window);
        batch->completion_window = NULL;
    }
    if (batch->output_file_id) {
        free(batch->output_file_id);
        batch->output_file_id = NULL;
    }
    if (batch->error_file_id) {
        free(batch->error_file_id);
        batch->error_file_id = NULL;
    }
    if (batch->request_counts) {
        batch_request_counts_free(batch->request_counts);
        batch->request_counts = NULL;
    }
    if (batch->metadata) {
        object_free(batch->metadata);
        batch->metadata = NULL;
    }
    free(batch);
}

cJSON *batch_convertToJSON(batch_t *batch) {
    cJSON *item = cJSON_CreateObject();

    // batch->id
    if (!batch->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", batch->id) == NULL) {
    goto fail; //String
    }


    // batch->object
    if (openai_api_batch_OBJECT_NULL == batch->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", batch_object_ToString(batch->object)) == NULL)
    {
    goto fail; //Enum
    }


    // batch->endpoint
    if (!batch->endpoint) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "endpoint", batch->endpoint) == NULL) {
    goto fail; //String
    }


    // batch->errors
    if(batch->errors) {
    cJSON *errors_local_JSON = batch_errors_convertToJSON(batch->errors);
    if(errors_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "errors", errors_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // batch->input_file_id
    if (!batch->input_file_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "input_file_id", batch->input_file_id) == NULL) {
    goto fail; //String
    }


    // batch->completion_window
    if (!batch->completion_window) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "completion_window", batch->completion_window) == NULL) {
    goto fail; //String
    }


    // batch->status
    if (openai_api_batch_STATUS_NULL == batch->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", batch_status_ToString(batch->status)) == NULL)
    {
    goto fail; //Enum
    }


    // batch->output_file_id
    if(batch->output_file_id) {
    if(cJSON_AddStringToObject(item, "output_file_id", batch->output_file_id) == NULL) {
    goto fail; //String
    }
    }


    // batch->error_file_id
    if(batch->error_file_id) {
    if(cJSON_AddStringToObject(item, "error_file_id", batch->error_file_id) == NULL) {
    goto fail; //String
    }
    }


    // batch->created_at
    if (!batch->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", batch->created_at) == NULL) {
    goto fail; //Numeric
    }


    // batch->in_progress_at
    if(batch->in_progress_at) {
    if(cJSON_AddNumberToObject(item, "in_progress_at", batch->in_progress_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // batch->expires_at
    if(batch->expires_at) {
    if(cJSON_AddNumberToObject(item, "expires_at", batch->expires_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // batch->finalizing_at
    if(batch->finalizing_at) {
    if(cJSON_AddNumberToObject(item, "finalizing_at", batch->finalizing_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // batch->completed_at
    if(batch->completed_at) {
    if(cJSON_AddNumberToObject(item, "completed_at", batch->completed_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // batch->failed_at
    if(batch->failed_at) {
    if(cJSON_AddNumberToObject(item, "failed_at", batch->failed_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // batch->expired_at
    if(batch->expired_at) {
    if(cJSON_AddNumberToObject(item, "expired_at", batch->expired_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // batch->cancelling_at
    if(batch->cancelling_at) {
    if(cJSON_AddNumberToObject(item, "cancelling_at", batch->cancelling_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // batch->cancelled_at
    if(batch->cancelled_at) {
    if(cJSON_AddNumberToObject(item, "cancelled_at", batch->cancelled_at) == NULL) {
    goto fail; //Numeric
    }
    }


    // batch->request_counts
    if(batch->request_counts) {
    cJSON *request_counts_local_JSON = batch_request_counts_convertToJSON(batch->request_counts);
    if(request_counts_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "request_counts", request_counts_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // batch->metadata
    if(batch->metadata) {
    cJSON *metadata_object = object_convertToJSON(batch->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
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

batch_t *batch_parseFromJSON(cJSON *batchJSON){

    batch_t *batch_local_var = NULL;

    // define the local variable for batch->errors
    batch_errors_t *errors_local_nonprim = NULL;

    // define the local variable for batch->request_counts
    batch_request_counts_t *request_counts_local_nonprim = NULL;

    // batch->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(batchJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // batch->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(batchJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_batch_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = batch_object_FromString(object->valuestring);

    // batch->endpoint
    cJSON *endpoint = cJSON_GetObjectItemCaseSensitive(batchJSON, "endpoint");
    if (cJSON_IsNull(endpoint)) {
        endpoint = NULL;
    }
    if (!endpoint) {
        goto end;
    }

    
    if(!cJSON_IsString(endpoint))
    {
    goto end; //String
    }

    // batch->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(batchJSON, "errors");
    if (cJSON_IsNull(errors)) {
        errors = NULL;
    }
    if (errors) { 
    errors_local_nonprim = batch_errors_parseFromJSON(errors); //nonprimitive
    }

    // batch->input_file_id
    cJSON *input_file_id = cJSON_GetObjectItemCaseSensitive(batchJSON, "input_file_id");
    if (cJSON_IsNull(input_file_id)) {
        input_file_id = NULL;
    }
    if (!input_file_id) {
        goto end;
    }

    
    if(!cJSON_IsString(input_file_id))
    {
    goto end; //String
    }

    // batch->completion_window
    cJSON *completion_window = cJSON_GetObjectItemCaseSensitive(batchJSON, "completion_window");
    if (cJSON_IsNull(completion_window)) {
        completion_window = NULL;
    }
    if (!completion_window) {
        goto end;
    }

    
    if(!cJSON_IsString(completion_window))
    {
    goto end; //String
    }

    // batch->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(batchJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    openai_api_batch_STATUS_e statusVariable;
    
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = batch_status_FromString(status->valuestring);

    // batch->output_file_id
    cJSON *output_file_id = cJSON_GetObjectItemCaseSensitive(batchJSON, "output_file_id");
    if (cJSON_IsNull(output_file_id)) {
        output_file_id = NULL;
    }
    if (output_file_id) { 
    if(!cJSON_IsString(output_file_id) && !cJSON_IsNull(output_file_id))
    {
    goto end; //String
    }
    }

    // batch->error_file_id
    cJSON *error_file_id = cJSON_GetObjectItemCaseSensitive(batchJSON, "error_file_id");
    if (cJSON_IsNull(error_file_id)) {
        error_file_id = NULL;
    }
    if (error_file_id) { 
    if(!cJSON_IsString(error_file_id) && !cJSON_IsNull(error_file_id))
    {
    goto end; //String
    }
    }

    // batch->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(batchJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }

    // batch->in_progress_at
    cJSON *in_progress_at = cJSON_GetObjectItemCaseSensitive(batchJSON, "in_progress_at");
    if (cJSON_IsNull(in_progress_at)) {
        in_progress_at = NULL;
    }
    if (in_progress_at) { 
    if(!cJSON_IsNumber(in_progress_at))
    {
    goto end; //Numeric
    }
    }

    // batch->expires_at
    cJSON *expires_at = cJSON_GetObjectItemCaseSensitive(batchJSON, "expires_at");
    if (cJSON_IsNull(expires_at)) {
        expires_at = NULL;
    }
    if (expires_at) { 
    if(!cJSON_IsNumber(expires_at))
    {
    goto end; //Numeric
    }
    }

    // batch->finalizing_at
    cJSON *finalizing_at = cJSON_GetObjectItemCaseSensitive(batchJSON, "finalizing_at");
    if (cJSON_IsNull(finalizing_at)) {
        finalizing_at = NULL;
    }
    if (finalizing_at) { 
    if(!cJSON_IsNumber(finalizing_at))
    {
    goto end; //Numeric
    }
    }

    // batch->completed_at
    cJSON *completed_at = cJSON_GetObjectItemCaseSensitive(batchJSON, "completed_at");
    if (cJSON_IsNull(completed_at)) {
        completed_at = NULL;
    }
    if (completed_at) { 
    if(!cJSON_IsNumber(completed_at))
    {
    goto end; //Numeric
    }
    }

    // batch->failed_at
    cJSON *failed_at = cJSON_GetObjectItemCaseSensitive(batchJSON, "failed_at");
    if (cJSON_IsNull(failed_at)) {
        failed_at = NULL;
    }
    if (failed_at) { 
    if(!cJSON_IsNumber(failed_at))
    {
    goto end; //Numeric
    }
    }

    // batch->expired_at
    cJSON *expired_at = cJSON_GetObjectItemCaseSensitive(batchJSON, "expired_at");
    if (cJSON_IsNull(expired_at)) {
        expired_at = NULL;
    }
    if (expired_at) { 
    if(!cJSON_IsNumber(expired_at))
    {
    goto end; //Numeric
    }
    }

    // batch->cancelling_at
    cJSON *cancelling_at = cJSON_GetObjectItemCaseSensitive(batchJSON, "cancelling_at");
    if (cJSON_IsNull(cancelling_at)) {
        cancelling_at = NULL;
    }
    if (cancelling_at) { 
    if(!cJSON_IsNumber(cancelling_at))
    {
    goto end; //Numeric
    }
    }

    // batch->cancelled_at
    cJSON *cancelled_at = cJSON_GetObjectItemCaseSensitive(batchJSON, "cancelled_at");
    if (cJSON_IsNull(cancelled_at)) {
        cancelled_at = NULL;
    }
    if (cancelled_at) { 
    if(!cJSON_IsNumber(cancelled_at))
    {
    goto end; //Numeric
    }
    }

    // batch->request_counts
    cJSON *request_counts = cJSON_GetObjectItemCaseSensitive(batchJSON, "request_counts");
    if (cJSON_IsNull(request_counts)) {
        request_counts = NULL;
    }
    if (request_counts) { 
    request_counts_local_nonprim = batch_request_counts_parseFromJSON(request_counts); //nonprimitive
    }

    // batch->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(batchJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }


    batch_local_var = batch_create_internal (
        strdup(id->valuestring),
        objectVariable,
        strdup(endpoint->valuestring),
        errors ? errors_local_nonprim : NULL,
        strdup(input_file_id->valuestring),
        strdup(completion_window->valuestring),
        statusVariable,
        output_file_id && !cJSON_IsNull(output_file_id) ? strdup(output_file_id->valuestring) : NULL,
        error_file_id && !cJSON_IsNull(error_file_id) ? strdup(error_file_id->valuestring) : NULL,
        created_at->valuedouble,
        in_progress_at ? in_progress_at->valuedouble : 0,
        expires_at ? expires_at->valuedouble : 0,
        finalizing_at ? finalizing_at->valuedouble : 0,
        completed_at ? completed_at->valuedouble : 0,
        failed_at ? failed_at->valuedouble : 0,
        expired_at ? expired_at->valuedouble : 0,
        cancelling_at ? cancelling_at->valuedouble : 0,
        cancelled_at ? cancelled_at->valuedouble : 0,
        request_counts ? request_counts_local_nonprim : NULL,
        metadata ? metadata_local_object : NULL
        );

    return batch_local_var;
end:
    if (errors_local_nonprim) {
        batch_errors_free(errors_local_nonprim);
        errors_local_nonprim = NULL;
    }
    if (request_counts_local_nonprim) {
        batch_request_counts_free(request_counts_local_nonprim);
        request_counts_local_nonprim = NULL;
    }
    return NULL;

}
