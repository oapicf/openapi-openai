/*
 * run_step_stream_event_one_of_4.h
 *
 * Occurs when a [run step](/docs/api-reference/runs/step-object) fails.
 */

#ifndef _run_step_stream_event_one_of_4_H_
#define _run_step_stream_event_one_of_4_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_stream_event_one_of_4_t run_step_stream_event_one_of_4_t;

#include "run_step_object.h"

// Enum EVENT for run_step_stream_event_one_of_4

typedef enum  { openai_api_run_step_stream_event_one_of_4_EVENT_NULL = 0, openai_api_run_step_stream_event_one_of_4_EVENT_thread.run.step.failed } openai_api_run_step_stream_event_one_of_4_EVENT_e;

char* run_step_stream_event_one_of_4_event_ToString(openai_api_run_step_stream_event_one_of_4_EVENT_e event);

openai_api_run_step_stream_event_one_of_4_EVENT_e run_step_stream_event_one_of_4_event_FromString(char* event);



typedef struct run_step_stream_event_one_of_4_t {
    openai_api_run_step_stream_event_one_of_4_EVENT_e event; //enum
    struct run_step_object_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} run_step_stream_event_one_of_4_t;

__attribute__((deprecated)) run_step_stream_event_one_of_4_t *run_step_stream_event_one_of_4_create(
    openai_api_run_step_stream_event_one_of_4_EVENT_e event,
    run_step_object_t *data
);

void run_step_stream_event_one_of_4_free(run_step_stream_event_one_of_4_t *run_step_stream_event_one_of_4);

run_step_stream_event_one_of_4_t *run_step_stream_event_one_of_4_parseFromJSON(cJSON *run_step_stream_event_one_of_4JSON);

cJSON *run_step_stream_event_one_of_4_convertToJSON(run_step_stream_event_one_of_4_t *run_step_stream_event_one_of_4);

#endif /* _run_step_stream_event_one_of_4_H_ */

