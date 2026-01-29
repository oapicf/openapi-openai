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

// Enum ENCODINGFORMAT for create_embedding_request

typedef enum  { openai_api_create_embedding_request_ENCODINGFORMAT_NULL = 0, openai_api_create_embedding_request_ENCODINGFORMAT__float, openai_api_create_embedding_request_ENCODINGFORMAT_base64 } openai_api_create_embedding_request_ENCODINGFORMAT_e;

char* create_embedding_request_encoding_format_ToString(openai_api_create_embedding_request_ENCODINGFORMAT_e encoding_format);

openai_api_create_embedding_request_ENCODINGFORMAT_e create_embedding_request_encoding_format_FromString(char* encoding_format);



typedef struct create_embedding_request_t {
    struct create_embedding_request_input_t *input; //model
    struct create_embedding_request_model_t *model; //model
    openai_api_create_embedding_request_ENCODINGFORMAT_e encoding_format; //enum
    int dimensions; //numeric
    char *user; // string

    int _library_owned; // Is the library responsible for freeing this object?
} create_embedding_request_t;

__attribute__((deprecated)) create_embedding_request_t *create_embedding_request_create(
    create_embedding_request_input_t *input,
    create_embedding_request_model_t *model,
    openai_api_create_embedding_request_ENCODINGFORMAT_e encoding_format,
    int dimensions,
    char *user
);

void create_embedding_request_free(create_embedding_request_t *create_embedding_request);

create_embedding_request_t *create_embedding_request_parseFromJSON(cJSON *create_embedding_requestJSON);

cJSON *create_embedding_request_convertToJSON(create_embedding_request_t *create_embedding_request);

#endif /* _create_embedding_request_H_ */

