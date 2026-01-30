/*
 * fine_tune_supervised_method.h
 *
 * Configuration for the supervised fine-tuning method.
 */

#ifndef _fine_tune_supervised_method_H_
#define _fine_tune_supervised_method_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_supervised_method_t fine_tune_supervised_method_t;

#include "fine_tune_supervised_method_hyperparameters.h"



typedef struct fine_tune_supervised_method_t {
    struct fine_tune_supervised_method_hyperparameters_t *hyperparameters; //model

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tune_supervised_method_t;

__attribute__((deprecated)) fine_tune_supervised_method_t *fine_tune_supervised_method_create(
    fine_tune_supervised_method_hyperparameters_t *hyperparameters
);

void fine_tune_supervised_method_free(fine_tune_supervised_method_t *fine_tune_supervised_method);

fine_tune_supervised_method_t *fine_tune_supervised_method_parseFromJSON(cJSON *fine_tune_supervised_methodJSON);

cJSON *fine_tune_supervised_method_convertToJSON(fine_tune_supervised_method_t *fine_tune_supervised_method);

#endif /* _fine_tune_supervised_method_H_ */

