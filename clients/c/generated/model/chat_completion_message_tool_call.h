/*
 * chat_completion_message_tool_call.h
 *
 * 
 */

#ifndef _chat_completion_message_tool_call_H_
#define _chat_completion_message_tool_call_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_message_tool_call_t chat_completion_message_tool_call_t;

#include "chat_completion_message_tool_call_function.h"

// Enum TYPE for chat_completion_message_tool_call

typedef enum  { openai_api_chat_completion_message_tool_call_TYPE_NULL = 0, openai_api_chat_completion_message_tool_call_TYPE_function } openai_api_chat_completion_message_tool_call_TYPE_e;

char* chat_completion_message_tool_call_type_ToString(openai_api_chat_completion_message_tool_call_TYPE_e type);

openai_api_chat_completion_message_tool_call_TYPE_e chat_completion_message_tool_call_type_FromString(char* type);



typedef struct chat_completion_message_tool_call_t {
    char *id; // string
    openai_api_chat_completion_message_tool_call_TYPE_e type; //enum
    struct chat_completion_message_tool_call_function_t *function; //model

} chat_completion_message_tool_call_t;

chat_completion_message_tool_call_t *chat_completion_message_tool_call_create(
    char *id,
    openai_api_chat_completion_message_tool_call_TYPE_e type,
    chat_completion_message_tool_call_function_t *function
);

void chat_completion_message_tool_call_free(chat_completion_message_tool_call_t *chat_completion_message_tool_call);

chat_completion_message_tool_call_t *chat_completion_message_tool_call_parseFromJSON(cJSON *chat_completion_message_tool_callJSON);

cJSON *chat_completion_message_tool_call_convertToJSON(chat_completion_message_tool_call_t *chat_completion_message_tool_call);

#endif /* _chat_completion_message_tool_call_H_ */

