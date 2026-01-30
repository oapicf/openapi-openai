/*
 * assistant_object_tools_inner.h
 *
 * 
 */

#ifndef _assistant_object_tools_inner_H_
#define _assistant_object_tools_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistant_object_tools_inner_t assistant_object_tools_inner_t;

#include "assistant_tools_code.h"
#include "assistant_tools_file_search.h"
#include "assistant_tools_file_search_file_search.h"
#include "assistant_tools_function.h"
#include "function_object.h"

// Enum TYPE for assistant_object_tools_inner

typedef enum  { openai_api_assistant_object_tools_inner_TYPE_NULL = 0, openai_api_assistant_object_tools_inner_TYPE_code_interpreter, openai_api_assistant_object_tools_inner_TYPE_file_search, openai_api_assistant_object_tools_inner_TYPE_function } openai_api_assistant_object_tools_inner_TYPE_e;

char* assistant_object_tools_inner_type_ToString(openai_api_assistant_object_tools_inner_TYPE_e type);

openai_api_assistant_object_tools_inner_TYPE_e assistant_object_tools_inner_type_FromString(char* type);



typedef struct assistant_object_tools_inner_t {
    openai_api_assistant_object_tools_inner_TYPE_e type; //enum
    struct assistant_tools_file_search_file_search_t *file_search; //model
    struct function_object_t *function; //model

    int _library_owned; // Is the library responsible for freeing this object?
} assistant_object_tools_inner_t;

__attribute__((deprecated)) assistant_object_tools_inner_t *assistant_object_tools_inner_create(
    openai_api_assistant_object_tools_inner_TYPE_e type,
    assistant_tools_file_search_file_search_t *file_search,
    function_object_t *function
);

void assistant_object_tools_inner_free(assistant_object_tools_inner_t *assistant_object_tools_inner);

assistant_object_tools_inner_t *assistant_object_tools_inner_parseFromJSON(cJSON *assistant_object_tools_innerJSON);

cJSON *assistant_object_tools_inner_convertToJSON(assistant_object_tools_inner_t *assistant_object_tools_inner);

#endif /* _assistant_object_tools_inner_H_ */

