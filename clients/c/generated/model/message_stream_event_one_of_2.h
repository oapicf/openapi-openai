/*
 * message_stream_event_one_of_2.h
 *
 * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 */

#ifndef _message_stream_event_one_of_2_H_
#define _message_stream_event_one_of_2_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct message_stream_event_one_of_2_t message_stream_event_one_of_2_t;

#include "message_delta_object.h"

// Enum EVENT for message_stream_event_one_of_2

typedef enum  { openai_api_message_stream_event_one_of_2_EVENT_NULL = 0, openai_api_message_stream_event_one_of_2_EVENT_thread.message.delta } openai_api_message_stream_event_one_of_2_EVENT_e;

char* message_stream_event_one_of_2_event_ToString(openai_api_message_stream_event_one_of_2_EVENT_e event);

openai_api_message_stream_event_one_of_2_EVENT_e message_stream_event_one_of_2_event_FromString(char* event);



typedef struct message_stream_event_one_of_2_t {
    openai_api_message_stream_event_one_of_2_EVENT_e event; //enum
    struct message_delta_object_t *data; //model

} message_stream_event_one_of_2_t;

message_stream_event_one_of_2_t *message_stream_event_one_of_2_create(
    openai_api_message_stream_event_one_of_2_EVENT_e event,
    message_delta_object_t *data
);

void message_stream_event_one_of_2_free(message_stream_event_one_of_2_t *message_stream_event_one_of_2);

message_stream_event_one_of_2_t *message_stream_event_one_of_2_parseFromJSON(cJSON *message_stream_event_one_of_2JSON);

cJSON *message_stream_event_one_of_2_convertToJSON(message_stream_event_one_of_2_t *message_stream_event_one_of_2);

#endif /* _message_stream_event_one_of_2_H_ */

