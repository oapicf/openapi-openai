#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_object_required_action.h"


char* run_object_required_action_type_ToString(openai_api_run_object_required_action_TYPE_e type) {
    char* typeArray[] =  { "NULL", "submit_tool_outputs" };
    return typeArray[type];
}

openai_api_run_object_required_action_TYPE_e run_object_required_action_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "submit_tool_outputs" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

run_object_required_action_t *run_object_required_action_create(
    openai_api_run_object_required_action_TYPE_e type,
    run_object_required_action_submit_tool_outputs_t *submit_tool_outputs
    ) {
    run_object_required_action_t *run_object_required_action_local_var = malloc(sizeof(run_object_required_action_t));
    if (!run_object_required_action_local_var) {
        return NULL;
    }
    run_object_required_action_local_var->type = type;
    run_object_required_action_local_var->submit_tool_outputs = submit_tool_outputs;

    return run_object_required_action_local_var;
}


void run_object_required_action_free(run_object_required_action_t *run_object_required_action) {
    if(NULL == run_object_required_action){
        return ;
    }
    listEntry_t *listEntry;
    if (run_object_required_action->submit_tool_outputs) {
        run_object_required_action_submit_tool_outputs_free(run_object_required_action->submit_tool_outputs);
        run_object_required_action->submit_tool_outputs = NULL;
    }
    free(run_object_required_action);
}

cJSON *run_object_required_action_convertToJSON(run_object_required_action_t *run_object_required_action) {
    cJSON *item = cJSON_CreateObject();

    // run_object_required_action->type
    if (openai_api_run_object_required_action_TYPE_NULL == run_object_required_action->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typerun_object_required_action_ToString(run_object_required_action->type)) == NULL)
    {
    goto fail; //Enum
    }


    // run_object_required_action->submit_tool_outputs
    if (!run_object_required_action->submit_tool_outputs) {
        goto fail;
    }
    cJSON *submit_tool_outputs_local_JSON = run_object_required_action_submit_tool_outputs_convertToJSON(run_object_required_action->submit_tool_outputs);
    if(submit_tool_outputs_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "submit_tool_outputs", submit_tool_outputs_local_JSON);
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

run_object_required_action_t *run_object_required_action_parseFromJSON(cJSON *run_object_required_actionJSON){

    run_object_required_action_t *run_object_required_action_local_var = NULL;

    // define the local variable for run_object_required_action->submit_tool_outputs
    run_object_required_action_submit_tool_outputs_t *submit_tool_outputs_local_nonprim = NULL;

    // run_object_required_action->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_object_required_actionJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_run_object_required_action_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_object_required_action_type_FromString(type->valuestring);

    // run_object_required_action->submit_tool_outputs
    cJSON *submit_tool_outputs = cJSON_GetObjectItemCaseSensitive(run_object_required_actionJSON, "submit_tool_outputs");
    if (!submit_tool_outputs) {
        goto end;
    }

    
    submit_tool_outputs_local_nonprim = run_object_required_action_submit_tool_outputs_parseFromJSON(submit_tool_outputs); //nonprimitive


    run_object_required_action_local_var = run_object_required_action_create (
        typeVariable,
        submit_tool_outputs_local_nonprim
        );

    return run_object_required_action_local_var;
end:
    if (submit_tool_outputs_local_nonprim) {
        run_object_required_action_submit_tool_outputs_free(submit_tool_outputs_local_nonprim);
        submit_tool_outputs_local_nonprim = NULL;
    }
    return NULL;

}
