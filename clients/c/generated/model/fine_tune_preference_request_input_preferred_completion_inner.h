/*
 * fine_tune_preference_request_input_preferred_completion_inner.h
 *
 * 
 */

#ifndef _fine_tune_preference_request_input_preferred_completion_inner_H_
#define _fine_tune_preference_request_input_preferred_completion_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tune_preference_request_input_preferred_completion_inner_t fine_tune_preference_request_input_preferred_completion_inner_t;

#include "chat_completion_message_tool_call.h"
#include "chat_completion_request_assistant_message.h"
#include "chat_completion_request_assistant_message_audio.h"
#include "chat_completion_request_assistant_message_content.h"
#include "chat_completion_request_assistant_message_function_call.h"

// Enum ROLE for fine_tune_preference_request_input_preferred_completion_inner

typedef enum  { openai_api_fine_tune_preference_request_input_preferred_completion_inner_ROLE_NULL = 0, openai_api_fine_tune_preference_request_input_preferred_completion_inner_ROLE_assistant } openai_api_fine_tune_preference_request_input_preferred_completion_inner_ROLE_e;

char* fine_tune_preference_request_input_preferred_completion_inner_role_ToString(openai_api_fine_tune_preference_request_input_preferred_completion_inner_ROLE_e role);

openai_api_fine_tune_preference_request_input_preferred_completion_inner_ROLE_e fine_tune_preference_request_input_preferred_completion_inner_role_FromString(char* role);



typedef struct fine_tune_preference_request_input_preferred_completion_inner_t {
    struct chat_completion_request_assistant_message_content_t *content; //model
    char *refusal; // string
    openai_api_fine_tune_preference_request_input_preferred_completion_inner_ROLE_e role; //enum
    char *name; // string
    struct chat_completion_request_assistant_message_audio_t *audio; //model
    list_t *tool_calls; //nonprimitive container
    struct chat_completion_request_assistant_message_function_call_t *function_call; //model

    int _library_owned; // Is the library responsible for freeing this object?
} fine_tune_preference_request_input_preferred_completion_inner_t;

__attribute__((deprecated)) fine_tune_preference_request_input_preferred_completion_inner_t *fine_tune_preference_request_input_preferred_completion_inner_create(
    chat_completion_request_assistant_message_content_t *content,
    char *refusal,
    openai_api_fine_tune_preference_request_input_preferred_completion_inner_ROLE_e role,
    char *name,
    chat_completion_request_assistant_message_audio_t *audio,
    list_t *tool_calls,
    chat_completion_request_assistant_message_function_call_t *function_call
);

void fine_tune_preference_request_input_preferred_completion_inner_free(fine_tune_preference_request_input_preferred_completion_inner_t *fine_tune_preference_request_input_preferred_completion_inner);

fine_tune_preference_request_input_preferred_completion_inner_t *fine_tune_preference_request_input_preferred_completion_inner_parseFromJSON(cJSON *fine_tune_preference_request_input_preferred_completion_innerJSON);

cJSON *fine_tune_preference_request_input_preferred_completion_inner_convertToJSON(fine_tune_preference_request_input_preferred_completion_inner_t *fine_tune_preference_request_input_preferred_completion_inner);

#endif /* _fine_tune_preference_request_input_preferred_completion_inner_H_ */

