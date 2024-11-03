/*
 * create_chat_completion_stream_response.h
 *
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
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

// Enum OBJECT for create_chat_completion_stream_response

typedef enum  { openai_api_create_chat_completion_stream_response_OBJECT_NULL = 0, openai_api_create_chat_completion_stream_response_OBJECT_chat.completion.chunk } openai_api_create_chat_completion_stream_response_OBJECT_e;

char* create_chat_completion_stream_response_object_ToString(openai_api_create_chat_completion_stream_response_OBJECT_e object);

openai_api_create_chat_completion_stream_response_OBJECT_e create_chat_completion_stream_response_object_FromString(char* object);



typedef struct create_chat_completion_stream_response_t {
    char *id; // string
    list_t *choices; //nonprimitive container
    int created; //numeric
    char *model; // string
    char *system_fingerprint; // string
    openai_api_create_chat_completion_stream_response_OBJECT_e object; //enum

} create_chat_completion_stream_response_t;

create_chat_completion_stream_response_t *create_chat_completion_stream_response_create(
    char *id,
    list_t *choices,
    int created,
    char *model,
    char *system_fingerprint,
    openai_api_create_chat_completion_stream_response_OBJECT_e object
);

void create_chat_completion_stream_response_free(create_chat_completion_stream_response_t *create_chat_completion_stream_response);

create_chat_completion_stream_response_t *create_chat_completion_stream_response_parseFromJSON(cJSON *create_chat_completion_stream_responseJSON);

cJSON *create_chat_completion_stream_response_convertToJSON(create_chat_completion_stream_response_t *create_chat_completion_stream_response);

#endif /* _create_chat_completion_stream_response_H_ */

