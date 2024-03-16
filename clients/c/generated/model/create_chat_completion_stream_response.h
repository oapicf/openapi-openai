/*
 * create_chat_completion_stream_response.h
 *
 * 
 */

#ifndef _create_chat_completion_stream_response_H_
#define _create_chat_completion_stream_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_completion_stream_response_t create_chat_completion_stream_response_t;

#include "create_chat_completion_stream_response_choices_inner.h"



typedef struct create_chat_completion_stream_response_t {
    char *id; // string
    char *object; // string
    int created; //numeric
    char *model; // string
    list_t *choices; //nonprimitive container

} create_chat_completion_stream_response_t;

create_chat_completion_stream_response_t *create_chat_completion_stream_response_create(
    char *id,
    char *object,
    int created,
    char *model,
    list_t *choices
);

void create_chat_completion_stream_response_free(create_chat_completion_stream_response_t *create_chat_completion_stream_response);

create_chat_completion_stream_response_t *create_chat_completion_stream_response_parseFromJSON(cJSON *create_chat_completion_stream_responseJSON);

cJSON *create_chat_completion_stream_response_convertToJSON(create_chat_completion_stream_response_t *create_chat_completion_stream_response);

#endif /* _create_chat_completion_stream_response_H_ */

