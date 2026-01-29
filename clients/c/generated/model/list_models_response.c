#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "list_models_response.h"


char* list_models_response_object_ToString(openai_api_list_models_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "list" };
    return objectArray[object];
}

openai_api_list_models_response_OBJECT_e list_models_response_object_FromString(char* object){
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

static list_models_response_t *list_models_response_create_internal(
    openai_api_list_models_response_OBJECT_e object,
    list_t *data
    ) {
    list_models_response_t *list_models_response_local_var = malloc(sizeof(list_models_response_t));
    if (!list_models_response_local_var) {
        return NULL;
    }
    list_models_response_local_var->object = object;
    list_models_response_local_var->data = data;

    list_models_response_local_var->_library_owned = 1;
    return list_models_response_local_var;
}

__attribute__((deprecated)) list_models_response_t *list_models_response_create(
    openai_api_list_models_response_OBJECT_e object,
    list_t *data
    ) {
    return list_models_response_create_internal (
        object,
        data
        );
}

void list_models_response_free(list_models_response_t *list_models_response) {
    if(NULL == list_models_response){
        return ;
    }
    if(list_models_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "list_models_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (list_models_response->data) {
        list_ForEach(listEntry, list_models_response->data) {
            model_free(listEntry->data);
        }
        list_freeList(list_models_response->data);
        list_models_response->data = NULL;
    }
    free(list_models_response);
}

cJSON *list_models_response_convertToJSON(list_models_response_t *list_models_response) {
    cJSON *item = cJSON_CreateObject();

    // list_models_response->object
    if (openai_api_list_models_response_OBJECT_NULL == list_models_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", list_models_response_object_ToString(list_models_response->object)) == NULL)
    {
    goto fail; //Enum
    }


    // list_models_response->data
    if (!list_models_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (list_models_response->data) {
    list_ForEach(dataListEntry, list_models_response->data) {
    cJSON *itemLocal = model_convertToJSON(dataListEntry->data);
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

list_models_response_t *list_models_response_parseFromJSON(cJSON *list_models_responseJSON){

    list_models_response_t *list_models_response_local_var = NULL;

    // define the local list for list_models_response->data
    list_t *dataList = NULL;

    // list_models_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(list_models_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_list_models_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = list_models_response_object_FromString(object->valuestring);

    // list_models_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(list_models_responseJSON, "data");
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
        model_t *dataItem = model_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }


    list_models_response_local_var = list_models_response_create_internal (
        objectVariable,
        dataList
        );

    return list_models_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            model_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
