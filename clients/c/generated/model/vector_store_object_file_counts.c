#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vector_store_object_file_counts.h"



static vector_store_object_file_counts_t *vector_store_object_file_counts_create_internal(
    int in_progress,
    int completed,
    int failed,
    int cancelled,
    int total
    ) {
    vector_store_object_file_counts_t *vector_store_object_file_counts_local_var = malloc(sizeof(vector_store_object_file_counts_t));
    if (!vector_store_object_file_counts_local_var) {
        return NULL;
    }
    vector_store_object_file_counts_local_var->in_progress = in_progress;
    vector_store_object_file_counts_local_var->completed = completed;
    vector_store_object_file_counts_local_var->failed = failed;
    vector_store_object_file_counts_local_var->cancelled = cancelled;
    vector_store_object_file_counts_local_var->total = total;

    vector_store_object_file_counts_local_var->_library_owned = 1;
    return vector_store_object_file_counts_local_var;
}

__attribute__((deprecated)) vector_store_object_file_counts_t *vector_store_object_file_counts_create(
    int in_progress,
    int completed,
    int failed,
    int cancelled,
    int total
    ) {
    return vector_store_object_file_counts_create_internal (
        in_progress,
        completed,
        failed,
        cancelled,
        total
        );
}

void vector_store_object_file_counts_free(vector_store_object_file_counts_t *vector_store_object_file_counts) {
    if(NULL == vector_store_object_file_counts){
        return ;
    }
    if(vector_store_object_file_counts->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "vector_store_object_file_counts_free");
        return ;
    }
    listEntry_t *listEntry;
    free(vector_store_object_file_counts);
}

cJSON *vector_store_object_file_counts_convertToJSON(vector_store_object_file_counts_t *vector_store_object_file_counts) {
    cJSON *item = cJSON_CreateObject();

    // vector_store_object_file_counts->in_progress
    if (!vector_store_object_file_counts->in_progress) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "in_progress", vector_store_object_file_counts->in_progress) == NULL) {
    goto fail; //Numeric
    }


    // vector_store_object_file_counts->completed
    if (!vector_store_object_file_counts->completed) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "completed", vector_store_object_file_counts->completed) == NULL) {
    goto fail; //Numeric
    }


    // vector_store_object_file_counts->failed
    if (!vector_store_object_file_counts->failed) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "failed", vector_store_object_file_counts->failed) == NULL) {
    goto fail; //Numeric
    }


    // vector_store_object_file_counts->cancelled
    if (!vector_store_object_file_counts->cancelled) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "cancelled", vector_store_object_file_counts->cancelled) == NULL) {
    goto fail; //Numeric
    }


    // vector_store_object_file_counts->total
    if (!vector_store_object_file_counts->total) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total", vector_store_object_file_counts->total) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

vector_store_object_file_counts_t *vector_store_object_file_counts_parseFromJSON(cJSON *vector_store_object_file_countsJSON){

    vector_store_object_file_counts_t *vector_store_object_file_counts_local_var = NULL;

    // vector_store_object_file_counts->in_progress
    cJSON *in_progress = cJSON_GetObjectItemCaseSensitive(vector_store_object_file_countsJSON, "in_progress");
    if (cJSON_IsNull(in_progress)) {
        in_progress = NULL;
    }
    if (!in_progress) {
        goto end;
    }

    
    if(!cJSON_IsNumber(in_progress))
    {
    goto end; //Numeric
    }

    // vector_store_object_file_counts->completed
    cJSON *completed = cJSON_GetObjectItemCaseSensitive(vector_store_object_file_countsJSON, "completed");
    if (cJSON_IsNull(completed)) {
        completed = NULL;
    }
    if (!completed) {
        goto end;
    }

    
    if(!cJSON_IsNumber(completed))
    {
    goto end; //Numeric
    }

    // vector_store_object_file_counts->failed
    cJSON *failed = cJSON_GetObjectItemCaseSensitive(vector_store_object_file_countsJSON, "failed");
    if (cJSON_IsNull(failed)) {
        failed = NULL;
    }
    if (!failed) {
        goto end;
    }

    
    if(!cJSON_IsNumber(failed))
    {
    goto end; //Numeric
    }

    // vector_store_object_file_counts->cancelled
    cJSON *cancelled = cJSON_GetObjectItemCaseSensitive(vector_store_object_file_countsJSON, "cancelled");
    if (cJSON_IsNull(cancelled)) {
        cancelled = NULL;
    }
    if (!cancelled) {
        goto end;
    }

    
    if(!cJSON_IsNumber(cancelled))
    {
    goto end; //Numeric
    }

    // vector_store_object_file_counts->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(vector_store_object_file_countsJSON, "total");
    if (cJSON_IsNull(total)) {
        total = NULL;
    }
    if (!total) {
        goto end;
    }

    
    if(!cJSON_IsNumber(total))
    {
    goto end; //Numeric
    }


    vector_store_object_file_counts_local_var = vector_store_object_file_counts_create_internal (
        in_progress->valuedouble,
        completed->valuedouble,
        failed->valuedouble,
        cancelled->valuedouble,
        total->valuedouble
        );

    return vector_store_object_file_counts_local_var;
end:
    return NULL;

}
