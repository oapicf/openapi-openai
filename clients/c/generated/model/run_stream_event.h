/*
 * run_stream_event.h
 *
 * 
 */

#ifndef _run_stream_event_H_
#define _run_stream_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_stream_event_t run_stream_event_t;

#include "run_object.h"
#include "run_stream_event_one_of.h"
#include "run_stream_event_one_of_1.h"
#include "run_stream_event_one_of_2.h"
#include "run_stream_event_one_of_3.h"
#include "run_stream_event_one_of_4.h"
#include "run_stream_event_one_of_5.h"
#include "run_stream_event_one_of_6.h"
#include "run_stream_event_one_of_7.h"
#include "run_stream_event_one_of_8.h"
#include "run_stream_event_one_of_9.h"

// Enum EVENT for run_stream_event

typedef enum  { openai_api_run_stream_event_EVENT_NULL = 0, openai_api_run_stream_event_EVENT_thread.run.expired } openai_api_run_stream_event_EVENT_e;

char* run_stream_event_event_ToString(openai_api_run_stream_event_EVENT_e event);

openai_api_run_stream_event_EVENT_e run_stream_event_event_FromString(char* event);



typedef struct run_stream_event_t {
    openai_api_run_stream_event_EVENT_e event; //enum
    struct run_object_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} run_stream_event_t;

__attribute__((deprecated)) run_stream_event_t *run_stream_event_create(
    openai_api_run_stream_event_EVENT_e event,
    run_object_t *data
);

void run_stream_event_free(run_stream_event_t *run_stream_event);

run_stream_event_t *run_stream_event_parseFromJSON(cJSON *run_stream_eventJSON);

cJSON *run_stream_event_convertToJSON(run_stream_event_t *run_stream_event);

#endif /* _run_stream_event_H_ */

