/*
 * usage_code_interpreter_sessions_result.h
 *
 * The aggregated code interpreter sessions usage details of the specific time bucket.
 */

#ifndef _usage_code_interpreter_sessions_result_H_
#define _usage_code_interpreter_sessions_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct usage_code_interpreter_sessions_result_t usage_code_interpreter_sessions_result_t;


// Enum OBJECT for usage_code_interpreter_sessions_result

typedef enum  { openai_api_usage_code_interpreter_sessions_result_OBJECT_NULL = 0, openai_api_usage_code_interpreter_sessions_result_OBJECT_organization.usage.code_interpreter_sessions.result } openai_api_usage_code_interpreter_sessions_result_OBJECT_e;

char* usage_code_interpreter_sessions_result_object_ToString(openai_api_usage_code_interpreter_sessions_result_OBJECT_e object);

openai_api_usage_code_interpreter_sessions_result_OBJECT_e usage_code_interpreter_sessions_result_object_FromString(char* object);



typedef struct usage_code_interpreter_sessions_result_t {
    openai_api_usage_code_interpreter_sessions_result_OBJECT_e object; //enum
    int sessions; //numeric
    char *project_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} usage_code_interpreter_sessions_result_t;

__attribute__((deprecated)) usage_code_interpreter_sessions_result_t *usage_code_interpreter_sessions_result_create(
    openai_api_usage_code_interpreter_sessions_result_OBJECT_e object,
    int sessions,
    char *project_id
);

void usage_code_interpreter_sessions_result_free(usage_code_interpreter_sessions_result_t *usage_code_interpreter_sessions_result);

usage_code_interpreter_sessions_result_t *usage_code_interpreter_sessions_result_parseFromJSON(cJSON *usage_code_interpreter_sessions_resultJSON);

cJSON *usage_code_interpreter_sessions_result_convertToJSON(usage_code_interpreter_sessions_result_t *usage_code_interpreter_sessions_result);

#endif /* _usage_code_interpreter_sessions_result_H_ */

