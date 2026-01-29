/*
 * run_step_stream_event_one_of_6.h
 *
 * Occurs when a [run step](/docs/api-reference/runs/step-object) expires.
 */

#ifndef _run_step_stream_event_one_of_6_H_
#define _run_step_stream_event_one_of_6_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_stream_event_one_of_6_t run_step_stream_event_one_of_6_t;

#include "run_step_object.h"

// Enum EVENT for run_step_stream_event_one_of_6

typedef enum  { openai_api_run_step_stream_event_one_of_6_EVENT_NULL = 0, openai_api_run_step_stream_event_one_of_6_EVENT_thread.run.step.expired } openai_api_run_step_stream_event_one_of_6_EVENT_e;

char* run_step_stream_event_one_of_6_event_ToString(openai_api_run_step_stream_event_one_of_6_EVENT_e event);

openai_api_run_step_stream_event_one_of_6_EVENT_e run_step_stream_event_one_of_6_event_FromString(char* event);



typedef struct run_step_stream_event_one_of_6_t {
    openai_api_run_step_stream_event_one_of_6_EVENT_e event; //enum
    struct run_step_object_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} run_step_stream_event_one_of_6_t;

__attribute__((deprecated)) run_step_stream_event_one_of_6_t *run_step_stream_event_one_of_6_create(
    openai_api_run_step_stream_event_one_of_6_EVENT_e event,
    run_step_object_t *data
);

void run_step_stream_event_one_of_6_free(run_step_stream_event_one_of_6_t *run_step_stream_event_one_of_6);

run_step_stream_event_one_of_6_t *run_step_stream_event_one_of_6_parseFromJSON(cJSON *run_step_stream_event_one_of_6JSON);

cJSON *run_step_stream_event_one_of_6_convertToJSON(run_step_stream_event_one_of_6_t *run_step_stream_event_one_of_6);

#endif /* _run_step_stream_event_one_of_6_H_ */

