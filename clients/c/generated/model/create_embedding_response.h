/*
 * create_embedding_response.h
 *
 * 
 */

#ifndef _create_embedding_response_H_
#define _create_embedding_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_embedding_response_t create_embedding_response_t;

#include "create_embedding_response_data_inner.h"
#include "create_embedding_response_usage.h"



typedef struct create_embedding_response_t {
    char *object; // string
    char *model; // string
    list_t *data; //nonprimitive container
    struct create_embedding_response_usage_t *usage; //model

} create_embedding_response_t;

create_embedding_response_t *create_embedding_response_create(
    char *object,
    char *model,
    list_t *data,
    create_embedding_response_usage_t *usage
);

void create_embedding_response_free(create_embedding_response_t *create_embedding_response);

create_embedding_response_t *create_embedding_response_parseFromJSON(cJSON *create_embedding_responseJSON);

cJSON *create_embedding_response_convertToJSON(create_embedding_response_t *create_embedding_response);

#endif /* _create_embedding_response_H_ */

