#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_object_required_action_submit_tool_outputs.h"



static run_object_required_action_submit_tool_outputs_t *run_object_required_action_submit_tool_outputs_create_internal(
    list_t *tool_calls
    ) {
    run_object_required_action_submit_tool_outputs_t *run_object_required_action_submit_tool_outputs_local_var = malloc(sizeof(run_object_required_action_submit_tool_outputs_t));
    if (!run_object_required_action_submit_tool_outputs_local_var) {
        return NULL;
    }
    run_object_required_action_submit_tool_outputs_local_var->tool_calls = tool_calls;

    run_object_required_action_submit_tool_outputs_local_var->_library_owned = 1;
    return run_object_required_action_submit_tool_outputs_local_var;
}

__attribute__((deprecated)) run_object_required_action_submit_tool_outputs_t *run_object_required_action_submit_tool_outputs_create(
    list_t *tool_calls
    ) {
    return run_object_required_action_submit_tool_outputs_create_internal (
        tool_calls
        );
}

void run_object_required_action_submit_tool_outputs_free(run_object_required_action_submit_tool_outputs_t *run_object_required_action_submit_tool_outputs) {
    if(NULL == run_object_required_action_submit_tool_outputs){
        return ;
    }
    if(run_object_required_action_submit_tool_outputs->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_object_required_action_submit_tool_outputs_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_object_required_action_submit_tool_outputs->tool_calls) {
        list_ForEach(listEntry, run_object_required_action_submit_tool_outputs->tool_calls) {
            run_tool_call_object_free(listEntry->data);
        }
        list_freeList(run_object_required_action_submit_tool_outputs->tool_calls);
        run_object_required_action_submit_tool_outputs->tool_calls = NULL;
    }
    free(run_object_required_action_submit_tool_outputs);
}

cJSON *run_object_required_action_submit_tool_outputs_convertToJSON(run_object_required_action_submit_tool_outputs_t *run_object_required_action_submit_tool_outputs) {
    cJSON *item = cJSON_CreateObject();

    // run_object_required_action_submit_tool_outputs->tool_calls
    if (!run_object_required_action_submit_tool_outputs->tool_calls) {
        goto fail;
    }
    cJSON *tool_calls = cJSON_AddArrayToObject(item, "tool_calls");
    if(tool_calls == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *tool_callsListEntry;
    if (run_object_required_action_submit_tool_outputs->tool_calls) {
    list_ForEach(tool_callsListEntry, run_object_required_action_submit_tool_outputs->tool_calls) {
    cJSON *itemLocal = run_tool_call_object_convertToJSON(tool_callsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tool_calls, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

run_object_required_action_submit_tool_outputs_t *run_object_required_action_submit_tool_outputs_parseFromJSON(cJSON *run_object_required_action_submit_tool_outputsJSON){

    run_object_required_action_submit_tool_outputs_t *run_object_required_action_submit_tool_outputs_local_var = NULL;

    // define the local list for run_object_required_action_submit_tool_outputs->tool_calls
    list_t *tool_callsList = NULL;

    // run_object_required_action_submit_tool_outputs->tool_calls
    cJSON *tool_calls = cJSON_GetObjectItemCaseSensitive(run_object_required_action_submit_tool_outputsJSON, "tool_calls");
    if (cJSON_IsNull(tool_calls)) {
        tool_calls = NULL;
    }
    if (!tool_calls) {
        goto end;
    }

    
    cJSON *tool_calls_local_nonprimitive = NULL;
    if(!cJSON_IsArray(tool_calls)){
        goto end; //nonprimitive container
    }

    tool_callsList = list_createList();

    cJSON_ArrayForEach(tool_calls_local_nonprimitive,tool_calls )
    {
        if(!cJSON_IsObject(tool_calls_local_nonprimitive)){
            goto end;
        }
        run_tool_call_object_t *tool_callsItem = run_tool_call_object_parseFromJSON(tool_calls_local_nonprimitive);

        list_addElement(tool_callsList, tool_callsItem);
    }


    run_object_required_action_submit_tool_outputs_local_var = run_object_required_action_submit_tool_outputs_create_internal (
        tool_callsList
        );

    return run_object_required_action_submit_tool_outputs_local_var;
end:
    if (tool_callsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tool_callsList) {
            run_tool_call_object_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tool_callsList);
        tool_callsList = NULL;
    }
    return NULL;

}
