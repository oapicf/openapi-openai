/*
 * create_moderation_request.h
 *
 * 
 */

#ifndef _create_moderation_request_H_
#define _create_moderation_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_moderation_request_t create_moderation_request_t;

#include "create_moderation_request_input.h"
#include "create_moderation_request_model.h"



typedef struct create_moderation_request_t {
    struct create_moderation_request_input_t *input; //model
    struct create_moderation_request_model_t *model; //model

    int _library_owned; // Is the library responsible for freeing this object?
} create_moderation_request_t;

__attribute__((deprecated)) create_moderation_request_t *create_moderation_request_create(
    create_moderation_request_input_t *input,
    create_moderation_request_model_t *model
);

void create_moderation_request_free(create_moderation_request_t *create_moderation_request);

create_moderation_request_t *create_moderation_request_parseFromJSON(cJSON *create_moderation_requestJSON);

cJSON *create_moderation_request_convertToJSON(create_moderation_request_t *create_moderation_request);

#endif /* _create_moderation_request_H_ */

