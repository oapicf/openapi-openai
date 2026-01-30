/*
 * realtime_response_status_details.h
 *
 * Additional details about the status.
 */

#ifndef _realtime_response_status_details_H_
#define _realtime_response_status_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_response_status_details_t realtime_response_status_details_t;

#include "realtime_response_status_details_error.h"

// Enum TYPE for realtime_response_status_details

typedef enum  { openai_api_realtime_response_status_details_TYPE_NULL = 0, openai_api_realtime_response_status_details_TYPE_completed, openai_api_realtime_response_status_details_TYPE_cancelled, openai_api_realtime_response_status_details_TYPE_failed, openai_api_realtime_response_status_details_TYPE_incomplete } openai_api_realtime_response_status_details_TYPE_e;

char* realtime_response_status_details_type_ToString(openai_api_realtime_response_status_details_TYPE_e type);

openai_api_realtime_response_status_details_TYPE_e realtime_response_status_details_type_FromString(char* type);

// Enum REASON for realtime_response_status_details

typedef enum  { openai_api_realtime_response_status_details_REASON_NULL = 0, openai_api_realtime_response_status_details_REASON_turn_detected, openai_api_realtime_response_status_details_REASON_client_cancelled, openai_api_realtime_response_status_details_REASON_max_output_tokens, openai_api_realtime_response_status_details_REASON_content_filter } openai_api_realtime_response_status_details_REASON_e;

char* realtime_response_status_details_reason_ToString(openai_api_realtime_response_status_details_REASON_e reason);

openai_api_realtime_response_status_details_REASON_e realtime_response_status_details_reason_FromString(char* reason);



typedef struct realtime_response_status_details_t {
    openai_api_realtime_response_status_details_TYPE_e type; //enum
    openai_api_realtime_response_status_details_REASON_e reason; //enum
    struct realtime_response_status_details_error_t *error; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_response_status_details_t;

__attribute__((deprecated)) realtime_response_status_details_t *realtime_response_status_details_create(
    openai_api_realtime_response_status_details_TYPE_e type,
    openai_api_realtime_response_status_details_REASON_e reason,
    realtime_response_status_details_error_t *error
);

void realtime_response_status_details_free(realtime_response_status_details_t *realtime_response_status_details);

realtime_response_status_details_t *realtime_response_status_details_parseFromJSON(cJSON *realtime_response_status_detailsJSON);

cJSON *realtime_response_status_details_convertToJSON(realtime_response_status_details_t *realtime_response_status_details);

#endif /* _realtime_response_status_details_H_ */

