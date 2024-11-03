/*
 * create_fine_tuning_job_request_integrations_inner_type.h
 *
 * The type of integration to enable. Currently, only \&quot;wandb\&quot; (Weights and Biases) is supported. 
 */

#ifndef _create_fine_tuning_job_request_integrations_inner_type_H_
#define _create_fine_tuning_job_request_integrations_inner_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_fine_tuning_job_request_integrations_inner_type_t create_fine_tuning_job_request_integrations_inner_type_t;




typedef struct create_fine_tuning_job_request_integrations_inner_type_t {

} create_fine_tuning_job_request_integrations_inner_type_t;

create_fine_tuning_job_request_integrations_inner_type_t *create_fine_tuning_job_request_integrations_inner_type_create(
);

void create_fine_tuning_job_request_integrations_inner_type_free(create_fine_tuning_job_request_integrations_inner_type_t *create_fine_tuning_job_request_integrations_inner_type);

create_fine_tuning_job_request_integrations_inner_type_t *create_fine_tuning_job_request_integrations_inner_type_parseFromJSON(cJSON *create_fine_tuning_job_request_integrations_inner_typeJSON);

cJSON *create_fine_tuning_job_request_integrations_inner_type_convertToJSON(create_fine_tuning_job_request_integrations_inner_type_t *create_fine_tuning_job_request_integrations_inner_type);

#endif /* _create_fine_tuning_job_request_integrations_inner_type_H_ */

