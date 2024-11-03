/*
 * run_stream_event_one_of_1.h
 *
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;queued&#x60; status.
 */

#ifndef _run_stream_event_one_of_1_H_
#define _run_stream_event_one_of_1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_stream_event_one_of_1_t run_stream_event_one_of_1_t;

#include "run_object.h"

// Enum EVENT for run_stream_event_one_of_1

typedef enum  { openai_api_run_stream_event_one_of_1_EVENT_NULL = 0, openai_api_run_stream_event_one_of_1_EVENT_thread.run.queued } openai_api_run_stream_event_one_of_1_EVENT_e;

char* run_stream_event_one_of_1_event_ToString(openai_api_run_stream_event_one_of_1_EVENT_e event);

openai_api_run_stream_event_one_of_1_EVENT_e run_stream_event_one_of_1_event_FromString(char* event);



typedef struct run_stream_event_one_of_1_t {
    openai_api_run_stream_event_one_of_1_EVENT_e event; //enum
    struct run_object_t *data; //model

} run_stream_event_one_of_1_t;

run_stream_event_one_of_1_t *run_stream_event_one_of_1_create(
    openai_api_run_stream_event_one_of_1_EVENT_e event,
    run_object_t *data
);

void run_stream_event_one_of_1_free(run_stream_event_one_of_1_t *run_stream_event_one_of_1);

run_stream_event_one_of_1_t *run_stream_event_one_of_1_parseFromJSON(cJSON *run_stream_event_one_of_1JSON);

cJSON *run_stream_event_one_of_1_convertToJSON(run_stream_event_one_of_1_t *run_stream_event_one_of_1);

#endif /* _run_stream_event_one_of_1_H_ */

