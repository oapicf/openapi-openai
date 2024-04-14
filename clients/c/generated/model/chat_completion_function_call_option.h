/*
 * chat_completion_function_call_option.h
 *
 * Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function. 
 */

#ifndef _chat_completion_function_call_option_H_
#define _chat_completion_function_call_option_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct chat_completion_function_call_option_t chat_completion_function_call_option_t;




typedef struct chat_completion_function_call_option_t {
    char *name; // string

} chat_completion_function_call_option_t;

chat_completion_function_call_option_t *chat_completion_function_call_option_create(
    char *name
);

void chat_completion_function_call_option_free(chat_completion_function_call_option_t *chat_completion_function_call_option);

chat_completion_function_call_option_t *chat_completion_function_call_option_parseFromJSON(cJSON *chat_completion_function_call_optionJSON);

cJSON *chat_completion_function_call_option_convertToJSON(chat_completion_function_call_option_t *chat_completion_function_call_option);

#endif /* _chat_completion_function_call_option_H_ */

