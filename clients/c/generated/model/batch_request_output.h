/*
 * batch_request_output.h
 *
 * The per-line object of the batch output and error files
 */

#ifndef _batch_request_output_H_
#define _batch_request_output_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct batch_request_output_t batch_request_output_t;

#include "batch_request_output_error.h"
#include "batch_request_output_response.h"



typedef struct batch_request_output_t {
    char *id; // string
    char *custom_id; // string
    struct batch_request_output_response_t *response; //model
    struct batch_request_output_error_t *error; //model

    int _library_owned; // Is the library responsible for freeing this object?
} batch_request_output_t;

__attribute__((deprecated)) batch_request_output_t *batch_request_output_create(
    char *id,
    char *custom_id,
    batch_request_output_response_t *response,
    batch_request_output_error_t *error
);

void batch_request_output_free(batch_request_output_t *batch_request_output);

batch_request_output_t *batch_request_output_parseFromJSON(cJSON *batch_request_outputJSON);

cJSON *batch_request_output_convertToJSON(batch_request_output_t *batch_request_output);

#endif /* _batch_request_output_H_ */

