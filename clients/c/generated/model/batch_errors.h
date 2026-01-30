/*
 * batch_errors.h
 *
 * 
 */

#ifndef _batch_errors_H_
#define _batch_errors_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct batch_errors_t batch_errors_t;

#include "batch_errors_data_inner.h"



typedef struct batch_errors_t {
    char *object; // string
    list_t *data; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} batch_errors_t;

__attribute__((deprecated)) batch_errors_t *batch_errors_create(
    char *object,
    list_t *data
);

void batch_errors_free(batch_errors_t *batch_errors);

batch_errors_t *batch_errors_parseFromJSON(cJSON *batch_errorsJSON);

cJSON *batch_errors_convertToJSON(batch_errors_t *batch_errors);

#endif /* _batch_errors_H_ */

