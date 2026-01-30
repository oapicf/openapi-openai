/*
 * assistants_named_tool_choice_function.h
 *
 * 
 */

#ifndef _assistants_named_tool_choice_function_H_
#define _assistants_named_tool_choice_function_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistants_named_tool_choice_function_t assistants_named_tool_choice_function_t;




typedef struct assistants_named_tool_choice_function_t {
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} assistants_named_tool_choice_function_t;

__attribute__((deprecated)) assistants_named_tool_choice_function_t *assistants_named_tool_choice_function_create(
    char *name
);

void assistants_named_tool_choice_function_free(assistants_named_tool_choice_function_t *assistants_named_tool_choice_function);

assistants_named_tool_choice_function_t *assistants_named_tool_choice_function_parseFromJSON(cJSON *assistants_named_tool_choice_functionJSON);

cJSON *assistants_named_tool_choice_function_convertToJSON(assistants_named_tool_choice_function_t *assistants_named_tool_choice_function);

#endif /* _assistants_named_tool_choice_function_H_ */

