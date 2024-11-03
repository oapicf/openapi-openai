/*
 * assistants_api_named_tool_choice.h
 *
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 */

#ifndef _assistants_api_named_tool_choice_H_
#define _assistants_api_named_tool_choice_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistants_api_named_tool_choice_t assistants_api_named_tool_choice_t;

#include "chat_completion_named_tool_choice_function.h"

// Enum TYPE for assistants_api_named_tool_choice

typedef enum  { openai_api_assistants_api_named_tool_choice_TYPE_NULL = 0, openai_api_assistants_api_named_tool_choice_TYPE_function, openai_api_assistants_api_named_tool_choice_TYPE_code_interpreter, openai_api_assistants_api_named_tool_choice_TYPE_retrieval } openai_api_assistants_api_named_tool_choice_TYPE_e;

char* assistants_api_named_tool_choice_type_ToString(openai_api_assistants_api_named_tool_choice_TYPE_e type);

openai_api_assistants_api_named_tool_choice_TYPE_e assistants_api_named_tool_choice_type_FromString(char* type);



typedef struct assistants_api_named_tool_choice_t {
    openai_api_assistants_api_named_tool_choice_TYPE_e type; //enum
    struct chat_completion_named_tool_choice_function_t *function; //model

} assistants_api_named_tool_choice_t;

assistants_api_named_tool_choice_t *assistants_api_named_tool_choice_create(
    openai_api_assistants_api_named_tool_choice_TYPE_e type,
    chat_completion_named_tool_choice_function_t *function
);

void assistants_api_named_tool_choice_free(assistants_api_named_tool_choice_t *assistants_api_named_tool_choice);

assistants_api_named_tool_choice_t *assistants_api_named_tool_choice_parseFromJSON(cJSON *assistants_api_named_tool_choiceJSON);

cJSON *assistants_api_named_tool_choice_convertToJSON(assistants_api_named_tool_choice_t *assistants_api_named_tool_choice);

#endif /* _assistants_api_named_tool_choice_H_ */

