/*
 * modify_assistant_request.h
 *
 * 
 */

#ifndef _modify_assistant_request_H_
#define _modify_assistant_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct modify_assistant_request_t modify_assistant_request_t;

#include "assistant_object_tools_inner.h"
#include "object.h"



typedef struct modify_assistant_request_t {
    char *model; // string
    char *name; // string
    char *description; // string
    char *instructions; // string
    list_t *tools; //nonprimitive container
    list_t *file_ids; //primitive container
    object_t *metadata; //object

} modify_assistant_request_t;

modify_assistant_request_t *modify_assistant_request_create(
    char *model,
    char *name,
    char *description,
    char *instructions,
    list_t *tools,
    list_t *file_ids,
    object_t *metadata
);

void modify_assistant_request_free(modify_assistant_request_t *modify_assistant_request);

modify_assistant_request_t *modify_assistant_request_parseFromJSON(cJSON *modify_assistant_requestJSON);

cJSON *modify_assistant_request_convertToJSON(modify_assistant_request_t *modify_assistant_request);

#endif /* _modify_assistant_request_H_ */

