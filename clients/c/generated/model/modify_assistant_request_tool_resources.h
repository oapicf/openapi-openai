/*
 * modify_assistant_request_tool_resources.h
 *
 * A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
 */

#ifndef _modify_assistant_request_tool_resources_H_
#define _modify_assistant_request_tool_resources_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct modify_assistant_request_tool_resources_t modify_assistant_request_tool_resources_t;

#include "modify_assistant_request_tool_resources_code_interpreter.h"
#include "modify_assistant_request_tool_resources_file_search.h"



typedef struct modify_assistant_request_tool_resources_t {
    struct modify_assistant_request_tool_resources_code_interpreter_t *code_interpreter; //model
    struct modify_assistant_request_tool_resources_file_search_t *file_search; //model

    int _library_owned; // Is the library responsible for freeing this object?
} modify_assistant_request_tool_resources_t;

__attribute__((deprecated)) modify_assistant_request_tool_resources_t *modify_assistant_request_tool_resources_create(
    modify_assistant_request_tool_resources_code_interpreter_t *code_interpreter,
    modify_assistant_request_tool_resources_file_search_t *file_search
);

void modify_assistant_request_tool_resources_free(modify_assistant_request_tool_resources_t *modify_assistant_request_tool_resources);

modify_assistant_request_tool_resources_t *modify_assistant_request_tool_resources_parseFromJSON(cJSON *modify_assistant_request_tool_resourcesJSON);

cJSON *modify_assistant_request_tool_resources_convertToJSON(modify_assistant_request_tool_resources_t *modify_assistant_request_tool_resources);

#endif /* _modify_assistant_request_tool_resources_H_ */

