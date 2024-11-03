/*
 * chat_completion_token_logprob_top_logprobs_inner.h
 *
 * 
 */

#ifndef _chat_completion_token_logprob_top_logprobs_inner_H_
#define _chat_completion_token_logprob_top_logprobs_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_token_logprob_top_logprobs_inner_t chat_completion_token_logprob_top_logprobs_inner_t;




typedef struct chat_completion_token_logprob_top_logprobs_inner_t {
    char *token; // string
    double logprob; //numeric
    list_t *bytes; //primitive container

} chat_completion_token_logprob_top_logprobs_inner_t;

chat_completion_token_logprob_top_logprobs_inner_t *chat_completion_token_logprob_top_logprobs_inner_create(
    char *token,
    double logprob,
    list_t *bytes
);

void chat_completion_token_logprob_top_logprobs_inner_free(chat_completion_token_logprob_top_logprobs_inner_t *chat_completion_token_logprob_top_logprobs_inner);

chat_completion_token_logprob_top_logprobs_inner_t *chat_completion_token_logprob_top_logprobs_inner_parseFromJSON(cJSON *chat_completion_token_logprob_top_logprobs_innerJSON);

cJSON *chat_completion_token_logprob_top_logprobs_inner_convertToJSON(chat_completion_token_logprob_top_logprobs_inner_t *chat_completion_token_logprob_top_logprobs_inner);

#endif /* _chat_completion_token_logprob_top_logprobs_inner_H_ */

