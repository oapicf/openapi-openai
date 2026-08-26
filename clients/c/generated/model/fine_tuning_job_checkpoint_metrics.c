#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tuning_job_checkpoint_metrics.h"



static fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics_create_internal(
    double *step,
    double *train_loss,
    double *train_mean_token_accuracy,
    double *valid_loss,
    double *valid_mean_token_accuracy,
    double *full_valid_loss,
    double *full_valid_mean_token_accuracy
    ) {
    fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics_local_var = malloc(sizeof(fine_tuning_job_checkpoint_metrics_t));
    if (!fine_tuning_job_checkpoint_metrics_local_var) {
        return NULL;
    }
    memset(fine_tuning_job_checkpoint_metrics_local_var, 0, sizeof(fine_tuning_job_checkpoint_metrics_t));
    fine_tuning_job_checkpoint_metrics_local_var->_library_owned = 1;
    fine_tuning_job_checkpoint_metrics_local_var->step = step;
    fine_tuning_job_checkpoint_metrics_local_var->train_loss = train_loss;
    fine_tuning_job_checkpoint_metrics_local_var->train_mean_token_accuracy = train_mean_token_accuracy;
    fine_tuning_job_checkpoint_metrics_local_var->valid_loss = valid_loss;
    fine_tuning_job_checkpoint_metrics_local_var->valid_mean_token_accuracy = valid_mean_token_accuracy;
    fine_tuning_job_checkpoint_metrics_local_var->full_valid_loss = full_valid_loss;
    fine_tuning_job_checkpoint_metrics_local_var->full_valid_mean_token_accuracy = full_valid_mean_token_accuracy;
    return fine_tuning_job_checkpoint_metrics_local_var;
}

__attribute__((deprecated)) fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics_create(
    double *step,
    double *train_loss,
    double *train_mean_token_accuracy,
    double *valid_loss,
    double *valid_mean_token_accuracy,
    double *full_valid_loss,
    double *full_valid_mean_token_accuracy
    ) {
    double *step_copy = NULL;
    if (step) {
        step_copy = malloc(sizeof(double));
        if (step_copy) *step_copy = *step;
    }
    double *train_loss_copy = NULL;
    if (train_loss) {
        train_loss_copy = malloc(sizeof(double));
        if (train_loss_copy) *train_loss_copy = *train_loss;
    }
    double *train_mean_token_accuracy_copy = NULL;
    if (train_mean_token_accuracy) {
        train_mean_token_accuracy_copy = malloc(sizeof(double));
        if (train_mean_token_accuracy_copy) *train_mean_token_accuracy_copy = *train_mean_token_accuracy;
    }
    double *valid_loss_copy = NULL;
    if (valid_loss) {
        valid_loss_copy = malloc(sizeof(double));
        if (valid_loss_copy) *valid_loss_copy = *valid_loss;
    }
    double *valid_mean_token_accuracy_copy = NULL;
    if (valid_mean_token_accuracy) {
        valid_mean_token_accuracy_copy = malloc(sizeof(double));
        if (valid_mean_token_accuracy_copy) *valid_mean_token_accuracy_copy = *valid_mean_token_accuracy;
    }
    double *full_valid_loss_copy = NULL;
    if (full_valid_loss) {
        full_valid_loss_copy = malloc(sizeof(double));
        if (full_valid_loss_copy) *full_valid_loss_copy = *full_valid_loss;
    }
    double *full_valid_mean_token_accuracy_copy = NULL;
    if (full_valid_mean_token_accuracy) {
        full_valid_mean_token_accuracy_copy = malloc(sizeof(double));
        if (full_valid_mean_token_accuracy_copy) *full_valid_mean_token_accuracy_copy = *full_valid_mean_token_accuracy;
    }
    fine_tuning_job_checkpoint_metrics_t *result = fine_tuning_job_checkpoint_metrics_create_internal (
        step_copy,
        train_loss_copy,
        train_mean_token_accuracy_copy,
        valid_loss_copy,
        valid_mean_token_accuracy_copy,
        full_valid_loss_copy,
        full_valid_mean_token_accuracy_copy
        );
    if (!result) {
        free(step_copy);
        free(train_loss_copy);
        free(train_mean_token_accuracy_copy);
        free(valid_loss_copy);
        free(valid_mean_token_accuracy_copy);
        free(full_valid_loss_copy);
        free(full_valid_mean_token_accuracy_copy);
    }
    return result;
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
    if (fine_tuning_job_checkpoint_metrics->step) {
        free(fine_tuning_job_checkpoint_metrics->step);
        fine_tuning_job_checkpoint_metrics->step = NULL;
    }
    if (fine_tuning_job_checkpoint_metrics->train_loss) {
        free(fine_tuning_job_checkpoint_metrics->train_loss);
        fine_tuning_job_checkpoint_metrics->train_loss = NULL;
    }
    if (fine_tuning_job_checkpoint_metrics->train_mean_token_accuracy) {
        free(fine_tuning_job_checkpoint_metrics->train_mean_token_accuracy);
        fine_tuning_job_checkpoint_metrics->train_mean_token_accuracy = NULL;
    }
    if (fine_tuning_job_checkpoint_metrics->valid_loss) {
        free(fine_tuning_job_checkpoint_metrics->valid_loss);
        fine_tuning_job_checkpoint_metrics->valid_loss = NULL;
    }
    if (fine_tuning_job_checkpoint_metrics->valid_mean_token_accuracy) {
        free(fine_tuning_job_checkpoint_metrics->valid_mean_token_accuracy);
        fine_tuning_job_checkpoint_metrics->valid_mean_token_accuracy = NULL;
    }
    if (fine_tuning_job_checkpoint_metrics->full_valid_loss) {
        free(fine_tuning_job_checkpoint_metrics->full_valid_loss);
        fine_tuning_job_checkpoint_metrics->full_valid_loss = NULL;
    }
    if (fine_tuning_job_checkpoint_metrics->full_valid_mean_token_accuracy) {
        free(fine_tuning_job_checkpoint_metrics->full_valid_mean_token_accuracy);
        fine_tuning_job_checkpoint_metrics->full_valid_mean_token_accuracy = NULL;
    }
    free(fine_tuning_job_checkpoint_metrics);
}

cJSON *fine_tuning_job_checkpoint_metrics_convertToJSON(fine_tuning_job_checkpoint_metrics_t *fine_tuning_job_checkpoint_metrics) {
    cJSON *item = cJSON_CreateObject();

    // fine_tuning_job_checkpoint_metrics->step
    if(fine_tuning_job_checkpoint_metrics->step) {
    if(cJSON_AddNumberToObject(item, "step", *fine_tuning_job_checkpoint_metrics->step) == NULL) {
    goto fail; //Numeric
    }
    }


    // fine_tuning_job_checkpoint_metrics->train_loss
    if(fine_tuning_job_checkpoint_metrics->train_loss) {
    if(cJSON_AddNumberToObject(item, "train_loss", *fine_tuning_job_checkpoint_metrics->train_loss) == NULL) {
    goto fail; //Numeric
    }
    }


    // fine_tuning_job_checkpoint_metrics->train_mean_token_accuracy
    if(fine_tuning_job_checkpoint_metrics->train_mean_token_accuracy) {
    if(cJSON_AddNumberToObject(item, "train_mean_token_accuracy", *fine_tuning_job_checkpoint_metrics->train_mean_token_accuracy) == NULL) {
    goto fail; //Numeric
    }
    }


    // fine_tuning_job_checkpoint_metrics->valid_loss
    if(fine_tuning_job_checkpoint_metrics->valid_loss) {
    if(cJSON_AddNumberToObject(item, "valid_loss", *fine_tuning_job_checkpoint_metrics->valid_loss) == NULL) {
    goto fail; //Numeric
    }
    }


    // fine_tuning_job_checkpoint_metrics->valid_mean_token_accuracy
    if(fine_tuning_job_checkpoint_metrics->valid_mean_token_accuracy) {
    if(cJSON_AddNumberToObject(item, "valid_mean_token_accuracy", *fine_tuning_job_checkpoint_metrics->valid_mean_token_accuracy) == NULL) {
    goto fail; //Numeric
    }
    }


    // fine_tuning_job_checkpoint_metrics->full_valid_loss
    if(fine_tuning_job_checkpoint_metrics->full_valid_loss) {
    if(cJSON_AddNumberToObject(item, "full_valid_loss", *fine_tuning_job_checkpoint_metrics->full_valid_loss) == NULL) {
    goto fail; //Numeric
    }
    }


    // fine_tuning_job_checkpoint_metrics->full_valid_mean_token_accuracy
    if(fine_tuning_job_checkpoint_metrics->full_valid_mean_token_accuracy) {
    if(cJSON_AddNumberToObject(item, "full_valid_mean_token_accuracy", *fine_tuning_job_checkpoint_metrics->full_valid_mean_token_accuracy) == NULL) {
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

    // define the local variable for fine_tuning_job_checkpoint_metrics->step
    double *step_local_var = NULL;

    // define the local variable for fine_tuning_job_checkpoint_metrics->train_loss
    double *train_loss_local_var = NULL;

    // define the local variable for fine_tuning_job_checkpoint_metrics->train_mean_token_accuracy
    double *train_mean_token_accuracy_local_var = NULL;

    // define the local variable for fine_tuning_job_checkpoint_metrics->valid_loss
    double *valid_loss_local_var = NULL;

    // define the local variable for fine_tuning_job_checkpoint_metrics->valid_mean_token_accuracy
    double *valid_mean_token_accuracy_local_var = NULL;

    // define the local variable for fine_tuning_job_checkpoint_metrics->full_valid_loss
    double *full_valid_loss_local_var = NULL;

    // define the local variable for fine_tuning_job_checkpoint_metrics->full_valid_mean_token_accuracy
    double *full_valid_mean_token_accuracy_local_var = NULL;

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
    step_local_var = malloc(sizeof(double));
    if(!step_local_var)
    {
        goto end;
    }
    *step_local_var = step->valuedouble;
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
    train_loss_local_var = malloc(sizeof(double));
    if(!train_loss_local_var)
    {
        goto end;
    }
    *train_loss_local_var = train_loss->valuedouble;
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
    train_mean_token_accuracy_local_var = malloc(sizeof(double));
    if(!train_mean_token_accuracy_local_var)
    {
        goto end;
    }
    *train_mean_token_accuracy_local_var = train_mean_token_accuracy->valuedouble;
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
    valid_loss_local_var = malloc(sizeof(double));
    if(!valid_loss_local_var)
    {
        goto end;
    }
    *valid_loss_local_var = valid_loss->valuedouble;
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
    valid_mean_token_accuracy_local_var = malloc(sizeof(double));
    if(!valid_mean_token_accuracy_local_var)
    {
        goto end;
    }
    *valid_mean_token_accuracy_local_var = valid_mean_token_accuracy->valuedouble;
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
    full_valid_loss_local_var = malloc(sizeof(double));
    if(!full_valid_loss_local_var)
    {
        goto end;
    }
    *full_valid_loss_local_var = full_valid_loss->valuedouble;
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
    full_valid_mean_token_accuracy_local_var = malloc(sizeof(double));
    if(!full_valid_mean_token_accuracy_local_var)
    {
        goto end;
    }
    *full_valid_mean_token_accuracy_local_var = full_valid_mean_token_accuracy->valuedouble;
    }



    fine_tuning_job_checkpoint_metrics_local_var = fine_tuning_job_checkpoint_metrics_create_internal (
        step_local_var,
        train_loss_local_var,
        train_mean_token_accuracy_local_var,
        valid_loss_local_var,
        valid_mean_token_accuracy_local_var,
        full_valid_loss_local_var,
        full_valid_mean_token_accuracy_local_var
        );

    if (!fine_tuning_job_checkpoint_metrics_local_var) {
        goto end;
    }

    return fine_tuning_job_checkpoint_metrics_local_var;
end:
    if (step_local_var) {
        free(step_local_var);
        step_local_var = NULL;
    }
    if (train_loss_local_var) {
        free(train_loss_local_var);
        train_loss_local_var = NULL;
    }
    if (train_mean_token_accuracy_local_var) {
        free(train_mean_token_accuracy_local_var);
        train_mean_token_accuracy_local_var = NULL;
    }
    if (valid_loss_local_var) {
        free(valid_loss_local_var);
        valid_loss_local_var = NULL;
    }
    if (valid_mean_token_accuracy_local_var) {
        free(valid_mean_token_accuracy_local_var);
        valid_mean_token_accuracy_local_var = NULL;
    }
    if (full_valid_loss_local_var) {
        free(full_valid_loss_local_var);
        full_valid_loss_local_var = NULL;
    }
    if (full_valid_mean_token_accuracy_local_var) {
        free(full_valid_mean_token_accuracy_local_var);
        full_valid_mean_token_accuracy_local_var = NULL;
    }
    return NULL;

}
