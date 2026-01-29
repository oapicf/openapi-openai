/*
 * error.h
 *
 * 
 */

#ifndef _error_H_
#define _error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct error_t error_t;




typedef struct error_t {
    char *code; // string
    char *message; // string
    char *param; // string
    char *type; // string

    int _library_owned; // Is the library responsible for freeing this object?
} error_t;

__attribute__((deprecated)) error_t *error_create(
    char *code,
    char *message,
    char *param,
    char *type
);

void error_free(error_t *error);

error_t *error_parseFromJSON(cJSON *errorJSON);

cJSON *error_convertToJSON(error_t *error);

#endif /* _error_H_ */

