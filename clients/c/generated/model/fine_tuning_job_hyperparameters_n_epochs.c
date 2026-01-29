#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tuning_job_hyperparameters_n_epochs.h"



static fine_tuning_job_hyperparameters_n_epochs_t *fine_tuning_job_hyperparameters_n_epochs_create_internal(
    ) {
    fine_tuning_job_hyperparameters_n_epochs_t *fine_tuning_job_hyperparameters_n_epochs_local_var = malloc(sizeof(fine_tuning_job_hyperparameters_n_epochs_t));
    if (!fine_tuning_job_hyperparameters_n_epochs_local_var) {
        return NULL;
    }

    fine_tuning_job_hyperparameters_n_epochs_local_var->_library_owned = 1;
    return fine_tuning_job_hyperparameters_n_epochs_local_var;
}

__attribute__((deprecated)) fine_tuning_job_hyperparameters_n_epochs_t *fine_tuning_job_hyperparameters_n_epochs_create(
    ) {
    return fine_tuning_job_hyperparameters_n_epochs_create_internal (
        );
}

void fine_tuning_job_hyperparameters_n_epochs_free(fine_tuning_job_hyperparameters_n_epochs_t *fine_tuning_job_hyperparameters_n_epochs) {
    if(NULL == fine_tuning_job_hyperparameters_n_epochs){
        return ;
    }
    if(fine_tuning_job_hyperparameters_n_epochs->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tuning_job_hyperparameters_n_epochs_free");
        return ;
    }
    listEntry_t *listEntry;
    free(fine_tuning_job_hyperparameters_n_epochs);
}

cJSON *fine_tuning_job_hyperparameters_n_epochs_convertToJSON(fine_tuning_job_hyperparameters_n_epochs_t *fine_tuning_job_hyperparameters_n_epochs) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

fine_tuning_job_hyperparameters_n_epochs_t *fine_tuning_job_hyperparameters_n_epochs_parseFromJSON(cJSON *fine_tuning_job_hyperparameters_n_epochsJSON){

    fine_tuning_job_hyperparameters_n_epochs_t *fine_tuning_job_hyperparameters_n_epochs_local_var = NULL;


    fine_tuning_job_hyperparameters_n_epochs_local_var = fine_tuning_job_hyperparameters_n_epochs_create_internal (
        );

    return fine_tuning_job_hyperparameters_n_epochs_local_var;
end:
    return NULL;

}
