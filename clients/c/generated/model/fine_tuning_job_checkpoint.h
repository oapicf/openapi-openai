/*
 * fine_tuning_job_checkpoint.h
 *
 * The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. 
 */

#ifndef _fine_tuning_job_checkpoint_H_
#define _fine_tuning_job_checkpoint_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tuning_job_checkpoint_t fine_tuning_job_checkpoint_t;

#include "fine_tuning_job_checkpoint_metrics.h"

// Enum OBJECT for fine_tuning_job_checkpoint

typedef enum  { openai_api_fine_tuning_job_checkpoint_OBJECT_NULL = 0, openai_api_fine_tuning_job_checkpoint_OBJECT_fine_tuning.job.checkpoint } openai_api_fine_tuning_job_checkpoint_OBJECT_e;

char* fine_tuning_job_checkpoint_object_ToString(openai_api_fine_tuning_job_checkpoint_OBJECT_e object);

openai_api_fine_tuning_job_checkpoint_OBJECT_e fine_tuning_job_checkpoint_object_FromString(char* object);



typedef struct fine_tuning_job_checkpoint_t {
    char *id; // string
    int created_at; //numeric
    char *fine_tuned_model_checkpoint; // string
    int step_number; //numeric
    struct fine_tuning_job_checkpoint_metrics_t *metrics; //model
    char *fine_tuning_job_id; // string
    openai_api_fine_tuning_job_checkpoint_OBJECT_e object; //enum

} fine_tuning_job_checkpoint_t;

fine_tuning_job_checkpoint_t *fine_tuning_job_checkpoint_create(
    char *id,
    int created_at,
    char *fine_tuned_model_checkpoint,
    int step_number,
    fine_tuning_job_checkpoint_metrics_t *metrics,
    char *fine_tuning_job_id,
    openai_api_fine_tuning_job_checkpoint_OBJECT_e object
);

void fine_tuning_job_checkpoint_free(fine_tuning_job_checkpoint_t *fine_tuning_job_checkpoint);

fine_tuning_job_checkpoint_t *fine_tuning_job_checkpoint_parseFromJSON(cJSON *fine_tuning_job_checkpointJSON);

cJSON *fine_tuning_job_checkpoint_convertToJSON(fine_tuning_job_checkpoint_t *fine_tuning_job_checkpoint);

#endif /* _fine_tuning_job_checkpoint_H_ */

