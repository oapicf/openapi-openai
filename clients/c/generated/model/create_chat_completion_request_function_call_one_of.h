/*
 * create_chat_completion_request_function_call_one_of.h
 *
 * 
 */

#ifndef _create_chat_completion_request_function_call_one_of_H_
#define _create_chat_completion_request_function_call_one_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_chat_completion_request_function_call_one_of_t create_chat_completion_request_function_call_one_of_t;




typedef struct create_chat_completion_request_function_call_one_of_t {
    char *name; // string

} create_chat_completion_request_function_call_one_of_t;

create_chat_completion_request_function_call_one_of_t *create_chat_completion_request_function_call_one_of_create(
    char *name
);

void create_chat_completion_request_function_call_one_of_free(create_chat_completion_request_function_call_one_of_t *create_chat_completion_request_function_call_one_of);

create_chat_completion_request_function_call_one_of_t *create_chat_completion_request_function_call_one_of_parseFromJSON(cJSON *create_chat_completion_request_function_call_one_ofJSON);

cJSON *create_chat_completion_request_function_call_one_of_convertToJSON(create_chat_completion_request_function_call_one_of_t *create_chat_completion_request_function_call_one_of);

#endif /* _create_chat_completion_request_function_call_one_of_H_ */

