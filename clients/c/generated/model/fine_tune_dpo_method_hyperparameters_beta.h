/*
 * fine_tune_dpo_method_hyperparameters_beta.h
 *
 * The beta value for the DPO method. A higher beta value will increase the weight of the penalty between the policy and reference model. 
 */

#ifndef _fine_tune_dpo_method_hyperparameters_beta_H_
#define _fine_tune_dpo_method_hyperparameters_beta_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_dpo_method_hyperparameters_beta_t fine_tune_dpo_method_hyperparameters_beta_t;




typedef struct fine_tune_dpo_method_hyperparameters_beta_t {

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tune_dpo_method_hyperparameters_beta_t;

__attribute__((deprecated)) fine_tune_dpo_method_hyperparameters_beta_t *fine_tune_dpo_method_hyperparameters_beta_create(
);

void fine_tune_dpo_method_hyperparameters_beta_free(fine_tune_dpo_method_hyperparameters_beta_t *fine_tune_dpo_method_hyperparameters_beta);

fine_tune_dpo_method_hyperparameters_beta_t *fine_tune_dpo_method_hyperparameters_beta_parseFromJSON(cJSON *fine_tune_dpo_method_hyperparameters_betaJSON);

cJSON *fine_tune_dpo_method_hyperparameters_beta_convertToJSON(fine_tune_dpo_method_hyperparameters_beta_t *fine_tune_dpo_method_hyperparameters_beta);

#endif /* _fine_tune_dpo_method_hyperparameters_beta_H_ */

