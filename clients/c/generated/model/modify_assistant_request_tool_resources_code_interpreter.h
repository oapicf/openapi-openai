/*
 * modify_assistant_request_tool_resources_code_interpreter.h
 *
 * 
 */

#ifndef _modify_assistant_request_tool_resources_code_interpreter_H_
#define _modify_assistant_request_tool_resources_code_interpreter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct modify_assistant_request_tool_resources_code_interpreter_t modify_assistant_request_tool_resources_code_interpreter_t;




typedef struct modify_assistant_request_tool_resources_code_interpreter_t {
    list_t *file_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} modify_assistant_request_tool_resources_code_interpreter_t;

__attribute__((deprecated)) modify_assistant_request_tool_resources_code_interpreter_t *modify_assistant_request_tool_resources_code_interpreter_create(
    list_t *file_ids
);

void modify_assistant_request_tool_resources_code_interpreter_free(modify_assistant_request_tool_resources_code_interpreter_t *modify_assistant_request_tool_resources_code_interpreter);

modify_assistant_request_tool_resources_code_interpreter_t *modify_assistant_request_tool_resources_code_interpreter_parseFromJSON(cJSON *modify_assistant_request_tool_resources_code_interpreterJSON);

cJSON *modify_assistant_request_tool_resources_code_interpreter_convertToJSON(modify_assistant_request_tool_resources_code_interpreter_t *modify_assistant_request_tool_resources_code_interpreter);

#endif /* _modify_assistant_request_tool_resources_code_interpreter_H_ */

