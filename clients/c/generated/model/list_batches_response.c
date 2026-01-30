#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "list_batches_response.h"


char* list_batches_response_object_ToString(openai_api_list_batches_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "list" };
    return objectArray[object];
}

openai_api_list_batches_response_OBJECT_e list_batches_response_object_FromString(char* object){
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

static list_batches_response_t *list_batches_response_create_internal(
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more,
    openai_api_list_batches_response_OBJECT_e object
    ) {
    list_batches_response_t *list_batches_response_local_var = malloc(sizeof(list_batches_response_t));
    if (!list_batches_response_local_var) {
        return NULL;
    }
    list_batches_response_local_var->data = data;
    list_batches_response_local_var->first_id = first_id;
    list_batches_response_local_var->last_id = last_id;
    list_batches_response_local_var->has_more = has_more;
    list_batches_response_local_var->object = object;

    list_batches_response_local_var->_library_owned = 1;
    return list_batches_response_local_var;
}

__attribute__((deprecated)) list_batches_response_t *list_batches_response_create(
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more,
    openai_api_list_batches_response_OBJECT_e object
    ) {
    return list_batches_response_create_internal (
        data,
        first_id,
        last_id,
        has_more,
        object
        );
}

void list_batches_response_free(list_batches_response_t *list_batches_response) {
    if(NULL == list_batches_response){
        return ;
    }
    if(list_batches_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "list_batches_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (list_batches_response->data) {
        list_ForEach(listEntry, list_batches_response->data) {
            batch_free(listEntry->data);
        }
        list_freeList(list_batches_response->data);
        list_batches_response->data = NULL;
    }
    if (list_batches_response->first_id) {
        free(list_batches_response->first_id);
        list_batches_response->first_id = NULL;
    }
    if (list_batches_response->last_id) {
        free(list_batches_response->last_id);
        list_batches_response->last_id = NULL;
    }
    free(list_batches_response);
}

cJSON *list_batches_response_convertToJSON(list_batches_response_t *list_batches_response) {
    cJSON *item = cJSON_CreateObject();

    // list_batches_response->data
    if (!list_batches_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (list_batches_response->data) {
    list_ForEach(dataListEntry, list_batches_response->data) {
    cJSON *itemLocal = batch_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }


    // list_batches_response->first_id
    if(list_batches_response->first_id) {
    if(cJSON_AddStringToObject(item, "first_id", list_batches_response->first_id) == NULL) {
    goto fail; //String
    }
    }


    // list_batches_response->last_id
    if(list_batches_response->last_id) {
    if(cJSON_AddStringToObject(item, "last_id", list_batches_response->last_id) == NULL) {
    goto fail; //String
    }
    }


    // list_batches_response->has_more
    if (!list_batches_response->has_more) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "has_more", list_batches_response->has_more) == NULL) {
    goto fail; //Bool
    }


    // list_batches_response->object
    if (openai_api_list_batches_response_OBJECT_NULL == list_batches_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", list_batches_response_object_ToString(list_batches_response->object)) == NULL)
    {
    goto fail; //Enum
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

list_batches_response_t *list_batches_response_parseFromJSON(cJSON *list_batches_responseJSON){

    list_batches_response_t *list_batches_response_local_var = NULL;

    // define the local list for list_batches_response->data
    list_t *dataList = NULL;

    // list_batches_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(list_batches_responseJSON, "data");
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
        batch_t *dataItem = batch_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }

    // list_batches_response->first_id
    cJSON *first_id = cJSON_GetObjectItemCaseSensitive(list_batches_responseJSON, "first_id");
    if (cJSON_IsNull(first_id)) {
        first_id = NULL;
    }
    if (first_id) { 
    if(!cJSON_IsString(first_id) && !cJSON_IsNull(first_id))
    {
    goto end; //String
    }
    }

    // list_batches_response->last_id
    cJSON *last_id = cJSON_GetObjectItemCaseSensitive(list_batches_responseJSON, "last_id");
    if (cJSON_IsNull(last_id)) {
        last_id = NULL;
    }
    if (last_id) { 
    if(!cJSON_IsString(last_id) && !cJSON_IsNull(last_id))
    {
    goto end; //String
    }
    }

    // list_batches_response->has_more
    cJSON *has_more = cJSON_GetObjectItemCaseSensitive(list_batches_responseJSON, "has_more");
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

    // list_batches_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(list_batches_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_list_batches_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = list_batches_response_object_FromString(object->valuestring);


    list_batches_response_local_var = list_batches_response_create_internal (
        dataList,
        first_id && !cJSON_IsNull(first_id) ? strdup(first_id->valuestring) : NULL,
        last_id && !cJSON_IsNull(last_id) ? strdup(last_id->valuestring) : NULL,
        has_more->valueint,
        objectVariable
        );

    return list_batches_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            batch_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
