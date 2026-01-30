/*
 * batch_request_output_response.h
 *
 * 
 */

#ifndef _batch_request_output_response_H_
#define _batch_request_output_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct batch_request_output_response_t batch_request_output_response_t;

#include "object.h"



typedef struct batch_request_output_response_t {
    int status_code; //numeric
    char *request_id; // string
    object_t *body; //object

    int _library_owned; // Is the library responsible for freeing this object?
} batch_request_output_response_t;

__attribute__((deprecated)) batch_request_output_response_t *batch_request_output_response_create(
    int status_code,
    char *request_id,
    object_t *body
);

void batch_request_output_response_free(batch_request_output_response_t *batch_request_output_response);

batch_request_output_response_t *batch_request_output_response_parseFromJSON(cJSON *batch_request_output_responseJSON);

cJSON *batch_request_output_response_convertToJSON(batch_request_output_response_t *batch_request_output_response);

#endif /* _batch_request_output_response_H_ */

