/*
 * create_thread_and_run_request_tools_inner.h
 *
 * 
 */

#ifndef _create_thread_and_run_request_tools_inner_H_
#define _create_thread_and_run_request_tools_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_thread_and_run_request_tools_inner_t create_thread_and_run_request_tools_inner_t;

#include "assistant_tools_code.h"
#include "assistant_tools_function.h"
#include "assistant_tools_retrieval.h"
#include "function_object.h"

// Enum TYPE for create_thread_and_run_request_tools_inner

typedef enum  { openai_api_create_thread_and_run_request_tools_inner_TYPE_NULL = 0, openai_api_create_thread_and_run_request_tools_inner_TYPE_code_interpreter, openai_api_create_thread_and_run_request_tools_inner_TYPE_retrieval, openai_api_create_thread_and_run_request_tools_inner_TYPE_function } openai_api_create_thread_and_run_request_tools_inner_TYPE_e;

char* create_thread_and_run_request_tools_inner_type_ToString(openai_api_create_thread_and_run_request_tools_inner_TYPE_e type);

openai_api_create_thread_and_run_request_tools_inner_TYPE_e create_thread_and_run_request_tools_inner_type_FromString(char* type);



typedef struct create_thread_and_run_request_tools_inner_t {
    openai_api_create_thread_and_run_request_tools_inner_TYPE_e type; //enum
    struct function_object_t *function; //model

} create_thread_and_run_request_tools_inner_t;

create_thread_and_run_request_tools_inner_t *create_thread_and_run_request_tools_inner_create(
    openai_api_create_thread_and_run_request_tools_inner_TYPE_e type,
    function_object_t *function
);

void create_thread_and_run_request_tools_inner_free(create_thread_and_run_request_tools_inner_t *create_thread_and_run_request_tools_inner);

create_thread_and_run_request_tools_inner_t *create_thread_and_run_request_tools_inner_parseFromJSON(cJSON *create_thread_and_run_request_tools_innerJSON);

cJSON *create_thread_and_run_request_tools_inner_convertToJSON(create_thread_and_run_request_tools_inner_t *create_thread_and_run_request_tools_inner);

#endif /* _create_thread_and_run_request_tools_inner_H_ */

