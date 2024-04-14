/*
 * run_step_stream_event_one_of_3.h
 *
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.
 */

#ifndef _run_step_stream_event_one_of_3_H_
#define _run_step_stream_event_one_of_3_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_stream_event_one_of_3_t run_step_stream_event_one_of_3_t;

#include "run_step_object.h"

// Enum EVENT for run_step_stream_event_one_of_3

typedef enum  { openai_api_run_step_stream_event_one_of_3_EVENT_NULL = 0, openai_api_run_step_stream_event_one_of_3_EVENT_thread.run.step.completed } openai_api_run_step_stream_event_one_of_3_EVENT_e;

char* run_step_stream_event_one_of_3_event_ToString(openai_api_run_step_stream_event_one_of_3_EVENT_e event);

openai_api_run_step_stream_event_one_of_3_EVENT_e run_step_stream_event_one_of_3_event_FromString(char* event);



typedef struct run_step_stream_event_one_of_3_t {
    openai_api_run_step_stream_event_one_of_3_EVENT_e event; //enum
    struct run_step_object_t *data; //model

} run_step_stream_event_one_of_3_t;

run_step_stream_event_one_of_3_t *run_step_stream_event_one_of_3_create(
    openai_api_run_step_stream_event_one_of_3_EVENT_e event,
    run_step_object_t *data
);

void run_step_stream_event_one_of_3_free(run_step_stream_event_one_of_3_t *run_step_stream_event_one_of_3);

run_step_stream_event_one_of_3_t *run_step_stream_event_one_of_3_parseFromJSON(cJSON *run_step_stream_event_one_of_3JSON);

cJSON *run_step_stream_event_one_of_3_convertToJSON(run_step_stream_event_one_of_3_t *run_step_stream_event_one_of_3);

#endif /* _run_step_stream_event_one_of_3_H_ */

