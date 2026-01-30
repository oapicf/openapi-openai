/*
 * chat_completion_request_assistant_message_content.h
 *
 * The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. 
 */

#ifndef _chat_completion_request_assistant_message_content_H_
#define _chat_completion_request_assistant_message_content_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_request_assistant_message_content_t chat_completion_request_assistant_message_content_t;

#include "chat_completion_request_assistant_message_content_part.h"



typedef struct chat_completion_request_assistant_message_content_t {

    int _library_owned; // Is the library responsible for freeing this object?
} chat_completion_request_assistant_message_content_t;

__attribute__((deprecated)) chat_completion_request_assistant_message_content_t *chat_completion_request_assistant_message_content_create(
);

void chat_completion_request_assistant_message_content_free(chat_completion_request_assistant_message_content_t *chat_completion_request_assistant_message_content);

chat_completion_request_assistant_message_content_t *chat_completion_request_assistant_message_content_parseFromJSON(cJSON *chat_completion_request_assistant_message_contentJSON);

cJSON *chat_completion_request_assistant_message_content_convertToJSON(chat_completion_request_assistant_message_content_t *chat_completion_request_assistant_message_content);

#endif /* _chat_completion_request_assistant_message_content_H_ */

