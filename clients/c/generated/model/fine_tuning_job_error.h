/*
 * fine_tuning_job_error.h
 *
 * For fine-tuning jobs that have &#x60;failed&#x60;, this will contain more information on the cause of the failure.
 */

#ifndef _fine_tuning_job_error_H_
#define _fine_tuning_job_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tuning_job_error_t fine_tuning_job_error_t;




typedef struct fine_tuning_job_error_t {
    char *code; // string
    char *message; // string
    char *param; // string

} fine_tuning_job_error_t;

fine_tuning_job_error_t *fine_tuning_job_error_create(
    char *code,
    char *message,
    char *param
);

void fine_tuning_job_error_free(fine_tuning_job_error_t *fine_tuning_job_error);

fine_tuning_job_error_t *fine_tuning_job_error_parseFromJSON(cJSON *fine_tuning_job_errorJSON);

cJSON *fine_tuning_job_error_convertToJSON(fine_tuning_job_error_t *fine_tuning_job_error);

#endif /* _fine_tuning_job_error_H_ */

