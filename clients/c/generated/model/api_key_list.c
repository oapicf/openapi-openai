#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "api_key_list.h"



static api_key_list_t *api_key_list_create_internal(
    char *object,
    list_t *data,
    int has_more,
    char *first_id,
    char *last_id
    ) {
    api_key_list_t *api_key_list_local_var = malloc(sizeof(api_key_list_t));
    if (!api_key_list_local_var) {
        return NULL;
    }
    api_key_list_local_var->object = object;
    api_key_list_local_var->data = data;
    api_key_list_local_var->has_more = has_more;
    api_key_list_local_var->first_id = first_id;
    api_key_list_local_var->last_id = last_id;

    api_key_list_local_var->_library_owned = 1;
    return api_key_list_local_var;
}

__attribute__((deprecated)) api_key_list_t *api_key_list_create(
    char *object,
    list_t *data,
    int has_more,
    char *first_id,
    char *last_id
    ) {
    return api_key_list_create_internal (
        object,
        data,
        has_more,
        first_id,
        last_id
        );
}

void api_key_list_free(api_key_list_t *api_key_list) {
    if(NULL == api_key_list){
        return ;
    }
    if(api_key_list->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "api_key_list_free");
        return ;
    }
    listEntry_t *listEntry;
    if (api_key_list->object) {
        free(api_key_list->object);
        api_key_list->object = NULL;
    }
    if (api_key_list->data) {
        list_ForEach(listEntry, api_key_list->data) {
            admin_api_key_free(listEntry->data);
        }
        list_freeList(api_key_list->data);
        api_key_list->data = NULL;
    }
    if (api_key_list->first_id) {
        free(api_key_list->first_id);
        api_key_list->first_id = NULL;
    }
    if (api_key_list->last_id) {
        free(api_key_list->last_id);
        api_key_list->last_id = NULL;
    }
    free(api_key_list);
}

cJSON *api_key_list_convertToJSON(api_key_list_t *api_key_list) {
    cJSON *item = cJSON_CreateObject();

    // api_key_list->object
    if(api_key_list->object) {
    if(cJSON_AddStringToObject(item, "object", api_key_list->object) == NULL) {
    goto fail; //String
    }
    }


    // api_key_list->data
    if(api_key_list->data) {
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (api_key_list->data) {
    list_ForEach(dataListEntry, api_key_list->data) {
    cJSON *itemLocal = admin_api_key_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }
    }


    // api_key_list->has_more
    if(api_key_list->has_more) {
    if(cJSON_AddBoolToObject(item, "has_more", api_key_list->has_more) == NULL) {
    goto fail; //Bool
    }
    }


    // api_key_list->first_id
    if(api_key_list->first_id) {
    if(cJSON_AddStringToObject(item, "first_id", api_key_list->first_id) == NULL) {
    goto fail; //String
    }
    }


    // api_key_list->last_id
    if(api_key_list->last_id) {
    if(cJSON_AddStringToObject(item, "last_id", api_key_list->last_id) == NULL) {
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

api_key_list_t *api_key_list_parseFromJSON(cJSON *api_key_listJSON){

    api_key_list_t *api_key_list_local_var = NULL;

    // define the local list for api_key_list->data
    list_t *dataList = NULL;

    // api_key_list->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(api_key_listJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (object) { 
    if(!cJSON_IsString(object) && !cJSON_IsNull(object))
    {
    goto end; //String
    }
    }

    // api_key_list->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(api_key_listJSON, "data");
    if (cJSON_IsNull(data)) {
        data = NULL;
    }
    if (data) { 
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
        admin_api_key_t *dataItem = admin_api_key_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }
    }

    // api_key_list->has_more
    cJSON *has_more = cJSON_GetObjectItemCaseSensitive(api_key_listJSON, "has_more");
    if (cJSON_IsNull(has_more)) {
        has_more = NULL;
    }
    if (has_more) { 
    if(!cJSON_IsBool(has_more))
    {
    goto end; //Bool
    }
    }

    // api_key_list->first_id
    cJSON *first_id = cJSON_GetObjectItemCaseSensitive(api_key_listJSON, "first_id");
    if (cJSON_IsNull(first_id)) {
        first_id = NULL;
    }
    if (first_id) { 
    if(!cJSON_IsString(first_id) && !cJSON_IsNull(first_id))
    {
    goto end; //String
    }
    }

    // api_key_list->last_id
    cJSON *last_id = cJSON_GetObjectItemCaseSensitive(api_key_listJSON, "last_id");
    if (cJSON_IsNull(last_id)) {
        last_id = NULL;
    }
    if (last_id) { 
    if(!cJSON_IsString(last_id) && !cJSON_IsNull(last_id))
    {
    goto end; //String
    }
    }


    api_key_list_local_var = api_key_list_create_internal (
        object && !cJSON_IsNull(object) ? strdup(object->valuestring) : NULL,
        data ? dataList : NULL,
        has_more ? has_more->valueint : 0,
        first_id && !cJSON_IsNull(first_id) ? strdup(first_id->valuestring) : NULL,
        last_id && !cJSON_IsNull(last_id) ? strdup(last_id->valuestring) : NULL
        );

    return api_key_list_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            admin_api_key_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
