/*
 * usage_time_bucket.h
 *
 * 
 */

#ifndef _usage_time_bucket_H_
#define _usage_time_bucket_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct usage_time_bucket_t usage_time_bucket_t;

#include "usage_time_bucket_result_inner.h"

// Enum OBJECT for usage_time_bucket

typedef enum  { openai_api_usage_time_bucket_OBJECT_NULL = 0, openai_api_usage_time_bucket_OBJECT_bucket } openai_api_usage_time_bucket_OBJECT_e;

char* usage_time_bucket_object_ToString(openai_api_usage_time_bucket_OBJECT_e object);

openai_api_usage_time_bucket_OBJECT_e usage_time_bucket_object_FromString(char* object);



typedef struct usage_time_bucket_t {
    openai_api_usage_time_bucket_OBJECT_e object; //enum
    int start_time; //numeric
    int end_time; //numeric
    list_t *result; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} usage_time_bucket_t;

__attribute__((deprecated)) usage_time_bucket_t *usage_time_bucket_create(
    openai_api_usage_time_bucket_OBJECT_e object,
    int start_time,
    int end_time,
    list_t *result
);

void usage_time_bucket_free(usage_time_bucket_t *usage_time_bucket);

usage_time_bucket_t *usage_time_bucket_parseFromJSON(cJSON *usage_time_bucketJSON);

cJSON *usage_time_bucket_convertToJSON(usage_time_bucket_t *usage_time_bucket);

#endif /* _usage_time_bucket_H_ */

