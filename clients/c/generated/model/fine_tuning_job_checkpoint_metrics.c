#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tuning_job_checkpoint_metrics.h"



static fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics_create_internal(
    double step,
    double train_loss,
    double train_mean_token_accuracy,
    double valid_loss,
    double valid_mean_token_accuracy,
    double full_valid_loss,
    double full_valid_mean_token_accuracy
    ) {
    fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics_local_var = malloc(sizeof(fine_tuning_job_checkpoint_metrics_t));
    if (!fine_tuning_job_checkpoint_metrics_local_var) {
        return NULL;
    }
    fine_tuning_job_checkpoint_metrics_local_var->step = step;
    fine_tuning_job_checkpoint_metrics_local_var->train_loss = train_loss;
    fine_tuning_job_checkpoint_metrics_local_var->train_mean_token_accuracy = train_mean_token_accuracy;
    fine_tuning_job_checkpoint_metrics_local_var->valid_loss = valid_loss;
    fine_tuning_job_checkpoint_metrics_local_var->valid_mean_token_accuracy = valid_mean_token_accuracy;
    fine_tuning_job_checkpoint_metrics_local_var->full_valid_loss = full_valid_loss;
    fine_tuning_job_checkpoint_metrics_local_var->full_valid_mean_token_accuracy = full_valid_mean_token_accuracy;

    fine_tuning_job_checkpoint_metrics_local_var->_library_owned = 1;
    return fine_tuning_job_checkpoint_metrics_local_var;
}

__attribute__((deprecated)) fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics_create(
    double step,
    double train_loss,
    double train_mean_token_accuracy,
    double valid_loss,
    double valid_mean_token_accuracy,
    double full_valid_loss,
    double full_valid_mean_token_accuracy
    ) {
    return fine_tuning_job_checkpoint_metrics_create_internal (
        step,
        train_loss,
        train_mean_token_accuracy,
        valid_loss,
        valid_mean_token_accuracy,
        full_valid_loss,
        full_valid_mean_token_accuracy
        );
}

void fine_tuning_job_checkpoint_metrics_free(fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics) {
    if(NULL == fine_tuning_job_checkpoint_metrics){
        return ;
    }
    if(fine_tuning_job_checkpoint_metrics->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tuning_job_checkpoint_metrics_free");
        return ;
    }
    listEntry_t *listEntry;
    free(fine_tuning_job_checkpoint_metrics);
}

cJSON *fine_tuning_job_checkpoint_metrics_convertToJSON(fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics) {
    cJSON *item = cJSON_CreateObject();

    // fine_tuning_job_checkpoint_metrics->step
    if(fine_tuning_job_checkpoint_metrics->step) {
    if(cJSON_AddNumberToObject(item, "step", fine_tuning_job_checkpoint_metrics->step) == NULL) {
    goto fail; //Numeric
    }
    }


    // fine_tuning_job_checkpoint_metrics->train_loss
    if(fine_tuning_job_checkpoint_metrics->train_loss) {
    if(cJSON_AddNumberToObject(item, "train_loss", fine_tuning_job_checkpoint_metrics->train_loss) == NULL) {
    goto fail; //Numeric
    }
    }


    // fine_tuning_job_checkpoint_metrics->train_mean_token_accuracy
    if(fine_tuning_job_checkpoint_metrics->train_mean_token_accuracy) {
    if(cJSON_AddNumberToObject(item, "train_mean_token_accuracy", fine_tuning_job_checkpoint_metrics->train_mean_token_accuracy) == NULL) {
    goto fail; //Numeric
    }
    }


    // fine_tuning_job_checkpoint_metrics->valid_loss
    if(fine_tuning_job_checkpoint_metrics->valid_loss) {
    if(cJSON_AddNumberToObject(item, "valid_loss", fine_tuning_job_checkpoint_metrics->valid_loss) == NULL) {
    goto fail; //Numeric
    }
    }


    // fine_tuning_job_checkpoint_metrics->valid_mean_token_accuracy
    if(fine_tuning_job_checkpoint_metrics->valid_mean_token_accuracy) {
    if(cJSON_AddNumberToObject(item, "valid_mean_token_accuracy", fine_tuning_job_checkpoint_metrics->valid_mean_token_accuracy) == NULL) {
    goto fail; //Numeric
    }
    }


    // fine_tuning_job_checkpoint_metrics->full_valid_loss
    if(fine_tuning_job_checkpoint_metrics->full_valid_loss) {
    if(cJSON_AddNumberToObject(item, "full_valid_loss", fine_tuning_job_checkpoint_metrics->full_valid_loss) == NULL) {
    goto fail; //Numeric
    }
    }


    // fine_tuning_job_checkpoint_metrics->full_valid_mean_token_accuracy
    if(fine_tuning_job_checkpoint_metrics->full_valid_mean_token_accuracy) {
    if(cJSON_AddNumberToObject(item, "full_valid_mean_token_accuracy", fine_tuning_job_checkpoint_metrics->full_valid_mean_token_accuracy) == NULL) {
    goto fail; //Numeric
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics_parseFromJSON(cJSON *fine_tuning_job_checkpoint_metricsJSON){

    fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics_local_var = NULL;

    // fine_tuning_job_checkpoint_metrics->step
    cJSON *step = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_checkpoint_metricsJSON, "step");
    if (cJSON_IsNull(step)) {
        step = NULL;
    }
    if (step) { 
    if(!cJSON_IsNumber(step))
    {
    goto end; //Numeric
    }
    }

    // fine_tuning_job_checkpoint_metrics->train_loss
    cJSON *train_loss = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_checkpoint_metricsJSON, "train_loss");
    if (cJSON_IsNull(train_loss)) {
        train_loss = NULL;
    }
    if (train_loss) { 
    if(!cJSON_IsNumber(train_loss))
    {
    goto end; //Numeric
    }
    }

    // fine_tuning_job_checkpoint_metrics->train_mean_token_accuracy
    cJSON *train_mean_token_accuracy = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_checkpoint_metricsJSON, "train_mean_token_accuracy");
    if (cJSON_IsNull(train_mean_token_accuracy)) {
        train_mean_token_accuracy = NULL;
    }
    if (train_mean_token_accuracy) { 
    if(!cJSON_IsNumber(train_mean_token_accuracy))
    {
    goto end; //Numeric
    }
    }

    // fine_tuning_job_checkpoint_metrics->valid_loss
    cJSON *valid_loss = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_checkpoint_metricsJSON, "valid_loss");
    if (cJSON_IsNull(valid_loss)) {
        valid_loss = NULL;
    }
    if (valid_loss) { 
    if(!cJSON_IsNumber(valid_loss))
    {
    goto end; //Numeric
    }
    }

    // fine_tuning_job_checkpoint_metrics->valid_mean_token_accuracy
    cJSON *valid_mean_token_accuracy = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_checkpoint_metricsJSON, "valid_mean_token_accuracy");
    if (cJSON_IsNull(valid_mean_token_accuracy)) {
        valid_mean_token_accuracy = NULL;
    }
    if (valid_mean_token_accuracy) { 
    if(!cJSON_IsNumber(valid_mean_token_accuracy))
    {
    goto end; //Numeric
    }
    }

    // fine_tuning_job_checkpoint_metrics->full_valid_loss
    cJSON *full_valid_loss = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_checkpoint_metricsJSON, "full_valid_loss");
    if (cJSON_IsNull(full_valid_loss)) {
        full_valid_loss = NULL;
    }
    if (full_valid_loss) { 
    if(!cJSON_IsNumber(full_valid_loss))
    {
    goto end; //Numeric
    }
    }

    // fine_tuning_job_checkpoint_metrics->full_valid_mean_token_accuracy
    cJSON *full_valid_mean_token_accuracy = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_checkpoint_metricsJSON, "full_valid_mean_token_accuracy");
    if (cJSON_IsNull(full_valid_mean_token_accuracy)) {
        full_valid_mean_token_accuracy = NULL;
    }
    if (full_valid_mean_token_accuracy) { 
    if(!cJSON_IsNumber(full_valid_mean_token_accuracy))
    {
    goto end; //Numeric
    }
    }


    fine_tuning_job_checkpoint_metrics_local_var = fine_tuning_job_checkpoint_metrics_create_internal (
        step ? step->valuedouble : 0,
        train_loss ? train_loss->valuedouble : 0,
        train_mean_token_accuracy ? train_mean_token_accuracy->valuedouble : 0,
        valid_loss ? valid_loss->valuedouble : 0,
        valid_mean_token_accuracy ? valid_mean_token_accuracy->valuedouble : 0,
        full_valid_loss ? full_valid_loss->valuedouble : 0,
        full_valid_mean_token_accuracy ? full_valid_mean_token_accuracy->valuedouble : 0
        );

    return fine_tuning_job_checkpoint_metrics_local_var;
end:
    return NULL;

}
