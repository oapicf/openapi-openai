/*
 * chat_completion_request_assistant_message.h
 *
 * 
 */

#ifndef _chat_completion_request_assistant_message_H_
#define _chat_completion_request_assistant_message_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_request_assistant_message_t chat_completion_request_assistant_message_t;

#include "chat_completion_message_tool_call.h"
#include "chat_completion_request_assistant_message_function_call.h"

// Enum ROLE for chat_completion_request_assistant_message

typedef enum  { openai_api_chat_completion_request_assistant_message_ROLE_NULL = 0, openai_api_chat_completion_request_assistant_message_ROLE_assistant } openai_api_chat_completion_request_assistant_message_ROLE_e;

char* chat_completion_request_assistant_message_role_ToString(openai_api_chat_completion_request_assistant_message_ROLE_e role);

openai_api_chat_completion_request_assistant_message_ROLE_e chat_completion_request_assistant_message_role_FromString(char* role);



typedef struct chat_completion_request_assistant_message_t {
    char *content; // string
    openai_api_chat_completion_request_assistant_message_ROLE_e role; //enum
    char *name; // string
    list_t *tool_calls; //nonprimitive container
    struct chat_completion_request_assistant_message_function_call_t *function_call; //model

    int _library_owned; // Is the library responsible for freeing this object?
} chat_completion_request_assistant_message_t;

__attribute__((deprecated)) chat_completion_request_assistant_message_t *chat_completion_request_assistant_message_create(
    char *content,
    openai_api_chat_completion_request_assistant_message_ROLE_e role,
    char *name,
    list_t *tool_calls,
    chat_completion_request_assistant_message_function_call_t *function_call
);

void chat_completion_request_assistant_message_free(chat_completion_request_assistant_message_t *chat_completion_request_assistant_message);

chat_completion_request_assistant_message_t *chat_completion_request_assistant_message_parseFromJSON(cJSON *chat_completion_request_assistant_messageJSON);

cJSON *chat_completion_request_assistant_message_convertToJSON(chat_completion_request_assistant_message_t *chat_completion_request_assistant_message);

#endif /* _chat_completion_request_assistant_message_H_ */

