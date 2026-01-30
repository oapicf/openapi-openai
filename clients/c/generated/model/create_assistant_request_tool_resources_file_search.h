/*
 * create_assistant_request_tool_resources_file_search.h
 *
 * 
 */

#ifndef _create_assistant_request_tool_resources_file_search_H_
#define _create_assistant_request_tool_resources_file_search_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct create_assistant_request_tool_resources_file_search_t create_assistant_request_tool_resources_file_search_t;

#include "create_assistant_request_tool_resources_file_search_vector_stores_inner.h"



typedef struct create_assistant_request_tool_resources_file_search_t {
    list_t *vector_store_ids; //primitive container
    list_t *vector_stores; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} create_assistant_request_tool_resources_file_search_t;

__attribute__((deprecated)) create_assistant_request_tool_resources_file_search_t *create_assistant_request_tool_resources_file_search_create(
    list_t *vector_store_ids,
    list_t *vector_stores
);

void create_assistant_request_tool_resources_file_search_free(create_assistant_request_tool_resources_file_search_t *create_assistant_request_tool_resources_file_search);

create_assistant_request_tool_resources_file_search_t *create_assistant_request_tool_resources_file_search_parseFromJSON(cJSON *create_assistant_request_tool_resources_file_searchJSON);

cJSON *create_assistant_request_tool_resources_file_search_convertToJSON(create_assistant_request_tool_resources_file_search_t *create_assistant_request_tool_resources_file_search);

#endif /* _create_assistant_request_tool_resources_file_search_H_ */

