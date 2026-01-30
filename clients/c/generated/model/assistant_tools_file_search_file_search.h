/*
 * assistant_tools_file_search_file_search.h
 *
 * Overrides for the file search tool.
 */

#ifndef _assistant_tools_file_search_file_search_H_
#define _assistant_tools_file_search_file_search_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistant_tools_file_search_file_search_t assistant_tools_file_search_file_search_t;

#include "file_search_ranking_options.h"



typedef struct assistant_tools_file_search_file_search_t {
    int max_num_results; //numeric
    struct file_search_ranking_options_t *ranking_options; //model

    int _library_owned; // Is the library responsible for freeing this object?
} assistant_tools_file_search_file_search_t;

__attribute__((deprecated)) assistant_tools_file_search_file_search_t *assistant_tools_file_search_file_search_create(
    int max_num_results,
    file_search_ranking_options_t *ranking_options
);

void assistant_tools_file_search_file_search_free(assistant_tools_file_search_file_search_t *assistant_tools_file_search_file_search);

assistant_tools_file_search_file_search_t *assistant_tools_file_search_file_search_parseFromJSON(cJSON *assistant_tools_file_search_file_searchJSON);

cJSON *assistant_tools_file_search_file_search_convertToJSON(assistant_tools_file_search_file_search_t *assistant_tools_file_search_file_search);

#endif /* _assistant_tools_file_search_file_search_H_ */

