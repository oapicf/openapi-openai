/*
 * chat_completion_request_system_message.h
 *
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use &#x60;developer&#x60; messages for this purpose instead. 
 */

#ifndef _chat_completion_request_system_message_H_
#define _chat_completion_request_system_message_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_request_system_message_t chat_completion_request_system_message_t;

#include "chat_completion_request_system_message_content.h"

// Enum ROLE for chat_completion_request_system_message

typedef enum  { openai_api_chat_completion_request_system_message_ROLE_NULL = 0, openai_api_chat_completion_request_system_message_ROLE_system } openai_api_chat_completion_request_system_message_ROLE_e;

char* chat_completion_request_system_message_role_ToString(openai_api_chat_completion_request_system_message_ROLE_e role);

openai_api_chat_completion_request_system_message_ROLE_e chat_completion_request_system_message_role_FromString(char* role);



typedef struct chat_completion_request_system_message_t {
    struct chat_completion_request_system_message_content_t *content; //model
    openai_api_chat_completion_request_system_message_ROLE_e role; //enum
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} chat_completion_request_system_message_t;

__attribute__((deprecated)) chat_completion_request_system_message_t *chat_completion_request_system_message_create(
    chat_completion_request_system_message_content_t *content,
    openai_api_chat_completion_request_system_message_ROLE_e role,
    char *name
);

void chat_completion_request_system_message_free(chat_completion_request_system_message_t *chat_completion_request_system_message);

chat_completion_request_system_message_t *chat_completion_request_system_message_parseFromJSON(cJSON *chat_completion_request_system_messageJSON);

cJSON *chat_completion_request_system_message_convertToJSON(chat_completion_request_system_message_t *chat_completion_request_system_message);

#endif /* _chat_completion_request_system_message_H_ */

