/*
 * chat_completion_request_message_content_part_text.h
 *
 * 
 */

#ifndef _chat_completion_request_message_content_part_text_H_
#define _chat_completion_request_message_content_part_text_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_request_message_content_part_text_t chat_completion_request_message_content_part_text_t;


// Enum TYPE for chat_completion_request_message_content_part_text

typedef enum  { openai_api_chat_completion_request_message_content_part_text_TYPE_NULL = 0, openai_api_chat_completion_request_message_content_part_text_TYPE_text } openai_api_chat_completion_request_message_content_part_text_TYPE_e;

char* chat_completion_request_message_content_part_text_type_ToString(openai_api_chat_completion_request_message_content_part_text_TYPE_e type);

openai_api_chat_completion_request_message_content_part_text_TYPE_e chat_completion_request_message_content_part_text_type_FromString(char* type);



typedef struct chat_completion_request_message_content_part_text_t {
    openai_api_chat_completion_request_message_content_part_text_TYPE_e type; //enum
    char *text; // string

} chat_completion_request_message_content_part_text_t;

chat_completion_request_message_content_part_text_t *chat_completion_request_message_content_part_text_create(
    openai_api_chat_completion_request_message_content_part_text_TYPE_e type,
    char *text
);

void chat_completion_request_message_content_part_text_free(chat_completion_request_message_content_part_text_t *chat_completion_request_message_content_part_text);

chat_completion_request_message_content_part_text_t *chat_completion_request_message_content_part_text_parseFromJSON(cJSON *chat_completion_request_message_content_part_textJSON);

cJSON *chat_completion_request_message_content_part_text_convertToJSON(chat_completion_request_message_content_part_text_t *chat_completion_request_message_content_part_text);

#endif /* _chat_completion_request_message_content_part_text_H_ */

