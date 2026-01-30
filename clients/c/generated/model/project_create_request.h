/*
 * project_create_request.h
 *
 * 
 */

#ifndef _project_create_request_H_
#define _project_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct project_create_request_t project_create_request_t;




typedef struct project_create_request_t {
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} project_create_request_t;

__attribute__((deprecated)) project_create_request_t *project_create_request_create(
    char *name
);

void project_create_request_free(project_create_request_t *project_create_request);

project_create_request_t *project_create_request_parseFromJSON(cJSON *project_create_requestJSON);

cJSON *project_create_request_convertToJSON(project_create_request_t *project_create_request);

#endif /* _project_create_request_H_ */

