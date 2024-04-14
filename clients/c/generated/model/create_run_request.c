#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_run_request.h"



create_run_request_t *create_run_request_create(
    char *assistant_id,
    create_run_request_model_t *model,
    char *instructions,
    char *additional_instructions,
    list_t *additional_messages,
    list_t *tools,
    object_t *metadata,
    double temperature,
    int stream,
    int max_prompt_tokens,
    int max_completion_tokens,
    truncation_object_t *truncation_strategy,
    assistants_api_tool_choice_option_t *tool_choice,
    assistants_api_response_format_option_t *response_format
    ) {
    create_run_request_t *create_run_request_local_var = malloc(sizeof(create_run_request_t));
    if (!create_run_request_local_var) {
        return NULL;
    }
    create_run_request_local_var->assistant_id = assistant_id;
    create_run_request_local_var->model = model;
    create_run_request_local_var->instructions = instructions;
    create_run_request_local_var->additional_instructions = additional_instructions;
    create_run_request_local_var->additional_messages = additional_messages;
    create_run_request_local_var->tools = tools;
    create_run_request_local_var->metadata = metadata;
    create_run_request_local_var->temperature = temperature;
    create_run_request_local_var->stream = stream;
    create_run_request_local_var->max_prompt_tokens = max_prompt_tokens;
    create_run_request_local_var->max_completion_tokens = max_completion_tokens;
    create_run_request_local_var->truncation_strategy = truncation_strategy;
    create_run_request_local_var->tool_choice = tool_choice;
    create_run_request_local_var->response_format = response_format;

    return create_run_request_local_var;
}


void create_run_request_free(create_run_request_t *create_run_request) {
    if(NULL == create_run_request){
        return ;
    }
    listEntry_t *listEntry;
    if (create_run_request->assistant_id) {
        free(create_run_request->assistant_id);
        create_run_request->assistant_id = NULL;
    }
    if (create_run_request->model) {
        create_run_request_model_free(create_run_request->model);
        create_run_request->model = NULL;
    }
    if (create_run_request->instructions) {
        free(create_run_request->instructions);
        create_run_request->instructions = NULL;
    }
    if (create_run_request->additional_instructions) {
        free(create_run_request->additional_instructions);
        create_run_request->additional_instructions = NULL;
    }
    if (create_run_request->additional_messages) {
        list_ForEach(listEntry, create_run_request->additional_messages) {
            create_message_request_free(listEntry->data);
        }
        list_freeList(create_run_request->additional_messages);
        create_run_request->additional_messages = NULL;
    }
    if (create_run_request->tools) {
        list_ForEach(listEntry, create_run_request->tools) {
            assistant_object_tools_inner_free(listEntry->data);
        }
        list_freeList(create_run_request->tools);
        create_run_request->tools = NULL;
    }
    if (create_run_request->metadata) {
        object_free(create_run_request->metadata);
        create_run_request->metadata = NULL;
    }
    if (create_run_request->truncation_strategy) {
        truncation_object_free(create_run_request->truncation_strategy);
        create_run_request->truncation_strategy = NULL;
    }
    if (create_run_request->tool_choice) {
        assistants_api_tool_choice_option_free(create_run_request->tool_choice);
        create_run_request->tool_choice = NULL;
    }
    if (create_run_request->response_format) {
        assistants_api_response_format_option_free(create_run_request->response_format);
        create_run_request->response_format = NULL;
    }
    free(create_run_request);
}

cJSON *create_run_request_convertToJSON(create_run_request_t *create_run_request) {
    cJSON *item = cJSON_CreateObject();

    // create_run_request->assistant_id
    if (!create_run_request->assistant_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "assistant_id", create_run_request->assistant_id) == NULL) {
    goto fail; //String
    }


    // create_run_request->model
    if(create_run_request->model) {
    cJSON *model_local_JSON = create_run_request_model_convertToJSON(create_run_request->model);
    if(model_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "model", model_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_run_request->instructions
    if(create_run_request->instructions) {
    if(cJSON_AddStringToObject(item, "instructions", create_run_request->instructions) == NULL) {
    goto fail; //String
    }
    }


    // create_run_request->additional_instructions
    if(create_run_request->additional_instructions) {
    if(cJSON_AddStringToObject(item, "additional_instructions", create_run_request->additional_instructions) == NULL) {
    goto fail; //String
    }
    }


    // create_run_request->additional_messages
    if(create_run_request->additional_messages) {
    cJSON *additional_messages = cJSON_AddArrayToObject(item, "additional_messages");
    if(additional_messages == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *additional_messagesListEntry;
    if (create_run_request->additional_messages) {
    list_ForEach(additional_messagesListEntry, create_run_request->additional_messages) {
    cJSON *itemLocal = create_message_request_convertToJSON(additional_messagesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(additional_messages, itemLocal);
    }
    }
    }


    // create_run_request->tools
    if(create_run_request->tools) {
    cJSON *tools = cJSON_AddArrayToObject(item, "tools");
    if(tools == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *toolsListEntry;
    if (create_run_request->tools) {
    list_ForEach(toolsListEntry, create_run_request->tools) {
    cJSON *itemLocal = assistant_object_tools_inner_convertToJSON(toolsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tools, itemLocal);
    }
    }
    }


    // create_run_request->metadata
    if(create_run_request->metadata) {
    cJSON *metadata_object = object_convertToJSON(create_run_request->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_run_request->temperature
    if(create_run_request->temperature) {
    if(cJSON_AddNumberToObject(item, "temperature", create_run_request->temperature) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_run_request->stream
    if(create_run_request->stream) {
    if(cJSON_AddBoolToObject(item, "stream", create_run_request->stream) == NULL) {
    goto fail; //Bool
    }
    }


    // create_run_request->max_prompt_tokens
    if(create_run_request->max_prompt_tokens) {
    if(cJSON_AddNumberToObject(item, "max_prompt_tokens", create_run_request->max_prompt_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_run_request->max_completion_tokens
    if(create_run_request->max_completion_tokens) {
    if(cJSON_AddNumberToObject(item, "max_completion_tokens", create_run_request->max_completion_tokens) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_run_request->truncation_strategy
    if(create_run_request->truncation_strategy) {
    cJSON *truncation_strategy_local_JSON = truncation_object_convertToJSON(create_run_request->truncation_strategy);
    if(truncation_strategy_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "truncation_strategy", truncation_strategy_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_run_request->tool_choice
    if(create_run_request->tool_choice) {
    cJSON *tool_choice_local_JSON = assistants_api_tool_choice_option_convertToJSON(create_run_request->tool_choice);
    if(tool_choice_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tool_choice", tool_choice_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_run_request->response_format
    if(create_run_request->response_format) {
    cJSON *response_format_local_JSON = assistants_api_response_format_option_convertToJSON(create_run_request->response_format);
    if(response_format_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "response_format", response_format_local_JSON);
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

create_run_request_t *create_run_request_parseFromJSON(cJSON *create_run_requestJSON){

    create_run_request_t *create_run_request_local_var = NULL;

    // define the local variable for create_run_request->model
    create_run_request_model_t *model_local_nonprim = NULL;

    // define the local list for create_run_request->additional_messages
    list_t *additional_messagesList = NULL;

    // define the local list for create_run_request->tools
    list_t *toolsList = NULL;

    // define the local variable for create_run_request->truncation_strategy
    truncation_object_t *truncation_strategy_local_nonprim = NULL;

    // define the local variable for create_run_request->tool_choice
    assistants_api_tool_choice_option_t *tool_choice_local_nonprim = NULL;

    // define the local variable for create_run_request->response_format
    assistants_api_response_format_option_t *response_format_local_nonprim = NULL;

    // create_run_request->assistant_id
    cJSON *assistant_id = cJSON_GetObjectItemCaseSensitive(create_run_requestJSON, "assistant_id");
    if (!assistant_id) {
        goto end;
    }

    
    if(!cJSON_IsString(assistant_id))
    {
    goto end; //String
    }

    // create_run_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_run_requestJSON, "model");
    if (model) { 
    model_local_nonprim = create_run_request_model_parseFromJSON(model); //nonprimitive
    }

    // create_run_request->instructions
    cJSON *instructions = cJSON_GetObjectItemCaseSensitive(create_run_requestJSON, "instructions");
    if (instructions) { 
    if(!cJSON_IsString(instructions) && !cJSON_IsNull(instructions))
    {
    goto end; //String
    }
    }

    // create_run_request->additional_instructions
    cJSON *additional_instructions = cJSON_GetObjectItemCaseSensitive(create_run_requestJSON, "additional_instructions");
    if (additional_instructions) { 
    if(!cJSON_IsString(additional_instructions) && !cJSON_IsNull(additional_instructions))
    {
    goto end; //String
    }
    }

    // create_run_request->additional_messages
    cJSON *additional_messages = cJSON_GetObjectItemCaseSensitive(create_run_requestJSON, "additional_messages");
    if (additional_messages) { 
    cJSON *additional_messages_local_nonprimitive = NULL;
    if(!cJSON_IsArray(additional_messages)){
        goto end; //nonprimitive container
    }

    additional_messagesList = list_createList();

    cJSON_ArrayForEach(additional_messages_local_nonprimitive,additional_messages )
    {
        if(!cJSON_IsObject(additional_messages_local_nonprimitive)){
            goto end;
        }
        create_message_request_t *additional_messagesItem = create_message_request_parseFromJSON(additional_messages_local_nonprimitive);

        list_addElement(additional_messagesList, additional_messagesItem);
    }
    }

    // create_run_request->tools
    cJSON *tools = cJSON_GetObjectItemCaseSensitive(create_run_requestJSON, "tools");
    if (tools) { 
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
    }

    // create_run_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(create_run_requestJSON, "metadata");
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }

    // create_run_request->temperature
    cJSON *temperature = cJSON_GetObjectItemCaseSensitive(create_run_requestJSON, "temperature");
    if (temperature) { 
    if(!cJSON_IsNumber(temperature))
    {
    goto end; //Numeric
    }
    }

    // create_run_request->stream
    cJSON *stream = cJSON_GetObjectItemCaseSensitive(create_run_requestJSON, "stream");
    if (stream) { 
    if(!cJSON_IsBool(stream))
    {
    goto end; //Bool
    }
    }

    // create_run_request->max_prompt_tokens
    cJSON *max_prompt_tokens = cJSON_GetObjectItemCaseSensitive(create_run_requestJSON, "max_prompt_tokens");
    if (max_prompt_tokens) { 
    if(!cJSON_IsNumber(max_prompt_tokens))
    {
    goto end; //Numeric
    }
    }

    // create_run_request->max_completion_tokens
    cJSON *max_completion_tokens = cJSON_GetObjectItemCaseSensitive(create_run_requestJSON, "max_completion_tokens");
    if (max_completion_tokens) { 
    if(!cJSON_IsNumber(max_completion_tokens))
    {
    goto end; //Numeric
    }
    }

    // create_run_request->truncation_strategy
    cJSON *truncation_strategy = cJSON_GetObjectItemCaseSensitive(create_run_requestJSON, "truncation_strategy");
    if (truncation_strategy) { 
    truncation_strategy_local_nonprim = truncation_object_parseFromJSON(truncation_strategy); //nonprimitive
    }

    // create_run_request->tool_choice
    cJSON *tool_choice = cJSON_GetObjectItemCaseSensitive(create_run_requestJSON, "tool_choice");
    if (tool_choice) { 
    tool_choice_local_nonprim = assistants_api_tool_choice_option_parseFromJSON(tool_choice); //nonprimitive
    }

    // create_run_request->response_format
    cJSON *response_format = cJSON_GetObjectItemCaseSensitive(create_run_requestJSON, "response_format");
    if (response_format) { 
    response_format_local_nonprim = assistants_api_response_format_option_parseFromJSON(response_format); //nonprimitive
    }


    create_run_request_local_var = create_run_request_create (
        strdup(assistant_id->valuestring),
        model ? model_local_nonprim : NULL,
        instructions && !cJSON_IsNull(instructions) ? strdup(instructions->valuestring) : NULL,
        additional_instructions && !cJSON_IsNull(additional_instructions) ? strdup(additional_instructions->valuestring) : NULL,
        additional_messages ? additional_messagesList : NULL,
        tools ? toolsList : NULL,
        metadata ? metadata_local_object : NULL,
        temperature ? temperature->valuedouble : 0,
        stream ? stream->valueint : 0,
        max_prompt_tokens ? max_prompt_tokens->valuedouble : 0,
        max_completion_tokens ? max_completion_tokens->valuedouble : 0,
        truncation_strategy ? truncation_strategy_local_nonprim : NULL,
        tool_choice ? tool_choice_local_nonprim : NULL,
        response_format ? response_format_local_nonprim : NULL
        );

    return create_run_request_local_var;
end:
    if (model_local_nonprim) {
        create_run_request_model_free(model_local_nonprim);
        model_local_nonprim = NULL;
    }
    if (additional_messagesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, additional_messagesList) {
            create_message_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(additional_messagesList);
        additional_messagesList = NULL;
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
