#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "modify_assistant_request.h"



static modify_assistant_request_t *modify_assistant_request_create_internal(
    char *model,
    char *name,
    char *description,
    char *instructions,
    list_t *tools,
    modify_assistant_request_tool_resources_t *tool_resources,
    object_t *metadata,
    double temperature,
    double top_p,
    assistants_api_response_format_option_t *response_format
    ) {
    modify_assistant_request_t *modify_assistant_request_local_var = malloc(sizeof(modify_assistant_request_t));
    if (!modify_assistant_request_local_var) {
        return NULL;
    }
    modify_assistant_request_local_var->model = model;
    modify_assistant_request_local_var->name = name;
    modify_assistant_request_local_var->description = description;
    modify_assistant_request_local_var->instructions = instructions;
    modify_assistant_request_local_var->tools = tools;
    modify_assistant_request_local_var->tool_resources = tool_resources;
    modify_assistant_request_local_var->metadata = metadata;
    modify_assistant_request_local_var->temperature = temperature;
    modify_assistant_request_local_var->top_p = top_p;
    modify_assistant_request_local_var->response_format = response_format;

    modify_assistant_request_local_var->_library_owned = 1;
    return modify_assistant_request_local_var;
}

__attribute__((deprecated)) modify_assistant_request_t *modify_assistant_request_create(
    char *model,
    char *name,
    char *description,
    char *instructions,
    list_t *tools,
    modify_assistant_request_tool_resources_t *tool_resources,
    object_t *metadata,
    double temperature,
    double top_p,
    assistants_api_response_format_option_t *response_format
    ) {
    return modify_assistant_request_create_internal (
        model,
        name,
        description,
        instructions,
        tools,
        tool_resources,
        metadata,
        temperature,
        top_p,
        response_format
        );
}

void modify_assistant_request_free(modify_assistant_request_t *modify_assistant_request) {
    if(NULL == modify_assistant_request){
        return ;
    }
    if(modify_assistant_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "modify_assistant_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (modify_assistant_request->model) {
        free(modify_assistant_request->model);
        modify_assistant_request->model = NULL;
    }
    if (modify_assistant_request->name) {
        free(modify_assistant_request->name);
        modify_assistant_request->name = NULL;
    }
    if (modify_assistant_request->description) {
        free(modify_assistant_request->description);
        modify_assistant_request->description = NULL;
    }
    if (modify_assistant_request->instructions) {
        free(modify_assistant_request->instructions);
        modify_assistant_request->instructions = NULL;
    }
    if (modify_assistant_request->tools) {
        list_ForEach(listEntry, modify_assistant_request->tools) {
            assistant_object_tools_inner_free(listEntry->data);
        }
        list_freeList(modify_assistant_request->tools);
        modify_assistant_request->tools = NULL;
    }
    if (modify_assistant_request->tool_resources) {
        modify_assistant_request_tool_resources_free(modify_assistant_request->tool_resources);
        modify_assistant_request->tool_resources = NULL;
    }
    if (modify_assistant_request->metadata) {
        object_free(modify_assistant_request->metadata);
        modify_assistant_request->metadata = NULL;
    }
    if (modify_assistant_request->response_format) {
        assistants_api_response_format_option_free(modify_assistant_request->response_format);
        modify_assistant_request->response_format = NULL;
    }
    free(modify_assistant_request);
}

cJSON *modify_assistant_request_convertToJSON(modify_assistant_request_t *modify_assistant_request) {
    cJSON *item = cJSON_CreateObject();

    // modify_assistant_request->model
    if(modify_assistant_request->model) {
    if(cJSON_AddStringToObject(item, "model", modify_assistant_request->model) == NULL) {
    goto fail; //String
    }
    }


    // modify_assistant_request->name
    if(modify_assistant_request->name) {
    if(cJSON_AddStringToObject(item, "name", modify_assistant_request->name) == NULL) {
    goto fail; //String
    }
    }


    // modify_assistant_request->description
    if(modify_assistant_request->description) {
    if(cJSON_AddStringToObject(item, "description", modify_assistant_request->description) == NULL) {
    goto fail; //String
    }
    }


    // modify_assistant_request->instructions
    if(modify_assistant_request->instructions) {
    if(cJSON_AddStringToObject(item, "instructions", modify_assistant_request->instructions) == NULL) {
    goto fail; //String
    }
    }


    // modify_assistant_request->tools
    if(modify_assistant_request->tools) {
    cJSON *tools = cJSON_AddArrayToObject(item, "tools");
    if(tools == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *toolsListEntry;
    if (modify_assistant_request->tools) {
    list_ForEach(toolsListEntry, modify_assistant_request->tools) {
    cJSON *itemLocal = assistant_object_tools_inner_convertToJSON(toolsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tools, itemLocal);
    }
    }
    }


    // modify_assistant_request->tool_resources
    if(modify_assistant_request->tool_resources) {
    cJSON *tool_resources_local_JSON = modify_assistant_request_tool_resources_convertToJSON(modify_assistant_request->tool_resources);
    if(tool_resources_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tool_resources", tool_resources_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // modify_assistant_request->metadata
    if(modify_assistant_request->metadata) {
    cJSON *metadata_object = object_convertToJSON(modify_assistant_request->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // modify_assistant_request->temperature
    if(modify_assistant_request->temperature) {
    if(cJSON_AddNumberToObject(item, "temperature", modify_assistant_request->temperature) == NULL) {
    goto fail; //Numeric
    }
    }


    // modify_assistant_request->top_p
    if(modify_assistant_request->top_p) {
    if(cJSON_AddNumberToObject(item, "top_p", modify_assistant_request->top_p) == NULL) {
    goto fail; //Numeric
    }
    }


    // modify_assistant_request->response_format
    if(modify_assistant_request->response_format) {
    cJSON *response_format_local_JSON = assistants_api_response_format_option_convertToJSON(modify_assistant_request->response_format);
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

modify_assistant_request_t *modify_assistant_request_parseFromJSON(cJSON *modify_assistant_requestJSON){

    modify_assistant_request_t *modify_assistant_request_local_var = NULL;

    // define the local list for modify_assistant_request->tools
    list_t *toolsList = NULL;

    // define the local variable for modify_assistant_request->tool_resources
    modify_assistant_request_tool_resources_t *tool_resources_local_nonprim = NULL;

    // define the local variable for modify_assistant_request->response_format
    assistants_api_response_format_option_t *response_format_local_nonprim = NULL;

    // modify_assistant_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (model) { 
    if(!cJSON_IsString(model) && !cJSON_IsNull(model))
    {
    goto end; //String
    }
    }

    // modify_assistant_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // modify_assistant_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // modify_assistant_request->instructions
    cJSON *instructions = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "instructions");
    if (cJSON_IsNull(instructions)) {
        instructions = NULL;
    }
    if (instructions) { 
    if(!cJSON_IsString(instructions) && !cJSON_IsNull(instructions))
    {
    goto end; //String
    }
    }

    // modify_assistant_request->tools
    cJSON *tools = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "tools");
    if (cJSON_IsNull(tools)) {
        tools = NULL;
    }
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

    // modify_assistant_request->tool_resources
    cJSON *tool_resources = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "tool_resources");
    if (cJSON_IsNull(tool_resources)) {
        tool_resources = NULL;
    }
    if (tool_resources) { 
    tool_resources_local_nonprim = modify_assistant_request_tool_resources_parseFromJSON(tool_resources); //nonprimitive
    }

    // modify_assistant_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }

    // modify_assistant_request->temperature
    cJSON *temperature = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "temperature");
    if (cJSON_IsNull(temperature)) {
        temperature = NULL;
    }
    if (temperature) { 
    if(!cJSON_IsNumber(temperature))
    {
    goto end; //Numeric
    }
    }

    // modify_assistant_request->top_p
    cJSON *top_p = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "top_p");
    if (cJSON_IsNull(top_p)) {
        top_p = NULL;
    }
    if (top_p) { 
    if(!cJSON_IsNumber(top_p))
    {
    goto end; //Numeric
    }
    }

    // modify_assistant_request->response_format
    cJSON *response_format = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "response_format");
    if (cJSON_IsNull(response_format)) {
        response_format = NULL;
    }
    if (response_format) { 
    response_format_local_nonprim = assistants_api_response_format_option_parseFromJSON(response_format); //nonprimitive
    }


    modify_assistant_request_local_var = modify_assistant_request_create_internal (
        model && !cJSON_IsNull(model) ? strdup(model->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        instructions && !cJSON_IsNull(instructions) ? strdup(instructions->valuestring) : NULL,
        tools ? toolsList : NULL,
        tool_resources ? tool_resources_local_nonprim : NULL,
        metadata ? metadata_local_object : NULL,
        temperature ? temperature->valuedouble : 0,
        top_p ? top_p->valuedouble : 0,
        response_format ? response_format_local_nonprim : NULL
        );

    return modify_assistant_request_local_var;
end:
    if (toolsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, toolsList) {
            assistant_object_tools_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(toolsList);
        toolsList = NULL;
    }
    if (tool_resources_local_nonprim) {
        modify_assistant_request_tool_resources_free(tool_resources_local_nonprim);
        tool_resources_local_nonprim = NULL;
    }
    if (response_format_local_nonprim) {
        assistants_api_response_format_option_free(response_format_local_nonprim);
        response_format_local_nonprim = NULL;
    }
    return NULL;

}
