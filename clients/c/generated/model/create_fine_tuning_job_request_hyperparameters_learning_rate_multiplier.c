#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier.h"



create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_create(
    ) {
    create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_local_var = malloc(sizeof(create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t));
    if (!create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_local_var) {
        return NULL;
    }

    return create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_local_var;
}


void create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_free(create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier) {
    if(NULL == create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier){
        return ;
    }
    listEntry_t *listEntry;
    free(create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier);
}

cJSON *create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_convertToJSON(create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_parseFromJSON(cJSON *create_fine_tuning_job_request_hyperparameters_learning_rate_multiplierJSON){

    create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_local_var = NULL;


    create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_local_var = create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_create (
        );

    return create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_local_var;
end:
    return NULL;

}
