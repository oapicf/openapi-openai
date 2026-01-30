/*
 * run_step_details_tool_calls_file_search_result_object.h
 *
 * A result instance of the file search.
 */

#ifndef _run_step_details_tool_calls_file_search_result_object_H_
#define _run_step_details_tool_calls_file_search_result_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_details_tool_calls_file_search_result_object_t run_step_details_tool_calls_file_search_result_object_t;

#include "run_step_details_tool_calls_file_search_result_object_content_inner.h"



typedef struct run_step_details_tool_calls_file_search_result_object_t {
    char *file_id; // string
    char *file_name; // string
    double score; //numeric
    list_t *content; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} run_step_details_tool_calls_file_search_result_object_t;

__attribute__((deprecated)) run_step_details_tool_calls_file_search_result_object_t *run_step_details_tool_calls_file_search_result_object_create(
    char *file_id,
    char *file_name,
    double score,
    list_t *content
);

void run_step_details_tool_calls_file_search_result_object_free(run_step_details_tool_calls_file_search_result_object_t *run_step_details_tool_calls_file_search_result_object);

run_step_details_tool_calls_file_search_result_object_t *run_step_details_tool_calls_file_search_result_object_parseFromJSON(cJSON *run_step_details_tool_calls_file_search_result_objectJSON);

cJSON *run_step_details_tool_calls_file_search_result_object_convertToJSON(run_step_details_tool_calls_file_search_result_object_t *run_step_details_tool_calls_file_search_result_object);

#endif /* _run_step_details_tool_calls_file_search_result_object_H_ */

