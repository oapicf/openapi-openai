#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_tool_call_object_function.h"



static run_tool_call_object_function_t *run_tool_call_object_function_create_internal(
    char *name,
    char *arguments
    ) {
    run_tool_call_object_function_t *run_tool_call_object_function_local_var = malloc(sizeof(run_tool_call_object_function_t));
    if (!run_tool_call_object_function_local_var) {
        return NULL;
    }
    run_tool_call_object_function_local_var->name = name;
    run_tool_call_object_function_local_var->arguments = arguments;

    run_tool_call_object_function_local_var->_library_owned = 1;
    return run_tool_call_object_function_local_var;
}

__attribute__((deprecated)) run_tool_call_object_function_t *run_tool_call_object_function_create(
    char *name,
    char *arguments
    ) {
    return run_tool_call_object_function_create_internal (
        name,
        arguments
        );
}

void run_tool_call_object_function_free(run_tool_call_object_function_t *run_tool_call_object_function) {
    if(NULL == run_tool_call_object_function){
        return ;
    }
    if(run_tool_call_object_function->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_tool_call_object_function_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_tool_call_object_function->name) {
        free(run_tool_call_object_function->name);
        run_tool_call_object_function->name = NULL;
    }
    if (run_tool_call_object_function->arguments) {
        free(run_tool_call_object_function->arguments);
        run_tool_call_object_function->arguments = NULL;
    }
    free(run_tool_call_object_function);
}

cJSON *run_tool_call_object_function_convertToJSON(run_tool_call_object_function_t *run_tool_call_object_function) {
    cJSON *item = cJSON_CreateObject();

    // run_tool_call_object_function->name
    if (!run_tool_call_object_function->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", run_tool_call_object_function->name) == NULL) {
    goto fail; //String
    }


    // run_tool_call_object_function->arguments
    if (!run_tool_call_object_function->arguments) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "arguments", run_tool_call_object_function->arguments) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_tool_call_object_function_t *run_tool_call_object_function_parseFromJSON(cJSON *run_tool_call_object_functionJSON){

    run_tool_call_object_function_t *run_tool_call_object_function_local_var = NULL;

    // run_tool_call_object_function->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(run_tool_call_object_functionJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (!name) {
        goto end;
    }

    
    if(!cJSON_IsString(name))
    {
    goto end; //String
    }

    // run_tool_call_object_function->arguments
    cJSON *arguments = cJSON_GetObjectItemCaseSensitive(run_tool_call_object_functionJSON, "arguments");
    if (cJSON_IsNull(arguments)) {
        arguments = NULL;
    }
    if (!arguments) {
        goto end;
    }

    
    if(!cJSON_IsString(arguments))
    {
    goto end; //String
    }


    run_tool_call_object_function_local_var = run_tool_call_object_function_create_internal (
        strdup(name->valuestring),
        strdup(arguments->valuestring)
        );

    return run_tool_call_object_function_local_var;
end:
    return NULL;

}
