/*
 * run_step_details_tool_calls_file_search_object.h
 *
 * 
 */

#ifndef _run_step_details_tool_calls_file_search_object_H_
#define _run_step_details_tool_calls_file_search_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_details_tool_calls_file_search_object_t run_step_details_tool_calls_file_search_object_t;

#include "run_step_details_tool_calls_file_search_object_file_search.h"

// Enum TYPE for run_step_details_tool_calls_file_search_object

typedef enum  { openai_api_run_step_details_tool_calls_file_search_object_TYPE_NULL = 0, openai_api_run_step_details_tool_calls_file_search_object_TYPE_file_search } openai_api_run_step_details_tool_calls_file_search_object_TYPE_e;

char* run_step_details_tool_calls_file_search_object_type_ToString(openai_api_run_step_details_tool_calls_file_search_object_TYPE_e type);

openai_api_run_step_details_tool_calls_file_search_object_TYPE_e run_step_details_tool_calls_file_search_object_type_FromString(char* type);



typedef struct run_step_details_tool_calls_file_search_object_t {
    char *id; // string
    openai_api_run_step_details_tool_calls_file_search_object_TYPE_e type; //enum
    struct run_step_details_tool_calls_file_search_object_file_search_t *file_search; //model

    int _library_owned; // Is the library responsible for freeing this object?
} run_step_details_tool_calls_file_search_object_t;

__attribute__((deprecated)) run_step_details_tool_calls_file_search_object_t *run_step_details_tool_calls_file_search_object_create(
    char *id,
    openai_api_run_step_details_tool_calls_file_search_object_TYPE_e type,
    run_step_details_tool_calls_file_search_object_file_search_t *file_search
);

void run_step_details_tool_calls_file_search_object_free(run_step_details_tool_calls_file_search_object_t *run_step_details_tool_calls_file_search_object);

run_step_details_tool_calls_file_search_object_t *run_step_details_tool_calls_file_search_object_parseFromJSON(cJSON *run_step_details_tool_calls_file_search_objectJSON);

cJSON *run_step_details_tool_calls_file_search_object_convertToJSON(run_step_details_tool_calls_file_search_object_t *run_step_details_tool_calls_file_search_object);

#endif /* _run_step_details_tool_calls_file_search_object_H_ */

