/*
 * chat_completion_request_function_message.h
 *
 * 
 */

#ifndef _chat_completion_request_function_message_H_
#define _chat_completion_request_function_message_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_request_function_message_t chat_completion_request_function_message_t;


// Enum ROLE for chat_completion_request_function_message

typedef enum  { openai_api_chat_completion_request_function_message_ROLE_NULL = 0, openai_api_chat_completion_request_function_message_ROLE_function } openai_api_chat_completion_request_function_message_ROLE_e;

char* chat_completion_request_function_message_role_ToString(openai_api_chat_completion_request_function_message_ROLE_e role);

openai_api_chat_completion_request_function_message_ROLE_e chat_completion_request_function_message_role_FromString(char* role);



typedef struct chat_completion_request_function_message_t {
    openai_api_chat_completion_request_function_message_ROLE_e role; //enum
    char *content; // string
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} chat_completion_request_function_message_t;

__attribute__((deprecated)) chat_completion_request_function_message_t *chat_completion_request_function_message_create(
    openai_api_chat_completion_request_function_message_ROLE_e role,
    char *content,
    char *name
);

void chat_completion_request_function_message_free(chat_completion_request_function_message_t *chat_completion_request_function_message);

chat_completion_request_function_message_t *chat_completion_request_function_message_parseFromJSON(cJSON *chat_completion_request_function_messageJSON);

cJSON *chat_completion_request_function_message_convertToJSON(chat_completion_request_function_message_t *chat_completion_request_function_message);

#endif /* _chat_completion_request_function_message_H_ */

