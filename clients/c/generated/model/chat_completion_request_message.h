/*
 * chat_completion_request_message.h
 *
 * 
 */

#ifndef _chat_completion_request_message_H_
#define _chat_completion_request_message_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_request_message_t chat_completion_request_message_t;

#include "chat_completion_message_tool_call.h"
#include "chat_completion_request_assistant_message.h"
#include "chat_completion_request_assistant_message_audio.h"
#include "chat_completion_request_assistant_message_function_call.h"
#include "chat_completion_request_developer_message.h"
#include "chat_completion_request_function_message.h"
#include "chat_completion_request_system_message.h"
#include "chat_completion_request_tool_message.h"
#include "chat_completion_request_user_message.h"

// Enum ROLE for chat_completion_request_message

typedef enum  { openai_api_chat_completion_request_message_ROLE_NULL = 0, openai_api_chat_completion_request_message_ROLE_function } openai_api_chat_completion_request_message_ROLE_e;

char* chat_completion_request_message_role_ToString(openai_api_chat_completion_request_message_ROLE_e role);

openai_api_chat_completion_request_message_ROLE_e chat_completion_request_message_role_FromString(char* role);



typedef struct chat_completion_request_message_t {
    char *content; // string
    openai_api_chat_completion_request_message_ROLE_e role; //enum
    char *name; // string
    char *refusal; // string
    struct chat_completion_request_assistant_message_audio_t *audio; //model
    list_t *tool_calls; //nonprimitive container
    struct chat_completion_request_assistant_message_function_call_t *function_call; //model
    char *tool_call_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} chat_completion_request_message_t;

__attribute__((deprecated)) chat_completion_request_message_t *chat_completion_request_message_create(
    char *content,
    openai_api_chat_completion_request_message_ROLE_e role,
    char *name,
    char *refusal,
    chat_completion_request_assistant_message_audio_t *audio,
    list_t *tool_calls,
    chat_completion_request_assistant_message_function_call_t *function_call,
    char *tool_call_id
);

void chat_completion_request_message_free(chat_completion_request_message_t *chat_completion_request_message);

chat_completion_request_message_t *chat_completion_request_message_parseFromJSON(cJSON *chat_completion_request_messageJSON);

cJSON *chat_completion_request_message_convertToJSON(chat_completion_request_message_t *chat_completion_request_message);

#endif /* _chat_completion_request_message_H_ */

