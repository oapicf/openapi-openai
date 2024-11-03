/*
 * chat_completion_message_tool_call_chunk.h
 *
 * 
 */

#ifndef _chat_completion_message_tool_call_chunk_H_
#define _chat_completion_message_tool_call_chunk_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_message_tool_call_chunk_t chat_completion_message_tool_call_chunk_t;

#include "chat_completion_message_tool_call_chunk_function.h"

// Enum TYPE for chat_completion_message_tool_call_chunk

typedef enum  { openai_api_chat_completion_message_tool_call_chunk_TYPE_NULL = 0, openai_api_chat_completion_message_tool_call_chunk_TYPE_function } openai_api_chat_completion_message_tool_call_chunk_TYPE_e;

char* chat_completion_message_tool_call_chunk_type_ToString(openai_api_chat_completion_message_tool_call_chunk_TYPE_e type);

openai_api_chat_completion_message_tool_call_chunk_TYPE_e chat_completion_message_tool_call_chunk_type_FromString(char* type);



typedef struct chat_completion_message_tool_call_chunk_t {
    int index; //numeric
    char *id; // string
    openai_api_chat_completion_message_tool_call_chunk_TYPE_e type; //enum
    struct chat_completion_message_tool_call_chunk_function_t *function; //model

} chat_completion_message_tool_call_chunk_t;

chat_completion_message_tool_call_chunk_t *chat_completion_message_tool_call_chunk_create(
    int index,
    char *id,
    openai_api_chat_completion_message_tool_call_chunk_TYPE_e type,
    chat_completion_message_tool_call_chunk_function_t *function
);

void chat_completion_message_tool_call_chunk_free(chat_completion_message_tool_call_chunk_t *chat_completion_message_tool_call_chunk);

chat_completion_message_tool_call_chunk_t *chat_completion_message_tool_call_chunk_parseFromJSON(cJSON *chat_completion_message_tool_call_chunkJSON);

cJSON *chat_completion_message_tool_call_chunk_convertToJSON(chat_completion_message_tool_call_chunk_t *chat_completion_message_tool_call_chunk);

#endif /* _chat_completion_message_tool_call_chunk_H_ */

