/*
 * create_fine_tuning_job_request_model.h
 *
 * The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned). 
 */

#ifndef _create_fine_tuning_job_request_model_H_
#define _create_fine_tuning_job_request_model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_fine_tuning_job_request_model_t create_fine_tuning_job_request_model_t;




typedef struct create_fine_tuning_job_request_model_t {

    int _library_owned; // Is the library responsible for freeing this object?
} create_fine_tuning_job_request_model_t;

__attribute__((deprecated)) create_fine_tuning_job_request_model_t *create_fine_tuning_job_request_model_create(
);

void create_fine_tuning_job_request_model_free(create_fine_tuning_job_request_model_t *create_fine_tuning_job_request_model);

create_fine_tuning_job_request_model_t *create_fine_tuning_job_request_model_parseFromJSON(cJSON *create_fine_tuning_job_request_modelJSON);

cJSON *create_fine_tuning_job_request_model_convertToJSON(create_fine_tuning_job_request_model_t *create_fine_tuning_job_request_model);

#endif /* _create_fine_tuning_job_request_model_H_ */

