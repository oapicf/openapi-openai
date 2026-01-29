/*
 * create_run_request_model.h
 *
 * The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
 */

#ifndef _create_run_request_model_H_
#define _create_run_request_model_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_run_request_model_t create_run_request_model_t;




typedef struct create_run_request_model_t {

    int _library_owned; // Is the library responsible for freeing this object?
} create_run_request_model_t;

__attribute__((deprecated)) create_run_request_model_t *create_run_request_model_create(
);

void create_run_request_model_free(create_run_request_model_t *create_run_request_model);

create_run_request_model_t *create_run_request_model_parseFromJSON(cJSON *create_run_request_modelJSON);

cJSON *create_run_request_model_convertToJSON(create_run_request_model_t *create_run_request_model);

#endif /* _create_run_request_model_H_ */

