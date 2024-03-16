#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "list_fine_tunes_response.h"



list_fine_tunes_response_t *list_fine_tunes_response_create(
    char *object,
    list_t *data
    ) {
    list_fine_tunes_response_t *list_fine_tunes_response_local_var = malloc(sizeof(list_fine_tunes_response_t));
    if (!list_fine_tunes_response_local_var) {
        return NULL;
    }
    list_fine_tunes_response_local_var->object = object;
    list_fine_tunes_response_local_var->data = data;

    return list_fine_tunes_response_local_var;
}


void list_fine_tunes_response_free(list_fine_tunes_response_t *list_fine_tunes_response) {
    if(NULL == list_fine_tunes_response){
        return ;
    }
    listEntry_t *listEntry;
    if (list_fine_tunes_response->object) {
        free(list_fine_tunes_response->object);
        list_fine_tunes_response->object = NULL;
    }
    if (list_fine_tunes_response->data) {
        list_ForEach(listEntry, list_fine_tunes_response->data) {
            fine_tune_free(listEntry->data);
        }
        list_freeList(list_fine_tunes_response->data);
        list_fine_tunes_response->data = NULL;
    }
    free(list_fine_tunes_response);
}

cJSON *list_fine_tunes_response_convertToJSON(list_fine_tunes_response_t *list_fine_tunes_response) {
    cJSON *item = cJSON_CreateObject();

    // list_fine_tunes_response->object
    if (!list_fine_tunes_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", list_fine_tunes_response->object) == NULL) {
    goto fail; //String
    }


    // list_fine_tunes_response->data
    if (!list_fine_tunes_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (list_fine_tunes_response->data) {
    list_ForEach(dataListEntry, list_fine_tunes_response->data) {
    cJSON *itemLocal = fine_tune_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

list_fine_tunes_response_t *list_fine_tunes_response_parseFromJSON(cJSON *list_fine_tunes_responseJSON){

    list_fine_tunes_response_t *list_fine_tunes_response_local_var = NULL;

    // define the local list for list_fine_tunes_response->data
    list_t *dataList = NULL;

    // list_fine_tunes_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(list_fine_tunes_responseJSON, "object");
    if (!object) {
        goto end;
    }

    
    if(!cJSON_IsString(object))
    {
    goto end; //String
    }

    // list_fine_tunes_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(list_fine_tunes_responseJSON, "data");
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
        fine_tune_t *dataItem = fine_tune_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }


    list_fine_tunes_response_local_var = list_fine_tunes_response_create (
        strdup(object->valuestring),
        dataList
        );

    return list_fine_tunes_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            fine_tune_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
