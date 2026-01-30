#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_errors.h"



static batch_errors_t *batch_errors_create_internal(
    char *object,
    list_t *data
    ) {
    batch_errors_t *batch_errors_local_var = malloc(sizeof(batch_errors_t));
    if (!batch_errors_local_var) {
        return NULL;
    }
    batch_errors_local_var->object = object;
    batch_errors_local_var->data = data;

    batch_errors_local_var->_library_owned = 1;
    return batch_errors_local_var;
}

__attribute__((deprecated)) batch_errors_t *batch_errors_create(
    char *object,
    list_t *data
    ) {
    return batch_errors_create_internal (
        object,
        data
        );
}

void batch_errors_free(batch_errors_t *batch_errors) {
    if(NULL == batch_errors){
        return ;
    }
    if(batch_errors->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "batch_errors_free");
        return ;
    }
    listEntry_t *listEntry;
    if (batch_errors->object) {
        free(batch_errors->object);
        batch_errors->object = NULL;
    }
    if (batch_errors->data) {
        list_ForEach(listEntry, batch_errors->data) {
            batch_errors_data_inner_free(listEntry->data);
        }
        list_freeList(batch_errors->data);
        batch_errors->data = NULL;
    }
    free(batch_errors);
}

cJSON *batch_errors_convertToJSON(batch_errors_t *batch_errors) {
    cJSON *item = cJSON_CreateObject();

    // batch_errors->object
    if(batch_errors->object) {
    if(cJSON_AddStringToObject(item, "object", batch_errors->object) == NULL) {
    goto fail; //String
    }
    }


    // batch_errors->data
    if(batch_errors->data) {
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (batch_errors->data) {
    list_ForEach(dataListEntry, batch_errors->data) {
    cJSON *itemLocal = batch_errors_data_inner_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
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

batch_errors_t *batch_errors_parseFromJSON(cJSON *batch_errorsJSON){

    batch_errors_t *batch_errors_local_var = NULL;

    // define the local list for batch_errors->data
    list_t *dataList = NULL;

    // batch_errors->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(batch_errorsJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (object) { 
    if(!cJSON_IsString(object) && !cJSON_IsNull(object))
    {
    goto end; //String
    }
    }

    // batch_errors->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(batch_errorsJSON, "data");
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
        batch_errors_data_inner_t *dataItem = batch_errors_data_inner_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }
    }


    batch_errors_local_var = batch_errors_create_internal (
        object && !cJSON_IsNull(object) ? strdup(object->valuestring) : NULL,
        data ? dataList : NULL
        );

    return batch_errors_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            batch_errors_data_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
