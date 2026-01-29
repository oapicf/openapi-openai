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

#include "create_fine_tuning_job_request_integrations_inner_wandb.h"

// Enum TYPE for create_fine_tuning_job_request_integrations_inner

typedef enum  { openai_api_create_fine_tuning_job_request_integrations_inner_TYPE_NULL = 0, openai_api_create_fine_tuning_job_request_integrations_inner_TYPE_wandb } openai_api_create_fine_tuning_job_request_integrations_inner_TYPE_e;

char* create_fine_tuning_job_request_integrations_inner_type_ToString(openai_api_create_fine_tuning_job_request_integrations_inner_TYPE_e type);

openai_api_create_fine_tuning_job_request_integrations_inner_TYPE_e create_fine_tuning_job_request_integrations_inner_type_FromString(char* type);



typedef struct create_fine_tuning_job_request_integrations_inner_t {
    openai_api_create_fine_tuning_job_request_integrations_inner_TYPE_e type; //enum
    struct create_fine_tuning_job_request_integrations_inner_wandb_t *wandb; //model

    int _library_owned; // Is the library responsible for freeing this object?
} create_fine_tuning_job_request_integrations_inner_t;

__attribute__((deprecated)) create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner_create(
    openai_api_create_fine_tuning_job_request_integrations_inner_TYPE_e type,
    create_fine_tuning_job_request_integrations_inner_wandb_t *wandb
);

void create_fine_tuning_job_request_integrations_inner_free(create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner);

create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner_parseFromJSON(cJSON *create_fine_tuning_job_request_integrations_innerJSON);

cJSON *create_fine_tuning_job_request_integrations_inner_convertToJSON(create_fine_tuning_job_request_integrations_inner_t *create_fine_tuning_job_request_integrations_inner);

#endif /* _create_fine_tuning_job_request_integrations_inner_H_ */

