/*
 * chat_completion_request_tool_message.h
 *
 * 
 */

#ifndef _chat_completion_request_tool_message_H_
#define _chat_completion_request_tool_message_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_request_tool_message_t chat_completion_request_tool_message_t;

#include "chat_completion_request_tool_message_content.h"

// Enum ROLE for chat_completion_request_tool_message

typedef enum  { openai_api_chat_completion_request_tool_message_ROLE_NULL = 0, openai_api_chat_completion_request_tool_message_ROLE_tool } openai_api_chat_completion_request_tool_message_ROLE_e;

char* chat_completion_request_tool_message_role_ToString(openai_api_chat_completion_request_tool_message_ROLE_e role);

openai_api_chat_completion_request_tool_message_ROLE_e chat_completion_request_tool_message_role_FromString(char* role);



typedef struct chat_completion_request_tool_message_t {
    openai_api_chat_completion_request_tool_message_ROLE_e role; //enum
    struct chat_completion_request_tool_message_content_t *content; //model
    char *tool_call_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} chat_completion_request_tool_message_t;

__attribute__((deprecated)) chat_completion_request_tool_message_t *chat_completion_request_tool_message_create(
    openai_api_chat_completion_request_tool_message_ROLE_e role,
    chat_completion_request_tool_message_content_t *content,
    char *tool_call_id
);

void chat_completion_request_tool_message_free(chat_completion_request_tool_message_t *chat_completion_request_tool_message);

chat_completion_request_tool_message_t *chat_completion_request_tool_message_parseFromJSON(cJSON *chat_completion_request_tool_messageJSON);

cJSON *chat_completion_request_tool_message_convertToJSON(chat_completion_request_tool_message_t *chat_completion_request_tool_message);

#endif /* _chat_completion_request_tool_message_H_ */

