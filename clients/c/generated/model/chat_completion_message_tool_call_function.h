/*
 * chat_completion_message_tool_call_function.h
 *
 * The function that the model called.
 */

#ifndef _chat_completion_message_tool_call_function_H_
#define _chat_completion_message_tool_call_function_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_message_tool_call_function_t chat_completion_message_tool_call_function_t;




typedef struct chat_completion_message_tool_call_function_t {
    char *name; // string
    char *arguments; // string

} chat_completion_message_tool_call_function_t;

chat_completion_message_tool_call_function_t *chat_completion_message_tool_call_function_create(
    char *name,
    char *arguments
);

void chat_completion_message_tool_call_function_free(chat_completion_message_tool_call_function_t *chat_completion_message_tool_call_function);

chat_completion_message_tool_call_function_t *chat_completion_message_tool_call_function_parseFromJSON(cJSON *chat_completion_message_tool_call_functionJSON);

cJSON *chat_completion_message_tool_call_function_convertToJSON(chat_completion_message_tool_call_function_t *chat_completion_message_tool_call_function);

#endif /* _chat_completion_message_tool_call_function_H_ */

