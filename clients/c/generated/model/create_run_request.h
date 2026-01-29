/*
 * create_run_request.h
 *
 * 
 */

#ifndef _create_run_request_H_
#define _create_run_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_run_request_t create_run_request_t;

#include "assistant_object_tools_inner.h"
#include "assistants_api_response_format_option.h"
#include "assistants_api_tool_choice_option.h"
#include "create_message_request.h"
#include "create_run_request_model.h"
#include "object.h"
#include "truncation_object.h"



typedef struct create_run_request_t {
    char *assistant_id; // string
    struct create_run_request_model_t *model; //model
    char *instructions; // string
    char *additional_instructions; // string
    list_t *additional_messages; //nonprimitive container
    list_t *tools; //nonprimitive container
    object_t *metadata; //object
    double temperature; //numeric
    int stream; //boolean
    int max_prompt_tokens; //numeric
    int max_completion_tokens; //numeric
    struct truncation_object_t *truncation_strategy; //model
    struct assistants_api_tool_choice_option_t *tool_choice; //model
    struct assistants_api_response_format_option_t *response_format; //model

    int _library_owned; // Is the library responsible for freeing this object?
} create_run_request_t;

__attribute__((deprecated)) create_run_request_t *create_run_request_create(
    char *assistant_id,
    create_run_request_model_t *model,
    char *instructions,
    char *additional_instructions,
    list_t *additional_messages,
    list_t *tools,
    object_t *metadata,
    double temperature,
    int stream,
    int max_prompt_tokens,
    int max_completion_tokens,
    truncation_object_t *truncation_strategy,
    assistants_api_tool_choice_option_t *tool_choice,
    assistants_api_response_format_option_t *response_format
);

void create_run_request_free(create_run_request_t *create_run_request);

create_run_request_t *create_run_request_parseFromJSON(cJSON *create_run_requestJSON);

cJSON *create_run_request_convertToJSON(create_run_request_t *create_run_request);

#endif /* _create_run_request_H_ */

