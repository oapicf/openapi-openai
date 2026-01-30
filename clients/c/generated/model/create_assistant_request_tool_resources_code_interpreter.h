/*
 * create_assistant_request_tool_resources_code_interpreter.h
 *
 * 
 */

#ifndef _create_assistant_request_tool_resources_code_interpreter_H_
#define _create_assistant_request_tool_resources_code_interpreter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_assistant_request_tool_resources_code_interpreter_t create_assistant_request_tool_resources_code_interpreter_t;




typedef struct create_assistant_request_tool_resources_code_interpreter_t {
    list_t *file_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} create_assistant_request_tool_resources_code_interpreter_t;

__attribute__((deprecated)) create_assistant_request_tool_resources_code_interpreter_t *create_assistant_request_tool_resources_code_interpreter_create(
    list_t *file_ids
);

void create_assistant_request_tool_resources_code_interpreter_free(create_assistant_request_tool_resources_code_interpreter_t *create_assistant_request_tool_resources_code_interpreter);

create_assistant_request_tool_resources_code_interpreter_t *create_assistant_request_tool_resources_code_interpreter_parseFromJSON(cJSON *create_assistant_request_tool_resources_code_interpreterJSON);

cJSON *create_assistant_request_tool_resources_code_interpreter_convertToJSON(create_assistant_request_tool_resources_code_interpreter_t *create_assistant_request_tool_resources_code_interpreter);

#endif /* _create_assistant_request_tool_resources_code_interpreter_H_ */

