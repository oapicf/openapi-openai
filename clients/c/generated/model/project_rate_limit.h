/*
 * project_rate_limit.h
 *
 * Represents a project rate limit config.
 */

#ifndef _project_rate_limit_H_
#define _project_rate_limit_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct project_rate_limit_t project_rate_limit_t;


// Enum OBJECT for project_rate_limit

typedef enum  { openai_api_project_rate_limit_OBJECT_NULL = 0, openai_api_project_rate_limit_OBJECT_project.rate_limit } openai_api_project_rate_limit_OBJECT_e;

char* project_rate_limit_object_ToString(openai_api_project_rate_limit_OBJECT_e object);

openai_api_project_rate_limit_OBJECT_e project_rate_limit_object_FromString(char* object);



typedef struct project_rate_limit_t {
    openai_api_project_rate_limit_OBJECT_e object; //enum
    char *id; // string
    char *model; // string
    int max_requests_per_1_minute; //numeric
    int max_tokens_per_1_minute; //numeric
    int max_images_per_1_minute; //numeric
    int max_audio_megabytes_per_1_minute; //numeric
    int max_requests_per_1_day; //numeric
    int batch_1_day_max_input_tokens; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} project_rate_limit_t;

__attribute__((deprecated)) project_rate_limit_t *project_rate_limit_create(
    openai_api_project_rate_limit_OBJECT_e object,
    char *id,
    char *model,
    int max_requests_per_1_minute,
    int max_tokens_per_1_minute,
    int max_images_per_1_minute,
    int max_audio_megabytes_per_1_minute,
    int max_requests_per_1_day,
    int batch_1_day_max_input_tokens
);

void project_rate_limit_free(project_rate_limit_t *project_rate_limit);

project_rate_limit_t *project_rate_limit_parseFromJSON(cJSON *project_rate_limitJSON);

cJSON *project_rate_limit_convertToJSON(project_rate_limit_t *project_rate_limit);

#endif /* _project_rate_limit_H_ */

