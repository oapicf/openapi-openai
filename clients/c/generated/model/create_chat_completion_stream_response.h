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
#include "create_chat_completion_stream_response_usage.h"

// Enum SERVICETIER for create_chat_completion_stream_response

typedef enum  { openai_api_create_chat_completion_stream_response_SERVICETIER_NULL = 0, openai_api_create_chat_completion_stream_response_SERVICETIER_scale, openai_api_create_chat_completion_stream_response_SERVICETIER__default } openai_api_create_chat_completion_stream_response_SERVICETIER_e;

char* create_chat_completion_stream_response_service_tier_ToString(openai_api_create_chat_completion_stream_response_SERVICETIER_e service_tier);

openai_api_create_chat_completion_stream_response_SERVICETIER_e create_chat_completion_stream_response_service_tier_FromString(char* service_tier);

// Enum OBJECT for create_chat_completion_stream_response

typedef enum  { openai_api_create_chat_completion_stream_response_OBJECT_NULL = 0, openai_api_create_chat_completion_stream_response_OBJECT_chat.completion.chunk } openai_api_create_chat_completion_stream_response_OBJECT_e;

char* create_chat_completion_stream_response_object_ToString(openai_api_create_chat_completion_stream_response_OBJECT_e object);

openai_api_create_chat_completion_stream_response_OBJECT_e create_chat_completion_stream_response_object_FromString(char* object);



typedef struct create_chat_completion_stream_response_t {
    char *id; // string
    list_t *choices; //nonprimitive container
    int created; //numeric
    char *model; // string
    openai_api_create_chat_completion_stream_response_SERVICETIER_e service_tier; //enum
    char *system_fingerprint; // string
    openai_api_create_chat_completion_stream_response_OBJECT_e object; //enum
    struct create_chat_completion_stream_response_usage_t *usage; //model

    int _library_owned; // Is the library responsible for freeing this object?
} create_chat_completion_stream_response_t;

__attribute__((deprecated)) create_chat_completion_stream_response_t *create_chat_completion_stream_response_create(
    char *id,
    list_t *choices,
    int created,
    char *model,
    openai_api_create_chat_completion_stream_response_SERVICETIER_e service_tier,
    char *system_fingerprint,
    openai_api_create_chat_completion_stream_response_OBJECT_e object,
    create_chat_completion_stream_response_usage_t *usage
);

void create_chat_completion_stream_response_free(create_chat_completion_stream_response_t *create_chat_completion_stream_response);

create_chat_completion_stream_response_t *create_chat_completion_stream_response_parseFromJSON(cJSON *create_chat_completion_stream_responseJSON);

cJSON *create_chat_completion_stream_response_convertToJSON(create_chat_completion_stream_response_t *create_chat_completion_stream_response);

#endif /* _create_chat_completion_stream_response_H_ */

