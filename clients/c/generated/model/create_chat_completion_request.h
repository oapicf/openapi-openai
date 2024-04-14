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
#include "chat_completion_tool.h"
#include "chat_completion_tool_choice_option.h"
#include "create_chat_completion_request_function_call.h"
#include "create_chat_completion_request_model.h"
#include "create_chat_completion_request_response_format.h"
#include "create_chat_completion_request_stop.h"



typedef struct create_chat_completion_request_t {
    list_t *messages; //nonprimitive container
    struct create_chat_completion_request_model_t *model; //model
    double frequency_penalty; //numeric
    list_t* logit_bias; //map
    int logprobs; //boolean
    int top_logprobs; //numeric
    int max_tokens; //numeric
    int n; //numeric
    double presence_penalty; //numeric
    struct create_chat_completion_request_response_format_t *response_format; //model
    int seed; //numeric
    struct create_chat_completion_request_stop_t *stop; //model
    int stream; //boolean
    double temperature; //numeric
    double top_p; //numeric
    list_t *tools; //nonprimitive container
    struct chat_completion_tool_choice_option_t *tool_choice; //model
    char *user; // string
    struct create_chat_completion_request_function_call_t *function_call; //model
    list_t *functions; //nonprimitive container

} create_chat_completion_request_t;

create_chat_completion_request_t *create_chat_completion_request_create(
    list_t *messages,
    create_chat_completion_request_model_t *model,
    double frequency_penalty,
    list_t* logit_bias,
    int logprobs,
    int top_logprobs,
    int max_tokens,
    int n,
    double presence_penalty,
    create_chat_completion_request_response_format_t *response_format,
    int seed,
    create_chat_completion_request_stop_t *stop,
    int stream,
    double temperature,
    double top_p,
    list_t *tools,
    chat_completion_tool_choice_option_t *tool_choice,
    char *user,
    create_chat_completion_request_function_call_t *function_call,
    list_t *functions
);

void create_chat_completion_request_free(create_chat_completion_request_t *create_chat_completion_request);

create_chat_completion_request_t *create_chat_completion_request_parseFromJSON(cJSON *create_chat_completion_requestJSON);

cJSON *create_chat_completion_request_convertToJSON(create_chat_completion_request_t *create_chat_completion_request);

#endif /* _create_chat_completion_request_H_ */

