/*
 * fine_tuning_job_hyperparameters.h
 *
 * The hyperparameters used for the fine-tuning job. This value will only be returned when running &#x60;supervised&#x60; jobs.
 */

#ifndef _fine_tuning_job_hyperparameters_H_
#define _fine_tuning_job_hyperparameters_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tuning_job_hyperparameters_t fine_tuning_job_hyperparameters_t;

#include "create_fine_tuning_job_request_hyperparameters_batch_size.h"
#include "create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier.h"
#include "create_fine_tuning_job_request_hyperparameters_n_epochs.h"



typedef struct fine_tuning_job_hyperparameters_t {
    struct create_fine_tuning_job_request_hyperparameters_batch_size_t *batch_size; //model
    struct create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *learning_rate_multiplier; //model
    struct create_fine_tuning_job_request_hyperparameters_n_epochs_t *n_epochs; //model

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tuning_job_hyperparameters_t;

__attribute__((deprecated)) fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters_create(
    create_fine_tuning_job_request_hyperparameters_batch_size_t *batch_size,
    create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier_t *learning_rate_multiplier,
    create_fine_tuning_job_request_hyperparameters_n_epochs_t *n_epochs
);

void fine_tuning_job_hyperparameters_free(fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters);

fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters_parseFromJSON(cJSON *fine_tuning_job_hyperparametersJSON);

cJSON *fine_tuning_job_hyperparameters_convertToJSON(fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters);

#endif /* _fine_tuning_job_hyperparameters_H_ */

