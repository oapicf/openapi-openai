/*
 * create_chat_completion_stream_response_usage.h
 *
 * An optional field that will only be present when you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60; in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
 */

#ifndef _create_chat_completion_stream_response_usage_H_
#define _create_chat_completion_stream_response_usage_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_completion_stream_response_usage_t create_chat_completion_stream_response_usage_t;




typedef struct create_chat_completion_stream_response_usage_t {
    int completion_tokens; //numeric
    int prompt_tokens; //numeric
    int total_tokens; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} create_chat_completion_stream_response_usage_t;

__attribute__((deprecated)) create_chat_completion_stream_response_usage_t *create_chat_completion_stream_response_usage_create(
    int completion_tokens,
    int prompt_tokens,
    int total_tokens
);

void create_chat_completion_stream_response_usage_free(create_chat_completion_stream_response_usage_t *create_chat_completion_stream_response_usage);

create_chat_completion_stream_response_usage_t *create_chat_completion_stream_response_usage_parseFromJSON(cJSON *create_chat_completion_stream_response_usageJSON);

cJSON *create_chat_completion_stream_response_usage_convertToJSON(create_chat_completion_stream_response_usage_t *create_chat_completion_stream_response_usage);

#endif /* _create_chat_completion_stream_response_usage_H_ */

