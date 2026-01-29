/*
 * fine_tuning_integration.h
 *
 * 
 */

#ifndef _fine_tuning_integration_H_
#define _fine_tuning_integration_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tuning_integration_t fine_tuning_integration_t;

#include "create_fine_tuning_job_request_integrations_inner_wandb.h"

// Enum TYPE for fine_tuning_integration

typedef enum  { openai_api_fine_tuning_integration_TYPE_NULL = 0, openai_api_fine_tuning_integration_TYPE_wandb } openai_api_fine_tuning_integration_TYPE_e;

char* fine_tuning_integration_type_ToString(openai_api_fine_tuning_integration_TYPE_e type);

openai_api_fine_tuning_integration_TYPE_e fine_tuning_integration_type_FromString(char* type);



typedef struct fine_tuning_integration_t {
    openai_api_fine_tuning_integration_TYPE_e type; //enum
    struct create_fine_tuning_job_request_integrations_inner_wandb_t *wandb; //model

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tuning_integration_t;

__attribute__((deprecated)) fine_tuning_integration_t *fine_tuning_integration_create(
    openai_api_fine_tuning_integration_TYPE_e type,
    create_fine_tuning_job_request_integrations_inner_wandb_t *wandb
);

void fine_tuning_integration_free(fine_tuning_integration_t *fine_tuning_integration);

fine_tuning_integration_t *fine_tuning_integration_parseFromJSON(cJSON *fine_tuning_integrationJSON);

cJSON *fine_tuning_integration_convertToJSON(fine_tuning_integration_t *fine_tuning_integration);

#endif /* _fine_tuning_integration_H_ */

