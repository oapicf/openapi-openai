/*
 * realtime_server_event_error.h
 *
 * Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
 */

#ifndef _realtime_server_event_error_H_
#define _realtime_server_event_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_error_t realtime_server_event_error_t;

#include "realtime_server_event_error_error.h"

// Enum TYPE for realtime_server_event_error

typedef enum  { openai_api_realtime_server_event_error_TYPE_NULL = 0, openai_api_realtime_server_event_error_TYPE_error } openai_api_realtime_server_event_error_TYPE_e;

char* realtime_server_event_error_type_ToString(openai_api_realtime_server_event_error_TYPE_e type);

openai_api_realtime_server_event_error_TYPE_e realtime_server_event_error_type_FromString(char* type);



typedef struct realtime_server_event_error_t {
    char *event_id; // string
    openai_api_realtime_server_event_error_TYPE_e type; //enum
    struct realtime_server_event_error_error_t *error; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_error_t;

__attribute__((deprecated)) realtime_server_event_error_t *realtime_server_event_error_create(
    char *event_id,
    openai_api_realtime_server_event_error_TYPE_e type,
    realtime_server_event_error_error_t *error
);

void realtime_server_event_error_free(realtime_server_event_error_t *realtime_server_event_error);

realtime_server_event_error_t *realtime_server_event_error_parseFromJSON(cJSON *realtime_server_event_errorJSON);

cJSON *realtime_server_event_error_convertToJSON(realtime_server_event_error_t *realtime_server_event_error);

#endif /* _realtime_server_event_error_H_ */

