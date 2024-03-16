#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "images_response.h"



images_response_t *images_response_create(
    int created,
    list_t *data
    ) {
    images_response_t *images_response_local_var = malloc(sizeof(images_response_t));
    if (!images_response_local_var) {
        return NULL;
    }
    images_response_local_var->created = created;
    images_response_local_var->data = data;

    return images_response_local_var;
}


void images_response_free(images_response_t *images_response) {
    if(NULL == images_response){
        return ;
    }
    listEntry_t *listEntry;
    if (images_response->data) {
        list_ForEach(listEntry, images_response->data) {
            images_response_data_inner_free(listEntry->data);
        }
        list_freeList(images_response->data);
        images_response->data = NULL;
    }
    free(images_response);
}

cJSON *images_response_convertToJSON(images_response_t *images_response) {
    cJSON *item = cJSON_CreateObject();

    // images_response->created
    if (!images_response->created) {
        goto fail;
    }
    if(cJSON_AddNumberToObject(item, "created", images_response->created) == NULL) {
    goto fail; //Numeric
    }


    // images_response->data
    if (!images_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (images_response->data) {
    list_ForEach(dataListEntry, images_response->data) {
    cJSON *itemLocal = images_response_data_inner_convertToJSON(dataListEntry->data);
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

images_response_t *images_response_parseFromJSON(cJSON *images_responseJSON){

    images_response_t *images_response_local_var = NULL;

    // define the local list for images_response->data
    list_t *dataList = NULL;

    // images_response->created
    cJSON *created = cJSON_GetObjectItemCaseSensitive(images_responseJSON, "created");
    if (!created) {
        goto end;
    }

    
    if(!cJSON_IsNumber(created))
    {
    goto end; //Numeric
    }

    // images_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(images_responseJSON, "data");
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
        images_response_data_inner_t *dataItem = images_response_data_inner_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }


    images_response_local_var = images_response_create (
        created->valuedouble,
        dataList
        );

    return images_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            images_response_data_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
