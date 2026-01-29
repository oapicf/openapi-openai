/*
 * create_fine_tuning_job_request_integrations_inner_wandb.h
 *
 * The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 
 */

#ifndef _create_fine_tuning_job_request_integrations_inner_wandb_H_
#define _create_fine_tuning_job_request_integrations_inner_wandb_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_fine_tuning_job_request_integrations_inner_wandb_t create_fine_tuning_job_request_integrations_inner_wandb_t;




typedef struct create_fine_tuning_job_request_integrations_inner_wandb_t {
    char *project; // string
    char *name; // string
    char *entity; // string
    list_t *tags; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} create_fine_tuning_job_request_integrations_inner_wandb_t;

__attribute__((deprecated)) create_fine_tuning_job_request_integrations_inner_wandb_t *create_fine_tuning_job_request_integrations_inner_wandb_create(
    char *project,
    char *name,
    char *entity,
    list_t *tags
);

void create_fine_tuning_job_request_integrations_inner_wandb_free(create_fine_tuning_job_request_integrations_inner_wandb_t *create_fine_tuning_job_request_integrations_inner_wandb);

create_fine_tuning_job_request_integrations_inner_wandb_t *create_fine_tuning_job_request_integrations_inner_wandb_parseFromJSON(cJSON *create_fine_tuning_job_request_integrations_inner_wandbJSON);

cJSON *create_fine_tuning_job_request_integrations_inner_wandb_convertToJSON(create_fine_tuning_job_request_integrations_inner_wandb_t *create_fine_tuning_job_request_integrations_inner_wandb);

#endif /* _create_fine_tuning_job_request_integrations_inner_wandb_H_ */

