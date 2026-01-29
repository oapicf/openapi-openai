/*
 * run_stream_event_one_of.h
 *
 * Occurs when a new [run](/docs/api-reference/runs/object) is created.
 */

#ifndef _run_stream_event_one_of_H_
#define _run_stream_event_one_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_stream_event_one_of_t run_stream_event_one_of_t;

#include "run_object.h"

// Enum EVENT for run_stream_event_one_of

typedef enum  { openai_api_run_stream_event_one_of_EVENT_NULL = 0, openai_api_run_stream_event_one_of_EVENT_thread.run.created } openai_api_run_stream_event_one_of_EVENT_e;

char* run_stream_event_one_of_event_ToString(openai_api_run_stream_event_one_of_EVENT_e event);

openai_api_run_stream_event_one_of_EVENT_e run_stream_event_one_of_event_FromString(char* event);



typedef struct run_stream_event_one_of_t {
    openai_api_run_stream_event_one_of_EVENT_e event; //enum
    struct run_object_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} run_stream_event_one_of_t;

__attribute__((deprecated)) run_stream_event_one_of_t *run_stream_event_one_of_create(
    openai_api_run_stream_event_one_of_EVENT_e event,
    run_object_t *data
);

void run_stream_event_one_of_free(run_stream_event_one_of_t *run_stream_event_one_of);

run_stream_event_one_of_t *run_stream_event_one_of_parseFromJSON(cJSON *run_stream_event_one_ofJSON);

cJSON *run_stream_event_one_of_convertToJSON(run_stream_event_one_of_t *run_stream_event_one_of);

#endif /* _run_stream_event_one_of_H_ */

