/*
 * message_stream_event_one_of_1.h
 *
 * Occurs when a [message](/docs/api-reference/messages/object) moves to an &#x60;in_progress&#x60; state.
 */

#ifndef _message_stream_event_one_of_1_H_
#define _message_stream_event_one_of_1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_stream_event_one_of_1_t message_stream_event_one_of_1_t;

#include "message_object.h"

// Enum EVENT for message_stream_event_one_of_1

typedef enum  { openai_api_message_stream_event_one_of_1_EVENT_NULL = 0, openai_api_message_stream_event_one_of_1_EVENT_thread.message.in_progress } openai_api_message_stream_event_one_of_1_EVENT_e;

char* message_stream_event_one_of_1_event_ToString(openai_api_message_stream_event_one_of_1_EVENT_e event);

openai_api_message_stream_event_one_of_1_EVENT_e message_stream_event_one_of_1_event_FromString(char* event);



typedef struct message_stream_event_one_of_1_t {
    openai_api_message_stream_event_one_of_1_EVENT_e event; //enum
    struct message_object_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} message_stream_event_one_of_1_t;

__attribute__((deprecated)) message_stream_event_one_of_1_t *message_stream_event_one_of_1_create(
    openai_api_message_stream_event_one_of_1_EVENT_e event,
    message_object_t *data
);

void message_stream_event_one_of_1_free(message_stream_event_one_of_1_t *message_stream_event_one_of_1);

message_stream_event_one_of_1_t *message_stream_event_one_of_1_parseFromJSON(cJSON *message_stream_event_one_of_1JSON);

cJSON *message_stream_event_one_of_1_convertToJSON(message_stream_event_one_of_1_t *message_stream_event_one_of_1);

#endif /* _message_stream_event_one_of_1_H_ */

