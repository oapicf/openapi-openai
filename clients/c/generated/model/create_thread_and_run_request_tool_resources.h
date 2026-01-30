/*
 * create_thread_and_run_request_tool_resources.h
 *
 * A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
 */

#ifndef _create_thread_and_run_request_tool_resources_H_
#define _create_thread_and_run_request_tool_resources_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_thread_and_run_request_tool_resources_t create_thread_and_run_request_tool_resources_t;

#include "assistant_object_tool_resources_file_search.h"
#include "create_assistant_request_tool_resources_code_interpreter.h"



typedef struct create_thread_and_run_request_tool_resources_t {
    struct create_assistant_request_tool_resources_code_interpreter_t *code_interpreter; //model
    struct assistant_object_tool_resources_file_search_t *file_search; //model

    int _library_owned; // Is the library responsible for freeing this object?
} create_thread_and_run_request_tool_resources_t;

__attribute__((deprecated)) create_thread_and_run_request_tool_resources_t *create_thread_and_run_request_tool_resources_create(
    create_assistant_request_tool_resources_code_interpreter_t *code_interpreter,
    assistant_object_tool_resources_file_search_t *file_search
);

void create_thread_and_run_request_tool_resources_free(create_thread_and_run_request_tool_resources_t *create_thread_and_run_request_tool_resources);

create_thread_and_run_request_tool_resources_t *create_thread_and_run_request_tool_resources_parseFromJSON(cJSON *create_thread_and_run_request_tool_resourcesJSON);

cJSON *create_thread_and_run_request_tool_resources_convertToJSON(create_thread_and_run_request_tool_resources_t *create_thread_and_run_request_tool_resources);

#endif /* _create_thread_and_run_request_tool_resources_H_ */

