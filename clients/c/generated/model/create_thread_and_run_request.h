/*
 * create_thread_and_run_request.h
 *
 * 
 */

#ifndef _create_thread_and_run_request_H_
#define _create_thread_and_run_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_thread_and_run_request_t create_thread_and_run_request_t;

#include "assistants_api_response_format_option.h"
#include "assistants_api_tool_choice_option.h"
#include "create_run_request_model.h"
#include "create_thread_and_run_request_tool_resources.h"
#include "create_thread_and_run_request_tools_inner.h"
#include "create_thread_request.h"
#include "object.h"
#include "truncation_object.h"



typedef struct create_thread_and_run_request_t {
    char *assistant_id; // string
    struct create_thread_request_t *thread; //model
    struct create_run_request_model_t *model; //model
    char *instructions; // string
    list_t *tools; //nonprimitive container
    struct create_thread_and_run_request_tool_resources_t *tool_resources; //model
    object_t *metadata; //object
    double temperature; //numeric
    double top_p; //numeric
    int stream; //boolean
    int max_prompt_tokens; //numeric
    int max_completion_tokens; //numeric
    struct truncation_object_t *truncation_strategy; //model
    struct assistants_api_tool_choice_option_t *tool_choice; //model
    int parallel_tool_calls; //boolean
    struct assistants_api_response_format_option_t *response_format; //model

    int _library_owned; // Is the library responsible for freeing this object?
} create_thread_and_run_request_t;

__attribute__((deprecated)) create_thread_and_run_request_t *create_thread_and_run_request_create(
    char *assistant_id,
    create_thread_request_t *thread,
    create_run_request_model_t *model,
    char *instructions,
    list_t *tools,
    create_thread_and_run_request_tool_resources_t *tool_resources,
    object_t *metadata,
    double temperature,
    double top_p,
    int stream,
    int max_prompt_tokens,
    int max_completion_tokens,
    truncation_object_t *truncation_strategy,
    assistants_api_tool_choice_option_t *tool_choice,
    int parallel_tool_calls,
    assistants_api_response_format_option_t *response_format
);

void create_thread_and_run_request_free(create_thread_and_run_request_t *create_thread_and_run_request);

create_thread_and_run_request_t *create_thread_and_run_request_parseFromJSON(cJSON *create_thread_and_run_requestJSON);

cJSON *create_thread_and_run_request_convertToJSON(create_thread_and_run_request_t *create_thread_and_run_request);

#endif /* _create_thread_and_run_request_H_ */

