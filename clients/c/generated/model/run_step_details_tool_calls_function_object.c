#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_details_tool_calls_function_object.h"


char* run_step_details_tool_calls_function_object_type_ToString(openai_api_run_step_details_tool_calls_function_object_TYPE_e type) {
    char* typeArray[] =  { "NULL", "function" };
    return typeArray[type];
}

openai_api_run_step_details_tool_calls_function_object_TYPE_e run_step_details_tool_calls_function_object_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "function" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

run_step_details_tool_calls_function_object_t *run_step_details_tool_calls_function_object_create(
    char *id,
    openai_api_run_step_details_tool_calls_function_object_TYPE_e type,
    run_step_details_tool_calls_function_object_function_t *function
    ) {
    run_step_details_tool_calls_function_object_t *run_step_details_tool_calls_function_object_local_var = malloc(sizeof(run_step_details_tool_calls_function_object_t));
    if (!run_step_details_tool_calls_function_object_local_var) {
        return NULL;
    }
    run_step_details_tool_calls_function_object_local_var->id = id;
    run_step_details_tool_calls_function_object_local_var->type = type;
    run_step_details_tool_calls_function_object_local_var->function = function;

    return run_step_details_tool_calls_function_object_local_var;
}


void run_step_details_tool_calls_function_object_free(run_step_details_tool_calls_function_object_t *run_step_details_tool_calls_function_object) {
    if(NULL == run_step_details_tool_calls_function_object){
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_details_tool_calls_function_object->id) {
        free(run_step_details_tool_calls_function_object->id);
        run_step_details_tool_calls_function_object->id = NULL;
    }
    if (run_step_details_tool_calls_function_object->function) {
        run_step_details_tool_calls_function_object_function_free(run_step_details_tool_calls_function_object->function);
        run_step_details_tool_calls_function_object->function = NULL;
    }
    free(run_step_details_tool_calls_function_object);
}

cJSON *run_step_details_tool_calls_function_object_convertToJSON(run_step_details_tool_calls_function_object_t *run_step_details_tool_calls_function_object) {
    cJSON *item = cJSON_CreateObject();

    // run_step_details_tool_calls_function_object->id
    if (!run_step_details_tool_calls_function_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", run_step_details_tool_calls_function_object->id) == NULL) {
    goto fail; //String
    }


    // run_step_details_tool_calls_function_object->type
    if (openai_api_run_step_details_tool_calls_function_object_TYPE_NULL == run_step_details_tool_calls_function_object->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typerun_step_details_tool_calls_function_object_ToString(run_step_details_tool_calls_function_object->type)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_details_tool_calls_function_object->function
    if (!run_step_details_tool_calls_function_object->function) {
        goto fail;
    }
    cJSON *function_local_JSON = run_step_details_tool_calls_function_object_function_convertToJSON(run_step_details_tool_calls_function_object->function);
    if(function_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "function", function_local_JSON);
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

run_step_details_tool_calls_function_object_t *run_step_details_tool_calls_function_object_parseFromJSON(cJSON *run_step_details_tool_calls_function_objectJSON){

    run_step_details_tool_calls_function_object_t *run_step_details_tool_calls_function_object_local_var = NULL;

    // define the local variable for run_step_details_tool_calls_function_object->function
    run_step_details_tool_calls_function_object_function_t *function_local_nonprim = NULL;

    // run_step_details_tool_calls_function_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_function_objectJSON, "id");
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // run_step_details_tool_calls_function_object->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_function_objectJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_run_step_details_tool_calls_function_object_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_step_details_tool_calls_function_object_type_FromString(type->valuestring);

    // run_step_details_tool_calls_function_object->function
    cJSON *function = cJSON_GetObjectItemCaseSensitive(run_step_details_tool_calls_function_objectJSON, "function");
    if (!function) {
        goto end;
    }

    
    function_local_nonprim = run_step_details_tool_calls_function_object_function_parseFromJSON(function); //nonprimitive


    run_step_details_tool_calls_function_object_local_var = run_step_details_tool_calls_function_object_create (
        strdup(id->valuestring),
        typeVariable,
        function_local_nonprim
        );

    return run_step_details_tool_calls_function_object_local_var;
end:
    if (function_local_nonprim) {
        run_step_details_tool_calls_function_object_function_free(function_local_nonprim);
        function_local_nonprim = NULL;
    }
    return NULL;

}
