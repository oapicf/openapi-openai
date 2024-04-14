#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_delta_step_details_tool_calls_function_object_function.h"



run_step_delta_step_details_tool_calls_function_object_function_t *run_step_delta_step_details_tool_calls_function_object_function_create(
    char *name,
    char *arguments,
    char *output
    ) {
    run_step_delta_step_details_tool_calls_function_object_function_t *run_step_delta_step_details_tool_calls_function_object_function_local_var = malloc(sizeof(run_step_delta_step_details_tool_calls_function_object_function_t));
    if (!run_step_delta_step_details_tool_calls_function_object_function_local_var) {
        return NULL;
    }
    run_step_delta_step_details_tool_calls_function_object_function_local_var->name = name;
    run_step_delta_step_details_tool_calls_function_object_function_local_var->arguments = arguments;
    run_step_delta_step_details_tool_calls_function_object_function_local_var->output = output;

    return run_step_delta_step_details_tool_calls_function_object_function_local_var;
}


void run_step_delta_step_details_tool_calls_function_object_function_free(run_step_delta_step_details_tool_calls_function_object_function_t *run_step_delta_step_details_tool_calls_function_object_function) {
    if(NULL == run_step_delta_step_details_tool_calls_function_object_function){
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_delta_step_details_tool_calls_function_object_function->name) {
        free(run_step_delta_step_details_tool_calls_function_object_function->name);
        run_step_delta_step_details_tool_calls_function_object_function->name = NULL;
    }
    if (run_step_delta_step_details_tool_calls_function_object_function->arguments) {
        free(run_step_delta_step_details_tool_calls_function_object_function->arguments);
        run_step_delta_step_details_tool_calls_function_object_function->arguments = NULL;
    }
    if (run_step_delta_step_details_tool_calls_function_object_function->output) {
        free(run_step_delta_step_details_tool_calls_function_object_function->output);
        run_step_delta_step_details_tool_calls_function_object_function->output = NULL;
    }
    free(run_step_delta_step_details_tool_calls_function_object_function);
}

cJSON *run_step_delta_step_details_tool_calls_function_object_function_convertToJSON(run_step_delta_step_details_tool_calls_function_object_function_t *run_step_delta_step_details_tool_calls_function_object_function) {
    cJSON *item = cJSON_CreateObject();

    // run_step_delta_step_details_tool_calls_function_object_function->name
    if(run_step_delta_step_details_tool_calls_function_object_function->name) {
    if(cJSON_AddStringToObject(item, "name", run_step_delta_step_details_tool_calls_function_object_function->name) == NULL) {
    goto fail; //String
    }
    }


    // run_step_delta_step_details_tool_calls_function_object_function->arguments
    if(run_step_delta_step_details_tool_calls_function_object_function->arguments) {
    if(cJSON_AddStringToObject(item, "arguments", run_step_delta_step_details_tool_calls_function_object_function->arguments) == NULL) {
    goto fail; //String
    }
    }


    // run_step_delta_step_details_tool_calls_function_object_function->output
    if(run_step_delta_step_details_tool_calls_function_object_function->output) {
    if(cJSON_AddStringToObject(item, "output", run_step_delta_step_details_tool_calls_function_object_function->output) == NULL) {
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

run_step_delta_step_details_tool_calls_function_object_function_t *run_step_delta_step_details_tool_calls_function_object_function_parseFromJSON(cJSON *run_step_delta_step_details_tool_calls_function_object_functionJSON){

    run_step_delta_step_details_tool_calls_function_object_function_t *run_step_delta_step_details_tool_calls_function_object_function_local_var = NULL;

    // run_step_delta_step_details_tool_calls_function_object_function->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_function_object_functionJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // run_step_delta_step_details_tool_calls_function_object_function->arguments
    cJSON *arguments = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_function_object_functionJSON, "arguments");
    if (arguments) { 
    if(!cJSON_IsString(arguments) && !cJSON_IsNull(arguments))
    {
    goto end; //String
    }
    }

    // run_step_delta_step_details_tool_calls_function_object_function->output
    cJSON *output = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_function_object_functionJSON, "output");
    if (output) { 
    if(!cJSON_IsString(output) && !cJSON_IsNull(output))
    {
    goto end; //String
    }
    }


    run_step_delta_step_details_tool_calls_function_object_function_local_var = run_step_delta_step_details_tool_calls_function_object_function_create (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        arguments && !cJSON_IsNull(arguments) ? strdup(arguments->valuestring) : NULL,
        output && !cJSON_IsNull(output) ? strdup(output->valuestring) : NULL
        );

    return run_step_delta_step_details_tool_calls_function_object_function_local_var;
end:
    return NULL;

}
