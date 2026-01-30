#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_request_counts.h"



static batch_request_counts_t *batch_request_counts_create_internal(
    int total,
    int completed,
    int failed
    ) {
    batch_request_counts_t *batch_request_counts_local_var = malloc(sizeof(batch_request_counts_t));
    if (!batch_request_counts_local_var) {
        return NULL;
    }
    batch_request_counts_local_var->total = total;
    batch_request_counts_local_var->completed = completed;
    batch_request_counts_local_var->failed = failed;

    batch_request_counts_local_var->_library_owned = 1;
    return batch_request_counts_local_var;
}

__attribute__((deprecated)) batch_request_counts_t *batch_request_counts_create(
    int total,
    int completed,
    int failed
    ) {
    return batch_request_counts_create_internal (
        total,
        completed,
        failed
        );
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
    free(batch_request_counts);
}

cJSON *batch_request_counts_convertToJSON(batch_request_counts_t *batch_request_counts) {
    cJSON *item = cJSON_CreateObject();

    // batch_request_counts->total
    if (!batch_request_counts->total) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "total", batch_request_counts->total) == NULL) {
    goto fail; //Numeric
    }


    // batch_request_counts->completed
    if (!batch_request_counts->completed) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "completed", batch_request_counts->completed) == NULL) {
    goto fail; //Numeric
    }


    // batch_request_counts->failed
    if (!batch_request_counts->failed) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "failed", batch_request_counts->failed) == NULL) {
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


    batch_request_counts_local_var = batch_request_counts_create_internal (
        total->valuedouble,
        completed->valuedouble,
        failed->valuedouble
        );

    return batch_request_counts_local_var;
end:
    return NULL;

}
