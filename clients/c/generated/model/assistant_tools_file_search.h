/*
 * assistant_tools_file_search.h
 *
 * 
 */

#ifndef _assistant_tools_file_search_H_
#define _assistant_tools_file_search_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistant_tools_file_search_t assistant_tools_file_search_t;

#include "assistant_tools_file_search_file_search.h"

// Enum TYPE for assistant_tools_file_search

typedef enum  { openai_api_assistant_tools_file_search_TYPE_NULL = 0, openai_api_assistant_tools_file_search_TYPE_file_search } openai_api_assistant_tools_file_search_TYPE_e;

char* assistant_tools_file_search_type_ToString(openai_api_assistant_tools_file_search_TYPE_e type);

openai_api_assistant_tools_file_search_TYPE_e assistant_tools_file_search_type_FromString(char* type);



typedef struct assistant_tools_file_search_t {
    openai_api_assistant_tools_file_search_TYPE_e type; //enum
    struct assistant_tools_file_search_file_search_t *file_search; //model

    int _library_owned; // Is the library responsible for freeing this object?
} assistant_tools_file_search_t;

__attribute__((deprecated)) assistant_tools_file_search_t *assistant_tools_file_search_create(
    openai_api_assistant_tools_file_search_TYPE_e type,
    assistant_tools_file_search_file_search_t *file_search
);

void assistant_tools_file_search_free(assistant_tools_file_search_t *assistant_tools_file_search);

assistant_tools_file_search_t *assistant_tools_file_search_parseFromJSON(cJSON *assistant_tools_file_searchJSON);

cJSON *assistant_tools_file_search_convertToJSON(assistant_tools_file_search_t *assistant_tools_file_search);

#endif /* _assistant_tools_file_search_H_ */

