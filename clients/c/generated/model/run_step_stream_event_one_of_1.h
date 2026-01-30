/*
 * run_step_stream_event_one_of_1.h
 *
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) moves to an &#x60;in_progress&#x60; state.
 */

#ifndef _run_step_stream_event_one_of_1_H_
#define _run_step_stream_event_one_of_1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_stream_event_one_of_1_t run_step_stream_event_one_of_1_t;

#include "run_step_object.h"

// Enum EVENT for run_step_stream_event_one_of_1

typedef enum  { openai_api_run_step_stream_event_one_of_1_EVENT_NULL = 0, openai_api_run_step_stream_event_one_of_1_EVENT_thread.run.step.in_progress } openai_api_run_step_stream_event_one_of_1_EVENT_e;

char* run_step_stream_event_one_of_1_event_ToString(openai_api_run_step_stream_event_one_of_1_EVENT_e event);

openai_api_run_step_stream_event_one_of_1_EVENT_e run_step_stream_event_one_of_1_event_FromString(char* event);



typedef struct run_step_stream_event_one_of_1_t {
    openai_api_run_step_stream_event_one_of_1_EVENT_e event; //enum
    struct run_step_object_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} run_step_stream_event_one_of_1_t;

__attribute__((deprecated)) run_step_stream_event_one_of_1_t *run_step_stream_event_one_of_1_create(
    openai_api_run_step_stream_event_one_of_1_EVENT_e event,
    run_step_object_t *data
);

void run_step_stream_event_one_of_1_free(run_step_stream_event_one_of_1_t *run_step_stream_event_one_of_1);

run_step_stream_event_one_of_1_t *run_step_stream_event_one_of_1_parseFromJSON(cJSON *run_step_stream_event_one_of_1JSON);

cJSON *run_step_stream_event_one_of_1_convertToJSON(run_step_stream_event_one_of_1_t *run_step_stream_event_one_of_1);

#endif /* _run_step_stream_event_one_of_1_H_ */

