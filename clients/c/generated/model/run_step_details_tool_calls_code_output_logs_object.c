#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_details_tool_calls_code_output_logs_object.h"


char* run_step_details_tool_calls_code_output_logs_object_type_ToString(openai_api_run_step_details_tool_calls_code_output_logs_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "logs" };
    return typeArray[type];
}

openai_api_run_step_details_tool_calls_code_output_logs_object_TYPE_e run_step_details_tool_calls_code_output_logs_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "logs" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

run_step_details_tool_calls_code_output_logs_object_t *run_step_details_tool_calls_code_output_logs_object_create(
    openai_api_run_step_details_tool_calls_code_output_logs_object_TYPE_e type,
    char *logs
    ) {
    run_step_details_tool_calls_code_output_logs_object_t *run_step_details_tool_calls_code_output_logs_object_local_var = malloc(sizeof(run_step_details_tool_calls_code_output_logs_object_t));
    if (!run_step_details_tool_calls_code_output_logs_object_local_var) {
        return NULL;
    }
    run_step_details_tool_calls_code_output_logs_object_local_var->type = type;
    run_step_details_tool_calls_code_output_logs_object_local_var->logs = logs;

    return run_step_details_tool_calls_code_output_logs_object_local_var;
}


void run_step_details_tool_calls_code_output_logs_object_free(run_step_details_tool_calls_code_output_logs_object_t *run_step_details_tool_calls_code_output_logs_object) {
    if(NULL == run_step_details_tool_calls_code_output_logs_object){
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_details_tool_calls_code_output_logs_object->logs) {
        free(run_step_details_tool_calls_code_output_logs_object->logs);
        run_step_details_tool_calls_code_output_logs_object->logs = NULL;
    }
    free(run_step_details_tool_calls_code_output_logs_object);
}

cJSON *run_step_details_tool_calls_code_output_logs_object_convertToJSON(run_step_details_tool_calls_code_output_logs_object_t *run_step_details_tool_calls_code_output_logs_object) {
    cJSON *item = cJSON_CreateObject();

    // run_step_details_tool_calls_code_output_logs_object->type
    if (openai_api_run_step_details_tool_calls_code_output_logs_object_TYPE_NULL == run_step_details_tool_calls_code_output_logs_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typerun_step_details_tool_calls_code_output_logs_object_ToString(run_step_details_tool_calls_code_output_logs_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_details_tool_calls_code_output_logs_object->logs
    if (!run_step_details_tool_calls_code_output_logs_object->logs) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "logs", run_step_details_tool_calls_code_output_logs_object->logs) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_step_details_tool_calls_code_output_logs_object_t *run_step_details_tool_calls_code_output_logs_object_parseFromJSON(cJSON *run_step_details_tool_calls_code_output_logs_objectJSON){

    run_step_details_tool_calls_code_output_logs_object_t *run_step_details_tool_calls_code_output_logs_object_local_var = NULL;

    // run_step_details_tool_calls_code_output_logs_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_code_output_logs_objectJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_run_step_details_tool_calls_code_output_logs_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_step_details_tool_calls_code_output_logs_object_type_FromString(type->valuestring);

    // run_step_details_tool_calls_code_output_logs_object->logs
    cJSON *logs = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_code_output_logs_objectJSON, "logs");
    if (!logs) {
        goto end;
    }

    
    if(!cJSON_IsString(logs))
    {
    goto end; //String
    }


    run_step_details_tool_calls_code_output_logs_object_local_var = run_step_details_tool_calls_code_output_logs_object_create (
        typeVariable,
        strdup(logs->valuestring)
        );

    return run_step_details_tool_calls_code_output_logs_object_local_var;
end:
    return NULL;

}
