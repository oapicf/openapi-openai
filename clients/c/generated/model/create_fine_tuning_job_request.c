#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_fine_tuning_job_request.h"



static create_fine_tuning_job_request_t *create_fine_tuning_job_request_create_internal(
    create_fine_tuning_job_request_model_t *model,
    char *training_file,
    create_fine_tuning_job_request_hyperparameters_t *hyperparameters,
    char *suffix,
    char *validation_file,
    list_t *integrations,
    int seed
    ) {
    create_fine_tuning_job_request_t *create_fine_tuning_job_request_local_var = malloc(sizeof(create_fine_tuning_job_request_t));
    if (!create_fine_tuning_job_request_local_var) {
        return NULL;
    }
    create_fine_tuning_job_request_local_var->model = model;
    create_fine_tuning_job_request_local_var->training_file = training_file;
    create_fine_tuning_job_request_local_var->hyperparameters = hyperparameters;
    create_fine_tuning_job_request_local_var->suffix = suffix;
    create_fine_tuning_job_request_local_var->validation_file = validation_file;
    create_fine_tuning_job_request_local_var->integrations = integrations;
    create_fine_tuning_job_request_local_var->seed = seed;

    create_fine_tuning_job_request_local_var->_library_owned = 1;
    return create_fine_tuning_job_request_local_var;
}

__attribute__((deprecated)) create_fine_tuning_job_request_t *create_fine_tuning_job_request_create(
    create_fine_tuning_job_request_model_t *model,
    char *training_file,
    create_fine_tuning_job_request_hyperparameters_t *hyperparameters,
    char *suffix,
    char *validation_file,
    list_t *integrations,
    int seed
    ) {
    return create_fine_tuning_job_request_create_internal (
        model,
        training_file,
        hyperparameters,
        suffix,
        validation_file,
        integrations,
        seed
        );
}

void create_fine_tuning_job_request_free(create_fine_tuning_job_request_t *create_fine_tuning_job_request) {
    if(NULL == create_fine_tuning_job_request){
        return ;
    }
    if(create_fine_tuning_job_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_fine_tuning_job_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_fine_tuning_job_request->model) {
        create_fine_tuning_job_request_model_free(create_fine_tuning_job_request->model);
        create_fine_tuning_job_request->model = NULL;
    }
    if (create_fine_tuning_job_request->training_file) {
        free(create_fine_tuning_job_request->training_file);
        create_fine_tuning_job_request->training_file = NULL;
    }
    if (create_fine_tuning_job_request->hyperparameters) {
        create_fine_tuning_job_request_hyperparameters_free(create_fine_tuning_job_request->hyperparameters);
        create_fine_tuning_job_request->hyperparameters = NULL;
    }
    if (create_fine_tuning_job_request->suffix) {
        free(create_fine_tuning_job_request->suffix);
        create_fine_tuning_job_request->suffix = NULL;
    }
    if (create_fine_tuning_job_request->validation_file) {
        free(create_fine_tuning_job_request->validation_file);
        create_fine_tuning_job_request->validation_file = NULL;
    }
    if (create_fine_tuning_job_request->integrations) {
        list_ForEach(listEntry, create_fine_tuning_job_request->integrations) {
            create_fine_tuning_job_request_integrations_inner_free(listEntry->data);
        }
        list_freeList(create_fine_tuning_job_request->integrations);
        create_fine_tuning_job_request->integrations = NULL;
    }
    free(create_fine_tuning_job_request);
}

cJSON *create_fine_tuning_job_request_convertToJSON(create_fine_tuning_job_request_t *create_fine_tuning_job_request) {
    cJSON *item = cJSON_CreateObject();

    // create_fine_tuning_job_request->model
    if (!create_fine_tuning_job_request->model) {
        goto fail;
    }
    cJSON *model_local_JSON = create_fine_tuning_job_request_model_convertToJSON(create_fine_tuning_job_request->model);
    if(model_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "model", model_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_fine_tuning_job_request->training_file
    if (!create_fine_tuning_job_request->training_file) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "training_file", create_fine_tuning_job_request->training_file) == NULL) {
    goto fail; //String
    }


    // create_fine_tuning_job_request->hyperparameters
    if(create_fine_tuning_job_request->hyperparameters) {
    cJSON *hyperparameters_local_JSON = create_fine_tuning_job_request_hyperparameters_convertToJSON(create_fine_tuning_job_request->hyperparameters);
    if(hyperparameters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hyperparameters", hyperparameters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_fine_tuning_job_request->suffix
    if(create_fine_tuning_job_request->suffix) {
    if(cJSON_AddStringToObject(item, "suffix", create_fine_tuning_job_request->suffix) == NULL) {
    goto fail; //String
    }
    }


    // create_fine_tuning_job_request->validation_file
    if(create_fine_tuning_job_request->validation_file) {
    if(cJSON_AddStringToObject(item, "validation_file", create_fine_tuning_job_request->validation_file) == NULL) {
    goto fail; //String
    }
    }


    // create_fine_tuning_job_request->integrations
    if(create_fine_tuning_job_request->integrations) {
    cJSON *integrations = cJSON_AddArrayToObject(item, "integrations");
    if(integrations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *integrationsListEntry;
    if (create_fine_tuning_job_request->integrations) {
    list_ForEach(integrationsListEntry, create_fine_tuning_job_request->integrations) {
    cJSON *itemLocal = create_fine_tuning_job_request_integrations_inner_convertToJSON(integrationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(integrations, itemLocal);
    }
    }
    }


    // create_fine_tuning_job_request->seed
    if(create_fine_tuning_job_request->seed) {
    if(cJSON_AddNumberToObject(item, "seed", create_fine_tuning_job_request->seed) == NULL) {
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

create_fine_tuning_job_request_t *create_fine_tuning_job_request_parseFromJSON(cJSON *create_fine_tuning_job_requestJSON){

    create_fine_tuning_job_request_t *create_fine_tuning_job_request_local_var = NULL;

    // define the local variable for create_fine_tuning_job_request->model
    create_fine_tuning_job_request_model_t *model_local_nonprim = NULL;

    // define the local variable for create_fine_tuning_job_request->hyperparameters
    create_fine_tuning_job_request_hyperparameters_t *hyperparameters_local_nonprim = NULL;

    // define the local list for create_fine_tuning_job_request->integrations
    list_t *integrationsList = NULL;

    // create_fine_tuning_job_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_requestJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (!model) {
        goto end;
    }

    
    model_local_nonprim = create_fine_tuning_job_request_model_parseFromJSON(model); //nonprimitive

    // create_fine_tuning_job_request->training_file
    cJSON *training_file = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_requestJSON, "training_file");
    if (cJSON_IsNull(training_file)) {
        training_file = NULL;
    }
    if (!training_file) {
        goto end;
    }

    
    if(!cJSON_IsString(training_file))
    {
    goto end; //String
    }

    // create_fine_tuning_job_request->hyperparameters
    cJSON *hyperparameters = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_requestJSON, "hyperparameters");
    if (cJSON_IsNull(hyperparameters)) {
        hyperparameters = NULL;
    }
    if (hyperparameters) { 
    hyperparameters_local_nonprim = create_fine_tuning_job_request_hyperparameters_parseFromJSON(hyperparameters); //nonprimitive
    }

    // create_fine_tuning_job_request->suffix
    cJSON *suffix = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_requestJSON, "suffix");
    if (cJSON_IsNull(suffix)) {
        suffix = NULL;
    }
    if (suffix) { 
    if(!cJSON_IsString(suffix) && !cJSON_IsNull(suffix))
    {
    goto end; //String
    }
    }

    // create_fine_tuning_job_request->validation_file
    cJSON *validation_file = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_requestJSON, "validation_file");
    if (cJSON_IsNull(validation_file)) {
        validation_file = NULL;
    }
    if (validation_file) { 
    if(!cJSON_IsString(validation_file) && !cJSON_IsNull(validation_file))
    {
    goto end; //String
    }
    }

    // create_fine_tuning_job_request->integrations
    cJSON *integrations = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_requestJSON, "integrations");
    if (cJSON_IsNull(integrations)) {
        integrations = NULL;
    }
    if (integrations) { 
    cJSON *integrations_local_nonprimitive = NULL;
    if(!cJSON_IsArray(integrations)){
        goto end; //nonprimitive container
    }

    integrationsList = list_createList();

    cJSON_ArrayForEach(integrations_local_nonprimitive,integrations )
    {
        if(!cJSON_IsObject(integrations_local_nonprimitive)){
            goto end;
        }
        create_fine_tuning_job_request_integrations_inner_t *integrationsItem = create_fine_tuning_job_request_integrations_inner_parseFromJSON(integrations_local_nonprimitive);

        list_addElement(integrationsList, integrationsItem);
    }
    }

    // create_fine_tuning_job_request->seed
    cJSON *seed = cJSON_GetObjectItemCaseSensitive(create_fine_tuning_job_requestJSON, "seed");
    if (cJSON_IsNull(seed)) {
        seed = NULL;
    }
    if (seed) { 
    if(!cJSON_IsNumber(seed))
    {
    goto end; //Numeric
    }
    }


    create_fine_tuning_job_request_local_var = create_fine_tuning_job_request_create_internal (
        model_local_nonprim,
        strdup(training_file->valuestring),
        hyperparameters ? hyperparameters_local_nonprim : NULL,
        suffix && !cJSON_IsNull(suffix) ? strdup(suffix->valuestring) : NULL,
        validation_file && !cJSON_IsNull(validation_file) ? strdup(validation_file->valuestring) : NULL,
        integrations ? integrationsList : NULL,
        seed ? seed->valuedouble : 0
        );

    return create_fine_tuning_job_request_local_var;
end:
    if (model_local_nonprim) {
        create_fine_tuning_job_request_model_free(model_local_nonprim);
        model_local_nonprim = NULL;
    }
    if (hyperparameters_local_nonprim) {
        create_fine_tuning_job_request_hyperparameters_free(hyperparameters_local_nonprim);
        hyperparameters_local_nonprim = NULL;
    }
    if (integrationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, integrationsList) {
            create_fine_tuning_job_request_integrations_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(integrationsList);
        integrationsList = NULL;
    }
    return NULL;

}
