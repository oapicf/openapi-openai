/*
 * create_fine_tuning_job_request_hyperparameters_batch_size.h
 *
 * Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
 */

#ifndef _create_fine_tuning_job_request_hyperparameters_batch_size_H_
#define _create_fine_tuning_job_request_hyperparameters_batch_size_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_fine_tuning_job_request_hyperparameters_batch_size_t create_fine_tuning_job_request_hyperparameters_batch_size_t;




typedef struct create_fine_tuning_job_request_hyperparameters_batch_size_t {

} create_fine_tuning_job_request_hyperparameters_batch_size_t;

create_fine_tuning_job_request_hyperparameters_batch_size_t *create_fine_tuning_job_request_hyperparameters_batch_size_create(
);

void create_fine_tuning_job_request_hyperparameters_batch_size_free(create_fine_tuning_job_request_hyperparameters_batch_size_t *create_fine_tuning_job_request_hyperparameters_batch_size);

create_fine_tuning_job_request_hyperparameters_batch_size_t *create_fine_tuning_job_request_hyperparameters_batch_size_parseFromJSON(cJSON *create_fine_tuning_job_request_hyperparameters_batch_sizeJSON);

cJSON *create_fine_tuning_job_request_hyperparameters_batch_size_convertToJSON(create_fine_tuning_job_request_hyperparameters_batch_size_t *create_fine_tuning_job_request_hyperparameters_batch_size);

#endif /* _create_fine_tuning_job_request_hyperparameters_batch_size_H_ */

