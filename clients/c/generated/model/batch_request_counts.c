#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_request_counts.h"



static batch_request_counts_t *batch_request_counts_create_internal(
    int *total,
    int *completed,
    int *failed
    ) {
    batch_request_counts_t *batch_request_counts_local_var = malloc(sizeof(batch_request_counts_t));
    if (!batch_request_counts_local_var) {
        return NULL;
    }
    memset(batch_request_counts_local_var, 0, sizeof(batch_request_counts_t));
    batch_request_counts_local_var->_library_owned = 1;
    batch_request_counts_local_var->total = total;
    batch_request_counts_local_var->completed = completed;
    batch_request_counts_local_var->failed = failed;
    return batch_request_counts_local_var;
}

__attribute__((deprecated)) batch_request_counts_t *batch_request_counts_create(
    int *total,
    int *completed,
    int *failed
    ) {
    int *total_copy = NULL;
    if (total) {
        total_copy = malloc(sizeof(int));
        if (total_copy) *total_copy = *total;
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
    batch_request_counts_t *result = batch_request_counts_create_internal (
        total_copy,
        completed_copy,
        failed_copy
        );
    if (!result) {
        free(total_copy);
        free(completed_copy);
        free(failed_copy);
    }
    return result;
}

void batch_request_counts_free(batch_request_counts_t *batch_request_counts) {
    if(NULL == batch_request_counts){
        return ;
    }
    if(batch_request_counts->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "batch_request_counts_free");
        return ;
    }
    listEntry_t *listEntry;
    if (batch_request_counts->total) {
        free(batch_request_counts->total);
        batch_request_counts->total = NULL;
    }
    if (batch_request_counts->completed) {
        free(batch_request_counts->completed);
        batch_request_counts->completed = NULL;
    }
    if (batch_request_counts->failed) {
        free(batch_request_counts->failed);
        batch_request_counts->failed = NULL;
    }
    free(batch_request_counts);
}

cJSON *batch_request_counts_convertToJSON(batch_request_counts_t *batch_request_counts) {
    cJSON *item = cJSON_CreateObject();

    // batch_request_counts->total
    if (!batch_request_counts->total) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total", *batch_request_counts->total) == NULL) {
    goto fail; //Numeric
    }


    // batch_request_counts->completed
    if (!batch_request_counts->completed) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "completed", *batch_request_counts->completed) == NULL) {
    goto fail; //Numeric
    }


    // batch_request_counts->failed
    if (!batch_request_counts->failed) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "failed", *batch_request_counts->failed) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

batch_request_counts_t *batch_request_counts_parseFromJSON(cJSON *batch_request_countsJSON){

    batch_request_counts_t *batch_request_counts_local_var = NULL;

    // define the local variable for batch_request_counts->total
    int *total_local_var = NULL;

    // define the local variable for batch_request_counts->completed
    int *completed_local_var = NULL;

    // define the local variable for batch_request_counts->failed
    int *failed_local_var = NULL;

    // batch_request_counts->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(batch_request_countsJSON, "total");
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

    // batch_request_counts->completed
    cJSON *completed = cJSON_GetObjectItemCaseSensitive(batch_request_countsJSON, "completed");
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

    // batch_request_counts->failed
    cJSON *failed = cJSON_GetObjectItemCaseSensitive(batch_request_countsJSON, "failed");
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



    batch_request_counts_local_var = batch_request_counts_create_internal (
        total_local_var,
        completed_local_var,
        failed_local_var
        );

    if (!batch_request_counts_local_var) {
        goto end;
    }

    return batch_request_counts_local_var;
end:
    if (total_local_var) {
        free(total_local_var);
        total_local_var = NULL;
    }
    if (completed_local_var) {
        free(completed_local_var);
        completed_local_var = NULL;
    }
    if (failed_local_var) {
        free(failed_local_var);
        failed_local_var = NULL;
    }
    return NULL;

}
