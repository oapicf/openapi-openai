/*
 * fine_tune_dpo_method_hyperparameters.h
 *
 * The hyperparameters used for the fine-tuning job.
 */

#ifndef _fine_tune_dpo_method_hyperparameters_H_
#define _fine_tune_dpo_method_hyperparameters_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_dpo_method_hyperparameters_t fine_tune_dpo_method_hyperparameters_t;

#include "fine_tune_dpo_method_hyperparameters_batch_size.h"
#include "fine_tune_dpo_method_hyperparameters_beta.h"
#include "fine_tune_dpo_method_hyperparameters_learning_rate_multiplier.h"
#include "fine_tune_dpo_method_hyperparameters_n_epochs.h"



typedef struct fine_tune_dpo_method_hyperparameters_t {
    struct fine_tune_dpo_method_hyperparameters_beta_t *beta; //model
    struct fine_tune_dpo_method_hyperparameters_batch_size_t *batch_size; //model
    struct fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t *learning_rate_multiplier; //model
    struct fine_tune_dpo_method_hyperparameters_n_epochs_t *n_epochs; //model

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tune_dpo_method_hyperparameters_t;

__attribute__((deprecated)) fine_tune_dpo_method_hyperparameters_t *fine_tune_dpo_method_hyperparameters_create(
    fine_tune_dpo_method_hyperparameters_beta_t *beta,
    fine_tune_dpo_method_hyperparameters_batch_size_t *batch_size,
    fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t *learning_rate_multiplier,
    fine_tune_dpo_method_hyperparameters_n_epochs_t *n_epochs
);

void fine_tune_dpo_method_hyperparameters_free(fine_tune_dpo_method_hyperparameters_t *fine_tune_dpo_method_hyperparameters);

fine_tune_dpo_method_hyperparameters_t *fine_tune_dpo_method_hyperparameters_parseFromJSON(cJSON *fine_tune_dpo_method_hyperparametersJSON);

cJSON *fine_tune_dpo_method_hyperparameters_convertToJSON(fine_tune_dpo_method_hyperparameters_t *fine_tune_dpo_method_hyperparameters);

#endif /* _fine_tune_dpo_method_hyperparameters_H_ */

