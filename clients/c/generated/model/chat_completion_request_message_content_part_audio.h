/*
 * chat_completion_request_message_content_part_audio.h
 *
 * Learn about [audio inputs](/docs/guides/audio). 
 */

#ifndef _chat_completion_request_message_content_part_audio_H_
#define _chat_completion_request_message_content_part_audio_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_request_message_content_part_audio_t chat_completion_request_message_content_part_audio_t;

#include "chat_completion_request_message_content_part_audio_input_audio.h"

// Enum TYPE for chat_completion_request_message_content_part_audio

typedef enum  { openai_api_chat_completion_request_message_content_part_audio_TYPE_NULL = 0, openai_api_chat_completion_request_message_content_part_audio_TYPE_input_audio } openai_api_chat_completion_request_message_content_part_audio_TYPE_e;

char* chat_completion_request_message_content_part_audio_type_ToString(openai_api_chat_completion_request_message_content_part_audio_TYPE_e type);

openai_api_chat_completion_request_message_content_part_audio_TYPE_e chat_completion_request_message_content_part_audio_type_FromString(char* type);



typedef struct chat_completion_request_message_content_part_audio_t {
    openai_api_chat_completion_request_message_content_part_audio_TYPE_e type; //enum
    struct chat_completion_request_message_content_part_audio_input_audio_t *input_audio; //model

    int _library_owned; // Is the library responsible for freeing this object?
} chat_completion_request_message_content_part_audio_t;

__attribute__((deprecated)) chat_completion_request_message_content_part_audio_t *chat_completion_request_message_content_part_audio_create(
    openai_api_chat_completion_request_message_content_part_audio_TYPE_e type,
    chat_completion_request_message_content_part_audio_input_audio_t *input_audio
);

void chat_completion_request_message_content_part_audio_free(chat_completion_request_message_content_part_audio_t *chat_completion_request_message_content_part_audio);

chat_completion_request_message_content_part_audio_t *chat_completion_request_message_content_part_audio_parseFromJSON(cJSON *chat_completion_request_message_content_part_audioJSON);

cJSON *chat_completion_request_message_content_part_audio_convertToJSON(chat_completion_request_message_content_part_audio_t *chat_completion_request_message_content_part_audio);

#endif /* _chat_completion_request_message_content_part_audio_H_ */

