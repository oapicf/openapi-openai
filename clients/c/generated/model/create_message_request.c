#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_message_request.h"


char* create_message_request_role_ToString(openai_api_create_message_request_ROLE_e role) {
    char* roleArray[] =  { "NULL", "user", "assistant" };
    return roleArray[role];
}

openai_api_create_message_request_ROLE_e create_message_request_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "user", "assistant" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static create_message_request_t *create_message_request_create_internal(
    openai_api_create_message_request_ROLE_e role,
    create_message_request_content_t *content,
    list_t *attachments,
    object_t *metadata
    ) {
    create_message_request_t *create_message_request_local_var = malloc(sizeof(create_message_request_t));
    if (!create_message_request_local_var) {
        return NULL;
    }
    create_message_request_local_var->role = role;
    create_message_request_local_var->content = content;
    create_message_request_local_var->attachments = attachments;
    create_message_request_local_var->metadata = metadata;

    create_message_request_local_var->_library_owned = 1;
    return create_message_request_local_var;
}

__attribute__((deprecated)) create_message_request_t *create_message_request_create(
    openai_api_create_message_request_ROLE_e role,
    create_message_request_content_t *content,
    list_t *attachments,
    object_t *metadata
    ) {
    return create_message_request_create_internal (
        role,
        content,
        attachments,
        metadata
        );
}

void create_message_request_free(create_message_request_t *create_message_request) {
    if(NULL == create_message_request){
        return ;
    }
    if(create_message_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_message_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_message_request->content) {
        create_message_request_content_free(create_message_request->content);
        create_message_request->content = NULL;
    }
    if (create_message_request->attachments) {
        list_ForEach(listEntry, create_message_request->attachments) {
            create_message_request_attachments_inner_free(listEntry->data);
        }
        list_freeList(create_message_request->attachments);
        create_message_request->attachments = NULL;
    }
    if (create_message_request->metadata) {
        object_free(create_message_request->metadata);
        create_message_request->metadata = NULL;
    }
    free(create_message_request);
}

cJSON *create_message_request_convertToJSON(create_message_request_t *create_message_request) {
    cJSON *item = cJSON_CreateObject();

    // create_message_request->role
    if (openai_api_create_message_request_ROLE_NULL == create_message_request->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", create_message_request_role_ToString(create_message_request->role)) == NULL)
    {
    goto fail; //Enum
    }


    // create_message_request->content
    if (!create_message_request->content) {
        goto fail;
    }
    cJSON *content_local_JSON = create_message_request_content_convertToJSON(create_message_request->content);
    if(content_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "content", content_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // create_message_request->attachments
    if(create_message_request->attachments) {
    cJSON *attachments = cJSON_AddArrayToObject(item, "attachments");
    if(attachments == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *attachmentsListEntry;
    if (create_message_request->attachments) {
    list_ForEach(attachmentsListEntry, create_message_request->attachments) {
    cJSON *itemLocal = create_message_request_attachments_inner_convertToJSON(attachmentsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(attachments, itemLocal);
    }
    }
    }


    // create_message_request->metadata
    if(create_message_request->metadata) {
    cJSON *metadata_object = object_convertToJSON(create_message_request->metadata);
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

create_message_request_t *create_message_request_parseFromJSON(cJSON *create_message_requestJSON){

    create_message_request_t *create_message_request_local_var = NULL;

    // define the local variable for create_message_request->content
    create_message_request_content_t *content_local_nonprim = NULL;

    // define the local list for create_message_request->attachments
    list_t *attachmentsList = NULL;

    // create_message_request->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(create_message_requestJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_create_message_request_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = create_message_request_role_FromString(role->valuestring);

    // create_message_request->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(create_message_requestJSON, "content");
    if (cJSON_IsNull(content)) {
        content = NULL;
    }
    if (!content) {
        goto end;
    }

    
    content_local_nonprim = create_message_request_content_parseFromJSON(content); //nonprimitive

    // create_message_request->attachments
    cJSON *attachments = cJSON_GetObjectItemCaseSensitive(create_message_requestJSON, "attachments");
    if (cJSON_IsNull(attachments)) {
        attachments = NULL;
    }
    if (attachments) { 
    cJSON *attachments_local_nonprimitive = NULL;
    if(!cJSON_IsArray(attachments)){
        goto end; //nonprimitive container
    }

    attachmentsList = list_createList();

    cJSON_ArrayForEach(attachments_local_nonprimitive,attachments )
    {
        if(!cJSON_IsObject(attachments_local_nonprimitive)){
            goto end;
        }
        create_message_request_attachments_inner_t *attachmentsItem = create_message_request_attachments_inner_parseFromJSON(attachments_local_nonprimitive);

        list_addElement(attachmentsList, attachmentsItem);
    }
    }

    // create_message_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(create_message_requestJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }


    create_message_request_local_var = create_message_request_create_internal (
        roleVariable,
        content_local_nonprim,
        attachments ? attachmentsList : NULL,
        metadata ? metadata_local_object : NULL
        );

    return create_message_request_local_var;
end:
    if (content_local_nonprim) {
        create_message_request_content_free(content_local_nonprim);
        content_local_nonprim = NULL;
    }
    if (attachmentsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, attachmentsList) {
            create_message_request_attachments_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(attachmentsList);
        attachmentsList = NULL;
    }
    return NULL;

}
