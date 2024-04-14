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

#include "create_embedding_response_usage.h"
#include "embedding.h"

// Enum OBJECT for create_embedding_response

typedef enum  { openai_api_create_embedding_response_OBJECT_NULL = 0, openai_api_create_embedding_response_OBJECT_list } openai_api_create_embedding_response_OBJECT_e;

char* create_embedding_response_object_ToString(openai_api_create_embedding_response_OBJECT_e object);

openai_api_create_embedding_response_OBJECT_e create_embedding_response_object_FromString(char* object);



typedef struct create_embedding_response_t {
    list_t *data; //nonprimitive container
    char *model; // string
    openai_api_create_embedding_response_OBJECT_e object; //enum
    struct create_embedding_response_usage_t *usage; //model

} create_embedding_response_t;

create_embedding_response_t *create_embedding_response_create(
    list_t *data,
    char *model,
    openai_api_create_embedding_response_OBJECT_e object,
    create_embedding_response_usage_t *usage
);

void create_embedding_response_free(create_embedding_response_t *create_embedding_response);

create_embedding_response_t *create_embedding_response_parseFromJSON(cJSON *create_embedding_responseJSON);

cJSON *create_embedding_response_convertToJSON(create_embedding_response_t *create_embedding_response);

#endif /* _create_embedding_response_H_ */

