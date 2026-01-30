/*
 * usage_vector_stores_result.h
 *
 * The aggregated vector stores usage details of the specific time bucket.
 */

#ifndef _usage_vector_stores_result_H_
#define _usage_vector_stores_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct usage_vector_stores_result_t usage_vector_stores_result_t;


// Enum OBJECT for usage_vector_stores_result

typedef enum  { openai_api_usage_vector_stores_result_OBJECT_NULL = 0, openai_api_usage_vector_stores_result_OBJECT_organization.usage.vector_stores.result } openai_api_usage_vector_stores_result_OBJECT_e;

char* usage_vector_stores_result_object_ToString(openai_api_usage_vector_stores_result_OBJECT_e object);

openai_api_usage_vector_stores_result_OBJECT_e usage_vector_stores_result_object_FromString(char* object);



typedef struct usage_vector_stores_result_t {
    openai_api_usage_vector_stores_result_OBJECT_e object; //enum
    int usage_bytes; //numeric
    char *project_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} usage_vector_stores_result_t;

__attribute__((deprecated)) usage_vector_stores_result_t *usage_vector_stores_result_create(
    openai_api_usage_vector_stores_result_OBJECT_e object,
    int usage_bytes,
    char *project_id
);

void usage_vector_stores_result_free(usage_vector_stores_result_t *usage_vector_stores_result);

usage_vector_stores_result_t *usage_vector_stores_result_parseFromJSON(cJSON *usage_vector_stores_resultJSON);

cJSON *usage_vector_stores_result_convertToJSON(usage_vector_stores_result_t *usage_vector_stores_result);

#endif /* _usage_vector_stores_result_H_ */

