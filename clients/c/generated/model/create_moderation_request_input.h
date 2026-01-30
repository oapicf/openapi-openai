/*
 * create_moderation_request_input.h
 *
 * Input (or inputs) to classify. Can be a single string, an array of strings, or an array of multi-modal input objects similar to other models. 
 */

#ifndef _create_moderation_request_input_H_
#define _create_moderation_request_input_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_moderation_request_input_t create_moderation_request_input_t;

#include "create_moderation_request_input_one_of_inner.h"



typedef struct create_moderation_request_input_t {

    int _library_owned; // Is the library responsible for freeing this object?
} create_moderation_request_input_t;

__attribute__((deprecated)) create_moderation_request_input_t *create_moderation_request_input_create(
);

void create_moderation_request_input_free(create_moderation_request_input_t *create_moderation_request_input);

create_moderation_request_input_t *create_moderation_request_input_parseFromJSON(cJSON *create_moderation_request_inputJSON);

cJSON *create_moderation_request_input_convertToJSON(create_moderation_request_input_t *create_moderation_request_input);

#endif /* _create_moderation_request_input_H_ */

