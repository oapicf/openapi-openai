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
#include "assistants_api_response_format_option.h"
#include "modify_assistant_request_tool_resources.h"
#include "object.h"



typedef struct modify_assistant_request_t {
    char *model; // string
    char *name; // string
    char *description; // string
    char *instructions; // string
    list_t *tools; //nonprimitive container
    struct modify_assistant_request_tool_resources_t *tool_resources; //model
    object_t *metadata; //object
    double temperature; //numeric
    double top_p; //numeric
    struct assistants_api_response_format_option_t *response_format; //model

    int _library_owned; // Is the library responsible for freeing this object?
} modify_assistant_request_t;

__attribute__((deprecated)) modify_assistant_request_t *modify_assistant_request_create(
    char *model,
    char *name,
    char *description,
    char *instructions,
    list_t *tools,
    modify_assistant_request_tool_resources_t *tool_resources,
    object_t *metadata,
    double temperature,
    double top_p,
    assistants_api_response_format_option_t *response_format
);

void modify_assistant_request_free(modify_assistant_request_t *modify_assistant_request);

modify_assistant_request_t *modify_assistant_request_parseFromJSON(cJSON *modify_assistant_requestJSON);

cJSON *modify_assistant_request_convertToJSON(modify_assistant_request_t *modify_assistant_request);

#endif /* _modify_assistant_request_H_ */

