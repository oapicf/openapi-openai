#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "list_fine_tuning_job_events_response.h"


char* list_fine_tuning_job_events_response_object_ToString(openai_api_list_fine_tuning_job_events_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "list" };
    return objectArray[object];
}

openai_api_list_fine_tuning_job_events_response_OBJECT_e list_fine_tuning_job_events_response_object_FromString(char* object){
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

list_fine_tuning_job_events_response_t *list_fine_tuning_job_events_response_create(
    list_t *data,
    openai_api_list_fine_tuning_job_events_response_OBJECT_e object
    ) {
    list_fine_tuning_job_events_response_t *list_fine_tuning_job_events_response_local_var = malloc(sizeof(list_fine_tuning_job_events_response_t));
    if (!list_fine_tuning_job_events_response_local_var) {
        return NULL;
    }
    list_fine_tuning_job_events_response_local_var->data = data;
    list_fine_tuning_job_events_response_local_var->object = object;

    return list_fine_tuning_job_events_response_local_var;
}


void list_fine_tuning_job_events_response_free(list_fine_tuning_job_events_response_t *list_fine_tuning_job_events_response) {
    if(NULL == list_fine_tuning_job_events_response){
        return ;
    }
    listEntry_t *listEntry;
    if (list_fine_tuning_job_events_response->data) {
        list_ForEach(listEntry, list_fine_tuning_job_events_response->data) {
            fine_tuning_job_event_free(listEntry->data);
        }
        list_freeList(list_fine_tuning_job_events_response->data);
        list_fine_tuning_job_events_response->data = NULL;
    }
    free(list_fine_tuning_job_events_response);
}

cJSON *list_fine_tuning_job_events_response_convertToJSON(list_fine_tuning_job_events_response_t *list_fine_tuning_job_events_response) {
    cJSON *item = cJSON_CreateObject();

    // list_fine_tuning_job_events_response->data
    if (!list_fine_tuning_job_events_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (list_fine_tuning_job_events_response->data) {
    list_ForEach(dataListEntry, list_fine_tuning_job_events_response->data) {
    cJSON *itemLocal = fine_tuning_job_event_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }


    // list_fine_tuning_job_events_response->object
    if (openai_api_list_fine_tuning_job_events_response_OBJECT_NULL == list_fine_tuning_job_events_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", objectlist_fine_tuning_job_events_response_ToString(list_fine_tuning_job_events_response->object)) == NULL)
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

list_fine_tuning_job_events_response_t *list_fine_tuning_job_events_response_parseFromJSON(cJSON *list_fine_tuning_job_events_responseJSON){

    list_fine_tuning_job_events_response_t *list_fine_tuning_job_events_response_local_var = NULL;

    // define the local list for list_fine_tuning_job_events_response->data
    list_t *dataList = NULL;

    // list_fine_tuning_job_events_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(list_fine_tuning_job_events_responseJSON, "data");
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
        fine_tuning_job_event_t *dataItem = fine_tuning_job_event_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }

    // list_fine_tuning_job_events_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(list_fine_tuning_job_events_responseJSON, "object");
    if (!object) {
        goto end;
    }

    openai_api_list_fine_tuning_job_events_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = list_fine_tuning_job_events_response_object_FromString(object->valuestring);


    list_fine_tuning_job_events_response_local_var = list_fine_tuning_job_events_response_create (
        dataList,
        objectVariable
        );

    return list_fine_tuning_job_events_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            fine_tuning_job_event_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
