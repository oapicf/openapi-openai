#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "assistant_object_tool_resources_file_search.h"



static assistant_object_tool_resources_file_search_t *assistant_object_tool_resources_file_search_create_internal(
    list_t *vector_store_ids
    ) {
    assistant_object_tool_resources_file_search_t *assistant_object_tool_resources_file_search_local_var = malloc(sizeof(assistant_object_tool_resources_file_search_t));
    if (!assistant_object_tool_resources_file_search_local_var) {
        return NULL;
    }
    assistant_object_tool_resources_file_search_local_var->vector_store_ids = vector_store_ids;

    assistant_object_tool_resources_file_search_local_var->_library_owned = 1;
    return assistant_object_tool_resources_file_search_local_var;
}

__attribute__((deprecated)) assistant_object_tool_resources_file_search_t *assistant_object_tool_resources_file_search_create(
    list_t *vector_store_ids
    ) {
    return assistant_object_tool_resources_file_search_create_internal (
        vector_store_ids
        );
}

void assistant_object_tool_resources_file_search_free(assistant_object_tool_resources_file_search_t *assistant_object_tool_resources_file_search) {
    if(NULL == assistant_object_tool_resources_file_search){
        return ;
    }
    if(assistant_object_tool_resources_file_search->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "assistant_object_tool_resources_file_search_free");
        return ;
    }
    listEntry_t *listEntry;
    if (assistant_object_tool_resources_file_search->vector_store_ids) {
        list_ForEach(listEntry, assistant_object_tool_resources_file_search->vector_store_ids) {
            free(listEntry->data);
        }
        list_freeList(assistant_object_tool_resources_file_search->vector_store_ids);
        assistant_object_tool_resources_file_search->vector_store_ids = NULL;
    }
    free(assistant_object_tool_resources_file_search);
}

cJSON *assistant_object_tool_resources_file_search_convertToJSON(assistant_object_tool_resources_file_search_t *assistant_object_tool_resources_file_search) {
    cJSON *item = cJSON_CreateObject();

    // assistant_object_tool_resources_file_search->vector_store_ids
    if(assistant_object_tool_resources_file_search->vector_store_ids) {
    cJSON *vector_store_ids = cJSON_AddArrayToObject(item, "vector_store_ids");
    if(vector_store_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *vector_store_idsListEntry;
    list_ForEach(vector_store_idsListEntry, assistant_object_tool_resources_file_search->vector_store_ids) {
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

assistant_object_tool_resources_file_search_t *assistant_object_tool_resources_file_search_parseFromJSON(cJSON *assistant_object_tool_resources_file_searchJSON){

    assistant_object_tool_resources_file_search_t *assistant_object_tool_resources_file_search_local_var = NULL;

    // define the local list for assistant_object_tool_resources_file_search->vector_store_ids
    list_t *vector_store_idsList = NULL;

    // assistant_object_tool_resources_file_search->vector_store_ids
    cJSON *vector_store_ids = cJSON_GetObjectItemCaseSensitive(assistant_object_tool_resources_file_searchJSON, "vector_store_ids");
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


    assistant_object_tool_resources_file_search_local_var = assistant_object_tool_resources_file_search_create_internal (
        vector_store_ids ? vector_store_idsList : NULL
        );

    return assistant_object_tool_resources_file_search_local_var;
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
