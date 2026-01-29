/*
 * message_stream_event.h
 *
 * 
 */

#ifndef _message_stream_event_H_
#define _message_stream_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_stream_event_t message_stream_event_t;

#include "message_object.h"
#include "message_stream_event_one_of.h"
#include "message_stream_event_one_of_1.h"
#include "message_stream_event_one_of_2.h"
#include "message_stream_event_one_of_3.h"
#include "message_stream_event_one_of_4.h"

// Enum EVENT for message_stream_event

typedef enum  { openai_api_message_stream_event_EVENT_NULL = 0, openai_api_message_stream_event_EVENT_thread.message.incomplete } openai_api_message_stream_event_EVENT_e;

char* message_stream_event_event_ToString(openai_api_message_stream_event_EVENT_e event);

openai_api_message_stream_event_EVENT_e message_stream_event_event_FromString(char* event);



typedef struct message_stream_event_t {
    openai_api_message_stream_event_EVENT_e event; //enum
    struct message_object_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} message_stream_event_t;

__attribute__((deprecated)) message_stream_event_t *message_stream_event_create(
    openai_api_message_stream_event_EVENT_e event,
    message_object_t *data
);

void message_stream_event_free(message_stream_event_t *message_stream_event);

message_stream_event_t *message_stream_event_parseFromJSON(cJSON *message_stream_eventJSON);

cJSON *message_stream_event_convertToJSON(message_stream_event_t *message_stream_event);

#endif /* _message_stream_event_H_ */

