/*
 * chat_completion_request_system_message.h
 *
 * 
 */

#ifndef _chat_completion_request_system_message_H_
#define _chat_completion_request_system_message_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_request_system_message_t chat_completion_request_system_message_t;


// Enum ROLE for chat_completion_request_system_message

typedef enum  { openai_api_chat_completion_request_system_message_ROLE_NULL = 0, openai_api_chat_completion_request_system_message_ROLE_system } openai_api_chat_completion_request_system_message_ROLE_e;

char* chat_completion_request_system_message_role_ToString(openai_api_chat_completion_request_system_message_ROLE_e role);

openai_api_chat_completion_request_system_message_ROLE_e chat_completion_request_system_message_role_FromString(char* role);



typedef struct chat_completion_request_system_message_t {
    char *content; // string
    openai_api_chat_completion_request_system_message_ROLE_e role; //enum
    char *name; // string

} chat_completion_request_system_message_t;

chat_completion_request_system_message_t *chat_completion_request_system_message_create(
    char *content,
    openai_api_chat_completion_request_system_message_ROLE_e role,
    char *name
);

void chat_completion_request_system_message_free(chat_completion_request_system_message_t *chat_completion_request_system_message);

chat_completion_request_system_message_t *chat_completion_request_system_message_parseFromJSON(cJSON *chat_completion_request_system_messageJSON);

cJSON *chat_completion_request_system_message_convertToJSON(chat_completion_request_system_message_t *chat_completion_request_system_message);

#endif /* _chat_completion_request_system_message_H_ */

