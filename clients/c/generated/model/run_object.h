/*
 * run_object.h
 *
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 */

#ifndef _run_object_H_
#define _run_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_object_t run_object_t;

#include "assistant_object_tools_inner.h"
#include "assistants_api_response_format_option.h"
#include "assistants_api_tool_choice_option.h"
#include "object.h"
#include "run_completion_usage.h"
#include "run_object_incomplete_details.h"
#include "run_object_last_error.h"
#include "run_object_required_action.h"
#include "truncation_object.h"

// Enum OBJECT for run_object

typedef enum  { openai_api_run_object_OBJECT_NULL = 0, openai_api_run_object_OBJECT_thread.run } openai_api_run_object_OBJECT_e;

char* run_object_object_ToString(openai_api_run_object_OBJECT_e object);

openai_api_run_object_OBJECT_e run_object_object_FromString(char* object);

// Enum STATUS for run_object

typedef enum  { openai_api_run_object_STATUS_NULL = 0, openai_api_run_object_STATUS_queued, openai_api_run_object_STATUS_in_progress, openai_api_run_object_STATUS_requires_action, openai_api_run_object_STATUS_cancelling, openai_api_run_object_STATUS_cancelled, openai_api_run_object_STATUS_failed, openai_api_run_object_STATUS_completed, openai_api_run_object_STATUS_incomplete, openai_api_run_object_STATUS_expired } openai_api_run_object_STATUS_e;

char* run_object_status_ToString(openai_api_run_object_STATUS_e status);

openai_api_run_object_STATUS_e run_object_status_FromString(char* status);



typedef struct run_object_t {
    char *id; // string
    openai_api_run_object_OBJECT_e object; //enum
    int created_at; //numeric
    char *thread_id; // string
    char *assistant_id; // string
    openai_api_run_object_STATUS_e status; //enum
    struct run_object_required_action_t *required_action; //model
    struct run_object_last_error_t *last_error; //model
    int expires_at; //numeric
    int started_at; //numeric
    int cancelled_at; //numeric
    int failed_at; //numeric
    int completed_at; //numeric
    struct run_object_incomplete_details_t *incomplete_details; //model
    char *model; // string
    char *instructions; // string
    list_t *tools; //nonprimitive container
    object_t *metadata; //object
    struct run_completion_usage_t *usage; //model
    double temperature; //numeric
    double top_p; //numeric
    int max_prompt_tokens; //numeric
    int max_completion_tokens; //numeric
    struct truncation_object_t *truncation_strategy; //model
    struct assistants_api_tool_choice_option_t *tool_choice; //model
    int parallel_tool_calls; //boolean
    struct assistants_api_response_format_option_t *response_format; //model

    int _library_owned; // Is the library responsible for freeing this object?
} run_object_t;

__attribute__((deprecated)) run_object_t *run_object_create(
    char *id,
    openai_api_run_object_OBJECT_e object,
    int created_at,
    char *thread_id,
    char *assistant_id,
    openai_api_run_object_STATUS_e status,
    run_object_required_action_t *required_action,
    run_object_last_error_t *last_error,
    int expires_at,
    int started_at,
    int cancelled_at,
    int failed_at,
    int completed_at,
    run_object_incomplete_details_t *incomplete_details,
    char *model,
    char *instructions,
    list_t *tools,
    object_t *metadata,
    run_completion_usage_t *usage,
    double temperature,
    double top_p,
    int max_prompt_tokens,
    int max_completion_tokens,
    truncation_object_t *truncation_strategy,
    assistants_api_tool_choice_option_t *tool_choice,
    int parallel_tool_calls,
    assistants_api_response_format_option_t *response_format
);

void run_object_free(run_object_t *run_object);

run_object_t *run_object_parseFromJSON(cJSON *run_objectJSON);

cJSON *run_object_convertToJSON(run_object_t *run_object);

#endif /* _run_object_H_ */

