#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "list_message_files_response.h"



static list_message_files_response_t *list_message_files_response_create_internal(
    char *object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
    ) {
    list_message_files_response_t *list_message_files_response_local_var = malloc(sizeof(list_message_files_response_t));
    if (!list_message_files_response_local_var) {
        return NULL;
    }
    list_message_files_response_local_var->object = object;
    list_message_files_response_local_var->data = data;
    list_message_files_response_local_var->first_id = first_id;
    list_message_files_response_local_var->last_id = last_id;
    list_message_files_response_local_var->has_more = has_more;

    list_message_files_response_local_var->_library_owned = 1;
    return list_message_files_response_local_var;
}

__attribute__((deprecated)) list_message_files_response_t *list_message_files_response_create(
    char *object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
    ) {
    return list_message_files_response_create_internal (
        object,
        data,
        first_id,
        last_id,
        has_more
        );
}

void list_message_files_response_free(list_message_files_response_t *list_message_files_response) {
    if(NULL == list_message_files_response){
        return ;
    }
    if(list_message_files_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "list_message_files_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (list_message_files_response->object) {
        free(list_message_files_response->object);
        list_message_files_response->object = NULL;
    }
    if (list_message_files_response->data) {
        list_ForEach(listEntry, list_message_files_response->data) {
            message_file_object_free(listEntry->data);
        }
        list_freeList(list_message_files_response->data);
        list_message_files_response->data = NULL;
    }
    if (list_message_files_response->first_id) {
        free(list_message_files_response->first_id);
        list_message_files_response->first_id = NULL;
    }
    if (list_message_files_response->last_id) {
        free(list_message_files_response->last_id);
        list_message_files_response->last_id = NULL;
    }
    free(list_message_files_response);
}

cJSON *list_message_files_response_convertToJSON(list_message_files_response_t *list_message_files_response) {
    cJSON *item = cJSON_CreateObject();

    // list_message_files_response->object
    if (!list_message_files_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", list_message_files_response->object) == NULL) {
    goto fail; //String
    }


    // list_message_files_response->data
    if (!list_message_files_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (list_message_files_response->data) {
    list_ForEach(dataListEntry, list_message_files_response->data) {
    cJSON *itemLocal = message_file_object_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }


    // list_message_files_response->first_id
    if (!list_message_files_response->first_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "first_id", list_message_files_response->first_id) == NULL) {
    goto fail; //String
    }


    // list_message_files_response->last_id
    if (!list_message_files_response->last_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "last_id", list_message_files_response->last_id) == NULL) {
    goto fail; //String
    }


    // list_message_files_response->has_more
    if (!list_message_files_response->has_more) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "has_more", list_message_files_response->has_more) == NULL) {
    goto fail; //Bool
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

list_message_files_response_t *list_message_files_response_parseFromJSON(cJSON *list_message_files_responseJSON){

    list_message_files_response_t *list_message_files_response_local_var = NULL;

    // define the local list for list_message_files_response->data
    list_t *dataList = NULL;

    // list_message_files_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(list_message_files_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    
    if(!cJSON_IsString(object))
    {
    goto end; //String
    }

    // list_message_files_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(list_message_files_responseJSON, "data");
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
        message_file_object_t *dataItem = message_file_object_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }

    // list_message_files_response->first_id
    cJSON *first_id = cJSON_GetObjectItemCaseSensitive(list_message_files_responseJSON, "first_id");
    if (cJSON_IsNull(first_id)) {
        first_id = NULL;
    }
    if (!first_id) {
        goto end;
    }

    
    if(!cJSON_IsString(first_id))
    {
    goto end; //String
    }

    // list_message_files_response->last_id
    cJSON *last_id = cJSON_GetObjectItemCaseSensitive(list_message_files_responseJSON, "last_id");
    if (cJSON_IsNull(last_id)) {
        last_id = NULL;
    }
    if (!last_id) {
        goto end;
    }

    
    if(!cJSON_IsString(last_id))
    {
    goto end; //String
    }

    // list_message_files_response->has_more
    cJSON *has_more = cJSON_GetObjectItemCaseSensitive(list_message_files_responseJSON, "has_more");
    if (cJSON_IsNull(has_more)) {
        has_more = NULL;
    }
    if (!has_more) {
        goto end;
    }

    
    if(!cJSON_IsBool(has_more))
    {
    goto end; //Bool
    }


    list_message_files_response_local_var = list_message_files_response_create_internal (
        strdup(object->valuestring),
        dataList,
        strdup(first_id->valuestring),
        strdup(last_id->valuestring),
        has_more->valueint
        );

    return list_message_files_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            message_file_object_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
