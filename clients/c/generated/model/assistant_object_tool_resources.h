/*
 * assistant_object_tool_resources.h
 *
 * A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
 */

#ifndef _assistant_object_tool_resources_H_
#define _assistant_object_tool_resources_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistant_object_tool_resources_t assistant_object_tool_resources_t;

#include "assistant_object_tool_resources_code_interpreter.h"
#include "assistant_object_tool_resources_file_search.h"



typedef struct assistant_object_tool_resources_t {
    struct assistant_object_tool_resources_code_interpreter_t *code_interpreter; //model
    struct assistant_object_tool_resources_file_search_t *file_search; //model

    int _library_owned; // Is the library responsible for freeing this object?
} assistant_object_tool_resources_t;

__attribute__((deprecated)) assistant_object_tool_resources_t *assistant_object_tool_resources_create(
    assistant_object_tool_resources_code_interpreter_t *code_interpreter,
    assistant_object_tool_resources_file_search_t *file_search
);

void assistant_object_tool_resources_free(assistant_object_tool_resources_t *assistant_object_tool_resources);

assistant_object_tool_resources_t *assistant_object_tool_resources_parseFromJSON(cJSON *assistant_object_tool_resourcesJSON);

cJSON *assistant_object_tool_resources_convertToJSON(assistant_object_tool_resources_t *assistant_object_tool_resources);

#endif /* _assistant_object_tool_resources_H_ */

