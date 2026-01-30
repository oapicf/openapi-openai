/*
 * realtime_response_create_params_conversation.h
 *
 * Controls which conversation the response is added to. Currently supports &#x60;auto&#x60; and &#x60;none&#x60;, with &#x60;auto&#x60; as the default value. The &#x60;auto&#x60; value means that the contents of the response will be added to the default conversation. Set this to &#x60;none&#x60; to create an out-of-band response which  will not add items to default conversation. 
 */

#ifndef _realtime_response_create_params_conversation_H_
#define _realtime_response_create_params_conversation_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_response_create_params_conversation_t realtime_response_create_params_conversation_t;




typedef struct realtime_response_create_params_conversation_t {

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_response_create_params_conversation_t;

__attribute__((deprecated)) realtime_response_create_params_conversation_t *realtime_response_create_params_conversation_create(
);

void realtime_response_create_params_conversation_free(realtime_response_create_params_conversation_t *realtime_response_create_params_conversation);

realtime_response_create_params_conversation_t *realtime_response_create_params_conversation_parseFromJSON(cJSON *realtime_response_create_params_conversationJSON);

cJSON *realtime_response_create_params_conversation_convertToJSON(realtime_response_create_params_conversation_t *realtime_response_create_params_conversation);

#endif /* _realtime_response_create_params_conversation_H_ */

