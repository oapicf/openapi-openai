/*
 * fine_tuning_job_hyperparameters_n_epochs.h
 *
 * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. \&quot;auto\&quot; decides the optimal number of epochs based on the size of the dataset. If setting the number manually, we support any number between 1 and 50 epochs.
 */

#ifndef _fine_tuning_job_hyperparameters_n_epochs_H_
#define _fine_tuning_job_hyperparameters_n_epochs_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tuning_job_hyperparameters_n_epochs_t fine_tuning_job_hyperparameters_n_epochs_t;




typedef struct fine_tuning_job_hyperparameters_n_epochs_t {

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tuning_job_hyperparameters_n_epochs_t;

__attribute__((deprecated)) fine_tuning_job_hyperparameters_n_epochs_t *fine_tuning_job_hyperparameters_n_epochs_create(
);

void fine_tuning_job_hyperparameters_n_epochs_free(fine_tuning_job_hyperparameters_n_epochs_t *fine_tuning_job_hyperparameters_n_epochs);

fine_tuning_job_hyperparameters_n_epochs_t *fine_tuning_job_hyperparameters_n_epochs_parseFromJSON(cJSON *fine_tuning_job_hyperparameters_n_epochsJSON);

cJSON *fine_tuning_job_hyperparameters_n_epochs_convertToJSON(fine_tuning_job_hyperparameters_n_epochs_t *fine_tuning_job_hyperparameters_n_epochs);

#endif /* _fine_tuning_job_hyperparameters_n_epochs_H_ */

