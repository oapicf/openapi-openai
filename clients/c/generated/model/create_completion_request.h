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

#include "create_completion_request_model.h"
#include "create_completion_request_prompt.h"
#include "create_completion_request_stop.h"
#include "object.h"



typedef struct create_completion_request_t {
    struct create_completion_request_model_t *model; //model
    struct create_completion_request_prompt_t *prompt; //model
    char *suffix; // string
    int max_tokens; //numeric
    double temperature; //numeric
    double top_p; //numeric
    int n; //numeric
    int stream; //boolean
    int logprobs; //numeric
    int echo; //boolean
    struct create_completion_request_stop_t *stop; //model
    double presence_penalty; //numeric
    double frequency_penalty; //numeric
    int best_of; //numeric
    object_t *logit_bias; //object
    char *user; // string

} create_completion_request_t;

create_completion_request_t *create_completion_request_create(
    create_completion_request_model_t *model,
    create_completion_request_prompt_t *prompt,
    char *suffix,
    int max_tokens,
    double temperature,
    double top_p,
    int n,
    int stream,
    int logprobs,
    int echo,
    create_completion_request_stop_t *stop,
    double presence_penalty,
    double frequency_penalty,
    int best_of,
    object_t *logit_bias,
    char *user
);

void create_completion_request_free(create_completion_request_t *create_completion_request);

create_completion_request_t *create_completion_request_parseFromJSON(cJSON *create_completion_requestJSON);

cJSON *create_completion_request_convertToJSON(create_completion_request_t *create_completion_request);

#endif /* _create_completion_request_H_ */

