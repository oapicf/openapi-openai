/*
 * run_step_delta_step_details_message_creation_object.h
 *
 * Details of the message creation by the run step.
 */

#ifndef _run_step_delta_step_details_message_creation_object_H_
#define _run_step_delta_step_details_message_creation_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_delta_step_details_message_creation_object_t run_step_delta_step_details_message_creation_object_t;

#include "run_step_delta_step_details_message_creation_object_message_creation.h"

// Enum TYPE for run_step_delta_step_details_message_creation_object

typedef enum  { openai_api_run_step_delta_step_details_message_creation_object_TYPE_NULL = 0, openai_api_run_step_delta_step_details_message_creation_object_TYPE_message_creation } openai_api_run_step_delta_step_details_message_creation_object_TYPE_e;

char* run_step_delta_step_details_message_creation_object_type_ToString(openai_api_run_step_delta_step_details_message_creation_object_TYPE_e type);

openai_api_run_step_delta_step_details_message_creation_object_TYPE_e run_step_delta_step_details_message_creation_object_type_FromString(char* type);



typedef struct run_step_delta_step_details_message_creation_object_t {
    openai_api_run_step_delta_step_details_message_creation_object_TYPE_e type; //enum
    struct run_step_delta_step_details_message_creation_object_message_creation_t *message_creation; //model

} run_step_delta_step_details_message_creation_object_t;

run_step_delta_step_details_message_creation_object_t *run_step_delta_step_details_message_creation_object_create(
    openai_api_run_step_delta_step_details_message_creation_object_TYPE_e type,
    run_step_delta_step_details_message_creation_object_message_creation_t *message_creation
);

void run_step_delta_step_details_message_creation_object_free(run_step_delta_step_details_message_creation_object_t *run_step_delta_step_details_message_creation_object);

run_step_delta_step_details_message_creation_object_t *run_step_delta_step_details_message_creation_object_parseFromJSON(cJSON *run_step_delta_step_details_message_creation_objectJSON);

cJSON *run_step_delta_step_details_message_creation_object_convertToJSON(run_step_delta_step_details_message_creation_object_t *run_step_delta_step_details_message_creation_object);

#endif /* _run_step_delta_step_details_message_creation_object_H_ */

