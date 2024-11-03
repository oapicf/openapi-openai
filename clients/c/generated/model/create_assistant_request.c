#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_assistant_request.h"



create_assistant_request_t *create_assistant_request_create(
    create_assistant_request_model_t *model,
    char *name,
    char *description,
    char *instructions,
    list_t *tools,
    list_t *file_ids,
    object_t *metadata
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
    create_assistant_request_local_var->file_ids = file_ids;
    create_assistant_request_local_var->metadata = metadata;

    return create_assistant_request_local_var;
}


void create_assistant_request_free(create_assistant_request_t *create_assistant_request) {
    if(NULL == create_assistant_request){
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
    if (create_assistant_request->file_ids) {
        list_ForEach(listEntry, create_assistant_request->file_ids) {
            free(listEntry->data);
        }
        list_freeList(create_assistant_request->file_ids);
        create_assistant_request->file_ids = NULL;
    }
    if (create_assistant_request->metadata) {
        object_free(create_assistant_request->metadata);
        create_assistant_request->metadata = NULL;
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


    // create_assistant_request->file_ids
    if(create_assistant_request->file_ids) {
    cJSON *file_ids = cJSON_AddArrayToObject(item, "file_ids");
    if(file_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *file_idsListEntry;
    list_ForEach(file_idsListEntry, create_assistant_request->file_ids) {
    if(cJSON_AddStringToObject(file_ids, "", (char*)file_idsListEntry->data) == NULL)
    {
        goto fail;
    }
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

    // define the local list for create_assistant_request->file_ids
    list_t *file_idsList = NULL;

    // create_assistant_request->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "model");
    if (!model) {
        goto end;
    }

    
    model_local_nonprim = create_assistant_request_model_parseFromJSON(model); //nonprimitive

    // create_assistant_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "name");
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // create_assistant_request->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }

    // create_assistant_request->instructions
    cJSON *instructions = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "instructions");
    if (instructions) { 
    if(!cJSON_IsString(instructions) && !cJSON_IsNull(instructions))
    {
    goto end; //String
    }
    }

    // create_assistant_request->tools
    cJSON *tools = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "tools");
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

    // create_assistant_request->file_ids
    cJSON *file_ids = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "file_ids");
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

    // create_assistant_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(create_assistant_requestJSON, "metadata");
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }


    create_assistant_request_local_var = create_assistant_request_create (
        model_local_nonprim,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        description && !cJSON_IsNull(description) ? strdup(description->valuestring) : NULL,
        instructions && !cJSON_IsNull(instructions) ? strdup(instructions->valuestring) : NULL,
        tools ? toolsList : NULL,
        file_ids ? file_idsList : NULL,
        metadata ? metadata_local_object : NULL
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
