/*
 * run_tool_call_object.h
 *
 * Tool call objects
 */

#ifndef _run_tool_call_object_H_
#define _run_tool_call_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_tool_call_object_t run_tool_call_object_t;

#include "run_tool_call_object_function.h"

// Enum TYPE for run_tool_call_object

typedef enum  { openai_api_run_tool_call_object_TYPE_NULL = 0, openai_api_run_tool_call_object_TYPE_function } openai_api_run_tool_call_object_TYPE_e;

char* run_tool_call_object_type_ToString(openai_api_run_tool_call_object_TYPE_e type);

openai_api_run_tool_call_object_TYPE_e run_tool_call_object_type_FromString(char* type);



typedef struct run_tool_call_object_t {
    char *id; // string
    openai_api_run_tool_call_object_TYPE_e type; //enum
    struct run_tool_call_object_function_t *function; //model

    int _library_owned; // Is the library responsible for freeing this object?
} run_tool_call_object_t;

__attribute__((deprecated)) run_tool_call_object_t *run_tool_call_object_create(
    char *id,
    openai_api_run_tool_call_object_TYPE_e type,
    run_tool_call_object_function_t *function
);

void run_tool_call_object_free(run_tool_call_object_t *run_tool_call_object);

run_tool_call_object_t *run_tool_call_object_parseFromJSON(cJSON *run_tool_call_objectJSON);

cJSON *run_tool_call_object_convertToJSON(run_tool_call_object_t *run_tool_call_object);

#endif /* _run_tool_call_object_H_ */

