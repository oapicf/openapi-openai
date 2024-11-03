/*
 * fine_tuning_job_checkpoint_metrics.h
 *
 * Metrics at the step number during the fine-tuning job.
 */

#ifndef _fine_tuning_job_checkpoint_metrics_H_
#define _fine_tuning_job_checkpoint_metrics_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct fine_tuning_job_checkpoint_metrics_t fine_tuning_job_checkpoint_metrics_t;




typedef struct fine_tuning_job_checkpoint_metrics_t {
    double step; //numeric
    double train_loss; //numeric
    double train_mean_token_accuracy; //numeric
    double valid_loss; //numeric
    double valid_mean_token_accuracy; //numeric
    double full_valid_loss; //numeric
    double full_valid_mean_token_accuracy; //numeric

} fine_tuning_job_checkpoint_metrics_t;

fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics_create(
    double step,
    double train_loss,
    double train_mean_token_accuracy,
    double valid_loss,
    double valid_mean_token_accuracy,
    double full_valid_loss,
    double full_valid_mean_token_accuracy
);

void fine_tuning_job_checkpoint_metrics_free(fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics);

fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics_parseFromJSON(cJSON *fine_tuning_job_checkpoint_metricsJSON);

cJSON *fine_tuning_job_checkpoint_metrics_convertToJSON(fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics);

#endif /* _fine_tuning_job_checkpoint_metrics_H_ */

