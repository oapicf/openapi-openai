/*
 * create_embedding_request.h
 *
 * 
 */

#ifndef _create_embedding_request_H_
#define _create_embedding_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_embedding_request_t create_embedding_request_t;

#include "create_embedding_request_input.h"
#include "create_embedding_request_model.h"



typedef struct create_embedding_request_t {
    struct create_embedding_request_model_t *model; //model
    struct create_embedding_request_input_t *input; //model
    char *user; // string

} create_embedding_request_t;

create_embedding_request_t *create_embedding_request_create(
    create_embedding_request_model_t *model,
    create_embedding_request_input_t *input,
    char *user
);

void create_embedding_request_free(create_embedding_request_t *create_embedding_request);

create_embedding_request_t *create_embedding_request_parseFromJSON(cJSON *create_embedding_requestJSON);

cJSON *create_embedding_request_convertToJSON(create_embedding_request_t *create_embedding_request);

#endif /* _create_embedding_request_H_ */

