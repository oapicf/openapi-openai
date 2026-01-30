/*
 * batch_request_input.h
 *
 * The per-line object of the batch input file
 */

#ifndef _batch_request_input_H_
#define _batch_request_input_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct batch_request_input_t batch_request_input_t;


// Enum METHOD for batch_request_input

typedef enum  { openai_api_batch_request_input_METHOD_NULL = 0, openai_api_batch_request_input_METHOD_POST } openai_api_batch_request_input_METHOD_e;

char* batch_request_input_method_ToString(openai_api_batch_request_input_METHOD_e method);

openai_api_batch_request_input_METHOD_e batch_request_input_method_FromString(char* method);



typedef struct batch_request_input_t {
    char *custom_id; // string
    openai_api_batch_request_input_METHOD_e method; //enum
    char *url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} batch_request_input_t;

__attribute__((deprecated)) batch_request_input_t *batch_request_input_create(
    char *custom_id,
    openai_api_batch_request_input_METHOD_e method,
    char *url
);

void batch_request_input_free(batch_request_input_t *batch_request_input);

batch_request_input_t *batch_request_input_parseFromJSON(cJSON *batch_request_inputJSON);

cJSON *batch_request_input_convertToJSON(batch_request_input_t *batch_request_input);

#endif /* _batch_request_input_H_ */

