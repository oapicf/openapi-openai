#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "list_assistants_response.h"



list_assistants_response_t *list_assistants_response_create(
    char *object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
    ) {
    list_assistants_response_t *list_assistants_response_local_var = malloc(sizeof(list_assistants_response_t));
    if (!list_assistants_response_local_var) {
        return NULL;
    }
    list_assistants_response_local_var->object = object;
    list_assistants_response_local_var->data = data;
    list_assistants_response_local_var->first_id = first_id;
    list_assistants_response_local_var->last_id = last_id;
    list_assistants_response_local_var->has_more = has_more;

    return list_assistants_response_local_var;
}


void list_assistants_response_free(list_assistants_response_t *list_assistants_response) {
    if(NULL == list_assistants_response){
        return ;
    }
    listEntry_t *listEntry;
    if (list_assistants_response->object) {
        free(list_assistants_response->object);
        list_assistants_response->object = NULL;
    }
    if (list_assistants_response->data) {
        list_ForEach(listEntry, list_assistants_response->data) {
            assistant_object_free(listEntry->data);
        }
        list_freeList(list_assistants_response->data);
        list_assistants_response->data = NULL;
    }
    if (list_assistants_response->first_id) {
        free(list_assistants_response->first_id);
        list_assistants_response->first_id = NULL;
    }
    if (list_assistants_response->last_id) {
        free(list_assistants_response->last_id);
        list_assistants_response->last_id = NULL;
    }
    free(list_assistants_response);
}

cJSON *list_assistants_response_convertToJSON(list_assistants_response_t *list_assistants_response) {
    cJSON *item = cJSON_CreateObject();

    // list_assistants_response->object
    if (!list_assistants_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", list_assistants_response->object) == NULL) {
    goto fail; //String
    }


    // list_assistants_response->data
    if (!list_assistants_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (list_assistants_response->data) {
    list_ForEach(dataListEntry, list_assistants_response->data) {
    cJSON *itemLocal = assistant_object_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }


    // list_assistants_response->first_id
    if (!list_assistants_response->first_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "first_id", list_assistants_response->first_id) == NULL) {
    goto fail; //String
    }


    // list_assistants_response->last_id
    if (!list_assistants_response->last_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "last_id", list_assistants_response->last_id) == NULL) {
    goto fail; //String
    }


    // list_assistants_response->has_more
    if (!list_assistants_response->has_more) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "has_more", list_assistants_response->has_more) == NULL) {
    goto fail; //Bool
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

list_assistants_response_t *list_assistants_response_parseFromJSON(cJSON *list_assistants_responseJSON){

    list_assistants_response_t *list_assistants_response_local_var = NULL;

    // define the local list for list_assistants_response->data
    list_t *dataList = NULL;

    // list_assistants_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(list_assistants_responseJSON, "object");
    if (!object) {
        goto end;
    }

    
    if(!cJSON_IsString(object))
    {
    goto end; //String
    }

    // list_assistants_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(list_assistants_responseJSON, "data");
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
        assistant_object_t *dataItem = assistant_object_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }

    // list_assistants_response->first_id
    cJSON *first_id = cJSON_GetObjectItemCaseSensitive(list_assistants_responseJSON, "first_id");
    if (!first_id) {
        goto end;
    }

    
    if(!cJSON_IsString(first_id))
    {
    goto end; //String
    }

    // list_assistants_response->last_id
    cJSON *last_id = cJSON_GetObjectItemCaseSensitive(list_assistants_responseJSON, "last_id");
    if (!last_id) {
        goto end;
    }

    
    if(!cJSON_IsString(last_id))
    {
    goto end; //String
    }

    // list_assistants_response->has_more
    cJSON *has_more = cJSON_GetObjectItemCaseSensitive(list_assistants_responseJSON, "has_more");
    if (!has_more) {
        goto end;
    }

    
    if(!cJSON_IsBool(has_more))
    {
    goto end; //Bool
    }


    list_assistants_response_local_var = list_assistants_response_create (
        strdup(object->valuestring),
        dataList,
        strdup(first_id->valuestring),
        strdup(last_id->valuestring),
        has_more->valueint
        );

    return list_assistants_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            assistant_object_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
