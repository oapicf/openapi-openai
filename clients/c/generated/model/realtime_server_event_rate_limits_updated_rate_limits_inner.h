/*
 * realtime_server_event_rate_limits_updated_rate_limits_inner.h
 *
 * 
 */

#ifndef _realtime_server_event_rate_limits_updated_rate_limits_inner_H_
#define _realtime_server_event_rate_limits_updated_rate_limits_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_rate_limits_updated_rate_limits_inner_t realtime_server_event_rate_limits_updated_rate_limits_inner_t;


// Enum NAME for realtime_server_event_rate_limits_updated_rate_limits_inner

typedef enum  { openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_NULL = 0, openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_requests, openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_tokens } openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_e;

char* realtime_server_event_rate_limits_updated_rate_limits_inner_name_ToString(openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_e name);

openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_e realtime_server_event_rate_limits_updated_rate_limits_inner_name_FromString(char* name);



typedef struct realtime_server_event_rate_limits_updated_rate_limits_inner_t {
    openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_e name; //enum
    int limit; //numeric
    int remaining; //numeric
    double reset_seconds; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_rate_limits_updated_rate_limits_inner_t;

__attribute__((deprecated)) realtime_server_event_rate_limits_updated_rate_limits_inner_t *realtime_server_event_rate_limits_updated_rate_limits_inner_create(
    openai_api_realtime_server_event_rate_limits_updated_rate_limits_inner_NAME_e name,
    int limit,
    int remaining,
    double reset_seconds
);

void realtime_server_event_rate_limits_updated_rate_limits_inner_free(realtime_server_event_rate_limits_updated_rate_limits_inner_t *realtime_server_event_rate_limits_updated_rate_limits_inner);

realtime_server_event_rate_limits_updated_rate_limits_inner_t *realtime_server_event_rate_limits_updated_rate_limits_inner_parseFromJSON(cJSON *realtime_server_event_rate_limits_updated_rate_limits_innerJSON);

cJSON *realtime_server_event_rate_limits_updated_rate_limits_inner_convertToJSON(realtime_server_event_rate_limits_updated_rate_limits_inner_t *realtime_server_event_rate_limits_updated_rate_limits_inner);

#endif /* _realtime_server_event_rate_limits_updated_rate_limits_inner_H_ */

