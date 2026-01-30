#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "modify_thread_request_tool_resources_file_search.h"



static modify_thread_request_tool_resources_file_search_t *modify_thread_request_tool_resources_file_search_create_internal(
    list_t *vector_store_ids
    ) {
    modify_thread_request_tool_resources_file_search_t *modify_thread_request_tool_resources_file_search_local_var = malloc(sizeof(modify_thread_request_tool_resources_file_search_t));
    if (!modify_thread_request_tool_resources_file_search_local_var) {
        return NULL;
    }
    modify_thread_request_tool_resources_file_search_local_var->vector_store_ids = vector_store_ids;

    modify_thread_request_tool_resources_file_search_local_var->_library_owned = 1;
    return modify_thread_request_tool_resources_file_search_local_var;
}

__attribute__((deprecated)) modify_thread_request_tool_resources_file_search_t *modify_thread_request_tool_resources_file_search_create(
    list_t *vector_store_ids
    ) {
    return modify_thread_request_tool_resources_file_search_create_internal (
        vector_store_ids
        );
}

void modify_thread_request_tool_resources_file_search_free(modify_thread_request_tool_resources_file_search_t *modify_thread_request_tool_resources_file_search) {
    if(NULL == modify_thread_request_tool_resources_file_search){
        return ;
    }
    if(modify_thread_request_tool_resources_file_search->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "modify_thread_request_tool_resources_file_search_free");
        return ;
    }
    listEntry_t *listEntry;
    if (modify_thread_request_tool_resources_file_search->vector_store_ids) {
        list_ForEach(listEntry, modify_thread_request_tool_resources_file_search->vector_store_ids) {
            free(listEntry->data);
        }
        list_freeList(modify_thread_request_tool_resources_file_search->vector_store_ids);
        modify_thread_request_tool_resources_file_search->vector_store_ids = NULL;
    }
    free(modify_thread_request_tool_resources_file_search);
}

cJSON *modify_thread_request_tool_resources_file_search_convertToJSON(modify_thread_request_tool_resources_file_search_t *modify_thread_request_tool_resources_file_search) {
    cJSON *item = cJSON_CreateObject();

    // modify_thread_request_tool_resources_file_search->vector_store_ids
    if(modify_thread_request_tool_resources_file_search->vector_store_ids) {
    cJSON *vector_store_ids = cJSON_AddArrayToObject(item, "vector_store_ids");
    if(vector_store_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *vector_store_idsListEntry;
    list_ForEach(vector_store_idsListEntry, modify_thread_request_tool_resources_file_search->vector_store_ids) {
    if(cJSON_AddStringToObject(vector_store_ids, "", vector_store_idsListEntry->data) == NULL)
    {
        goto fail;
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

modify_thread_request_tool_resources_file_search_t *modify_thread_request_tool_resources_file_search_parseFromJSON(cJSON *modify_thread_request_tool_resources_file_searchJSON){

    modify_thread_request_tool_resources_file_search_t *modify_thread_request_tool_resources_file_search_local_var = NULL;

    // define the local list for modify_thread_request_tool_resources_file_search->vector_store_ids
    list_t *vector_store_idsList = NULL;

    // modify_thread_request_tool_resources_file_search->vector_store_ids
    cJSON *vector_store_ids = cJSON_GetObjectItemCaseSensitive(modify_thread_request_tool_resources_file_searchJSON, "vector_store_ids");
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


    modify_thread_request_tool_resources_file_search_local_var = modify_thread_request_tool_resources_file_search_create_internal (
        vector_store_ids ? vector_store_idsList : NULL
        );

    return modify_thread_request_tool_resources_file_search_local_var;
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
    return NULL;

}
