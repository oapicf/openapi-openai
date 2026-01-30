/*
 * project_rate_limit_update_request.h
 *
 * 
 */

#ifndef _project_rate_limit_update_request_H_
#define _project_rate_limit_update_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct project_rate_limit_update_request_t project_rate_limit_update_request_t;




typedef struct project_rate_limit_update_request_t {
    int max_requests_per_1_minute; //numeric
    int max_tokens_per_1_minute; //numeric
    int max_images_per_1_minute; //numeric
    int max_audio_megabytes_per_1_minute; //numeric
    int max_requests_per_1_day; //numeric
    int batch_1_day_max_input_tokens; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} project_rate_limit_update_request_t;

__attribute__((deprecated)) project_rate_limit_update_request_t *project_rate_limit_update_request_create(
    int max_requests_per_1_minute,
    int max_tokens_per_1_minute,
    int max_images_per_1_minute,
    int max_audio_megabytes_per_1_minute,
    int max_requests_per_1_day,
    int batch_1_day_max_input_tokens
);

void project_rate_limit_update_request_free(project_rate_limit_update_request_t *project_rate_limit_update_request);

project_rate_limit_update_request_t *project_rate_limit_update_request_parseFromJSON(cJSON *project_rate_limit_update_requestJSON);

cJSON *project_rate_limit_update_request_convertToJSON(project_rate_limit_update_request_t *project_rate_limit_update_request);

#endif /* _project_rate_limit_update_request_H_ */

