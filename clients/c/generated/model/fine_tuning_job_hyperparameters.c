#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tuning_job_hyperparameters.h"



fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters_create(
    fine_tuning_job_hyperparameters_n_epochs_t *n_epochs
    ) {
    fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters_local_var = malloc(sizeof(fine_tuning_job_hyperparameters_t));
    if (!fine_tuning_job_hyperparameters_local_var) {
        return NULL;
    }
    fine_tuning_job_hyperparameters_local_var->n_epochs = n_epochs;

    return fine_tuning_job_hyperparameters_local_var;
}


void fine_tuning_job_hyperparameters_free(fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters) {
    if(NULL == fine_tuning_job_hyperparameters){
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tuning_job_hyperparameters->n_epochs) {
        fine_tuning_job_hyperparameters_n_epochs_free(fine_tuning_job_hyperparameters->n_epochs);
        fine_tuning_job_hyperparameters->n_epochs = NULL;
    }
    free(fine_tuning_job_hyperparameters);
}

cJSON *fine_tuning_job_hyperparameters_convertToJSON(fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters) {
    cJSON *item = cJSON_CreateObject();

    // fine_tuning_job_hyperparameters->n_epochs
    if (!fine_tuning_job_hyperparameters->n_epochs) {
        goto fail;
    }
    cJSON *n_epochs_local_JSON = fine_tuning_job_hyperparameters_n_epochs_convertToJSON(fine_tuning_job_hyperparameters->n_epochs);
    if(n_epochs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "n_epochs", n_epochs_local_JSON);
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

fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters_parseFromJSON(cJSON *fine_tuning_job_hyperparametersJSON){

    fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters_local_var = NULL;

    // define the local variable for fine_tuning_job_hyperparameters->n_epochs
    fine_tuning_job_hyperparameters_n_epochs_t *n_epochs_local_nonprim = NULL;

    // fine_tuning_job_hyperparameters->n_epochs
    cJSON *n_epochs = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_hyperparametersJSON, "n_epochs");
    if (!n_epochs) {
        goto end;
    }

    
    n_epochs_local_nonprim = fine_tuning_job_hyperparameters_n_epochs_parseFromJSON(n_epochs); //nonprimitive


    fine_tuning_job_hyperparameters_local_var = fine_tuning_job_hyperparameters_create (
        n_epochs_local_nonprim
        );

    return fine_tuning_job_hyperparameters_local_var;
end:
    if (n_epochs_local_nonprim) {
        fine_tuning_job_hyperparameters_n_epochs_free(n_epochs_local_nonprim);
        n_epochs_local_nonprim = NULL;
    }
    return NULL;

}
