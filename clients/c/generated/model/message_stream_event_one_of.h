/*
 * message_stream_event_one_of.h
 *
 * Occurs when a [message](/docs/api-reference/messages/object) is created.
 */

#ifndef _message_stream_event_one_of_H_
#define _message_stream_event_one_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_stream_event_one_of_t message_stream_event_one_of_t;

#include "message_object.h"

// Enum EVENT for message_stream_event_one_of

typedef enum  { openai_api_message_stream_event_one_of_EVENT_NULL = 0, openai_api_message_stream_event_one_of_EVENT_thread.message.created } openai_api_message_stream_event_one_of_EVENT_e;

char* message_stream_event_one_of_event_ToString(openai_api_message_stream_event_one_of_EVENT_e event);

openai_api_message_stream_event_one_of_EVENT_e message_stream_event_one_of_event_FromString(char* event);



typedef struct message_stream_event_one_of_t {
    openai_api_message_stream_event_one_of_EVENT_e event; //enum
    struct message_object_t *data; //model

} message_stream_event_one_of_t;

message_stream_event_one_of_t *message_stream_event_one_of_create(
    openai_api_message_stream_event_one_of_EVENT_e event,
    message_object_t *data
);

void message_stream_event_one_of_free(message_stream_event_one_of_t *message_stream_event_one_of);

message_stream_event_one_of_t *message_stream_event_one_of_parseFromJSON(cJSON *message_stream_event_one_ofJSON);

cJSON *message_stream_event_one_of_convertToJSON(message_stream_event_one_of_t *message_stream_event_one_of);

#endif /* _message_stream_event_one_of_H_ */

