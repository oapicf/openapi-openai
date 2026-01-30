/*
 * audit_log_rate_limit_updated_changes_requested.h
 *
 * The payload used to update the rate limits.
 */

#ifndef _audit_log_rate_limit_updated_changes_requested_H_
#define _audit_log_rate_limit_updated_changes_requested_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct audit_log_rate_limit_updated_changes_requested_t audit_log_rate_limit_updated_changes_requested_t;




typedef struct audit_log_rate_limit_updated_changes_requested_t {
    int max_requests_per_1_minute; //numeric
    int max_tokens_per_1_minute; //numeric
    int max_images_per_1_minute; //numeric
    int max_audio_megabytes_per_1_minute; //numeric
    int max_requests_per_1_day; //numeric
    int batch_1_day_max_input_tokens; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} audit_log_rate_limit_updated_changes_requested_t;

__attribute__((deprecated)) audit_log_rate_limit_updated_changes_requested_t *audit_log_rate_limit_updated_changes_requested_create(
    int max_requests_per_1_minute,
    int max_tokens_per_1_minute,
    int max_images_per_1_minute,
    int max_audio_megabytes_per_1_minute,
    int max_requests_per_1_day,
    int batch_1_day_max_input_tokens
);

void audit_log_rate_limit_updated_changes_requested_free(audit_log_rate_limit_updated_changes_requested_t *audit_log_rate_limit_updated_changes_requested);

audit_log_rate_limit_updated_changes_requested_t *audit_log_rate_limit_updated_changes_requested_parseFromJSON(cJSON *audit_log_rate_limit_updated_changes_requestedJSON);

cJSON *audit_log_rate_limit_updated_changes_requested_convertToJSON(audit_log_rate_limit_updated_changes_requested_t *audit_log_rate_limit_updated_changes_requested);

#endif /* _audit_log_rate_limit_updated_changes_requested_H_ */

