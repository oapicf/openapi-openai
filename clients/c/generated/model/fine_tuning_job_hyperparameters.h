/*
 * fine_tuning_job_hyperparameters.h
 *
 * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
 */

#ifndef _fine_tuning_job_hyperparameters_H_
#define _fine_tuning_job_hyperparameters_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tuning_job_hyperparameters_t fine_tuning_job_hyperparameters_t;

#include "fine_tuning_job_hyperparameters_n_epochs.h"



typedef struct fine_tuning_job_hyperparameters_t {
    struct fine_tuning_job_hyperparameters_n_epochs_t *n_epochs; //model

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tuning_job_hyperparameters_t;

__attribute__((deprecated)) fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters_create(
    fine_tuning_job_hyperparameters_n_epochs_t *n_epochs
);

void fine_tuning_job_hyperparameters_free(fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters);

fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters_parseFromJSON(cJSON *fine_tuning_job_hyperparametersJSON);

cJSON *fine_tuning_job_hyperparameters_convertToJSON(fine_tuning_job_hyperparameters_t *fine_tuning_job_hyperparameters);

#endif /* _fine_tuning_job_hyperparameters_H_ */

