#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "fine_tuning_job_checkpoint.h"


char* fine_tuning_job_checkpoint_object_ToString(openai_api_fine_tuning_job_checkpoint_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "fine_tuning.job.checkpoint" };
    return objectArray[object];
}

openai_api_fine_tuning_job_checkpoint_OBJECT_e fine_tuning_job_checkpoint_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "fine_tuning.job.checkpoint" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static fine_tuning_job_checkpoint_t *fine_tuning_job_checkpoint_create_internal(
    char *id,
    int created_at,
    char *fine_tuned_model_checkpoint,
    int step_number,
    fine_tuning_job_checkpoint_metrics_t *metrics,
    char *fine_tuning_job_id,
    openai_api_fine_tuning_job_checkpoint_OBJECT_e object
    ) {
    fine_tuning_job_checkpoint_t *fine_tuning_job_checkpoint_local_var = malloc(sizeof(fine_tuning_job_checkpoint_t));
    if (!fine_tuning_job_checkpoint_local_var) {
        return NULL;
    }
    fine_tuning_job_checkpoint_local_var->id = id;
    fine_tuning_job_checkpoint_local_var->created_at = created_at;
    fine_tuning_job_checkpoint_local_var->fine_tuned_model_checkpoint = fine_tuned_model_checkpoint;
    fine_tuning_job_checkpoint_local_var->step_number = step_number;
    fine_tuning_job_checkpoint_local_var->metrics = metrics;
    fine_tuning_job_checkpoint_local_var->fine_tuning_job_id = fine_tuning_job_id;
    fine_tuning_job_checkpoint_local_var->object = object;

    fine_tuning_job_checkpoint_local_var->_library_owned = 1;
    return fine_tuning_job_checkpoint_local_var;
}

__attribute__((deprecated)) fine_tuning_job_checkpoint_t *fine_tuning_job_checkpoint_create(
    char *id,
    int created_at,
    char *fine_tuned_model_checkpoint,
    int step_number,
    fine_tuning_job_checkpoint_metrics_t *metrics,
    char *fine_tuning_job_id,
    openai_api_fine_tuning_job_checkpoint_OBJECT_e object
    ) {
    return fine_tuning_job_checkpoint_create_internal (
        id,
        created_at,
        fine_tuned_model_checkpoint,
        step_number,
        metrics,
        fine_tuning_job_id,
        object
        );
}

void fine_tuning_job_checkpoint_free(fine_tuning_job_checkpoint_t *fine_tuning_job_checkpoint) {
    if(NULL == fine_tuning_job_checkpoint){
        return ;
    }
    if(fine_tuning_job_checkpoint->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "fine_tuning_job_checkpoint_free");
        return ;
    }
    listEntry_t *listEntry;
    if (fine_tuning_job_checkpoint->id) {
        free(fine_tuning_job_checkpoint->id);
        fine_tuning_job_checkpoint->id = NULL;
    }
    if (fine_tuning_job_checkpoint->fine_tuned_model_checkpoint) {
        free(fine_tuning_job_checkpoint->fine_tuned_model_checkpoint);
        fine_tuning_job_checkpoint->fine_tuned_model_checkpoint = NULL;
    }
    if (fine_tuning_job_checkpoint->metrics) {
        fine_tuning_job_checkpoint_metrics_free(fine_tuning_job_checkpoint->metrics);
        fine_tuning_job_checkpoint->metrics = NULL;
    }
    if (fine_tuning_job_checkpoint->fine_tuning_job_id) {
        free(fine_tuning_job_checkpoint->fine_tuning_job_id);
        fine_tuning_job_checkpoint->fine_tuning_job_id = NULL;
    }
    free(fine_tuning_job_checkpoint);
}

cJSON *fine_tuning_job_checkpoint_convertToJSON(fine_tuning_job_checkpoint_t *fine_tuning_job_checkpoint) {
    cJSON *item = cJSON_CreateObject();

    // fine_tuning_job_checkpoint->id
    if (!fine_tuning_job_checkpoint->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", fine_tuning_job_checkpoint->id) == NULL) {
    goto fail; //String
    }


    // fine_tuning_job_checkpoint->created_at
    if (!fine_tuning_job_checkpoint->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", fine_tuning_job_checkpoint->created_at) == NULL) {
    goto fail; //Numeric
    }


    // fine_tuning_job_checkpoint->fine_tuned_model_checkpoint
    if (!fine_tuning_job_checkpoint->fine_tuned_model_checkpoint) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "fine_tuned_model_checkpoint", fine_tuning_job_checkpoint->fine_tuned_model_checkpoint) == NULL) {
    goto fail; //String
    }


    // fine_tuning_job_checkpoint->step_number
    if (!fine_tuning_job_checkpoint->step_number) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "step_number", fine_tuning_job_checkpoint->step_number) == NULL) {
    goto fail; //Numeric
    }


    // fine_tuning_job_checkpoint->metrics
    if (!fine_tuning_job_checkpoint->metrics) {
        goto fail;
    }
    cJSON *metrics_local_JSON = fine_tuning_job_checkpoint_metrics_convertToJSON(fine_tuning_job_checkpoint->metrics);
    if(metrics_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metrics", metrics_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // fine_tuning_job_checkpoint->fine_tuning_job_id
    if (!fine_tuning_job_checkpoint->fine_tuning_job_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "fine_tuning_job_id", fine_tuning_job_checkpoint->fine_tuning_job_id) == NULL) {
    goto fail; //String
    }


    // fine_tuning_job_checkpoint->object
    if (openai_api_fine_tuning_job_checkpoint_OBJECT_NULL == fine_tuning_job_checkpoint->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", fine_tuning_job_checkpoint_object_ToString(fine_tuning_job_checkpoint->object)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

fine_tuning_job_checkpoint_t *fine_tuning_job_checkpoint_parseFromJSON(cJSON *fine_tuning_job_checkpointJSON){

    fine_tuning_job_checkpoint_t *fine_tuning_job_checkpoint_local_var = NULL;

    // define the local variable for fine_tuning_job_checkpoint->metrics
    fine_tuning_job_checkpoint_metrics_t *metrics_local_nonprim = NULL;

    // fine_tuning_job_checkpoint->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_checkpointJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // fine_tuning_job_checkpoint->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_checkpointJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }

    // fine_tuning_job_checkpoint->fine_tuned_model_checkpoint
    cJSON *fine_tuned_model_checkpoint = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_checkpointJSON, "fine_tuned_model_checkpoint");
    if (cJSON_IsNull(fine_tuned_model_checkpoint)) {
        fine_tuned_model_checkpoint = NULL;
    }
    if (!fine_tuned_model_checkpoint) {
        goto end;
    }

    
    if(!cJSON_IsString(fine_tuned_model_checkpoint))
    {
    goto end; //String
    }

    // fine_tuning_job_checkpoint->step_number
    cJSON *step_number = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_checkpointJSON, "step_number");
    if (cJSON_IsNull(step_number)) {
        step_number = NULL;
    }
    if (!step_number) {
        goto end;
    }

    
    if(!cJSON_IsNumber(step_number))
    {
    goto end; //Numeric
    }

    // fine_tuning_job_checkpoint->metrics
    cJSON *metrics = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_checkpointJSON, "metrics");
    if (cJSON_IsNull(metrics)) {
        metrics = NULL;
    }
    if (!metrics) {
        goto end;
    }

    
    metrics_local_nonprim = fine_tuning_job_checkpoint_metrics_parseFromJSON(metrics); //nonprimitive

    // fine_tuning_job_checkpoint->fine_tuning_job_id
    cJSON *fine_tuning_job_id = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_checkpointJSON, "fine_tuning_job_id");
    if (cJSON_IsNull(fine_tuning_job_id)) {
        fine_tuning_job_id = NULL;
    }
    if (!fine_tuning_job_id) {
        goto end;
    }

    
    if(!cJSON_IsString(fine_tuning_job_id))
    {
    goto end; //String
    }

    // fine_tuning_job_checkpoint->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(fine_tuning_job_checkpointJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_fine_tuning_job_checkpoint_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = fine_tuning_job_checkpoint_object_FromString(object->valuestring);


    fine_tuning_job_checkpoint_local_var = fine_tuning_job_checkpoint_create_internal (
        strdup(id->valuestring),
        created_at->valuedouble,
        strdup(fine_tuned_model_checkpoint->valuestring),
        step_number->valuedouble,
        metrics_local_nonprim,
        strdup(fine_tuning_job_id->valuestring),
        objectVariable
        );

    return fine_tuning_job_checkpoint_local_var;
end:
    if (metrics_local_nonprim) {
        fine_tuning_job_checkpoint_metrics_free(metrics_local_nonprim);
        metrics_local_nonprim = NULL;
    }
    return NULL;

}
