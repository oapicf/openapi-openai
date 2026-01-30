/*
 * chat_completion_request_assistant_message_audio.h
 *
 * Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
 */

#ifndef _chat_completion_request_assistant_message_audio_H_
#define _chat_completion_request_assistant_message_audio_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_request_assistant_message_audio_t chat_completion_request_assistant_message_audio_t;




typedef struct chat_completion_request_assistant_message_audio_t {
    char *id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} chat_completion_request_assistant_message_audio_t;

__attribute__((deprecated)) chat_completion_request_assistant_message_audio_t *chat_completion_request_assistant_message_audio_create(
    char *id
);

void chat_completion_request_assistant_message_audio_free(chat_completion_request_assistant_message_audio_t *chat_completion_request_assistant_message_audio);

chat_completion_request_assistant_message_audio_t *chat_completion_request_assistant_message_audio_parseFromJSON(cJSON *chat_completion_request_assistant_message_audioJSON);

cJSON *chat_completion_request_assistant_message_audio_convertToJSON(chat_completion_request_assistant_message_audio_t *chat_completion_request_assistant_message_audio);

#endif /* _chat_completion_request_assistant_message_audio_H_ */

