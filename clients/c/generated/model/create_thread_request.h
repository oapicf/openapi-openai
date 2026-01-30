/*
 * create_thread_request.h
 *
 * 
 */

#ifndef _create_thread_request_H_
#define _create_thread_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_thread_request_t create_thread_request_t;

#include "create_message_request.h"
#include "create_thread_request_tool_resources.h"
#include "object.h"



typedef struct create_thread_request_t {
    list_t *messages; //nonprimitive container
    struct create_thread_request_tool_resources_t *tool_resources; //model
    object_t *metadata; //object

    int _library_owned; // Is the library responsible for freeing this object?
} create_thread_request_t;

__attribute__((deprecated)) create_thread_request_t *create_thread_request_create(
    list_t *messages,
    create_thread_request_tool_resources_t *tool_resources,
    object_t *metadata
);

void create_thread_request_free(create_thread_request_t *create_thread_request);

create_thread_request_t *create_thread_request_parseFromJSON(cJSON *create_thread_requestJSON);

cJSON *create_thread_request_convertToJSON(create_thread_request_t *create_thread_request);

#endif /* _create_thread_request_H_ */

