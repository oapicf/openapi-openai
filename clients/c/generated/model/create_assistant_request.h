/*
 * create_assistant_request.h
 *
 * 
 */

#ifndef _create_assistant_request_H_
#define _create_assistant_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_assistant_request_t create_assistant_request_t;

#include "assistant_object_tools_inner.h"
#include "create_assistant_request_model.h"
#include "object.h"



typedef struct create_assistant_request_t {
    struct create_assistant_request_model_t *model; //model
    char *name; // string
    char *description; // string
    char *instructions; // string
    list_t *tools; //nonprimitive container
    list_t *file_ids; //primitive container
    object_t *metadata; //object

    int _library_owned; // Is the library responsible for freeing this object?
} create_assistant_request_t;

__attribute__((deprecated)) create_assistant_request_t *create_assistant_request_create(
    create_assistant_request_model_t *model,
    char *name,
    char *description,
    char *instructions,
    list_t *tools,
    list_t *file_ids,
    object_t *metadata
);

void create_assistant_request_free(create_assistant_request_t *create_assistant_request);

create_assistant_request_t *create_assistant_request_parseFromJSON(cJSON *create_assistant_requestJSON);

cJSON *create_assistant_request_convertToJSON(create_assistant_request_t *create_assistant_request);

#endif /* _create_assistant_request_H_ */

