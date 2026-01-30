/*
 * realtime_response.h
 *
 * The response resource.
 */

#ifndef _realtime_response_H_
#define _realtime_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_response_t realtime_response_t;

#include "object.h"
#include "realtime_conversation_item.h"
#include "realtime_response_status_details.h"
#include "realtime_response_usage.h"

// Enum OBJECT for realtime_response

typedef enum  { openai_api_realtime_response_OBJECT_NULL = 0, openai_api_realtime_response_OBJECT_realtime.response } openai_api_realtime_response_OBJECT_e;

char* realtime_response_object_ToString(openai_api_realtime_response_OBJECT_e object);

openai_api_realtime_response_OBJECT_e realtime_response_object_FromString(char* object);

// Enum STATUS for realtime_response

typedef enum  { openai_api_realtime_response_STATUS_NULL = 0, openai_api_realtime_response_STATUS_completed, openai_api_realtime_response_STATUS_cancelled, openai_api_realtime_response_STATUS_failed, openai_api_realtime_response_STATUS_incomplete } openai_api_realtime_response_STATUS_e;

char* realtime_response_status_ToString(openai_api_realtime_response_STATUS_e status);

openai_api_realtime_response_STATUS_e realtime_response_status_FromString(char* status);



typedef struct realtime_response_t {
    char *id; // string
    openai_api_realtime_response_OBJECT_e object; //enum
    openai_api_realtime_response_STATUS_e status; //enum
    struct realtime_response_status_details_t *status_details; //model
    list_t *output; //nonprimitive container
    object_t *metadata; //object
    struct realtime_response_usage_t *usage; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_response_t;

__attribute__((deprecated)) realtime_response_t *realtime_response_create(
    char *id,
    openai_api_realtime_response_OBJECT_e object,
    openai_api_realtime_response_STATUS_e status,
    realtime_response_status_details_t *status_details,
    list_t *output,
    object_t *metadata,
    realtime_response_usage_t *usage
);

void realtime_response_free(realtime_response_t *realtime_response);

realtime_response_t *realtime_response_parseFromJSON(cJSON *realtime_responseJSON);

cJSON *realtime_response_convertToJSON(realtime_response_t *realtime_response);

#endif /* _realtime_response_H_ */

