#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_step_delta_step_details_tool_calls_code_object_code_interpreter.h"



static run_step_delta_step_details_tool_calls_code_object_code_interpreter_t *run_step_delta_step_details_tool_calls_code_object_code_interpreter_create_internal(
    char *input,
    list_t *outputs
    ) {
    run_step_delta_step_details_tool_calls_code_object_code_interpreter_t *run_step_delta_step_details_tool_calls_code_object_code_interpreter_local_var = malloc(sizeof(run_step_delta_step_details_tool_calls_code_object_code_interpreter_t));
    if (!run_step_delta_step_details_tool_calls_code_object_code_interpreter_local_var) {
        return NULL;
    }
    run_step_delta_step_details_tool_calls_code_object_code_interpreter_local_var->input = input;
    run_step_delta_step_details_tool_calls_code_object_code_interpreter_local_var->outputs = outputs;

    run_step_delta_step_details_tool_calls_code_object_code_interpreter_local_var->_library_owned = 1;
    return run_step_delta_step_details_tool_calls_code_object_code_interpreter_local_var;
}

__attribute__((deprecated)) run_step_delta_step_details_tool_calls_code_object_code_interpreter_t *run_step_delta_step_details_tool_calls_code_object_code_interpreter_create(
    char *input,
    list_t *outputs
    ) {
    return run_step_delta_step_details_tool_calls_code_object_code_interpreter_create_internal (
        input,
        outputs
        );
}

void run_step_delta_step_details_tool_calls_code_object_code_interpreter_free(run_step_delta_step_details_tool_calls_code_object_code_interpreter_t *run_step_delta_step_details_tool_calls_code_object_code_interpreter) {
    if(NULL == run_step_delta_step_details_tool_calls_code_object_code_interpreter){
        return ;
    }
    if(run_step_delta_step_details_tool_calls_code_object_code_interpreter->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_step_delta_step_details_tool_calls_code_object_code_interpreter_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_step_delta_step_details_tool_calls_code_object_code_interpreter->input) {
        free(run_step_delta_step_details_tool_calls_code_object_code_interpreter->input);
        run_step_delta_step_details_tool_calls_code_object_code_interpreter->input = NULL;
    }
    if (run_step_delta_step_details_tool_calls_code_object_code_interpreter->outputs) {
        list_ForEach(listEntry, run_step_delta_step_details_tool_calls_code_object_code_interpreter->outputs) {
            run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_free(listEntry->data);
        }
        list_freeList(run_step_delta_step_details_tool_calls_code_object_code_interpreter->outputs);
        run_step_delta_step_details_tool_calls_code_object_code_interpreter->outputs = NULL;
    }
    free(run_step_delta_step_details_tool_calls_code_object_code_interpreter);
}

cJSON *run_step_delta_step_details_tool_calls_code_object_code_interpreter_convertToJSON(run_step_delta_step_details_tool_calls_code_object_code_interpreter_t *run_step_delta_step_details_tool_calls_code_object_code_interpreter) {
    cJSON *item = cJSON_CreateObject();

    // run_step_delta_step_details_tool_calls_code_object_code_interpreter->input
    if(run_step_delta_step_details_tool_calls_code_object_code_interpreter->input) {
    if(cJSON_AddStringToObject(item, "input", run_step_delta_step_details_tool_calls_code_object_code_interpreter->input) == NULL) {
    goto fail; //String
    }
    }


    // run_step_delta_step_details_tool_calls_code_object_code_interpreter->outputs
    if(run_step_delta_step_details_tool_calls_code_object_code_interpreter->outputs) {
    cJSON *outputs = cJSON_AddArrayToObject(item, "outputs");
    if(outputs == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *outputsListEntry;
    if (run_step_delta_step_details_tool_calls_code_object_code_interpreter->outputs) {
    list_ForEach(outputsListEntry, run_step_delta_step_details_tool_calls_code_object_code_interpreter->outputs) {
    cJSON *itemLocal = run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_convertToJSON(outputsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(outputs, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_step_delta_step_details_tool_calls_code_object_code_interpreter_t *run_step_delta_step_details_tool_calls_code_object_code_interpreter_parseFromJSON(cJSON *run_step_delta_step_details_tool_calls_code_object_code_interpreterJSON){

    run_step_delta_step_details_tool_calls_code_object_code_interpreter_t *run_step_delta_step_details_tool_calls_code_object_code_interpreter_local_var = NULL;

    // define the local list for run_step_delta_step_details_tool_calls_code_object_code_interpreter->outputs
    list_t *outputsList = NULL;

    // run_step_delta_step_details_tool_calls_code_object_code_interpreter->input
    cJSON *input = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_code_object_code_interpreterJSON, "input");
    if (cJSON_IsNull(input)) {
        input = NULL;
    }
    if (input) { 
    if(!cJSON_IsString(input) && !cJSON_IsNull(input))
    {
    goto end; //String
    }
    }

    // run_step_delta_step_details_tool_calls_code_object_code_interpreter->outputs
    cJSON *outputs = cJSON_GetObjectItemCaseSensitive(run_step_delta_step_details_tool_calls_code_object_code_interpreterJSON, "outputs");
    if (cJSON_IsNull(outputs)) {
        outputs = NULL;
    }
    if (outputs) { 
    cJSON *outputs_local_nonprimitive = NULL;
    if(!cJSON_IsArray(outputs)){
        goto end; //nonprimitive container
    }

    outputsList = list_createList();

    cJSON_ArrayForEach(outputs_local_nonprimitive,outputs )
    {
        if(!cJSON_IsObject(outputs_local_nonprimitive)){
            goto end;
        }
        run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_t *outputsItem = run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_parseFromJSON(outputs_local_nonprimitive);

        list_addElement(outputsList, outputsItem);
    }
    }


    run_step_delta_step_details_tool_calls_code_object_code_interpreter_local_var = run_step_delta_step_details_tool_calls_code_object_code_interpreter_create_internal (
        input && !cJSON_IsNull(input) ? strdup(input->valuestring) : NULL,
        outputs ? outputsList : NULL
        );

    return run_step_delta_step_details_tool_calls_code_object_code_interpreter_local_var;
end:
    if (outputsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, outputsList) {
            run_step_delta_step_details_tool_calls_code_object_code_interpreter_outputs_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(outputsList);
        outputsList = NULL;
    }
    return NULL;

}
