/*
 * assistant_tools_file_search_type_only.h
 *
 * 
 */

#ifndef _assistant_tools_file_search_type_only_H_
#define _assistant_tools_file_search_type_only_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistant_tools_file_search_type_only_t assistant_tools_file_search_type_only_t;


// Enum TYPE for assistant_tools_file_search_type_only

typedef enum  { openai_api_assistant_tools_file_search_type_only_TYPE_NULL = 0, openai_api_assistant_tools_file_search_type_only_TYPE_file_search } openai_api_assistant_tools_file_search_type_only_TYPE_e;

char* assistant_tools_file_search_type_only_type_ToString(openai_api_assistant_tools_file_search_type_only_TYPE_e type);

openai_api_assistant_tools_file_search_type_only_TYPE_e assistant_tools_file_search_type_only_type_FromString(char* type);



typedef struct assistant_tools_file_search_type_only_t {
    openai_api_assistant_tools_file_search_type_only_TYPE_e type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} assistant_tools_file_search_type_only_t;

__attribute__((deprecated)) assistant_tools_file_search_type_only_t *assistant_tools_file_search_type_only_create(
    openai_api_assistant_tools_file_search_type_only_TYPE_e type
);

void assistant_tools_file_search_type_only_free(assistant_tools_file_search_type_only_t *assistant_tools_file_search_type_only);

assistant_tools_file_search_type_only_t *assistant_tools_file_search_type_only_parseFromJSON(cJSON *assistant_tools_file_search_type_onlyJSON);

cJSON *assistant_tools_file_search_type_only_convertToJSON(assistant_tools_file_search_type_only_t *assistant_tools_file_search_type_only);

#endif /* _assistant_tools_file_search_type_only_H_ */

