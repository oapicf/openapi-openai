#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_api_key_list_response.h"


char* project_api_key_list_response_object_ToString(openai_api_project_api_key_list_response_OBJECT_e object) {
    char* objectArray[] =  { "NULL", "list" };
    return objectArray[object];
}

openai_api_project_api_key_list_response_OBJECT_e project_api_key_list_response_object_FromString(char* object){
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

static project_api_key_list_response_t *project_api_key_list_response_create_internal(
    openai_api_project_api_key_list_response_OBJECT_e object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
    ) {
    project_api_key_list_response_t *project_api_key_list_response_local_var = malloc(sizeof(project_api_key_list_response_t));
    if (!project_api_key_list_response_local_var) {
        return NULL;
    }
    project_api_key_list_response_local_var->object = object;
    project_api_key_list_response_local_var->data = data;
    project_api_key_list_response_local_var->first_id = first_id;
    project_api_key_list_response_local_var->last_id = last_id;
    project_api_key_list_response_local_var->has_more = has_more;

    project_api_key_list_response_local_var->_library_owned = 1;
    return project_api_key_list_response_local_var;
}

__attribute__((deprecated)) project_api_key_list_response_t *project_api_key_list_response_create(
    openai_api_project_api_key_list_response_OBJECT_e object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
    ) {
    return project_api_key_list_response_create_internal (
        object,
        data,
        first_id,
        last_id,
        has_more
        );
}

void project_api_key_list_response_free(project_api_key_list_response_t *project_api_key_list_response) {
    if(NULL == project_api_key_list_response){
        return ;
    }
    if(project_api_key_list_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_api_key_list_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project_api_key_list_response->data) {
        list_ForEach(listEntry, project_api_key_list_response->data) {
            project_api_key_free(listEntry->data);
        }
        list_freeList(project_api_key_list_response->data);
        project_api_key_list_response->data = NULL;
    }
    if (project_api_key_list_response->first_id) {
        free(project_api_key_list_response->first_id);
        project_api_key_list_response->first_id = NULL;
    }
    if (project_api_key_list_response->last_id) {
        free(project_api_key_list_response->last_id);
        project_api_key_list_response->last_id = NULL;
    }
    free(project_api_key_list_response);
}

cJSON *project_api_key_list_response_convertToJSON(project_api_key_list_response_t *project_api_key_list_response) {
    cJSON *item = cJSON_CreateObject();

    // project_api_key_list_response->object
    if (openai_api_project_api_key_list_response_OBJECT_NULL == project_api_key_list_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", project_api_key_list_response_object_ToString(project_api_key_list_response->object)) == NULL)
    {
    goto fail; //Enum
    }


    // project_api_key_list_response->data
    if (!project_api_key_list_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (project_api_key_list_response->data) {
    list_ForEach(dataListEntry, project_api_key_list_response->data) {
    cJSON *itemLocal = project_api_key_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }


    // project_api_key_list_response->first_id
    if (!project_api_key_list_response->first_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "first_id", project_api_key_list_response->first_id) == NULL) {
    goto fail; //String
    }


    // project_api_key_list_response->last_id
    if (!project_api_key_list_response->last_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "last_id", project_api_key_list_response->last_id) == NULL) {
    goto fail; //String
    }


    // project_api_key_list_response->has_more
    if (!project_api_key_list_response->has_more) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "has_more", project_api_key_list_response->has_more) == NULL) {
    goto fail; //Bool
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

project_api_key_list_response_t *project_api_key_list_response_parseFromJSON(cJSON *project_api_key_list_responseJSON){

    project_api_key_list_response_t *project_api_key_list_response_local_var = NULL;

    // define the local list for project_api_key_list_response->data
    list_t *dataList = NULL;

    // project_api_key_list_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(project_api_key_list_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    openai_api_project_api_key_list_response_OBJECT_e objectVariable;
    
    if(!cJSON_IsString(object))
    {
    goto end; //Enum
    }
    objectVariable = project_api_key_list_response_object_FromString(object->valuestring);

    // project_api_key_list_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(project_api_key_list_responseJSON, "data");
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
        project_api_key_t *dataItem = project_api_key_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }

    // project_api_key_list_response->first_id
    cJSON *first_id = cJSON_GetObjectItemCaseSensitive(project_api_key_list_responseJSON, "first_id");
    if (cJSON_IsNull(first_id)) {
        first_id = NULL;
    }
    if (!first_id) {
        goto end;
    }

    
    if(!cJSON_IsString(first_id))
    {
    goto end; //String
    }

    // project_api_key_list_response->last_id
    cJSON *last_id = cJSON_GetObjectItemCaseSensitive(project_api_key_list_responseJSON, "last_id");
    if (cJSON_IsNull(last_id)) {
        last_id = NULL;
    }
    if (!last_id) {
        goto end;
    }

    
    if(!cJSON_IsString(last_id))
    {
    goto end; //String
    }

    // project_api_key_list_response->has_more
    cJSON *has_more = cJSON_GetObjectItemCaseSensitive(project_api_key_list_responseJSON, "has_more");
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


    project_api_key_list_response_local_var = project_api_key_list_response_create_internal (
        objectVariable,
        dataList,
        strdup(first_id->valuestring),
        strdup(last_id->valuestring),
        has_more->valueint
        );

    return project_api_key_list_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            project_api_key_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
