#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "realtime_conversation_item.h"


char* realtime_conversation_item_type_ToString(openai_api_realtime_conversation_item_TYPE_e type) {
    char* typeArray[] =  { "NULL", "message", "function_call", "function_call_output" };
    return typeArray[type];
}

openai_api_realtime_conversation_item_TYPE_e realtime_conversation_item_type_FromString(char* type){
    int stringToReturn = 0;
    char *typeArray[] =  { "NULL", "message", "function_call", "function_call_output" };
    size_t sizeofArray = sizeof(typeArray) / sizeof(typeArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(type, typeArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* realtime_conversation_item_object_ToString(openai_api_realtime_conversation_item_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "realtime.item" };
    return objectArray[object];
}

openai_api_realtime_conversation_item_OBJECT_e realtime_conversation_item_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "realtime.item" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* realtime_conversation_item_status_ToString(openai_api_realtime_conversation_item_STATUS_e status) {
    char* statusArray[] =  { "NULL", "completed", "incomplete" };
    return statusArray[status];
}

openai_api_realtime_conversation_item_STATUS_e realtime_conversation_item_status_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "completed", "incomplete" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* realtime_conversation_item_role_ToString(openai_api_realtime_conversation_item_ROLE_e role) {
    char* roleArray[] =  { "NULL", "user", "assistant", "system" };
    return roleArray[role];
}

openai_api_realtime_conversation_item_ROLE_e realtime_conversation_item_role_FromString(char* role){
    int stringToReturn = 0;
    char *roleArray[] =  { "NULL", "user", "assistant", "system" };
    size_t sizeofArray = sizeof(roleArray) / sizeof(roleArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(role, roleArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static realtime_conversation_item_t *realtime_conversation_item_create_internal(
    char *id,
    openai_api_realtime_conversation_item_TYPE_e type,
    openai_api_realtime_conversation_item_OBJECT_e object,
    openai_api_realtime_conversation_item_STATUS_e status,
    openai_api_realtime_conversation_item_ROLE_e role,
    list_t *content,
    char *call_id,
    char *name,
    char *arguments,
    char *output
    ) {
    realtime_conversation_item_t *realtime_conversation_item_local_var = malloc(sizeof(realtime_conversation_item_t));
    if (!realtime_conversation_item_local_var) {
        return NULL;
    }
    realtime_conversation_item_local_var->id = id;
    realtime_conversation_item_local_var->type = type;
    realtime_conversation_item_local_var->object = object;
    realtime_conversation_item_local_var->status = status;
    realtime_conversation_item_local_var->role = role;
    realtime_conversation_item_local_var->content = content;
    realtime_conversation_item_local_var->call_id = call_id;
    realtime_conversation_item_local_var->name = name;
    realtime_conversation_item_local_var->arguments = arguments;
    realtime_conversation_item_local_var->output = output;

    realtime_conversation_item_local_var->_library_owned = 1;
    return realtime_conversation_item_local_var;
}

__attribute__((deprecated)) realtime_conversation_item_t *realtime_conversation_item_create(
    char *id,
    openai_api_realtime_conversation_item_TYPE_e type,
    openai_api_realtime_conversation_item_OBJECT_e object,
    openai_api_realtime_conversation_item_STATUS_e status,
    openai_api_realtime_conversation_item_ROLE_e role,
    list_t *content,
    char *call_id,
    char *name,
    char *arguments,
    char *output
    ) {
    return realtime_conversation_item_create_internal (
        id,
        type,
        object,
        status,
        role,
        content,
        call_id,
        name,
        arguments,
        output
        );
}

void realtime_conversation_item_free(realtime_conversation_item_t *realtime_conversation_item) {
    if(NULL == realtime_conversation_item){
        return ;
    }
    if(realtime_conversation_item->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "realtime_conversation_item_free");
        return ;
    }
    listEntry_t *listEntry;
    if (realtime_conversation_item->id) {
        free(realtime_conversation_item->id);
        realtime_conversation_item->id = NULL;
    }
    if (realtime_conversation_item->content) {
        list_ForEach(listEntry, realtime_conversation_item->content) {
            realtime_conversation_item_content_inner_free(listEntry->data);
        }
        list_freeList(realtime_conversation_item->content);
        realtime_conversation_item->content = NULL;
    }
    if (realtime_conversation_item->call_id) {
        free(realtime_conversation_item->call_id);
        realtime_conversation_item->call_id = NULL;
    }
    if (realtime_conversation_item->name) {
        free(realtime_conversation_item->name);
        realtime_conversation_item->name = NULL;
    }
    if (realtime_conversation_item->arguments) {
        free(realtime_conversation_item->arguments);
        realtime_conversation_item->arguments = NULL;
    }
    if (realtime_conversation_item->output) {
        free(realtime_conversation_item->output);
        realtime_conversation_item->output = NULL;
    }
    free(realtime_conversation_item);
}

cJSON *realtime_conversation_item_convertToJSON(realtime_conversation_item_t *realtime_conversation_item) {
    cJSON *item = cJSON_CreateObject();

    // realtime_conversation_item->id
    if(realtime_conversation_item->id) {
    if(cJSON_AddStringToObject(item, "id", realtime_conversation_item->id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_conversation_item->type
    if(realtime_conversation_item->type != openai_api_realtime_conversation_item_TYPE_NULL) {
    if(cJSON_AddStringToObject(item, "type", realtime_conversation_item_type_ToString(realtime_conversation_item->type)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_conversation_item->object
    if(realtime_conversation_item->object != openai_api_realtime_conversation_item_OBJECT_NULL) {
    if(cJSON_AddStringToObject(item, "object", realtime_conversation_item_object_ToString(realtime_conversation_item->object)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_conversation_item->status
    if(realtime_conversation_item->status != openai_api_realtime_conversation_item_STATUS_NULL) {
    if(cJSON_AddStringToObject(item, "status", realtime_conversation_item_status_ToString(realtime_conversation_item->status)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_conversation_item->role
    if(realtime_conversation_item->role != openai_api_realtime_conversation_item_ROLE_NULL) {
    if(cJSON_AddStringToObject(item, "role", realtime_conversation_item_role_ToString(realtime_conversation_item->role)) == NULL)
    {
    goto fail; //Enum
    }
    }


    // realtime_conversation_item->content
    if(realtime_conversation_item->content) {
    cJSON *content = cJSON_AddArrayToObject(item, "content");
    if(content == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *contentListEntry;
    if (realtime_conversation_item->content) {
    list_ForEach(contentListEntry, realtime_conversation_item->content) {
    cJSON *itemLocal = realtime_conversation_item_content_inner_convertToJSON(contentListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(content, itemLocal);
    }
    }
    }


    // realtime_conversation_item->call_id
    if(realtime_conversation_item->call_id) {
    if(cJSON_AddStringToObject(item, "call_id", realtime_conversation_item->call_id) == NULL) {
    goto fail; //String
    }
    }


    // realtime_conversation_item->name
    if(realtime_conversation_item->name) {
    if(cJSON_AddStringToObject(item, "name", realtime_conversation_item->name) == NULL) {
    goto fail; //String
    }
    }


    // realtime_conversation_item->arguments
    if(realtime_conversation_item->arguments) {
    if(cJSON_AddStringToObject(item, "arguments", realtime_conversation_item->arguments) == NULL) {
    goto fail; //String
    }
    }


    // realtime_conversation_item->output
    if(realtime_conversation_item->output) {
    if(cJSON_AddStringToObject(item, "output", realtime_conversation_item->output) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

realtime_conversation_item_t *realtime_conversation_item_parseFromJSON(cJSON *realtime_conversation_itemJSON){

    realtime_conversation_item_t *realtime_conversation_item_local_var = NULL;

    // define the local list for realtime_conversation_item->content
    list_t *contentList = NULL;

    // realtime_conversation_item->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(realtime_conversation_itemJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // realtime_conversation_item->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(realtime_conversation_itemJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    openai_api_realtime_conversation_item_TYPE_e typeVariable;
    if (type) { 
    if(!cJSON_IsString(type))
    {
    goto end; //Enum
    }
    typeVariable = realtime_conversation_item_type_FromString(type->valuestring);
    }

    // realtime_conversation_item->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(realtime_conversation_itemJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    openai_api_realtime_conversation_item_OBJECT_e objectVariable;
    if (object) { 
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = realtime_conversation_item_object_FromString(object->valuestring);
    }

    // realtime_conversation_item->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(realtime_conversation_itemJSON, "status");
    if (cJSON_IsNull(status)) {
        status = NULL;
    }
    openai_api_realtime_conversation_item_STATUS_e statusVariable;
    if (status) { 
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = realtime_conversation_item_status_FromString(status->valuestring);
    }

    // realtime_conversation_item->role
    cJSON *role = cJSON_GetObjectItemCaseSensitive(realtime_conversation_itemJSON, "role");
    if (cJSON_IsNull(role)) {
        role = NULL;
    }
    openai_api_realtime_conversation_item_ROLE_e roleVariable;
    if (role) { 
    if(!cJSON_IsString(role))
    {
    goto end; //Enum
    }
    roleVariable = realtime_conversation_item_role_FromString(role->valuestring);
    }

    // realtime_conversation_item->content
    cJSON *content = cJSON_GetObjectItemCaseSensitive(realtime_conversation_itemJSON, "content");
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
        realtime_conversation_item_content_inner_t *contentItem = realtime_conversation_item_content_inner_parseFromJSON(content_local_nonprimitive);

        list_addElement(contentList, contentItem);
    }
    }

    // realtime_conversation_item->call_id
    cJSON *call_id = cJSON_GetObjectItemCaseSensitive(realtime_conversation_itemJSON, "call_id");
    if (cJSON_IsNull(call_id)) {
        call_id = NULL;
    }
    if (call_id) { 
    if(!cJSON_IsString(call_id) && !cJSON_IsNull(call_id))
    {
    goto end; //String
    }
    }

    // realtime_conversation_item->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(realtime_conversation_itemJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // realtime_conversation_item->arguments
    cJSON *arguments = cJSON_GetObjectItemCaseSensitive(realtime_conversation_itemJSON, "arguments");
    if (cJSON_IsNull(arguments)) {
        arguments = NULL;
    }
    if (arguments) { 
    if(!cJSON_IsString(arguments) && !cJSON_IsNull(arguments))
    {
    goto end; //String
    }
    }

    // realtime_conversation_item->output
    cJSON *output = cJSON_GetObjectItemCaseSensitive(realtime_conversation_itemJSON, "output");
    if (cJSON_IsNull(output)) {
        output = NULL;
    }
    if (output) { 
    if(!cJSON_IsString(output) && !cJSON_IsNull(output))
    {
    goto end; //String
    }
    }


    realtime_conversation_item_local_var = realtime_conversation_item_create_internal (
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        type ? typeVariable : openai_api_realtime_conversation_item_TYPE_NULL,
        object ? objectVariable : openai_api_realtime_conversation_item_OBJECT_NULL,
        status ? statusVariable : openai_api_realtime_conversation_item_STATUS_NULL,
        role ? roleVariable : openai_api_realtime_conversation_item_ROLE_NULL,
        content ? contentList : NULL,
        call_id && !cJSON_IsNull(call_id) ? strdup(call_id->valuestring) : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        arguments && !cJSON_IsNull(arguments) ? strdup(arguments->valuestring) : NULL,
        output && !cJSON_IsNull(output) ? strdup(output->valuestring) : NULL
        );

    return realtime_conversation_item_local_var;
end:
    if (contentList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, contentList) {
            realtime_conversation_item_content_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(contentList);
        contentList = NULL;
    }
    return NULL;

}
