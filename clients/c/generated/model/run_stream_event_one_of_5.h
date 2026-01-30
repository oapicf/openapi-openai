/*
 * run_stream_event_one_of_5.h
 *
 * Occurs when a [run](/docs/api-reference/runs/object) ends with status &#x60;incomplete&#x60;.
 */

#ifndef _run_stream_event_one_of_5_H_
#define _run_stream_event_one_of_5_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_stream_event_one_of_5_t run_stream_event_one_of_5_t;

#include "run_object.h"

// Enum EVENT for run_stream_event_one_of_5

typedef enum  { openai_api_run_stream_event_one_of_5_EVENT_NULL = 0, openai_api_run_stream_event_one_of_5_EVENT_thread.run.incomplete } openai_api_run_stream_event_one_of_5_EVENT_e;

char* run_stream_event_one_of_5_event_ToString(openai_api_run_stream_event_one_of_5_EVENT_e event);

openai_api_run_stream_event_one_of_5_EVENT_e run_stream_event_one_of_5_event_FromString(char* event);



typedef struct run_stream_event_one_of_5_t {
    openai_api_run_stream_event_one_of_5_EVENT_e event; //enum
    struct run_object_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} run_stream_event_one_of_5_t;

__attribute__((deprecated)) run_stream_event_one_of_5_t *run_stream_event_one_of_5_create(
    openai_api_run_stream_event_one_of_5_EVENT_e event,
    run_object_t *data
);

void run_stream_event_one_of_5_free(run_stream_event_one_of_5_t *run_stream_event_one_of_5);

run_stream_event_one_of_5_t *run_stream_event_one_of_5_parseFromJSON(cJSON *run_stream_event_one_of_5JSON);

cJSON *run_stream_event_one_of_5_convertToJSON(run_stream_event_one_of_5_t *run_stream_event_one_of_5);

#endif /* _run_stream_event_one_of_5_H_ */

