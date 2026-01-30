/*
 * create_fine_tuning_job_request_hyperparameters.h
 *
 * The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of &#x60;method&#x60;, and should be passed in under the &#x60;method&#x60; parameter. 
 */

#ifndef _create_fine_tuning_job_request_hyperparameters_H_
#define _create_fine_tuning_job_request_hyperparameters_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_fine_tuning_job_request_hyperparameters_t create_fine_tuning_job_request_hyperparameters_t;

#include "create_fine_tuning_job_request_hyperparameters_batch_size.h"
#include "create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier.h"
#include "create_fine_tuning_job_request_hyperparameters_n_epochs.h"



typedef struct create_fine_tuning_job_request_hyperparameters_t {
    struct create_fine_tuning_job_request_hyperparameters_batch_size_t *batch_size; //model
    struct create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *learning_rate_multiplier; //model
    struct create_fine_tuning_job_request_hyperparameters_n_epochs_t *n_epochs; //model

    int _library_owned; // Is the library responsible for freeing this object?
} create_fine_tuning_job_request_hyperparameters_t;

__attribute__((deprecated)) create_fine_tuning_job_request_hyperparameters_t *create_fine_tuning_job_request_hyperparameters_create(
    create_fine_tuning_job_request_hyperparameters_batch_size_t *batch_size,
    create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *learning_rate_multiplier,
    create_fine_tuning_job_request_hyperparameters_n_epochs_t *n_epochs
);

void create_fine_tuning_job_request_hyperparameters_free(create_fine_tuning_job_request_hyperparameters_t *create_fine_tuning_job_request_hyperparameters);

create_fine_tuning_job_request_hyperparameters_t *create_fine_tuning_job_request_hyperparameters_parseFromJSON(cJSON *create_fine_tuning_job_request_hyperparametersJSON);

cJSON *create_fine_tuning_job_request_hyperparameters_convertToJSON(create_fine_tuning_job_request_hyperparameters_t *create_fine_tuning_job_request_hyperparameters);

#endif /* _create_fine_tuning_job_request_hyperparameters_H_ */

