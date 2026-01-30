#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "project_user_list_response.h"



static project_user_list_response_t *project_user_list_response_create_internal(
    char *object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
    ) {
    project_user_list_response_t *project_user_list_response_local_var = malloc(sizeof(project_user_list_response_t));
    if (!project_user_list_response_local_var) {
        return NULL;
    }
    project_user_list_response_local_var->object = object;
    project_user_list_response_local_var->data = data;
    project_user_list_response_local_var->first_id = first_id;
    project_user_list_response_local_var->last_id = last_id;
    project_user_list_response_local_var->has_more = has_more;

    project_user_list_response_local_var->_library_owned = 1;
    return project_user_list_response_local_var;
}

__attribute__((deprecated)) project_user_list_response_t *project_user_list_response_create(
    char *object,
    list_t *data,
    char *first_id,
    char *last_id,
    int has_more
    ) {
    return project_user_list_response_create_internal (
        object,
        data,
        first_id,
        last_id,
        has_more
        );
}

void project_user_list_response_free(project_user_list_response_t *project_user_list_response) {
    if(NULL == project_user_list_response){
        return ;
    }
    if(project_user_list_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "project_user_list_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (project_user_list_response->object) {
        free(project_user_list_response->object);
        project_user_list_response->object = NULL;
    }
    if (project_user_list_response->data) {
        list_ForEach(listEntry, project_user_list_response->data) {
            project_user_free(listEntry->data);
        }
        list_freeList(project_user_list_response->data);
        project_user_list_response->data = NULL;
    }
    if (project_user_list_response->first_id) {
        free(project_user_list_response->first_id);
        project_user_list_response->first_id = NULL;
    }
    if (project_user_list_response->last_id) {
        free(project_user_list_response->last_id);
        project_user_list_response->last_id = NULL;
    }
    free(project_user_list_response);
}

cJSON *project_user_list_response_convertToJSON(project_user_list_response_t *project_user_list_response) {
    cJSON *item = cJSON_CreateObject();

    // project_user_list_response->object
    if (!project_user_list_response->object) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "object", project_user_list_response->object) == NULL) {
    goto fail; //String
    }


    // project_user_list_response->data
    if (!project_user_list_response->data) {
        goto fail;
    }
    cJSON *data = cJSON_AddArrayToObject(item, "data");
    if(data == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *dataListEntry;
    if (project_user_list_response->data) {
    list_ForEach(dataListEntry, project_user_list_response->data) {
    cJSON *itemLocal = project_user_convertToJSON(dataListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(data, itemLocal);
    }
    }


    // project_user_list_response->first_id
    if (!project_user_list_response->first_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "first_id", project_user_list_response->first_id) == NULL) {
    goto fail; //String
    }


    // project_user_list_response->last_id
    if (!project_user_list_response->last_id) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "last_id", project_user_list_response->last_id) == NULL) {
    goto fail; //String
    }


    // project_user_list_response->has_more
    if (!project_user_list_response->has_more) {
        goto fail;
    }
    if(cJSON_AddBoolToObject(item, "has_more", project_user_list_response->has_more) == NULL) {
    goto fail; //Bool
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

project_user_list_response_t *project_user_list_response_parseFromJSON(cJSON *project_user_list_responseJSON){

    project_user_list_response_t *project_user_list_response_local_var = NULL;

    // define the local list for project_user_list_response->data
    list_t *dataList = NULL;

    // project_user_list_response->object
    cJSON *object = cJSON_GetObjectItemCaseSensitive(project_user_list_responseJSON, "object");
    if (cJSON_IsNull(object)) {
        object = NULL;
    }
    if (!object) {
        goto end;
    }

    
    if(!cJSON_IsString(object))
    {
    goto end; //String
    }

    // project_user_list_response->data
    cJSON *data = cJSON_GetObjectItemCaseSensitive(project_user_list_responseJSON, "data");
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
        project_user_t *dataItem = project_user_parseFromJSON(data_local_nonprimitive);

        list_addElement(dataList, dataItem);
    }

    // project_user_list_response->first_id
    cJSON *first_id = cJSON_GetObjectItemCaseSensitive(project_user_list_responseJSON, "first_id");
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

    // project_user_list_response->last_id
    cJSON *last_id = cJSON_GetObjectItemCaseSensitive(project_user_list_responseJSON, "last_id");
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

    // project_user_list_response->has_more
    cJSON *has_more = cJSON_GetObjectItemCaseSensitive(project_user_list_responseJSON, "has_more");
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


    project_user_list_response_local_var = project_user_list_response_create_internal (
        strdup(object->valuestring),
        dataList,
        strdup(first_id->valuestring),
        strdup(last_id->valuestring),
        has_more->valueint
        );

    return project_user_list_response_local_var;
end:
    if (dataList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, dataList) {
            project_user_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(dataList);
        dataList = NULL;
    }
    return NULL;

}
