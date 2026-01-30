#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "run_object.h"


char* run_object_object_ToString(openai_api_run_object_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "thread.run" };
    return objectArray[object];
}

openai_api_run_object_OBJECT_e run_object_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "thread.run" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* run_object_status_ToString(openai_api_run_object_STATUS_e status) {
    char* statusArray[] =  { "NULL", "queued", "in_progress", "requires_action", "cancelling", "cancelled", "failed", "completed", "incomplete", "expired" };
    return statusArray[status];
}

openai_api_run_object_STATUS_e run_object_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "queued", "in_progress", "requires_action", "cancelling", "cancelled", "failed", "completed", "incomplete", "expired" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static run_object_t *run_object_create_internal(
    char *id,
    openai_api_run_object_OBJECT_e object,
    int created_at,
    char *thread_id,
    char *assistant_id,
    openai_api_run_object_STATUS_e status,
    run_object_required_action_t *required_action,
    run_object_last_error_t *last_error,
    int expires_at,
    int started_at,
    int cancelled_at,
    int failed_at,
    int completed_at,
    run_object_incomplete_details_t *incomplete_details,
    char *model,
    char *instructions,
    list_t *tools,
    object_t *metadata,
    run_completion_usage_t *usage,
    double temperature,
    double top_p,
    int max_prompt_tokens,
    int max_completion_tokens,
    truncation_object_t *truncation_strategy,
    assistants_api_tool_choice_option_t *tool_choice,
    int parallel_tool_calls,
    assistants_api_response_format_option_t *response_format
    ) {
    run_object_t *run_object_local_var = malloc(sizeof(run_object_t));
    if (!run_object_local_var) {
        return NULL;
    }
    run_object_local_var->id = id;
    run_object_local_var->object = object;
    run_object_local_var->created_at = created_at;
    run_object_local_var->thread_id = thread_id;
    run_object_local_var->assistant_id = assistant_id;
    run_object_local_var->status = status;
    run_object_local_var->required_action = required_action;
    run_object_local_var->last_error = last_error;
    run_object_local_var->expires_at = expires_at;
    run_object_local_var->started_at = started_at;
    run_object_local_var->cancelled_at = cancelled_at;
    run_object_local_var->failed_at = failed_at;
    run_object_local_var->completed_at = completed_at;
    run_object_local_var->incomplete_details = incomplete_details;
    run_object_local_var->model = model;
    run_object_local_var->instructions = instructions;
    run_object_local_var->tools = tools;
    run_object_local_var->metadata = metadata;
    run_object_local_var->usage = usage;
    run_object_local_var->temperature = temperature;
    run_object_local_var->top_p = top_p;
    run_object_local_var->max_prompt_tokens = max_prompt_tokens;
    run_object_local_var->max_completion_tokens = max_completion_tokens;
    run_object_local_var->truncation_strategy = truncation_strategy;
    run_object_local_var->tool_choice = tool_choice;
    run_object_local_var->parallel_tool_calls = parallel_tool_calls;
    run_object_local_var->response_format = response_format;

    run_object_local_var->_library_owned = 1;
    return run_object_local_var;
}

__attribute__((deprecated)) run_object_t *run_object_create(
    char *id,
    openai_api_run_object_OBJECT_e object,
    int created_at,
    char *thread_id,
    char *assistant_id,
    openai_api_run_object_STATUS_e status,
    run_object_required_action_t *required_action,
    run_object_last_error_t *last_error,
    int expires_at,
    int started_at,
    int cancelled_at,
    int failed_at,
    int completed_at,
    run_object_incomplete_details_t *incomplete_details,
    char *model,
    char *instructions,
    list_t *tools,
    object_t *metadata,
    run_completion_usage_t *usage,
    double temperature,
    double top_p,
    int max_prompt_tokens,
    int max_completion_tokens,
    truncation_object_t *truncation_strategy,
    assistants_api_tool_choice_option_t *tool_choice,
    int parallel_tool_calls,
    assistants_api_response_format_option_t *response_format
    ) {
    return run_object_create_internal (
        id,
        object,
        created_at,
        thread_id,
        assistant_id,
        status,
        required_action,
        last_error,
        expires_at,
        started_at,
        cancelled_at,
        failed_at,
        completed_at,
        incomplete_details,
        model,
        instructions,
        tools,
        metadata,
        usage,
        temperature,
        top_p,
        max_prompt_tokens,
        max_completion_tokens,
        truncation_strategy,
        tool_choice,
        parallel_tool_calls,
        response_format
        );
}

void run_object_free(run_object_t *run_object) {
    if(NULL == run_object){
        return ;
    }
    if(run_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "run_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (run_object->id) {
        free(run_object->id);
        run_object->id = NULL;
    }
    if (run_object->thread_id) {
        free(run_object->thread_id);
        run_object->thread_id = NULL;
    }
    if (run_object->assistant_id) {
        free(run_object->assistant_id);
        run_object->assistant_id = NULL;
    }
    if (run_object->required_action) {
        run_object_required_action_free(run_object->required_action);
        run_object->required_action = NULL;
    }
    if (run_object->last_error) {
        run_object_last_error_free(run_object->last_error);
        run_object->last_error = NULL;
    }
    if (run_object->incomplete_details) {
        run_object_incomplete_details_free(run_object->incomplete_details);
        run_object->incomplete_details = NULL;
    }
    if (run_object->model) {
        free(run_object->model);
        run_object->model = NULL;
    }
    if (run_object->instructions) {
        free(run_object->instructions);
        run_object->instructions = NULL;
    }
    if (run_object->tools) {
        list_ForEach(listEntry, run_object->tools) {
            assistant_object_tools_inner_free(listEntry->data);
        }
        list_freeList(run_object->tools);
        run_object->tools = NULL;
    }
    if (run_object->metadata) {
        object_free(run_object->metadata);
        run_object->metadata = NULL;
    }
    if (run_object->usage) {
        run_completion_usage_free(run_object->usage);
        run_object->usage = NULL;
    }
    if (run_object->truncation_strategy) {
        truncation_object_free(run_object->truncation_strategy);
        run_object->truncation_strategy = NULL;
    }
    if (run_object->tool_choice) {
        assistants_api_tool_choice_option_free(run_object->tool_choice);
        run_object->tool_choice = NULL;
    }
    if (run_object->response_format) {
        assistants_api_response_format_option_free(run_object->response_format);
        run_object->response_format = NULL;
    }
    free(run_object);
}

cJSON *run_object_convertToJSON(run_object_t *run_object) {
    cJSON *item = cJSON_CreateObject();

    // run_object->id
    if (!run_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", run_object->id) == NULL) {
    goto fail; //String
    }


    // run_object->object
    if (openai_api_run_object_OBJECT_NULL == run_object->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", run_object_object_ToString(run_object->object)) == NULL)
    {
    goto fail; //Enum
    }


    // run_object->created_at
    if (!run_object->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", run_object->created_at) == NULL) {
    goto fail; //Numeric
    }


    // run_object->thread_id
    if (!run_object->thread_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "thread_id", run_object->thread_id) == NULL) {
    goto fail; //String
    }


    // run_object->assistant_id
    if (!run_object->assistant_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "assistant_id", run_object->assistant_id) == NULL) {
    goto fail; //String
    }


    // run_object->status
    if (openai_api_run_object_STATUS_NULL == run_object->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", run_object_status_ToString(run_object->status)) == NULL)
    {
    goto fail; //Enum
    }


    // run_object->required_action
    if (!run_object->required_action) {
        goto fail;
    }
    cJSON *required_action_local_JSON = run_object_required_action_convertToJSON(run_object->required_action);
    if(required_action_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "required_action", required_action_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // run_object->last_error
    if (!run_object->last_error) {
        goto fail;
    }
    cJSON *last_error_local_JSON = run_object_last_error_convertToJSON(run_object->last_error);
    if(last_error_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "last_error", last_error_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // run_object->expires_at
    if (!run_object->expires_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "expires_at", run_object->expires_at) == NULL) {
    goto fail; //Numeric
    }


    // run_object->started_at
    if (!run_object->started_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "started_at", run_object->started_at) == NULL) {
    goto fail; //Numeric
    }


    // run_object->cancelled_at
    if (!run_object->cancelled_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "cancelled_at", run_object->cancelled_at) == NULL) {
    goto fail; //Numeric
    }


    // run_object->failed_at
    if (!run_object->failed_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "failed_at", run_object->failed_at) == NULL) {
    goto fail; //Numeric
    }


    // run_object->completed_at
    if (!run_object->completed_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "completed_at", run_object->completed_at) == NULL) {
    goto fail; //Numeric
    }


    // run_object->incomplete_details
    if (!run_object->incomplete_details) {
        goto fail;
    }
    cJSON *incomplete_details_local_JSON = run_object_incomplete_details_convertToJSON(run_object->incomplete_details);
    if(incomplete_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "incomplete_details", incomplete_details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // run_object->model
    if (!run_object->model) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "model", run_object->model) == NULL) {
    goto fail; //String
    }


    // run_object->instructions
    if (!run_object->instructions) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "instructions", run_object->instructions) == NULL) {
    goto fail; //String
    }


    // run_object->tools
    if (!run_object->tools) {
        goto fail;
    }
    cJSON *tools = cJSON_AddArrayToObject(item, "tools");
    if(tools == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *toolsListEntry;
    if (run_object->tools) {
    list_ForEach(toolsListEntry, run_object->tools) {
    cJSON *itemLocal = assistant_object_tools_inner_convertToJSON(toolsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tools, itemLocal);
    }
    }


    // run_object->metadata
    if (!run_object->metadata) {
        goto fail;
    }
    cJSON *metadata_object = object_convertToJSON(run_object->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
    if(item->child == NULL) {
    goto fail;
    }


    // run_object->usage
    if (!run_object->usage) {
        goto fail;
    }
    cJSON *usage_local_JSON = run_completion_usage_convertToJSON(run_object->usage);
    if(usage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "usage", usage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // run_object->temperature
    if(run_object->temperature) {
    if(cJSON_AddNumberToObject(item, "temperature", run_object->temperature) == NULL) {
    goto fail; //Numeric
    }
    }


    // run_object->top_p
    if(run_object->top_p) {
    if(cJSON_AddNumberToObject(item, "top_p", run_object->top_p) == NULL) {
    goto fail; //Numeric
    }
    }


    // run_object->max_prompt_tokens
    if (!run_object->max_prompt_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_prompt_tokens", run_object->max_prompt_tokens) == NULL) {
    goto fail; //Numeric
    }


    // run_object->max_completion_tokens
    if (!run_object->max_completion_tokens) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "max_completion_tokens", run_object->max_completion_tokens) == NULL) {
    goto fail; //Numeric
    }


    // run_object->truncation_strategy
    if (!run_object->truncation_strategy) {
        goto fail;
    }
    cJSON *truncation_strategy_local_JSON = truncation_object_convertToJSON(run_object->truncation_strategy);
    if(truncation_strategy_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "truncation_strategy", truncation_strategy_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // run_object->tool_choice
    if (!run_object->tool_choice) {
        goto fail;
    }
    cJSON *tool_choice_local_JSON = assistants_api_tool_choice_option_convertToJSON(run_object->tool_choice);
    if(tool_choice_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tool_choice", tool_choice_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // run_object->parallel_tool_calls
    if (!run_object->parallel_tool_calls) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "parallel_tool_calls", run_object->parallel_tool_calls) == NULL) {
    goto fail; //Bool
    }


    // run_object->response_format
    if (!run_object->response_format) {
        goto fail;
    }
    cJSON *response_format_local_JSON = assistants_api_response_format_option_convertToJSON(run_object->response_format);
    if(response_format_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "response_format", response_format_local_JSON);
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

run_object_t *run_object_parseFromJSON(cJSON *run_objectJSON){

    run_object_t *run_object_local_var = NULL;

    // define the local variable for run_object->required_action
    run_object_required_action_t *required_action_local_nonprim = NULL;

    // define the local variable for run_object->last_error
    run_object_last_error_t *last_error_local_nonprim = NULL;

    // define the local variable for run_object->incomplete_details
    run_object_incomplete_details_t *incomplete_details_local_nonprim = NULL;

    // define the local list for run_object->tools
    list_t *toolsList = NULL;

    // define the local variable for run_object->usage
    run_completion_usage_t *usage_local_nonprim = NULL;

    // define the local variable for run_object->truncation_strategy
    truncation_object_t *truncation_strategy_local_nonprim = NULL;

    // define the local variable for run_object->tool_choice
    assistants_api_tool_choice_option_t *tool_choice_local_nonprim = NULL;

    // define the local variable for run_object->response_format
    assistants_api_response_format_option_t *response_format_local_nonprim = NULL;

    // run_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (!id) {
        goto end;
    }

    
    if(!cJSON_IsString(id))
    {
    goto end; //String
    }

    // run_object->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_run_object_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = run_object_object_FromString(object->valuestring);

    // run_object->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "created_at");
    if (cJSON_IsNull(created_at)) {
        created_at = NULL;
    }
    if (!created_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created_at))
    {
    goto end; //Numeric
    }

    // run_object->thread_id
    cJSON *thread_id = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "thread_id");
    if (cJSON_IsNull(thread_id)) {
        thread_id = NULL;
    }
    if (!thread_id) {
        goto end;
    }

    
    if(!cJSON_IsString(thread_id))
    {
    goto end; //String
    }

    // run_object->assistant_id
    cJSON *assistant_id = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "assistant_id");
    if (cJSON_IsNull(assistant_id)) {
        assistant_id = NULL;
    }
    if (!assistant_id) {
        goto end;
    }

    
    if(!cJSON_IsString(assistant_id))
    {
    goto end; //String
    }

    // run_object->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    openai_api_run_object_STATUS_e statusVariable;
    
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = run_object_status_FromString(status->valuestring);

    // run_object->required_action
    cJSON *required_action = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "required_action");
    if (cJSON_IsNull(required_action)) {
        required_action = NULL;
    }
    if (!required_action) {
        goto end;
    }

    
    required_action_local_nonprim = run_object_required_action_parseFromJSON(required_action); //nonprimitive

    // run_object->last_error
    cJSON *last_error = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "last_error");
    if (cJSON_IsNull(last_error)) {
        last_error = NULL;
    }
    if (!last_error) {
        goto end;
    }

    
    last_error_local_nonprim = run_object_last_error_parseFromJSON(last_error); //nonprimitive

    // run_object->expires_at
    cJSON *expires_at = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "expires_at");
    if (cJSON_IsNull(expires_at)) {
        expires_at = NULL;
    }
    if (!expires_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(expires_at))
    {
    goto end; //Numeric
    }

    // run_object->started_at
    cJSON *started_at = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "started_at");
    if (cJSON_IsNull(started_at)) {
        started_at = NULL;
    }
    if (!started_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(started_at))
    {
    goto end; //Numeric
    }

    // run_object->cancelled_at
    cJSON *cancelled_at = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "cancelled_at");
    if (cJSON_IsNull(cancelled_at)) {
        cancelled_at = NULL;
    }
    if (!cancelled_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(cancelled_at))
    {
    goto end; //Numeric
    }

    // run_object->failed_at
    cJSON *failed_at = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "failed_at");
    if (cJSON_IsNull(failed_at)) {
        failed_at = NULL;
    }
    if (!failed_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(failed_at))
    {
    goto end; //Numeric
    }

    // run_object->completed_at
    cJSON *completed_at = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "completed_at");
    if (cJSON_IsNull(completed_at)) {
        completed_at = NULL;
    }
    if (!completed_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(completed_at))
    {
    goto end; //Numeric
    }

    // run_object->incomplete_details
    cJSON *incomplete_details = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "incomplete_details");
    if (cJSON_IsNull(incomplete_details)) {
        incomplete_details = NULL;
    }
    if (!incomplete_details) {
        goto end;
    }

    
    incomplete_details_local_nonprim = run_object_incomplete_details_parseFromJSON(incomplete_details); //nonprimitive

    // run_object->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (!model) {
        goto end;
    }

    
    if(!cJSON_IsString(model))
    {
    goto end; //String
    }

    // run_object->instructions
    cJSON *instructions = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "instructions");
    if (cJSON_IsNull(instructions)) {
        instructions = NULL;
    }
    if (!instructions) {
        goto end;
    }

    
    if(!cJSON_IsString(instructions))
    {
    goto end; //String
    }

    // run_object->tools
    cJSON *tools = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "tools");
    if (cJSON_IsNull(tools)) {
        tools = NULL;
    }
    if (!tools) {
        goto end;
    }

    
    cJSON *tools_local_nonprimitive = NULL;
    if(!cJSON_IsArray(tools)){
        goto end; //nonprimitive container
    }

    toolsList = list_createList();

    cJSON_ArrayForEach(tools_local_nonprimitive,tools )
    {
        if(!cJSON_IsObject(tools_local_nonprimitive)){
            goto end;
        }
        assistant_object_tools_inner_t *toolsItem = assistant_object_tools_inner_parseFromJSON(tools_local_nonprimitive);

        list_addElement(toolsList, toolsItem);
    }

    // run_object->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    if (!metadata) {
        goto end;
    }

    object_t *metadata_local_object = NULL;
    
    metadata_local_object = object_parseFromJSON(metadata); //object

    // run_object->usage
    cJSON *usage = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "usage");
    if (cJSON_IsNull(usage)) {
        usage = NULL;
    }
    if (!usage) {
        goto end;
    }

    
    usage_local_nonprim = run_completion_usage_parseFromJSON(usage); //nonprimitive

    // run_object->temperature
    cJSON *temperature = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "temperature");
    if (cJSON_IsNull(temperature)) {
        temperature = NULL;
    }
    if (temperature) { 
    if(!cJSON_IsNumber(temperature))
    {
    goto end; //Numeric
    }
    }

    // run_object->top_p
    cJSON *top_p = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "top_p");
    if (cJSON_IsNull(top_p)) {
        top_p = NULL;
    }
    if (top_p) { 
    if(!cJSON_IsNumber(top_p))
    {
    goto end; //Numeric
    }
    }

    // run_object->max_prompt_tokens
    cJSON *max_prompt_tokens = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "max_prompt_tokens");
    if (cJSON_IsNull(max_prompt_tokens)) {
        max_prompt_tokens = NULL;
    }
    if (!max_prompt_tokens) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_prompt_tokens))
    {
    goto end; //Numeric
    }

    // run_object->max_completion_tokens
    cJSON *max_completion_tokens = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "max_completion_tokens");
    if (cJSON_IsNull(max_completion_tokens)) {
        max_completion_tokens = NULL;
    }
    if (!max_completion_tokens) {
        goto end;
    }

    
    if(!cJSON_IsNumber(max_completion_tokens))
    {
    goto end; //Numeric
    }

    // run_object->truncation_strategy
    cJSON *truncation_strategy = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "truncation_strategy");
    if (cJSON_IsNull(truncation_strategy)) {
        truncation_strategy = NULL;
    }
    if (!truncation_strategy) {
        goto end;
    }

    
    truncation_strategy_local_nonprim = truncation_object_parseFromJSON(truncation_strategy); //nonprimitive

    // run_object->tool_choice
    cJSON *tool_choice = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "tool_choice");
    if (cJSON_IsNull(tool_choice)) {
        tool_choice = NULL;
    }
    if (!tool_choice) {
        goto end;
    }

    
    tool_choice_local_nonprim = assistants_api_tool_choice_option_parseFromJSON(tool_choice); //nonprimitive

    // run_object->parallel_tool_calls
    cJSON *parallel_tool_calls = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "parallel_tool_calls");
    if (cJSON_IsNull(parallel_tool_calls)) {
        parallel_tool_calls = NULL;
    }
    if (!parallel_tool_calls) {
        goto end;
    }

    
    if(!cJSON_IsBool(parallel_tool_calls))
    {
    goto end; //Bool
    }

    // run_object->response_format
    cJSON *response_format = cJSON_GetObjectItemCaseSensitive(run_objectJSON, "response_format");
    if (cJSON_IsNull(response_format)) {
        response_format = NULL;
    }
    if (!response_format) {
        goto end;
    }

    
    response_format_local_nonprim = assistants_api_response_format_option_parseFromJSON(response_format); //nonprimitive


    run_object_local_var = run_object_create_internal (
        strdup(id->valuestring),
        objectVariable,
        created_at->valuedouble,
        strdup(thread_id->valuestring),
        strdup(assistant_id->valuestring),
        statusVariable,
        required_action_local_nonprim,
        last_error_local_nonprim,
        expires_at->valuedouble,
        started_at->valuedouble,
        cancelled_at->valuedouble,
        failed_at->valuedouble,
        completed_at->valuedouble,
        incomplete_details_local_nonprim,
        strdup(model->valuestring),
        strdup(instructions->valuestring),
        toolsList,
        metadata_local_object,
        usage_local_nonprim,
        temperature ? temperature->valuedouble : 0,
        top_p ? top_p->valuedouble : 0,
        max_prompt_tokens->valuedouble,
        max_completion_tokens->valuedouble,
        truncation_strategy_local_nonprim,
        tool_choice_local_nonprim,
        parallel_tool_calls->valueint,
        response_format_local_nonprim
        );

    return run_object_local_var;
end:
    if (required_action_local_nonprim) {
        run_object_required_action_free(required_action_local_nonprim);
        required_action_local_nonprim = NULL;
    }
    if (last_error_local_nonprim) {
        run_object_last_error_free(last_error_local_nonprim);
        last_error_local_nonprim = NULL;
    }
    if (incomplete_details_local_nonprim) {
        run_object_incomplete_details_free(incomplete_details_local_nonprim);
        incomplete_details_local_nonprim = NULL;
    }
    if (toolsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, toolsList) {
            assistant_object_tools_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(toolsList);
        toolsList = NULL;
    }
    if (usage_local_nonprim) {
        run_completion_usage_free(usage_local_nonprim);
        usage_local_nonprim = NULL;
    }
    if (truncation_strategy_local_nonprim) {
        truncation_object_free(truncation_strategy_local_nonprim);
        truncation_strategy_local_nonprim = NULL;
    }
    if (tool_choice_local_nonprim) {
        assistants_api_tool_choice_option_free(tool_choice_local_nonprim);
        tool_choice_local_nonprim = NULL;
    }
    if (response_format_local_nonprim) {
        assistants_api_response_format_option_free(response_format_local_nonprim);
        response_format_local_nonprim = NULL;
    }
    return NULL;

}
