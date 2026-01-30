/*
 * response_format_json_schema_json_schema.h
 *
 * 
 */

#ifndef _response_format_json_schema_json_schema_H_
#define _response_format_json_schema_json_schema_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct response_format_json_schema_json_schema_t response_format_json_schema_json_schema_t;

#include "any_type.h"



typedef struct response_format_json_schema_json_schema_t {
    char *description; // string
    char *name; // string
    list_t* schema; //map
    int strict; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} response_format_json_schema_json_schema_t;

__attribute__((deprecated)) response_format_json_schema_json_schema_t *response_format_json_schema_json_schema_create(
    char *description,
    char *name,
    list_t* schema,
    int strict
);

void response_format_json_schema_json_schema_free(response_format_json_schema_json_schema_t *response_format_json_schema_json_schema);

response_format_json_schema_json_schema_t *response_format_json_schema_json_schema_parseFromJSON(cJSON *response_format_json_schema_json_schemaJSON);

cJSON *response_format_json_schema_json_schema_convertToJSON(response_format_json_schema_json_schema_t *response_format_json_schema_json_schema);

#endif /* _response_format_json_schema_json_schema_H_ */

