#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_fine_tuning_job_request_hyperparameters_batch_size.h"



create_fine_tuning_job_request_hyperparameters_batch_size_t *create_fine_tuning_job_request_hyperparameters_batch_size_create(
    ) {
    create_fine_tuning_job_request_hyperparameters_batch_size_t *create_fine_tuning_job_request_hyperparameters_batch_size_local_var = malloc(sizeof(create_fine_tuning_job_request_hyperparameters_batch_size_t));
    if (!create_fine_tuning_job_request_hyperparameters_batch_size_local_var) {
        return NULL;
    }

    return create_fine_tuning_job_request_hyperparameters_batch_size_local_var;
}


void create_fine_tuning_job_request_hyperparameters_batch_size_free(create_fine_tuning_job_request_hyperparameters_batch_size_t *create_fine_tuning_job_request_hyperparameters_batch_size) {
    if(NULL == create_fine_tuning_job_request_hyperparameters_batch_size){
        return ;
    }
    listEntry_t *listEntry;
    free(create_fine_tuning_job_request_hyperparameters_batch_size);
}

cJSON *create_fine_tuning_job_request_hyperparameters_batch_size_convertToJSON(create_fine_tuning_job_request_hyperparameters_batch_size_t *create_fine_tuning_job_request_hyperparameters_batch_size) {
    cJSON *item = cJSON_CreateObject();
    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_fine_tuning_job_request_hyperparameters_batch_size_t *create_fine_tuning_job_request_hyperparameters_batch_size_parseFromJSON(cJSON *create_fine_tuning_job_request_hyperparameters_batch_sizeJSON){

    create_fine_tuning_job_request_hyperparameters_batch_size_t *create_fine_tuning_job_request_hyperparameters_batch_size_local_var = NULL;


    create_fine_tuning_job_request_hyperparameters_batch_size_local_var = create_fine_tuning_job_request_hyperparameters_batch_size_create (
        );

    return create_fine_tuning_job_request_hyperparameters_batch_size_local_var;
end:
    return NULL;

}
