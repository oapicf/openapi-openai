#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner.h"


char* run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_type_ToString(openai_api_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_TYPE_e type) {
    char* typeArray[] =  { "NULL", "logs", "image" };
    return typeArray[type];
}

openai_api_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_TYPE_e run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "logs", "image" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_t *run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_create(
    int index,
    openai_api_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_TYPE_e type,
    char *logs,
    run_step_delta_step_details_tool_calls_code_output_image_object_image_t *image
    ) {
    run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_t *run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_local_var = malloc(sizeof(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_t));
    if (!run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_local_var) {
        return NULL;
    }
    run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_local_var->index = index;
    run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_local_var->type = type;
    run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_local_var->logs = logs;
    run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_local_var->image = image;

    return run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_local_var;
}


void run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_free(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_t *run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner) {
    if(NULL == run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->logs) {
        free(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->logs);
        run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->logs = NULL;
    }
    if (run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->image) {
        run_step_delta_step_details_tool_calls_code_output_image_object_image_free(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->image);
        run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->image = NULL;
    }
    free(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner);
}

cJSON *run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_convertToJSON(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_t *run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner) {
    cJSON *item = cJSON_CreateObject();

    // run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->index
    if (!run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->index) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "index", run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->index) == NULL) {
    goto fail; //Numeric
    }


    // run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->type
    if (openai_api_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_TYPE_NULL == run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->type) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "type", typerun_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_ToString(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->type)) == NULL)
    {
    goto fail; //Enum
    }


    // run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->logs
    if(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->logs) {
    if(cJSON_AddStringToObject(item, "logs", run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->logs) == NULL) {
    goto fail; //String
    }
    }


    // run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->image
    if(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->image) {
    cJSON *image_local_JSON = run_step_delta_step_details_tool_calls_code_output_image_object_image_convertToJSON(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->image);
    if(image_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "image", image_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_t *run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_parseFromJSON(cJSON *run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_innerJSON){

    run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_t *run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_local_var = NULL;

    // define the local variable for run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->image
    run_step_delta_step_details_tool_calls_code_output_image_object_image_t *image_local_nonprim = NULL;

    // run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->index
    cJSON *index = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_innerJSON, "index");
    if (!index) {
        goto end;
    }

    
    if(!cJSON_IsNumber(index))
    {
    goto end; //Numeric
    }

    // run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_innerJSON, "type");
    if (!type) {
        goto end;
    }

    openai_api_run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_TYPE_e typeVariable;
    
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_type_FromString(type->valuestring);

    // run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->logs
    cJSON *logs = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_innerJSON, "logs");
    if (logs) { 
    if(!cJSON_IsString(logs) && !cJSON_IsNull(logs))
    {
    goto end; //String
    }
    }

    // run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner->image
    cJSON *image = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_innerJSON, "image");
    if (image) { 
    image_local_nonprim = run_step_delta_step_details_tool_calls_code_output_image_object_image_parseFromJSON(image); //nonprimitive
    }


    run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_local_var = run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_create (
        index->valuedouble,
        typeVariable,
        logs && !cJSON_IsNull(logs) ? strdup(logs->valuestring) : NULL,
        image ? image_local_nonprim : NULL
        );

    return run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_local_var;
end:
    if (image_local_nonprim) {
        run_step_delta_step_details_tool_calls_code_output_image_object_image_free(image_local_nonprim);
        image_local_nonprim = NULL;
    }
    return NULL;

}
