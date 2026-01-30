/*
 * realtime_server_event_rate_limits_updated.h
 *
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \&quot;reserved\&quot; for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 */

#ifndef _realtime_server_event_rate_limits_updated_H_
#define _realtime_server_event_rate_limits_updated_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_server_event_rate_limits_updated_t realtime_server_event_rate_limits_updated_t;

#include "realtime_server_event_rate_limits_updated_rate_limits_inner.h"

// Enum TYPE for realtime_server_event_rate_limits_updated

typedef enum  { openai_api_realtime_server_event_rate_limits_updated_TYPE_NULL = 0, openai_api_realtime_server_event_rate_limits_updated_TYPE_rate_limits.updated } openai_api_realtime_server_event_rate_limits_updated_TYPE_e;

char* realtime_server_event_rate_limits_updated_type_ToString(openai_api_realtime_server_event_rate_limits_updated_TYPE_e type);

openai_api_realtime_server_event_rate_limits_updated_TYPE_e realtime_server_event_rate_limits_updated_type_FromString(char* type);



typedef struct realtime_server_event_rate_limits_updated_t {
    char *event_id; // string
    openai_api_realtime_server_event_rate_limits_updated_TYPE_e type; //enum
    list_t *rate_limits; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_server_event_rate_limits_updated_t;

__attribute__((deprecated)) realtime_server_event_rate_limits_updated_t *realtime_server_event_rate_limits_updated_create(
    char *event_id,
    openai_api_realtime_server_event_rate_limits_updated_TYPE_e type,
    list_t *rate_limits
);

void realtime_server_event_rate_limits_updated_free(realtime_server_event_rate_limits_updated_t *realtime_server_event_rate_limits_updated);

realtime_server_event_rate_limits_updated_t *realtime_server_event_rate_limits_updated_parseFromJSON(cJSON *realtime_server_event_rate_limits_updatedJSON);

cJSON *realtime_server_event_rate_limits_updated_convertToJSON(realtime_server_event_rate_limits_updated_t *realtime_server_event_rate_limits_updated);

#endif /* _realtime_server_event_rate_limits_updated_H_ */

