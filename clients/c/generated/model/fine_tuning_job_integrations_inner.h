/*
 * fine_tuning_job_integrations_inner.h
 *
 * 
 */

#ifndef _fine_tuning_job_integrations_inner_H_
#define _fine_tuning_job_integrations_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tuning_job_integrations_inner_t fine_tuning_job_integrations_inner_t;

#include "create_fine_tuning_job_request_integrations_inner_wandb.h"
#include "fine_tuning_integration.h"

// Enum TYPE for fine_tuning_job_integrations_inner

typedef enum  { openai_api_fine_tuning_job_integrations_inner_TYPE_NULL = 0, openai_api_fine_tuning_job_integrations_inner_TYPE_wandb } openai_api_fine_tuning_job_integrations_inner_TYPE_e;

char* fine_tuning_job_integrations_inner_type_ToString(openai_api_fine_tuning_job_integrations_inner_TYPE_e type);

openai_api_fine_tuning_job_integrations_inner_TYPE_e fine_tuning_job_integrations_inner_type_FromString(char* type);



typedef struct fine_tuning_job_integrations_inner_t {
    openai_api_fine_tuning_job_integrations_inner_TYPE_e type; //enum
    struct create_fine_tuning_job_request_integrations_inner_wandb_t *wandb; //model

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tuning_job_integrations_inner_t;

__attribute__((deprecated)) fine_tuning_job_integrations_inner_t *fine_tuning_job_integrations_inner_create(
    openai_api_fine_tuning_job_integrations_inner_TYPE_e type,
    create_fine_tuning_job_request_integrations_inner_wandb_t *wandb
);

void fine_tuning_job_integrations_inner_free(fine_tuning_job_integrations_inner_t *fine_tuning_job_integrations_inner);

fine_tuning_job_integrations_inner_t *fine_tuning_job_integrations_inner_parseFromJSON(cJSON *fine_tuning_job_integrations_innerJSON);

cJSON *fine_tuning_job_integrations_inner_convertToJSON(fine_tuning_job_integrations_inner_t *fine_tuning_job_integrations_inner);

#endif /* _fine_tuning_job_integrations_inner_H_ */

