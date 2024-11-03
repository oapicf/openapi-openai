/*
 * chat_completion_named_tool_choice_function.h
 *
 * 
 */

#ifndef _chat_completion_named_tool_choice_function_H_
#define _chat_completion_named_tool_choice_function_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_named_tool_choice_function_t chat_completion_named_tool_choice_function_t;




typedef struct chat_completion_named_tool_choice_function_t {
    char *name; // string

} chat_completion_named_tool_choice_function_t;

chat_completion_named_tool_choice_function_t *chat_completion_named_tool_choice_function_create(
    char *name
);

void chat_completion_named_tool_choice_function_free(chat_completion_named_tool_choice_function_t *chat_completion_named_tool_choice_function);

chat_completion_named_tool_choice_function_t *chat_completion_named_tool_choice_function_parseFromJSON(cJSON *chat_completion_named_tool_choice_functionJSON);

cJSON *chat_completion_named_tool_choice_function_convertToJSON(chat_completion_named_tool_choice_function_t *chat_completion_named_tool_choice_function);

#endif /* _chat_completion_named_tool_choice_function_H_ */

