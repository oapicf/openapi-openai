/*
 * modify_run_request.h
 *
 * 
 */

#ifndef _modify_run_request_H_
#define _modify_run_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct modify_run_request_t modify_run_request_t;

#include "object.h"



typedef struct modify_run_request_t {
    object_t *metadata; //object

    int _library_owned; // Is the library responsible for freeing this object?
} modify_run_request_t;

__attribute__((deprecated)) modify_run_request_t *modify_run_request_create(
    object_t *metadata
);

void modify_run_request_free(modify_run_request_t *modify_run_request);

modify_run_request_t *modify_run_request_parseFromJSON(cJSON *modify_run_requestJSON);

cJSON *modify_run_request_convertToJSON(modify_run_request_t *modify_run_request);

#endif /* _modify_run_request_H_ */

