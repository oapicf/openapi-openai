#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "invite_list_response.h"


char* invite_list_response_object_ToString(openai_api_invite_list_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "list" };
    return objectArray[object];
}

openai_api_invite_list_response_OBJECT_e invite_list_response_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "list" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static invite_list_response_t *invite_list_response_create_internal(
    openai_api_invite_list_response_OBJECT_e object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
    ) {
    invite_list_response_t *invite_list_response_local_var = malloc(sizeof(invite_list_response_t));
    if (!invite_list_response_local_var) {
        return NULL;
    }
    invite_list_response_local_var->object = object;
    invite_list_response_local_var->data = data;
    invite_list_response_local_var->first_id = first_id;
    invite_list_response_local_var->last_id = last_id;
    invite_list_response_local_var->has_more = has_more;

    invite_list_response_local_var->_library_owned = 1;
    return invite_list_response_local_var;
}

__attribute__((deprecated)) invite_list_response_t *invite_list_response_create(
    openai_api_invite_list_response_OBJECT_e object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
    ) {
    return invite_list_response_create_internal (
        object,
        data,
        first_id,
        last_id,
        has_more
        );
}

void invite_list_response_free(invite_list_response_t *invite_list_response) {
    if(NULL == invite_list_response){
        return ;
    }
    if(invite_list_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "invite_list_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (invite_list_response->data) {
        list_ForEach(listEntry, invite_list_response->data) {
            invite_free(listEntry->data);
        }
        list_freeList(invite_list_response->data);
        invite_list_response->data = NULL;
    }
    if (invite_list_response->first_id) {
        free(invite_list_response->first_id);
        invite_list_response->first_id = NULL;
    }
    if (invite_list_response->last_id) {
        free(invite_list_response->last_id);
        invite_list_response->last_id = NULL;
    }
    free(invite_list_response);
}

cJSON *invite_list_response_convertToJSON(invite_list_response_t *invite_list_response) {
    cJSON *item = cJSON_CreateObject();

    // invite_list_response->object
    if (openai_api_invite_list_response_OBJECT_NULL == invite_list_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", invite_list_response_object_ToString(invite_list_response->object)) == NULL)
    {
    goto fail; //Enum
    }


    // invite_list_response->data
    if (!invite_list_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (invite_list_response->data) {
    list_ForEach(dataListEntry, invite_list_response->data) {
    cJSON *itemLocal = invite_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }


    // invite_list_response->first_id
    if(invite_list_response->first_id) {
    if(cJSON_AddStringToObject(item, "first_id", invite_list_response->first_id) == NULL) {
    goto fail; //String
    }
    }


    // invite_list_response->last_id
    if(invite_list_response->last_id) {
    if(cJSON_AddStringToObject(item, "last_id", invite_list_response->last_id) == NULL) {
    goto fail; //String
    }
    }


    // invite_list_response->has_more
    if(invite_list_response->has_more) {
    if(cJSON_AddBoolToObject(item, "has_more", invite_list_response->has_more) == NULL) {
    goto fail; //Bool
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

invite_list_response_t *invite_list_response_parseFromJSON(cJSON *invite_list_responseJSON){

    invite_list_response_t *invite_list_response_local_var = NULL;

    // define the local list for invite_list_response->data
    list_t *dataList = NULL;

    // invite_list_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(invite_list_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_invite_list_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = invite_list_response_object_FromString(object->valuestring);

    // invite_list_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(invite_list_responseJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (!data) {
        goto end;
    }

    
    cJSON *data_local_nonprimitive = NULL;
    if(!cJSON_IsArray(data)){
        goto end; //nonprimitive container
    }

    dataList = list_createList();

    cJSON_ArrayForEach(data_local_nonprimitive,data )
    {
        if(!cJSON_IsObject(data_local_nonprimitive)){
            goto end;
        }
        invite_t *dataItem = invite_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }

    // invite_list_response->first_id
    cJSON *first_id = cJSON_GetObjectItemCaseSensitive(invite_list_responseJSON, "first_id");
    if (cJSON_IsNull(first_id)) {
        first_id = NULL;
    }
    if (first_id) { 
    if(!cJSON_IsString(first_id) && !cJSON_IsNull(first_id))
    {
    goto end; //String
    }
    }

    // invite_list_response->last_id
    cJSON *last_id = cJSON_GetObjectItemCaseSensitive(invite_list_responseJSON, "last_id");
    if (cJSON_IsNull(last_id)) {
        last_id = NULL;
    }
    if (last_id) { 
    if(!cJSON_IsString(last_id) && !cJSON_IsNull(last_id))
    {
    goto end; //String
    }
    }

    // invite_list_response->has_more
    cJSON *has_more = cJSON_GetObjectItemCaseSensitive(invite_list_responseJSON, "has_more");
    if (cJSON_IsNull(has_more)) {
        has_more = NULL;
    }
    if (has_more) { 
    if(!cJSON_IsBool(has_more))
    {
    goto end; //Bool
    }
    }


    invite_list_response_local_var = invite_list_response_create_internal (
        objectVariable,
        dataList,
        first_id && !cJSON_IsNull(first_id) ? strdup(first_id->valuestring) : NULL,
        last_id && !cJSON_IsNull(last_id) ? strdup(last_id->valuestring) : NULL,
        has_more ? has_more->valueint : 0
        );

    return invite_list_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            invite_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
