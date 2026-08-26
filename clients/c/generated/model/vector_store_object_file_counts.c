#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "vector_store_object_file_counts.h"



static vector_store_object_file_counts_t *vector_store_object_file_counts_create_internal(
    int *in_progress,
    int *completed,
    int *failed,
    int *cancelled,
    int *total
    ) {
    vector_store_object_file_counts_t *vector_store_object_file_counts_local_var = malloc(sizeof(vector_store_object_file_counts_t));
    if (!vector_store_object_file_counts_local_var) {
        return NULL;
    }
    memset(vector_store_object_file_counts_local_var, 0, sizeof(vector_store_object_file_counts_t));
    vector_store_object_file_counts_local_var->_library_owned = 1;
    vector_store_object_file_counts_local_var->in_progress = in_progress;
    vector_store_object_file_counts_local_var->completed = completed;
    vector_store_object_file_counts_local_var->failed = failed;
    vector_store_object_file_counts_local_var->cancelled = cancelled;
    vector_store_object_file_counts_local_var->total = total;
    return vector_store_object_file_counts_local_var;
}

__attribute__((deprecated)) vector_store_object_file_counts_t *vector_store_object_file_counts_create(
    int *in_progress,
    int *completed,
    int *failed,
    int *cancelled,
    int *total
    ) {
    int *in_progress_copy = NULL;
    if (in_progress) {
        in_progress_copy = malloc(sizeof(int));
        if (in_progress_copy) *in_progress_copy = *in_progress;
    }
    int *completed_copy = NULL;
    if (completed) {
        completed_copy = malloc(sizeof(int));
        if (completed_copy) *completed_copy = *completed;
    }
    int *failed_copy = NULL;
    if (failed) {
        failed_copy = malloc(sizeof(int));
        if (failed_copy) *failed_copy = *failed;
    }
    int *cancelled_copy = NULL;
    if (cancelled) {
        cancelled_copy = malloc(sizeof(int));
        if (cancelled_copy) *cancelled_copy = *cancelled;
    }
    int *total_copy = NULL;
    if (total) {
        total_copy = malloc(sizeof(int));
        if (total_copy) *total_copy = *total;
    }
    vector_store_object_file_counts_t *result = vector_store_object_file_counts_create_internal (
        in_progress_copy,
        completed_copy,
        failed_copy,
        cancelled_copy,
        total_copy
        );
    if (!result) {
        free(in_progress_copy);
        free(completed_copy);
        free(failed_copy);
        free(cancelled_copy);
        free(total_copy);
    }
    return result;
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
    if (vector_store_object_file_counts->in_progress) {
        free(vector_store_object_file_counts->in_progress);
        vector_store_object_file_counts->in_progress = NULL;
    }
    if (vector_store_object_file_counts->completed) {
        free(vector_store_object_file_counts->completed);
        vector_store_object_file_counts->completed = NULL;
    }
    if (vector_store_object_file_counts->failed) {
        free(vector_store_object_file_counts->failed);
        vector_store_object_file_counts->failed = NULL;
    }
    if (vector_store_object_file_counts->cancelled) {
        free(vector_store_object_file_counts->cancelled);
        vector_store_object_file_counts->cancelled = NULL;
    }
    if (vector_store_object_file_counts->total) {
        free(vector_store_object_file_counts->total);
        vector_store_object_file_counts->total = NULL;
    }
    free(vector_store_object_file_counts);
}

cJSON *vector_store_object_file_counts_convertToJSON(vector_store_object_file_counts_t *vector_store_object_file_counts) {
    cJSON *item = cJSON_CreateObject();

    // vector_store_object_file_counts->in_progress
    if (!vector_store_object_file_counts->in_progress) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "in_progress", *vector_store_object_file_counts->in_progress) == NULL) {
    goto fail; //Numeric
    }


    // vector_store_object_file_counts->completed
    if (!vector_store_object_file_counts->completed) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "completed", *vector_store_object_file_counts->completed) == NULL) {
    goto fail; //Numeric
    }


    // vector_store_object_file_counts->failed
    if (!vector_store_object_file_counts->failed) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "failed", *vector_store_object_file_counts->failed) == NULL) {
    goto fail; //Numeric
    }


    // vector_store_object_file_counts->cancelled
    if (!vector_store_object_file_counts->cancelled) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "cancelled", *vector_store_object_file_counts->cancelled) == NULL) {
    goto fail; //Numeric
    }


    // vector_store_object_file_counts->total
    if (!vector_store_object_file_counts->total) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total", *vector_store_object_file_counts->total) == NULL) {
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

    // define the local variable for vector_store_object_file_counts->in_progress
    int *in_progress_local_var = NULL;

    // define the local variable for vector_store_object_file_counts->completed
    int *completed_local_var = NULL;

    // define the local variable for vector_store_object_file_counts->failed
    int *failed_local_var = NULL;

    // define the local variable for vector_store_object_file_counts->cancelled
    int *cancelled_local_var = NULL;

    // define the local variable for vector_store_object_file_counts->total
    int *total_local_var = NULL;

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
    in_progress_local_var = malloc(sizeof(int));
    if(!in_progress_local_var)
    {
        goto end;
    }
    *in_progress_local_var = in_progress->valuedouble;

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
    completed_local_var = malloc(sizeof(int));
    if(!completed_local_var)
    {
        goto end;
    }
    *completed_local_var = completed->valuedouble;

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
    failed_local_var = malloc(sizeof(int));
    if(!failed_local_var)
    {
        goto end;
    }
    *failed_local_var = failed->valuedouble;

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
    cancelled_local_var = malloc(sizeof(int));
    if(!cancelled_local_var)
    {
        goto end;
    }
    *cancelled_local_var = cancelled->valuedouble;

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
    total_local_var = malloc(sizeof(int));
    if(!total_local_var)
    {
        goto end;
    }
    *total_local_var = total->valuedouble;



    vector_store_object_file_counts_local_var = vector_store_object_file_counts_create_internal (
        in_progress_local_var,
        completed_local_var,
        failed_local_var,
        cancelled_local_var,
        total_local_var
        );

    if (!vector_store_object_file_counts_local_var) {
        goto end;
    }

    return vector_store_object_file_counts_local_var;
end:
    if (in_progress_local_var) {
        free(in_progress_local_var);
        in_progress_local_var = NULL;
    }
    if (completed_local_var) {
        free(completed_local_var);
        completed_local_var = NULL;
    }
    if (failed_local_var) {
        free(failed_local_var);
        failed_local_var = NULL;
    }
    if (cancelled_local_var) {
        free(cancelled_local_var);
        cancelled_local_var = NULL;
    }
    if (total_local_var) {
        free(total_local_var);
        total_local_var = NULL;
    }
    return NULL;

}
