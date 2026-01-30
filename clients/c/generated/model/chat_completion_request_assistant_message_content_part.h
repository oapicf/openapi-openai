/*
 * chat_completion_request_assistant_message_content_part.h
 *
 * 
 */

#ifndef _chat_completion_request_assistant_message_content_part_H_
#define _chat_completion_request_assistant_message_content_part_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_request_assistant_message_content_part_t chat_completion_request_assistant_message_content_part_t;

#include "chat_completion_request_message_content_part_refusal.h"
#include "chat_completion_request_message_content_part_text.h"

// Enum TYPE for chat_completion_request_assistant_message_content_part

typedef enum  { openai_api_chat_completion_request_assistant_message_content_part_TYPE_NULL = 0, openai_api_chat_completion_request_assistant_message_content_part_TYPE_text, openai_api_chat_completion_request_assistant_message_content_part_TYPE_refusal } openai_api_chat_completion_request_assistant_message_content_part_TYPE_e;

char* chat_completion_request_assistant_message_content_part_type_ToString(openai_api_chat_completion_request_assistant_message_content_part_TYPE_e type);

openai_api_chat_completion_request_assistant_message_content_part_TYPE_e chat_completion_request_assistant_message_content_part_type_FromString(char* type);



typedef struct chat_completion_request_assistant_message_content_part_t {
    openai_api_chat_completion_request_assistant_message_content_part_TYPE_e type; //enum
    char *text; // string
    char *refusal; // string

    int _library_owned; // Is the library responsible for freeing this object?
} chat_completion_request_assistant_message_content_part_t;

__attribute__((deprecated)) chat_completion_request_assistant_message_content_part_t *chat_completion_request_assistant_message_content_part_create(
    openai_api_chat_completion_request_assistant_message_content_part_TYPE_e type,
    char *text,
    char *refusal
);

void chat_completion_request_assistant_message_content_part_free(chat_completion_request_assistant_message_content_part_t *chat_completion_request_assistant_message_content_part);

chat_completion_request_assistant_message_content_part_t *chat_completion_request_assistant_message_content_part_parseFromJSON(cJSON *chat_completion_request_assistant_message_content_partJSON);

cJSON *chat_completion_request_assistant_message_content_part_convertToJSON(chat_completion_request_assistant_message_content_part_t *chat_completion_request_assistant_message_content_part);

#endif /* _chat_completion_request_assistant_message_content_part_H_ */

