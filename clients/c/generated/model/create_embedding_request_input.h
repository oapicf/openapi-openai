/*
 * create_embedding_request_input.h
 *
 * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for &#x60;text-embedding-ada-002&#x60;), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
 */

#ifndef _create_embedding_request_input_H_
#define _create_embedding_request_input_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_embedding_request_input_t create_embedding_request_input_t;




typedef struct create_embedding_request_input_t {

} create_embedding_request_input_t;

create_embedding_request_input_t *create_embedding_request_input_create(
);

void create_embedding_request_input_free(create_embedding_request_input_t *create_embedding_request_input);

create_embedding_request_input_t *create_embedding_request_input_parseFromJSON(cJSON *create_embedding_request_inputJSON);

cJSON *create_embedding_request_input_convertToJSON(create_embedding_request_input_t *create_embedding_request_input);

#endif /* _create_embedding_request_input_H_ */

