/*
 * create_assistant_file_request.h
 *
 * 
 */

#ifndef _create_assistant_file_request_H_
#define _create_assistant_file_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_assistant_file_request_t create_assistant_file_request_t;




typedef struct create_assistant_file_request_t {
    char *file_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} create_assistant_file_request_t;

__attribute__((deprecated)) create_assistant_file_request_t *create_assistant_file_request_create(
    char *file_id
);

void create_assistant_file_request_free(create_assistant_file_request_t *create_assistant_file_request);

create_assistant_file_request_t *create_assistant_file_request_parseFromJSON(cJSON *create_assistant_file_requestJSON);

cJSON *create_assistant_file_request_convertToJSON(create_assistant_file_request_t *create_assistant_file_request);

#endif /* _create_assistant_file_request_H_ */

