/*
 * realtime_response_usage.h
 *
 * Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
 */

#ifndef _realtime_response_usage_H_
#define _realtime_response_usage_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_response_usage_t realtime_response_usage_t;

#include "realtime_response_usage_input_token_details.h"
#include "realtime_response_usage_output_token_details.h"



typedef struct realtime_response_usage_t {
    int total_tokens; //numeric
    int input_tokens; //numeric
    int output_tokens; //numeric
    struct realtime_response_usage_input_token_details_t *input_token_details; //model
    struct realtime_response_usage_output_token_details_t *output_token_details; //model

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_response_usage_t;

__attribute__((deprecated)) realtime_response_usage_t *realtime_response_usage_create(
    int total_tokens,
    int input_tokens,
    int output_tokens,
    realtime_response_usage_input_token_details_t *input_token_details,
    realtime_response_usage_output_token_details_t *output_token_details
);

void realtime_response_usage_free(realtime_response_usage_t *realtime_response_usage);

realtime_response_usage_t *realtime_response_usage_parseFromJSON(cJSON *realtime_response_usageJSON);

cJSON *realtime_response_usage_convertToJSON(realtime_response_usage_t *realtime_response_usage);

#endif /* _realtime_response_usage_H_ */

