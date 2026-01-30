/*
 * create_completion_request.h
 *
 * 
 */

#ifndef _create_completion_request_H_
#define _create_completion_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_completion_request_t create_completion_request_t;

#include "chat_completion_stream_options.h"
#include "create_completion_request_model.h"
#include "create_completion_request_prompt.h"
#include "create_completion_request_stop.h"



typedef struct create_completion_request_t {
    struct create_completion_request_model_t *model; //model
    struct create_completion_request_prompt_t *prompt; //model
    int best_of; //numeric
    int echo; //boolean
    double frequency_penalty; //numeric
    list_t* logit_bias; //map
    int logprobs; //numeric
    int max_tokens; //numeric
    int n; //numeric
    double presence_penalty; //numeric
    int seed; //numeric
    struct create_completion_request_stop_t *stop; //model
    int stream; //boolean
    struct chat_completion_stream_options_t *stream_options; //model
    char *suffix; // string
    double temperature; //numeric
    double top_p; //numeric
    char *user; // string

    int _library_owned; // Is the library responsible for freeing this object?
} create_completion_request_t;

__attribute__((deprecated)) create_completion_request_t *create_completion_request_create(
    create_completion_request_model_t *model,
    create_completion_request_prompt_t *prompt,
    int best_of,
    int echo,
    double frequency_penalty,
    list_t* logit_bias,
    int logprobs,
    int max_tokens,
    int n,
    double presence_penalty,
    int seed,
    create_completion_request_stop_t *stop,
    int stream,
    chat_completion_stream_options_t *stream_options,
    char *suffix,
    double temperature,
    double top_p,
    char *user
);

void create_completion_request_free(create_completion_request_t *create_completion_request);

create_completion_request_t *create_completion_request_parseFromJSON(cJSON *create_completion_requestJSON);

cJSON *create_completion_request_convertToJSON(create_completion_request_t *create_completion_request);

#endif /* _create_completion_request_H_ */

