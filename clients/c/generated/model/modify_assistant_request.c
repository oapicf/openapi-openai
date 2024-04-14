#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "modify_assistant_request.h"



modify_assistant_request_t *modify_assistant_request_create(
    char *model,
    char *name,
    char *description,
    char *instructions,
    list_t *tools,
    list_t *file_ids,
    object_t *metadata
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
    modify_assistant_request_local_var->file_ids = file_ids;
    modify_assistant_request_local_var->metadata = metadata;

    return modify_assistant_request_local_var;
}


void modify_assistant_request_free(modify_assistant_request_t *modify_assistant_request) {
    if(NULL == modify_assistant_request){
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
    if (modify_assistant_request->file_ids) {
        list_ForEach(listEntry, modify_assistant_request->file_ids) {
            free(listEntry->data);
        }
        list_freeList(modify_assistant_request->file_ids);
        modify_assistant_request->file_ids = NULL;
    }
    if (modify_assistant_request->metadata) {
        object_free(modify_assistant_request->metadata);
        modify_assistant_request->metadata = NULL;
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


    // modify_assistant_request->file_ids
    if(modify_assistant_request->file_ids) {
    cJSON *file_ids = cJSON_AddArrayToObject(item, "file_ids");
    if(file_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *file_idsListEntry;
    list_ForEach(file_idsListEntry, modify_assistant_request->file_ids) {
    if(cJSON_AddStringToObject(file_ids, "", (char*)file_idsListEntry->data) == NULL)
    {
        goto fail;
    }
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

    // define the local list for modify_assistant_request->file_ids
    list_t *file_idsList = NULL;

    // modify_assistant_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "model");
    if (model) { 
    if(!cJSON_IsString(model) && !cJSON_IsNull(model))
    {
    goto end; //String
    }
    }

    // modify_assistant_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // modify_assistant_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // modify_assistant_request->instructions
    cJSON *instructions = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "instructions");
    if (instructions) { 
    if(!cJSON_IsString(instructions) && !cJSON_IsNull(instructions))
    {
    goto end; //String
    }
    }

    // modify_assistant_request->tools
    cJSON *tools = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "tools");
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

    // modify_assistant_request->file_ids
    cJSON *file_ids = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "file_ids");
    if (file_ids) { 
    cJSON *file_ids_local = NULL;
    if(!cJSON_IsArray(file_ids)) {
        goto end;//primitive container
    }
    file_idsList = list_createList();

    cJSON_ArrayForEach(file_ids_local, file_ids)
    {
        if(!cJSON_IsString(file_ids_local))
        {
            goto end;
        }
        list_addElement(file_idsList , strdup(file_ids_local->valuestring));
    }
    }

    // modify_assistant_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(modify_assistant_requestJSON, "metadata");
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }


    modify_assistant_request_local_var = modify_assistant_request_create (
        model && !cJSON_IsNull(model) ? strdup(model->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        instructions && !cJSON_IsNull(instructions) ? strdup(instructions->valuestring) : NULL,
        tools ? toolsList : NULL,
        file_ids ? file_idsList : NULL,
        metadata ? metadata_local_object : NULL
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
    if (file_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, file_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(file_idsList);
        file_idsList = NULL;
    }
    return NULL;

}
