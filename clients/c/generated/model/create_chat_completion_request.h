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
#include "create_chat_completion_request_function_call.h"
#include "create_chat_completion_request_model.h"
#include "create_chat_completion_request_stop.h"
#include "object.h"



typedef struct create_chat_completion_request_t {
    struct create_chat_completion_request_model_t *model; //model
    list_t *messages; //nonprimitive container
    list_t *functions; //nonprimitive container
    struct create_chat_completion_request_function_call_t *function_call; //model
    double temperature; //numeric
    double top_p; //numeric
    int n; //numeric
    int stream; //boolean
    struct create_chat_completion_request_stop_t *stop; //model
    int max_tokens; //numeric
    double presence_penalty; //numeric
    double frequency_penalty; //numeric
    object_t *logit_bias; //object
    char *user; // string

} create_chat_completion_request_t;

create_chat_completion_request_t *create_chat_completion_request_create(
    create_chat_completion_request_model_t *model,
    list_t *messages,
    list_t *functions,
    create_chat_completion_request_function_call_t *function_call,
    double temperature,
    double top_p,
    int n,
    int stream,
    create_chat_completion_request_stop_t *stop,
    int max_tokens,
    double presence_penalty,
    double frequency_penalty,
    object_t *logit_bias,
    char *user
);

void create_chat_completion_request_free(create_chat_completion_request_t *create_chat_completion_request);

create_chat_completion_request_t *create_chat_completion_request_parseFromJSON(cJSON *create_chat_completion_requestJSON);

cJSON *create_chat_completion_request_convertToJSON(create_chat_completion_request_t *create_chat_completion_request);

#endif /* _create_chat_completion_request_H_ */

