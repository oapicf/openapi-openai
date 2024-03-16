#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_fine_tune_request.h"



create_fine_tune_request_t *create_fine_tune_request_create(
    char *training_file,
    char *validation_file,
    create_fine_tune_request_model_t *model,
    int n_epochs,
    int batch_size,
    double learning_rate_multiplier,
    double prompt_loss_weight,
    int compute_classification_metrics,
    int classification_n_classes,
    char *classification_positive_class,
    list_t *classification_betas,
    char *suffix
    ) {
    create_fine_tune_request_t *create_fine_tune_request_local_var = malloc(sizeof(create_fine_tune_request_t));
    if (!create_fine_tune_request_local_var) {
        return NULL;
    }
    create_fine_tune_request_local_var->training_file = training_file;
    create_fine_tune_request_local_var->validation_file = validation_file;
    create_fine_tune_request_local_var->model = model;
    create_fine_tune_request_local_var->n_epochs = n_epochs;
    create_fine_tune_request_local_var->batch_size = batch_size;
    create_fine_tune_request_local_var->learning_rate_multiplier = learning_rate_multiplier;
    create_fine_tune_request_local_var->prompt_loss_weight = prompt_loss_weight;
    create_fine_tune_request_local_var->compute_classification_metrics = compute_classification_metrics;
    create_fine_tune_request_local_var->classification_n_classes = classification_n_classes;
    create_fine_tune_request_local_var->classification_positive_class = classification_positive_class;
    create_fine_tune_request_local_var->classification_betas = classification_betas;
    create_fine_tune_request_local_var->suffix = suffix;

    return create_fine_tune_request_local_var;
}


void create_fine_tune_request_free(create_fine_tune_request_t *create_fine_tune_request) {
    if(NULL == create_fine_tune_request){
        return ;
    }
    listEntry_t *listEntry;
    if (create_fine_tune_request->training_file) {
        free(create_fine_tune_request->training_file);
        create_fine_tune_request->training_file = NULL;
    }
    if (create_fine_tune_request->validation_file) {
        free(create_fine_tune_request->validation_file);
        create_fine_tune_request->validation_file = NULL;
    }
    if (create_fine_tune_request->model) {
        create_fine_tune_request_model_free(create_fine_tune_request->model);
        create_fine_tune_request->model = NULL;
    }
    if (create_fine_tune_request->classification_positive_class) {
        free(create_fine_tune_request->classification_positive_class);
        create_fine_tune_request->classification_positive_class = NULL;
    }
    if (create_fine_tune_request->classification_betas) {
        list_ForEach(listEntry, create_fine_tune_request->classification_betas) {
            free(listEntry->data);
        }
        list_freeList(create_fine_tune_request->classification_betas);
        create_fine_tune_request->classification_betas = NULL;
    }
    if (create_fine_tune_request->suffix) {
        free(create_fine_tune_request->suffix);
        create_fine_tune_request->suffix = NULL;
    }
    free(create_fine_tune_request);
}

cJSON *create_fine_tune_request_convertToJSON(create_fine_tune_request_t *create_fine_tune_request) {
    cJSON *item = cJSON_CreateObject();

    // create_fine_tune_request->training_file
    if (!create_fine_tune_request->training_file) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "training_file", create_fine_tune_request->training_file) == NULL) {
    goto fail; //String
    }


    // create_fine_tune_request->validation_file
    if(create_fine_tune_request->validation_file) {
    if(cJSON_AddStringToObject(item, "validation_file", create_fine_tune_request->validation_file) == NULL) {
    goto fail; //String
    }
    }


    // create_fine_tune_request->model
    if(create_fine_tune_request->model) {
    cJSON *model_local_JSON = create_fine_tune_request_model_convertToJSON(create_fine_tune_request->model);
    if(model_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "model", model_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_fine_tune_request->n_epochs
    if(create_fine_tune_request->n_epochs) {
    if(cJSON_AddNumberToObject(item, "n_epochs", create_fine_tune_request->n_epochs) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_fine_tune_request->batch_size
    if(create_fine_tune_request->batch_size) {
    if(cJSON_AddNumberToObject(item, "batch_size", create_fine_tune_request->batch_size) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_fine_tune_request->learning_rate_multiplier
    if(create_fine_tune_request->learning_rate_multiplier) {
    if(cJSON_AddNumberToObject(item, "learning_rate_multiplier", create_fine_tune_request->learning_rate_multiplier) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_fine_tune_request->prompt_loss_weight
    if(create_fine_tune_request->prompt_loss_weight) {
    if(cJSON_AddNumberToObject(item, "prompt_loss_weight", create_fine_tune_request->prompt_loss_weight) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_fine_tune_request->compute_classification_metrics
    if(create_fine_tune_request->compute_classification_metrics) {
    if(cJSON_AddBoolToObject(item, "compute_classification_metrics", create_fine_tune_request->compute_classification_metrics) == NULL) {
    goto fail; //Bool
    }
    }


    // create_fine_tune_request->classification_n_classes
    if(create_fine_tune_request->classification_n_classes) {
    if(cJSON_AddNumberToObject(item, "classification_n_classes", create_fine_tune_request->classification_n_classes) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_fine_tune_request->classification_positive_class
    if(create_fine_tune_request->classification_positive_class) {
    if(cJSON_AddStringToObject(item, "classification_positive_class", create_fine_tune_request->classification_positive_class) == NULL) {
    goto fail; //String
    }
    }


    // create_fine_tune_request->classification_betas
    if(create_fine_tune_request->classification_betas) {
    cJSON *classification_betas = cJSON_AddArrayToObject(item, "classification_betas");
    if(classification_betas == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *classification_betasListEntry;
    list_ForEach(classification_betasListEntry, create_fine_tune_request->classification_betas) {
    if(cJSON_AddNumberToObject(classification_betas, "", *(double *)classification_betasListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // create_fine_tune_request->suffix
    if(create_fine_tune_request->suffix) {
    if(cJSON_AddStringToObject(item, "suffix", create_fine_tune_request->suffix) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_fine_tune_request_t *create_fine_tune_request_parseFromJSON(cJSON *create_fine_tune_requestJSON){

    create_fine_tune_request_t *create_fine_tune_request_local_var = NULL;

    // define the local variable for create_fine_tune_request->model
    create_fine_tune_request_model_t *model_local_nonprim = NULL;

    // define the local list for create_fine_tune_request->classification_betas
    list_t *classification_betasList = NULL;

    // create_fine_tune_request->training_file
    cJSON *training_file = cJSON_GetObjectItemCaseSensitive(create_fine_tune_requestJSON, "training_file");
    if (!training_file) {
        goto end;
    }

    
    if(!cJSON_IsString(training_file))
    {
    goto end; //String
    }

    // create_fine_tune_request->validation_file
    cJSON *validation_file = cJSON_GetObjectItemCaseSensitive(create_fine_tune_requestJSON, "validation_file");
    if (validation_file) { 
    if(!cJSON_IsString(validation_file) && !cJSON_IsNull(validation_file))
    {
    goto end; //String
    }
    }

    // create_fine_tune_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_fine_tune_requestJSON, "model");
    if (model) { 
    model_local_nonprim = create_fine_tune_request_model_parseFromJSON(model); //nonprimitive
    }

    // create_fine_tune_request->n_epochs
    cJSON *n_epochs = cJSON_GetObjectItemCaseSensitive(create_fine_tune_requestJSON, "n_epochs");
    if (n_epochs) { 
    if(!cJSON_IsNumber(n_epochs))
    {
    goto end; //Numeric
    }
    }

    // create_fine_tune_request->batch_size
    cJSON *batch_size = cJSON_GetObjectItemCaseSensitive(create_fine_tune_requestJSON, "batch_size");
    if (batch_size) { 
    if(!cJSON_IsNumber(batch_size))
    {
    goto end; //Numeric
    }
    }

    // create_fine_tune_request->learning_rate_multiplier
    cJSON *learning_rate_multiplier = cJSON_GetObjectItemCaseSensitive(create_fine_tune_requestJSON, "learning_rate_multiplier");
    if (learning_rate_multiplier) { 
    if(!cJSON_IsNumber(learning_rate_multiplier))
    {
    goto end; //Numeric
    }
    }

    // create_fine_tune_request->prompt_loss_weight
    cJSON *prompt_loss_weight = cJSON_GetObjectItemCaseSensitive(create_fine_tune_requestJSON, "prompt_loss_weight");
    if (prompt_loss_weight) { 
    if(!cJSON_IsNumber(prompt_loss_weight))
    {
    goto end; //Numeric
    }
    }

    // create_fine_tune_request->compute_classification_metrics
    cJSON *compute_classification_metrics = cJSON_GetObjectItemCaseSensitive(create_fine_tune_requestJSON, "compute_classification_metrics");
    if (compute_classification_metrics) { 
    if(!cJSON_IsBool(compute_classification_metrics))
    {
    goto end; //Bool
    }
    }

    // create_fine_tune_request->classification_n_classes
    cJSON *classification_n_classes = cJSON_GetObjectItemCaseSensitive(create_fine_tune_requestJSON, "classification_n_classes");
    if (classification_n_classes) { 
    if(!cJSON_IsNumber(classification_n_classes))
    {
    goto end; //Numeric
    }
    }

    // create_fine_tune_request->classification_positive_class
    cJSON *classification_positive_class = cJSON_GetObjectItemCaseSensitive(create_fine_tune_requestJSON, "classification_positive_class");
    if (classification_positive_class) { 
    if(!cJSON_IsString(classification_positive_class) && !cJSON_IsNull(classification_positive_class))
    {
    goto end; //String
    }
    }

    // create_fine_tune_request->classification_betas
    cJSON *classification_betas = cJSON_GetObjectItemCaseSensitive(create_fine_tune_requestJSON, "classification_betas");
    if (classification_betas) { 
    cJSON *classification_betas_local = NULL;
    if(!cJSON_IsArray(classification_betas)) {
        goto end;//primitive container
    }
    classification_betasList = list_createList();

    cJSON_ArrayForEach(classification_betas_local, classification_betas)
    {
        if(!cJSON_IsNumber(classification_betas_local))
        {
            goto end;
        }
        double *classification_betas_local_value = (double *)calloc(1, sizeof(double));
        if(!classification_betas_local_value)
        {
            goto end;
        }
        *classification_betas_local_value = classification_betas_local->valuedouble;
        list_addElement(classification_betasList , classification_betas_local_value);
    }
    }

    // create_fine_tune_request->suffix
    cJSON *suffix = cJSON_GetObjectItemCaseSensitive(create_fine_tune_requestJSON, "suffix");
    if (suffix) { 
    if(!cJSON_IsString(suffix) && !cJSON_IsNull(suffix))
    {
    goto end; //String
    }
    }


    create_fine_tune_request_local_var = create_fine_tune_request_create (
        strdup(training_file->valuestring),
        validation_file && !cJSON_IsNull(validation_file) ? strdup(validation_file->valuestring) : NULL,
        model ? model_local_nonprim : NULL,
        n_epochs ? n_epochs->valuedouble : 0,
        batch_size ? batch_size->valuedouble : 0,
        learning_rate_multiplier ? learning_rate_multiplier->valuedouble : 0,
        prompt_loss_weight ? prompt_loss_weight->valuedouble : 0,
        compute_classification_metrics ? compute_classification_metrics->valueint : 0,
        classification_n_classes ? classification_n_classes->valuedouble : 0,
        classification_positive_class && !cJSON_IsNull(classification_positive_class) ? strdup(classification_positive_class->valuestring) : NULL,
        classification_betas ? classification_betasList : NULL,
        suffix && !cJSON_IsNull(suffix) ? strdup(suffix->valuestring) : NULL
        );

    return create_fine_tune_request_local_var;
end:
    if (model_local_nonprim) {
        create_fine_tune_request_model_free(model_local_nonprim);
        model_local_nonprim = NULL;
    }
    if (classification_betasList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, classification_betasList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(classification_betasList);
        classification_betasList = NULL;
    }
    return NULL;

}
