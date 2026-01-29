/*
 * chat_completion_tool_choice_option.h
 *
 * Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
 */

#ifndef _chat_completion_tool_choice_option_H_
#define _chat_completion_tool_choice_option_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_tool_choice_option_t chat_completion_tool_choice_option_t;

#include "chat_completion_named_tool_choice.h"
#include "chat_completion_named_tool_choice_function.h"

// Enum TYPE for chat_completion_tool_choice_option

typedef enum  { openai_api_chat_completion_tool_choice_option_TYPE_NULL = 0, openai_api_chat_completion_tool_choice_option_TYPE_function } openai_api_chat_completion_tool_choice_option_TYPE_e;

char* chat_completion_tool_choice_option_type_ToString(openai_api_chat_completion_tool_choice_option_TYPE_e type);

openai_api_chat_completion_tool_choice_option_TYPE_e chat_completion_tool_choice_option_type_FromString(char* type);



typedef struct chat_completion_tool_choice_option_t {
    openai_api_chat_completion_tool_choice_option_TYPE_e type; //enum
    struct chat_completion_named_tool_choice_function_t *function; //model

    int _library_owned; // Is the library responsible for freeing this object?
} chat_completion_tool_choice_option_t;

__attribute__((deprecated)) chat_completion_tool_choice_option_t *chat_completion_tool_choice_option_create(
    openai_api_chat_completion_tool_choice_option_TYPE_e type,
    chat_completion_named_tool_choice_function_t *function
);

void chat_completion_tool_choice_option_free(chat_completion_tool_choice_option_t *chat_completion_tool_choice_option);

chat_completion_tool_choice_option_t *chat_completion_tool_choice_option_parseFromJSON(cJSON *chat_completion_tool_choice_optionJSON);

cJSON *chat_completion_tool_choice_option_convertToJSON(chat_completion_tool_choice_option_t *chat_completion_tool_choice_option);

#endif /* _chat_completion_tool_choice_option_H_ */

