#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_embedding_response.h"


char* create_embedding_response_object_ToString(openai_api_create_embedding_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "list" };
    return objectArray[object];
}

openai_api_create_embedding_response_OBJECT_e create_embedding_response_object_FromString(char* object){
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

create_embedding_response_t *create_embedding_response_create(
    list_t *data,
    char *model,
    openai_api_create_embedding_response_OBJECT_e object,
    create_embedding_response_usage_t *usage
    ) {
    create_embedding_response_t *create_embedding_response_local_var = malloc(sizeof(create_embedding_response_t));
    if (!create_embedding_response_local_var) {
        return NULL;
    }
    create_embedding_response_local_var->data = data;
    create_embedding_response_local_var->model = model;
    create_embedding_response_local_var->object = object;
    create_embedding_response_local_var->usage = usage;

    return create_embedding_response_local_var;
}


void create_embedding_response_free(create_embedding_response_t *create_embedding_response) {
    if(NULL == create_embedding_response){
        return ;
    }
    listEntry_t *listEntry;
    if (create_embedding_response->data) {
        list_ForEach(listEntry, create_embedding_response->data) {
            embedding_free(listEntry->data);
        }
        list_freeList(create_embedding_response->data);
        create_embedding_response->data = NULL;
    }
    if (create_embedding_response->model) {
        free(create_embedding_response->model);
        create_embedding_response->model = NULL;
    }
    if (create_embedding_response->usage) {
        create_embedding_response_usage_free(create_embedding_response->usage);
        create_embedding_response->usage = NULL;
    }
    free(create_embedding_response);
}

cJSON *create_embedding_response_convertToJSON(create_embedding_response_t *create_embedding_response) {
    cJSON *item = cJSON_CreateObject();

    // create_embedding_response->data
    if (!create_embedding_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (create_embedding_response->data) {
    list_ForEach(dataListEntry, create_embedding_response->data) {
    cJSON *itemLocal = embedding_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }


    // create_embedding_response->model
    if (!create_embedding_response->model) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "model", create_embedding_response->model) == NULL) {
    goto fail; //String
    }


    // create_embedding_response->object
    if (openai_api_create_embedding_response_OBJECT_NULL == create_embedding_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", objectcreate_embedding_response_ToString(create_embedding_response->object)) == NULL)
    {
    goto fail; //Enum
    }


    // create_embedding_response->usage
    if (!create_embedding_response->usage) {
        goto fail;
    }
    cJSON *usage_local_JSON = create_embedding_response_usage_convertToJSON(create_embedding_response->usage);
    if(usage_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "usage", usage_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_embedding_response_t *create_embedding_response_parseFromJSON(cJSON *create_embedding_responseJSON){

    create_embedding_response_t *create_embedding_response_local_var = NULL;

    // define the local list for create_embedding_response->data
    list_t *dataList = NULL;

    // define the local variable for create_embedding_response->usage
    create_embedding_response_usage_t *usage_local_nonprim = NULL;

    // create_embedding_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(create_embedding_responseJSON, "data");
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
        embedding_t *dataItem = embedding_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }

    // create_embedding_response->model
    cJSON *model = cJSON_GetObjectItemCaseSensitive(create_embedding_responseJSON, "model");
    if (!model) {
        goto end;
    }

    
    if(!cJSON_IsString(model))
    {
    goto end; //String
    }

    // create_embedding_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(create_embedding_responseJSON, "object");
    if (!object) {
        goto end;
    }

    openai_api_create_embedding_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = create_embedding_response_object_FromString(object->valuestring);

    // create_embedding_response->usage
    cJSON *usage = cJSON_GetObjectItemCaseSensitive(create_embedding_responseJSON, "usage");
    if (!usage) {
        goto end;
    }

    
    usage_local_nonprim = create_embedding_response_usage_parseFromJSON(usage); //nonprimitive


    create_embedding_response_local_var = create_embedding_response_create (
        dataList,
        strdup(model->valuestring),
        objectVariable,
        usage_local_nonprim
        );

    return create_embedding_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            embedding_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    if (usage_local_nonprim) {
        create_embedding_response_usage_free(usage_local_nonprim);
        usage_local_nonprim = NULL;
    }
    return NULL;

}
