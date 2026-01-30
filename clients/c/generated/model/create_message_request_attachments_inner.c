#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_message_request_attachments_inner.h"



static create_message_request_attachments_inner_t *create_message_request_attachments_inner_create_internal(
    char *file_id,
    list_t *tools
    ) {
    create_message_request_attachments_inner_t *create_message_request_attachments_inner_local_var = malloc(sizeof(create_message_request_attachments_inner_t));
    if (!create_message_request_attachments_inner_local_var) {
        return NULL;
    }
    create_message_request_attachments_inner_local_var->file_id = file_id;
    create_message_request_attachments_inner_local_var->tools = tools;

    create_message_request_attachments_inner_local_var->_library_owned = 1;
    return create_message_request_attachments_inner_local_var;
}

__attribute__((deprecated)) create_message_request_attachments_inner_t *create_message_request_attachments_inner_create(
    char *file_id,
    list_t *tools
    ) {
    return create_message_request_attachments_inner_create_internal (
        file_id,
        tools
        );
}

void create_message_request_attachments_inner_free(create_message_request_attachments_inner_t *create_message_request_attachments_inner) {
    if(NULL == create_message_request_attachments_inner){
        return ;
    }
    if(create_message_request_attachments_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_message_request_attachments_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_message_request_attachments_inner->file_id) {
        free(create_message_request_attachments_inner->file_id);
        create_message_request_attachments_inner->file_id = NULL;
    }
    if (create_message_request_attachments_inner->tools) {
        list_ForEach(listEntry, create_message_request_attachments_inner->tools) {
            create_message_request_attachments_inner_tools_inner_free(listEntry->data);
        }
        list_freeList(create_message_request_attachments_inner->tools);
        create_message_request_attachments_inner->tools = NULL;
    }
    free(create_message_request_attachments_inner);
}

cJSON *create_message_request_attachments_inner_convertToJSON(create_message_request_attachments_inner_t *create_message_request_attachments_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_message_request_attachments_inner->file_id
    if(create_message_request_attachments_inner->file_id) {
    if(cJSON_AddStringToObject(item, "file_id", create_message_request_attachments_inner->file_id) == NULL) {
    goto fail; //String
    }
    }


    // create_message_request_attachments_inner->tools
    if(create_message_request_attachments_inner->tools) {
    cJSON *tools = cJSON_AddArrayToObject(item, "tools");
    if(tools == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *toolsListEntry;
    if (create_message_request_attachments_inner->tools) {
    list_ForEach(toolsListEntry, create_message_request_attachments_inner->tools) {
    cJSON *itemLocal = create_message_request_attachments_inner_tools_inner_convertToJSON(toolsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(tools, itemLocal);
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_message_request_attachments_inner_t *create_message_request_attachments_inner_parseFromJSON(cJSON *create_message_request_attachments_innerJSON){

    create_message_request_attachments_inner_t *create_message_request_attachments_inner_local_var = NULL;

    // define the local list for create_message_request_attachments_inner->tools
    list_t *toolsList = NULL;

    // create_message_request_attachments_inner->file_id
    cJSON *file_id = cJSON_GetObjectItemCaseSensitive(create_message_request_attachments_innerJSON, "file_id");
    if (cJSON_IsNull(file_id)) {
        file_id = NULL;
    }
    if (file_id) { 
    if(!cJSON_IsString(file_id) && !cJSON_IsNull(file_id))
    {
    goto end; //String
    }
    }

    // create_message_request_attachments_inner->tools
    cJSON *tools = cJSON_GetObjectItemCaseSensitive(create_message_request_attachments_innerJSON, "tools");
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
        create_message_request_attachments_inner_tools_inner_t *toolsItem = create_message_request_attachments_inner_tools_inner_parseFromJSON(tools_local_nonprimitive);

        list_addElement(toolsList, toolsItem);
    }
    }


    create_message_request_attachments_inner_local_var = create_message_request_attachments_inner_create_internal (
        file_id && !cJSON_IsNull(file_id) ? strdup(file_id->valuestring) : NULL,
        tools ? toolsList : NULL
        );

    return create_message_request_attachments_inner_local_var;
end:
    if (toolsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, toolsList) {
            create_message_request_attachments_inner_tools_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(toolsList);
        toolsList = NULL;
    }
    return NULL;

}
