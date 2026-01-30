/*
 * create_chat_completion_request.h
 *
 * 
 */

#ifndef _create_chat_completion_request_H_
#define _create_chat_completion_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_completion_request_t create_chat_completion_request_t;

#include "chat_completion_functions.h"
#include "chat_completion_request_message.h"
#include "chat_completion_stream_options.h"
#include "chat_completion_tool.h"
#include "chat_completion_tool_choice_option.h"
#include "create_chat_completion_request_audio.h"
#include "create_chat_completion_request_function_call.h"
#include "create_chat_completion_request_model.h"
#include "create_chat_completion_request_response_format.h"
#include "create_chat_completion_request_stop.h"
#include "prediction_content.h"

// Enum REASONINGEFFORT for create_chat_completion_request

typedef enum  { openai_api_create_chat_completion_request_REASONINGEFFORT_NULL = 0, openai_api_create_chat_completion_request_REASONINGEFFORT_low, openai_api_create_chat_completion_request_REASONINGEFFORT_medium, openai_api_create_chat_completion_request_REASONINGEFFORT_high } openai_api_create_chat_completion_request_REASONINGEFFORT_e;

char* create_chat_completion_request_reasoning_effort_ToString(openai_api_create_chat_completion_request_REASONINGEFFORT_e reasoning_effort);

openai_api_create_chat_completion_request_REASONINGEFFORT_e create_chat_completion_request_reasoning_effort_FromString(char* reasoning_effort);

// Enum MODALITIES for create_chat_completion_request

typedef enum  { openai_api_create_chat_completion_request_MODALITIES_NULL = 0, openai_api_create_chat_completion_request_MODALITIES_text, openai_api_create_chat_completion_request_MODALITIES_audio } openai_api_create_chat_completion_request_MODALITIES_e;

char* create_chat_completion_request_modalities_ToString(openai_api_create_chat_completion_request_MODALITIES_e modalities);

openai_api_create_chat_completion_request_MODALITIES_e create_chat_completion_request_modalities_FromString(char* modalities);

// Enum SERVICETIER for create_chat_completion_request

typedef enum  { openai_api_create_chat_completion_request_SERVICETIER_NULL = 0, openai_api_create_chat_completion_request_SERVICETIER__auto, openai_api_create_chat_completion_request_SERVICETIER__default } openai_api_create_chat_completion_request_SERVICETIER_e;

char* create_chat_completion_request_service_tier_ToString(openai_api_create_chat_completion_request_SERVICETIER_e service_tier);

openai_api_create_chat_completion_request_SERVICETIER_e create_chat_completion_request_service_tier_FromString(char* service_tier);



typedef struct create_chat_completion_request_t {
    list_t *messages; //nonprimitive container
    struct create_chat_completion_request_model_t *model; //model
    int store; //boolean
    openai_api_create_chat_completion_request_REASONINGEFFORT_e reasoning_effort; //enum
    list_t* metadata; //map
    double frequency_penalty; //numeric
    list_t* logit_bias; //map
    int logprobs; //boolean
    int top_logprobs; //numeric
    int max_tokens; //numeric
    int max_completion_tokens; //numeric
    int n; //numeric
    list_t *modalities; //primitive container
    struct prediction_content_t *prediction; //model
    struct create_chat_completion_request_audio_t *audio; //model
    double presence_penalty; //numeric
    struct create_chat_completion_request_response_format_t *response_format; //model
    int seed; //numeric
    openai_api_create_chat_completion_request_SERVICETIER_e service_tier; //enum
    struct create_chat_completion_request_stop_t *stop; //model
    int stream; //boolean
    struct chat_completion_stream_options_t *stream_options; //model
    double temperature; //numeric
    double top_p; //numeric
    list_t *tools; //nonprimitive container
    struct chat_completion_tool_choice_option_t *tool_choice; //model
    int parallel_tool_calls; //boolean
    char *user; // string
    struct create_chat_completion_request_function_call_t *function_call; //model
    list_t *functions; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} create_chat_completion_request_t;

__attribute__((deprecated)) create_chat_completion_request_t *create_chat_completion_request_create(
    list_t *messages,
    create_chat_completion_request_model_t *model,
    int store,
    openai_api_create_chat_completion_request_REASONINGEFFORT_e reasoning_effort,
    list_t* metadata,
    double frequency_penalty,
    list_t* logit_bias,
    int logprobs,
    int top_logprobs,
    int max_tokens,
    int max_completion_tokens,
    int n,
    list_t *modalities,
    prediction_content_t *prediction,
    create_chat_completion_request_audio_t *audio,
    double presence_penalty,
    create_chat_completion_request_response_format_t *response_format,
    int seed,
    openai_api_create_chat_completion_request_SERVICETIER_e service_tier,
    create_chat_completion_request_stop_t *stop,
    int stream,
    chat_completion_stream_options_t *stream_options,
    double temperature,
    double top_p,
    list_t *tools,
    chat_completion_tool_choice_option_t *tool_choice,
    int parallel_tool_calls,
    char *user,
    create_chat_completion_request_function_call_t *function_call,
    list_t *functions
);

void create_chat_completion_request_free(create_chat_completion_request_t *create_chat_completion_request);

create_chat_completion_request_t *create_chat_completion_request_parseFromJSON(cJSON *create_chat_completion_requestJSON);

cJSON *create_chat_completion_request_convertToJSON(create_chat_completion_request_t *create_chat_completion_request);

#endif /* _create_chat_completion_request_H_ */

