/*
 * chat_completion_request_message_content_part_refusal.h
 *
 * 
 */

#ifndef _chat_completion_request_message_content_part_refusal_H_
#define _chat_completion_request_message_content_part_refusal_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_request_message_content_part_refusal_t chat_completion_request_message_content_part_refusal_t;


// Enum TYPE for chat_completion_request_message_content_part_refusal

typedef enum  { openai_api_chat_completion_request_message_content_part_refusal_TYPE_NULL = 0, openai_api_chat_completion_request_message_content_part_refusal_TYPE_refusal } openai_api_chat_completion_request_message_content_part_refusal_TYPE_e;

char* chat_completion_request_message_content_part_refusal_type_ToString(openai_api_chat_completion_request_message_content_part_refusal_TYPE_e type);

openai_api_chat_completion_request_message_content_part_refusal_TYPE_e chat_completion_request_message_content_part_refusal_type_FromString(char* type);



typedef struct chat_completion_request_message_content_part_refusal_t {
    openai_api_chat_completion_request_message_content_part_refusal_TYPE_e type; //enum
    char *refusal; // string

    int _library_owned; // Is the library responsible for freeing this object?
} chat_completion_request_message_content_part_refusal_t;

__attribute__((deprecated)) chat_completion_request_message_content_part_refusal_t *chat_completion_request_message_content_part_refusal_create(
    openai_api_chat_completion_request_message_content_part_refusal_TYPE_e type,
    char *refusal
);

void chat_completion_request_message_content_part_refusal_free(chat_completion_request_message_content_part_refusal_t *chat_completion_request_message_content_part_refusal);

chat_completion_request_message_content_part_refusal_t *chat_completion_request_message_content_part_refusal_parseFromJSON(cJSON *chat_completion_request_message_content_part_refusalJSON);

cJSON *chat_completion_request_message_content_part_refusal_convertToJSON(chat_completion_request_message_content_part_refusal_t *chat_completion_request_message_content_part_refusal);

#endif /* _chat_completion_request_message_content_part_refusal_H_ */

