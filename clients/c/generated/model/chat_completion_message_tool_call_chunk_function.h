/*
 * chat_completion_message_tool_call_chunk_function.h
 *
 * 
 */

#ifndef _chat_completion_message_tool_call_chunk_function_H_
#define _chat_completion_message_tool_call_chunk_function_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_message_tool_call_chunk_function_t chat_completion_message_tool_call_chunk_function_t;




typedef struct chat_completion_message_tool_call_chunk_function_t {
    char *name; // string
    char *arguments; // string

    int _library_owned; // Is the library responsible for freeing this object?
} chat_completion_message_tool_call_chunk_function_t;

__attribute__((deprecated)) chat_completion_message_tool_call_chunk_function_t *chat_completion_message_tool_call_chunk_function_create(
    char *name,
    char *arguments
);

void chat_completion_message_tool_call_chunk_function_free(chat_completion_message_tool_call_chunk_function_t *chat_completion_message_tool_call_chunk_function);

chat_completion_message_tool_call_chunk_function_t *chat_completion_message_tool_call_chunk_function_parseFromJSON(cJSON *chat_completion_message_tool_call_chunk_functionJSON);

cJSON *chat_completion_message_tool_call_chunk_function_convertToJSON(chat_completion_message_tool_call_chunk_function_t *chat_completion_message_tool_call_chunk_function);

#endif /* _chat_completion_message_tool_call_chunk_function_H_ */

