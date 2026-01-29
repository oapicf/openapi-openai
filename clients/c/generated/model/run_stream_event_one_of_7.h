/*
 * run_stream_event_one_of_7.h
 *
 * Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
 */

#ifndef _run_stream_event_one_of_7_H_
#define _run_stream_event_one_of_7_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_stream_event_one_of_7_t run_stream_event_one_of_7_t;

#include "run_object.h"

// Enum EVENT for run_stream_event_one_of_7

typedef enum  { openai_api_run_stream_event_one_of_7_EVENT_NULL = 0, openai_api_run_stream_event_one_of_7_EVENT_thread.run.cancelled } openai_api_run_stream_event_one_of_7_EVENT_e;

char* run_stream_event_one_of_7_event_ToString(openai_api_run_stream_event_one_of_7_EVENT_e event);

openai_api_run_stream_event_one_of_7_EVENT_e run_stream_event_one_of_7_event_FromString(char* event);



typedef struct run_stream_event_one_of_7_t {
    openai_api_run_stream_event_one_of_7_EVENT_e event; //enum
    struct run_object_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} run_stream_event_one_of_7_t;

__attribute__((deprecated)) run_stream_event_one_of_7_t *run_stream_event_one_of_7_create(
    openai_api_run_stream_event_one_of_7_EVENT_e event,
    run_object_t *data
);

void run_stream_event_one_of_7_free(run_stream_event_one_of_7_t *run_stream_event_one_of_7);

run_stream_event_one_of_7_t *run_stream_event_one_of_7_parseFromJSON(cJSON *run_stream_event_one_of_7JSON);

cJSON *run_stream_event_one_of_7_convertToJSON(run_stream_event_one_of_7_t *run_stream_event_one_of_7);

#endif /* _run_stream_event_one_of_7_H_ */

