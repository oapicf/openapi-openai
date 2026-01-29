#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "list_files_response.h"


char* list_files_response_object_ToString(openai_api_list_files_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "list" };
    return objectArray[object];
}

openai_api_list_files_response_OBJECT_e list_files_response_object_FromString(char* object){
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

static list_files_response_t *list_files_response_create_internal(
    list_t *data,
    openai_api_list_files_response_OBJECT_e object
    ) {
    list_files_response_t *list_files_response_local_var = malloc(sizeof(list_files_response_t));
    if (!list_files_response_local_var) {
        return NULL;
    }
    list_files_response_local_var->data = data;
    list_files_response_local_var->object = object;

    list_files_response_local_var->_library_owned = 1;
    return list_files_response_local_var;
}

__attribute__((deprecated)) list_files_response_t *list_files_response_create(
    list_t *data,
    openai_api_list_files_response_OBJECT_e object
    ) {
    return list_files_response_create_internal (
        data,
        object
        );
}

void list_files_response_free(list_files_response_t *list_files_response) {
    if(NULL == list_files_response){
        return ;
    }
    if(list_files_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "list_files_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (list_files_response->data) {
        list_ForEach(listEntry, list_files_response->data) {
            open_ai_file_free(listEntry->data);
        }
        list_freeList(list_files_response->data);
        list_files_response->data = NULL;
    }
    free(list_files_response);
}

cJSON *list_files_response_convertToJSON(list_files_response_t *list_files_response) {
    cJSON *item = cJSON_CreateObject();

    // list_files_response->data
    if (!list_files_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (list_files_response->data) {
    list_ForEach(dataListEntry, list_files_response->data) {
    cJSON *itemLocal = open_ai_file_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }


    // list_files_response->object
    if (openai_api_list_files_response_OBJECT_NULL == list_files_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", list_files_response_object_ToString(list_files_response->object)) == NULL)
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

list_files_response_t *list_files_response_parseFromJSON(cJSON *list_files_responseJSON){

    list_files_response_t *list_files_response_local_var = NULL;

    // define the local list for list_files_response->data
    list_t *dataList = NULL;

    // list_files_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(list_files_responseJSON, "data");
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
        open_ai_file_t *dataItem = open_ai_file_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }

    // list_files_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(list_files_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_list_files_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = list_files_response_object_FromString(object->valuestring);


    list_files_response_local_var = list_files_response_create_internal (
        dataList,
        objectVariable
        );

    return list_files_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            open_ai_file_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
