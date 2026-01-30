/*
 * assistant_object_tool_resources_file_search.h
 *
 * 
 */

#ifndef _assistant_object_tool_resources_file_search_H_
#define _assistant_object_tool_resources_file_search_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistant_object_tool_resources_file_search_t assistant_object_tool_resources_file_search_t;




typedef struct assistant_object_tool_resources_file_search_t {
    list_t *vector_store_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} assistant_object_tool_resources_file_search_t;

__attribute__((deprecated)) assistant_object_tool_resources_file_search_t *assistant_object_tool_resources_file_search_create(
    list_t *vector_store_ids
);

void assistant_object_tool_resources_file_search_free(assistant_object_tool_resources_file_search_t *assistant_object_tool_resources_file_search);

assistant_object_tool_resources_file_search_t *assistant_object_tool_resources_file_search_parseFromJSON(cJSON *assistant_object_tool_resources_file_searchJSON);

cJSON *assistant_object_tool_resources_file_search_convertToJSON(assistant_object_tool_resources_file_search_t *assistant_object_tool_resources_file_search);

#endif /* _assistant_object_tool_resources_file_search_H_ */

