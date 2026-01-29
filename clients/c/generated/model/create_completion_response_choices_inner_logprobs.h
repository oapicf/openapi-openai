/*
 * create_completion_response_choices_inner_logprobs.h
 *
 * 
 */

#ifndef _create_completion_response_choices_inner_logprobs_H_
#define _create_completion_response_choices_inner_logprobs_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_completion_response_choices_inner_logprobs_t create_completion_response_choices_inner_logprobs_t;




typedef struct create_completion_response_choices_inner_logprobs_t {
    list_t *text_offset; //primitive container
    list_t *token_logprobs; //primitive container
    list_t *tokens; //primitive container
    list_t *top_logprobs; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} create_completion_response_choices_inner_logprobs_t;

__attribute__((deprecated)) create_completion_response_choices_inner_logprobs_t *create_completion_response_choices_inner_logprobs_create(
    list_t *text_offset,
    list_t *token_logprobs,
    list_t *tokens,
    list_t *top_logprobs
);

void create_completion_response_choices_inner_logprobs_free(create_completion_response_choices_inner_logprobs_t *create_completion_response_choices_inner_logprobs);

create_completion_response_choices_inner_logprobs_t *create_completion_response_choices_inner_logprobs_parseFromJSON(cJSON *create_completion_response_choices_inner_logprobsJSON);

cJSON *create_completion_response_choices_inner_logprobs_convertToJSON(create_completion_response_choices_inner_logprobs_t *create_completion_response_choices_inner_logprobs);

#endif /* _create_completion_response_choices_inner_logprobs_H_ */

