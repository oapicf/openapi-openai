/*
 * chat_completion_tool.h
 *
 * 
 */

#ifndef _chat_completion_tool_H_
#define _chat_completion_tool_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_tool_t chat_completion_tool_t;

#include "function_object.h"

// Enum TYPE for chat_completion_tool

typedef enum  { openai_api_chat_completion_tool_TYPE_NULL = 0, openai_api_chat_completion_tool_TYPE_function } openai_api_chat_completion_tool_TYPE_e;

char* chat_completion_tool_type_ToString(openai_api_chat_completion_tool_TYPE_e type);

openai_api_chat_completion_tool_TYPE_e chat_completion_tool_type_FromString(char* type);



typedef struct chat_completion_tool_t {
    openai_api_chat_completion_tool_TYPE_e type; //enum
    struct function_object_t *function; //model

} chat_completion_tool_t;

chat_completion_tool_t *chat_completion_tool_create(
    openai_api_chat_completion_tool_TYPE_e type,
    function_object_t *function
);

void chat_completion_tool_free(chat_completion_tool_t *chat_completion_tool);

chat_completion_tool_t *chat_completion_tool_parseFromJSON(cJSON *chat_completion_toolJSON);

cJSON *chat_completion_tool_convertToJSON(chat_completion_tool_t *chat_completion_tool);

#endif /* _chat_completion_tool_H_ */

