/*
 * create_thread_request_tool_resources_file_search_vector_stores_inner.h
 *
 * 
 */

#ifndef _create_thread_request_tool_resources_file_search_vector_stores_inner_H_
#define _create_thread_request_tool_resources_file_search_vector_stores_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_thread_request_tool_resources_file_search_vector_stores_inner_t create_thread_request_tool_resources_file_search_vector_stores_inner_t;

#include "create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy.h"
#include "object.h"



typedef struct create_thread_request_tool_resources_file_search_vector_stores_inner_t {
    list_t *file_ids; //primitive container
    struct create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy_t *chunking_strategy; //model
    object_t *metadata; //object

    int _library_owned; // Is the library responsible for freeing this object?
} create_thread_request_tool_resources_file_search_vector_stores_inner_t;

__attribute__((deprecated)) create_thread_request_tool_resources_file_search_vector_stores_inner_t *create_thread_request_tool_resources_file_search_vector_stores_inner_create(
    list_t *file_ids,
    create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy_t *chunking_strategy,
    object_t *metadata
);

void create_thread_request_tool_resources_file_search_vector_stores_inner_free(create_thread_request_tool_resources_file_search_vector_stores_inner_t *create_thread_request_tool_resources_file_search_vector_stores_inner);

create_thread_request_tool_resources_file_search_vector_stores_inner_t *create_thread_request_tool_resources_file_search_vector_stores_inner_parseFromJSON(cJSON *create_thread_request_tool_resources_file_search_vector_stores_innerJSON);

cJSON *create_thread_request_tool_resources_file_search_vector_stores_inner_convertToJSON(create_thread_request_tool_resources_file_search_vector_stores_inner_t *create_thread_request_tool_resources_file_search_vector_stores_inner);

#endif /* _create_thread_request_tool_resources_file_search_vector_stores_inner_H_ */

