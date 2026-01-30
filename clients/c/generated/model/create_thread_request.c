#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_thread_request.h"



static create_thread_request_t *create_thread_request_create_internal(
    list_t *messages,
    create_thread_request_tool_resources_t *tool_resources,
    object_t *metadata
    ) {
    create_thread_request_t *create_thread_request_local_var = malloc(sizeof(create_thread_request_t));
    if (!create_thread_request_local_var) {
        return NULL;
    }
    create_thread_request_local_var->messages = messages;
    create_thread_request_local_var->tool_resources = tool_resources;
    create_thread_request_local_var->metadata = metadata;

    create_thread_request_local_var->_library_owned = 1;
    return create_thread_request_local_var;
}

__attribute__((deprecated)) create_thread_request_t *create_thread_request_create(
    list_t *messages,
    create_thread_request_tool_resources_t *tool_resources,
    object_t *metadata
    ) {
    return create_thread_request_create_internal (
        messages,
        tool_resources,
        metadata
        );
}

void create_thread_request_free(create_thread_request_t *create_thread_request) {
    if(NULL == create_thread_request){
        return ;
    }
    if(create_thread_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_thread_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_thread_request->messages) {
        list_ForEach(listEntry, create_thread_request->messages) {
            create_message_request_free(listEntry->data);
        }
        list_freeList(create_thread_request->messages);
        create_thread_request->messages = NULL;
    }
    if (create_thread_request->tool_resources) {
        create_thread_request_tool_resources_free(create_thread_request->tool_resources);
        create_thread_request->tool_resources = NULL;
    }
    if (create_thread_request->metadata) {
        object_free(create_thread_request->metadata);
        create_thread_request->metadata = NULL;
    }
    free(create_thread_request);
}

cJSON *create_thread_request_convertToJSON(create_thread_request_t *create_thread_request) {
    cJSON *item = cJSON_CreateObject();

    // create_thread_request->messages
    if(create_thread_request->messages) {
    cJSON *messages = cJSON_AddArrayToObject(item, "messages");
    if(messages == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *messagesListEntry;
    if (create_thread_request->messages) {
    list_ForEach(messagesListEntry, create_thread_request->messages) {
    cJSON *itemLocal = create_message_request_convertToJSON(messagesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(messages, itemLocal);
    }
    }
    }


    // create_thread_request->tool_resources
    if(create_thread_request->tool_resources) {
    cJSON *tool_resources_local_JSON = create_thread_request_tool_resources_convertToJSON(create_thread_request->tool_resources);
    if(tool_resources_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "tool_resources", tool_resources_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_thread_request->metadata
    if(create_thread_request->metadata) {
    cJSON *metadata_object = object_convertToJSON(create_thread_request->metadata);
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

create_thread_request_t *create_thread_request_parseFromJSON(cJSON *create_thread_requestJSON){

    create_thread_request_t *create_thread_request_local_var = NULL;

    // define the local list for create_thread_request->messages
    list_t *messagesList = NULL;

    // define the local variable for create_thread_request->tool_resources
    create_thread_request_tool_resources_t *tool_resources_local_nonprim = NULL;

    // create_thread_request->messages
    cJSON *messages = cJSON_GetObjectItemCaseSensitive(create_thread_requestJSON, "messages");
    if (cJSON_IsNull(messages)) {
        messages = NULL;
    }
    if (messages) { 
    cJSON *messages_local_nonprimitive = NULL;
    if(!cJSON_IsArray(messages)){
        goto end; //nonprimitive container
    }

    messagesList = list_createList();

    cJSON_ArrayForEach(messages_local_nonprimitive,messages )
    {
        if(!cJSON_IsObject(messages_local_nonprimitive)){
            goto end;
        }
        create_message_request_t *messagesItem = create_message_request_parseFromJSON(messages_local_nonprimitive);

        list_addElement(messagesList, messagesItem);
    }
    }

    // create_thread_request->tool_resources
    cJSON *tool_resources = cJSON_GetObjectItemCaseSensitive(create_thread_requestJSON, "tool_resources");
    if (cJSON_IsNull(tool_resources)) {
        tool_resources = NULL;
    }
    if (tool_resources) { 
    tool_resources_local_nonprim = create_thread_request_tool_resources_parseFromJSON(tool_resources); //nonprimitive
    }

    // create_thread_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(create_thread_requestJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }


    create_thread_request_local_var = create_thread_request_create_internal (
        messages ? messagesList : NULL,
        tool_resources ? tool_resources_local_nonprim : NULL,
        metadata ? metadata_local_object : NULL
        );

    return create_thread_request_local_var;
end:
    if (messagesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, messagesList) {
            create_message_request_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(messagesList);
        messagesList = NULL;
    }
    if (tool_resources_local_nonprim) {
        create_thread_request_tool_resources_free(tool_resources_local_nonprim);
        tool_resources_local_nonprim = NULL;
    }
    return NULL;

}
