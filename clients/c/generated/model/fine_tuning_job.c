#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tuning_job.h"


char* fine_tuning_job_object_ToString(openai_api_fine_tuning_job_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "fine_tuning.job" };
    return objectArray[object];
}

openai_api_fine_tuning_job_OBJECT_e fine_tuning_job_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "fine_tuning.job" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* fine_tuning_job_status_ToString(openai_api_fine_tuning_job_STATUS_e status) {
    char* statusArray[] =  { "NULL", "validating_files", "queued", "running", "succeeded", "failed", "cancelled" };
    return statusArray[status];
}

openai_api_fine_tuning_job_STATUS_e fine_tuning_job_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "validating_files", "queued", "running", "succeeded", "failed", "cancelled" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

fine_tuning_job_t *fine_tuning_job_create(
    char *id,
    int created_at,
    fine_tuning_job_error_t *error,
    char *fine_tuned_model,
    int finished_at,
    fine_tuning_job_hyperparameters_t *hyperparameters,
    char *model,
    openai_api_fine_tuning_job_OBJECT_e object,
    char *organization_id,
    list_t *result_files,
    openai_api_fine_tuning_job_STATUS_e status,
    int trained_tokens,
    char *training_file,
    char *validation_file,
    list_t *integrations,
    int seed
    ) {
    fine_tuning_job_t *fine_tuning_job_local_var = malloc(sizeof(fine_tuning_job_t));
    if (!fine_tuning_job_local_var) {
        return NULL;
    }
    fine_tuning_job_local_var->id = id;
    fine_tuning_job_local_var->created_at = created_at;
    fine_tuning_job_local_var->error = error;
    fine_tuning_job_local_var->fine_tuned_model = fine_tuned_model;
    fine_tuning_job_local_var->finished_at = finished_at;
    fine_tuning_job_local_var->hyperparameters = hyperparameters;
    fine_tuning_job_local_var->model = model;
    fine_tuning_job_local_var->object = object;
    fine_tuning_job_local_var->organization_id = organization_id;
    fine_tuning_job_local_var->result_files = result_files;
    fine_tuning_job_local_var->status = status;
    fine_tuning_job_local_var->trained_tokens = trained_tokens;
    fine_tuning_job_local_var->training_file = training_file;
    fine_tuning_job_local_var->validation_file = validation_file;
    fine_tuning_job_local_var->integrations = integrations;
    fine_tuning_job_local_var->seed = seed;

    return fine_tuning_job_local_var;
}


void fine_tuning_job_free(fine_tuning_job_t *fine_tuning_job) {
    if(NULL == fine_tuning_job){
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tuning_job->id) {
        free(fine_tuning_job->id);
        fine_tuning_job->id = NULL;
    }
    if (fine_tuning_job->error) {
        fine_tuning_job_error_free(fine_tuning_job->error);
        fine_tuning_job->error = NULL;
    }
    if (fine_tuning_job->fine_tuned_model) {
        free(fine_tuning_job->fine_tuned_model);
        fine_tuning_job->fine_tuned_model = NULL;
    }
    if (fine_tuning_job->hyperparameters) {
        fine_tuning_job_hyperparameters_free(fine_tuning_job->hyperparameters);
        fine_tuning_job->hyperparameters = NULL;
    }
    if (fine_tuning_job->model) {
        free(fine_tuning_job->model);
        fine_tuning_job->model = NULL;
    }
    if (fine_tuning_job->organization_id) {
        free(fine_tuning_job->organization_id);
        fine_tuning_job->organization_id = NULL;
    }
    if (fine_tuning_job->result_files) {
        list_ForEach(listEntry, fine_tuning_job->result_files) {
            free(listEntry->data);
        }
        list_freeList(fine_tuning_job->result_files);
        fine_tuning_job->result_files = NULL;
    }
    if (fine_tuning_job->training_file) {
        free(fine_tuning_job->training_file);
        fine_tuning_job->training_file = NULL;
    }
    if (fine_tuning_job->validation_file) {
        free(fine_tuning_job->validation_file);
        fine_tuning_job->validation_file = NULL;
    }
    if (fine_tuning_job->integrations) {
        list_ForEach(listEntry, fine_tuning_job->integrations) {
            fine_tuning_job_integrations_inner_free(listEntry->data);
        }
        list_freeList(fine_tuning_job->integrations);
        fine_tuning_job->integrations = NULL;
    }
    free(fine_tuning_job);
}

cJSON *fine_tuning_job_convertToJSON(fine_tuning_job_t *fine_tuning_job) {
    cJSON *item = cJSON_CreateObject();

    // fine_tuning_job->id
    if (!fine_tuning_job->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", fine_tuning_job->id) == NULL) {
    goto fail; //String
    }


    // fine_tuning_job->created_at
    if (!fine_tuning_job->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", fine_tuning_job->created_at) == NULL) {
    goto fail; //Numeric
    }


    // fine_tuning_job->error
    if (!fine_tuning_job->error) {
        goto fail;
    }
    cJSON *error_local_JSON = fine_tuning_job_error_convertToJSON(fine_tuning_job->error);
    if(error_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "error", error_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // fine_tuning_job->fine_tuned_model
    if (!fine_tuning_job->fine_tuned_model) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "fine_tuned_model", fine_tuning_job->fine_tuned_model) == NULL) {
    goto fail; //String
    }


    // fine_tuning_job->finished_at
    if (!fine_tuning_job->finished_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "finished_at", fine_tuning_job->finished_at) == NULL) {
    goto fail; //Numeric
    }


    // fine_tuning_job->hyperparameters
    if (!fine_tuning_job->hyperparameters) {
        goto fail;
    }
    cJSON *hyperparameters_local_JSON = fine_tuning_job_hyperparameters_convertToJSON(fine_tuning_job->hyperparameters);
    if(hyperparameters_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hyperparameters", hyperparameters_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // fine_tuning_job->model
    if (!fine_tuning_job->model) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "model", fine_tuning_job->model) == NULL) {
    goto fail; //String
    }


    // fine_tuning_job->object
    if (openai_api_fine_tuning_job_OBJECT_NULL == fine_tuning_job->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", objectfine_tuning_job_ToString(fine_tuning_job->object)) == NULL)
    {
    goto fail; //Enum
    }


    // fine_tuning_job->organization_id
    if (!fine_tuning_job->organization_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "organization_id", fine_tuning_job->organization_id) == NULL) {
    goto fail; //String
    }


    // fine_tuning_job->result_files
    if (!fine_tuning_job->result_files) {
        goto fail;
    }
    cJSON *result_files = cJSON_AddArrayToObject(item, "result_files");
    if(result_files == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *result_filesListEntry;
    list_ForEach(result_filesListEntry, fine_tuning_job->result_files) {
    if(cJSON_AddStringToObject(result_files, "", (char*)result_filesListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // fine_tuning_job->status
    if (openai_api_fine_tuning_job_STATUS_NULL == fine_tuning_job->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", statusfine_tuning_job_ToString(fine_tuning_job->status)) == NULL)
    {
    goto fail; //Enum
    }


    // fine_tuning_job->trained_tokens
    if (!fine_tuning_job->trained_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "trained_tokens", fine_tuning_job->trained_tokens) == NULL) {
    goto fail; //Numeric
    }


    // fine_tuning_job->training_file
    if (!fine_tuning_job->training_file) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "training_file", fine_tuning_job->training_file) == NULL) {
    goto fail; //String
    }


    // fine_tuning_job->validation_file
    if (!fine_tuning_job->validation_file) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "validation_file", fine_tuning_job->validation_file) == NULL) {
    goto fail; //String
    }


    // fine_tuning_job->integrations
    if(fine_tuning_job->integrations) {
    cJSON *integrations = cJSON_AddArrayToObject(item, "integrations");
    if(integrations == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *integrationsListEntry;
    if (fine_tuning_job->integrations) {
    list_ForEach(integrationsListEntry, fine_tuning_job->integrations) {
    cJSON *itemLocal = fine_tuning_job_integrations_inner_convertToJSON(integrationsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(integrations, itemLocal);
    }
    }
    }


    // fine_tuning_job->seed
    if (!fine_tuning_job->seed) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "seed", fine_tuning_job->seed) == NULL) {
    goto fail; //Numeric
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

fine_tuning_job_t *fine_tuning_job_parseFromJSON(cJSON *fine_tuning_jobJSON){

    fine_tuning_job_t *fine_tuning_job_local_var = NULL;

    // define the local variable for fine_tuning_job->error
    fine_tuning_job_error_t *error_local_nonprim = NULL;

    // define the local variable for fine_tuning_job->hyperparameters
    fine_tuning_job_hyperparameters_t *hyperparameters_local_nonprim = NULL;

    // define the local list for fine_tuning_job->result_files
    list_t *result_filesList = NULL;

    // define the local list for fine_tuning_job->integrations
    list_t *integrationsList = NULL;

    // fine_tuning_job->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // fine_tuning_job->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "created_at");
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }

    // fine_tuning_job->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "error");
    if (!error) {
        goto end;
    }

    
    error_local_nonprim = fine_tuning_job_error_parseFromJSON(error); //nonprimitive

    // fine_tuning_job->fine_tuned_model
    cJSON *fine_tuned_model = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "fine_tuned_model");
    if (!fine_tuned_model) {
        goto end;
    }

    
    if(!cJSON_IsString(fine_tuned_model))
    {
    goto end; //String
    }

    // fine_tuning_job->finished_at
    cJSON *finished_at = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "finished_at");
    if (!finished_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(finished_at))
    {
    goto end; //Numeric
    }

    // fine_tuning_job->hyperparameters
    cJSON *hyperparameters = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "hyperparameters");
    if (!hyperparameters) {
        goto end;
    }

    
    hyperparameters_local_nonprim = fine_tuning_job_hyperparameters_parseFromJSON(hyperparameters); //nonprimitive

    // fine_tuning_job->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "model");
    if (!model) {
        goto end;
    }

    
    if(!cJSON_IsString(model))
    {
    goto end; //String
    }

    // fine_tuning_job->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "object");
    if (!object) {
        goto end;
    }

    openai_api_fine_tuning_job_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = fine_tuning_job_object_FromString(object->valuestring);

    // fine_tuning_job->organization_id
    cJSON *organization_id = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "organization_id");
    if (!organization_id) {
        goto end;
    }

    
    if(!cJSON_IsString(organization_id))
    {
    goto end; //String
    }

    // fine_tuning_job->result_files
    cJSON *result_files = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "result_files");
    if (!result_files) {
        goto end;
    }

    
    cJSON *result_files_local = NULL;
    if(!cJSON_IsArray(result_files)) {
        goto end;//primitive container
    }
    result_filesList = list_createList();

    cJSON_ArrayForEach(result_files_local, result_files)
    {
        if(!cJSON_IsString(result_files_local))
        {
            goto end;
        }
        list_addElement(result_filesList , strdup(result_files_local->valuestring));
    }

    // fine_tuning_job->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "status");
    if (!status) {
        goto end;
    }

    openai_api_fine_tuning_job_STATUS_e statusVariable;
    
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = fine_tuning_job_status_FromString(status->valuestring);

    // fine_tuning_job->trained_tokens
    cJSON *trained_tokens = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "trained_tokens");
    if (!trained_tokens) {
        goto end;
    }

    
    if(!cJSON_IsNumber(trained_tokens))
    {
    goto end; //Numeric
    }

    // fine_tuning_job->training_file
    cJSON *training_file = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "training_file");
    if (!training_file) {
        goto end;
    }

    
    if(!cJSON_IsString(training_file))
    {
    goto end; //String
    }

    // fine_tuning_job->validation_file
    cJSON *validation_file = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "validation_file");
    if (!validation_file) {
        goto end;
    }

    
    if(!cJSON_IsString(validation_file))
    {
    goto end; //String
    }

    // fine_tuning_job->integrations
    cJSON *integrations = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "integrations");
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
        fine_tuning_job_integrations_inner_t *integrationsItem = fine_tuning_job_integrations_inner_parseFromJSON(integrations_local_nonprimitive);

        list_addElement(integrationsList, integrationsItem);
    }
    }

    // fine_tuning_job->seed
    cJSON *seed = cJSON_GetObjectItemCaseSensitive(fine_tuning_jobJSON, "seed");
    if (!seed) {
        goto end;
    }

    
    if(!cJSON_IsNumber(seed))
    {
    goto end; //Numeric
    }


    fine_tuning_job_local_var = fine_tuning_job_create (
        strdup(id->valuestring),
        created_at->valuedouble,
        error_local_nonprim,
        strdup(fine_tuned_model->valuestring),
        finished_at->valuedouble,
        hyperparameters_local_nonprim,
        strdup(model->valuestring),
        objectVariable,
        strdup(organization_id->valuestring),
        result_filesList,
        statusVariable,
        trained_tokens->valuedouble,
        strdup(training_file->valuestring),
        strdup(validation_file->valuestring),
        integrations ? integrationsList : NULL,
        seed->valuedouble
        );

    return fine_tuning_job_local_var;
end:
    if (error_local_nonprim) {
        fine_tuning_job_error_free(error_local_nonprim);
        error_local_nonprim = NULL;
    }
    if (hyperparameters_local_nonprim) {
        fine_tuning_job_hyperparameters_free(hyperparameters_local_nonprim);
        hyperparameters_local_nonprim = NULL;
    }
    if (result_filesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, result_filesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(result_filesList);
        result_filesList = NULL;
    }
    if (integrationsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, integrationsList) {
            fine_tuning_job_integrations_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(integrationsList);
        integrationsList = NULL;
    }
    return NULL;

}
