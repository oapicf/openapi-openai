/*
 * create_fine_tuning_job_request_integrations_inner.h
 *
 * 
 */

#ifndef _create_fine_tuning_job_request_integrations_inner_H_
#define _create_fine_tuning_job_request_integrations_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_fine_tuning_job_request_integrations_inner_t create_fine_tuning_job_request_integrations_inner_t;

#include "create_fine_tuning_job_request_integrations_inner_type.h"
#include "create_fine_tuning_job_request_integrations_inner_wandb.h"



typedef struct create_fine_tuning_job_request_integrations_inner_t {
    struct create_fine_tuning_job_request_integrations_inner_type_t *type; //model
    struct create_fine_tuning_job_request_integrations_inner_wandb_t *wandb; //model

} create_fine_tuning_job_request_integrations_inner_t;

create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner_create(
    create_fine_tuning_job_request_integrations_inner_type_t *type,
    create_fine_tuning_job_request_integrations_inner_wandb_t *wandb
);

void create_fine_tuning_job_request_integrations_inner_free(create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner);

create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner_parseFromJSON(cJSON *create_fine_tuning_job_request_integrations_innerJSON);

cJSON *create_fine_tuning_job_request_integrations_inner_convertToJSON(create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner);

#endif /* _create_fine_tuning_job_request_integrations_inner_H_ */

