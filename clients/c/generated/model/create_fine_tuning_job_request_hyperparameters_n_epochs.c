#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_fine_tuning_job_request_hyperparameters_n_epochs.h"



create_fine_tuning_job_request_hyperparameters_n_epochs_t *create_fine_tuning_job_request_hyperparameters_n_epochs_create(
    ) {
    create_fine_tuning_job_request_hyperparameters_n_epochs_t *create_fine_tuning_job_request_hyperparameters_n_epochs_local_var = malloc(sizeof(create_fine_tuning_job_request_hyperparameters_n_epochs_t));
    if (!create_fine_tuning_job_request_hyperparameters_n_epochs_local_var) {
        return NULL;
    }

    return create_fine_tuning_job_request_hyperparameters_n_epochs_local_var;
}


void create_fine_tuning_job_request_hyperparameters_n_epochs_free(create_fine_tuning_job_request_hyperparameters_n_epochs_t *create_fine_tuning_job_request_hyperparameters_n_epochs) {
    if(NULL == create_fine_tuning_job_request_hyperparameters_n_epochs){
        return ;
    }
    listEntry_t *listEntry;
    free(create_fine_tuning_job_request_hyperparameters_n_epochs);
}

cJSON *create_fine_tuning_job_request_hyperparameters_n_epochs_convertToJSON(create_fine_tuning_job_request_hyperparameters_n_epochs_t *create_fine_tuning_job_request_hyperparameters_n_epochs) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_fine_tuning_job_request_hyperparameters_n_epochs_t *create_fine_tuning_job_request_hyperparameters_n_epochs_parseFromJSON(cJSON *create_fine_tuning_job_request_hyperparameters_n_epochsJSON){

    create_fine_tuning_job_request_hyperparameters_n_epochs_t *create_fine_tuning_job_request_hyperparameters_n_epochs_local_var = NULL;


    create_fine_tuning_job_request_hyperparameters_n_epochs_local_var = create_fine_tuning_job_request_hyperparameters_n_epochs_create (
        );

    return create_fine_tuning_job_request_hyperparameters_n_epochs_local_var;
end:
    return NULL;

}
