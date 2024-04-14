/*
 * create_fine_tuning_job_request_hyperparameters_n_epochs.h
 *
 * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
 */

#ifndef _create_fine_tuning_job_request_hyperparameters_n_epochs_H_
#define _create_fine_tuning_job_request_hyperparameters_n_epochs_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_fine_tuning_job_request_hyperparameters_n_epochs_t create_fine_tuning_job_request_hyperparameters_n_epochs_t;




typedef struct create_fine_tuning_job_request_hyperparameters_n_epochs_t {

} create_fine_tuning_job_request_hyperparameters_n_epochs_t;

create_fine_tuning_job_request_hyperparameters_n_epochs_t *create_fine_tuning_job_request_hyperparameters_n_epochs_create(
);

void create_fine_tuning_job_request_hyperparameters_n_epochs_free(create_fine_tuning_job_request_hyperparameters_n_epochs_t *create_fine_tuning_job_request_hyperparameters_n_epochs);

create_fine_tuning_job_request_hyperparameters_n_epochs_t *create_fine_tuning_job_request_hyperparameters_n_epochs_parseFromJSON(cJSON *create_fine_tuning_job_request_hyperparameters_n_epochsJSON);

cJSON *create_fine_tuning_job_request_hyperparameters_n_epochs_convertToJSON(create_fine_tuning_job_request_hyperparameters_n_epochs_t *create_fine_tuning_job_request_hyperparameters_n_epochs);

#endif /* _create_fine_tuning_job_request_hyperparameters_n_epochs_H_ */

