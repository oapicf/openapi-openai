/*
 * assistant_tools_function.h
 *
 * 
 */

#ifndef _assistant_tools_function_H_
#define _assistant_tools_function_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistant_tools_function_t assistant_tools_function_t;

#include "function_object.h"

// Enum TYPE for assistant_tools_function

typedef enum  { openai_api_assistant_tools_function_TYPE_NULL = 0, openai_api_assistant_tools_function_TYPE_function } openai_api_assistant_tools_function_TYPE_e;

char* assistant_tools_function_type_ToString(openai_api_assistant_tools_function_TYPE_e type);

openai_api_assistant_tools_function_TYPE_e assistant_tools_function_type_FromString(char* type);



typedef struct assistant_tools_function_t {
    openai_api_assistant_tools_function_TYPE_e type; //enum
    struct function_object_t *function; //model

    int _library_owned; // Is the library responsible for freeing this object?
} assistant_tools_function_t;

__attribute__((deprecated)) assistant_tools_function_t *assistant_tools_function_create(
    openai_api_assistant_tools_function_TYPE_e type,
    function_object_t *function
);

void assistant_tools_function_free(assistant_tools_function_t *assistant_tools_function);

assistant_tools_function_t *assistant_tools_function_parseFromJSON(cJSON *assistant_tools_functionJSON);

cJSON *assistant_tools_function_convertToJSON(assistant_tools_function_t *assistant_tools_function);

#endif /* _assistant_tools_function_H_ */

