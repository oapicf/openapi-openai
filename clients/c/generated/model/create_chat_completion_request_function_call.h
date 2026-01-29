/*
 * create_chat_completion_request_function_call.h
 *
 * Deprecated in favor of &#x60;tool_choice&#x60;.  Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
 */

#ifndef _create_chat_completion_request_function_call_H_
#define _create_chat_completion_request_function_call_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_completion_request_function_call_t create_chat_completion_request_function_call_t;

#include "chat_completion_function_call_option.h"



typedef struct create_chat_completion_request_function_call_t {
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} create_chat_completion_request_function_call_t;

__attribute__((deprecated)) create_chat_completion_request_function_call_t *create_chat_completion_request_function_call_create(
    char *name
);

void create_chat_completion_request_function_call_free(create_chat_completion_request_function_call_t *create_chat_completion_request_function_call);

create_chat_completion_request_function_call_t *create_chat_completion_request_function_call_parseFromJSON(cJSON *create_chat_completion_request_function_callJSON);

cJSON *create_chat_completion_request_function_call_convertToJSON(create_chat_completion_request_function_call_t *create_chat_completion_request_function_call);

#endif /* _create_chat_completion_request_function_call_H_ */

