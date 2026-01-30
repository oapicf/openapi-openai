/*
 * run_step_details_tool_calls_file_search_object_file_search.h
 *
 * For now, this is always going to be an empty object.
 */

#ifndef _run_step_details_tool_calls_file_search_object_file_search_H_
#define _run_step_details_tool_calls_file_search_object_file_search_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct run_step_details_tool_calls_file_search_object_file_search_t run_step_details_tool_calls_file_search_object_file_search_t;

#include "run_step_details_tool_calls_file_search_ranking_options_object.h"
#include "run_step_details_tool_calls_file_search_result_object.h"



typedef struct run_step_details_tool_calls_file_search_object_file_search_t {
    struct run_step_details_tool_calls_file_search_ranking_options_object_t *ranking_options; //model
    list_t *results; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} run_step_details_tool_calls_file_search_object_file_search_t;

__attribute__((deprecated)) run_step_details_tool_calls_file_search_object_file_search_t *run_step_details_tool_calls_file_search_object_file_search_create(
    run_step_details_tool_calls_file_search_ranking_options_object_t *ranking_options,
    list_t *results
);

void run_step_details_tool_calls_file_search_object_file_search_free(run_step_details_tool_calls_file_search_object_file_search_t *run_step_details_tool_calls_file_search_object_file_search);

run_step_details_tool_calls_file_search_object_file_search_t *run_step_details_tool_calls_file_search_object_file_search_parseFromJSON(cJSON *run_step_details_tool_calls_file_search_object_file_searchJSON);

cJSON *run_step_details_tool_calls_file_search_object_file_search_convertToJSON(run_step_details_tool_calls_file_search_object_file_search_t *run_step_details_tool_calls_file_search_object_file_search);

#endif /* _run_step_details_tool_calls_file_search_object_file_search_H_ */

