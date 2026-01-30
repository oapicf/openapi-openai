/*
 * modify_assistant_request_tool_resources_file_search.h
 *
 * 
 */

#ifndef _modify_assistant_request_tool_resources_file_search_H_
#define _modify_assistant_request_tool_resources_file_search_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct modify_assistant_request_tool_resources_file_search_t modify_assistant_request_tool_resources_file_search_t;




typedef struct modify_assistant_request_tool_resources_file_search_t {
    list_t *vector_store_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} modify_assistant_request_tool_resources_file_search_t;

__attribute__((deprecated)) modify_assistant_request_tool_resources_file_search_t *modify_assistant_request_tool_resources_file_search_create(
    list_t *vector_store_ids
);

void modify_assistant_request_tool_resources_file_search_free(modify_assistant_request_tool_resources_file_search_t *modify_assistant_request_tool_resources_file_search);

modify_assistant_request_tool_resources_file_search_t *modify_assistant_request_tool_resources_file_search_parseFromJSON(cJSON *modify_assistant_request_tool_resources_file_searchJSON);

cJSON *modify_assistant_request_tool_resources_file_search_convertToJSON(modify_assistant_request_tool_resources_file_search_t *modify_assistant_request_tool_resources_file_search);

#endif /* _modify_assistant_request_tool_resources_file_search_H_ */

