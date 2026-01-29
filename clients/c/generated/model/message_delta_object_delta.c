#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_delta_object_delta.h"


char* message_delta_object_delta_role_ToString(openai_api_message_delta_object_delta_ROLE_e role) {
    char* roleArray[] =  { "NULL", "user", "assistant" };
    return roleArray[role];
}

openai_api_message_delta_object_delta_ROLE_e message_delta_object_delta_role_FromString(char* role){
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

static message_delta_object_delta_t *message_delta_object_delta_create_internal(
    openai_api_message_delta_object_delta_ROLE_e role,
    list_t *content,
    list_t *file_ids
    ) {
    message_delta_object_delta_t *message_delta_object_delta_local_var = malloc(sizeof(message_delta_object_delta_t));
    if (!message_delta_object_delta_local_var) {
        return NULL;
    }
    message_delta_object_delta_local_var->role = role;
    message_delta_object_delta_local_var->content = content;
    message_delta_object_delta_local_var->file_ids = file_ids;

    message_delta_object_delta_local_var->_library_owned = 1;
    return message_delta_object_delta_local_var;
}

__attribute__((deprecated)) message_delta_object_delta_t *message_delta_object_delta_create(
    openai_api_message_delta_object_delta_ROLE_e role,
    list_t *content,
    list_t *file_ids
    ) {
    return message_delta_object_delta_create_internal (
        role,
        content,
        file_ids
        );
}

void message_delta_object_delta_free(message_delta_object_delta_t *message_delta_object_delta) {
    if(NULL == message_delta_object_delta){
        return ;
    }
    if(message_delta_object_delta->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_delta_object_delta_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_delta_object_delta->content) {
        list_ForEach(listEntry, message_delta_object_delta->content) {
            message_delta_object_delta_content_inner_free(listEntry->data);
        }
        list_freeList(message_delta_object_delta->content);
        message_delta_object_delta->content = NULL;
    }
    if (message_delta_object_delta->file_ids) {
        list_ForEach(listEntry, message_delta_object_delta->file_ids) {
            free(listEntry->data);
        }
        list_freeList(message_delta_object_delta->file_ids);
        message_delta_object_delta->file_ids = NULL;
    }
    free(message_delta_object_delta);
}

cJSON *message_delta_object_delta_convertToJSON(message_delta_object_delta_t *message_delta_object_delta) {
    cJSON *item = cJSON_CreateObject();

    // message_delta_object_delta->role
    if(message_delta_object_delta->role != openai_api_message_delta_object_delta_ROLE_NULL) {
    if(cJSON_AddStringToObject(item, "role", message_delta_object_delta_role_ToString(message_delta_object_delta->role)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // message_delta_object_delta->content
    if(message_delta_object_delta->content) {
    cJSON *content = cJSON_AddArrayToObject(item, "content");
    if(content == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *contentListEntry;
    if (message_delta_object_delta->content) {
    list_ForEach(contentListEntry, message_delta_object_delta->content) {
    cJSON *itemLocal = message_delta_object_delta_content_inner_convertToJSON(contentListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(content, itemLocal);
    }
    }
    }


    // message_delta_object_delta->file_ids
    if(message_delta_object_delta->file_ids) {
    cJSON *file_ids = cJSON_AddArrayToObject(item, "file_ids");
    if(file_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *file_idsListEntry;
    list_ForEach(file_idsListEntry, message_delta_object_delta->file_ids) {
    if(cJSON_AddStringToObject(file_ids, "", file_idsListEntry->data) == NULL)
    {
        goto fail;
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

message_delta_object_delta_t *message_delta_object_delta_parseFromJSON(cJSON *message_delta_object_deltaJSON){

    message_delta_object_delta_t *message_delta_object_delta_local_var = NULL;

    // define the local list for message_delta_object_delta->content
    list_t *contentList = NULL;

    // define the local list for message_delta_object_delta->file_ids
    list_t *file_idsList = NULL;

    // message_delta_object_delta->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(message_delta_object_deltaJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    openai_api_message_delta_object_delta_ROLE_e roleVariable;
    if (role) { 
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = message_delta_object_delta_role_FromString(role->valuestring);
    }

    // message_delta_object_delta->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(message_delta_object_deltaJSON, "content");
    if (cJSON_IsNull(content)) {
        content = NULL;
    }
    if (content) { 
    cJSON *content_local_nonprimitive = NULL;
    if(!cJSON_IsArray(content)){
        goto end; //nonprimitive container
    }

    contentList = list_createList();

    cJSON_ArrayForEach(content_local_nonprimitive,content )
    {
        if(!cJSON_IsObject(content_local_nonprimitive)){
            goto end;
        }
        message_delta_object_delta_content_inner_t *contentItem = message_delta_object_delta_content_inner_parseFromJSON(content_local_nonprimitive);

        list_addElement(contentList, contentItem);
    }
    }

    // message_delta_object_delta->file_ids
    cJSON *file_ids = cJSON_GetObjectItemCaseSensitive(message_delta_object_deltaJSON, "file_ids");
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


    message_delta_object_delta_local_var = message_delta_object_delta_create_internal (
        role ? roleVariable : openai_api_message_delta_object_delta_ROLE_NULL,
        content ? contentList : NULL,
        file_ids ? file_idsList : NULL
        );

    return message_delta_object_delta_local_var;
end:
    if (contentList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, contentList) {
            message_delta_object_delta_content_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(contentList);
        contentList = NULL;
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
