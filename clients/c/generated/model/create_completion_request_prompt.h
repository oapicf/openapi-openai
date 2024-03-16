/*
 * create_completion_request_prompt.h
 *
 * The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that &lt;|endoftext|&gt; is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
 */

#ifndef _create_completion_request_prompt_H_
#define _create_completion_request_prompt_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_completion_request_prompt_t create_completion_request_prompt_t;




typedef struct create_completion_request_prompt_t {

} create_completion_request_prompt_t;

create_completion_request_prompt_t *create_completion_request_prompt_create(
);

void create_completion_request_prompt_free(create_completion_request_prompt_t *create_completion_request_prompt);

create_completion_request_prompt_t *create_completion_request_prompt_parseFromJSON(cJSON *create_completion_request_promptJSON);

cJSON *create_completion_request_prompt_convertToJSON(create_completion_request_prompt_t *create_completion_request_prompt);

#endif /* _create_completion_request_prompt_H_ */

