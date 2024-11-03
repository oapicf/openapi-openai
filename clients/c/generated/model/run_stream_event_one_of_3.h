/*
 * run_stream_event_one_of_3.h
 *
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;requires_action&#x60; status.
 */

#ifndef _run_stream_event_one_of_3_H_
#define _run_stream_event_one_of_3_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_stream_event_one_of_3_t run_stream_event_one_of_3_t;

#include "run_object.h"

// Enum EVENT for run_stream_event_one_of_3

typedef enum  { openai_api_run_stream_event_one_of_3_EVENT_NULL = 0, openai_api_run_stream_event_one_of_3_EVENT_thread.run.requires_action } openai_api_run_stream_event_one_of_3_EVENT_e;

char* run_stream_event_one_of_3_event_ToString(openai_api_run_stream_event_one_of_3_EVENT_e event);

openai_api_run_stream_event_one_of_3_EVENT_e run_stream_event_one_of_3_event_FromString(char* event);



typedef struct run_stream_event_one_of_3_t {
    openai_api_run_stream_event_one_of_3_EVENT_e event; //enum
    struct run_object_t *data; //model

} run_stream_event_one_of_3_t;

run_stream_event_one_of_3_t *run_stream_event_one_of_3_create(
    openai_api_run_stream_event_one_of_3_EVENT_e event,
    run_object_t *data
);

void run_stream_event_one_of_3_free(run_stream_event_one_of_3_t *run_stream_event_one_of_3);

run_stream_event_one_of_3_t *run_stream_event_one_of_3_parseFromJSON(cJSON *run_stream_event_one_of_3JSON);

cJSON *run_stream_event_one_of_3_convertToJSON(run_stream_event_one_of_3_t *run_stream_event_one_of_3);

#endif /* _run_stream_event_one_of_3_H_ */

