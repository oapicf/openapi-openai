/*
 * create_moderation_request_input.h
 *
 * The input text to classify
 */

#ifndef _create_moderation_request_input_H_
#define _create_moderation_request_input_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_moderation_request_input_t create_moderation_request_input_t;




typedef struct create_moderation_request_input_t {

} create_moderation_request_input_t;

create_moderation_request_input_t *create_moderation_request_input_create(
);

void create_moderation_request_input_free(create_moderation_request_input_t *create_moderation_request_input);

create_moderation_request_input_t *create_moderation_request_input_parseFromJSON(cJSON *create_moderation_request_inputJSON);

cJSON *create_moderation_request_input_convertToJSON(create_moderation_request_input_t *create_moderation_request_input);

#endif /* _create_moderation_request_input_H_ */

