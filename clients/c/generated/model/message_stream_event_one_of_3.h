/*
 * message_stream_event_one_of_3.h
 *
 * Occurs when a [message](/docs/api-reference/messages/object) is completed.
 */

#ifndef _message_stream_event_one_of_3_H_
#define _message_stream_event_one_of_3_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_stream_event_one_of_3_t message_stream_event_one_of_3_t;

#include "message_object.h"

// Enum EVENT for message_stream_event_one_of_3

typedef enum  { openai_api_message_stream_event_one_of_3_EVENT_NULL = 0, openai_api_message_stream_event_one_of_3_EVENT_thread.message.completed } openai_api_message_stream_event_one_of_3_EVENT_e;

char* message_stream_event_one_of_3_event_ToString(openai_api_message_stream_event_one_of_3_EVENT_e event);

openai_api_message_stream_event_one_of_3_EVENT_e message_stream_event_one_of_3_event_FromString(char* event);



typedef struct message_stream_event_one_of_3_t {
    openai_api_message_stream_event_one_of_3_EVENT_e event; //enum
    struct message_object_t *data; //model

    int _library_owned; // Is the library responsible for freeing this object?
} message_stream_event_one_of_3_t;

__attribute__((deprecated)) message_stream_event_one_of_3_t *message_stream_event_one_of_3_create(
    openai_api_message_stream_event_one_of_3_EVENT_e event,
    message_object_t *data
);

void message_stream_event_one_of_3_free(message_stream_event_one_of_3_t *message_stream_event_one_of_3);

message_stream_event_one_of_3_t *message_stream_event_one_of_3_parseFromJSON(cJSON *message_stream_event_one_of_3JSON);

cJSON *message_stream_event_one_of_3_convertToJSON(message_stream_event_one_of_3_t *message_stream_event_one_of_3);

#endif /* _message_stream_event_one_of_3_H_ */

