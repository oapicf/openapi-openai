/*
 * chat_completion_named_tool_choice.h
 *
 * Specifies a tool the model should use. Use to force the model to call a specific function.
 */

#ifndef _chat_completion_named_tool_choice_H_
#define _chat_completion_named_tool_choice_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_named_tool_choice_t chat_completion_named_tool_choice_t;

#include "chat_completion_named_tool_choice_function.h"

// Enum TYPE for chat_completion_named_tool_choice

typedef enum  { openai_api_chat_completion_named_tool_choice_TYPE_NULL = 0, openai_api_chat_completion_named_tool_choice_TYPE_function } openai_api_chat_completion_named_tool_choice_TYPE_e;

char* chat_completion_named_tool_choice_type_ToString(openai_api_chat_completion_named_tool_choice_TYPE_e type);

openai_api_chat_completion_named_tool_choice_TYPE_e chat_completion_named_tool_choice_type_FromString(char* type);



typedef struct chat_completion_named_tool_choice_t {
    openai_api_chat_completion_named_tool_choice_TYPE_e type; //enum
    struct chat_completion_named_tool_choice_function_t *function; //model

    int _library_owned; // Is the library responsible for freeing this object?
} chat_completion_named_tool_choice_t;

__attribute__((deprecated)) chat_completion_named_tool_choice_t *chat_completion_named_tool_choice_create(
    openai_api_chat_completion_named_tool_choice_TYPE_e type,
    chat_completion_named_tool_choice_function_t *function
);

void chat_completion_named_tool_choice_free(chat_completion_named_tool_choice_t *chat_completion_named_tool_choice);

chat_completion_named_tool_choice_t *chat_completion_named_tool_choice_parseFromJSON(cJSON *chat_completion_named_tool_choiceJSON);

cJSON *chat_completion_named_tool_choice_convertToJSON(chat_completion_named_tool_choice_t *chat_completion_named_tool_choice);

#endif /* _chat_completion_named_tool_choice_H_ */

