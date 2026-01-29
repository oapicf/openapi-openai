/*
 * run_step_object_step_details.h
 *
 * The details of the run step.
 */

#ifndef _run_step_object_step_details_H_
#define _run_step_object_step_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_object_step_details_t run_step_object_step_details_t;

#include "run_step_details_message_creation_object.h"
#include "run_step_details_message_creation_object_message_creation.h"
#include "run_step_details_tool_calls_object.h"
#include "run_step_details_tool_calls_object_tool_calls_inner.h"

// Enum TYPE for run_step_object_step_details

typedef enum  { openai_api_run_step_object_step_details_TYPE_NULL = 0, openai_api_run_step_object_step_details_TYPE_message_creation, openai_api_run_step_object_step_details_TYPE_tool_calls } openai_api_run_step_object_step_details_TYPE_e;

char* run_step_object_step_details_type_ToString(openai_api_run_step_object_step_details_TYPE_e type);

openai_api_run_step_object_step_details_TYPE_e run_step_object_step_details_type_FromString(char* type);



typedef struct run_step_object_step_details_t {
    openai_api_run_step_object_step_details_TYPE_e type; //enum
    struct run_step_details_message_creation_object_message_creation_t *message_creation; //model
    list_t *tool_calls; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} run_step_object_step_details_t;

__attribute__((deprecated)) run_step_object_step_details_t *run_step_object_step_details_create(
    openai_api_run_step_object_step_details_TYPE_e type,
    run_step_details_message_creation_object_message_creation_t *message_creation,
    list_t *tool_calls
);

void run_step_object_step_details_free(run_step_object_step_details_t *run_step_object_step_details);

run_step_object_step_details_t *run_step_object_step_details_parseFromJSON(cJSON *run_step_object_step_detailsJSON);

cJSON *run_step_object_step_details_convertToJSON(run_step_object_step_details_t *run_step_object_step_details);

#endif /* _run_step_object_step_details_H_ */

