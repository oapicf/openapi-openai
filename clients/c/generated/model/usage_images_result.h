/*
 * usage_images_result.h
 *
 * The aggregated images usage details of the specific time bucket.
 */

#ifndef _usage_images_result_H_
#define _usage_images_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct usage_images_result_t usage_images_result_t;


// Enum OBJECT for usage_images_result

typedef enum  { openai_api_usage_images_result_OBJECT_NULL = 0, openai_api_usage_images_result_OBJECT_organization.usage.images.result } openai_api_usage_images_result_OBJECT_e;

char* usage_images_result_object_ToString(openai_api_usage_images_result_OBJECT_e object);

openai_api_usage_images_result_OBJECT_e usage_images_result_object_FromString(char* object);



typedef struct usage_images_result_t {
    openai_api_usage_images_result_OBJECT_e object; //enum
    int images; //numeric
    int num_model_requests; //numeric
    char *source; // string
    char *size; // string
    char *project_id; // string
    char *user_id; // string
    char *api_key_id; // string
    char *model; // string

    int _library_owned; // Is the library responsible for freeing this object?
} usage_images_result_t;

__attribute__((deprecated)) usage_images_result_t *usage_images_result_create(
    openai_api_usage_images_result_OBJECT_e object,
    int images,
    int num_model_requests,
    char *source,
    char *size,
    char *project_id,
    char *user_id,
    char *api_key_id,
    char *model
);

void usage_images_result_free(usage_images_result_t *usage_images_result);

usage_images_result_t *usage_images_result_parseFromJSON(cJSON *usage_images_resultJSON);

cJSON *usage_images_result_convertToJSON(usage_images_result_t *usage_images_result);

#endif /* _usage_images_result_H_ */

