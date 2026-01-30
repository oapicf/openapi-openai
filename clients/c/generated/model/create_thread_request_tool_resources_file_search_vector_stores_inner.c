#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_thread_request_tool_resources_file_search_vector_stores_inner.h"



static create_thread_request_tool_resources_file_search_vector_stores_inner_t *create_thread_request_tool_resources_file_search_vector_stores_inner_create_internal(
    list_t *file_ids,
    create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy_t *chunking_strategy,
    object_t *metadata
    ) {
    create_thread_request_tool_resources_file_search_vector_stores_inner_t *create_thread_request_tool_resources_file_search_vector_stores_inner_local_var = malloc(sizeof(create_thread_request_tool_resources_file_search_vector_stores_inner_t));
    if (!create_thread_request_tool_resources_file_search_vector_stores_inner_local_var) {
        return NULL;
    }
    create_thread_request_tool_resources_file_search_vector_stores_inner_local_var->file_ids = file_ids;
    create_thread_request_tool_resources_file_search_vector_stores_inner_local_var->chunking_strategy = chunking_strategy;
    create_thread_request_tool_resources_file_search_vector_stores_inner_local_var->metadata = metadata;

    create_thread_request_tool_resources_file_search_vector_stores_inner_local_var->_library_owned = 1;
    return create_thread_request_tool_resources_file_search_vector_stores_inner_local_var;
}

__attribute__((deprecated)) create_thread_request_tool_resources_file_search_vector_stores_inner_t *create_thread_request_tool_resources_file_search_vector_stores_inner_create(
    list_t *file_ids,
    create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy_t *chunking_strategy,
    object_t *metadata
    ) {
    return create_thread_request_tool_resources_file_search_vector_stores_inner_create_internal (
        file_ids,
        chunking_strategy,
        metadata
        );
}

void create_thread_request_tool_resources_file_search_vector_stores_inner_free(create_thread_request_tool_resources_file_search_vector_stores_inner_t *create_thread_request_tool_resources_file_search_vector_stores_inner) {
    if(NULL == create_thread_request_tool_resources_file_search_vector_stores_inner){
        return ;
    }
    if(create_thread_request_tool_resources_file_search_vector_stores_inner->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_thread_request_tool_resources_file_search_vector_stores_inner_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_thread_request_tool_resources_file_search_vector_stores_inner->file_ids) {
        list_ForEach(listEntry, create_thread_request_tool_resources_file_search_vector_stores_inner->file_ids) {
            free(listEntry->data);
        }
        list_freeList(create_thread_request_tool_resources_file_search_vector_stores_inner->file_ids);
        create_thread_request_tool_resources_file_search_vector_stores_inner->file_ids = NULL;
    }
    if (create_thread_request_tool_resources_file_search_vector_stores_inner->chunking_strategy) {
        create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy_free(create_thread_request_tool_resources_file_search_vector_stores_inner->chunking_strategy);
        create_thread_request_tool_resources_file_search_vector_stores_inner->chunking_strategy = NULL;
    }
    if (create_thread_request_tool_resources_file_search_vector_stores_inner->metadata) {
        object_free(create_thread_request_tool_resources_file_search_vector_stores_inner->metadata);
        create_thread_request_tool_resources_file_search_vector_stores_inner->metadata = NULL;
    }
    free(create_thread_request_tool_resources_file_search_vector_stores_inner);
}

cJSON *create_thread_request_tool_resources_file_search_vector_stores_inner_convertToJSON(create_thread_request_tool_resources_file_search_vector_stores_inner_t *create_thread_request_tool_resources_file_search_vector_stores_inner) {
    cJSON *item = cJSON_CreateObject();

    // create_thread_request_tool_resources_file_search_vector_stores_inner->file_ids
    if(create_thread_request_tool_resources_file_search_vector_stores_inner->file_ids) {
    cJSON *file_ids = cJSON_AddArrayToObject(item, "file_ids");
    if(file_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *file_idsListEntry;
    list_ForEach(file_idsListEntry, create_thread_request_tool_resources_file_search_vector_stores_inner->file_ids) {
    if(cJSON_AddStringToObject(file_ids, "", file_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // create_thread_request_tool_resources_file_search_vector_stores_inner->chunking_strategy
    if(create_thread_request_tool_resources_file_search_vector_stores_inner->chunking_strategy) {
    cJSON *chunking_strategy_local_JSON = create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy_convertToJSON(create_thread_request_tool_resources_file_search_vector_stores_inner->chunking_strategy);
    if(chunking_strategy_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "chunking_strategy", chunking_strategy_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_thread_request_tool_resources_file_search_vector_stores_inner->metadata
    if(create_thread_request_tool_resources_file_search_vector_stores_inner->metadata) {
    cJSON *metadata_object = object_convertToJSON(create_thread_request_tool_resources_file_search_vector_stores_inner->metadata);
    if(metadata_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata", metadata_object);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

create_thread_request_tool_resources_file_search_vector_stores_inner_t *create_thread_request_tool_resources_file_search_vector_stores_inner_parseFromJSON(cJSON *create_thread_request_tool_resources_file_search_vector_stores_innerJSON){

    create_thread_request_tool_resources_file_search_vector_stores_inner_t *create_thread_request_tool_resources_file_search_vector_stores_inner_local_var = NULL;

    // define the local list for create_thread_request_tool_resources_file_search_vector_stores_inner->file_ids
    list_t *file_idsList = NULL;

    // define the local variable for create_thread_request_tool_resources_file_search_vector_stores_inner->chunking_strategy
    create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy_t *chunking_strategy_local_nonprim = NULL;

    // create_thread_request_tool_resources_file_search_vector_stores_inner->file_ids
    cJSON *file_ids = cJSON_GetObjectItemCaseSensitive(create_thread_request_tool_resources_file_search_vector_stores_innerJSON, "file_ids");
    if (cJSON_IsNull(file_ids)) {
        file_ids = NULL;
    }
    if (file_ids) { 
    cJSON *file_ids_local = NULL;
    if(!cJSON_IsArray(file_ids)) {
        goto end;//primitive container
    }
    file_idsList = list_createList();

    cJSON_ArrayForEach(file_ids_local, file_ids)
    {
        if(!cJSON_IsString(file_ids_local))
        {
            goto end;
        }
        list_addElement(file_idsList , strdup(file_ids_local->valuestring));
    }
    }

    // create_thread_request_tool_resources_file_search_vector_stores_inner->chunking_strategy
    cJSON *chunking_strategy = cJSON_GetObjectItemCaseSensitive(create_thread_request_tool_resources_file_search_vector_stores_innerJSON, "chunking_strategy");
    if (cJSON_IsNull(chunking_strategy)) {
        chunking_strategy = NULL;
    }
    if (chunking_strategy) { 
    chunking_strategy_local_nonprim = create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy_parseFromJSON(chunking_strategy); //nonprimitive
    }

    // create_thread_request_tool_resources_file_search_vector_stores_inner->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(create_thread_request_tool_resources_file_search_vector_stores_innerJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }


    create_thread_request_tool_resources_file_search_vector_stores_inner_local_var = create_thread_request_tool_resources_file_search_vector_stores_inner_create_internal (
        file_ids ? file_idsList : NULL,
        chunking_strategy ? chunking_strategy_local_nonprim : NULL,
        metadata ? metadata_local_object : NULL
        );

    return create_thread_request_tool_resources_file_search_vector_stores_inner_local_var;
end:
    if (file_idsList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, file_idsList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(file_idsList);
        file_idsList = NULL;
    }
    if (chunking_strategy_local_nonprim) {
        create_assistant_request_tool_resources_file_search_vector_stores_inner_chunking_strategy_free(chunking_strategy_local_nonprim);
        chunking_strategy_local_nonprim = NULL;
    }
    return NULL;

}
