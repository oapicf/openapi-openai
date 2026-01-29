/*
 * assistant_tools_code.h
 *
 * 
 */

#ifndef _assistant_tools_code_H_
#define _assistant_tools_code_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct assistant_tools_code_t assistant_tools_code_t;


// Enum TYPE for assistant_tools_code

typedef enum  { openai_api_assistant_tools_code_TYPE_NULL = 0, openai_api_assistant_tools_code_TYPE_code_interpreter } openai_api_assistant_tools_code_TYPE_e;

char* assistant_tools_code_type_ToString(openai_api_assistant_tools_code_TYPE_e type);

openai_api_assistant_tools_code_TYPE_e assistant_tools_code_type_FromString(char* type);



typedef struct assistant_tools_code_t {
    openai_api_assistant_tools_code_TYPE_e type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} assistant_tools_code_t;

__attribute__((deprecated)) assistant_tools_code_t *assistant_tools_code_create(
    openai_api_assistant_tools_code_TYPE_e type
);

void assistant_tools_code_free(assistant_tools_code_t *assistant_tools_code);

assistant_tools_code_t *assistant_tools_code_parseFromJSON(cJSON *assistant_tools_codeJSON);

cJSON *assistant_tools_code_convertToJSON(assistant_tools_code_t *assistant_tools_code);

#endif /* _assistant_tools_code_H_ */

