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
    char *content,
    list_t *file_ids,
    object_t *metadata
    ) {
    create_message_request_t *create_message_request_local_var = malloc(sizeof(create_message_request_t));
    if (!create_message_request_local_var) {
        return NULL;
    }
    create_message_request_local_var->role = role;
    create_message_request_local_var->content = content;
    create_message_request_local_var->file_ids = file_ids;
    create_message_request_local_var->metadata = metadata;

    create_message_request_local_var->_library_owned = 1;
    return create_message_request_local_var;
}

__attribute__((deprecated)) create_message_request_t *create_message_request_create(
    openai_api_create_message_request_ROLE_e role,
    char *content,
    list_t *file_ids,
    object_t *metadata
    ) {
    return create_message_request_create_internal (
        role,
        content,
        file_ids,
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
        free(create_message_request->content);
        create_message_request->content = NULL;
    }
    if (create_message_request->file_ids) {
        list_ForEach(listEntry, create_message_request->file_ids) {
            free(listEntry->data);
        }
        list_freeList(create_message_request->file_ids);
        create_message_request->file_ids = NULL;
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
    if(cJSON_AddStringToObject(item, "content", create_message_request->content) == NULL) {
    goto fail; //String
    }


    // create_message_request->file_ids
    if(create_message_request->file_ids) {
    cJSON *file_ids = cJSON_AddArrayToObject(item, "file_ids");
    if(file_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *file_idsListEntry;
    list_ForEach(file_idsListEntry, create_message_request->file_ids) {
    if(cJSON_AddStringToObject(file_ids, "", file_idsListEntry->data) == NULL)
    {
        goto fail;
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

    // define the local list for create_message_request->file_ids
    list_t *file_idsList = NULL;

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

    
    if(!cJSON_IsString(content))
    {
    goto end; //String
    }

    // create_message_request->file_ids
    cJSON *file_ids = cJSON_GetObjectItemCaseSensitive(create_message_requestJSON, "file_ids");
    if (cJSON_IsNull(file_ids)) {
        file_ids = NULL;
    }
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
        strdup(content->valuestring),
        file_ids ? file_idsList : NULL,
        metadata ? metadata_local_object : NULL
        );

    return create_message_request_local_var;
end:
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
