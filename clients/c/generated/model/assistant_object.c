#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistant_object.h"


char* assistant_object_object_ToString(openai_api_assistant_object_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "assistant" };
    return objectArray[object];
}

openai_api_assistant_object_OBJECT_e assistant_object_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "assistant" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static assistant_object_t *assistant_object_create_internal(
    char *id,
    openai_api_assistant_object_OBJECT_e object,
    int created_at,
    char *name,
    char *description,
    char *model,
    char *instructions,
    list_t *tools,
    assistant_object_tool_resources_t *tool_resources,
    object_t *metadata,
    double temperature,
    double top_p,
    assistants_api_response_format_option_t *response_format
    ) {
    assistant_object_t *assistant_object_local_var = malloc(sizeof(assistant_object_t));
    if (!assistant_object_local_var) {
        return NULL;
    }
    assistant_object_local_var->id = id;
    assistant_object_local_var->object = object;
    assistant_object_local_var->created_at = created_at;
    assistant_object_local_var->name = name;
    assistant_object_local_var->description = description;
    assistant_object_local_var->model = model;
    assistant_object_local_var->instructions = instructions;
    assistant_object_local_var->tools = tools;
    assistant_object_local_var->tool_resources = tool_resources;
    assistant_object_local_var->metadata = metadata;
    assistant_object_local_var->temperature = temperature;
    assistant_object_local_var->top_p = top_p;
    assistant_object_local_var->response_format = response_format;

    assistant_object_local_var->_library_owned = 1;
    return assistant_object_local_var;
}

__attribute__((deprecated)) assistant_object_t *assistant_object_create(
    char *id,
    openai_api_assistant_object_OBJECT_e object,
    int created_at,
    char *name,
    char *description,
    char *model,
    char *instructions,
    list_t *tools,
    assistant_object_tool_resources_t *tool_resources,
    object_t *metadata,
    double temperature,
    double top_p,
    assistants_api_response_format_option_t *response_format
    ) {
    return assistant_object_create_internal (
        id,
        object,
        created_at,
        name,
        description,
        model,
        instructions,
        tools,
        tool_resources,
        metadata,
        temperature,
        top_p,
        response_format
        );
}

void assistant_object_free(assistant_object_t *assistant_object) {
    if(NULL == assistant_object){
        return ;
    }
    if(assistant_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistant_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (assistant_object->id) {
        free(assistant_object->id);
        assistant_object->id = NULL;
    }
    if (assistant_object->name) {
        free(assistant_object->name);
        assistant_object->name = NULL;
    }
    if (assistant_object->description) {
        free(assistant_object->description);
        assistant_object->description = NULL;
    }
    if (assistant_object->model) {
        free(assistant_object->model);
        assistant_object->model = NULL;
    }
    if (assistant_object->instructions) {
        free(assistant_object->instructions);
        assistant_object->instructions = NULL;
    }
    if (assistant_object->tools) {
        list_ForEach(listEntry, assistant_object->tools) {
            assistant_object_tools_inner_free(listEntry->data);
        }
        list_freeList(assistant_object->tools);
        assistant_object->tools = NULL;
    }
    if (assistant_object->tool_resources) {
        assistant_object_tool_resources_free(assistant_object->tool_resources);
        assistant_object->tool_resources = NULL;
    }
    if (assistant_object->metadata) {
        object_free(assistant_object->metadata);
        assistant_object->metadata = NULL;
    }
    if (assistant_object->response_format) {
        assistants_api_response_format_option_free(assistant_object->response_format);
        assistant_object->response_format = NULL;
    }
    free(assistant_object);
}

cJSON *assistant_object_convertToJSON(assistant_object_t *assistant_object) {
    cJSON *item = cJSON_CreateObject();

    // assistant_object->id
    if (!assistant_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", assistant_object->id) == NULL) {
    goto fail; //String
    }


    // assistant_object->object
    if (openai_api_assistant_object_OBJECT_NULL == assistant_object->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", assistant_object_object_ToString(assistant_object->object)) == NULL)
    {
    goto fail; //Enum
    }


    // assistant_object->created_at
    if (!assistant_object->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", assistant_object->created_at) == NULL) {
    goto fail; //Numeric
    }


    // assistant_object->name
    if (!assistant_object->name) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "name", assistant_object->name) == NULL) {
    goto fail; //String
    }


    // assistant_object->description
    if (!assistant_object->description) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "description", assistant_object->description) == NULL) {
    goto fail; //String
    }


    // assistant_object->model
    if (!assistant_object->model) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "model", assistant_object->model) == NULL) {
    goto fail; //String
    }


    // assistant_object->instructions
    if (!assistant_object->instructions) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "instructions", assistant_object->instructions) == NULL) {
    goto fail; //String
    }


    // assistant_object->tools
    if (!assistant_object->tools) {
        goto fail;
    }
    cJSON *tools = cJSON_AddArrayToObject(item, "tools");
    if(tools == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *toolsListEntry;
    if (assistant_object->tools) {
    list_ForEach(toolsListEntry, assistant_object->tools) {
    cJSON *itemLocal = assistant_object_tools_inner_convertToJSON(toolsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tools, itemLocal);
    }
    }


    // assistant_object->tool_resources
    if(assistant_object->tool_resources) {
    cJSON *tool_resources_local_JSON = assistant_object_tool_resources_convertToJSON(assistant_object->tool_resources);
    if(tool_resources_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tool_resources", tool_resources_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // assistant_object->metadata
    if (!assistant_object->metadata) {
        goto fail;
    }
    cJSON *metadata_object = object_convertToJSON(assistant_object->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
    if(item->child == NULL) {
    goto fail;
    }


    // assistant_object->temperature
    if(assistant_object->temperature) {
    if(cJSON_AddNumberToObject(item, "temperature", assistant_object->temperature) == NULL) {
    goto fail; //Numeric
    }
    }


    // assistant_object->top_p
    if(assistant_object->top_p) {
    if(cJSON_AddNumberToObject(item, "top_p", assistant_object->top_p) == NULL) {
    goto fail; //Numeric
    }
    }


    // assistant_object->response_format
    if(assistant_object->response_format) {
    cJSON *response_format_local_JSON = assistants_api_response_format_option_convertToJSON(assistant_object->response_format);
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

assistant_object_t *assistant_object_parseFromJSON(cJSON *assistant_objectJSON){

    assistant_object_t *assistant_object_local_var = NULL;

    // define the local list for assistant_object->tools
    list_t *toolsList = NULL;

    // define the local variable for assistant_object->tool_resources
    assistant_object_tool_resources_t *tool_resources_local_nonprim = NULL;

    // define the local variable for assistant_object->response_format
    assistants_api_response_format_option_t *response_format_local_nonprim = NULL;

    // assistant_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(assistant_objectJSON, "id");
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

    // assistant_object->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(assistant_objectJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_assistant_object_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = assistant_object_object_FromString(object->valuestring);

    // assistant_object->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(assistant_objectJSON, "created_at");
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

    // assistant_object->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(assistant_objectJSON, "name");
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

    // assistant_object->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(assistant_objectJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (!description) {
        goto end;
    }

    
    if(!cJSON_IsString(description))
    {
    goto end; //String
    }

    // assistant_object->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(assistant_objectJSON, "model");
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

    // assistant_object->instructions
    cJSON *instructions = cJSON_GetObjectItemCaseSensitive(assistant_objectJSON, "instructions");
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

    // assistant_object->tools
    cJSON *tools = cJSON_GetObjectItemCaseSensitive(assistant_objectJSON, "tools");
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

    // assistant_object->tool_resources
    cJSON *tool_resources = cJSON_GetObjectItemCaseSensitive(assistant_objectJSON, "tool_resources");
    if (cJSON_IsNull(tool_resources)) {
        tool_resources = NULL;
    }
    if (tool_resources) { 
    tool_resources_local_nonprim = assistant_object_tool_resources_parseFromJSON(tool_resources); //nonprimitive
    }

    // assistant_object->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(assistant_objectJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    if (!metadata) {
        goto end;
    }

    object_t *metadata_local_object = NULL;
    
    metadata_local_object = object_parseFromJSON(metadata); //object

    // assistant_object->temperature
    cJSON *temperature = cJSON_GetObjectItemCaseSensitive(assistant_objectJSON, "temperature");
    if (cJSON_IsNull(temperature)) {
        temperature = NULL;
    }
    if (temperature) { 
    if(!cJSON_IsNumber(temperature))
    {
    goto end; //Numeric
    }
    }

    // assistant_object->top_p
    cJSON *top_p = cJSON_GetObjectItemCaseSensitive(assistant_objectJSON, "top_p");
    if (cJSON_IsNull(top_p)) {
        top_p = NULL;
    }
    if (top_p) { 
    if(!cJSON_IsNumber(top_p))
    {
    goto end; //Numeric
    }
    }

    // assistant_object->response_format
    cJSON *response_format = cJSON_GetObjectItemCaseSensitive(assistant_objectJSON, "response_format");
    if (cJSON_IsNull(response_format)) {
        response_format = NULL;
    }
    if (response_format) { 
    response_format_local_nonprim = assistants_api_response_format_option_parseFromJSON(response_format); //nonprimitive
    }


    assistant_object_local_var = assistant_object_create_internal (
        strdup(id->valuestring),
        objectVariable,
        created_at->valuedouble,
        strdup(name->valuestring),
        strdup(description->valuestring),
        strdup(model->valuestring),
        strdup(instructions->valuestring),
        toolsList,
        tool_resources ? tool_resources_local_nonprim : NULL,
        metadata_local_object,
        temperature ? temperature->valuedouble : 0,
        top_p ? top_p->valuedouble : 0,
        response_format ? response_format_local_nonprim : NULL
        );

    return assistant_object_local_var;
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
        assistant_object_tool_resources_free(tool_resources_local_nonprim);
        tool_resources_local_nonprim = NULL;
    }
    if (response_format_local_nonprim) {
        assistants_api_response_format_option_free(response_format_local_nonprim);
        response_format_local_nonprim = NULL;
    }
    return NULL;

}
