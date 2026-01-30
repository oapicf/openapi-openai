/*
 * chat_completion_stream_options.h
 *
 * Options for streaming response. Only set this when you set &#x60;stream: true&#x60;. 
 */

#ifndef _chat_completion_stream_options_H_
#define _chat_completion_stream_options_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_stream_options_t chat_completion_stream_options_t;




typedef struct chat_completion_stream_options_t {
    int include_usage; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} chat_completion_stream_options_t;

__attribute__((deprecated)) chat_completion_stream_options_t *chat_completion_stream_options_create(
    int include_usage
);

void chat_completion_stream_options_free(chat_completion_stream_options_t *chat_completion_stream_options);

chat_completion_stream_options_t *chat_completion_stream_options_parseFromJSON(cJSON *chat_completion_stream_optionsJSON);

cJSON *chat_completion_stream_options_convertToJSON(chat_completion_stream_options_t *chat_completion_stream_options);

#endif /* _chat_completion_stream_options_H_ */

