/*
 * create_embedding_response_data_inner.h
 *
 * 
 */

#ifndef _create_embedding_response_data_inner_H_
#define _create_embedding_response_data_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_embedding_response_data_inner_t create_embedding_response_data_inner_t;




typedef struct create_embedding_response_data_inner_t {
    int index; //numeric
    char *object; // string
    list_t *embedding; //primitive container

} create_embedding_response_data_inner_t;

create_embedding_response_data_inner_t *create_embedding_response_data_inner_create(
    int index,
    char *object,
    list_t *embedding
);

void create_embedding_response_data_inner_free(create_embedding_response_data_inner_t *create_embedding_response_data_inner);

create_embedding_response_data_inner_t *create_embedding_response_data_inner_parseFromJSON(cJSON *create_embedding_response_data_innerJSON);

cJSON *create_embedding_response_data_inner_convertToJSON(create_embedding_response_data_inner_t *create_embedding_response_data_inner);

#endif /* _create_embedding_response_data_inner_H_ */

