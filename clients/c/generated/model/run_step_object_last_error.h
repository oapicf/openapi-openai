/*
 * run_step_object_last_error.h
 *
 * The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.
 */

#ifndef _run_step_object_last_error_H_
#define _run_step_object_last_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_object_last_error_t run_step_object_last_error_t;


// Enum CODE for run_step_object_last_error

typedef enum  { openai_api_run_step_object_last_error_CODE_NULL = 0, openai_api_run_step_object_last_error_CODE_server_error, openai_api_run_step_object_last_error_CODE_rate_limit_exceeded } openai_api_run_step_object_last_error_CODE_e;

char* run_step_object_last_error_code_ToString(openai_api_run_step_object_last_error_CODE_e code);

openai_api_run_step_object_last_error_CODE_e run_step_object_last_error_code_FromString(char* code);



typedef struct run_step_object_last_error_t {
    openai_api_run_step_object_last_error_CODE_e code; //enum
    char *message; // string

} run_step_object_last_error_t;

run_step_object_last_error_t *run_step_object_last_error_create(
    openai_api_run_step_object_last_error_CODE_e code,
    char *message
);

void run_step_object_last_error_free(run_step_object_last_error_t *run_step_object_last_error);

run_step_object_last_error_t *run_step_object_last_error_parseFromJSON(cJSON *run_step_object_last_errorJSON);

cJSON *run_step_object_last_error_convertToJSON(run_step_object_last_error_t *run_step_object_last_error);

#endif /* _run_step_object_last_error_H_ */

