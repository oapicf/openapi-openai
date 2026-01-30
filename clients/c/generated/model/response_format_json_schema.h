/*
 * response_format_json_schema.h
 *
 * 
 */

#ifndef _response_format_json_schema_H_
#define _response_format_json_schema_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct response_format_json_schema_t response_format_json_schema_t;

#include "response_format_json_schema_json_schema.h"

// Enum TYPE for response_format_json_schema

typedef enum  { openai_api_response_format_json_schema_TYPE_NULL = 0, openai_api_response_format_json_schema_TYPE_json_schema } openai_api_response_format_json_schema_TYPE_e;

char* response_format_json_schema_type_ToString(openai_api_response_format_json_schema_TYPE_e type);

openai_api_response_format_json_schema_TYPE_e response_format_json_schema_type_FromString(char* type);



typedef struct response_format_json_schema_t {
    openai_api_response_format_json_schema_TYPE_e type; //enum
    struct response_format_json_schema_json_schema_t *json_schema; //model

    int _library_owned; // Is the library responsible for freeing this object?
} response_format_json_schema_t;

__attribute__((deprecated)) response_format_json_schema_t *response_format_json_schema_create(
    openai_api_response_format_json_schema_TYPE_e type,
    response_format_json_schema_json_schema_t *json_schema
);

void response_format_json_schema_free(response_format_json_schema_t *response_format_json_schema);

response_format_json_schema_t *response_format_json_schema_parseFromJSON(cJSON *response_format_json_schemaJSON);

cJSON *response_format_json_schema_convertToJSON(response_format_json_schema_t *response_format_json_schema);

#endif /* _response_format_json_schema_H_ */

