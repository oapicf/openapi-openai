/*
 * create_chat_completion_response_choices_inner_logprobs.h
 *
 * Log probability information for the choice.
 */

#ifndef _create_chat_completion_response_choices_inner_logprobs_H_
#define _create_chat_completion_response_choices_inner_logprobs_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_completion_response_choices_inner_logprobs_t create_chat_completion_response_choices_inner_logprobs_t;

#include "chat_completion_token_logprob.h"



typedef struct create_chat_completion_response_choices_inner_logprobs_t {
    list_t *content; //nonprimitive container
    list_t *refusal; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} create_chat_completion_response_choices_inner_logprobs_t;

__attribute__((deprecated)) create_chat_completion_response_choices_inner_logprobs_t *create_chat_completion_response_choices_inner_logprobs_create(
    list_t *content,
    list_t *refusal
);

void create_chat_completion_response_choices_inner_logprobs_free(create_chat_completion_response_choices_inner_logprobs_t *create_chat_completion_response_choices_inner_logprobs);

create_chat_completion_response_choices_inner_logprobs_t *create_chat_completion_response_choices_inner_logprobs_parseFromJSON(cJSON *create_chat_completion_response_choices_inner_logprobsJSON);

cJSON *create_chat_completion_response_choices_inner_logprobs_convertToJSON(create_chat_completion_response_choices_inner_logprobs_t *create_chat_completion_response_choices_inner_logprobs);

#endif /* _create_chat_completion_response_choices_inner_logprobs_H_ */

