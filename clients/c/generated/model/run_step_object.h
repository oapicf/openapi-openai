/*
 * run_step_object.h
 *
 * Represents a step in execution of a run. 
 */

#ifndef _run_step_object_H_
#define _run_step_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_object_t run_step_object_t;

#include "object.h"
#include "run_step_completion_usage.h"
#include "run_step_object_last_error.h"
#include "run_step_object_step_details.h"

// Enum OBJECT for run_step_object

typedef enum  { openai_api_run_step_object_OBJECT_NULL = 0, openai_api_run_step_object_OBJECT_thread.run.step } openai_api_run_step_object_OBJECT_e;

char* run_step_object_object_ToString(openai_api_run_step_object_OBJECT_e object);

openai_api_run_step_object_OBJECT_e run_step_object_object_FromString(char* object);

// Enum TYPE for run_step_object

typedef enum  { openai_api_run_step_object_TYPE_NULL = 0, openai_api_run_step_object_TYPE_message_creation, openai_api_run_step_object_TYPE_tool_calls } openai_api_run_step_object_TYPE_e;

char* run_step_object_type_ToString(openai_api_run_step_object_TYPE_e type);

openai_api_run_step_object_TYPE_e run_step_object_type_FromString(char* type);

// Enum STATUS for run_step_object

typedef enum  { openai_api_run_step_object_STATUS_NULL = 0, openai_api_run_step_object_STATUS_in_progress, openai_api_run_step_object_STATUS_cancelled, openai_api_run_step_object_STATUS_failed, openai_api_run_step_object_STATUS_completed, openai_api_run_step_object_STATUS_expired } openai_api_run_step_object_STATUS_e;

char* run_step_object_status_ToString(openai_api_run_step_object_STATUS_e status);

openai_api_run_step_object_STATUS_e run_step_object_status_FromString(char* status);



typedef struct run_step_object_t {
    char *id; // string
    openai_api_run_step_object_OBJECT_e object; //enum
    int created_at; //numeric
    char *assistant_id; // string
    char *thread_id; // string
    char *run_id; // string
    openai_api_run_step_object_TYPE_e type; //enum
    openai_api_run_step_object_STATUS_e status; //enum
    struct run_step_object_step_details_t *step_details; //model
    struct run_step_object_last_error_t *last_error; //model
    int expired_at; //numeric
    int cancelled_at; //numeric
    int failed_at; //numeric
    int completed_at; //numeric
    object_t *metadata; //object
    struct run_step_completion_usage_t *usage; //model

} run_step_object_t;

run_step_object_t *run_step_object_create(
    char *id,
    openai_api_run_step_object_OBJECT_e object,
    int created_at,
    char *assistant_id,
    char *thread_id,
    char *run_id,
    openai_api_run_step_object_TYPE_e type,
    openai_api_run_step_object_STATUS_e status,
    run_step_object_step_details_t *step_details,
    run_step_object_last_error_t *last_error,
    int expired_at,
    int cancelled_at,
    int failed_at,
    int completed_at,
    object_t *metadata,
    run_step_completion_usage_t *usage
);

void run_step_object_free(run_step_object_t *run_step_object);

run_step_object_t *run_step_object_parseFromJSON(cJSON *run_step_objectJSON);

cJSON *run_step_object_convertToJSON(run_step_object_t *run_step_object);

#endif /* _run_step_object_H_ */

