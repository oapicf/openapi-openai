/*
 * create_fine_tuning_job_request.h
 *
 * 
 */

#ifndef _create_fine_tuning_job_request_H_
#define _create_fine_tuning_job_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_fine_tuning_job_request_t create_fine_tuning_job_request_t;

#include "create_fine_tuning_job_request_hyperparameters.h"
#include "create_fine_tuning_job_request_integrations_inner.h"
#include "create_fine_tuning_job_request_model.h"
#include "fine_tune_method.h"



typedef struct create_fine_tuning_job_request_t {
    struct create_fine_tuning_job_request_model_t *model; //model
    char *training_file; // string
    struct create_fine_tuning_job_request_hyperparameters_t *hyperparameters; //model
    char *suffix; // string
    char *validation_file; // string
    list_t *integrations; //nonprimitive container
    int seed; //numeric
    struct fine_tune_method_t *method; //model

    int _library_owned; // Is the library responsible for freeing this object?
} create_fine_tuning_job_request_t;

__attribute__((deprecated)) create_fine_tuning_job_request_t *create_fine_tuning_job_request_create(
    create_fine_tuning_job_request_model_t *model,
    char *training_file,
    create_fine_tuning_job_request_hyperparameters_t *hyperparameters,
    char *suffix,
    char *validation_file,
    list_t *integrations,
    int seed,
    fine_tune_method_t *method
);

void create_fine_tuning_job_request_free(create_fine_tuning_job_request_t *create_fine_tuning_job_request);

create_fine_tuning_job_request_t *create_fine_tuning_job_request_parseFromJSON(cJSON *create_fine_tuning_job_requestJSON);

cJSON *create_fine_tuning_job_request_convertToJSON(create_fine_tuning_job_request_t *create_fine_tuning_job_request);

#endif /* _create_fine_tuning_job_request_H_ */

