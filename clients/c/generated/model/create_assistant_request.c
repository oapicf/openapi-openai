#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_assistant_request.h"



static create_assistant_request_t *create_assistant_request_create_internal(
    create_assistant_request_model_t *model,
    char *name,
    char *description,
    char *instructions,
    list_t *tools,
    create_assistant_request_tool_resources_t *tool_resources,
    object_t *metadata,
    double temperature,
    double top_p,
    assistants_api_response_format_option_t *response_format
    ) {
    create_assistant_request_t *create_assistant_request_local_var = malloc(sizeof(create_assistant_request_t));
    if (!create_assistant_request_local_var) {
        return NULL;
    }
    create_assistant_request_local_var->model = model;
    create_assistant_request_local_var->name = name;
    create_assistant_request_local_var->description = description;
    create_assistant_request_local_var->instructions = instructions;
    create_assistant_request_local_var->tools = tools;
    create_assistant_request_local_var->tool_resources = tool_resources;
    create_assistant_request_local_var->metadata = metadata;
    create_assistant_request_local_var->temperature = temperature;
    create_assistant_request_local_var->top_p = top_p;
    create_assistant_request_local_var->response_format = response_format;

    create_assistant_request_local_var->_library_owned = 1;
    return create_assistant_request_local_var;
}

__attribute__((deprecated)) create_assistant_request_t *create_assistant_request_create(
    create_assistant_request_model_t *model,
    char *name,
    char *description,
    char *instructions,
    list_t *tools,
    create_assistant_request_tool_resources_t *tool_resources,
    object_t *metadata,
    double temperature,
    double top_p,
    assistants_api_response_format_option_t *response_format
    ) {
    return create_assistant_request_create_internal (
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

void create_assistant_request_free(create_assistant_request_t *create_assistant_request) {
    if(NULL == create_assistant_request){
        return ;
    }
    if(create_assistant_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_assistant_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_assistant_request->model) {
        create_assistant_request_model_free(create_assistant_request->model);
        create_assistant_request->model = NULL;
    }
    if (create_assistant_request->name) {
        free(create_assistant_request->name);
        create_assistant_request->name = NULL;
    }
    if (create_assistant_request->description) {
        free(create_assistant_request->description);
        create_assistant_request->description = NULL;
    }
    if (create_assistant_request->instructions) {
        free(create_assistant_request->instructions);
        create_assistant_request->instructions = NULL;
    }
    if (create_assistant_request->tools) {
        list_ForEach(listEntry, create_assistant_request->tools) {
            assistant_object_tools_inner_free(listEntry->data);
        }
        list_freeList(create_assistant_request->tools);
        create_assistant_request->tools = NULL;
    }
    if (create_assistant_request->tool_resources) {
        create_assistant_request_tool_resources_free(create_assistant_request->tool_resources);
        create_assistant_request->tool_resources = NULL;
    }
    if (create_assistant_request->metadata) {
        object_free(create_assistant_request->metadata);
        create_assistant_request->metadata = NULL;
    }
    if (create_assistant_request->response_format) {
        assistants_api_response_format_option_free(create_assistant_request->response_format);
        create_assistant_request->response_format = NULL;
    }
    free(create_assistant_request);
}

cJSON *create_assistant_request_convertToJSON(create_assistant_request_t *create_assistant_request) {
    cJSON *item = cJSON_CreateObject();

    // create_assistant_request->model
    if (!create_assistant_request->model) {
        goto fail;
    }
    cJSON *model_local_JSON = create_assistant_request_model_convertToJSON(create_assistant_request->model);
    if(model_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "model", model_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_assistant_request->name
    if(create_assistant_request->name) {
    if(cJSON_AddStringToObject(item, "name", create_assistant_request->name) == NULL) {
    goto fail; //String
    }
    }


    // create_assistant_request->description
    if(create_assistant_request->description) {
    if(cJSON_AddStringToObject(item, "description", create_assistant_request->description) == NULL) {
    goto fail; //String
    }
    }


    // create_assistant_request->instructions
    if(create_assistant_request->instructions) {
    if(cJSON_AddStringToObject(item, "instructions", create_assistant_request->instructions) == NULL) {
    goto fail; //String
    }
    }


    // create_assistant_request->tools
    if(create_assistant_request->tools) {
    cJSON *tools = cJSON_AddArrayToObject(item, "tools");
    if(tools == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *toolsListEntry;
    if (create_assistant_request->tools) {
    list_ForEach(toolsListEntry, create_assistant_request->tools) {
    cJSON *itemLocal = assistant_object_tools_inner_convertToJSON(toolsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tools, itemLocal);
    }
    }
    }


    // create_assistant_request->tool_resources
    if(create_assistant_request->tool_resources) {
    cJSON *tool_resources_local_JSON = create_assistant_request_tool_resources_convertToJSON(create_assistant_request->tool_resources);
    if(tool_resources_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tool_resources", tool_resources_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_assistant_request->metadata
    if(create_assistant_request->metadata) {
    cJSON *metadata_object = object_convertToJSON(create_assistant_request->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_assistant_request->temperature
    if(create_assistant_request->temperature) {
    if(cJSON_AddNumberToObject(item, "temperature", create_assistant_request->temperature) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_assistant_request->top_p
    if(create_assistant_request->top_p) {
    if(cJSON_AddNumberToObject(item, "top_p", create_assistant_request->top_p) == NULL) {
    goto fail; //Numeric
    }
    }


    // create_assistant_request->response_format
    if(create_assistant_request->response_format) {
    cJSON *response_format_local_JSON = assistants_api_response_format_option_convertToJSON(create_assistant_request->response_format);
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

create_assistant_request_t *create_assistant_request_parseFromJSON(cJSON *create_assistant_requestJSON){

    create_assistant_request_t *create_assistant_request_local_var = NULL;

    // define the local variable for create_assistant_request->model
    create_assistant_request_model_t *model_local_nonprim = NULL;

    // define the local list for create_assistant_request->tools
    list_t *toolsList = NULL;

    // define the local variable for create_assistant_request->tool_resources
    create_assistant_request_tool_resources_t *tool_resources_local_nonprim = NULL;

    // define the local variable for create_assistant_request->response_format
    assistants_api_response_format_option_t *response_format_local_nonprim = NULL;

    // create_assistant_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "model");
    if (cJSON_IsNull(model)) {
        model = NULL;
    }
    if (!model) {
        goto end;
    }

    
    model_local_nonprim = create_assistant_request_model_parseFromJSON(model); //nonprimitive

    // create_assistant_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // create_assistant_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // create_assistant_request->instructions
    cJSON *instructions = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "instructions");
    if (cJSON_IsNull(instructions)) {
        instructions = NULL;
    }
    if (instructions) { 
    if(!cJSON_IsString(instructions) && !cJSON_IsNull(instructions))
    {
    goto end; //String
    }
    }

    // create_assistant_request->tools
    cJSON *tools = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "tools");
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

    // create_assistant_request->tool_resources
    cJSON *tool_resources = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "tool_resources");
    if (cJSON_IsNull(tool_resources)) {
        tool_resources = NULL;
    }
    if (tool_resources) { 
    tool_resources_local_nonprim = create_assistant_request_tool_resources_parseFromJSON(tool_resources); //nonprimitive
    }

    // create_assistant_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }

    // create_assistant_request->temperature
    cJSON *temperature = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "temperature");
    if (cJSON_IsNull(temperature)) {
        temperature = NULL;
    }
    if (temperature) { 
    if(!cJSON_IsNumber(temperature))
    {
    goto end; //Numeric
    }
    }

    // create_assistant_request->top_p
    cJSON *top_p = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "top_p");
    if (cJSON_IsNull(top_p)) {
        top_p = NULL;
    }
    if (top_p) { 
    if(!cJSON_IsNumber(top_p))
    {
    goto end; //Numeric
    }
    }

    // create_assistant_request->response_format
    cJSON *response_format = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "response_format");
    if (cJSON_IsNull(response_format)) {
        response_format = NULL;
    }
    if (response_format) { 
    response_format_local_nonprim = assistants_api_response_format_option_parseFromJSON(response_format); //nonprimitive
    }


    create_assistant_request_local_var = create_assistant_request_create_internal (
        model_local_nonprim,
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

    return create_assistant_request_local_var;
end:
    if (model_local_nonprim) {
        create_assistant_request_model_free(model_local_nonprim);
        model_local_nonprim = NULL;
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
    if (tool_resources_local_nonprim) {
        create_assistant_request_tool_resources_free(tool_resources_local_nonprim);
        tool_resources_local_nonprim = NULL;
    }
    if (response_format_local_nonprim) {
        assistants_api_response_format_option_free(response_format_local_nonprim);
        response_format_local_nonprim = NULL;
    }
    return NULL;

}
