/*
 * fine_tune_dpo_method_hyperparameters_batch_size.h
 *
 * Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
 */

#ifndef _fine_tune_dpo_method_hyperparameters_batch_size_H_
#define _fine_tune_dpo_method_hyperparameters_batch_size_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_dpo_method_hyperparameters_batch_size_t fine_tune_dpo_method_hyperparameters_batch_size_t;




typedef struct fine_tune_dpo_method_hyperparameters_batch_size_t {

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tune_dpo_method_hyperparameters_batch_size_t;

__attribute__((deprecated)) fine_tune_dpo_method_hyperparameters_batch_size_t *fine_tune_dpo_method_hyperparameters_batch_size_create(
);

void fine_tune_dpo_method_hyperparameters_batch_size_free(fine_tune_dpo_method_hyperparameters_batch_size_t *fine_tune_dpo_method_hyperparameters_batch_size);

fine_tune_dpo_method_hyperparameters_batch_size_t *fine_tune_dpo_method_hyperparameters_batch_size_parseFromJSON(cJSON *fine_tune_dpo_method_hyperparameters_batch_sizeJSON);

cJSON *fine_tune_dpo_method_hyperparameters_batch_size_convertToJSON(fine_tune_dpo_method_hyperparameters_batch_size_t *fine_tune_dpo_method_hyperparameters_batch_size);

#endif /* _fine_tune_dpo_method_hyperparameters_batch_size_H_ */

