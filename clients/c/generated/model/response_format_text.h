/*
 * response_format_text.h
 *
 * 
 */

#ifndef _response_format_text_H_
#define _response_format_text_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct response_format_text_t response_format_text_t;


// Enum TYPE for response_format_text

typedef enum  { openai_api_response_format_text_TYPE_NULL = 0, openai_api_response_format_text_TYPE_text } openai_api_response_format_text_TYPE_e;

char* response_format_text_type_ToString(openai_api_response_format_text_TYPE_e type);

openai_api_response_format_text_TYPE_e response_format_text_type_FromString(char* type);



typedef struct response_format_text_t {
    openai_api_response_format_text_TYPE_e type; //enum

    int _library_owned; // Is the library responsible for freeing this object?
} response_format_text_t;

__attribute__((deprecated)) response_format_text_t *response_format_text_create(
    openai_api_response_format_text_TYPE_e type
);

void response_format_text_free(response_format_text_t *response_format_text);

response_format_text_t *response_format_text_parseFromJSON(cJSON *response_format_textJSON);

cJSON *response_format_text_convertToJSON(response_format_text_t *response_format_text);

#endif /* _response_format_text_H_ */

