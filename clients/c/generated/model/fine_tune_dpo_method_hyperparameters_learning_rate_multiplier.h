/*
 * fine_tune_dpo_method_hyperparameters_learning_rate_multiplier.h
 *
 * Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
 */

#ifndef _fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_H_
#define _fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t;




typedef struct fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t {

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t;

__attribute__((deprecated)) fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t *fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_create(
);

void fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_free(fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t *fine_tune_dpo_method_hyperparameters_learning_rate_multiplier);

fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t *fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_parseFromJSON(cJSON *fine_tune_dpo_method_hyperparameters_learning_rate_multiplierJSON);

cJSON *fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_convertToJSON(fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_t *fine_tune_dpo_method_hyperparameters_learning_rate_multiplier);

#endif /* _fine_tune_dpo_method_hyperparameters_learning_rate_multiplier_H_ */

