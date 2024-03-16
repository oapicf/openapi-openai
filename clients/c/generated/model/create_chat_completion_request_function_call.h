/*
 * create_chat_completion_request_function_call.h
 *
 * Controls how the model responds to function calls. \&quot;none\&quot; means the model does not call a function, and responds to the end-user. \&quot;auto\&quot; means the model can pick between an end-user or calling a function.  Specifying a particular function via &#x60;{\&quot;name\&quot;:\\ \&quot;my_function\&quot;}&#x60; forces the model to call that function. \&quot;none\&quot; is the default when no functions are present. \&quot;auto\&quot; is the default if functions are present.
 */

#ifndef _create_chat_completion_request_function_call_H_
#define _create_chat_completion_request_function_call_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_completion_request_function_call_t create_chat_completion_request_function_call_t;

#include "create_chat_completion_request_function_call_one_of.h"



typedef struct create_chat_completion_request_function_call_t {
    char *name; // string

} create_chat_completion_request_function_call_t;

create_chat_completion_request_function_call_t *create_chat_completion_request_function_call_create(
    char *name
);

void create_chat_completion_request_function_call_free(create_chat_completion_request_function_call_t *create_chat_completion_request_function_call);

create_chat_completion_request_function_call_t *create_chat_completion_request_function_call_parseFromJSON(cJSON *create_chat_completion_request_function_callJSON);

cJSON *create_chat_completion_request_function_call_convertToJSON(create_chat_completion_request_function_call_t *create_chat_completion_request_function_call);

#endif /* _create_chat_completion_request_function_call_H_ */

