#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "list_paginated_fine_tuning_jobs_response.h"


char* list_paginated_fine_tuning_jobs_response_object_ToString(openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "list" };
    return objectArray[object];
}

openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_e list_paginated_fine_tuning_jobs_response_object_FromString(char* object){
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

static list_paginated_fine_tuning_jobs_response_t *list_paginated_fine_tuning_jobs_response_create_internal(
    list_t *data,
    int has_more,
    openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_e object
    ) {
    list_paginated_fine_tuning_jobs_response_t *list_paginated_fine_tuning_jobs_response_local_var = malloc(sizeof(list_paginated_fine_tuning_jobs_response_t));
    if (!list_paginated_fine_tuning_jobs_response_local_var) {
        return NULL;
    }
    list_paginated_fine_tuning_jobs_response_local_var->data = data;
    list_paginated_fine_tuning_jobs_response_local_var->has_more = has_more;
    list_paginated_fine_tuning_jobs_response_local_var->object = object;

    list_paginated_fine_tuning_jobs_response_local_var->_library_owned = 1;
    return list_paginated_fine_tuning_jobs_response_local_var;
}

__attribute__((deprecated)) list_paginated_fine_tuning_jobs_response_t *list_paginated_fine_tuning_jobs_response_create(
    list_t *data,
    int has_more,
    openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_e object
    ) {
    return list_paginated_fine_tuning_jobs_response_create_internal (
        data,
        has_more,
        object
        );
}

void list_paginated_fine_tuning_jobs_response_free(list_paginated_fine_tuning_jobs_response_t *list_paginated_fine_tuning_jobs_response) {
    if(NULL == list_paginated_fine_tuning_jobs_response){
        return ;
    }
    if(list_paginated_fine_tuning_jobs_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "list_paginated_fine_tuning_jobs_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (list_paginated_fine_tuning_jobs_response->data) {
        list_ForEach(listEntry, list_paginated_fine_tuning_jobs_response->data) {
            fine_tuning_job_free(listEntry->data);
        }
        list_freeList(list_paginated_fine_tuning_jobs_response->data);
        list_paginated_fine_tuning_jobs_response->data = NULL;
    }
    free(list_paginated_fine_tuning_jobs_response);
}

cJSON *list_paginated_fine_tuning_jobs_response_convertToJSON(list_paginated_fine_tuning_jobs_response_t *list_paginated_fine_tuning_jobs_response) {
    cJSON *item = cJSON_CreateObject();

    // list_paginated_fine_tuning_jobs_response->data
    if (!list_paginated_fine_tuning_jobs_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (list_paginated_fine_tuning_jobs_response->data) {
    list_ForEach(dataListEntry, list_paginated_fine_tuning_jobs_response->data) {
    cJSON *itemLocal = fine_tuning_job_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }


    // list_paginated_fine_tuning_jobs_response->has_more
    if (!list_paginated_fine_tuning_jobs_response->has_more) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "has_more", list_paginated_fine_tuning_jobs_response->has_more) == NULL) {
    goto fail; //Bool
    }


    // list_paginated_fine_tuning_jobs_response->object
    if (openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_NULL == list_paginated_fine_tuning_jobs_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", list_paginated_fine_tuning_jobs_response_object_ToString(list_paginated_fine_tuning_jobs_response->object)) == NULL)
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

list_paginated_fine_tuning_jobs_response_t *list_paginated_fine_tuning_jobs_response_parseFromJSON(cJSON *list_paginated_fine_tuning_jobs_responseJSON){

    list_paginated_fine_tuning_jobs_response_t *list_paginated_fine_tuning_jobs_response_local_var = NULL;

    // define the local list for list_paginated_fine_tuning_jobs_response->data
    list_t *dataList = NULL;

    // list_paginated_fine_tuning_jobs_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(list_paginated_fine_tuning_jobs_responseJSON, "data");
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
        fine_tuning_job_t *dataItem = fine_tuning_job_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }

    // list_paginated_fine_tuning_jobs_response->has_more
    cJSON *has_more = cJSON_GetObjectItemCaseSensitive(list_paginated_fine_tuning_jobs_responseJSON, "has_more");
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

    // list_paginated_fine_tuning_jobs_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(list_paginated_fine_tuning_jobs_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_list_paginated_fine_tuning_jobs_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = list_paginated_fine_tuning_jobs_response_object_FromString(object->valuestring);


    list_paginated_fine_tuning_jobs_response_local_var = list_paginated_fine_tuning_jobs_response_create_internal (
        dataList,
        has_more->valueint,
        objectVariable
        );

    return list_paginated_fine_tuning_jobs_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            fine_tuning_job_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
