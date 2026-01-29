/*
 * run_stream_event_one_of_6.h
 *
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;cancelling&#x60; status.
 */

#ifndef _run_stream_event_one_of_6_H_
#define _run_stream_event_one_of_6_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_stream_event_one_of_6_t run_stream_event_one_of_6_t;

#include "run_object.h"

// Enum EVENT for run_stream_event_one_of_6

typedef enum  { openai_api_run_stream_event_one_of_6_EVENT_NULL = 0, openai_api_run_stream_event_one_of_6_EVENT_thread.run.cancelling } openai_api_run_stream_event_one_of_6_EVENT_e;

char* run_stream_event_one_of_6_event_ToString(openai_api_run_stream_event_one_of_6_EVENT_e event);

openai_api_run_stream_event_one_of_6_EVENT_e run_stream_event_one_of_6_event_FromString(char* event);



typedef struct run_stream_event_one_of_6_t {
    openai_api_run_stream_event_one_of_6_EVENT_e event; //enum
    struct run_object_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} run_stream_event_one_of_6_t;

__attribute__((deprecated)) run_stream_event_one_of_6_t *run_stream_event_one_of_6_create(
    openai_api_run_stream_event_one_of_6_EVENT_e event,
    run_object_t *data
);

void run_stream_event_one_of_6_free(run_stream_event_one_of_6_t *run_stream_event_one_of_6);

run_stream_event_one_of_6_t *run_stream_event_one_of_6_parseFromJSON(cJSON *run_stream_event_one_of_6JSON);

cJSON *run_stream_event_one_of_6_convertToJSON(run_stream_event_one_of_6_t *run_stream_event_one_of_6);

#endif /* _run_stream_event_one_of_6_H_ */

