#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_thread_request_tool_resources_file_search.h"



static create_thread_request_tool_resources_file_search_t *create_thread_request_tool_resources_file_search_create_internal(
    list_t *vector_store_ids,
    list_t *vector_stores
    ) {
    create_thread_request_tool_resources_file_search_t *create_thread_request_tool_resources_file_search_local_var = malloc(sizeof(create_thread_request_tool_resources_file_search_t));
    if (!create_thread_request_tool_resources_file_search_local_var) {
        return NULL;
    }
    create_thread_request_tool_resources_file_search_local_var->vector_store_ids = vector_store_ids;
    create_thread_request_tool_resources_file_search_local_var->vector_stores = vector_stores;

    create_thread_request_tool_resources_file_search_local_var->_library_owned = 1;
    return create_thread_request_tool_resources_file_search_local_var;
}

__attribute__((deprecated)) create_thread_request_tool_resources_file_search_t *create_thread_request_tool_resources_file_search_create(
    list_t *vector_store_ids,
    list_t *vector_stores
    ) {
    return create_thread_request_tool_resources_file_search_create_internal (
        vector_store_ids,
        vector_stores
        );
}

void create_thread_request_tool_resources_file_search_free(create_thread_request_tool_resources_file_search_t *create_thread_request_tool_resources_file_search) {
    if(NULL == create_thread_request_tool_resources_file_search){
        return ;
    }
    if(create_thread_request_tool_resources_file_search->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_thread_request_tool_resources_file_search_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_thread_request_tool_resources_file_search->vector_store_ids) {
        list_ForEach(listEntry, create_thread_request_tool_resources_file_search->vector_store_ids) {
            free(listEntry->data);
        }
        list_freeList(create_thread_request_tool_resources_file_search->vector_store_ids);
        create_thread_request_tool_resources_file_search->vector_store_ids = NULL;
    }
    if (create_thread_request_tool_resources_file_search->vector_stores) {
        list_ForEach(listEntry, create_thread_request_tool_resources_file_search->vector_stores) {
            create_thread_request_tool_resources_file_search_vector_stores_inner_free(listEntry->data);
        }
        list_freeList(create_thread_request_tool_resources_file_search->vector_stores);
        create_thread_request_tool_resources_file_search->vector_stores = NULL;
    }
    free(create_thread_request_tool_resources_file_search);
}

cJSON *create_thread_request_tool_resources_file_search_convertToJSON(create_thread_request_tool_resources_file_search_t *create_thread_request_tool_resources_file_search) {
    cJSON *item = cJSON_CreateObject();

    // create_thread_request_tool_resources_file_search->vector_store_ids
    if(create_thread_request_tool_resources_file_search->vector_store_ids) {
    cJSON *vector_store_ids = cJSON_AddArrayToObject(item, "vector_store_ids");
    if(vector_store_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *vector_store_idsListEntry;
    list_ForEach(vector_store_idsListEntry, create_thread_request_tool_resources_file_search->vector_store_ids) {
    if(cJSON_AddStringToObject(vector_store_ids, "", vector_store_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // create_thread_request_tool_resources_file_search->vector_stores
    if(create_thread_request_tool_resources_file_search->vector_stores) {
    cJSON *vector_stores = cJSON_AddArrayToObject(item, "vector_stores");
    if(vector_stores == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *vector_storesListEntry;
    if (create_thread_request_tool_resources_file_search->vector_stores) {
    list_ForEach(vector_storesListEntry, create_thread_request_tool_resources_file_search->vector_stores) {
    cJSON *itemLocal = create_thread_request_tool_resources_file_search_vector_stores_inner_convertToJSON(vector_storesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(vector_stores, itemLocal);
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

create_thread_request_tool_resources_file_search_t *create_thread_request_tool_resources_file_search_parseFromJSON(cJSON *create_thread_request_tool_resources_file_searchJSON){

    create_thread_request_tool_resources_file_search_t *create_thread_request_tool_resources_file_search_local_var = NULL;

    // define the local list for create_thread_request_tool_resources_file_search->vector_store_ids
    list_t *vector_store_idsList = NULL;

    // define the local list for create_thread_request_tool_resources_file_search->vector_stores
    list_t *vector_storesList = NULL;

    // create_thread_request_tool_resources_file_search->vector_store_ids
    cJSON *vector_store_ids = cJSON_GetObjectItemCaseSensitive(create_thread_request_tool_resources_file_searchJSON, "vector_store_ids");
    if (cJSON_IsNull(vector_store_ids)) {
        vector_store_ids = NULL;
    }
    if (vector_store_ids) { 
    cJSON *vector_store_ids_local = NULL;
    if(!cJSON_IsArray(vector_store_ids)) {
        goto end;//primitive container
    }
    vector_store_idsList = list_createList();

    cJSON_ArrayForEach(vector_store_ids_local, vector_store_ids)
    {
        if(!cJSON_IsString(vector_store_ids_local))
        {
            goto end;
        }
        list_addElement(vector_store_idsList , strdup(vector_store_ids_local->valuestring));
    }
    }

    // create_thread_request_tool_resources_file_search->vector_stores
    cJSON *vector_stores = cJSON_GetObjectItemCaseSensitive(create_thread_request_tool_resources_file_searchJSON, "vector_stores");
    if (cJSON_IsNull(vector_stores)) {
        vector_stores = NULL;
    }
    if (vector_stores) { 
    cJSON *vector_stores_local_nonprimitive = NULL;
    if(!cJSON_IsArray(vector_stores)){
        goto end; //nonprimitive container
    }

    vector_storesList = list_createList();

    cJSON_ArrayForEach(vector_stores_local_nonprimitive,vector_stores )
    {
        if(!cJSON_IsObject(vector_stores_local_nonprimitive)){
            goto end;
        }
        create_thread_request_tool_resources_file_search_vector_stores_inner_t *vector_storesItem = create_thread_request_tool_resources_file_search_vector_stores_inner_parseFromJSON(vector_stores_local_nonprimitive);

        list_addElement(vector_storesList, vector_storesItem);
    }
    }


    create_thread_request_tool_resources_file_search_local_var = create_thread_request_tool_resources_file_search_create_internal (
        vector_store_ids ? vector_store_idsList : NULL,
        vector_stores ? vector_storesList : NULL
        );

    return create_thread_request_tool_resources_file_search_local_var;
end:
    if (vector_store_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, vector_store_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(vector_store_idsList);
        vector_store_idsList = NULL;
    }
    if (vector_storesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, vector_storesList) {
            create_thread_request_tool_resources_file_search_vector_stores_inner_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(vector_storesList);
        vector_storesList = NULL;
    }
    return NULL;

}
