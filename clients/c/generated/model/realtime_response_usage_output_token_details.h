/*
 * realtime_response_usage_output_token_details.h
 *
 * Details about the output tokens used in the Response.
 */

#ifndef _realtime_response_usage_output_token_details_H_
#define _realtime_response_usage_output_token_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_response_usage_output_token_details_t realtime_response_usage_output_token_details_t;




typedef struct realtime_response_usage_output_token_details_t {
    int text_tokens; //numeric
    int audio_tokens; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_response_usage_output_token_details_t;

__attribute__((deprecated)) realtime_response_usage_output_token_details_t *realtime_response_usage_output_token_details_create(
    int text_tokens,
    int audio_tokens
);

void realtime_response_usage_output_token_details_free(realtime_response_usage_output_token_details_t *realtime_response_usage_output_token_details);

realtime_response_usage_output_token_details_t *realtime_response_usage_output_token_details_parseFromJSON(cJSON *realtime_response_usage_output_token_detailsJSON);

cJSON *realtime_response_usage_output_token_details_convertToJSON(realtime_response_usage_output_token_details_t *realtime_response_usage_output_token_details);

#endif /* _realtime_response_usage_output_token_details_H_ */

