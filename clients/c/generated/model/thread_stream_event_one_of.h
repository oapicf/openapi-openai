/*
 * thread_stream_event_one_of.h
 *
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 */

#ifndef _thread_stream_event_one_of_H_
#define _thread_stream_event_one_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct thread_stream_event_one_of_t thread_stream_event_one_of_t;

#include "thread_object.h"

// Enum EVENT for thread_stream_event_one_of

typedef enum  { openai_api_thread_stream_event_one_of_EVENT_NULL = 0, openai_api_thread_stream_event_one_of_EVENT_thread.created } openai_api_thread_stream_event_one_of_EVENT_e;

char* thread_stream_event_one_of_event_ToString(openai_api_thread_stream_event_one_of_EVENT_e event);

openai_api_thread_stream_event_one_of_EVENT_e thread_stream_event_one_of_event_FromString(char* event);



typedef struct thread_stream_event_one_of_t {
    openai_api_thread_stream_event_one_of_EVENT_e event; //enum
    struct thread_object_t *data; //model

} thread_stream_event_one_of_t;

thread_stream_event_one_of_t *thread_stream_event_one_of_create(
    openai_api_thread_stream_event_one_of_EVENT_e event,
    thread_object_t *data
);

void thread_stream_event_one_of_free(thread_stream_event_one_of_t *thread_stream_event_one_of);

thread_stream_event_one_of_t *thread_stream_event_one_of_parseFromJSON(cJSON *thread_stream_event_one_ofJSON);

cJSON *thread_stream_event_one_of_convertToJSON(thread_stream_event_one_of_t *thread_stream_event_one_of);

#endif /* _thread_stream_event_one_of_H_ */

