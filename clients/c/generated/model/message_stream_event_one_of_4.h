/*
 * message_stream_event_one_of_4.h
 *
 * Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
 */

#ifndef _message_stream_event_one_of_4_H_
#define _message_stream_event_one_of_4_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_stream_event_one_of_4_t message_stream_event_one_of_4_t;

#include "message_object.h"

// Enum EVENT for message_stream_event_one_of_4

typedef enum  { openai_api_message_stream_event_one_of_4_EVENT_NULL = 0, openai_api_message_stream_event_one_of_4_EVENT_thread.message.incomplete } openai_api_message_stream_event_one_of_4_EVENT_e;

char* message_stream_event_one_of_4_event_ToString(openai_api_message_stream_event_one_of_4_EVENT_e event);

openai_api_message_stream_event_one_of_4_EVENT_e message_stream_event_one_of_4_event_FromString(char* event);



typedef struct message_stream_event_one_of_4_t {
    openai_api_message_stream_event_one_of_4_EVENT_e event; //enum
    struct message_object_t *data; //model

} message_stream_event_one_of_4_t;

message_stream_event_one_of_4_t *message_stream_event_one_of_4_create(
    openai_api_message_stream_event_one_of_4_EVENT_e event,
    message_object_t *data
);

void message_stream_event_one_of_4_free(message_stream_event_one_of_4_t *message_stream_event_one_of_4);

message_stream_event_one_of_4_t *message_stream_event_one_of_4_parseFromJSON(cJSON *message_stream_event_one_of_4JSON);

cJSON *message_stream_event_one_of_4_convertToJSON(message_stream_event_one_of_4_t *message_stream_event_one_of_4);

#endif /* _message_stream_event_one_of_4_H_ */

