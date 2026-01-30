#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tuning_job_hyperparameters.h"



static fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters_create_internal(
    create_fine_tuning_job_request_hyperparameters_batch_size_t *batch_size,
    create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *learning_rate_multiplier,
    create_fine_tuning_job_request_hyperparameters_n_epochs_t *n_epochs
    ) {
    fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters_local_var = malloc(sizeof(fine_tuning_job_hyperparameters_t));
    if (!fine_tuning_job_hyperparameters_local_var) {
        return NULL;
    }
    fine_tuning_job_hyperparameters_local_var->batch_size = batch_size;
    fine_tuning_job_hyperparameters_local_var->learning_rate_multiplier = learning_rate_multiplier;
    fine_tuning_job_hyperparameters_local_var->n_epochs = n_epochs;

    fine_tuning_job_hyperparameters_local_var->_library_owned = 1;
    return fine_tuning_job_hyperparameters_local_var;
}

__attribute__((deprecated)) fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters_create(
    create_fine_tuning_job_request_hyperparameters_batch_size_t *batch_size,
    create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *learning_rate_multiplier,
    create_fine_tuning_job_request_hyperparameters_n_epochs_t *n_epochs
    ) {
    return fine_tuning_job_hyperparameters_create_internal (
        batch_size,
        learning_rate_multiplier,
        n_epochs
        );
}

void fine_tuning_job_hyperparameters_free(fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters) {
    if(NULL == fine_tuning_job_hyperparameters){
        return ;
    }
    if(fine_tuning_job_hyperparameters->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tuning_job_hyperparameters_free");
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tuning_job_hyperparameters->batch_size) {
        create_fine_tuning_job_request_hyperparameters_batch_size_free(fine_tuning_job_hyperparameters->batch_size);
        fine_tuning_job_hyperparameters->batch_size = NULL;
    }
    if (fine_tuning_job_hyperparameters->learning_rate_multiplier) {
        create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_free(fine_tuning_job_hyperparameters->learning_rate_multiplier);
        fine_tuning_job_hyperparameters->learning_rate_multiplier = NULL;
    }
    if (fine_tuning_job_hyperparameters->n_epochs) {
        create_fine_tuning_job_request_hyperparameters_n_epochs_free(fine_tuning_job_hyperparameters->n_epochs);
        fine_tuning_job_hyperparameters->n_epochs = NULL;
    }
    free(fine_tuning_job_hyperparameters);
}

cJSON *fine_tuning_job_hyperparameters_convertToJSON(fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters) {
    cJSON *item = cJSON_CreateObject();

    // fine_tuning_job_hyperparameters->batch_size
    if(fine_tuning_job_hyperparameters->batch_size) {
    cJSON *batch_size_local_JSON = create_fine_tuning_job_request_hyperparameters_batch_size_convertToJSON(fine_tuning_job_hyperparameters->batch_size);
    if(batch_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "batch_size", batch_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // fine_tuning_job_hyperparameters->learning_rate_multiplier
    if(fine_tuning_job_hyperparameters->learning_rate_multiplier) {
    cJSON *learning_rate_multiplier_local_JSON = create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_convertToJSON(fine_tuning_job_hyperparameters->learning_rate_multiplier);
    if(learning_rate_multiplier_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "learning_rate_multiplier", learning_rate_multiplier_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // fine_tuning_job_hyperparameters->n_epochs
    if(fine_tuning_job_hyperparameters->n_epochs) {
    cJSON *n_epochs_local_JSON = create_fine_tuning_job_request_hyperparameters_n_epochs_convertToJSON(fine_tuning_job_hyperparameters->n_epochs);
    if(n_epochs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "n_epochs", n_epochs_local_JSON);
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

fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters_parseFromJSON(cJSON *fine_tuning_job_hyperparametersJSON){

    fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters_local_var = NULL;

    // define the local variable for fine_tuning_job_hyperparameters->batch_size
    create_fine_tuning_job_request_hyperparameters_batch_size_t *batch_size_local_nonprim = NULL;

    // define the local variable for fine_tuning_job_hyperparameters->learning_rate_multiplier
    create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *learning_rate_multiplier_local_nonprim = NULL;

    // define the local variable for fine_tuning_job_hyperparameters->n_epochs
    create_fine_tuning_job_request_hyperparameters_n_epochs_t *n_epochs_local_nonprim = NULL;

    // fine_tuning_job_hyperparameters->batch_size
    cJSON *batch_size = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_hyperparametersJSON, "batch_size");
    if (cJSON_IsNull(batch_size)) {
        batch_size = NULL;
    }
    if (batch_size) { 
    batch_size_local_nonprim = create_fine_tuning_job_request_hyperparameters_batch_size_parseFromJSON(batch_size); //nonprimitive
    }

    // fine_tuning_job_hyperparameters->learning_rate_multiplier
    cJSON *learning_rate_multiplier = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_hyperparametersJSON, "learning_rate_multiplier");
    if (cJSON_IsNull(learning_rate_multiplier)) {
        learning_rate_multiplier = NULL;
    }
    if (learning_rate_multiplier) { 
    learning_rate_multiplier_local_nonprim = create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_parseFromJSON(learning_rate_multiplier); //nonprimitive
    }

    // fine_tuning_job_hyperparameters->n_epochs
    cJSON *n_epochs = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_hyperparametersJSON, "n_epochs");
    if (cJSON_IsNull(n_epochs)) {
        n_epochs = NULL;
    }
    if (n_epochs) { 
    n_epochs_local_nonprim = create_fine_tuning_job_request_hyperparameters_n_epochs_parseFromJSON(n_epochs); //nonprimitive
    }


    fine_tuning_job_hyperparameters_local_var = fine_tuning_job_hyperparameters_create_internal (
        batch_size ? batch_size_local_nonprim : NULL,
        learning_rate_multiplier ? learning_rate_multiplier_local_nonprim : NULL,
        n_epochs ? n_epochs_local_nonprim : NULL
        );

    return fine_tuning_job_hyperparameters_local_var;
end:
    if (batch_size_local_nonprim) {
        create_fine_tuning_job_request_hyperparameters_batch_size_free(batch_size_local_nonprim);
        batch_size_local_nonprim = NULL;
    }
    if (learning_rate_multiplier_local_nonprim) {
        create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_free(learning_rate_multiplier_local_nonprim);
        learning_rate_multiplier_local_nonprim = NULL;
    }
    if (n_epochs_local_nonprim) {
        create_fine_tuning_job_request_hyperparameters_n_epochs_free(n_epochs_local_nonprim);
        n_epochs_local_nonprim = NULL;
    }
    return NULL;

}
