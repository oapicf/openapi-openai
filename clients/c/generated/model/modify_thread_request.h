/*
 * modify_thread_request.h
 *
 * 
 */

#ifndef _modify_thread_request_H_
#define _modify_thread_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct modify_thread_request_t modify_thread_request_t;

#include "modify_thread_request_tool_resources.h"
#include "object.h"



typedef struct modify_thread_request_t {
    struct modify_thread_request_tool_resources_t *tool_resources; //model
    object_t *metadata; //object

    int _library_owned; // Is the library responsible for freeing this object?
} modify_thread_request_t;

__attribute__((deprecated)) modify_thread_request_t *modify_thread_request_create(
    modify_thread_request_tool_resources_t *tool_resources,
    object_t *metadata
);

void modify_thread_request_free(modify_thread_request_t *modify_thread_request);

modify_thread_request_t *modify_thread_request_parseFromJSON(cJSON *modify_thread_requestJSON);

cJSON *modify_thread_request_convertToJSON(modify_thread_request_t *modify_thread_request);

#endif /* _modify_thread_request_H_ */

