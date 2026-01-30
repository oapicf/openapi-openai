/*
 * assistants_named_tool_choice.h
 *
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 */

#ifndef _assistants_named_tool_choice_H_
#define _assistants_named_tool_choice_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistants_named_tool_choice_t assistants_named_tool_choice_t;

#include "assistants_named_tool_choice_function.h"

// Enum TYPE for assistants_named_tool_choice

typedef enum  { openai_api_assistants_named_tool_choice_TYPE_NULL = 0, openai_api_assistants_named_tool_choice_TYPE_function, openai_api_assistants_named_tool_choice_TYPE_code_interpreter, openai_api_assistants_named_tool_choice_TYPE_file_search } openai_api_assistants_named_tool_choice_TYPE_e;

char* assistants_named_tool_choice_type_ToString(openai_api_assistants_named_tool_choice_TYPE_e type);

openai_api_assistants_named_tool_choice_TYPE_e assistants_named_tool_choice_type_FromString(char* type);



typedef struct assistants_named_tool_choice_t {
    openai_api_assistants_named_tool_choice_TYPE_e type; //enum
    struct assistants_named_tool_choice_function_t *function; //model

    int _library_owned; // Is the library responsible for freeing this object?
} assistants_named_tool_choice_t;

__attribute__((deprecated)) assistants_named_tool_choice_t *assistants_named_tool_choice_create(
    openai_api_assistants_named_tool_choice_TYPE_e type,
    assistants_named_tool_choice_function_t *function
);

void assistants_named_tool_choice_free(assistants_named_tool_choice_t *assistants_named_tool_choice);

assistants_named_tool_choice_t *assistants_named_tool_choice_parseFromJSON(cJSON *assistants_named_tool_choiceJSON);

cJSON *assistants_named_tool_choice_convertToJSON(assistants_named_tool_choice_t *assistants_named_tool_choice);

#endif /* _assistants_named_tool_choice_H_ */

