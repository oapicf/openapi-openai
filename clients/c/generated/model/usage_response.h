/*
 * usage_response.h
 *
 * 
 */

#ifndef _usage_response_H_
#define _usage_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct usage_response_t usage_response_t;

#include "usage_time_bucket.h"

// Enum OBJECT for usage_response

typedef enum  { openai_api_usage_response_OBJECT_NULL = 0, openai_api_usage_response_OBJECT_page } openai_api_usage_response_OBJECT_e;

char* usage_response_object_ToString(openai_api_usage_response_OBJECT_e object);

openai_api_usage_response_OBJECT_e usage_response_object_FromString(char* object);



typedef struct usage_response_t {
    openai_api_usage_response_OBJECT_e object; //enum
    list_t *data; //nonprimitive container
    int has_more; //boolean
    char *next_page; // string

    int _library_owned; // Is the library responsible for freeing this object?
} usage_response_t;

__attribute__((deprecated)) usage_response_t *usage_response_create(
    openai_api_usage_response_OBJECT_e object,
    list_t *data,
    int has_more,
    char *next_page
);

void usage_response_free(usage_response_t *usage_response);

usage_response_t *usage_response_parseFromJSON(cJSON *usage_responseJSON);

cJSON *usage_response_convertToJSON(usage_response_t *usage_response);

#endif /* _usage_response_H_ */

