/*
 * realtime_client_event_response_create.h
 *
 * This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a &#x60;response.created&#x60; event, events for Items  and content created, and finally a &#x60;response.done&#x60; event to indicate the  Response is complete.  The &#x60;response.create&#x60; event includes inference configuration like  &#x60;instructions&#x60;, and &#x60;temperature&#x60;. These fields will override the Session&#39;s  configuration for this Response only. 
 */

#ifndef _realtime_client_event_response_create_H_
#define _realtime_client_event_response_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_client_event_response_create_t realtime_client_event_response_create_t;

#include "realtime_response_create_params.h"

// Enum TYPE for realtime_client_event_response_create

typedef enum  { openai_api_realtime_client_event_response_create_TYPE_NULL = 0, openai_api_realtime_client_event_response_create_TYPE_response.create } openai_api_realtime_client_event_response_create_TYPE_e;

char* realtime_client_event_response_create_type_ToString(openai_api_realtime_client_event_response_create_TYPE_e type);

openai_api_realtime_client_event_response_create_TYPE_e realtime_client_event_response_create_type_FromString(char* type);



typedef struct realtime_client_event_response_create_t {
    char *event_id; // string
    openai_api_realtime_client_event_response_create_TYPE_e type; //enum
    struct realtime_response_create_params_t *response; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_client_event_response_create_t;

__attribute__((deprecated)) realtime_client_event_response_create_t *realtime_client_event_response_create_create(
    char *event_id,
    openai_api_realtime_client_event_response_create_TYPE_e type,
    realtime_response_create_params_t *response
);

void realtime_client_event_response_create_free(realtime_client_event_response_create_t *realtime_client_event_response_create);

realtime_client_event_response_create_t *realtime_client_event_response_create_parseFromJSON(cJSON *realtime_client_event_response_createJSON);

cJSON *realtime_client_event_response_create_convertToJSON(realtime_client_event_response_create_t *realtime_client_event_response_create);

#endif /* _realtime_client_event_response_create_H_ */

