/*
 * fine_tune_chat_completion_request_assistant_message.h
 *
 * 
 */

#ifndef _fine_tune_chat_completion_request_assistant_message_H_
#define _fine_tune_chat_completion_request_assistant_message_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_chat_completion_request_assistant_message_t fine_tune_chat_completion_request_assistant_message_t;

#include "chat_completion_message_tool_call.h"
#include "chat_completion_request_assistant_message_audio.h"
#include "chat_completion_request_assistant_message_content.h"
#include "chat_completion_request_assistant_message_function_call.h"

// Enum ROLE for fine_tune_chat_completion_request_assistant_message

typedef enum  { openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_NULL = 0, openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_assistant } openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_e;

char* fine_tune_chat_completion_request_assistant_message_role_ToString(openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_e role);

openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_e fine_tune_chat_completion_request_assistant_message_role_FromString(char* role);

// Enum WEIGHT for fine_tune_chat_completion_request_assistant_message

typedef enum  { openai_api_fine_tune_chat_completion_request_assistant_message_WEIGHT_NULL = 0, openai_api_fine_tune_chat_completion_request_assistant_message_WEIGHT__0, openai_api_fine_tune_chat_completion_request_assistant_message_WEIGHT__1 } openai_api_fine_tune_chat_completion_request_assistant_message_WEIGHT_e;

char* fine_tune_chat_completion_request_assistant_message_weight_ToString(openai_api_fine_tune_chat_completion_request_assistant_message_WEIGHT_e weight);

openai_api_fine_tune_chat_completion_request_assistant_message_WEIGHT_e fine_tune_chat_completion_request_assistant_message_weight_FromString(char* weight);



typedef struct fine_tune_chat_completion_request_assistant_message_t {
    struct chat_completion_request_assistant_message_content_t *content; //model
    char *refusal; // string
    openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_e role; //enum
    char *name; // string
    struct chat_completion_request_assistant_message_audio_t *audio; //model
    list_t *tool_calls; //nonprimitive container
    struct chat_completion_request_assistant_message_function_call_t *function_call; //model
    int weight; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tune_chat_completion_request_assistant_message_t;

__attribute__((deprecated)) fine_tune_chat_completion_request_assistant_message_t *fine_tune_chat_completion_request_assistant_message_create(
    chat_completion_request_assistant_message_content_t *content,
    char *refusal,
    openai_api_fine_tune_chat_completion_request_assistant_message_ROLE_e role,
    char *name,
    chat_completion_request_assistant_message_audio_t *audio,
    list_t *tool_calls,
    chat_completion_request_assistant_message_function_call_t *function_call,
    int weight
);

void fine_tune_chat_completion_request_assistant_message_free(fine_tune_chat_completion_request_assistant_message_t *fine_tune_chat_completion_request_assistant_message);

fine_tune_chat_completion_request_assistant_message_t *fine_tune_chat_completion_request_assistant_message_parseFromJSON(cJSON *fine_tune_chat_completion_request_assistant_messageJSON);

cJSON *fine_tune_chat_completion_request_assistant_message_convertToJSON(fine_tune_chat_completion_request_assistant_message_t *fine_tune_chat_completion_request_assistant_message);

#endif /* _fine_tune_chat_completion_request_assistant_message_H_ */

