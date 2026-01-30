/*
 * assistant_object_tool_resources_code_interpreter.h
 *
 * 
 */

#ifndef _assistant_object_tool_resources_code_interpreter_H_
#define _assistant_object_tool_resources_code_interpreter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistant_object_tool_resources_code_interpreter_t assistant_object_tool_resources_code_interpreter_t;




typedef struct assistant_object_tool_resources_code_interpreter_t {
    list_t *file_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} assistant_object_tool_resources_code_interpreter_t;

__attribute__((deprecated)) assistant_object_tool_resources_code_interpreter_t *assistant_object_tool_resources_code_interpreter_create(
    list_t *file_ids
);

void assistant_object_tool_resources_code_interpreter_free(assistant_object_tool_resources_code_interpreter_t *assistant_object_tool_resources_code_interpreter);

assistant_object_tool_resources_code_interpreter_t *assistant_object_tool_resources_code_interpreter_parseFromJSON(cJSON *assistant_object_tool_resources_code_interpreterJSON);

cJSON *assistant_object_tool_resources_code_interpreter_convertToJSON(assistant_object_tool_resources_code_interpreter_t *assistant_object_tool_resources_code_interpreter);

#endif /* _assistant_object_tool_resources_code_interpreter_H_ */

