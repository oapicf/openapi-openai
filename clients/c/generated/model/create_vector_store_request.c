#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "create_vector_store_request.h"



static create_vector_store_request_t *create_vector_store_request_create_internal(
    list_t *file_ids,
    char *name,
    vector_store_expiration_after_t *expires_after,
    create_vector_store_request_chunking_strategy_t *chunking_strategy,
    object_t *metadata
    ) {
    create_vector_store_request_t *create_vector_store_request_local_var = malloc(sizeof(create_vector_store_request_t));
    if (!create_vector_store_request_local_var) {
        return NULL;
    }
    create_vector_store_request_local_var->file_ids = file_ids;
    create_vector_store_request_local_var->name = name;
    create_vector_store_request_local_var->expires_after = expires_after;
    create_vector_store_request_local_var->chunking_strategy = chunking_strategy;
    create_vector_store_request_local_var->metadata = metadata;

    create_vector_store_request_local_var->_library_owned = 1;
    return create_vector_store_request_local_var;
}

__attribute__((deprecated)) create_vector_store_request_t *create_vector_store_request_create(
    list_t *file_ids,
    char *name,
    vector_store_expiration_after_t *expires_after,
    create_vector_store_request_chunking_strategy_t *chunking_strategy,
    object_t *metadata
    ) {
    return create_vector_store_request_create_internal (
        file_ids,
        name,
        expires_after,
        chunking_strategy,
        metadata
        );
}

void create_vector_store_request_free(create_vector_store_request_t *create_vector_store_request) {
    if(NULL == create_vector_store_request){
        return ;
    }
    if(create_vector_store_request->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "create_vector_store_request_free");
        return ;
    }
    listEntry_t *listEntry;
    if (create_vector_store_request->file_ids) {
        list_ForEach(listEntry, create_vector_store_request->file_ids) {
            free(listEntry->data);
        }
        list_freeList(create_vector_store_request->file_ids);
        create_vector_store_request->file_ids = NULL;
    }
    if (create_vector_store_request->name) {
        free(create_vector_store_request->name);
        create_vector_store_request->name = NULL;
    }
    if (create_vector_store_request->expires_after) {
        vector_store_expiration_after_free(create_vector_store_request->expires_after);
        create_vector_store_request->expires_after = NULL;
    }
    if (create_vector_store_request->chunking_strategy) {
        create_vector_store_request_chunking_strategy_free(create_vector_store_request->chunking_strategy);
        create_vector_store_request->chunking_strategy = NULL;
    }
    if (create_vector_store_request->metadata) {
        object_free(create_vector_store_request->metadata);
        create_vector_store_request->metadata = NULL;
    }
    free(create_vector_store_request);
}

cJSON *create_vector_store_request_convertToJSON(create_vector_store_request_t *create_vector_store_request) {
    cJSON *item = cJSON_CreateObject();

    // create_vector_store_request->file_ids
    if(create_vector_store_request->file_ids) {
    cJSON *file_ids = cJSON_AddArrayToObject(item, "file_ids");
    if(file_ids == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *file_idsListEntry;
    list_ForEach(file_idsListEntry, create_vector_store_request->file_ids) {
    if(cJSON_AddStringToObject(file_ids, "", file_idsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // create_vector_store_request->name
    if(create_vector_store_request->name) {
    if(cJSON_AddStringToObject(item, "name", create_vector_store_request->name) == NULL) {
    goto fail; //String
    }
    }


    // create_vector_store_request->expires_after
    if(create_vector_store_request->expires_after) {
    cJSON *expires_after_local_JSON = vector_store_expiration_after_convertToJSON(create_vector_store_request->expires_after);
    if(expires_after_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "expires_after", expires_after_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_vector_store_request->chunking_strategy
    if(create_vector_store_request->chunking_strategy) {
    cJSON *chunking_strategy_local_JSON = create_vector_store_request_chunking_strategy_convertToJSON(create_vector_store_request->chunking_strategy);
    if(chunking_strategy_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "chunking_strategy", chunking_strategy_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // create_vector_store_request->metadata
    if(create_vector_store_request->metadata) {
    cJSON *metadata_object = object_convertToJSON(create_vector_store_request->metadata);
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

create_vector_store_request_t *create_vector_store_request_parseFromJSON(cJSON *create_vector_store_requestJSON){

    create_vector_store_request_t *create_vector_store_request_local_var = NULL;

    // define the local list for create_vector_store_request->file_ids
    list_t *file_idsList = NULL;

    // define the local variable for create_vector_store_request->expires_after
    vector_store_expiration_after_t *expires_after_local_nonprim = NULL;

    // define the local variable for create_vector_store_request->chunking_strategy
    create_vector_store_request_chunking_strategy_t *chunking_strategy_local_nonprim = NULL;

    // create_vector_store_request->file_ids
    cJSON *file_ids = cJSON_GetObjectItemCaseSensitive(create_vector_store_requestJSON, "file_ids");
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

    // create_vector_store_request->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(create_vector_store_requestJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // create_vector_store_request->expires_after
    cJSON *expires_after = cJSON_GetObjectItemCaseSensitive(create_vector_store_requestJSON, "expires_after");
    if (cJSON_IsNull(expires_after)) {
        expires_after = NULL;
    }
    if (expires_after) { 
    expires_after_local_nonprim = vector_store_expiration_after_parseFromJSON(expires_after); //nonprimitive
    }

    // create_vector_store_request->chunking_strategy
    cJSON *chunking_strategy = cJSON_GetObjectItemCaseSensitive(create_vector_store_requestJSON, "chunking_strategy");
    if (cJSON_IsNull(chunking_strategy)) {
        chunking_strategy = NULL;
    }
    if (chunking_strategy) { 
    chunking_strategy_local_nonprim = create_vector_store_request_chunking_strategy_parseFromJSON(chunking_strategy); //nonprimitive
    }

    // create_vector_store_request->metadata
    cJSON *metadata = cJSON_GetObjectItemCaseSensitive(create_vector_store_requestJSON, "metadata");
    if (cJSON_IsNull(metadata)) {
        metadata = NULL;
    }
    object_t *metadata_local_object = NULL;
    if (metadata) { 
    metadata_local_object = object_parseFromJSON(metadata); //object
    }


    create_vector_store_request_local_var = create_vector_store_request_create_internal (
        file_ids ? file_idsList : NULL,
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        expires_after ? expires_after_local_nonprim : NULL,
        chunking_strategy ? chunking_strategy_local_nonprim : NULL,
        metadata ? metadata_local_object : NULL
        );

    return create_vector_store_request_local_var;
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
    if (expires_after_local_nonprim) {
        vector_store_expiration_after_free(expires_after_local_nonprim);
        expires_after_local_nonprim = NULL;
    }
    if (chunking_strategy_local_nonprim) {
        create_vector_store_request_chunking_strategy_free(chunking_strategy_local_nonprim);
        chunking_strategy_local_nonprim = NULL;
    }
    return NULL;

}
