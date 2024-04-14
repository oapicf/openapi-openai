#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_fine_tuning_job_request_hyperparameters.h"



create_fine_tuning_job_request_hyperparameters_t *create_fine_tuning_job_request_hyperparameters_create(
    create_fine_tuning_job_request_hyperparameters_batch_size_t *batch_size,
    create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *learning_rate_multiplier,
    create_fine_tuning_job_request_hyperparameters_n_epochs_t *n_epochs
    ) {
    create_fine_tuning_job_request_hyperparameters_t *create_fine_tuning_job_request_hyperparameters_local_var = malloc(sizeof(create_fine_tuning_job_request_hyperparameters_t));
    if (!create_fine_tuning_job_request_hyperparameters_local_var) {
        return NULL;
    }
    create_fine_tuning_job_request_hyperparameters_local_var->batch_size = batch_size;
    create_fine_tuning_job_request_hyperparameters_local_var->learning_rate_multiplier = learning_rate_multiplier;
    create_fine_tuning_job_request_hyperparameters_local_var->n_epochs = n_epochs;

    return create_fine_tuning_job_request_hyperparameters_local_var;
}


void create_fine_tuning_job_request_hyperparameters_free(create_fine_tuning_job_request_hyperparameters_t *create_fine_tuning_job_request_hyperparameters) {
    if(NULL == create_fine_tuning_job_request_hyperparameters){
        return ;
    }
    listEntry_t *listEntry;
    if (create_fine_tuning_job_request_hyperparameters->batch_size) {
        create_fine_tuning_job_request_hyperparameters_batch_size_free(create_fine_tuning_job_request_hyperparameters->batch_size);
        create_fine_tuning_job_request_hyperparameters->batch_size = NULL;
    }
    if (create_fine_tuning_job_request_hyperparameters->learning_rate_multiplier) {
        create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_free(create_fine_tuning_job_request_hyperparameters->learning_rate_multiplier);
        create_fine_tuning_job_request_hyperparameters->learning_rate_multiplier = NULL;
    }
    if (create_fine_tuning_job_request_hyperparameters->n_epochs) {
        create_fine_tuning_job_request_hyperparameters_n_epochs_free(create_fine_tuning_job_request_hyperparameters->n_epochs);
        create_fine_tuning_job_request_hyperparameters->n_epochs = NULL;
    }
    free(create_fine_tuning_job_request_hyperparameters);
}

cJSON *create_fine_tuning_job_request_hyperparameters_convertToJSON(create_fine_tuning_job_request_hyperparameters_t *create_fine_tuning_job_request_hyperparameters) {
    cJSON *item = cJSON_CreateObject();

    // create_fine_tuning_job_request_hyperparameters->batch_size
    if(create_fine_tuning_job_request_hyperparameters->batch_size) {
    cJSON *batch_size_local_JSON = create_fine_tuning_job_request_hyperparameters_batch_size_convertToJSON(create_fine_tuning_job_request_hyperparameters->batch_size);
    if(batch_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "batch_size", batch_size_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_fine_tuning_job_request_hyperparameters->learning_rate_multiplier
    if(create_fine_tuning_job_request_hyperparameters->learning_rate_multiplier) {
    cJSON *learning_rate_multiplier_local_JSON = create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_convertToJSON(create_fine_tuning_job_request_hyperparameters->learning_rate_multiplier);
    if(learning_rate_multiplier_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "learning_rate_multiplier", learning_rate_multiplier_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_fine_tuning_job_request_hyperparameters->n_epochs
    if(create_fine_tuning_job_request_hyperparameters->n_epochs) {
    cJSON *n_epochs_local_JSON = create_fine_tuning_job_request_hyperparameters_n_epochs_convertToJSON(create_fine_tuning_job_request_hyperparameters->n_epochs);
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

create_fine_tuning_job_request_hyperparameters_t *create_fine_tuning_job_request_hyperparameters_parseFromJSON(cJSON *create_fine_tuning_job_request_hyperparametersJSON){

    create_fine_tuning_job_request_hyperparameters_t *create_fine_tuning_job_request_hyperparameters_local_var = NULL;

    // define the local variable for create_fine_tuning_job_request_hyperparameters->batch_size
    create_fine_tuning_job_request_hyperparameters_batch_size_t *batch_size_local_nonprim = NULL;

    // define the local variable for create_fine_tuning_job_request_hyperparameters->learning_rate_multiplier
    create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *learning_rate_multiplier_local_nonprim = NULL;

    // define the local variable for create_fine_tuning_job_request_hyperparameters->n_epochs
    create_fine_tuning_job_request_hyperparameters_n_epochs_t *n_epochs_local_nonprim = NULL;

    // create_fine_tuning_job_request_hyperparameters->batch_size
    cJSON *batch_size = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_request_hyperparametersJSON, "batch_size");
    if (batch_size) { 
    batch_size_local_nonprim = create_fine_tuning_job_request_hyperparameters_batch_size_parseFromJSON(batch_size); //nonprimitive
    }

    // create_fine_tuning_job_request_hyperparameters->learning_rate_multiplier
    cJSON *learning_rate_multiplier = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_request_hyperparametersJSON, "learning_rate_multiplier");
    if (learning_rate_multiplier) { 
    learning_rate_multiplier_local_nonprim = create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_parseFromJSON(learning_rate_multiplier); //nonprimitive
    }

    // create_fine_tuning_job_request_hyperparameters->n_epochs
    cJSON *n_epochs = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_request_hyperparametersJSON, "n_epochs");
    if (n_epochs) { 
    n_epochs_local_nonprim = create_fine_tuning_job_request_hyperparameters_n_epochs_parseFromJSON(n_epochs); //nonprimitive
    }


    create_fine_tuning_job_request_hyperparameters_local_var = create_fine_tuning_job_request_hyperparameters_create (
        batch_size ? batch_size_local_nonprim : NULL,
        learning_rate_multiplier ? learning_rate_multiplier_local_nonprim : NULL,
        n_epochs ? n_epochs_local_nonprim : NULL
        );

    return create_fine_tuning_job_request_hyperparameters_local_var;
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
