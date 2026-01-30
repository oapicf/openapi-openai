/*
 * assistant_stream_event.h
 *
 * Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an &#x60;event&#x60; and &#x60;data&#x60; property:  &#x60;&#x60;&#x60; event: thread.created data: {\&quot;id\&quot;: \&quot;thread_123\&quot;, \&quot;object\&quot;: \&quot;thread\&quot;, ...} &#x60;&#x60;&#x60;  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit &#x60;thread.run.created&#x60; when a new run is created, &#x60;thread.run.completed&#x60; when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a &#x60;thread.message.created event&#x60;, a &#x60;thread.message.in_progress&#x60; event, many &#x60;thread.message.delta&#x60; events, and finally a &#x60;thread.message.completed&#x60; event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
 */

#ifndef _assistant_stream_event_H_
#define _assistant_stream_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistant_stream_event_t assistant_stream_event_t;

#include "done_event.h"
#include "error_event.h"
#include "message_stream_event.h"
#include "run_step_stream_event.h"
#include "run_stream_event.h"
#include "thread_stream_event.h"

// Enum EVENT for assistant_stream_event

typedef enum  { openai_api_assistant_stream_event_EVENT_NULL = 0, openai_api_assistant_stream_event_EVENT_done } openai_api_assistant_stream_event_EVENT_e;

char* assistant_stream_event_event_ToString(openai_api_assistant_stream_event_EVENT_e event);

openai_api_assistant_stream_event_EVENT_e assistant_stream_event_event_FromString(char* event);

// Enum DATA for assistant_stream_event

typedef enum  { openai_api_assistant_stream_event_DATA_NULL = 0, openai_api_assistant_stream_event_DATA_[DONE] } openai_api_assistant_stream_event_DATA_e;

char* assistant_stream_event_data_ToString(openai_api_assistant_stream_event_DATA_e data);

openai_api_assistant_stream_event_DATA_e assistant_stream_event_data_FromString(char* data);



typedef struct assistant_stream_event_t {
    int enabled; //boolean
    openai_api_assistant_stream_event_EVENT_e event; //enum
    openai_api_assistant_stream_event_DATA_e data; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} assistant_stream_event_t;

__attribute__((deprecated)) assistant_stream_event_t *assistant_stream_event_create(
    int enabled,
    openai_api_assistant_stream_event_EVENT_e event,
    openai_api_assistant_stream_event_DATA_e data
);

void assistant_stream_event_free(assistant_stream_event_t *assistant_stream_event);

assistant_stream_event_t *assistant_stream_event_parseFromJSON(cJSON *assistant_stream_eventJSON);

cJSON *assistant_stream_event_convertToJSON(assistant_stream_event_t *assistant_stream_event);

#endif /* _assistant_stream_event_H_ */

