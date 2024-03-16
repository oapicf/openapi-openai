/*
 * chat_completion_response_message.h
 *
 * 
 */

#ifndef _chat_completion_response_message_H_
#define _chat_completion_response_message_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_response_message_t chat_completion_response_message_t;

#include "chat_completion_request_message_function_call.h"

// Enum ROLE for chat_completion_response_message

typedef enum  { openai_api_chat_completion_response_message_ROLE_NULL = 0, openai_api_chat_completion_response_message_ROLE_system, openai_api_chat_completion_response_message_ROLE_user, openai_api_chat_completion_response_message_ROLE_assistant, openai_api_chat_completion_response_message_ROLE_function } openai_api_chat_completion_response_message_ROLE_e;

char* chat_completion_response_message_role_ToString(openai_api_chat_completion_response_message_ROLE_e role);

openai_api_chat_completion_response_message_ROLE_e chat_completion_response_message_role_FromString(char* role);



typedef struct chat_completion_response_message_t {
    openai_api_chat_completion_response_message_ROLE_e role; //enum
    char *content; // string
    struct chat_completion_request_message_function_call_t *function_call; //model

} chat_completion_response_message_t;

chat_completion_response_message_t *chat_completion_response_message_create(
    openai_api_chat_completion_response_message_ROLE_e role,
    char *content,
    chat_completion_request_message_function_call_t *function_call
);

void chat_completion_response_message_free(chat_completion_response_message_t *chat_completion_response_message);

chat_completion_response_message_t *chat_completion_response_message_parseFromJSON(cJSON *chat_completion_response_messageJSON);

cJSON *chat_completion_response_message_convertToJSON(chat_completion_response_message_t *chat_completion_response_message);

#endif /* _chat_completion_response_message_H_ */

