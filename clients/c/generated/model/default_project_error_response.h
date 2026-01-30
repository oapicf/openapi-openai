/*
 * default_project_error_response.h
 *
 * 
 */

#ifndef _default_project_error_response_H_
#define _default_project_error_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct default_project_error_response_t default_project_error_response_t;




typedef struct default_project_error_response_t {
    int code; //numeric
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} default_project_error_response_t;

__attribute__((deprecated)) default_project_error_response_t *default_project_error_response_create(
    int code,
    char *message
);

void default_project_error_response_free(default_project_error_response_t *default_project_error_response);

default_project_error_response_t *default_project_error_response_parseFromJSON(cJSON *default_project_error_responseJSON);

cJSON *default_project_error_response_convertToJSON(default_project_error_response_t *default_project_error_response);

#endif /* _default_project_error_response_H_ */

