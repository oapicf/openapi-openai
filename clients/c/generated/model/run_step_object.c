#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_object.h"


char* run_step_object_object_ToString(openai_api_run_step_object_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "thread.run.step" };
    return objectArray[object];
}

openai_api_run_step_object_OBJECT_e run_step_object_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "thread.run.step" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* run_step_object_type_ToString(openai_api_run_step_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "message_creation", "tool_calls" };
    return typeArray[type];
}

openai_api_run_step_object_TYPE_e run_step_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "message_creation", "tool_calls" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* run_step_object_status_ToString(openai_api_run_step_object_STATUS_e status) {
    char* statusArray[] =  { "NULL", "in_progress", "cancelled", "failed", "completed", "expired" };
    return statusArray[status];
}

openai_api_run_step_object_STATUS_e run_step_object_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "in_progress", "cancelled", "failed", "completed", "expired" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

run_step_object_t *run_step_object_create(
    char *id,
    openai_api_run_step_object_OBJECT_e object,
    int created_at,
    char *assistant_id,
    char *thread_id,
    char *run_id,
    openai_api_run_step_object_TYPE_e type,
    openai_api_run_step_object_STATUS_e status,
    run_step_object_step_details_t *step_details,
    run_step_object_last_error_t *last_error,
    int expired_at,
    int cancelled_at,
    int failed_at,
    int completed_at,
    object_t *metadata,
    run_step_completion_usage_t *usage
    ) {
    run_step_object_t *run_step_object_local_var = malloc(sizeof(run_step_object_t));
    if (!run_step_object_local_var) {
        return NULL;
    }
    run_step_object_local_var->id = id;
    run_step_object_local_var->object = object;
    run_step_object_local_var->created_at = created_at;
    run_step_object_local_var->assistant_id = assistant_id;
    run_step_object_local_var->thread_id = thread_id;
    run_step_object_local_var->run_id = run_id;
    run_step_object_local_var->type = type;
    run_step_object_local_var->status = status;
    run_step_object_local_var->step_details = step_details;
    run_step_object_local_var->last_error = last_error;
    run_step_object_local_var->expired_at = expired_at;
    run_step_object_local_var->cancelled_at = cancelled_at;
    run_step_object_local_var->failed_at = failed_at;
    run_step_object_local_var->completed_at = completed_at;
    run_step_object_local_var->metadata = metadata;
    run_step_object_local_var->usage = usage;

    return run_step_object_local_var;
}


void run_step_object_free(run_step_object_t *run_step_object) {
    if(NULL == run_step_object){
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_object->id) {
        free(run_step_object->id);
        run_step_object->id = NULL;
    }
    if (run_step_object->assistant_id) {
        free(run_step_object->assistant_id);
        run_step_object->assistant_id = NULL;
    }
    if (run_step_object->thread_id) {
        free(run_step_object->thread_id);
        run_step_object->thread_id = NULL;
    }
    if (run_step_object->run_id) {
        free(run_step_object->run_id);
        run_step_object->run_id = NULL;
    }
    if (run_step_object->step_details) {
        run_step_object_step_details_free(run_step_object->step_details);
        run_step_object->step_details = NULL;
    }
    if (run_step_object->last_error) {
        run_step_object_last_error_free(run_step_object->last_error);
        run_step_object->last_error = NULL;
    }
    if (run_step_object->metadata) {
        object_free(run_step_object->metadata);
        run_step_object->metadata = NULL;
    }
    if (run_step_object->usage) {
        run_step_completion_usage_free(run_step_object->usage);
        run_step_object->usage = NULL;
    }
    free(run_step_object);
}

cJSON *run_step_object_convertToJSON(run_step_object_t *run_step_object) {
    cJSON *item = cJSON_CreateObject();

    // run_step_object->id
    if (!run_step_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", run_step_object->id) == NULL) {
    goto fail; //String
    }


    // run_step_object->object
    if (openai_api_run_step_object_OBJECT_NULL == run_step_object->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", objectrun_step_object_ToString(run_step_object->object)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_object->created_at
    if (!run_step_object->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", run_step_object->created_at) == NULL) {
    goto fail; //Numeric
    }


    // run_step_object->assistant_id
    if (!run_step_object->assistant_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "assistant_id", run_step_object->assistant_id) == NULL) {
    goto fail; //String
    }


    // run_step_object->thread_id
    if (!run_step_object->thread_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "thread_id", run_step_object->thread_id) == NULL) {
    goto fail; //String
    }


    // run_step_object->run_id
    if (!run_step_object->run_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "run_id", run_step_object->run_id) == NULL) {
    goto fail; //String
    }


    // run_step_object->type
    if (openai_api_run_step_object_TYPE_NULL == run_step_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typerun_step_object_ToString(run_step_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_object->status
    if (openai_api_run_step_object_STATUS_NULL == run_step_object->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", statusrun_step_object_ToString(run_step_object->status)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_object->step_details
    if (!run_step_object->step_details) {
        goto fail;
    }
    cJSON *step_details_local_JSON = run_step_object_step_details_convertToJSON(run_step_object->step_details);
    if(step_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "step_details", step_details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // run_step_object->last_error
    if (!run_step_object->last_error) {
        goto fail;
    }
    cJSON *last_error_local_JSON = run_step_object_last_error_convertToJSON(run_step_object->last_error);
    if(last_error_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "last_error", last_error_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // run_step_object->expired_at
    if (!run_step_object->expired_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "expired_at", run_step_object->expired_at) == NULL) {
    goto fail; //Numeric
    }


    // run_step_object->cancelled_at
    if (!run_step_object->cancelled_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "cancelled_at", run_step_object->cancelled_at) == NULL) {
    goto fail; //Numeric
    }


    // run_step_object->failed_at
    if (!run_step_object->failed_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "failed_at", run_step_object->failed_at) == NULL) {
    goto fail; //Numeric
    }


    // run_step_object->completed_at
    if (!run_step_object->completed_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "completed_at", run_step_object->completed_at) == NULL) {
    goto fail; //Numeric
    }


    // run_step_object->metadata
    if (!run_step_object->metadata) {
        goto fail;
    }
    cJSON *metadata_object = object_convertToJSON(run_step_object->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
    if(item->child == NULL) {
    goto fail;
    }


    // run_step_object->usage
    if (!run_step_object->usage) {
        goto fail;
    }
    cJSON *usage_local_JSON = run_step_completion_usage_convertToJSON(run_step_object->usage);
    if(usage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "usage", usage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_step_object_t *run_step_object_parseFromJSON(cJSON *run_step_objectJSON){

    run_step_object_t *run_step_object_local_var = NULL;

    // define the local variable for run_step_object->step_details
    run_step_object_step_details_t *step_details_local_nonprim = NULL;

    // define the local variable for run_step_object->last_error
    run_step_object_last_error_t *last_error_local_nonprim = NULL;

    // define the local variable for run_step_object->usage
    run_step_completion_usage_t *usage_local_nonprim = NULL;

    // run_step_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // run_step_object->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "object");
    if (!object) {
        goto end;
    }

    openai_api_run_step_object_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = run_step_object_object_FromString(object->valuestring);

    // run_step_object->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "created_at");
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }

    // run_step_object->assistant_id
    cJSON *assistant_id = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "assistant_id");
    if (!assistant_id) {
        goto end;
    }

    
    if(!cJSON_IsString(assistant_id))
    {
    goto end; //String
    }

    // run_step_object->thread_id
    cJSON *thread_id = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "thread_id");
    if (!thread_id) {
        goto end;
    }

    
    if(!cJSON_IsString(thread_id))
    {
    goto end; //String
    }

    // run_step_object->run_id
    cJSON *run_id = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "run_id");
    if (!run_id) {
        goto end;
    }

    
    if(!cJSON_IsString(run_id))
    {
    goto end; //String
    }

    // run_step_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_run_step_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_step_object_type_FromString(type->valuestring);

    // run_step_object->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "status");
    if (!status) {
        goto end;
    }

    openai_api_run_step_object_STATUS_e statusVariable;
    
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = run_step_object_status_FromString(status->valuestring);

    // run_step_object->step_details
    cJSON *step_details = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "step_details");
    if (!step_details) {
        goto end;
    }

    
    step_details_local_nonprim = run_step_object_step_details_parseFromJSON(step_details); //nonprimitive

    // run_step_object->last_error
    cJSON *last_error = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "last_error");
    if (!last_error) {
        goto end;
    }

    
    last_error_local_nonprim = run_step_object_last_error_parseFromJSON(last_error); //nonprimitive

    // run_step_object->expired_at
    cJSON *expired_at = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "expired_at");
    if (!expired_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(expired_at))
    {
    goto end; //Numeric
    }

    // run_step_object->cancelled_at
    cJSON *cancelled_at = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "cancelled_at");
    if (!cancelled_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(cancelled_at))
    {
    goto end; //Numeric
    }

    // run_step_object->failed_at
    cJSON *failed_at = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "failed_at");
    if (!failed_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(failed_at))
    {
    goto end; //Numeric
    }

    // run_step_object->completed_at
    cJSON *completed_at = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "completed_at");
    if (!completed_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(completed_at))
    {
    goto end; //Numeric
    }

    // run_step_object->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "metadata");
    if (!metadata) {
        goto end;
    }

    object_t *metadata_local_object = NULL;
    
    metadata_local_object = object_parseFromJSON(metadata); //object

    // run_step_object->usage
    cJSON *usage = cJSON_GetObjectItemCaseSensitive(run_step_objectJSON, "usage");
    if (!usage) {
        goto end;
    }

    
    usage_local_nonprim = run_step_completion_usage_parseFromJSON(usage); //nonprimitive


    run_step_object_local_var = run_step_object_create (
        strdup(id->valuestring),
        objectVariable,
        created_at->valuedouble,
        strdup(assistant_id->valuestring),
        strdup(thread_id->valuestring),
        strdup(run_id->valuestring),
        typeVariable,
        statusVariable,
        step_details_local_nonprim,
        last_error_local_nonprim,
        expired_at->valuedouble,
        cancelled_at->valuedouble,
        failed_at->valuedouble,
        completed_at->valuedouble,
        metadata_local_object,
        usage_local_nonprim
        );

    return run_step_object_local_var;
end:
    if (step_details_local_nonprim) {
        run_step_object_step_details_free(step_details_local_nonprim);
        step_details_local_nonprim = NULL;
    }
    if (last_error_local_nonprim) {
        run_step_object_last_error_free(last_error_local_nonprim);
        last_error_local_nonprim = NULL;
    }
    if (usage_local_nonprim) {
        run_step_completion_usage_free(usage_local_nonprim);
        usage_local_nonprim = NULL;
    }
    return NULL;

}
