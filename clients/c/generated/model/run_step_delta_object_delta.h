/*
 * run_step_delta_object_delta.h
 *
 * The delta containing the fields that have changed on the run step.
 */

#ifndef _run_step_delta_object_delta_H_
#define _run_step_delta_object_delta_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_delta_object_delta_t run_step_delta_object_delta_t;

#include "run_step_delta_object_delta_step_details.h"



typedef struct run_step_delta_object_delta_t {
    struct run_step_delta_object_delta_step_details_t *step_details; //model

} run_step_delta_object_delta_t;

run_step_delta_object_delta_t *run_step_delta_object_delta_create(
    run_step_delta_object_delta_step_details_t *step_details
);

void run_step_delta_object_delta_free(run_step_delta_object_delta_t *run_step_delta_object_delta);

run_step_delta_object_delta_t *run_step_delta_object_delta_parseFromJSON(cJSON *run_step_delta_object_deltaJSON);

cJSON *run_step_delta_object_delta_convertToJSON(run_step_delta_object_delta_t *run_step_delta_object_delta);

#endif /* _run_step_delta_object_delta_H_ */

