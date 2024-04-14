/*
 * run_step_stream_event_one_of_2.h
 *
 * Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
 */

#ifndef _run_step_stream_event_one_of_2_H_
#define _run_step_stream_event_one_of_2_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_stream_event_one_of_2_t run_step_stream_event_one_of_2_t;

#include "run_step_delta_object.h"

// Enum EVENT for run_step_stream_event_one_of_2

typedef enum  { openai_api_run_step_stream_event_one_of_2_EVENT_NULL = 0, openai_api_run_step_stream_event_one_of_2_EVENT_thread.run.step.delta } openai_api_run_step_stream_event_one_of_2_EVENT_e;

char* run_step_stream_event_one_of_2_event_ToString(openai_api_run_step_stream_event_one_of_2_EVENT_e event);

openai_api_run_step_stream_event_one_of_2_EVENT_e run_step_stream_event_one_of_2_event_FromString(char* event);



typedef struct run_step_stream_event_one_of_2_t {
    openai_api_run_step_stream_event_one_of_2_EVENT_e event; //enum
    struct run_step_delta_object_t *data; //model

} run_step_stream_event_one_of_2_t;

run_step_stream_event_one_of_2_t *run_step_stream_event_one_of_2_create(
    openai_api_run_step_stream_event_one_of_2_EVENT_e event,
    run_step_delta_object_t *data
);

void run_step_stream_event_one_of_2_free(run_step_stream_event_one_of_2_t *run_step_stream_event_one_of_2);

run_step_stream_event_one_of_2_t *run_step_stream_event_one_of_2_parseFromJSON(cJSON *run_step_stream_event_one_of_2JSON);

cJSON *run_step_stream_event_one_of_2_convertToJSON(run_step_stream_event_one_of_2_t *run_step_stream_event_one_of_2);

#endif /* _run_step_stream_event_one_of_2_H_ */

