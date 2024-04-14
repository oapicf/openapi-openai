/*
 * chat_completion_request_message_content_part_image.h
 *
 * 
 */

#ifndef _chat_completion_request_message_content_part_image_H_
#define _chat_completion_request_message_content_part_image_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_request_message_content_part_image_t chat_completion_request_message_content_part_image_t;

#include "chat_completion_request_message_content_part_image_image_url.h"

// Enum TYPE for chat_completion_request_message_content_part_image

typedef enum  { openai_api_chat_completion_request_message_content_part_image_TYPE_NULL = 0, openai_api_chat_completion_request_message_content_part_image_TYPE_image_url } openai_api_chat_completion_request_message_content_part_image_TYPE_e;

char* chat_completion_request_message_content_part_image_type_ToString(openai_api_chat_completion_request_message_content_part_image_TYPE_e type);

openai_api_chat_completion_request_message_content_part_image_TYPE_e chat_completion_request_message_content_part_image_type_FromString(char* type);



typedef struct chat_completion_request_message_content_part_image_t {
    openai_api_chat_completion_request_message_content_part_image_TYPE_e type; //enum
    struct chat_completion_request_message_content_part_image_image_url_t *image_url; //model

} chat_completion_request_message_content_part_image_t;

chat_completion_request_message_content_part_image_t *chat_completion_request_message_content_part_image_create(
    openai_api_chat_completion_request_message_content_part_image_TYPE_e type,
    chat_completion_request_message_content_part_image_image_url_t *image_url
);

void chat_completion_request_message_content_part_image_free(chat_completion_request_message_content_part_image_t *chat_completion_request_message_content_part_image);

chat_completion_request_message_content_part_image_t *chat_completion_request_message_content_part_image_parseFromJSON(cJSON *chat_completion_request_message_content_part_imageJSON);

cJSON *chat_completion_request_message_content_part_image_convertToJSON(chat_completion_request_message_content_part_image_t *chat_completion_request_message_content_part_image);

#endif /* _chat_completion_request_message_content_part_image_H_ */

