/*
 * thread_stream_event.h
 *
 * 
 */

#ifndef _thread_stream_event_H_
#define _thread_stream_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct thread_stream_event_t thread_stream_event_t;

#include "thread_object.h"
#include "thread_stream_event_one_of.h"

// Enum EVENT for thread_stream_event

typedef enum  { openai_api_thread_stream_event_EVENT_NULL = 0, openai_api_thread_stream_event_EVENT_thread.created } openai_api_thread_stream_event_EVENT_e;

char* thread_stream_event_event_ToString(openai_api_thread_stream_event_EVENT_e event);

openai_api_thread_stream_event_EVENT_e thread_stream_event_event_FromString(char* event);



typedef struct thread_stream_event_t {
    openai_api_thread_stream_event_EVENT_e event; //enum
    struct thread_object_t *data; //model

} thread_stream_event_t;

thread_stream_event_t *thread_stream_event_create(
    openai_api_thread_stream_event_EVENT_e event,
    thread_object_t *data
);

void thread_stream_event_free(thread_stream_event_t *thread_stream_event);

thread_stream_event_t *thread_stream_event_parseFromJSON(cJSON *thread_stream_eventJSON);

cJSON *thread_stream_event_convertToJSON(thread_stream_event_t *thread_stream_event);

#endif /* _thread_stream_event_H_ */

