/*
 * fine_tune_chat_request_input_messages_inner.h
 *
 * 
 */

#ifndef _fine_tune_chat_request_input_messages_inner_H_
#define _fine_tune_chat_request_input_messages_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_chat_request_input_messages_inner_t fine_tune_chat_request_input_messages_inner_t;

#include "chat_completion_message_tool_call.h"
#include "chat_completion_request_assistant_message_audio.h"
#include "chat_completion_request_assistant_message_function_call.h"
#include "chat_completion_request_function_message.h"
#include "chat_completion_request_system_message.h"
#include "chat_completion_request_tool_message.h"
#include "chat_completion_request_user_message.h"
#include "fine_tune_chat_completion_request_assistant_message.h"

// Enum ROLE for fine_tune_chat_request_input_messages_inner

typedef enum  { openai_api_fine_tune_chat_request_input_messages_inner_ROLE_NULL = 0, openai_api_fine_tune_chat_request_input_messages_inner_ROLE_function } openai_api_fine_tune_chat_request_input_messages_inner_ROLE_e;

char* fine_tune_chat_request_input_messages_inner_role_ToString(openai_api_fine_tune_chat_request_input_messages_inner_ROLE_e role);

openai_api_fine_tune_chat_request_input_messages_inner_ROLE_e fine_tune_chat_request_input_messages_inner_role_FromString(char* role);

// Enum WEIGHT for fine_tune_chat_request_input_messages_inner

typedef enum  { openai_api_fine_tune_chat_request_input_messages_inner_WEIGHT_NULL = 0, openai_api_fine_tune_chat_request_input_messages_inner_WEIGHT__0, openai_api_fine_tune_chat_request_input_messages_inner_WEIGHT__1 } openai_api_fine_tune_chat_request_input_messages_inner_WEIGHT_e;

char* fine_tune_chat_request_input_messages_inner_weight_ToString(openai_api_fine_tune_chat_request_input_messages_inner_WEIGHT_e weight);

openai_api_fine_tune_chat_request_input_messages_inner_WEIGHT_e fine_tune_chat_request_input_messages_inner_weight_FromString(char* weight);



typedef struct fine_tune_chat_request_input_messages_inner_t {
    char *content; // string
    openai_api_fine_tune_chat_request_input_messages_inner_ROLE_e role; //enum
    char *name; // string
    int weight; //numeric
    char *refusal; // string
    struct chat_completion_request_assistant_message_audio_t *audio; //model
    list_t *tool_calls; //nonprimitive container
    struct chat_completion_request_assistant_message_function_call_t *function_call; //model
    char *tool_call_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tune_chat_request_input_messages_inner_t;

__attribute__((deprecated)) fine_tune_chat_request_input_messages_inner_t *fine_tune_chat_request_input_messages_inner_create(
    char *content,
    openai_api_fine_tune_chat_request_input_messages_inner_ROLE_e role,
    char *name,
    int weight,
    char *refusal,
    chat_completion_request_assistant_message_audio_t *audio,
    list_t *tool_calls,
    chat_completion_request_assistant_message_function_call_t *function_call,
    char *tool_call_id
);

void fine_tune_chat_request_input_messages_inner_free(fine_tune_chat_request_input_messages_inner_t *fine_tune_chat_request_input_messages_inner);

fine_tune_chat_request_input_messages_inner_t *fine_tune_chat_request_input_messages_inner_parseFromJSON(cJSON *fine_tune_chat_request_input_messages_innerJSON);

cJSON *fine_tune_chat_request_input_messages_inner_convertToJSON(fine_tune_chat_request_input_messages_inner_t *fine_tune_chat_request_input_messages_inner);

#endif /* _fine_tune_chat_request_input_messages_inner_H_ */

