/*
 * realtime_response_create_params_tools_inner.h
 *
 * 
 */

#ifndef _realtime_response_create_params_tools_inner_H_
#define _realtime_response_create_params_tools_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct realtime_response_create_params_tools_inner_t realtime_response_create_params_tools_inner_t;

#include "object.h"

// Enum TYPE for realtime_response_create_params_tools_inner

typedef enum  { openai_api_realtime_response_create_params_tools_inner_TYPE_NULL = 0, openai_api_realtime_response_create_params_tools_inner_TYPE_function } openai_api_realtime_response_create_params_tools_inner_TYPE_e;

char* realtime_response_create_params_tools_inner_type_ToString(openai_api_realtime_response_create_params_tools_inner_TYPE_e type);

openai_api_realtime_response_create_params_tools_inner_TYPE_e realtime_response_create_params_tools_inner_type_FromString(char* type);



typedef struct realtime_response_create_params_tools_inner_t {
    openai_api_realtime_response_create_params_tools_inner_TYPE_e type; //enum
    char *name; // string
    char *description; // string
    object_t *parameters; //object

    int _library_owned; // Is the library responsible for freeing this object?
} realtime_response_create_params_tools_inner_t;

__attribute__((deprecated)) realtime_response_create_params_tools_inner_t *realtime_response_create_params_tools_inner_create(
    openai_api_realtime_response_create_params_tools_inner_TYPE_e type,
    char *name,
    char *description,
    object_t *parameters
);

void realtime_response_create_params_tools_inner_free(realtime_response_create_params_tools_inner_t *realtime_response_create_params_tools_inner);

realtime_response_create_params_tools_inner_t *realtime_response_create_params_tools_inner_parseFromJSON(cJSON *realtime_response_create_params_tools_innerJSON);

cJSON *realtime_response_create_params_tools_inner_convertToJSON(realtime_response_create_params_tools_inner_t *realtime_response_create_params_tools_inner);

#endif /* _realtime_response_create_params_tools_inner_H_ */

