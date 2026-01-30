#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "usage_response.h"


char* usage_response_object_ToString(openai_api_usage_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "page" };
    return objectArray[object];
}

openai_api_usage_response_OBJECT_e usage_response_object_FromString(char* object){
    int stringToReturn = 0;
    char *objectArray[] =  { "NULL", "page" };
    size_t sizeofArray = sizeof(objectArray) / sizeof(objectArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(object, objectArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

static usage_response_t *usage_response_create_internal(
    openai_api_usage_response_OBJECT_e object,
    list_t *data,
    int has_more,
    char *next_page
    ) {
    usage_response_t *usage_response_local_var = malloc(sizeof(usage_response_t));
    if (!usage_response_local_var) {
        return NULL;
    }
    usage_response_local_var->object = object;
    usage_response_local_var->data = data;
    usage_response_local_var->has_more = has_more;
    usage_response_local_var->next_page = next_page;

    usage_response_local_var->_library_owned = 1;
    return usage_response_local_var;
}

__attribute__((deprecated)) usage_response_t *usage_response_create(
    openai_api_usage_response_OBJECT_e object,
    list_t *data,
    int has_more,
    char *next_page
    ) {
    return usage_response_create_internal (
        object,
        data,
        has_more,
        next_page
        );
}

void usage_response_free(usage_response_t *usage_response) {
    if(NULL == usage_response){
        return ;
    }
    if(usage_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "usage_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (usage_response->data) {
        list_ForEach(listEntry, usage_response->data) {
            usage_time_bucket_free(listEntry->data);
        }
        list_freeList(usage_response->data);
        usage_response->data = NULL;
    }
    if (usage_response->next_page) {
        free(usage_response->next_page);
        usage_response->next_page = NULL;
    }
    free(usage_response);
}

cJSON *usage_response_convertToJSON(usage_response_t *usage_response) {
    cJSON *item = cJSON_CreateObject();

    // usage_response->object
    if (openai_api_usage_response_OBJECT_NULL == usage_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", usage_response_object_ToString(usage_response->object)) == NULL)
    {
    goto fail; //Enum
    }


    // usage_response->data
    if (!usage_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (usage_response->data) {
    list_ForEach(dataListEntry, usage_response->data) {
    cJSON *itemLocal = usage_time_bucket_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }


    // usage_response->has_more
    if (!usage_response->has_more) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "has_more", usage_response->has_more) == NULL) {
    goto fail; //Bool
    }


    // usage_response->next_page
    if (!usage_response->next_page) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "next_page", usage_response->next_page) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

usage_response_t *usage_response_parseFromJSON(cJSON *usage_responseJSON){

    usage_response_t *usage_response_local_var = NULL;

    // define the local list for usage_response->data
    list_t *dataList = NULL;

    // usage_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(usage_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_usage_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = usage_response_object_FromString(object->valuestring);

    // usage_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(usage_responseJSON, "data");
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
        usage_time_bucket_t *dataItem = usage_time_bucket_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }

    // usage_response->has_more
    cJSON *has_more = cJSON_GetObjectItemCaseSensitive(usage_responseJSON, "has_more");
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

    // usage_response->next_page
    cJSON *next_page = cJSON_GetObjectItemCaseSensitive(usage_responseJSON, "next_page");
    if (cJSON_IsNull(next_page)) {
        next_page = NULL;
    }
    if (!next_page) {
        goto end;
    }

    
    if(!cJSON_IsString(next_page))
    {
    goto end; //String
    }


    usage_response_local_var = usage_response_create_internal (
        objectVariable,
        dataList,
        has_more->valueint,
        strdup(next_page->valuestring)
        );

    return usage_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            usage_time_bucket_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
