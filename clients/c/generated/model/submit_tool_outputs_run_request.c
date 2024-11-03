#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "submit_tool_outputs_run_request.h"



submit_tool_outputs_run_request_t *submit_tool_outputs_run_request_create(
    list_t *tool_outputs,
    int stream
    ) {
    submit_tool_outputs_run_request_t *submit_tool_outputs_run_request_local_var = malloc(sizeof(submit_tool_outputs_run_request_t));
    if (!submit_tool_outputs_run_request_local_var) {
        return NULL;
    }
    submit_tool_outputs_run_request_local_var->tool_outputs = tool_outputs;
    submit_tool_outputs_run_request_local_var->stream = stream;

    return submit_tool_outputs_run_request_local_var;
}


void submit_tool_outputs_run_request_free(submit_tool_outputs_run_request_t *submit_tool_outputs_run_request) {
    if(NULL == submit_tool_outputs_run_request){
        return ;
    }
    listEntry_t *listEntry;
    if (submit_tool_outputs_run_request->tool_outputs) {
        list_ForEach(listEntry, submit_tool_outputs_run_request->tool_outputs) {
            submit_tool_outputs_run_request_tool_outputs_inner_free(listEntry->data);
        }
        list_freeList(submit_tool_outputs_run_request->tool_outputs);
        submit_tool_outputs_run_request->tool_outputs = NULL;
    }
    free(submit_tool_outputs_run_request);
}

cJSON *submit_tool_outputs_run_request_convertToJSON(submit_tool_outputs_run_request_t *submit_tool_outputs_run_request) {
    cJSON *item = cJSON_CreateObject();

    // submit_tool_outputs_run_request->tool_outputs
    if (!submit_tool_outputs_run_request->tool_outputs) {
        goto fail;
    }
    cJSON *tool_outputs = cJSON_AddArrayToObject(item, "tool_outputs");
    if(tool_outputs == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *tool_outputsListEntry;
    if (submit_tool_outputs_run_request->tool_outputs) {
    list_ForEach(tool_outputsListEntry, submit_tool_outputs_run_request->tool_outputs) {
    cJSON *itemLocal = submit_tool_outputs_run_request_tool_outputs_inner_convertToJSON(tool_outputsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tool_outputs, itemLocal);
    }
    }


    // submit_tool_outputs_run_request->stream
    if(submit_tool_outputs_run_request->stream) {
    if(cJSON_AddBoolToObject(item, "stream", submit_tool_outputs_run_request->stream) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

submit_tool_outputs_run_request_t *submit_tool_outputs_run_request_parseFromJSON(cJSON *submit_tool_outputs_run_requestJSON){

    submit_tool_outputs_run_request_t *submit_tool_outputs_run_request_local_var = NULL;

    // define the local list for submit_tool_outputs_run_request->tool_outputs
    list_t *tool_outputsList = NULL;

    // submit_tool_outputs_run_request->tool_outputs
    cJSON *tool_outputs = cJSON_GetObjectItemCaseSensitive(submit_tool_outputs_run_requestJSON, "tool_outputs");
    if (!tool_outputs) {
        goto end;
    }

    
    cJSON *tool_outputs_local_nonprimitive = NULL;
    if(!cJSON_IsArray(tool_outputs)){
        goto end; //nonprimitive container
    }

    tool_outputsList = list_createList();

    cJSON_ArrayForEach(tool_outputs_local_nonprimitive,tool_outputs )
    {
        if(!cJSON_IsObject(tool_outputs_local_nonprimitive)){
            goto end;
        }
        submit_tool_outputs_run_request_tool_outputs_inner_t *tool_outputsItem = submit_tool_outputs_run_request_tool_outputs_inner_parseFromJSON(tool_outputs_local_nonprimitive);

        list_addElement(tool_outputsList, tool_outputsItem);
    }

    // submit_tool_outputs_run_request->stream
    cJSON *stream = cJSON_GetObjectItemCaseSensitive(submit_tool_outputs_run_requestJSON, "stream");
    if (stream) { 
    if(!cJSON_IsBool(stream))
    {
    goto end; //Bool
    }
    }


    submit_tool_outputs_run_request_local_var = submit_tool_outputs_run_request_create (
        tool_outputsList,
        stream ? stream->valueint : 0
        );

    return submit_tool_outputs_run_request_local_var;
end:
    if (tool_outputsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, tool_outputsList) {
            submit_tool_outputs_run_request_tool_outputs_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(tool_outputsList);
        tool_outputsList = NULL;
    }
    return NULL;

}
