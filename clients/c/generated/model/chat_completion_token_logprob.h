/*
 * chat_completion_token_logprob.h
 *
 * 
 */

#ifndef _chat_completion_token_logprob_H_
#define _chat_completion_token_logprob_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_token_logprob_t chat_completion_token_logprob_t;

#include "chat_completion_token_logprob_top_logprobs_inner.h"



typedef struct chat_completion_token_logprob_t {
    char *token; // string
    double logprob; //numeric
    list_t *bytes; //primitive container
    list_t *top_logprobs; //nonprimitive container

} chat_completion_token_logprob_t;

chat_completion_token_logprob_t *chat_completion_token_logprob_create(
    char *token,
    double logprob,
    list_t *bytes,
    list_t *top_logprobs
);

void chat_completion_token_logprob_free(chat_completion_token_logprob_t *chat_completion_token_logprob);

chat_completion_token_logprob_t *chat_completion_token_logprob_parseFromJSON(cJSON *chat_completion_token_logprobJSON);

cJSON *chat_completion_token_logprob_convertToJSON(chat_completion_token_logprob_t *chat_completion_token_logprob);

#endif /* _chat_completion_token_logprob_H_ */

