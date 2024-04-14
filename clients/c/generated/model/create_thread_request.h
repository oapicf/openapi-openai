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
#include "object.h"



typedef struct create_thread_request_t {
    list_t *messages; //nonprimitive container
    object_t *metadata; //object

} create_thread_request_t;

create_thread_request_t *create_thread_request_create(
    list_t *messages,
    object_t *metadata
);

void create_thread_request_free(create_thread_request_t *create_thread_request);

create_thread_request_t *create_thread_request_parseFromJSON(cJSON *create_thread_requestJSON);

cJSON *create_thread_request_convertToJSON(create_thread_request_t *create_thread_request);

#endif /* _create_thread_request_H_ */

