#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "message_object.h"


char* message_object_object_ToString(openai_api_message_object_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "thread.message" };
    return objectArray[object];
}

openai_api_message_object_OBJECT_e message_object_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "thread.message" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* message_object_status_ToString(openai_api_message_object_STATUS_e status) {
    char* statusArray[] =  { "NULL", "in_progress", "incomplete", "completed" };
    return statusArray[status];
}

openai_api_message_object_STATUS_e message_object_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "in_progress", "incomplete", "completed" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* message_object_role_ToString(openai_api_message_object_ROLE_e role) {
    char* roleArray[] =  { "NULL", "user", "assistant" };
    return roleArray[role];
}

openai_api_message_object_ROLE_e message_object_role_FromString(char* role){
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

static message_object_t *message_object_create_internal(
    char *id,
    openai_api_message_object_OBJECT_e object,
    int created_at,
    char *thread_id,
    openai_api_message_object_STATUS_e status,
    message_object_incomplete_details_t *incomplete_details,
    int completed_at,
    int incomplete_at,
    openai_api_message_object_ROLE_e role,
    list_t *content,
    char *assistant_id,
    char *run_id,
    list_t *file_ids,
    object_t *metadata
    ) {
    message_object_t *message_object_local_var = malloc(sizeof(message_object_t));
    if (!message_object_local_var) {
        return NULL;
    }
    message_object_local_var->id = id;
    message_object_local_var->object = object;
    message_object_local_var->created_at = created_at;
    message_object_local_var->thread_id = thread_id;
    message_object_local_var->status = status;
    message_object_local_var->incomplete_details = incomplete_details;
    message_object_local_var->completed_at = completed_at;
    message_object_local_var->incomplete_at = incomplete_at;
    message_object_local_var->role = role;
    message_object_local_var->content = content;
    message_object_local_var->assistant_id = assistant_id;
    message_object_local_var->run_id = run_id;
    message_object_local_var->file_ids = file_ids;
    message_object_local_var->metadata = metadata;

    message_object_local_var->_library_owned = 1;
    return message_object_local_var;
}

__attribute__((deprecated)) message_object_t *message_object_create(
    char *id,
    openai_api_message_object_OBJECT_e object,
    int created_at,
    char *thread_id,
    openai_api_message_object_STATUS_e status,
    message_object_incomplete_details_t *incomplete_details,
    int completed_at,
    int incomplete_at,
    openai_api_message_object_ROLE_e role,
    list_t *content,
    char *assistant_id,
    char *run_id,
    list_t *file_ids,
    object_t *metadata
    ) {
    return message_object_create_internal (
        id,
        object,
        created_at,
        thread_id,
        status,
        incomplete_details,
        completed_at,
        incomplete_at,
        role,
        content,
        assistant_id,
        run_id,
        file_ids,
        metadata
        );
}

void message_object_free(message_object_t *message_object) {
    if(NULL == message_object){
        return ;
    }
    if(message_object->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "message_object_free");
        return ;
    }
    listEntry_t *listEntry;
    if (message_object->id) {
        free(message_object->id);
        message_object->id = NULL;
    }
    if (message_object->thread_id) {
        free(message_object->thread_id);
        message_object->thread_id = NULL;
    }
    if (message_object->incomplete_details) {
        message_object_incomplete_details_free(message_object->incomplete_details);
        message_object->incomplete_details = NULL;
    }
    if (message_object->content) {
        list_ForEach(listEntry, message_object->content) {
            message_object_content_inner_free(listEntry->data);
        }
        list_freeList(message_object->content);
        message_object->content = NULL;
    }
    if (message_object->assistant_id) {
        free(message_object->assistant_id);
        message_object->assistant_id = NULL;
    }
    if (message_object->run_id) {
        free(message_object->run_id);
        message_object->run_id = NULL;
    }
    if (message_object->file_ids) {
        list_ForEach(listEntry, message_object->file_ids) {
            free(listEntry->data);
        }
        list_freeList(message_object->file_ids);
        message_object->file_ids = NULL;
    }
    if (message_object->metadata) {
        object_free(message_object->metadata);
        message_object->metadata = NULL;
    }
    free(message_object);
}

cJSON *message_object_convertToJSON(message_object_t *message_object) {
    cJSON *item = cJSON_CreateObject();

    // message_object->id
    if (!message_object->id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "id", message_object->id) == NULL) {
    goto fail; //String
    }


    // message_object->object
    if (openai_api_message_object_OBJECT_NULL == message_object->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", message_object_object_ToString(message_object->object)) == NULL)
    {
    goto fail; //Enum
    }


    // message_object->created_at
    if (!message_object->created_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created_at", message_object->created_at) == NULL) {
    goto fail; //Numeric
    }


    // message_object->thread_id
    if (!message_object->thread_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "thread_id", message_object->thread_id) == NULL) {
    goto fail; //String
    }


    // message_object->status
    if (openai_api_message_object_STATUS_NULL == message_object->status) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "status", message_object_status_ToString(message_object->status)) == NULL)
    {
    goto fail; //Enum
    }


    // message_object->incomplete_details
    if (!message_object->incomplete_details) {
        goto fail;
    }
    cJSON *incomplete_details_local_JSON = message_object_incomplete_details_convertToJSON(message_object->incomplete_details);
    if(incomplete_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "incomplete_details", incomplete_details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }


    // message_object->completed_at
    if (!message_object->completed_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "completed_at", message_object->completed_at) == NULL) {
    goto fail; //Numeric
    }


    // message_object->incomplete_at
    if (!message_object->incomplete_at) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "incomplete_at", message_object->incomplete_at) == NULL) {
    goto fail; //Numeric
    }


    // message_object->role
    if (openai_api_message_object_ROLE_NULL == message_object->role) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "role", message_object_role_ToString(message_object->role)) == NULL)
    {
    goto fail; //Enum
    }


    // message_object->content
    if (!message_object->content) {
        goto fail;
    }
    cJSON *content = cJSON_AddArrayToObject(item, "content");
    if(content == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *contentListEntry;
    if (message_object->content) {
    list_ForEach(contentListEntry, message_object->content) {
    cJSON *itemLocal = message_object_content_inner_convertToJSON(contentListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(content, itemLocal);
    }
    }


    // message_object->assistant_id
    if (!message_object->assistant_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "assistant_id", message_object->assistant_id) == NULL) {
    goto fail; //String
    }


    // message_object->run_id
    if (!message_object->run_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "run_id", message_object->run_id) == NULL) {
    goto fail; //String
    }


    // message_object->file_ids
    if (!message_object->file_ids) {
        goto fail;
    }
    cJSON *file_ids = cJSON_AddArrayToObject(item, "file_ids");
    if(file_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *file_idsListEntry;
    list_ForEach(file_idsListEntry, message_object->file_ids) {
    if(cJSON_AddStringToObject(file_ids, "", file_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }


    // message_object->metadata
    if (!message_object->metadata) {
        goto fail;
    }
    cJSON *metadata_object = object_convertToJSON(message_object->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

message_object_t *message_object_parseFromJSON(cJSON *message_objectJSON){

    message_object_t *message_object_local_var = NULL;

    // define the local variable for message_object->incomplete_details
    message_object_incomplete_details_t *incomplete_details_local_nonprim = NULL;

    // define the local list for message_object->content
    list_t *contentList = NULL;

    // define the local list for message_object->file_ids
    list_t *file_idsList = NULL;

    // message_object->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(message_objectJSON, "id");
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

    // message_object->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(message_objectJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_message_object_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = message_object_object_FromString(object->valuestring);

    // message_object->created_at
    cJSON *created_at = cJSON_GetObjectItemCaseSensitive(message_objectJSON, "created_at");
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

    // message_object->thread_id
    cJSON *thread_id = cJSON_GetObjectItemCaseSensitive(message_objectJSON, "thread_id");
    if (cJSON_IsNull(thread_id)) {
        thread_id = NULL;
    }
    if (!thread_id) {
        goto end;
    }

    
    if(!cJSON_IsString(thread_id))
    {
    goto end; //String
    }

    // message_object->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(message_objectJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    if (!status) {
        goto end;
    }

    openai_api_message_object_STATUS_e statusVariable;
    
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = message_object_status_FromString(status->valuestring);

    // message_object->incomplete_details
    cJSON *incomplete_details = cJSON_GetObjectItemCaseSensitive(message_objectJSON, "incomplete_details");
    if (cJSON_IsNull(incomplete_details)) {
        incomplete_details = NULL;
    }
    if (!incomplete_details) {
        goto end;
    }

    
    incomplete_details_local_nonprim = message_object_incomplete_details_parseFromJSON(incomplete_details); //nonprimitive

    // message_object->completed_at
    cJSON *completed_at = cJSON_GetObjectItemCaseSensitive(message_objectJSON, "completed_at");
    if (cJSON_IsNull(completed_at)) {
        completed_at = NULL;
    }
    if (!completed_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(completed_at))
    {
    goto end; //Numeric
    }

    // message_object->incomplete_at
    cJSON *incomplete_at = cJSON_GetObjectItemCaseSensitive(message_objectJSON, "incomplete_at");
    if (cJSON_IsNull(incomplete_at)) {
        incomplete_at = NULL;
    }
    if (!incomplete_at) {
        goto end;
    }

    
    if(!cJSON_IsNumber(incomplete_at))
    {
    goto end; //Numeric
    }

    // message_object->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(message_objectJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    if (!role) {
        goto end;
    }

    openai_api_message_object_ROLE_e roleVariable;
    
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = message_object_role_FromString(role->valuestring);

    // message_object->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(message_objectJSON, "content");
    if (cJSON_IsNull(content)) {
        content = NULL;
    }
    if (!content) {
        goto end;
    }

    
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
        message_object_content_inner_t *contentItem = message_object_content_inner_parseFromJSON(content_local_nonprimitive);

        list_addElement(contentList, contentItem);
    }

    // message_object->assistant_id
    cJSON *assistant_id = cJSON_GetObjectItemCaseSensitive(message_objectJSON, "assistant_id");
    if (cJSON_IsNull(assistant_id)) {
        assistant_id = NULL;
    }
    if (!assistant_id) {
        goto end;
    }

    
    if(!cJSON_IsString(assistant_id))
    {
    goto end; //String
    }

    // message_object->run_id
    cJSON *run_id = cJSON_GetObjectItemCaseSensitive(message_objectJSON, "run_id");
    if (cJSON_IsNull(run_id)) {
        run_id = NULL;
    }
    if (!run_id) {
        goto end;
    }

    
    if(!cJSON_IsString(run_id))
    {
    goto end; //String
    }

    // message_object->file_ids
    cJSON *file_ids = cJSON_GetObjectItemCaseSensitive(message_objectJSON, "file_ids");
    if (cJSON_IsNull(file_ids)) {
        file_ids = NULL;
    }
    if (!file_ids) {
        goto end;
    }

    
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

    // message_object->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(message_objectJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    if (!metadata) {
        goto end;
    }

    object_t *metadata_local_object = NULL;
    
    metadata_local_object = object_parseFromJSON(metadata); //object


    message_object_local_var = message_object_create_internal (
        strdup(id->valuestring),
        objectVariable,
        created_at->valuedouble,
        strdup(thread_id->valuestring),
        statusVariable,
        incomplete_details_local_nonprim,
        completed_at->valuedouble,
        incomplete_at->valuedouble,
        roleVariable,
        contentList,
        strdup(assistant_id->valuestring),
        strdup(run_id->valuestring),
        file_idsList,
        metadata_local_object
        );

    return message_object_local_var;
end:
    if (incomplete_details_local_nonprim) {
        message_object_incomplete_details_free(incomplete_details_local_nonprim);
        incomplete_details_local_nonprim = NULL;
    }
    if (contentList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, contentList) {
            message_object_content_inner_free(listEntry->data);
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
