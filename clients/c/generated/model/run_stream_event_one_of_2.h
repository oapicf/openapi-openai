/*
 * run_stream_event_one_of_2.h
 *
 * Occurs when a [run](/docs/api-reference/runs/object) moves to an &#x60;in_progress&#x60; status.
 */

#ifndef _run_stream_event_one_of_2_H_
#define _run_stream_event_one_of_2_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_stream_event_one_of_2_t run_stream_event_one_of_2_t;

#include "run_object.h"

// Enum EVENT for run_stream_event_one_of_2

typedef enum  { openai_api_run_stream_event_one_of_2_EVENT_NULL = 0, openai_api_run_stream_event_one_of_2_EVENT_thread.run.in_progress } openai_api_run_stream_event_one_of_2_EVENT_e;

char* run_stream_event_one_of_2_event_ToString(openai_api_run_stream_event_one_of_2_EVENT_e event);

openai_api_run_stream_event_one_of_2_EVENT_e run_stream_event_one_of_2_event_FromString(char* event);



typedef struct run_stream_event_one_of_2_t {
    openai_api_run_stream_event_one_of_2_EVENT_e event; //enum
    struct run_object_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} run_stream_event_one_of_2_t;

__attribute__((deprecated)) run_stream_event_one_of_2_t *run_stream_event_one_of_2_create(
    openai_api_run_stream_event_one_of_2_EVENT_e event,
    run_object_t *data
);

void run_stream_event_one_of_2_free(run_stream_event_one_of_2_t *run_stream_event_one_of_2);

run_stream_event_one_of_2_t *run_stream_event_one_of_2_parseFromJSON(cJSON *run_stream_event_one_of_2JSON);

cJSON *run_stream_event_one_of_2_convertToJSON(run_stream_event_one_of_2_t *run_stream_event_one_of_2);

#endif /* _run_stream_event_one_of_2_H_ */

