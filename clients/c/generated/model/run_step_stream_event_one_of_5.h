/*
 * run_step_stream_event_one_of_5.h
 *
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.
 */

#ifndef _run_step_stream_event_one_of_5_H_
#define _run_step_stream_event_one_of_5_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_stream_event_one_of_5_t run_step_stream_event_one_of_5_t;

#include "run_step_object.h"

// Enum EVENT for run_step_stream_event_one_of_5

typedef enum  { openai_api_run_step_stream_event_one_of_5_EVENT_NULL = 0, openai_api_run_step_stream_event_one_of_5_EVENT_thread.run.step.cancelled } openai_api_run_step_stream_event_one_of_5_EVENT_e;

char* run_step_stream_event_one_of_5_event_ToString(openai_api_run_step_stream_event_one_of_5_EVENT_e event);

openai_api_run_step_stream_event_one_of_5_EVENT_e run_step_stream_event_one_of_5_event_FromString(char* event);



typedef struct run_step_stream_event_one_of_5_t {
    openai_api_run_step_stream_event_one_of_5_EVENT_e event; //enum
    struct run_step_object_t *data; //model

} run_step_stream_event_one_of_5_t;

run_step_stream_event_one_of_5_t *run_step_stream_event_one_of_5_create(
    openai_api_run_step_stream_event_one_of_5_EVENT_e event,
    run_step_object_t *data
);

void run_step_stream_event_one_of_5_free(run_step_stream_event_one_of_5_t *run_step_stream_event_one_of_5);

run_step_stream_event_one_of_5_t *run_step_stream_event_one_of_5_parseFromJSON(cJSON *run_step_stream_event_one_of_5JSON);

cJSON *run_step_stream_event_one_of_5_convertToJSON(run_step_stream_event_one_of_5_t *run_step_stream_event_one_of_5);

#endif /* _run_step_stream_event_one_of_5_H_ */

