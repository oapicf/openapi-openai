#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "submit_tool_outputs_run_request_tool_outputs_inner.h"



static submit_tool_outputs_run_request_tool_outputs_inner_t *submit_tool_outputs_run_request_tool_outputs_inner_create_internal(
    char *tool_call_id,
    char *output
    ) {
    submit_tool_outputs_run_request_tool_outputs_inner_t *submit_tool_outputs_run_request_tool_outputs_inner_local_var = malloc(sizeof(submit_tool_outputs_run_request_tool_outputs_inner_t));
    if (!submit_tool_outputs_run_request_tool_outputs_inner_local_var) {
        return NULL;
    }
    submit_tool_outputs_run_request_tool_outputs_inner_local_var->tool_call_id = tool_call_id;
    submit_tool_outputs_run_request_tool_outputs_inner_local_var->output = output;

    submit_tool_outputs_run_request_tool_outputs_inner_local_var->_library_owned = 1;
    return submit_tool_outputs_run_request_tool_outputs_inner_local_var;
}

__attribute__((deprecated)) submit_tool_outputs_run_request_tool_outputs_inner_t *submit_tool_outputs_run_request_tool_outputs_inner_create(
    char *tool_call_id,
    char *output
    ) {
    return submit_tool_outputs_run_request_tool_outputs_inner_create_internal (
        tool_call_id,
        output
        );
}

void submit_tool_outputs_run_request_tool_outputs_inner_free(submit_tool_outputs_run_request_tool_outputs_inner_t *submit_tool_outputs_run_request_tool_outputs_inner) {
    if(NULL == submit_tool_outputs_run_request_tool_outputs_inner){
        return ;
    }
    if(submit_tool_outputs_run_request_tool_outputs_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "submit_tool_outputs_run_request_tool_outputs_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (submit_tool_outputs_run_request_tool_outputs_inner->tool_call_id) {
        free(submit_tool_outputs_run_request_tool_outputs_inner->tool_call_id);
        submit_tool_outputs_run_request_tool_outputs_inner->tool_call_id = NULL;
    }
    if (submit_tool_outputs_run_request_tool_outputs_inner->output) {
        free(submit_tool_outputs_run_request_tool_outputs_inner->output);
        submit_tool_outputs_run_request_tool_outputs_inner->output = NULL;
    }
    free(submit_tool_outputs_run_request_tool_outputs_inner);
}

cJSON *submit_tool_outputs_run_request_tool_outputs_inner_convertToJSON(submit_tool_outputs_run_request_tool_outputs_inner_t *submit_tool_outputs_run_request_tool_outputs_inner) {
    cJSON *item = cJSON_CreateObject();

    // submit_tool_outputs_run_request_tool_outputs_inner->tool_call_id
    if(submit_tool_outputs_run_request_tool_outputs_inner->tool_call_id) {
    if(cJSON_AddStringToObject(item, "tool_call_id", submit_tool_outputs_run_request_tool_outputs_inner->tool_call_id) == NULL) {
    goto fail; //String
    }
    }


    // submit_tool_outputs_run_request_tool_outputs_inner->output
    if(submit_tool_outputs_run_request_tool_outputs_inner->output) {
    if(cJSON_AddStringToObject(item, "output", submit_tool_outputs_run_request_tool_outputs_inner->output) == NULL) {
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

submit_tool_outputs_run_request_tool_outputs_inner_t *submit_tool_outputs_run_request_tool_outputs_inner_parseFromJSON(cJSON *submit_tool_outputs_run_request_tool_outputs_innerJSON){

    submit_tool_outputs_run_request_tool_outputs_inner_t *submit_tool_outputs_run_request_tool_outputs_inner_local_var = NULL;

    // submit_tool_outputs_run_request_tool_outputs_inner->tool_call_id
    cJSON *tool_call_id = cJSON_GetObjectItemCaseSensitive(submit_tool_outputs_run_request_tool_outputs_innerJSON, "tool_call_id");
    if (cJSON_IsNull(tool_call_id)) {
        tool_call_id = NULL;
    }
    if (tool_call_id) { 
    if(!cJSON_IsString(tool_call_id) && !cJSON_IsNull(tool_call_id))
    {
    goto end; //String
    }
    }

    // submit_tool_outputs_run_request_tool_outputs_inner->output
    cJSON *output = cJSON_GetObjectItemCaseSensitive(submit_tool_outputs_run_request_tool_outputs_innerJSON, "output");
    if (cJSON_IsNull(output)) {
        output = NULL;
    }
    if (output) { 
    if(!cJSON_IsString(output) && !cJSON_IsNull(output))
    {
    goto end; //String
    }
    }


    submit_tool_outputs_run_request_tool_outputs_inner_local_var = submit_tool_outputs_run_request_tool_outputs_inner_create_internal (
        tool_call_id && !cJSON_IsNull(tool_call_id) ? strdup(tool_call_id->valuestring) : NULL,
        output && !cJSON_IsNull(output) ? strdup(output->valuestring) : NULL
        );

    return submit_tool_outputs_run_request_tool_outputs_inner_local_var;
end:
    return NULL;

}
