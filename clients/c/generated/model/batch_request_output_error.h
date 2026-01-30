/*
 * batch_request_output_error.h
 *
 * For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
 */

#ifndef _batch_request_output_error_H_
#define _batch_request_output_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct batch_request_output_error_t batch_request_output_error_t;




typedef struct batch_request_output_error_t {
    char *code; // string
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} batch_request_output_error_t;

__attribute__((deprecated)) batch_request_output_error_t *batch_request_output_error_create(
    char *code,
    char *message
);

void batch_request_output_error_free(batch_request_output_error_t *batch_request_output_error);

batch_request_output_error_t *batch_request_output_error_parseFromJSON(cJSON *batch_request_output_errorJSON);

cJSON *batch_request_output_error_convertToJSON(batch_request_output_error_t *batch_request_output_error);

#endif /* _batch_request_output_error_H_ */

