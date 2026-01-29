/*
 * run_step_stream_event.h
 *
 * 
 */

#ifndef _run_step_stream_event_H_
#define _run_step_stream_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_stream_event_t run_step_stream_event_t;

#include "run_step_object.h"
#include "run_step_stream_event_one_of.h"
#include "run_step_stream_event_one_of_1.h"
#include "run_step_stream_event_one_of_2.h"
#include "run_step_stream_event_one_of_3.h"
#include "run_step_stream_event_one_of_4.h"
#include "run_step_stream_event_one_of_5.h"
#include "run_step_stream_event_one_of_6.h"

// Enum EVENT for run_step_stream_event

typedef enum  { openai_api_run_step_stream_event_EVENT_NULL = 0, openai_api_run_step_stream_event_EVENT_thread.run.step.expired } openai_api_run_step_stream_event_EVENT_e;

char* run_step_stream_event_event_ToString(openai_api_run_step_stream_event_EVENT_e event);

openai_api_run_step_stream_event_EVENT_e run_step_stream_event_event_FromString(char* event);



typedef struct run_step_stream_event_t {
    openai_api_run_step_stream_event_EVENT_e event; //enum
    struct run_step_object_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} run_step_stream_event_t;

__attribute__((deprecated)) run_step_stream_event_t *run_step_stream_event_create(
    openai_api_run_step_stream_event_EVENT_e event,
    run_step_object_t *data
);

void run_step_stream_event_free(run_step_stream_event_t *run_step_stream_event);

run_step_stream_event_t *run_step_stream_event_parseFromJSON(cJSON *run_step_stream_eventJSON);

cJSON *run_step_stream_event_convertToJSON(run_step_stream_event_t *run_step_stream_event);

#endif /* _run_step_stream_event_H_ */

