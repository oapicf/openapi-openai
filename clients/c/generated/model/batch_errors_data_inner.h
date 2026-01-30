/*
 * batch_errors_data_inner.h
 *
 * 
 */

#ifndef _batch_errors_data_inner_H_
#define _batch_errors_data_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct batch_errors_data_inner_t batch_errors_data_inner_t;




typedef struct batch_errors_data_inner_t {
    char *code; // string
    char *message; // string
    char *param; // string
    int line; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} batch_errors_data_inner_t;

__attribute__((deprecated)) batch_errors_data_inner_t *batch_errors_data_inner_create(
    char *code,
    char *message,
    char *param,
    int line
);

void batch_errors_data_inner_free(batch_errors_data_inner_t *batch_errors_data_inner);

batch_errors_data_inner_t *batch_errors_data_inner_parseFromJSON(cJSON *batch_errors_data_innerJSON);

cJSON *batch_errors_data_inner_convertToJSON(batch_errors_data_inner_t *batch_errors_data_inner);

#endif /* _batch_errors_data_inner_H_ */

