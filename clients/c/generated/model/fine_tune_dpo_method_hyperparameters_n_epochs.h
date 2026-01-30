/*
 * fine_tune_dpo_method_hyperparameters_n_epochs.h
 *
 * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
 */

#ifndef _fine_tune_dpo_method_hyperparameters_n_epochs_H_
#define _fine_tune_dpo_method_hyperparameters_n_epochs_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_dpo_method_hyperparameters_n_epochs_t fine_tune_dpo_method_hyperparameters_n_epochs_t;




typedef struct fine_tune_dpo_method_hyperparameters_n_epochs_t {

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tune_dpo_method_hyperparameters_n_epochs_t;

__attribute__((deprecated)) fine_tune_dpo_method_hyperparameters_n_epochs_t *fine_tune_dpo_method_hyperparameters_n_epochs_create(
);

void fine_tune_dpo_method_hyperparameters_n_epochs_free(fine_tune_dpo_method_hyperparameters_n_epochs_t *fine_tune_dpo_method_hyperparameters_n_epochs);

fine_tune_dpo_method_hyperparameters_n_epochs_t *fine_tune_dpo_method_hyperparameters_n_epochs_parseFromJSON(cJSON *fine_tune_dpo_method_hyperparameters_n_epochsJSON);

cJSON *fine_tune_dpo_method_hyperparameters_n_epochs_convertToJSON(fine_tune_dpo_method_hyperparameters_n_epochs_t *fine_tune_dpo_method_hyperparameters_n_epochs);

#endif /* _fine_tune_dpo_method_hyperparameters_n_epochs_H_ */

